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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String dept_cd;
	public String dept_nm;
	public String leas_obj_good_yn;
	public String leas_bldg_cd;
	public String leas_ern_no;
	public String leas_dlco_ern_nm;
	public String leas_ref_aset_no;
	public String leas_ref_aset_nm;
	public String acqr_dt;
	public String sale_dt;
	public String aset_qunt_cnt;
	public String aset_usag;
	public String aset_loca;
	public String incmg_dt_tm;
	public String incmg_pers_nm;
	public String cmpy_cd;

	public AS_LEAS_1001_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setLeas_obj_good_yn(String leas_obj_good_yn){
		this.leas_obj_good_yn = leas_obj_good_yn;
	}

	public void setLeas_bldg_cd(String leas_bldg_cd){
		this.leas_bldg_cd = leas_bldg_cd;
	}

	public void setLeas_ern_no(String leas_ern_no){
		this.leas_ern_no = leas_ern_no;
	}

	public void setLeas_dlco_ern_nm(String leas_dlco_ern_nm){
		this.leas_dlco_ern_nm = leas_dlco_ern_nm;
	}

	public void setLeas_ref_aset_no(String leas_ref_aset_no){
		this.leas_ref_aset_no = leas_ref_aset_no;
	}

	public void setLeas_ref_aset_nm(String leas_ref_aset_nm){
		this.leas_ref_aset_nm = leas_ref_aset_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getLeas_obj_good_yn(){
		return this.leas_obj_good_yn;
	}

	public String getLeas_bldg_cd(){
		return this.leas_bldg_cd;
	}

	public String getLeas_ern_no(){
		return this.leas_ern_no;
	}

	public String getLeas_dlco_ern_nm(){
		return this.leas_dlco_ern_nm;
	}

	public String getLeas_ref_aset_no(){
		return this.leas_ref_aset_no;
	}

	public String getLeas_ref_aset_nm(){
		return this.leas_ref_aset_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
}

/* 작성시간 : Thu May 07 10:54:36 KST 2009 */