package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_ONE_PAY_APPLY {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		//ī�� ������Ҵ� �Ǻ��� ����
		if(conn.connect(Property.CARD_IP, Property.CARD_TEST_PORT)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		
		/**
		 * 1. �������� �۽�
		 */
		//��ݽ�û(�Ǻ�)
		//conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_APPLY);
		//log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_APPLY);
		
		//��ݽ�û(��ȸ)
		//conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_SEARCH);
		//log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_SEARCH);
				
		//��ݽ�û(���)
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_CANCEL);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_ONE_PAY_CANCEL);
		
		//��û���� ����
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
