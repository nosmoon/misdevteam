/***************************************************************************************************
* 파일명 : .java
* 기능 :   고정자산 - 취득자산일괄조회
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.as.asrd.rec;

import java.sql.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 고정자산 - 취득자산일괄조회
 */

public class AS_ASRD_1302_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String item_cd;
	public String item_nm;
	public String buy_clsf;
	public String buy_clsf_nm;
	public String aset_stat;
	public String aset_stat_nm;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String cur_acqr_amt;
	public String sale_dt;
	public String sale_amt;
	public String dept_cd;
	public String dept_nm;
	public String dlco_ern;
	public String dlco_nm;
	public String bund_cd;
	public String bund_cd_nm;
	public String aset_size;
	public String aset_loca;
	public String aset_qunt_cnt;
	public String aset_qunt_cnt2;
	public String aset_usag;
	public String unit_cd;
	public String unit_nm;
	public String budg_cd;
	public String budg_nm;
	public String redm_clsf;
	public String redm_clsf_nm;
	public String redm_mthd_cd;
	public String redm_mthd_cd_nm;
	public String svc_yys_cnt;
	public String make_natn;
	public String make_cmpy;
	public String make_yymm;
	public String make_no;
	public String mang_no;
	public String remk;
	public String insr_type_cd;
	public String insr_type_nm;
	public String use_emp_no;
	public String use_emp_nm;
	public String use_cmpy_nm;
	public String use_dept_nm;

	public AS_ASRD_1302_LCURLIST1Record(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setBuy_clsf(String buy_clsf){
		this.buy_clsf = buy_clsf;
	}

	public void setBuy_clsf_nm(String buy_clsf_nm){
		this.buy_clsf_nm = buy_clsf_nm;
	}

	public void setAset_stat(String aset_stat){
		this.aset_stat = aset_stat;
	}

	public void setAset_stat_nm(String aset_stat_nm){
		this.aset_stat_nm = aset_stat_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setOrgin_acqr_amt(String orgin_acqr_amt){
		this.orgin_acqr_amt = orgin_acqr_amt;
	}

	public void setCur_acqr_amt(String cur_acqr_amt){
		this.cur_acqr_amt = cur_acqr_amt;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_cd_nm(String bund_cd_nm){
		this.bund_cd_nm = bund_cd_nm;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setAset_qunt_cnt2(String aset_qunt_cnt2){
		this.aset_qunt_cnt2 = aset_qunt_cnt2;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setUnit_cd(String unit_cd){
		this.unit_cd = unit_cd;
	}

	public void setUnit_nm(String unit_nm){
		this.unit_nm = unit_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
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

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setMake_natn(String make_natn){
		this.make_natn = make_natn;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setMake_yymm(String make_yymm){
		this.make_yymm = make_yymm;
	}

	public void setMake_no(String make_no){
		this.make_no = make_no;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setInsr_type_cd(String insr_type_cd){
		this.insr_type_cd = insr_type_cd;
	}

	public void setInsr_type_nm(String insr_type_nm){
		this.insr_type_nm = insr_type_nm;
	}

	public void setUse_emp_no(String use_emp_no){
		this.use_emp_no = use_emp_no;
	}

	public void setUse_emp_nm(String use_emp_nm){
		this.use_emp_nm = use_emp_nm;
	}

	public void setUse_cmpy_nm(String use_cmpy_nm){
		this.use_cmpy_nm = use_cmpy_nm;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getBuy_clsf(){
		return this.buy_clsf;
	}

	public String getBuy_clsf_nm(){
		return this.buy_clsf_nm;
	}

	public String getAset_stat(){
		return this.aset_stat;
	}

	public String getAset_stat_nm(){
		return this.aset_stat_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getOrgin_acqr_amt(){
		return this.orgin_acqr_amt;
	}

	public String getCur_acqr_amt(){
		return this.cur_acqr_amt;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_cd_nm(){
		return this.bund_cd_nm;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getAset_qunt_cnt2(){
		return this.aset_qunt_cnt2;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getUnit_cd(){
		return this.unit_cd;
	}

	public String getUnit_nm(){
		return this.unit_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
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

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getMake_natn(){
		return this.make_natn;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getMake_yymm(){
		return this.make_yymm;
	}

	public String getMake_no(){
		return this.make_no;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getInsr_type_cd(){
		return this.insr_type_cd;
	}

	public String getInsr_type_nm(){
		return this.insr_type_nm;
	}

	public String getUse_emp_no(){
		return this.use_emp_no;
	}

	public String getUse_emp_nm(){
		return this.use_emp_nm;
	}

	public String getUse_cmpy_nm(){
		return this.use_cmpy_nm;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}
}

/* 작성시간 : Mon Apr 17 19:08:41 KST 2017 */