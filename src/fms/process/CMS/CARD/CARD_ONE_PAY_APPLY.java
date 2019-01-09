package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_ONE_PAY_APPLY {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//카드 승인취소는 건별만 가능
		if(conn.connect(Property.CARD_IP, Property.CARD_TEST_PORT)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		
		/**
		 * 1. 시작전문 송신
		 */
		//출금신청(건별)
		//conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_APPLY);
		//log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_APPLY);
		
		//출금신청(조회)
		//conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_SEARCH);
		//log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_SEARCH);
				
		//출금신청(취소)
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_CANCEL);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_CANCEL);
		
		//신청전문 리턴
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
