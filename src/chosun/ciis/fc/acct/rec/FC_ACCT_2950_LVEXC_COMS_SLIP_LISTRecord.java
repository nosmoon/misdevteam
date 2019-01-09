/***************************************************************************************************
* 파일명 : FC_ACCT_2950_L.java
* 기능 :   대행수수료전표등록 조회
* 작성일자 :
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
 * 대행수수료전표등록 조회
 */

public class FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_dt;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip_no;
	public String vexc_cmpy_cd;
	public String suply_amt;
	public String vat_amt;
	public String acct_no;
	public String vexc_cmpy_nm;
	public String medi_nm;
	public String medi_cd;

	public FC_ACCT_2950_LVEXC_COMS_SLIP_LISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setVexc_cmpy_nm(String vexc_cmpy_nm){
		this.vexc_cmpy_nm = vexc_cmpy_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getVexc_cmpy_nm(){
		return this.vexc_cmpy_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
}

/* 작성시간 : Thu May 28 16:03:07 KST 2009 */