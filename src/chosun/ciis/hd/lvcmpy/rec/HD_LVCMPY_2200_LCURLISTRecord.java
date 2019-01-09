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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String cmpy_nm;
	public String ern;
	public String impt_saly;
	public String impt_bns;
	public String aprv_bns_tot_amt;
	public String non_tax_work;
	public String non_tax_prod;
	public String non_tax_frnc;
	public String non_tax_etc;
	public String hosp_insr_fee;
	public String np_pymt_amt;
	public String emp_insr_fee;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String seq;

	public HD_LVCMPY_2200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setImpt_saly(String impt_saly){
		this.impt_saly = impt_saly;
	}

	public void setImpt_bns(String impt_bns){
		this.impt_bns = impt_bns;
	}

	public void setAprv_bns_tot_amt(String aprv_bns_tot_amt){
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
	}

	public void setNon_tax_work(String non_tax_work){
		this.non_tax_work = non_tax_work;
	}

	public void setNon_tax_prod(String non_tax_prod){
		this.non_tax_prod = non_tax_prod;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setNon_tax_etc(String non_tax_etc){
		this.non_tax_etc = non_tax_etc;
	}

	public void setHosp_insr_fee(String hosp_insr_fee){
		this.hosp_insr_fee = hosp_insr_fee;
	}

	public void setNp_pymt_amt(String np_pymt_amt){
		this.np_pymt_amt = np_pymt_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getImpt_saly(){
		return this.impt_saly;
	}

	public String getImpt_bns(){
		return this.impt_bns;
	}

	public String getAprv_bns_tot_amt(){
		return this.aprv_bns_tot_amt;
	}

	public String getNon_tax_work(){
		return this.non_tax_work;
	}

	public String getNon_tax_prod(){
		return this.non_tax_prod;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getNon_tax_etc(){
		return this.non_tax_etc;
	}

	public String getHosp_insr_fee(){
		return this.hosp_insr_fee;
	}

	public String getNp_pymt_amt(){
		return this.np_pymt_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Thu May 07 09:58:37 KST 2009 */