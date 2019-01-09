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
		//���뼱
		conn.connect(Property.BATCH_CMS_IP, 14000);
		
		// REALCMS_COMMON �Ϲ����� ���ڵ������� ��������Ȯ�� 
		conn.sendData(REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		log.tgrLog("�۽�", REAL_CMS_Sample_Telegrams.REALCMS_PAY_APPLY);
		byte [] tgr = conn.recvData();
		
		log.tgrLog("����",tgr);
		conn.close();		
		
		
		System.out.println("ó������ڵ� : " + new String(tgr,64,4));
	}
}