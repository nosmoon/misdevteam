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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String faml_seq;
	public String hospz_med_exam_pers_flnm;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String real_ward_fee;
	public String sply_ward_fee;
	public String real_hospz_med_exam_fee;
	public String sply_hospz_med_exam_fee;
	public String hospz_med_exam_frdt;
	public String hospz_med_exam_todt;
	public String hospz_med_exam_dds;
	public String disea_cont;
	public String hospz_med_exam_hosp_nm;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;

	public HD_AFFR_2700_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setHospz_med_exam_pers_flnm(String hospz_med_exam_pers_flnm){
		this.hospz_med_exam_pers_flnm = hospz_med_exam_pers_flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setReal_ward_fee(String real_ward_fee){
		this.real_ward_fee = real_ward_fee;
	}

	public void setSply_ward_fee(String sply_ward_fee){
		this.sply_ward_fee = sply_ward_fee;
	}

	public void setReal_hospz_med_exam_fee(String real_hospz_med_exam_fee){
		this.real_hospz_med_exam_fee = real_hospz_med_exam_fee;
	}

	public void setSply_hospz_med_exam_fee(String sply_hospz_med_exam_fee){
		this.sply_hospz_med_exam_fee = sply_hospz_med_exam_fee;
	}

	public void setHospz_med_exam_frdt(String hospz_med_exam_frdt){
		this.hospz_med_exam_frdt = hospz_med_exam_frdt;
	}

	public void setHospz_med_exam_todt(String hospz_med_exam_todt){
		this.hospz_med_exam_todt = hospz_med_exam_todt;
	}

	public void setHospz_med_exam_dds(String hospz_med_exam_dds){
		this.hospz_med_exam_dds = hospz_med_exam_dds;
	}

	public void setDisea_cont(String disea_cont){
		this.disea_cont = disea_cont;
	}

	public void setHospz_med_exam_hosp_nm(String hospz_med_exam_hosp_nm){
		this.hospz_med_exam_hosp_nm = hospz_med_exam_hosp_nm;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
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

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getHospz_med_exam_pers_flnm(){
		return this.hospz_med_exam_pers_flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getReal_ward_fee(){
		return this.real_ward_fee;
	}

	public String getSply_ward_fee(){
		return this.sply_ward_fee;
	}

	public String getReal_hospz_med_exam_fee(){
		return this.real_hospz_med_exam_fee;
	}

	public String getSply_hospz_med_exam_fee(){
		return this.sply_hospz_med_exam_fee;
	}

	public String getHospz_med_exam_frdt(){
		return this.hospz_med_exam_frdt;
	}

	public String getHospz_med_exam_todt(){
		return this.hospz_med_exam_todt;
	}

	public String getHospz_med_exam_dds(){
		return this.hospz_med_exam_dds;
	}

	public String getDisea_cont(){
		return this.disea_cont;
	}

	public String getHospz_med_exam_hosp_nm(){
		return this.hospz_med_exam_hosp_nm;
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
}

/* 작성시간 : Wed Dec 18 14:54:25 KST 2013 */