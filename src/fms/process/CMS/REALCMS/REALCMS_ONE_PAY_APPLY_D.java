package fms.process.CMS.REALCMS;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.REAL_CMS_Sample_Telegrams;




public class REALCMS_ONE_PAY_APPLY_D {
	
	
	public static void main(String [] ar){
		
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		//전용선
		conn.connect(Property.BATCH_CMS_IP, 14000);
		
		// REALCMS_COMMON 일반인지 전자동의인지 업무구분확인 
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		log.tgrLog("송신", REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		byte [] tgr = conn.recvData();
		
		log.tgrLog("수신",tgr);
		conn.close();		
		
		
		System.out.println("처리결과코드 : " + new String(tgr,64,4));
	}
}