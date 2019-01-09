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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tax_stmt_no;
	public String prof_type_cd_nm;
	public String make_dt;
	public String dlco_nm;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String total_amt;
	public String erplace_cd_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String scat_dt;
	public String b_suply_amt;
	public String sale_clsf_nm;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String qunt;
	public String uprc;
	public String c_suply_amt;
	public String sub_num;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;

	public IS_SAL_2210_LCURLISTRecord(){}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setProf_type_cd_nm(String prof_type_cd_nm){
		this.prof_type_cd_nm = prof_type_cd_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setErplace_cd_nm(String erplace_cd_nm){
		this.erplace_cd_nm = erplace_cd_nm;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setB_suply_amt(String b_suply_amt){
		this.b_suply_amt = b_suply_amt;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setC_suply_amt(String c_suply_amt){
		this.c_suply_amt = c_suply_amt;
	}

	public void setSub_num(String sub_num){
		this.sub_num = sub_num;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getProf_type_cd_nm(){
		return this.prof_type_cd_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getErplace_cd_nm(){
		return this.erplace_cd_nm;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getB_suply_amt(){
		return this.b_suply_amt;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getC_suply_amt(){
		return this.c_suply_amt;
	}

	public String getSub_num(){
		return this.sub_num;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Wed May 16 14:24:41 KST 2012 */