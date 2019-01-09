package fms.process.CMS.VIRTUAL;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.Virtual_SampleTelegrams;


public class Virtual_Test_Deposit_Search {

	public static void main(String [] ar){
		BaseAction conn = new XC_JavaSocket();
		conn.connect(Property.VIRTUAL_IP,	Property.VIRTUAL_TEST_PORT);
		ConsoleLog log = new ConsoleLog();
		
		
		conn.sendData(Virtual_SampleTelegrams.Virtual_Deposit_Start);
		log.tgrLog("송신", Virtual_SampleTelegrams.Virtual_Deposit_Start);
		
		
		byte [] start_tgr = null;
		start_tgr = conn.recvData();
		log.tgrLog("수신",start_tgr);
		if(start_tgr[37]==(byte)'N'){
			conn.close();
			return;
		}
		
		//날짜별
		conn.sendData(Virtual_SampleTelegrams.Virtual_Deposit_Search_D);
		//미수신
		//conn.sendData(Virtual_SampleTelegrams.Virtual_Deposit_Search_A);
		
		while(true){
			String tgl = new String(conn.recvData());
			System.out.println("수신데이터 >>>\n" +  tgl);
			
			if(tgl.substring(0,1).charAt(0)=='H'){
				continue;
			}else if(tgl.substring(0,1).charAt(0)=='T'){
				if(tgl.charAt(52)=='N'){
					conn.sendData(Virtual_SampleTelegrams.Virtual_Deposit_ReturnTail);
					continue;
				}
				break;
			}
		}
		
		conn.sendData(Virtual_SampleTelegrams.Virtual_Deposit_ReturnTail);
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_End);
		
		conn.close();
	}
}