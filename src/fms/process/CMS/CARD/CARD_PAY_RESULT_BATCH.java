package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_PAY_RESULT_BATCH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//카드 출금신청 결과(배치)
		if(conn.connect(Property.CARD_IP, 51001)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		
		/**
		 * 1. 시작전문 송신
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_PAY_RESULT_BATCH);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_PAY_RESULT_BATCH);
		
		//시작전문 리턴
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
		//테일전문 리턴받을때까지
		while(true){
			String tgl = new String(conn.recvData());
			log.tgrLog("수신", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
		
		//종료전문 수신
		sdata = new String(conn.recvData());
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
