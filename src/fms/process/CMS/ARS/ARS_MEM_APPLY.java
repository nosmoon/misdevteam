package fms.process.CMS.ARS;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.ARS_SampleTelegrams;


public class ARS_MEM_APPLY {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		//if(conn.connect(Property.BATCH_CMS_IP, Property.CMS_REAL_PORT)<0){
		if(conn.connect(Property.BATCH_CMS_IP, 13000)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		
		/**
		 * 1. �������� �۽�
		 */
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY); //��û���� ����
		log.msgLog(ARS_SampleTelegrams.ARS_MEM_APPLY);
		
		/**
		 * 2. �������� �������
		 */
		byte [] b = null;
		
		b = conn.recvData();
		String start_tgr = new String(b);
		log.tgrLog("����", start_tgr);
		
		//H
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Header);
		log.tgrLog("�۽�", ARS_SampleTelegrams.ARS_MEM_APPLY_Header);
		
		//D
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Data);
		log.tgrLog("�۽�", ARS_SampleTelegrams.ARS_MEM_APPLY_Data);
		
		//T
		conn.sendData(ARS_SampleTelegrams.ARS_MEM_APPLY_Tail);
		log.tgrLog("�۽�", ARS_SampleTelegrams.ARS_MEM_APPLY_Tail);
		
		//H
		byte [] c = null;
		c = conn.recvData();
		start_tgr = new String(c);
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
		
/*
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		/**
		 * ��������
		 */
		int ret = conn.close();
		if(ret>0){
			log.msgLog("��������");
		}else{
			log.msgLog("�������� ���� : " + ret);
		}
	}
}
