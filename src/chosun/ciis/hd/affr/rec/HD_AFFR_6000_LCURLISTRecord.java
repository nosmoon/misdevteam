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


public class HD_AFFR_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String certi_clsf;
	public String prn;
	public String prn_cnt;
	public String certi_clsf_name;
	public String issu_clsf_name;
	public String dty_name;
	public String posi_name;
	public String dty_cd;
	public String posi_cd;
	public String in_cmpy_dt;
	public String now_dt;
	public String occr_dt;
	public String seq;
	public String aplc_dt;
	public String aplc_seq;
	public String issu_num_shet;
	public String usag;
	public String remk;
	public String cntc_plac;
	public String email;
	public String engl_flnm;
	public String issu_clsf;
	public String dirc_incmg_posi;
	public String chce_posi_clsf;
	public String busi_trip_purp;
	public String busi_trip_area;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String engl_bidt;
	public String engl_dept_posi;
	public String engl_in_cmpy_dt;
	public String engl_now_dt;
	public String engl_busi_trip_purp;
	public String engl_busi_trip_area;
	public String engl_busi_trip_frdt;
	public String engl_busi_trip_todt;
	public String issu_dt;
	public String issu_no;

	public HD_AFFR_6000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPrn_cnt(String prn_cnt){
		this.prn_cnt = prn_cnt;
	}

	public void setCerti_clsf_name(String certi_clsf_name){
		this.certi_clsf_name = certi_clsf_name;
	}

	public void setIssu_clsf_name(String issu_clsf_name){
		this.issu_clsf_name = issu_clsf_name;
	}

	public void setDty_name(String dty_name){
		this.dty_name = dty_name;
	}

	public void setPosi_name(String posi_name){
		this.posi_name = posi_name;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setNow_dt(String now_dt){
		this.now_dt = now_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAplc_seq(String aplc_seq){
		this.aplc_seq = aplc_seq;
	}

	public void setIssu_num_shet(String issu_num_shet){
		this.issu_num_shet = issu_num_shet;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setEngl_flnm(String engl_flnm){
		this.engl_flnm = engl_flnm;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setDirc_incmg_posi(String dirc_incmg_posi){
		this.dirc_incmg_posi = dirc_incmg_posi;
	}

	public void setChce_posi_clsf(String chce_posi_clsf){
		this.chce_posi_clsf = chce_posi_clsf;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setBusi_trip_area(String busi_trip_area){
		this.busi_trip_area = busi_trip_area;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setEngl_bidt(String engl_bidt){
		this.engl_bidt = engl_bidt;
	}

	public void setEngl_dept_posi(String engl_dept_posi){
		this.engl_dept_posi = engl_dept_posi;
	}

	public void setEngl_in_cmpy_dt(String engl_in_cmpy_dt){
		this.engl_in_cmpy_dt = engl_in_cmpy_dt;
	}

	public void setEngl_now_dt(String engl_now_dt){
		this.engl_now_dt = engl_now_dt;
	}

	public void setEngl_busi_trip_purp(String engl_busi_trip_purp){
		this.engl_busi_trip_purp = engl_busi_trip_purp;
	}

	public void setEngl_busi_trip_area(String engl_busi_trip_area){
		this.engl_busi_trip_area = engl_busi_trip_area;
	}

	public void setEngl_busi_trip_frdt(String engl_busi_trip_frdt){
		this.engl_busi_trip_frdt = engl_busi_trip_frdt;
	}

	public void setEngl_busi_trip_todt(String engl_busi_trip_todt){
		this.engl_busi_trip_todt = engl_busi_trip_todt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_no(String issu_no){
		this.issu_no = issu_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPrn_cnt(){
		return this.prn_cnt;
	}

	public String getCerti_clsf_name(){
		return this.certi_clsf_name;
	}

	public String getIssu_clsf_name(){
		return this.issu_clsf_name;
	}

	public String getDty_name(){
		return this.dty_name;
	}

	public String getPosi_name(){
		return this.posi_name;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getNow_dt(){
		return this.now_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAplc_seq(){
		return this.aplc_seq;
	}

	public String getIssu_num_shet(){
		return this.issu_num_shet;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getEmail(){
		return this.email;
	}

	public String getEngl_flnm(){
		return this.engl_flnm;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getDirc_incmg_posi(){
		return this.dirc_incmg_posi;
	}

	public String getChce_posi_clsf(){
		return this.chce_posi_clsf;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getBusi_trip_area(){
		return this.busi_trip_area;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getEngl_bidt(){
		return this.engl_bidt;
	}

	public String getEngl_dept_posi(){
		return this.engl_dept_posi;
	}

	public String getEngl_in_cmpy_dt(){
		return this.engl_in_cmpy_dt;
	}

	public String getEngl_now_dt(){
		return this.engl_now_dt;
	}

	public String getEngl_busi_trip_purp(){
		return this.engl_busi_trip_purp;
	}

	public String getEngl_busi_trip_area(){
		return this.engl_busi_trip_area;
	}

	public String getEngl_busi_trip_frdt(){
		return this.engl_busi_trip_frdt;
	}

	public String getEngl_busi_trip_todt(){
		return this.engl_busi_trip_todt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_no(){
		return this.issu_no;
	}
}

/* 작성시간 : Mon Dec 07 13:35:28 KST 2009 */