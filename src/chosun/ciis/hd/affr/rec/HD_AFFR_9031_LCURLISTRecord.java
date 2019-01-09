/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_yy;
	public String basi_no;
	public String seq;
	public String otn_mgng_cd;
	public String outside_flnm;
	public String outside_clsf_cd;
	public String outside_clsf_nm;
	public String journal_cd;
	public String journal_nm;
	public String outside_tel_no;
	public String zipcode;
	public String addr;
	public String prvmm_qty;
	public String qty;
	public String icdc_qty;
	public String remk;
	public String clos_yn;
	public String clos_nm;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public HD_AFFR_9031_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_no(String basi_no){
		this.basi_no = basi_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOtn_mgng_cd(String otn_mgng_cd){
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public void setOutside_flnm(String outside_flnm){
		this.outside_flnm = outside_flnm;
	}

	public void setOutside_clsf_cd(String outside_clsf_cd){
		this.outside_clsf_cd = outside_clsf_cd;
	}

	public void setOutside_clsf_nm(String outside_clsf_nm){
		this.outside_clsf_nm = outside_clsf_nm;
	}

	public void setJournal_cd(String journal_cd){
		this.journal_cd = journal_cd;
	}

	public void setJournal_nm(String journal_nm){
		this.journal_nm = journal_nm;
	}

	public void setOutside_tel_no(String outside_tel_no){
		this.outside_tel_no = outside_tel_no;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPrvmm_qty(String prvmm_qty){
		this.prvmm_qty = prvmm_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_nm(String clos_nm){
		this.clos_nm = clos_nm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_no(){
		return this.basi_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOtn_mgng_cd(){
		return this.otn_mgng_cd;
	}

	public String getOutside_flnm(){
		return this.outside_flnm;
	}

	public String getOutside_clsf_cd(){
		return this.outside_clsf_cd;
	}

	public String getOutside_clsf_nm(){
		return this.outside_clsf_nm;
	}

	public String getJournal_cd(){
		return this.journal_cd;
	}

	public String getJournal_nm(){
		return this.journal_nm;
	}

	public String getOutside_tel_no(){
		return this.outside_tel_no;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPrvmm_qty(){
		return this.prvmm_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_nm(){
		return this.clos_nm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
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

/* 작성시간 : Fri Aug 12 19:02:04 KST 2016 */