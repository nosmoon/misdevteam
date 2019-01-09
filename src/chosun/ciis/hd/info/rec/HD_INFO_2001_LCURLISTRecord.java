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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String psgp_cd;
	public String psgp_nm;
	public String intern_desty;
	public String flnm;
	public String prn;
	public String tel_no;
	public String univ_nm;
	public String majr_nm;
	public String univ_enty_yy;
	public String engl_test_nm;
	public String engl_test_scor;
	public String hby;
	public String spc;
	public String acty_dept;
	public String dept_nm;
	public String acty_frdt;
	public String acty_todt;
	public String acty_complt_yn;
	public String carr_matt_1;
	public String carr_matt_1_frdt;
	public String carr_matt_1_todt;
	public String carr_matt_1_instt;
	public String carr_matt_2;
	public String carr_matt_2_frdt;
	public String carr_matt_2_todt;
	public String carr_matt_2_instt;
	public String carr_matt_3;
	public String carr_matt_3_frdt;
	public String carr_matt_3_todt;
	public String carr_matt_3_instt;
	public String blng_dpthd_emp_no;
	public String blng_dpthd_evlu_idea;
	public String etc;
	public String birth;

	public HD_INFO_2001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPsgp_cd(String psgp_cd){
		this.psgp_cd = psgp_cd;
	}

	public void setPsgp_nm(String psgp_nm){
		this.psgp_nm = psgp_nm;
	}

	public void setIntern_desty(String intern_desty){
		this.intern_desty = intern_desty;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setUniv_nm(String univ_nm){
		this.univ_nm = univ_nm;
	}

	public void setMajr_nm(String majr_nm){
		this.majr_nm = majr_nm;
	}

	public void setUniv_enty_yy(String univ_enty_yy){
		this.univ_enty_yy = univ_enty_yy;
	}

	public void setEngl_test_nm(String engl_test_nm){
		this.engl_test_nm = engl_test_nm;
	}

	public void setEngl_test_scor(String engl_test_scor){
		this.engl_test_scor = engl_test_scor;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setSpc(String spc){
		this.spc = spc;
	}

	public void setActy_dept(String acty_dept){
		this.acty_dept = acty_dept;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setActy_frdt(String acty_frdt){
		this.acty_frdt = acty_frdt;
	}

	public void setActy_todt(String acty_todt){
		this.acty_todt = acty_todt;
	}

	public void setActy_complt_yn(String acty_complt_yn){
		this.acty_complt_yn = acty_complt_yn;
	}

	public void setCarr_matt_1(String carr_matt_1){
		this.carr_matt_1 = carr_matt_1;
	}

	public void setCarr_matt_1_frdt(String carr_matt_1_frdt){
		this.carr_matt_1_frdt = carr_matt_1_frdt;
	}

	public void setCarr_matt_1_todt(String carr_matt_1_todt){
		this.carr_matt_1_todt = carr_matt_1_todt;
	}

	public void setCarr_matt_1_instt(String carr_matt_1_instt){
		this.carr_matt_1_instt = carr_matt_1_instt;
	}

	public void setCarr_matt_2(String carr_matt_2){
		this.carr_matt_2 = carr_matt_2;
	}

	public void setCarr_matt_2_frdt(String carr_matt_2_frdt){
		this.carr_matt_2_frdt = carr_matt_2_frdt;
	}

	public void setCarr_matt_2_todt(String carr_matt_2_todt){
		this.carr_matt_2_todt = carr_matt_2_todt;
	}

	public void setCarr_matt_2_instt(String carr_matt_2_instt){
		this.carr_matt_2_instt = carr_matt_2_instt;
	}

	public void setCarr_matt_3(String carr_matt_3){
		this.carr_matt_3 = carr_matt_3;
	}

	public void setCarr_matt_3_frdt(String carr_matt_3_frdt){
		this.carr_matt_3_frdt = carr_matt_3_frdt;
	}

	public void setCarr_matt_3_todt(String carr_matt_3_todt){
		this.carr_matt_3_todt = carr_matt_3_todt;
	}

	public void setCarr_matt_3_instt(String carr_matt_3_instt){
		this.carr_matt_3_instt = carr_matt_3_instt;
	}

	public void setBlng_dpthd_emp_no(String blng_dpthd_emp_no){
		this.blng_dpthd_emp_no = blng_dpthd_emp_no;
	}

	public void setBlng_dpthd_evlu_idea(String blng_dpthd_evlu_idea){
		this.blng_dpthd_evlu_idea = blng_dpthd_evlu_idea;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setBirth(String birth){
		this.birth = birth;
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

	public String getPsgp_cd(){
		return this.psgp_cd;
	}

	public String getPsgp_nm(){
		return this.psgp_nm;
	}

	public String getIntern_desty(){
		return this.intern_desty;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getUniv_nm(){
		return this.univ_nm;
	}

	public String getMajr_nm(){
		return this.majr_nm;
	}

	public String getUniv_enty_yy(){
		return this.univ_enty_yy;
	}

	public String getEngl_test_nm(){
		return this.engl_test_nm;
	}

	public String getEngl_test_scor(){
		return this.engl_test_scor;
	}

	public String getHby(){
		return this.hby;
	}

	public String getSpc(){
		return this.spc;
	}

	public String getActy_dept(){
		return this.acty_dept;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getActy_frdt(){
		return this.acty_frdt;
	}

	public String getActy_todt(){
		return this.acty_todt;
	}

	public String getActy_complt_yn(){
		return this.acty_complt_yn;
	}

	public String getCarr_matt_1(){
		return this.carr_matt_1;
	}

	public String getCarr_matt_1_frdt(){
		return this.carr_matt_1_frdt;
	}

	public String getCarr_matt_1_todt(){
		return this.carr_matt_1_todt;
	}

	public String getCarr_matt_1_instt(){
		return this.carr_matt_1_instt;
	}

	public String getCarr_matt_2(){
		return this.carr_matt_2;
	}

	public String getCarr_matt_2_frdt(){
		return this.carr_matt_2_frdt;
	}

	public String getCarr_matt_2_todt(){
		return this.carr_matt_2_todt;
	}

	public String getCarr_matt_2_instt(){
		return this.carr_matt_2_instt;
	}

	public String getCarr_matt_3(){
		return this.carr_matt_3;
	}

	public String getCarr_matt_3_frdt(){
		return this.carr_matt_3_frdt;
	}

	public String getCarr_matt_3_todt(){
		return this.carr_matt_3_todt;
	}

	public String getCarr_matt_3_instt(){
		return this.carr_matt_3_instt;
	}

	public String getBlng_dpthd_emp_no(){
		return this.blng_dpthd_emp_no;
	}

	public String getBlng_dpthd_evlu_idea(){
		return this.blng_dpthd_evlu_idea;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getBirth(){
		return this.birth;
	}
}

/* 작성시간 : Wed Jul 01 18:34:47 KST 2009 */