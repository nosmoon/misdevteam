/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord.java
* ��� : Ȯ��뿪��� ����IS Ȯ�����(������) �����׸� ����� ���� Record
* �ۼ����� : 2003-12-23
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


public class SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String extnflnm;
	public String subscnfmstatnm;

	public SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord(){}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setSubscnfmstatnm(String subscnfmstatnm){
		this.subscnfmstatnm = subscnfmstatnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getSubscnfmstatnm(){
		return this.subscnfmstatnm;
	}
}

/* �ۼ��ð� : Tue Dec 23 15:02:05 KST 2003 */