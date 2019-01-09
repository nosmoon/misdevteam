package fms.process.CMS.MOB.Batch;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.HP_SampleTelegrams;

public class MOB_PAY_APPLY {
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * ��������
		 */
		conn.connect(Property.BATCH_CMS_IP, 22000);
		
		
		/**
		 * 1. �����۽�
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(HP_SampleTelegrams.MOB_S_PAY);
		if(sended_flag)log.tgrLog("�۽�", HP_SampleTelegrams.MOB_S_PAY);
		
		
		/**
		 * 2. ���� ���� ����
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("����", tgr);
		
		conn.sendData(HP_SampleTelegrams.MOB_S_H_PAY);
		log.tgrLog("�۽�", HP_SampleTelegrams.MOB_S_H_PAY);
		
		// ���� �� �϶�
		for(int i=0;i<HP_SampleTelegrams.MOB_S_D_PAY.length;i++){
			conn.sendData(HP_SampleTelegrams.MOB_S_D_PAY[i]);
			log.tgrLog("�۽�", HP_SampleTelegrams.MOB_S_D_PAY[i]);
		}
		
		conn.sendData(HP_SampleTelegrams.MOB_S_T_PAY);
		log.tgrLog("�۽�", HP_SampleTelegrams.MOB_S_T_PAY);
		
		int dataCnt = 0;
		//dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams.CMS_MEM_HEADER.charAt(9)+"")+2;
		dataCnt = Integer.parseInt(HP_SampleTelegrams.MOB_S_H_PAY.substring(9,15).trim());		
		System.out.println("kk:"+HP_SampleTelegrams.MOB_S_H_PAY.substring(9,15).trim());
		
		String tgl = new String(conn.recvData());
		log.tgrLog("����", tgl);	
		
		String tgl2 = new String(conn.recvData());
		log.tgrLog("����", tgl2);	
		
		/*while(dataCnt>0){
			dataCnt--;
			String tgl = new String(conn.recvData());
			log.tgrLog("����", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				System.out.println("kk:"+tgl.substring(0,1).charAt(0));
				break;
			}
		}*/
		
		
		/**
		 * ��������
		 */
		conn.close();
	}

}
