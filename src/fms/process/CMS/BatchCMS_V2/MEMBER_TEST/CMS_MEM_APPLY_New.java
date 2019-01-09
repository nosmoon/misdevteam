package fms.process.CMS.BatchCMS_V2.MEMBER_TEST;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;


public class CMS_MEM_APPLY_New {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//if(conn.connect(Property.BATCH_CMS_IP, Property.CMS_REAL_PORT)<0){
		/*if(conn.connect(Property.BATCH_CMS_IP, Property.CMS_TEST_PORT)<0){*/
		if(conn.connect("121.134.74.90", 11000)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		/**
		
		 * 1. 시작전문 송신
		 */
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_APPLY_New);
		log.msgLog(BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_APPLY_New);
		
		/**
		 * 2. 시작전문 응답수신
		 */
		byte [] b = null;
		b = conn.recvData();
		String start_tgr = new String(b);
		log.tgrLog("수신", start_tgr);
		if(start_tgr.charAt(243)=='N'){
			conn.close();
			return;
		}
/*
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		/**
		 * 3. 신청데이터(Header전문,Data전문,Tail전문) 송신.:
		 */
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_HEADER_New);
		log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_MEM_HEADER_New);
		
		// 여러 건 일때
		for(int i=0;i<BATCH_CMS_Sample_Telegrams_New.CMS_MEM_N_DATA_New.length;i++){
			conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_N_DATA_New[i]);
			log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_MEM_N_DATA_New[i]);
		}
		// 한 건 일때
//		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_ONE_MEM_N_DATA);
//		log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_ONE_MEM_N_DATA);


		//  수정
//		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_U_DATA);
//		log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_MEM_U_DATA);

		// 삭제
//		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_D_DATA);
//		log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_MEM_D_DATA);
		
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_TAIL_New);
		log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_MEM_TAIL_New);
		
		/**
		 * 4. 신청데이터 실패처리된것 응답수신.
		 */
		int dataCnt = 0;
		//dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_HEADER.charAt(9)+"")+2;
		dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams_New.CMS_MEM_HEADER_New.substring(11,17).trim());		
		
		while(dataCnt>0){
			dataCnt--;
			String tgl = new String(conn.recvData());
			log.tgrLog("수신", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
	
		/**
		 * 5. 종료전문 수신.
		 */
		b = conn.recvData();
		String tgl = new String(b);
		log.tgrLog("수신", tgl);
		
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
