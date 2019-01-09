package fms.process.CMS.BatchCMS_V2.PAYMENT_TEST;
import fms.util.ConsoleLog;
import fms.util.UtilMethod;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;



public class CMS_PAY_APPLY_New {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		if(conn.connect(Property.BATCH_CMS_IP, 11000)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		
		/**
		 * 1. �������� �۽�
		 */
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_START_PAY_APPLY_New);
		log.msgLog(BATCH_CMS_Sample_Telegrams_New.CMS_START_PAY_APPLY_New);
		
		/**
		 * 2. �������� �������
		 */
		byte [] b = null;
		b = conn.recvData();
		String start_tgr = new String(b);
		log.tgrLog("����", start_tgr);
		if(start_tgr.charAt(243)=='N'){
			conn.close();
			return;
		}
		
/*
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		/**
		 * 3. ��û������(Header����,Data����,Tail����) �۽�.
		 */
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_PAY_HEADER_New);
		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams_New.CMS_PAY_HEADER_New);
		// ���� �� �϶�
		
		/*for(int i=0; i<20000 ;i++){
			conn.sendData(UtilMethod.loof(i));
			log.tgrLog("�۽�", UtilMethod.loof(i));
		}*/
		for(int i=0;i<BATCH_CMS_Sample_Telegrams_New.CMS_PAY_N_DATA_New.length;i++){
			conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_PAY_N_DATA_New[i]);
			log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams_New.CMS_PAY_N_DATA_New[i]);
		}
		// �� �� �϶�
		
//		conn.sendData(BATCH_CMS_Sample_Telegrams.CMS_ONE_MEM_N_DATA);
//		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams.CMS_ONE_MEM_N_DATA);


		//  ����
//		conn.sendData(BATCH_CMS_Sample_Telegrams.CMS_MEM_U_DATA);
//		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams.CMS_MEM_U_DATA);

		// ����
//		conn.sendData(BATCH_CMS_Sample_Telegrams.CMS_MEM_D_DATA);
//		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams.CMS_MEM_D_DATA);
		
		conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_PAY_TAIL_New);
		log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams_New.CMS_PAY_TAIL_New);
		
		/**
		 * 4. ��û������ ����ó���Ȱ� �������.
		 */
		int dataCnt = 0;
		//dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams.CMS_MEM_HEADER.charAt(9)+"")+2;
		dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams_New.CMS_PAY_HEADER_New.substring(11,17).trim());		
		
		while(dataCnt>0){
			dataCnt--;
			String tgl = new String(conn.recvData());
			log.tgrLog("����", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
	
		/**
		 * 5. �������� ����.
		 */
		
		b = conn.recvData();
		String tgl = new String(b);
		log.tgrLog("����", tgl);

		
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
