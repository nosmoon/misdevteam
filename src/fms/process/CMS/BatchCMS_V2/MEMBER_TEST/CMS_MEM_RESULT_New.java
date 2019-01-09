package fms.process.CMS.BatchCMS_V2.MEMBER_TEST;

import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;


public class CMS_MEM_RESULT_New {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * 서버접속
		 */
		conn.connect(Property.BATCH_CMS_IP, 21000);
		
		/**
		 * 1. 시작전문송신
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_RESULT_New);
		if(sended_flag)log.tgrLog("송신", BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_RESULT_New);
		
		/**
		 * 2. 시작전문 응답 수신
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("수신", tgr);
		
		
		/**
		 * 시작전문 처리결과에 따른 처리분기
		 */
		if(tgr.charAt(243)=='N') return;
		
		/**
		 *  회원신청결과에 대한, H, D, T전문 수신
		 */
		int total_cnt = 0;
		int fail_cnt=0;
		while(true){
			tgr = new String(conn.recvData());
			log.tgrLog("수신", tgr);
			
			if(tgr.substring(0,1).charAt(0)=='D'){
				
			}else if(tgr.substring(0,1).charAt(0)=='H'){		
				total_cnt=Integer.parseInt(tgr.substring(9,15).trim());
				continue;
			}else if(tgr.substring(0,1).charAt(0)=='T')break;
			
			fail_cnt++;
		}
		
		/**
		 * 종료전문수신
		 */
		tgr = new String(conn.recvData());
		log.tgrLog("수신", tgr);
		
		/**
		 * 접속종료
		 */
		conn.close();
	}
}