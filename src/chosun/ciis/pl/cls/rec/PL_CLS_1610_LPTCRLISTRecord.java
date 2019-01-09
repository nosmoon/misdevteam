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


package chosun.ciis.pl.cls.rec;

import java.sql.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */


public class PL_CLS_1610_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_yymm;
	public String basi_dt;
	public String clos_yn;
	public String clos_pers_emp_no;
	public String incmg_dt_tm;

	public PL_CLS_1610_LPTCRLISTRecord(){}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_pers_emp_no(String clos_pers_emp_no){
		this.clos_pers_emp_no = clos_pers_emp_no;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_pers_emp_no(){
		return this.clos_pers_emp_no;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
}

/* 작성시간 : Mon Nov 09 17:27:02 KST 2015 */