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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_1025_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String a_acwr_reg_dt_seq;
	public String a_dlco_nm;
	public String a_advt_nm;
	public String a_suply_amt;
	public String a_tqt_suply_amt;
	public String a_acwr_reg_dt;
	public String a_acwr_reg_seq;

	public IS_SAL_1025_SCURLISTRecord(){}

	public void setA_acwr_reg_dt_seq(String a_acwr_reg_dt_seq){
		this.a_acwr_reg_dt_seq = a_acwr_reg_dt_seq;
	}

	public void setA_dlco_nm(String a_dlco_nm){
		this.a_dlco_nm = a_dlco_nm;
	}

	public void setA_advt_nm(String a_advt_nm){
		this.a_advt_nm = a_advt_nm;
	}

	public void setA_suply_amt(String a_suply_amt){
		this.a_suply_amt = a_suply_amt;
	}

	public void setA_tqt_suply_amt(String a_tqt_suply_amt){
		this.a_tqt_suply_amt = a_tqt_suply_amt;
	}

	public void setA_acwr_reg_dt(String a_acwr_reg_dt){
		this.a_acwr_reg_dt = a_acwr_reg_dt;
	}

	public void setA_acwr_reg_seq(String a_acwr_reg_seq){
		this.a_acwr_reg_seq = a_acwr_reg_seq;
	}

	public String getA_acwr_reg_dt_seq(){
		return this.a_acwr_reg_dt_seq;
	}

	public String getA_dlco_nm(){
		return this.a_dlco_nm;
	}

	public String getA_advt_nm(){
		return this.a_advt_nm;
	}

	public String getA_suply_amt(){
		return this.a_suply_amt;
	}

	public String getA_tqt_suply_amt(){
		return this.a_tqt_suply_amt;
	}

	public String getA_acwr_reg_dt(){
		return this.a_acwr_reg_dt;
	}

	public String getA_acwr_reg_seq(){
		return this.a_acwr_reg_seq;
	}
}

/* 작성시간 : Fri Jan 04 14:58:34 KST 2013 */