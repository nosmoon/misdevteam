/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(������)-�󼼸��
* �ۼ����� : 2004-04-08
* �ۼ��� : ����ȫ
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
 * Ȯ����Ȳ-���̹�Ȯ��-����(������)-�󼼸��
 *
 */

public class SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String extnflnm;
	public String subscnfmstatnm;

	public SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord(){}

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

/* �ۼ��ð� : Thu Apr 08 17:14:59 KST 2004 */