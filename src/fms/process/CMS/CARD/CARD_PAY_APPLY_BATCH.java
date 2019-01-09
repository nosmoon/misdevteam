package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_PAY_APPLY_BATCH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * 서버접속
		 */
		//카드 승인신청(배치)
		if(conn.connect(Property.CARD_IP, 51001)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		/**
		
		 * 1. 시작전문 송신
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_START_PAY_APPLY);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_START_PAY_APPLY);
		
		/**
		 * 2. 시작전문 응답수신
		 */
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
			/**
		 * 3. 신청데이터(Header전문,Data전문,Tail전문) 송신.:
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY);
		log.tgrLog("송신", CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY);
		
		// 여러 건 일때
		for(int i=0;i<CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY.length;i++){
			conn.sendData(CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY[i]);
			log.tgrLog("송신", CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY[i]);
		}
		
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_TAIL_PAY_APPLY);
		log.tgrLog("송신", CARD_CMS_Sample_Telegrams.CARD_TAIL_PAY_APPLY);
		
		System.out.println(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY.substring(11,17).trim());
		
		int dataCnt = 0;
		dataCnt = Integer.parseInt(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY.substring(11,17).trim());
		System.out.println(dataCnt);
		
		while(dataCnt>0){
			dataCnt--;
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
