/***************************************************************************************************
* ���ϸ� : SS_L_EMPCAMPNOCURCOMMLISTRecord.java
* ��� : ���Ȯ���ȸ ��ȣ, ��ȸ���� ���� Record
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * class definition
 *
 */


public class SS_L_EMPCAMPNOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extncampno;
	public String campnm;

	public SS_L_EMPCAMPNOCURCOMMLISTRecord(){}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}
}

/* �ۼ��ð� : Mon Dec 15 20:59:39 KST 2003 */