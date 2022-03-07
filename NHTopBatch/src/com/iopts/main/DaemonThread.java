package com.iopts.main;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import org.apache.logging.log4j.core.config.Scheduled;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.skyun.app.util.config.AppConfig;
import com.skyun.app.util.database.ibatis.SqlMapInstanceBATCH;
import com.skyun.app.util.database.ibatis.vo.agentIpVo;
import com.skyun.app.util.database.ibatis.vo.pi_topcompVo;

import org.apache.commons.net.util.SubnetUtils;


public class DaemonThread implements Runnable {
	private static SqlMapClient sqlMapPIC = null;
	List<pi_topcompVo> predata = new ArrayList<pi_topcompVo>();


	private static Logger logger = LogManager.getLogger(DaemonThread.class);

	public DaemonThread() {
		Configurator.initialize(new DefaultConfiguration());
		Configurator.setRootLevel(Level.INFO);

		this.sqlMapPIC = SqlMapInstanceBATCH.getSqlMapInstance();
		System.out.println("Batch work of information in the ti_topcomp table");
	}

   
	@Override

	public void run() {
		try {
			sendMailLoop();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}

	}
	
	// HTML Tag 문서 임다.
	private void sendMailLoop() {
		
		try {
			List<agentIpVo> master = this.sqlMapPIC.openSession().queryForList("query.getAentIp");
			List<agentIpVo> net_ip = this.sqlMapPIC.openSession().queryForList("query.getNetIp");
				
				for(agentIpVo vo:  master) {
						
					for(agentIpVo io:  net_ip) {

						SubnetUtils subnetUtils = new SubnetUtils(io.getMask_ip());
				        subnetUtils.setInclusiveHostCount(true);
				        
				        if(subnetUtils.getInfo().isInRange(vo.getIp()) == true) {
				        	this.sqlMapPIC.openSession().insert("update.setNetIp", io);
							break;
				        }
					}
				}
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	

}
