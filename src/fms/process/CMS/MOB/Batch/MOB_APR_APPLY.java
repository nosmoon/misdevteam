package fms.process.CMS.MOB.Batch;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.HP_SampleTelegrams;

public class MOB_APR_APPLY {
	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		/**
		 * 서버접속
		 */
		conn.connect(Property.BATCH_CMS_IP, 12000);
		
		
		/**
		 * 1. 전문송신
		 */
		ConsoleLog log = new ConsoleLog();
		boolean sended_flag=false;
		sended_flag = conn.sendData(HP_SampleTelegrams.MOB_S);
		if(sended_flag)log.tgrLog("송신", HP_SampleTelegrams.MOB_S);
		
		
		/**
		 * 2. 전문 응답 수신
		 */
		String tgr=null;
		tgr = new String(conn.recvData());
		log.tgrLog("수신", tgr);
		
		conn.sendData(HP_SampleTelegrams.MOB_S_H);
		log.tgrLog("송신", HP_SampleTelegrams.MOB_S_H);
		
		// 여러 건 일때
		for(int i=0;i<HP_SampleTelegrams.MOB_S_D.length;i++){
			conn.sendData(HP_SampleTelegrams.MOB_S_D[i]);
			log.tgrLog("송신", HP_SampleTelegrams.MOB_S_D[i]);
		}
		
		conn.sendData(HP_SampleTelegrams.MOB_S_T);
		log.tgrLog("송신", HP_SampleTelegrams.MOB_S_T);
		
		int dataCnt = 0;
		//dataCnt = Integer.parseInt(BATCH_CMS_Sample_Telegrams.CMS_MEM_HEADER.charAt(9)+"")+2;
		dataCnt = Integer.parseInt(HP_SampleTelegrams.MOB_S_H.substring(9,15).trim());		
		System.out.println("kk:"+HP_SampleTelegrams.MOB_S_H.substring(9,15).trim());
		
		String tgl = new String(conn.recvData());
		log.tgrLog("수신", tgl);	
		
		String tgl2 = new String(conn.recvData());
		log.tgrLog("수신", tgl2);	
		
		/*while(dataCnt>0){
			dataCnt--;
			String tgl = new String(conn.recvData());
			log.tgrLog("수신", tgl);			
			if(tgl.substring(0,1).charAt(0)=='T'){
				System.out.println("kk:"+tgl.substring(0,1).charAt(0));
				break;
			}
		}*/
		
		
		/**
		 * 접속종료
		 */
		conn.close();
	}

}
