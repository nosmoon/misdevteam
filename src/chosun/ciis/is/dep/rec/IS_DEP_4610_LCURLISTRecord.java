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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_4610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String slip_clsf;
	public String chg_pers;
	public String chg_pers_nm;
	public String cnt_t;
	public String amt_t;
	public String amt_12;
	public String amt_08;
	public String amt_09;
	public String amt_10;
	public String clos_yn;
	public String clos_proc_dt;
	public String actu_slip_no;

	public IS_DEP_4610_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_pers_nm(String chg_pers_nm){
		this.chg_pers_nm = chg_pers_nm;
	}

	public void setCnt_t(String cnt_t){
		this.cnt_t = cnt_t;
	}

	public void setAmt_t(String amt_t){
		this.amt_t = amt_t;
	}

	public void setAmt_12(String amt_12){
		this.amt_12 = amt_12;
	}

	public void setAmt_08(String amt_08){
		this.amt_08 = amt_08;
	}

	public void setAmt_09(String amt_09){
		this.amt_09 = amt_09;
	}

	public void setAmt_10(String amt_10){
		this.amt_10 = amt_10;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_pers_nm(){
		return this.chg_pers_nm;
	}

	public String getCnt_t(){
		return this.cnt_t;
	}

	public String getAmt_t(){
		return this.amt_t;
	}

	public String getAmt_12(){
		return this.amt_12;
	}

	public String getAmt_08(){
		return this.amt_08;
	}

	public String getAmt_09(){
		return this.amt_09;
	}

	public String getAmt_10(){
		return this.amt_10;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* 작성시간 : Mon Jan 14 10:34:05 KST 2013 */