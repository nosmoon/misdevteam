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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String cntr_seq;
	public String cntr_dt;
	public String dlco_nm;
	public String cntr_type;
	public String slcrg_pers;
	public String slcrg_opn;
	public String mchrg_pers;
	public String mchrg_opn;
	public String presi_nm;
	public String colt_amt;
	public String mm_avg_pubc_amt;
	public String colt_ratio;
	public String avg_due_dd;
	public String taem_chf_opn;
	public String main_dlco_nm;
	public String chg_dt;

	public AD_BAS_1210_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_opn(String slcrg_opn){
		this.slcrg_opn = slcrg_opn;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_opn(String mchrg_opn){
		this.mchrg_opn = mchrg_opn;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setColt_amt(String colt_amt){
		this.colt_amt = colt_amt;
	}

	public void setMm_avg_pubc_amt(String mm_avg_pubc_amt){
		this.mm_avg_pubc_amt = mm_avg_pubc_amt;
	}

	public void setColt_ratio(String colt_ratio){
		this.colt_ratio = colt_ratio;
	}

	public void setAvg_due_dd(String avg_due_dd){
		this.avg_due_dd = avg_due_dd;
	}

	public void setTaem_chf_opn(String taem_chf_opn){
		this.taem_chf_opn = taem_chf_opn;
	}

	public void setMain_dlco_nm(String main_dlco_nm){
		this.main_dlco_nm = main_dlco_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_opn(){
		return this.slcrg_opn;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_opn(){
		return this.mchrg_opn;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getColt_amt(){
		return this.colt_amt;
	}

	public String getMm_avg_pubc_amt(){
		return this.mm_avg_pubc_amt;
	}

	public String getColt_ratio(){
		return this.colt_ratio;
	}

	public String getAvg_due_dd(){
		return this.avg_due_dd;
	}

	public String getTaem_chf_opn(){
		return this.taem_chf_opn;
	}

	public String getMain_dlco_nm(){
		return this.main_dlco_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}
}

/* 작성시간 : Mon Dec 10 10:54:13 KST 2012 */