package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_AUTH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//카드인증 : 31001
		if(conn.connect("121.134.74.90", 31001)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		/**
		
		 * 1. 시작전문 송신
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_AUTH);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_AUTH);
		
		/**
		 * 2. 시작전문 응답수신
		 */
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
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
