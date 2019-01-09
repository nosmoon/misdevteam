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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String ewh_dt;
	public String ern;
	public String dlco_cd;
	public String addr;
	public String dlco_nm;
	public String vat_amt;
	public String suply_amt;
	public String dlco_clsf_cd;
	public String purc_clsf;
	public String prof_type_cd;
	public String make_dt;
	public String purc_stmt_no;
	public String rcpt_prof_clsf;
	public String slip_no;
	public String impt_yy;
	public String impt_seq;
	public String leas_clsf;
	public String incmg_slip_dt;
	public String elec_tax_bill_yn;
	public String semuro_no;

	public MT_SUBMATRIN_1103_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setPurc_stmt_no(String purc_stmt_no){
		this.purc_stmt_no = purc_stmt_no;
	}

	public void setRcpt_prof_clsf(String rcpt_prof_clsf){
		this.rcpt_prof_clsf = rcpt_prof_clsf;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setImpt_yy(String impt_yy){
		this.impt_yy = impt_yy;
	}

	public void setImpt_seq(String impt_seq){
		this.impt_seq = impt_seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setIncmg_slip_dt(String incmg_slip_dt){
		this.incmg_slip_dt = incmg_slip_dt;
	}
	
	public void setElec_tax_bill_yn(String elec_tax_bill_yn){
		this.elec_tax_bill_yn = elec_tax_bill_yn;
	}
	
	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}
	
	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getPurc_stmt_no(){
		return this.purc_stmt_no;
	}

	public String getRcpt_prof_clsf(){
		return this.rcpt_prof_clsf;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getImpt_yy(){
		return this.impt_yy;
	}

	public String getImpt_seq(){
		return this.impt_seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getIncmg_slip_dt(){
		return this.incmg_slip_dt;
	}
	
	public String getElec_tax_bill_yn(){
		return this.elec_tax_bill_yn;
	}
	
	public String getSemuro_no(){
		return this.semuro_no;
	}
}

/* 작성시간 : Thu Aug 20 10:57:51 KST 2009 */