/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String note_amt;
	public String rcpay_amt;
	public String amt;

	public IS_DEP_2510_LCURLIST1Record(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Tue May 22 14:37:31 KST 2012 */