package fms.process.CMS.BatchCMS_V2.MEMBER_TEST;

import fms.util.ConsoleLog;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;


public class CMS_MEM_RESULT_New {
	
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * ��������
		 */
		conn.connect(Property.BATCH_CMS_IP, 21000);
		
		/**
		 * 1. ���������۽�
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_RESULT_New);
		if(sended_flag)log.tgrLog("�۽�", BATCH_CMS_Sample_Telegrams_New.CMS_START_MEM_RESULT_New);
		
		/**
		 * 2. �������� ���� ����
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("����", tgr);
		
		
		/**
		 * �������� ó������� ���� ó���б�
		 */
		if(tgr.charAt(243)=='N') return;
		
		/**
		 *  ȸ����û����� ����, H, D, T���� ����
		 */
		int total_cnt = 0;
		int fail_cnt=0;
		while(true){
			tgr = new String(conn.recvData());
			log.tgrLog("����", tgr);
			
			if(tgr.substring(0,1).charAt(0)=='D'){
				
			}else if(tgr.substring(0,1).charAt(0)=='H'){		
				total_cnt=Integer.parseInt(tgr.substring(9,15).trim());
				continue;
			}else if(tgr.substring(0,1).charAt(0)=='T')break;
			
			fail_cnt++;
		}
		
		/**
		 * ������������
		 */
		tgr = new String(conn.recvData());
		log.tgrLog("����", tgr);
		
		/**
		 * ��������
		 */
		conn.close();
	}
}