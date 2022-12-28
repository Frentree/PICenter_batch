package com.skyun.app.util.database.ibatis;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;


import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.skyun.app.util.config.AppConfig;


public class SqlMapInstanceBATCH {
	
	private static SqlMapClient sqlMap=null;

	static {
		try {
			FileReader reader = new FileReader(AppConfig.getProperty("config.configfile.path")+"/"+"SqlMapConfig.xml");
			
			Properties per=new Properties();
			per.load(new FileInputStream( AppConfig.currentDir + "/conf/server.properties"));
			
			String pdecode=AppConfig.getProperty("config.pic.db.password");
			String udecode=AppConfig.getProperty("config.pic.db.username");
			
			per.setProperty("config.pic.db.password",pdecode );
			per.setProperty("config.pic.db.username",udecode );
			
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader, per) ;
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB Connect error _________________ check PICDB env");
			System.out.println("DB URL     :"+AppConfig.getProperty("config.pic.db.username"));
			System.out.println("DB userid  :"+AppConfig.getProperty("config.pic.db.url"));
			System.out.println("DB password:"+AppConfig.getProperty("config.pic.db.password"));
			System.out.println("DB ERROR:"+e.getMessage());
			System.exit(-1);
		}
	}

	
	public static SqlMapClient getSqlMapInstance()  {
		return sqlMap;
	}	
}
