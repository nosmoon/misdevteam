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


package chosun.ciis.mt.knowhow.rec;

import java.sql.*;
import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.ds.*;

/**
 * 
 */


public class MT_KNOWHOW_1003_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String seq;
	public String make_pers_emp_nm;
	public String qust_answer;

	public MT_KNOWHOW_1003_LCURLIST2Record(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMake_pers_emp_nm(String make_pers_emp_nm){
		this.make_pers_emp_nm = make_pers_emp_nm;
	}

	public void setQust_answer(String qust_answer){
		this.qust_answer = qust_answer;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMake_pers_emp_nm(){
		return this.make_pers_emp_nm;
	}

	public String getQust_answer(){
		return this.qust_answer;
	}
}

/* �ۼ��ð� : Wed Jun 10 16:29:15 KST 2009 */