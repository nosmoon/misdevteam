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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1003_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String aset_nm;
	public String item_nm;
	public String unit_cd;
	public String unit_nm;
	public String redm_clsf;
	public String redm_nm;
	public String redm_mthd_cd;
	public String redm_mthd_nm;
	public String svc_yys_cnt;
	public String budg_cd;
	public String budg_nm;
	public String buy_clsf;
	public String dept_cd;
	public String dept_nm;
	public String aset_stat;
	public String aset_stat_nm;
	public String acqr_dt;
	public String orgin_acqr_amt;
	public String vat_amt;
	public String cur_acqr_amt;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String dlco_nm;
	public String bund_cd;
	public String bund_nm;
	public String aset_size;
	public String aset_loca;
	public String aset_qunt_cnt;
	public String aset_usag;
	public String aset_grp_yn;
	public String phot_yn;
	public String sale_dt;
	public String sale_amt;
	public String redm_dt;
	public String cur_redm_agg_amt;
	public String tot_redm_amt;
	public String rem_amt;
	public String un_redm_amt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String eis_aset_clsf;
	public String insr_type_cd;
	public String use_emp_no;
	public String use_emp_nm;
	public String use_cmpy_nm;
	public String use_dept_nm;
	public String use_cmpy_cd;
	public String mst_remk;
	public String mst_chnl_clsf_cd;

	public AS_ASET_1003_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
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

	public void setRedm_nm(String redm_nm){
		this.redm_nm = redm_nm;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setRedm_mthd_nm(String redm_mthd_nm){
		this.redm_mthd_nm = redm_mthd_nm;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setBuy_clsf(String buy_clsf){
		this.buy_clsf = buy_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
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

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setCur_acqr_amt(String cur_acqr_amt){
		this.cur_acqr_amt = cur_acqr_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
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

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
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

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_grp_yn(String aset_grp_yn){
		this.aset_grp_yn = aset_grp_yn;
	}

	public void setPhot_yn(String phot_yn){
		this.phot_yn = phot_yn;
	}

	public void setSale_dt(String sale_dt){
		this.sale_dt = sale_dt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setRedm_dt(String redm_dt){
		this.redm_dt = redm_dt;
	}

	public void setCur_redm_agg_amt(String cur_redm_agg_amt){
		this.cur_redm_agg_amt = cur_redm_agg_amt;
	}

	public void setTot_redm_amt(String tot_redm_amt){
		this.tot_redm_amt = tot_redm_amt;
	}

	public void setRem_amt(String rem_amt){
		this.rem_amt = rem_amt;
	}

	public void setUn_redm_amt(String un_redm_amt){
		this.un_redm_amt = un_redm_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setEis_aset_clsf(String eis_aset_clsf){
		this.eis_aset_clsf = eis_aset_clsf;
	}

	public void setInsr_type_cd(String insr_type_cd){
		this.insr_type_cd = insr_type_cd;
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

	public void setUse_cmpy_cd(String use_cmpy_cd){
		this.use_cmpy_cd = use_cmpy_cd;
	}

	public void setMst_remk(String mst_remk){
		this.mst_remk = mst_remk;
	}

	public void setMst_chnl_clsf_cd(String mst_chnl_clsf_cd){
		this.mst_chnl_clsf_cd = mst_chnl_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getItem_nm(){
		return this.item_nm;
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

	public String getRedm_nm(){
		return this.redm_nm;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getRedm_mthd_nm(){
		return this.redm_mthd_nm;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getBuy_clsf(){
		return this.buy_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
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

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getCur_acqr_amt(){
		return this.cur_acqr_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
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

	public String getBund_nm(){
		return this.bund_nm;
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

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_grp_yn(){
		return this.aset_grp_yn;
	}

	public String getPhot_yn(){
		return this.phot_yn;
	}

	public String getSale_dt(){
		return this.sale_dt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getRedm_dt(){
		return this.redm_dt;
	}

	public String getCur_redm_agg_amt(){
		return this.cur_redm_agg_amt;
	}

	public String getTot_redm_amt(){
		return this.tot_redm_amt;
	}

	public String getRem_amt(){
		return this.rem_amt;
	}

	public String getUn_redm_amt(){
		return this.un_redm_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getEis_aset_clsf(){
		return this.eis_aset_clsf;
	}

	public String getInsr_type_cd(){
		return this.insr_type_cd;
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

	public String getUse_cmpy_cd(){
		return this.use_cmpy_cd;
	}

	public String getMst_remk(){
		return this.mst_remk;
	}

	public String getMst_chnl_clsf_cd(){
		return this.mst_chnl_clsf_cd;
	}
}

/* 작성시간 : Mon Jun 22 17:00:57 KST 2015 */