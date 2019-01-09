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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntr_stat_clsf_nm;
	public String dlco_cd_seq;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;
	public String adms_dstc_cd;
	public String adms_dstc_cdd_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String ptph_no;
	public String addr;
	public String jurs_dong_nm;
	public String jurs_apt;
	public String leaf_addr;
	public String job_ptph_no;
	public String ern;
	public String setl_bank_nm;
	public String acct_no;
	public String rcpm_main_nm;
	public String chg_dt_tm;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;

	public IS_BAS_1710_LCURLISTRecord(){}

	public void setCntr_stat_clsf_nm(String cntr_stat_clsf_nm){
		this.cntr_stat_clsf_nm = cntr_stat_clsf_nm;
	}

	public void setDlco_cd_seq(String dlco_cd_seq){
		this.dlco_cd_seq = dlco_cd_seq;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAdms_dstc_cdd_nm(String adms_dstc_cdd_nm){
		this.adms_dstc_cdd_nm = adms_dstc_cdd_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setJurs_dong_nm(String jurs_dong_nm){
		this.jurs_dong_nm = jurs_dong_nm;
	}

	public void setJurs_apt(String jurs_apt){
		this.jurs_apt = jurs_apt;
	}

	public void setLeaf_addr(String leaf_addr){
		this.leaf_addr = leaf_addr;
	}

	public void setJob_ptph_no(String job_ptph_no){
		this.job_ptph_no = job_ptph_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public String getCntr_stat_clsf_nm(){
		return this.cntr_stat_clsf_nm;
	}

	public String getDlco_cd_seq(){
		return this.dlco_cd_seq;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAdms_dstc_cdd_nm(){
		return this.adms_dstc_cdd_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getJurs_dong_nm(){
		return this.jurs_dong_nm;
	}

	public String getJurs_apt(){
		return this.jurs_apt;
	}

	public String getLeaf_addr(){
		return this.leaf_addr;
	}

	public String getJob_ptph_no(){
		return this.job_ptph_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}
}

/* 작성시간 : Fri Apr 27 10:12:01 KST 2012 */