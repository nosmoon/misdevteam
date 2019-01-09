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


package chosun.ciis.mt.papmeda.rec;

import java.sql.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

/**
 * 
 */


public class MT_PAPMEDA_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String papcmpy_cd;
	public String eps_no;
	public String fac_clsf;
	public String medi_cd;
	public String cnsm_wgt;
	public String basi_amt;
	public String hdqt_paper_uprc;
	public String hdqt_amt;
	public String meda_amt;
	public String meda_vat;
	public String meda_dt;
	public String slip_proc_seq;
	public String tax_stmt_seq;
	public String slip_clsf_cd;
	public String slip_proc_occr_dt;
	public String occr_dt;
	public String seq;

	public MT_PAPMEDA_1102_LCURLISTRecord(){}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setCnsm_wgt(String cnsm_wgt){
		this.cnsm_wgt = cnsm_wgt;
	}

	public void setBasi_amt(String basi_amt){
		this.basi_amt = basi_amt;
	}

	public void setHdqt_paper_uprc(String hdqt_paper_uprc){
		this.hdqt_paper_uprc = hdqt_paper_uprc;
	}

	public void setHdqt_amt(String hdqt_amt){
		this.hdqt_amt = hdqt_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setMeda_vat(String meda_vat){
		this.meda_vat = meda_vat;
	}

	public void setMeda_dt(String meda_dt){
		this.meda_dt = meda_dt;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getCnsm_wgt(){
		return this.cnsm_wgt;
	}

	public String getBasi_amt(){
		return this.basi_amt;
	}

	public String getHdqt_paper_uprc(){
		return this.hdqt_paper_uprc;
	}

	public String getHdqt_amt(){
		return this.hdqt_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getMeda_vat(){
		return this.meda_vat;
	}

	public String getMeda_dt(){
		return this.meda_dt;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Fri Sep 04 14:20:42 KST 2009 */