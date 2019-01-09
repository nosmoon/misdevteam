package fms.process.CMS.VIRTUAL;

import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.comm_module.JAVA_Socket;
import fms.common.Property;
import fms.common.tele.SampleTelegrams;

public class Virtual_Test_Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//BaseAction conn = new XC_JavaSocket();
		//BaseAction conn = new JAVA_Socket();
		BaseAction conn = new XC_JavaSocket();
		/**
		 * 서버접속
		 */
		
		conn.connect(Property.VIRTUAL_IP, Property.VIRTUAL_TEST_PORT);
		
		
		conn.sendData(SampleTelegrams.Virtual_Mem_Start);
		
		String sdata = new String(conn.recvData());
		System.out.println("R:"+sdata);
		
		conn.sendData(SampleTelegrams.Virtual_Mem_Search);
		
		String adata = new String(conn.recvData());
		System.out.println("R:"+adata);
		
		/*String hdata = new String(conn.recvData());
		System.out.println("R:"+hdata);*/
		
		//int dataCnt = 0;
		//dataCnt = Integer.parseInt(hdata.charAt(9)+"")+2;
		/*String tgl="";
		while(true){
			//dataCnt--;
			 tgl = new String(conn.recvData());
			System.out.println("R:"+tgl);
			if(tgl.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
		System.out.println("Tail:"+tgl);*/
		
		/*String Tail  = tgl.substring(0, 10)+"0"+tgl.substring(11, 119)+"\r\n";*/
		
		//conn.sendData(SampleTelegrams.Virtual_Mem_ReturnTail);
		
		//conn.sendData(tgl);
		//System.out.println("Tail2:"+tgl);
		
		conn.sendData(SampleTelegrams.Virtual_Mem_End);
		String edata = new String(conn.recvData());
		System.out.println("R:"+edata);
		conn.close();

	}

}

