package fms.process.CMS.CARD;
import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.CARD_CMS_Sample_Telegrams;


public class CARD_PAY_APPLY_BATCH {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		
		ConsoleLog log = new ConsoleLog();
		
		/**
		 * ��������
		 */
		//ī�� ���ν�û(��ġ)
		if(conn.connect(Property.CARD_IP, 51001)<0){
			log.msgLog("�������");
			return ;
		}else{
			log.msgLog("���Ἲ��");
		}
		/**
		
		 * 1. �������� �۽�
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_START_PAY_APPLY);
		log.msgLog(CARD_CMS_Sample_Telegrams.CARD_START_PAY_APPLY);
		
		/**
		 * 2. �������� �������
		 */
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
			/**
		 * 3. ��û������(Header����,Data����,Tail����) �۽�.:
		 */
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY);
		log.tgrLog("�۽�", CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY);
		
		// ���� �� �϶�
		for(int i=0;i<CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY.length;i++){
			conn.sendData(CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY[i]);
			log.tgrLog("�۽�", CARD_CMS_Sample_Telegrams.CARD_DATA_PAY_APPLY[i]);
		}
		
		conn.sendData(CARD_CMS_Sample_Telegrams.CARD_TAIL_PAY_APPLY);
		log.tgrLog("�۽�", CARD_CMS_Sample_Telegrams.CARD_TAIL_PAY_APPLY);
		
		System.out.println(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY.substring(11,17).trim());
		
		int dataCnt = 0;
		dataCnt = Integer.parseInt(CARD_CMS_Sample_Telegrams.CARD_HEADER_PAY_APPLY.substring(11,17).trim());
		System.out.println(dataCnt);
		
		while(dataCnt>0){
			dataCnt--;
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
