package com.skyun.app.util.database.ibatis.vo;

public class EmailItemVo {
	private String agent_name;
	private String agent_connected_ip;
	
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public String getAgent_connected_ip() {
		if(agent_connected_ip==null) 
			return " ";
		else
			return agent_connected_ip;	
	}
	public void setAgent_connected_ip(String agent_connected_ip) {
		this.agent_connected_ip = agent_connected_ip;
	}

}
