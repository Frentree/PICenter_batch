package com.ibatis.common.jdbc.logging;

import java.util.*;

public class LoggableStatement { 

	private ArrayList parameterValues;
	private String sqlTemplate;
	public LoggableStatement(String sql, List params) throws Exception {
		sqlTemplate = sql;
		parameterValues = new ArrayList();
		parameterValues = (ArrayList) params;
	}
	
	/*
	 * @return java.lang.String of PreparedStatement SQL
	 */
	public String getQueryString() {

		StringBuffer buf = new StringBuffer();
		int qMarkCount = 0;		
		StringTokenizer tok = new StringTokenizer(sqlTemplate + " ", "?");
		while (tok.hasMoreTokens()) {
			String oneChunk = tok.nextToken();
			buf.append(oneChunk);

			try {
				Object value;
				if (parameterValues.size() > qMarkCount) {
					value = parameterValues.get(qMarkCount++);
				} else {
					if (tok.hasMoreTokens()) {
						value = null;
					} else {
						value = "";
					}
				}
				if (value == null || "".equals(value)) {
					buf.append("" + value);	
				} else {
					buf.append("'" + value + "'");
				}				
			} catch (Throwable e) {
				buf.append("ERROR WHEN PRODUCING QUERY STRING FOR LOG." + e.toString());
			}			
		}
		sqlTemplate = buf.toString();
		sqlTemplate = sqlTemplate.replaceAll("\n[\t| ]*\n", "\n");		
		return sqlTemplate;		
	}
}