package fms.process.CMS.REALCMS;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.JAVA_Socket;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.REAL_CMS_Sample_Telegrams;




public class REALCMS_ONE_PAY_APPLY {
	
	
	public static void main(String [] ar){
		
		BaseAction conn = new XC_JavaSocket();
		/*BaseAction conn = new JAVA_Socket();*/
		ConsoleLog log = new ConsoleLog();
		conn.connect(Property.BATCH_CMS_IP, 14000);
		/*conn.connect("192.168.180.70", 21031);*/
		
		// REALCMS_COMMON �Ϲ����� ���ڵ������� ��������Ȯ�� 
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		log.tgrLog("�۽�", REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		byte [] tgr = conn.recvData();
		
		log.tgrLog("����",tgr);
		conn.close();		
		
		System.out.println("ó������ڵ� : " + new String(tgr,64,4));
	}
}