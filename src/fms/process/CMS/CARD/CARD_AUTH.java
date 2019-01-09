package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_AUTH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		//ī������ : 31001
		if(conn.connect("121.134.74.90", 31001)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		/**
		
		 * 1. �������� �۽�
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_AUTH);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_AUTH);
		
		/**
		 * 2. �������� �������
		 */
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
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
