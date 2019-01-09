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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flnm;
	public String seq;
	public String offic_nm;
	public String cmpy_nm;
	public String ern;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String impt_saly;
	public String non_tax_prod;
	public String non_tax_frnc;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String impt_bns;
	public String bns_incm_tax_tot_amt;
	public String bns_res_tax_tot_amt;
	public String bns_deci_farm_spc_tax;
	public String aprv_bns_tot_amt;
	public String stok_num_shet_prft_amt;
	public String np_pymt_amt;
	public String hosp_insr_fee;
	public String emp_insr_fee;
	public String etc_insr_fee;

	public HD_YADJM_1210_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOffic_nm(String offic_nm){
		this.offic_nm = offic_nm;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setImpt_saly(String impt_saly){
		this.impt_saly = impt_saly;
	}

	public void setNon_tax_prod(String non_tax_prod){
		this.non_tax_prod = non_tax_prod;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setImpt_bns(String impt_bns){
		this.impt_bns = impt_bns;
	}

	public void setBns_incm_tax_tot_amt(String bns_incm_tax_tot_amt){
		this.bns_incm_tax_tot_amt = bns_incm_tax_tot_amt;
	}

	public void setBns_res_tax_tot_amt(String bns_res_tax_tot_amt){
		this.bns_res_tax_tot_amt = bns_res_tax_tot_amt;
	}

	public void setBns_deci_farm_spc_tax(String bns_deci_farm_spc_tax){
		this.bns_deci_farm_spc_tax = bns_deci_farm_spc_tax;
	}

	public void setAprv_bns_tot_amt(String aprv_bns_tot_amt){
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
	}

	public void setStok_num_shet_prft_amt(String stok_num_shet_prft_amt){
		this.stok_num_shet_prft_amt = stok_num_shet_prft_amt;
	}

	public void setNp_pymt_amt(String np_pymt_amt){
		this.np_pymt_amt = np_pymt_amt;
	}

	public void setHosp_insr_fee(String hosp_insr_fee){
		this.hosp_insr_fee = hosp_insr_fee;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setEtc_insr_fee(String etc_insr_fee){
		this.etc_insr_fee = etc_insr_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOffic_nm(){
		return this.offic_nm;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getImpt_saly(){
		return this.impt_saly;
	}

	public String getNon_tax_prod(){
		return this.non_tax_prod;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getImpt_bns(){
		return this.impt_bns;
	}

	public String getBns_incm_tax_tot_amt(){
		return this.bns_incm_tax_tot_amt;
	}

	public String getBns_res_tax_tot_amt(){
		return this.bns_res_tax_tot_amt;
	}

	public String getBns_deci_farm_spc_tax(){
		return this.bns_deci_farm_spc_tax;
	}

	public String getAprv_bns_tot_amt(){
		return this.aprv_bns_tot_amt;
	}

	public String getStok_num_shet_prft_amt(){
		return this.stok_num_shet_prft_amt;
	}

	public String getNp_pymt_amt(){
		return this.np_pymt_amt;
	}

	public String getHosp_insr_fee(){
		return this.hosp_insr_fee;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getEtc_insr_fee(){
		return this.etc_insr_fee;
	}
}

/* 작성시간 : Fri Feb 01 17:58:51 KST 2013 */