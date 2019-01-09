/***************************************************************************************************
* 파일명 : .java
* 기능 : 발송관리 - 발송비청구
* 작성일자 : 2009-11-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_dt;
	public String reg_seq;
	public String ptcr_seq;
	public String route_clsf;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String prt_plac_cd;
	public String tran_uprc_clas;
	public String medi_cd;
	public String sect_cd;
	public String tran_cmpy_cd;
	public String tran_cmpy_nm;
	public String std_tran_uprc;
	public String pay_tran_uprc;
	public String dlco_no;
	public String dlco_clsf;
	public String pay_mthd_clsf;
	public String stmt_clsf;
	public String stmt_no;
	public String elec_stmt_yn;
	public String elec_stmt_id;
	public String stmt_id;
	public String rcpt_clsf;
	public String stmt_dt;
	public String work_dds;
	public String pay_tran_cost;
	public String vat;
	public String eps_no;
	public String acct_no;
	public String zip;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String car_no;
	public String bank_cd;
	public String sect_nm;
	public String remk;
	public String grp_assctn_yn;

	public SE_SND_2520_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setPtcr_seq(String ptcr_seq){
		this.ptcr_seq = ptcr_seq;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setStd_tran_uprc(String std_tran_uprc){
		this.std_tran_uprc = std_tran_uprc;
	}

	public void setPay_tran_uprc(String pay_tran_uprc){
		this.pay_tran_uprc = pay_tran_uprc;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setPay_mthd_clsf(String pay_mthd_clsf){
		this.pay_mthd_clsf = pay_mthd_clsf;
	}

	public void setStmt_clsf(String stmt_clsf){
		this.stmt_clsf = stmt_clsf;
	}

	public void setStmt_no(String stmt_no){
		this.stmt_no = stmt_no;
	}

	public void setElec_stmt_yn(String elec_stmt_yn){
		this.elec_stmt_yn = elec_stmt_yn;
	}

	public void setElec_stmt_id(String elec_stmt_id){
		this.elec_stmt_id = elec_stmt_id;
	}

	public void setStmt_id(String stmt_id){
		this.stmt_id = stmt_id;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setStmt_dt(String stmt_dt){
		this.stmt_dt = stmt_dt;
	}

	public void setWork_dds(String work_dds){
		this.work_dds = work_dds;
	}

	public void setPay_tran_cost(String pay_tran_cost){
		this.pay_tran_cost = pay_tran_cost;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGrp_assctn_yn(String grp_assctn_yn){
		this.grp_assctn_yn = grp_assctn_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getPtcr_seq(){
		return this.ptcr_seq;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getStd_tran_uprc(){
		return this.std_tran_uprc;
	}

	public String getPay_tran_uprc(){
		return this.pay_tran_uprc;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getPay_mthd_clsf(){
		return this.pay_mthd_clsf;
	}

	public String getStmt_clsf(){
		return this.stmt_clsf;
	}

	public String getStmt_no(){
		return this.stmt_no;
	}

	public String getElec_stmt_yn(){
		return this.elec_stmt_yn;
	}

	public String getElec_stmt_id(){
		return this.elec_stmt_id;
	}

	public String getStmt_id(){
		return this.stmt_id;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getStmt_dt(){
		return this.stmt_dt;
	}

	public String getWork_dds(){
		return this.work_dds;
	}

	public String getPay_tran_cost(){
		return this.pay_tran_cost;
	}

	public String getVat(){
		return this.vat;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGrp_assctn_yn(){
		return this.grp_assctn_yn;
	}
}

/* 작성시간 : Wed Nov 11 17:52:54 KST 2009 */