/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_STAFCYB_RSLTDERRLISTRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(�����)-�󼼸��
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
 * Ȯ����Ȳ-���̹�Ȯ��-����(�����)-�󼼸��
 *
 */

public class SS_L_RDR_EXTN_STAFCYB_RSLTDERRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String bonm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String subscnfmstatnm;

	public SS_L_RDR_EXTN_STAFCYB_RSLTDERRLISTRecord(){}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getSubscnfmstatnm(){
		return this.subscnfmstatnm;
	}
}

/* �ۼ��ð� : Thu Apr 08 17:25:44 KST 2004 */