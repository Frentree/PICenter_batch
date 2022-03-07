package com.iopts.main;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.skyun.app.util.database.ibatis.SqlMapInstanceBATCH;
import com.skyun.app.util.database.ibatis.vo.NetTargetVo;
import com.skyun.app.util.database.ibatis.vo.agentIpVo;
import com.skyun.app.util.database.ibatis.vo.netIpVo;

public class DaemonThread implements Runnable {
	private static SqlMapClient sqlMapPIC = null;


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
			netMaskChk();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}

	}
	
	private void netMaskChk() {
		try {
			List<agentIpVo> targetList = this.sqlMapPIC.openSession().queryForList("query.getAgentIp");
			List<netIpVo> netList = this.sqlMapPIC.openSession().queryForList("query.getNetIp");
			
			SubnetUtils subnetUtils = null;
			
			for(int i = 0; i < targetList.size(); i++) {
				agentIpVo target = targetList.get(i);
				
				for(int j = 0; j < netList.size(); j++) {
					netIpVo net = netList.get(j);
					
					subnetUtils = new SubnetUtils(net.getIp() + "/" + net.getMask());
					subnetUtils.setInclusiveHostCount(true);
					
					// 해당 ip 확인
					if(subnetUtils.getInfo().isInRange(target.getIp()) == true) {
						logger.info("해당 아이피 >> " + target.getIp());
						logger.info("해당 대역대 >> " + net.getMask_ip());
						logger.info("해당 대상 >> " + net.getType());
						
						logger.info("---------------------------------------------");
						
						updateTargets(net.getType(), target.getTarget_id(), target.getAp_no());
						
						break;
					}
				}
				
			}
		
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	
	private void updateTargets(String type, String target_id, int ap_no) {
		NetTargetVo vo = new NetTargetVo(type, target_id, ap_no);
		
		try {
			this.sqlMapPIC.openSession().update("update.setNetIp", vo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
