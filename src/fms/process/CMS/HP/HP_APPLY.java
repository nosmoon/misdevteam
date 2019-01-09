package fms.process.CMS.HP;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.HP_SampleTelegrams;

public class HP_APPLY {
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
		sended_flag = conn.sendData(HP_SampleTelegrams.MOB_CON_APPLY);
		if(sended_flag)log.tgrLog("�۽�", HP_SampleTelegrams.MOB_CON_APPLY);
		
		
		/**
		 * 2. ���� ���� ����
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("����", tgr);
		
		
		/**
		 * ��������
		 */
		conn.close();
	}

}
