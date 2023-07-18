package csp.comm;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import csp.comm.vo.HeaderVo;
import csp.comm.vo.HttpStatVo;
import csp.comm.vo.ResultVo;
import net.sf.json.JSONObject;

public class CspUtil {
	private static Logger logger = LoggerFactory.getLogger(CspUtil.class);
	
	public static JSONObject POST(String URL, JSONObject json) throws Exception {
	    CloseableHttpClient client = HttpClients.createDefault();
	    HttpPost httpPost = new HttpPost(URL);
	    
	    StringEntity entity = new StringEntity(json.toString(), StandardCharsets.UTF_8);
	    httpPost.setEntity(entity);
	    httpPost.setHeader("Accept", "application/json");
	    httpPost.setHeader("Content-type", "application/json; charset=UTF-8");

	    CloseableHttpResponse response = client.execute(httpPost);
	    HttpEntity responseEntity = response.getEntity();

	    if(responseEntity != null) {
	        String result = EntityUtils.toString(responseEntity);
	        return JSONObject.fromObject(result);
	    }

	    return null;
	}

	public static JSONObject GET(String URL) throws Exception {
	    CloseableHttpClient client = HttpClients.createDefault();
	    HttpGet httpGet = new HttpGet(URL);
	    httpGet.setHeader("Accept", "application/json");

	    CloseableHttpResponse response = client.execute(httpGet);
	    HttpEntity responseEntity = response.getEntity();

	    if(responseEntity != null) {
	        String result = EntityUtils.toString(responseEntity);
	        return JSONObject.fromObject(result);
	    }

	    return null;
	}
	
	public static HeaderVo getHeader(JSONObject head) {
        HeaderVo vo = new HeaderVo();
        
        vo.setRESULT(head.getString("RESULT"));
        vo.setRESULT_CODE(head.getString("RESULT_CODE"));
        vo.setRESULT_MESSAGE(head.getString("RESULT_MESSAGE"));
        /*vo.setPLATFORM_MODUS(head.getString("PLATFORM_MODUS"));
        vo.setTEMP_ENCRYPT_KEY(head.getString("TEMP_ENCRYPT_KEY"));*/
        
        return vo;
    }
	
	public static String getBody(JSONObject response) {
	    return response.getString("BODY");
	}

	public static String getParms(String[][] paramLt) {
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<paramLt.length; i++) {
			if(i==0)sb.append("?");
			else	sb.append("&");
			sb.append(paramLt[i][0]);
			sb.append("=");
			sb.append(paramLt[i][1]);
		}

		return sb.toString();
	}

//	public static List<NameValuePair> getPostParms(String[][] paramLt) {
//		List<NameValuePair> params = new ArrayList<NameValuePair>();
	public static List getPostParms(String[][] paramLt) {
		List params = new ArrayList();

		for(int i=0; i<paramLt.length; i++) {
			params.add(new BasicNameValuePair(paramLt[i][0], paramLt[i][1]));
		}

		return params;
	}

	public static String getValue(HeaderVo hvo, JSONObject json, String key) {
	    if(!json.containsKey(key)) return "";

	    String val = json.getString(key);

	    /*try {
	        if("BP".equals(hvo.getPLATFORM_MODUS())) {
	            val = CryptoUtil.decrypt(val, hvo.getTEMP_ENCRYPT_KEY());
	        } else if(!"SE".equals(hvo.getPLATFORM_MODUS())) {
	            val = CryptoUtil.decrypt(val, Config.decryptKey);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }*/
	    return val;
	}
	
	public static String getValue(String cryptoKey, JSONObject json, String key) {
	    if(!json.containsKey(key)) return "";

	    String val = "";
	    try {
	        val = CryptoUtil.decrypt(json.getString(key), cryptoKey);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return val;
	}
	
	public static String getJsonString(String URL, String[][] paramLt, String METHOD, int timeout) {
	    CloseableHttpClient httpClient = HttpClients.createDefault();
	    String result = null;
	    JSONObject paramJson = new JSONObject();

	    for (String[] param : paramLt) {
	        paramJson.put(param[0], param[1]);
	    }

	    try {
	        HttpPost httpPost = new HttpPost(URL);
	        StringEntity entity = new StringEntity(paramJson.toString(), StandardCharsets.UTF_8);
	        httpPost.setEntity(entity);
	        httpPost.setHeader("Accept", "application/json");
	        httpPost.setHeader("Content-type", "application/json; charset=UTF-8");

	        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

	        try {
	            HttpEntity responseEntity = httpResponse.getEntity();

	            if (responseEntity != null) {
	                result = EntityUtils.toString(responseEntity);
	            }

	        } finally {
	            httpResponse.close();
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            httpClient.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    return result;
	}

	public static ResultVo getVoData(String URL, String[][] paramLt, String METHOD, int timeout) {
		ResultVo vo = new ResultVo();

	    String jsonString = CspUtil.getJsonString(URL, paramLt, METHOD, timeout);
	    JSONObject jsonObject = JSONObject.fromObject(jsonString);

	    if (jsonObject.containsKey("RESPONSE")) {
	        JSONObject response = jsonObject.getJSONObject("RESPONSE");
	        if (response.containsKey("HEADER")) {
	            JSONObject header = response.getJSONObject("HEADER");
	            vo.setHEADER(CspUtil.getHeader(header));
	        }

	        if (response.containsKey("BODY")) {
	            JSONObject body = response.getJSONObject("BODY");
	            vo.setBODY(body);
	        }
	    }

	    return vo;
	}

	public static String nvl(String param) {
		if(param==null) return "";
		else return param;
	}

	public static void setData(Object obj, HeaderVo hvo, JSONObject body, String elmtNm) {
	    if(body.containsKey(elmtNm)) {
	        Class	oClass	= obj.getClass();
	        Method method;
	        try {
	            method = oClass.getDeclaredMethod("set"+elmtNm, new Class[]{String.class});
	            method.invoke(obj, new Object[]{CspUtil.getValue(hvo, body, elmtNm)});
	        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static String getFailJson(String code, String message) {
	    JSONObject json = new JSONObject();
	    JSONObject header = new JSONObject();

	    header.put("RESULT", "F");
	    header.put("RESULT_CODE", "CUST_EXP" + (code != null ? "_" + code : ""));
	    header.put("RESULT_MESSAGE", message);
	    /*header.put("PLATFORM_MODUS", "NR");*/

	    json.put("RESPONSE", header);
	    return json.toString();
	}

	public static String getFailJson(String message) {
	    return getFailJson(null, message);
	}

	public static String chgSec(long start, long end) {
	    return (Double.parseDouble(Long.toString(end-start))/1000)+" sec";
	}
}
