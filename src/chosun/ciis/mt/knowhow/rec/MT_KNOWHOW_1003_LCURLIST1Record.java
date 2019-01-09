/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.knowhow.rec;

import java.sql.*;
import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.ds.*;

/**
 * 
 */


public class MT_KNOWHOW_1003_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String lcls;
	public String reg_seq;
	public String qust_answer;
	public String make_pers_emp_nm;

	public MT_KNOWHOW_1003_LCURLIST1Record(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setLcls(String lcls){
		this.lcls = lcls;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setQust_answer(String qust_answer){
		this.qust_answer = qust_answer;
	}

	public void setMake_pers_emp_nm(String make_pers_emp_nm){
		this.make_pers_emp_nm = make_pers_emp_nm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getLcls(){
		return this.lcls;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getQust_answer(){
		return this.qust_answer;
	}

	public String getMake_pers_emp_nm(){
		return this.make_pers_emp_nm;
	}
}

/* 작성시간 : Wed Jun 10 16:29:15 KST 2009 */