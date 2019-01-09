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


package chosun.ciis.co.semuro.rec;

import java.sql.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;

/**
 * 
 */


public class CO_SEMURO_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String semuro_no;
	public String tax_stmt_clsf;
	public String rmsg_pers_semuro_id;
	public String send_pers_id;
	public String send_pers_eps_no;
	public String send_pers_presi_flnm;
	public String send_pers_firmnm;
	public String send_pers_addr;
	public String send_pers_bizcond;
	public String send_pers_indt;
	public String send_pers_email;
	public String issu_dt;
	public String tot_suply_amt;
	public String tot_amt;
	public String tot_tax_amt;
	public String cash;
	public String note;
	public String chqe;
	public String trust_unrcp_amt;
	public String rcpt_clam_yn;
	public String stat_clsf;
	public String stat_clsf_dt_tm;
	public String get_yn;

	public CO_SEMURO_1400_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setTax_stmt_clsf(String tax_stmt_clsf){
		this.tax_stmt_clsf = tax_stmt_clsf;
	}

	public void setRmsg_pers_semuro_id(String rmsg_pers_semuro_id){
		this.rmsg_pers_semuro_id = rmsg_pers_semuro_id;
	}

	public void setSend_pers_id(String send_pers_id){
		this.send_pers_id = send_pers_id;
	}

	public void setSend_pers_eps_no(String send_pers_eps_no){
		this.send_pers_eps_no = send_pers_eps_no;
	}

	public void setSend_pers_presi_flnm(String send_pers_presi_flnm){
		this.send_pers_presi_flnm = send_pers_presi_flnm;
	}

	public void setSend_pers_firmnm(String send_pers_firmnm){
		this.send_pers_firmnm = send_pers_firmnm;
	}

	public void setSend_pers_addr(String send_pers_addr){
		this.send_pers_addr = send_pers_addr;
	}

	public void setSend_pers_bizcond(String send_pers_bizcond){
		this.send_pers_bizcond = send_pers_bizcond;
	}

	public void setSend_pers_indt(String send_pers_indt){
		this.send_pers_indt = send_pers_indt;
	}

	public void setSend_pers_email(String send_pers_email){
		this.send_pers_email = send_pers_email;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTot_tax_amt(String tot_tax_amt){
		this.tot_tax_amt = tot_tax_amt;
	}

	public void setCash(String cash){
		this.cash = cash;
	}

	public void setNote(String note){
		this.note = note;
	}

	public void setChqe(String chqe){
		this.chqe = chqe;
	}

	public void setTrust_unrcp_amt(String trust_unrcp_amt){
		this.trust_unrcp_amt = trust_unrcp_amt;
	}

	public void setRcpt_clam_yn(String rcpt_clam_yn){
		this.rcpt_clam_yn = rcpt_clam_yn;
	}

	public void setStat_clsf(String stat_clsf){
		this.stat_clsf = stat_clsf;
	}

	public void setStat_clsf_dt_tm(String stat_clsf_dt_tm){
		this.stat_clsf_dt_tm = stat_clsf_dt_tm;
	}
	
	public void setGet_yn(String get_yn){
		this.get_yn = get_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getTax_stmt_clsf(){
		return this.tax_stmt_clsf;
	}

	public String getRmsg_pers_semuro_id(){
		return this.rmsg_pers_semuro_id;
	}

	public String getSend_pers_id(){
		return this.send_pers_id;
	}

	public String getSend_pers_eps_no(){
		return this.send_pers_eps_no;
	}

	public String getSend_pers_presi_flnm(){
		return this.send_pers_presi_flnm;
	}

	public String getSend_pers_firmnm(){
		return this.send_pers_firmnm;
	}

	public String getSend_pers_addr(){
		return this.send_pers_addr;
	}

	public String getSend_pers_bizcond(){
		return this.send_pers_bizcond;
	}

	public String getSend_pers_indt(){
		return this.send_pers_indt;
	}

	public String getSend_pers_email(){
		return this.send_pers_email;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTot_tax_amt(){
		return this.tot_tax_amt;
	}

	public String getCash(){
		return this.cash;
	}

	public String getNote(){
		return this.note;
	}

	public String getChqe(){
		return this.chqe;
	}

	public String getTrust_unrcp_amt(){
		return this.trust_unrcp_amt;
	}

	public String getRcpt_clam_yn(){
		return this.rcpt_clam_yn;
	}

	public String getStat_clsf(){
		return this.stat_clsf;
	}

	public String getStat_clsf_dt_tm(){
		return this.stat_clsf_dt_tm;
	}
	
	public String getGet_yn(){
		return this.get_yn;
	}
}

/* 작성시간 : Thu Jul 16 10:17:36 KST 2009 */