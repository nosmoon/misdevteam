package fms.process.CMS.REALCMS.BATCH;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.REAL_CMS_Sample_Telegrams;




public class REALCMS_ONE_PAY_APPLY {
	
	
	public static void main(String [] ar){
		
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		
		if(conn.connect(Property.VIRTUAL_IP, 11000)<0){
			log.msgLog("연결실패");
			return ;
		}else{
			log.msgLog("연결성공");
		}
		
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_ACCT_SEARCH_ONE_AA);
		log.tgrLog("송신", REAL_CMS_Sample_Telegrams.REALCMS_ACCT_SEARCH_ONE_AA);
		
		String tgr = new String(conn.recvData());
		log.tgrLog("수신",tgr);
		conn.close();		
		
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
		
		
		//System.out.println("처리결과코드 : " + new String(tgr,64,4));
	}
}