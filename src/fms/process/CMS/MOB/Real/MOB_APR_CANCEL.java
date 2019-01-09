package fms.process.CMS.MOB.Real;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.HP_SampleTelegrams;

public class MOB_APR_CANCEL {
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * 서버접속
		 */
		conn.connect(Property.BATCH_CMS_IP, 12100);
		
		
		/**
		 * 1. 전문송신
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(HP_SampleTelegrams.MOB_CON_CANCEL_APPLY2);
		/*if(sended_flag)*/log.tgrLog("송신", HP_SampleTelegrams.MOB_CON_CANCEL_APPLY2);
		
		
		/**
		 * 2. 전문 응답 수신
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("수신", tgr);
		
		
		/**
		 * 접속종료
		 */
		conn.close();
	}

}
