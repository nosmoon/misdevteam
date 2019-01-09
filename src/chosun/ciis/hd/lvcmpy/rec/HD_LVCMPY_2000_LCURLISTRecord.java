/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String etc_saly_nm;
	public String etc_saly_cd;
	public String budg_cd;
	public String fisc_dt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String emp_no;
	public String flnm;
	public String dr_amt;
	public String crdt_amt_1;
	public String crdt_amt_2;
	public String cal_pay_amt;
	public String emp_amt;
	public String np_amt;
	public String hlth_amt;

	public HD_LVCMPY_2000_LCURLISTRecord(){}

	public void setEtc_saly_nm(String etc_saly_nm){
		this.etc_saly_nm = etc_saly_nm;
	}

	public void setEtc_saly_cd(String etc_saly_cd){
		this.etc_saly_cd = etc_saly_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt_1(String crdt_amt_1){
		this.crdt_amt_1 = crdt_amt_1;
	}

	public void setCrdt_amt_2(String crdt_amt_2){
		this.crdt_amt_2 = crdt_amt_2;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setEmp_amt(String emp_amt){
		this.emp_amt = emp_amt;
	}

	public void setNp_amt(String np_amt){
		this.np_amt = np_amt;
	}

	public void setHlth_amt(String hlth_amt){
		this.hlth_amt = hlth_amt;
	}

	public String getEtc_saly_nm(){
		return this.etc_saly_nm;
	}

	public String getEtc_saly_cd(){
		return this.etc_saly_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt_1(){
		return this.crdt_amt_1;
	}

	public String getCrdt_amt_2(){
		return this.crdt_amt_2;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getEmp_amt(){
		return this.emp_amt;
	}

	public String getNp_amt(){
		return this.np_amt;
	}

	public String getHlth_amt(){
		return this.hlth_amt;
	}
}

/* 작성시간 : Wed Apr 04 17:38:27 KST 2012 */