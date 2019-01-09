/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-연말정산관리
* 작성일자 : 2014-12-30
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 신규컬럼 추가( 주택유형, 주택계약면적)
* 수정자 : 이태식
* 수정일자 :2014-12-30
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_5400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String seq;
	public String emp_no;
	public String leas_flnm;
	public String leas_prn;
	public String addr;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String month_rent_amt;
	public String resi_clsf_cd;
	public String hous_cntr_sqr;

	public HD_YADJM_5400_LCURLISTRecord(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLeas_flnm(String leas_flnm){
		this.leas_flnm = leas_flnm;
	}

	public void setLeas_prn(String leas_prn){
		this.leas_prn = leas_prn;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setMonth_rent_amt(String month_rent_amt){
		this.month_rent_amt = month_rent_amt;
	}

	public void setResi_clsf_cd(String resi_clsf_cd){
		this.resi_clsf_cd = resi_clsf_cd;
	}

	public void setHous_cntr_sqr(String hous_cntr_sqr){
		this.hous_cntr_sqr = hous_cntr_sqr;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLeas_flnm(){
		return this.leas_flnm;
	}

	public String getLeas_prn(){
		return this.leas_prn;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getMonth_rent_amt(){
		return this.month_rent_amt;
	}

	public String getResi_clsf_cd(){
		return this.resi_clsf_cd;
	}

	public String getHous_cntr_sqr(){
		return this.hous_cntr_sqr;
	}
}

/* 작성시간 : Tue Dec 30 13:51:46 KST 2014 */