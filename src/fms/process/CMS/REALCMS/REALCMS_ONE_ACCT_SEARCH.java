package fms.process.CMS.REALCMS;

import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.REAL_CMS_Sample_Telegrams;




public class REALCMS_ONE_ACCT_SEARCH {
	
	
	public static void main(String [] ar){
		
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		
		conn.connect(Property.BATCH_CMS_IP, 14000); 	// TEST
		
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_ACCT_SEARCH_ONE);
		System.out.println("송신 : " + REAL_CMS_Sample_Telegrams.REALCMS_ACCT_SEARCH_ONE);
		byte [] tgr = conn.recvData();
		System.out.println("수신 : " + new String(tgr));
		System.out.println("결과코드 : " + "[" + new String(tgr,64,4) + "]");
		conn.close();
	}
}
