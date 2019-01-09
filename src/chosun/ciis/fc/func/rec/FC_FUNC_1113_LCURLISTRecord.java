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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1113_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpay_dt;
	public String rcpay_amt;
	public String dr_budg_cd;
	public String deps_clsf_cd;
	public String deps_dt;
	public String trsfnd_slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_no;
	public String extnc_ptcr;
	public String trsfnd_slip_clsf;

	public FC_FUNC_1113_LCURLISTRecord(){}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setDr_budg_cd(String dr_budg_cd){
		this.dr_budg_cd = dr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setDeps_dt(String deps_dt){
		this.deps_dt = deps_dt;
	}

	public void setTrsfnd_slip_no(String trsfnd_slip_no){
		this.trsfnd_slip_no = trsfnd_slip_no;
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

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setExtnc_ptcr(String extnc_ptcr){
		this.extnc_ptcr = extnc_ptcr;
	}

	public void setTrsfnd_slip_clsf(String trsfnd_slip_clsf){
		this.trsfnd_slip_clsf = trsfnd_slip_clsf;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getDr_budg_cd(){
		return this.dr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getDeps_dt(){
		return this.deps_dt;
	}

	public String getTrsfnd_slip_no(){
		return this.trsfnd_slip_no;
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

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getExtnc_ptcr(){
		return this.extnc_ptcr;
	}

	public String getTrsfnd_slip_clsf(){
		return this.trsfnd_slip_clsf;
	}
}

/* 작성시간 : Thu Feb 26 14:11:39 KST 2009 */