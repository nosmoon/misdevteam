/***************************************************************************************************
* ���ϸ� : OLAPBatchExec.java
* ��� : OLAPBatchServer ����
* �ۼ����� : 2005-03-14
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/
package chosun.ciis.ss.sls.com.ldap;

import java.net.*;
import java.io.*;

/**
* OLAPBatchServer ����
*/
public class OLAPBatchExec{

	private String olapServerIP = "220.73.135.85";		//OLAPBatchServer IP
	private int olapServerPort = 5000;					//OLAPBatchServer Port

	// OLAPBatchServer�� �����Ͽ� Batch Maintenance ���� ��û �� ����� ����('Y':����, 'N':����)
	public String runOLAPBatch(){

		String ret = "N";	// OLAPBatchServer ���� �� ����� ����

	    try {
			//�������� �� ��û
			Socket s1 = new Socket(olapServerIP, olapServerPort);

			//����� ������ ���� Stream��ü ����
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			//������� �����κ��� ���۹���.
			ret = dis.readUTF();

			dis.close();
			s1.close();
	    } catch (Exception e) {
			System.out.println("[OLAPBatchExec][Error] OLAPBatchExec ����� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
	    }

	    return ret;
  	}
}
