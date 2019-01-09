package fms.process.CMS.REALCMS;

import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.REAL_CMS_Sample_Telegrams;

public class REALCMS_ONE_PAY_RESULT {
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		

		conn.connect(Property.BATCH_CMS_IP, 14000);
		
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_PAY_RESULT);
		ConsoleLog log = new ConsoleLog();
		log.tgrLog("송신", REAL_CMS_Sample_Telegrams.REALCMS_PAY_RESULT);
		
		byte [] tgr = conn.recvData();
		
		log.tgrLog("수신", tgr);
		
		conn.close();
	}
}
