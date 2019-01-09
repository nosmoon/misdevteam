/***************************************************************************************************
* 파일명 : OLAPBatchExec.java
* 기능 : OLAPBatchServer 실행
* 작성일자 : 2005-03-14
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/
package chosun.ciis.ss.sls.com.ldap;

import java.net.*;
import java.io.*;

/**
* OLAPBatchServer 실행
*/
public class OLAPBatchExec{

	private String olapServerIP = "220.73.135.85";		//OLAPBatchServer IP
	private int olapServerPort = 5000;					//OLAPBatchServer Port

	// OLAPBatchServer에 접속하여 Batch Maintenance 실행 요청 및 결과값 리턴('Y':실행, 'N':성공)
	public String runOLAPBatch(){

		String ret = "N";	// OLAPBatchServer 실행 후 결과값 저장

	    try {
			//서버접속 및 요청
			Socket s1 = new Socket(olapServerIP, olapServerPort);

			//결과값 전송을 위한 Stream객체 생성
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			//결과값을 서버로부터 전송받음.
			ret = dis.readUTF();

			dis.close();
			s1.close();
	    } catch (Exception e) {
			System.out.println("[OLAPBatchExec][Error] OLAPBatchExec 실행시 에러가 발생했습니다.");
			e.printStackTrace();
	    }

	    return ret;
  	}
}
