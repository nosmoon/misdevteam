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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_3104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;
	public String evnt_yy;
	public String amt;

	public EN_INNEXP_3104_LCURLISTRecord(){}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Fri May 01 15:09:10 KST 2009 */