package fms.process.CMS.MOB.Batch;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.HP_SampleTelegrams;

public class MOB_APR_RESULT {
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * ��������
		 */
		conn.connect(Property.BATCH_CMS_IP, 12100);
		
		
		/**
		 * 1. �����۽�
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(HP_SampleTelegrams.MOB_Start_PAY_RESULT);
		if(sended_flag)log.tgrLog("�۽�", HP_SampleTelegrams.MOB_Start_PAY_RESULT);
		
		
		/**
		 * 2. ���� ���� ����
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("����", tgr);
		
		//H
		byte [] c = null;
		c = conn.recvData();
		String start_tgr = new String(c);
		log.tgrLog("����", start_tgr);
				
		//D
		byte [] d = null;
		d = conn.recvData();
		start_tgr = new String(d);
		log.tgrLog("����", start_tgr);
				
		//T
		byte [] e = null;
		e = conn.recvData();
		start_tgr = new String(e);
		log.tgrLog("����", start_tgr);
				
		//E
		byte [] f = null;
		f = conn.recvData();
		start_tgr = new String(f);
		log.tgrLog("����", start_tgr);
		
		
		/**
		 * ��������
		 */
		conn.close();
	}

}
