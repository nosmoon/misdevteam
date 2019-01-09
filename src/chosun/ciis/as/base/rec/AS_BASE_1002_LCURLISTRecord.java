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


package chosun.ciis.as.base.rec;

import java.sql.*;
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.ds.*;

/**
 * 
 */


public class AS_BASE_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String item_cd;
	public String item_nm;
	public String aset_cnt;
	public String unit_cd;
	public String unit_nm;
	public String redm_clsf;
	public String redm_clsf_nm;
	public String redm_mthd_cd;
	public String redm_mthd_cd_nm;
	public int svc_yys_cnt;
	public String accd_cd;
	public String budg_cd;
	public String budg_cd_nm;
	public String use_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String nm_korn;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public AS_BASE_1002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setAset_cnt(String aset_cnt){
		this.aset_cnt = aset_cnt;
	}

	public void setUnit_cd(String unit_cd){
		this.unit_cd = unit_cd;
	}

	public void setUnit_nm(String unit_nm){
		this.unit_nm = unit_nm;
	}

	public void setRedm_clsf(String redm_clsf){
		this.redm_clsf = redm_clsf;
	}

	public void setRedm_clsf_nm(String redm_clsf_nm){
		this.redm_clsf_nm = redm_clsf_nm;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setRedm_mthd_cd_nm(String redm_mthd_cd_nm){
		this.redm_mthd_cd_nm = redm_mthd_cd_nm;
	}

	public void setSvc_yys_cnt(int svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setAccd_cd(String accd_cd){
		this.accd_cd = accd_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getAset_cnt(){
		return this.aset_cnt;
	}

	public String getUnit_cd(){
		return this.unit_cd;
	}

	public String getUnit_nm(){
		return this.unit_nm;
	}

	public String getRedm_clsf(){
		return this.redm_clsf;
	}

	public String getRedm_clsf_nm(){
		return this.redm_clsf_nm;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getRedm_mthd_cd_nm(){
		return this.redm_mthd_cd_nm;
	}

	public int getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getAccd_cd(){
		return this.accd_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cd_nm(){
		return this.budg_cd_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Thu Feb 19 20:00:59 KST 2009 */