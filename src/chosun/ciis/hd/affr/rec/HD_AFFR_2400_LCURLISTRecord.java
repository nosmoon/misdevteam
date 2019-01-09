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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String chk_dt;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dty_nm;
	public String posi_nm;
	public String dept_nm;
	public String prn;
	public String chk_obj_pers_rshp;
	public String chk_pers_nm;
	public String chk_hosp_nm;
	public String real_chk_fee;
	public String sply_chk_fee;
	public String ocom_subm_yn;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;
	public String self_prn;

	public HD_AFFR_2400_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setChk_obj_pers_rshp(String chk_obj_pers_rshp){
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
	}

	public void setChk_pers_nm(String chk_pers_nm){
		this.chk_pers_nm = chk_pers_nm;
	}

	public void setChk_hosp_nm(String chk_hosp_nm){
		this.chk_hosp_nm = chk_hosp_nm;
	}

	public void setReal_chk_fee(String real_chk_fee){
		this.real_chk_fee = real_chk_fee;
	}

	public void setSply_chk_fee(String sply_chk_fee){
		this.sply_chk_fee = sply_chk_fee;
	}

	public void setOcom_subm_yn(String ocom_subm_yn){
		this.ocom_subm_yn = ocom_subm_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSelf_prn(String self_prn){
		this.self_prn = self_prn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getChk_obj_pers_rshp(){
		return this.chk_obj_pers_rshp;
	}

	public String getChk_pers_nm(){
		return this.chk_pers_nm;
	}

	public String getChk_hosp_nm(){
		return this.chk_hosp_nm;
	}

	public String getReal_chk_fee(){
		return this.real_chk_fee;
	}

	public String getSply_chk_fee(){
		return this.sply_chk_fee;
	}

	public String getOcom_subm_yn(){
		return this.ocom_subm_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSelf_prn(){
		return this.self_prn;
	}
}

/* 작성시간 : Wed Mar 28 16:53:28 KST 2012 */