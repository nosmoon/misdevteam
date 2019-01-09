/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대계약관리
* 작성일자 : 2010-08-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 임대인 연락처  및 미수정보 추가 
* 수정자 : 노상현
* 수정일자 : 2011-03-29
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 재무회계 - 부가세관리 - 세금계산서 조회
 */


public class AS_LEAS_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntr_no;
	public String bldg_cd_nm;
	public String ser_no;
	public String dlco_nm;
	public String leas_area_size;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_star;
	public String cntr_leas_amt;
	public String leas_clam_cycl;
	public String cntr_mang_amt;
	public String mang_clam_cycl;
	public String tot_amt;
	public String cntr_gurt_amt;
	public String gurt_tot_amt;
	public String gurt_out_amt;
	public String gurt_amt;
	public String ref_cntr_no;
	public String bldg_cd;
	public String aset_no;
	public String aset_nm;
	public String draft_no;
	public String rcpm_amt_end;
	public String leas_cntr_dt;
	public String last_leas_clam_dt;
	public String midw_expy_dt;
	public String last_mang_clam_dt;
	public String precpt_tot_amt;
	public String end_clsf;
	public String precpt_out_amt;
	public String precpt_amt;
	public String pymt_clsf;
	public String expy_remk;
	public String good_clsf;
	public String remk;
	public String aset_addr;
	public String gurt_dlco_ern;
	public String gurt_dlco_nm;
	public String ref_cntr_nm;
	public String leas_dlco_ern;
	public String leas_ern_nm;
	public String hire_dlco_clsf_cd;
	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String cmpy_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String bo_cd;
	public String bo_seq;
	public String vat_non_yn;
	public String frex_rcpm_yn;
	public String email;
	public String leas_telno1;
	public String leas_telno2;
	public String leas_telno3;
	public String unrcpm_info;

	public AS_LEAS_1102_LCURLISTRecord(){}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setBldg_cd_nm(String bldg_cd_nm){
		this.bldg_cd_nm = bldg_cd_nm;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setLeas_area_size(String leas_area_size){
		this.leas_area_size = leas_area_size;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setGurt_tot_amt(String gurt_tot_amt){
		this.gurt_tot_amt = gurt_tot_amt;
	}

	public void setGurt_out_amt(String gurt_out_amt){
		this.gurt_out_amt = gurt_out_amt;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public void setRef_cntr_no(String ref_cntr_no){
		this.ref_cntr_no = ref_cntr_no;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setRcpm_amt_end(String rcpm_amt_end){
		this.rcpm_amt_end = rcpm_amt_end;
	}

	public void setLeas_cntr_dt(String leas_cntr_dt){
		this.leas_cntr_dt = leas_cntr_dt;
	}

	public void setLast_leas_clam_dt(String last_leas_clam_dt){
		this.last_leas_clam_dt = last_leas_clam_dt;
	}

	public void setMidw_expy_dt(String midw_expy_dt){
		this.midw_expy_dt = midw_expy_dt;
	}

	public void setLast_mang_clam_dt(String last_mang_clam_dt){
		this.last_mang_clam_dt = last_mang_clam_dt;
	}

	public void setPrecpt_tot_amt(String precpt_tot_amt){
		this.precpt_tot_amt = precpt_tot_amt;
	}

	public void setEnd_clsf(String end_clsf){
		this.end_clsf = end_clsf;
	}

	public void setPrecpt_out_amt(String precpt_out_amt){
		this.precpt_out_amt = precpt_out_amt;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setPymt_clsf(String pymt_clsf){
		this.pymt_clsf = pymt_clsf;
	}

	public void setExpy_remk(String expy_remk){
		this.expy_remk = expy_remk;
	}

	public void setGood_clsf(String good_clsf){
		this.good_clsf = good_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAset_addr(String aset_addr){
		this.aset_addr = aset_addr;
	}

	public void setGurt_dlco_ern(String gurt_dlco_ern){
		this.gurt_dlco_ern = gurt_dlco_ern;
	}

	public void setGurt_dlco_nm(String gurt_dlco_nm){
		this.gurt_dlco_nm = gurt_dlco_nm;
	}

	public void setRef_cntr_nm(String ref_cntr_nm){
		this.ref_cntr_nm = ref_cntr_nm;
	}

	public void setLeas_dlco_ern(String leas_dlco_ern){
		this.leas_dlco_ern = leas_dlco_ern;
	}

	public void setLeas_ern_nm(String leas_ern_nm){
		this.leas_ern_nm = leas_ern_nm;
	}

	public void setHire_dlco_clsf_cd(String hire_dlco_clsf_cd){
		this.hire_dlco_clsf_cd = hire_dlco_clsf_cd;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setVat_non_yn(String vat_non_yn){
		this.vat_non_yn = vat_non_yn;
	}

	public void setFrex_rcpm_yn(String frex_rcpm_yn){
		this.frex_rcpm_yn = frex_rcpm_yn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setLeas_telno1(String leas_telno1){
		this.leas_telno1 = leas_telno1;
	}

	public void setLeas_telno2(String leas_telno2){
		this.leas_telno2 = leas_telno2;
	}

	public void setLeas_telno3(String leas_telno3){
		this.leas_telno3 = leas_telno3;
	}

	public void setUnrcpm_info(String unrcpm_info){
		this.unrcpm_info = unrcpm_info;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getBldg_cd_nm(){
		return this.bldg_cd_nm;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getLeas_area_size(){
		return this.leas_area_size;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getGurt_tot_amt(){
		return this.gurt_tot_amt;
	}

	public String getGurt_out_amt(){
		return this.gurt_out_amt;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}

	public String getRef_cntr_no(){
		return this.ref_cntr_no;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getRcpm_amt_end(){
		return this.rcpm_amt_end;
	}

	public String getLeas_cntr_dt(){
		return this.leas_cntr_dt;
	}

	public String getLast_leas_clam_dt(){
		return this.last_leas_clam_dt;
	}

	public String getMidw_expy_dt(){
		return this.midw_expy_dt;
	}

	public String getLast_mang_clam_dt(){
		return this.last_mang_clam_dt;
	}

	public String getPrecpt_tot_amt(){
		return this.precpt_tot_amt;
	}

	public String getEnd_clsf(){
		return this.end_clsf;
	}

	public String getPrecpt_out_amt(){
		return this.precpt_out_amt;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getPymt_clsf(){
		return this.pymt_clsf;
	}

	public String getExpy_remk(){
		return this.expy_remk;
	}

	public String getGood_clsf(){
		return this.good_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAset_addr(){
		return this.aset_addr;
	}

	public String getGurt_dlco_ern(){
		return this.gurt_dlco_ern;
	}

	public String getGurt_dlco_nm(){
		return this.gurt_dlco_nm;
	}

	public String getRef_cntr_nm(){
		return this.ref_cntr_nm;
	}

	public String getLeas_dlco_ern(){
		return this.leas_dlco_ern;
	}

	public String getLeas_ern_nm(){
		return this.leas_ern_nm;
	}

	public String getHire_dlco_clsf_cd(){
		return this.hire_dlco_clsf_cd;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getVat_non_yn(){
		return this.vat_non_yn;
	}

	public String getFrex_rcpm_yn(){
		return this.frex_rcpm_yn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getLeas_telno1(){
		return this.leas_telno1;
	}

	public String getLeas_telno2(){
		return this.leas_telno2;
	}

	public String getLeas_telno3(){
		return this.leas_telno3;
	}

	public String getUnrcpm_info(){
		return this.unrcpm_info;
	}
}

/* 작성시간 : Tue Mar 29 11:38:46 KST 2011 */