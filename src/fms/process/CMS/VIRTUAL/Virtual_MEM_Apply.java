package fms.process.CMS.VIRTUAL;

import fms.util.ConsoleLog;
import fms.comm_module.BaseAction;
import fms.comm_module.XC_JavaSocket;
import fms.common.Property;
import fms.common.tele.Virtual_SampleTelegrams;

public class Virtual_MEM_Apply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BaseAction conn = new XC_JavaSocket();
		ConsoleLog log = new ConsoleLog();
		/**
		 * 서버접속
		 */
		
		conn.connect(Property.VIRTUAL_IP, 16000);
		
		//가상계좌 시작전문
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_Start);
		//시작전문 리턴
		String sdata = new String(conn.recvData());
		System.out.println("R1:"+sdata);
		
		//회원 등록신청 전문
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_Apply);
		//회원 등록신청 전문 리턴
		while(true){
			//dataCnt--;
			String adata = new String(conn.recvData());
			System.out.println("R2:"+adata);
			if(adata.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
		
		//리턴 응답전문
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_ReturnTail);
		System.out.println("a1:"+Virtual_SampleTelegrams.Virtual_Mem_ReturnTail);
		
		//종료 전문
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_End);
		System.out.println("a2:"+Virtual_SampleTelegrams.Virtual_Mem_End);
		
		//소켓종료
		int ret = conn.close();
		if(ret>0){
			log.msgLog("연결종료");
		}else{
			log.msgLog("연결종료 실패 : " + ret);
		}
	}

}

