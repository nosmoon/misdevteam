package fms.process.CMS.ARS;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.ARS_SampleTelegrams;


public class ARS_MEM_APPLY {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//if(conn.connect(Property.BATCH_CMS_IP, Property.CMS_REAL_PORT)<0){
		if(conn.connect(Property.BATCH_CMS_IP, 13000)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		
		/**
		 * 1. 시작전문 송신
		 */
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY); //신청일자 변경
		log.msgLog(ARS_SampleTelegrams.ARS_MEM_APPLY);
		
		/**
		 * 2. 시작전문 응답수신
		 */
		byte [] b = null;
		
		b = conn.recvData();
		String start_tgr = new String(b);
		log.tgrLog("수신", start_tgr);
		
		//H
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Header);
		log.tgrLog("송신", ARS_SampleTelegrams.ARS_MEM_APPLY_Header);
		
		//D
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Data);
		log.tgrLog("송신", ARS_SampleTelegrams.ARS_MEM_APPLY_Data);
		
		//T
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Tail);
		log.tgrLog("송신", ARS_SampleTelegrams.ARS_MEM_APPLY_Tail);
		
		//H
		byte [] c = null;
		c = conn.recvData();
		start_tgr = new String(c);
		log.tgrLog("수신", start_tgr);
		
		//D
		byte [] d = null;
		d = conn.recvData();
		start_tgr = new String(d);
		log.tgrLog("수신", start_tgr);
		
		//T
		byte [] e = null;
		e = conn.recvData();
		start_tgr = new String(e);
		log.tgrLog("수신", start_tgr);
		
		//E
		byte [] f = null;
		f = conn.recvData();
		start_tgr = new String(f);
		log.tgrLog("수신", start_tgr);
		
/*
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		/**
		 * 소켓종료
		 */
		int ret = conn.close();
		if(ret>0){
			log.msgLog("연결종료");
		}else{
			log.msgLog("연결종료 실패 : " + ret);
		}
	}
}
