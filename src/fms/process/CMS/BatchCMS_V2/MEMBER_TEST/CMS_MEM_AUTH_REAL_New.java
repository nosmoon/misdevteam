package fms.process.CMS.BatchCMS_V2.MEMBER_TEST;

import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;

public class CMS_MEM_AUTH_REAL_New {	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * ��������
		 */
		conn.connect(Property.BATCH_CMS_IP, Property.CMS_TEST_PORT);
		
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_REAL_AUTH_New);
		ConsoleLog log = new ConsoleLog();
		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams_New.CMS_REAL_AUTH_New);
		
		byte [] tgr = conn.recvData();
		
		log.tgrLog("����", tgr);
		
		conn.close();
	}
}

