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
		 * ��������
		 */
		
		conn.connect(Property.VIRTUAL_IP, 16000);
		
		//������� ��������
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_Start);
		//�������� ����
		String sdata = new String(conn.recvData());
		System.out.println("R1:"+sdata);
		
		//ȸ�� ��Ͻ�û ����
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_Apply);
		//ȸ�� ��Ͻ�û ���� ����
		while(true){
			//dataCnt--;
			String adata = new String(conn.recvData());
			System.out.println("R2:"+adata);
			if(adata.substring(0,1).charAt(0)=='T'){
				break;
			}
		}
		
		//���� ��������
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_ReturnTail);
		System.out.println("a1:"+Virtual_SampleTelegrams.Virtual_Mem_ReturnTail);
		
		//���� ����
		conn.sendData(Virtual_SampleTelegrams.Virtual_Mem_End);
		System.out.println("a2:"+Virtual_SampleTelegrams.Virtual_Mem_End);
		
		//��������
		int ret = conn.close();
		if(ret>0){
			log.msgLog("��������");
		}else{
			log.msgLog("�������� ���� : " + ret);
		}
	}

}

