package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_PAY_RESULT_BATCH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		//ī�� ��ݽ�û ���(��ġ)
		if(conn.connect(Property.CARD_IP, 51001)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		
		/**
		 * 1. �������� �۽�
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_PAY_RESULT_BATCH);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_PAY_RESULT_BATCH);
		
		//�������� ����
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
		//�������� ���Ϲ���������
		while(true){
			String tgl = new String(conn.recvData());
			log.tgrLog("����", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
		
		//�������� ����
		sdata = new String(conn.recvData());
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
