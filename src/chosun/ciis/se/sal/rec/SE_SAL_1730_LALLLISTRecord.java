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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1730_LALLLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String bo_nm;
	public String sale_amt;
	public String bns_sale_amt;
	public String bns_vat_amt;
	public String sum_amt;
	public String elec_trsm_yn;
	public String area_srt_seq;
	public String jd_addr;
	public String jd_dtls_addr;
	public String bo_head_nm;
	public String tel;
	public String zip;
	public String vitl_acct_no;
	public String prvmm_dd_tot_shet_qty_110;
	public String prvmm_sale_amt_110;
	public String prvmm_dd_tot_shet_qty_130;
	public String prvmm_sale_amt_130;
	public String prvmm_dd_tot_shet_qty_210;
	public String prvmm_sale_amt_210;
	public String nxt_qty_110;
	public String prvmm_sale_amt;
	public String prvmm_fpymt_amt;
	public String prvmm_clam_amt;
	public String rcpm_amt;
	public String un_pymt_amt;
	public String clam_amt;
	public String cntr_gurt_amt_stot;
	public String prvmm_sum_rcpm_amt;
	public String prvmm_rcpm_amt;
	public String trgt_rcpm_amt;
	public String ern;
	public String yymm;

	public SE_SAL_1730_LALLLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setBns_sale_amt(String bns_sale_amt){
		this.bns_sale_amt = bns_sale_amt;
	}

	public void setBns_vat_amt(String bns_vat_amt){
		this.bns_vat_amt = bns_vat_amt;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setElec_trsm_yn(String elec_trsm_yn){
		this.elec_trsm_yn = elec_trsm_yn;
	}

	public void setArea_srt_seq(String area_srt_seq){
		this.area_srt_seq = area_srt_seq;
	}

	public void setJd_addr(String jd_addr){
		this.jd_addr = jd_addr;
	}

	public void setJd_dtls_addr(String jd_dtls_addr){
		this.jd_dtls_addr = jd_dtls_addr;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setVitl_acct_no(String vitl_acct_no){
		this.vitl_acct_no = vitl_acct_no;
	}

	public void setPrvmm_dd_tot_shet_qty_110(String prvmm_dd_tot_shet_qty_110){
		this.prvmm_dd_tot_shet_qty_110 = prvmm_dd_tot_shet_qty_110;
	}

	public void setPrvmm_sale_amt_110(String prvmm_sale_amt_110){
		this.prvmm_sale_amt_110 = prvmm_sale_amt_110;
	}

	public void setPrvmm_dd_tot_shet_qty_130(String prvmm_dd_tot_shet_qty_130){
		this.prvmm_dd_tot_shet_qty_130 = prvmm_dd_tot_shet_qty_130;
	}

	public void setPrvmm_sale_amt_130(String prvmm_sale_amt_130){
		this.prvmm_sale_amt_130 = prvmm_sale_amt_130;
	}

	public void setPrvmm_dd_tot_shet_qty_210(String prvmm_dd_tot_shet_qty_210){
		this.prvmm_dd_tot_shet_qty_210 = prvmm_dd_tot_shet_qty_210;
	}

	public void setPrvmm_sale_amt_210(String prvmm_sale_amt_210){
		this.prvmm_sale_amt_210 = prvmm_sale_amt_210;
	}

	public void setNxt_qty_110(String nxt_qty_110){
		this.nxt_qty_110 = nxt_qty_110;
	}

	public void setPrvmm_sale_amt(String prvmm_sale_amt){
		this.prvmm_sale_amt = prvmm_sale_amt;
	}

	public void setPrvmm_fpymt_amt(String prvmm_fpymt_amt){
		this.prvmm_fpymt_amt = prvmm_fpymt_amt;
	}

	public void setPrvmm_clam_amt(String prvmm_clam_amt){
		this.prvmm_clam_amt = prvmm_clam_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setUn_pymt_amt(String un_pymt_amt){
		this.un_pymt_amt = un_pymt_amt;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setCntr_gurt_amt_stot(String cntr_gurt_amt_stot){
		this.cntr_gurt_amt_stot = cntr_gurt_amt_stot;
	}

	public void setPrvmm_sum_rcpm_amt(String prvmm_sum_rcpm_amt){
		this.prvmm_sum_rcpm_amt = prvmm_sum_rcpm_amt;
	}

	public void setPrvmm_rcpm_amt(String prvmm_rcpm_amt){
		this.prvmm_rcpm_amt = prvmm_rcpm_amt;
	}

	public void setTrgt_rcpm_amt(String trgt_rcpm_amt){
		this.trgt_rcpm_amt = trgt_rcpm_amt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getBns_sale_amt(){
		return this.bns_sale_amt;
	}

	public String getBns_vat_amt(){
		return this.bns_vat_amt;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getElec_trsm_yn(){
		return this.elec_trsm_yn;
	}

	public String getArea_srt_seq(){
		return this.area_srt_seq;
	}

	public String getJd_addr(){
		return this.jd_addr;
	}

	public String getJd_dtls_addr(){
		return this.jd_dtls_addr;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getTel(){
		return this.tel;
	}

	public String getZip(){
		return this.zip;
	}

	public String getVitl_acct_no(){
		return this.vitl_acct_no;
	}

	public String getPrvmm_dd_tot_shet_qty_110(){
		return this.prvmm_dd_tot_shet_qty_110;
	}

	public String getPrvmm_sale_amt_110(){
		return this.prvmm_sale_amt_110;
	}

	public String getPrvmm_dd_tot_shet_qty_130(){
		return this.prvmm_dd_tot_shet_qty_130;
	}

	public String getPrvmm_sale_amt_130(){
		return this.prvmm_sale_amt_130;
	}

	public String getPrvmm_dd_tot_shet_qty_210(){
		return this.prvmm_dd_tot_shet_qty_210;
	}

	public String getPrvmm_sale_amt_210(){
		return this.prvmm_sale_amt_210;
	}

	public String getNxt_qty_110(){
		return this.nxt_qty_110;
	}

	public String getPrvmm_sale_amt(){
		return this.prvmm_sale_amt;
	}

	public String getPrvmm_fpymt_amt(){
		return this.prvmm_fpymt_amt;
	}

	public String getPrvmm_clam_amt(){
		return this.prvmm_clam_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getUn_pymt_amt(){
		return this.un_pymt_amt;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getCntr_gurt_amt_stot(){
		return this.cntr_gurt_amt_stot;
	}

	public String getPrvmm_sum_rcpm_amt(){
		return this.prvmm_sum_rcpm_amt;
	}

	public String getPrvmm_rcpm_amt(){
		return this.prvmm_rcpm_amt;
	}

	public String getTrgt_rcpm_amt(){
		return this.trgt_rcpm_amt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getYymm(){
		return this.yymm;
	}
}

/* 작성시간 : Wed Jul 22 09:44:11 KST 2009 */