/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :   
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2431_LIMPT_EXPNLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String titl;
	public String reso_amt;
	public String adpay_amt;
	public String incmg_emp_no;
	public String incmg_emp_nm;
	public String chrg_emp_no;
	public String chrg_emp_nm;
	public String expn_clsf;
	public String impt_expn_clsf;
	public String slip_aprv_yn;
	public String pg_mid;
	public String slipprocstat;

	public FC_ACCT_2431_LIMPT_EXPNLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIncmg_emp_nm(String incmg_emp_nm){
		this.incmg_emp_nm = incmg_emp_nm;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setChrg_emp_nm(String chrg_emp_nm){
		this.chrg_emp_nm = chrg_emp_nm;
	}

	public void setExpn_clsf(String expn_clsf){
		this.expn_clsf = expn_clsf;
	}

	public void setImpt_expn_clsf(String impt_expn_clsf){
		this.impt_expn_clsf = impt_expn_clsf;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setPg_mid(String pg_mid){
		this.pg_mid = pg_mid;
	}

	public void setSlipprocstat(String slipprocstat){
		this.slipprocstat = slipprocstat;
	}

	public String getSlip_no(){
		return this.slip_no;
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

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIncmg_emp_nm(){
		return this.incmg_emp_nm;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getChrg_emp_nm(){
		return this.chrg_emp_nm;
	}

	public String getExpn_clsf(){
		return this.expn_clsf;
	}

	public String getImpt_expn_clsf(){
		return this.impt_expn_clsf;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getPg_mid(){
		return this.pg_mid;
	}

	public String getSlipprocstat(){
		return this.slipprocstat;
	}
}

/* 작성시간 : Wed Feb 18 17:50:51 KST 2009 */