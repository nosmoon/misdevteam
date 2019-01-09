

package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_101220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String adjm_clsf;
	public String emp_no;
	public String prsn_pens;
	public String pens_savg;
	public String invsm_cmpd_invsm_amt_6;
	public String invsm_cmpd_invsm_amt;
	public String hous_subc_savg;
	public String multy_house_plan_savg;
	public String ltrm_hous_savg;
	public String labr_hous_savg;
	public String hous_hire_rcpm_won_li_amt_repa;
	public String monthly_rent_amt;
	public String hous_loan_amt_int_1;
	public String ltrm_hous_mogg_loan_amt_int_re;
	public String hous_loan_amt_int;
	public String ltrm_stok_type_savg_incm_dduc1;
	public String ltrm_stok_type_savg_incm_dduc2;
	public String ltrm_stok_type_savg_incm_dduc3;

	public HD_YADJM_101220_LCURLISTRecord(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setAdjm_clsf(String adjm_clsf){
		this.adjm_clsf = adjm_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPrsn_pens(String prsn_pens){
		this.prsn_pens = prsn_pens;
	}

	public void setPens_savg(String pens_savg){
		this.pens_savg = pens_savg;
	}

	public void setInvsm_cmpd_invsm_amt_6(String invsm_cmpd_invsm_amt_6){
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setHous_subc_savg(String hous_subc_savg){
		this.hous_subc_savg = hous_subc_savg;
	}

	public void setMulty_house_plan_savg(String multy_house_plan_savg){
		this.multy_house_plan_savg = multy_house_plan_savg;
	}

	public void setLtrm_hous_savg(String ltrm_hous_savg){
		this.ltrm_hous_savg = ltrm_hous_savg;
	}

	public void setLabr_hous_savg(String labr_hous_savg){
		this.labr_hous_savg = labr_hous_savg;
	}

	public void setHous_hire_rcpm_won_li_amt_repa(String hous_hire_rcpm_won_li_amt_repa){
		this.hous_hire_rcpm_won_li_amt_repa = hous_hire_rcpm_won_li_amt_repa;
	}

	public void setMonthly_rent_amt(String monthly_rent_amt){
		this.monthly_rent_amt = monthly_rent_amt;
	}

	public void setHous_loan_amt_int_1(String hous_loan_amt_int_1){
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
	}

	public void setLtrm_hous_mogg_loan_amt_int_re(String ltrm_hous_mogg_loan_amt_int_re){
		this.ltrm_hous_mogg_loan_amt_int_re = ltrm_hous_mogg_loan_amt_int_re;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setLtrm_stok_type_savg_incm_dduc1(String ltrm_stok_type_savg_incm_dduc1){
		this.ltrm_stok_type_savg_incm_dduc1 = ltrm_stok_type_savg_incm_dduc1;
	}

	public void setLtrm_stok_type_savg_incm_dduc2(String ltrm_stok_type_savg_incm_dduc2){
		this.ltrm_stok_type_savg_incm_dduc2 = ltrm_stok_type_savg_incm_dduc2;
	}

	public void setLtrm_stok_type_savg_incm_dduc3(String ltrm_stok_type_savg_incm_dduc3){
		this.ltrm_stok_type_savg_incm_dduc3 = ltrm_stok_type_savg_incm_dduc3;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getAdjm_clsf(){
		return this.adjm_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPrsn_pens(){
		return this.prsn_pens;
	}

	public String getPens_savg(){
		return this.pens_savg;
	}

	public String getInvsm_cmpd_invsm_amt_6(){
		return this.invsm_cmpd_invsm_amt_6;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getHous_subc_savg(){
		return this.hous_subc_savg;
	}

	public String getMulty_house_plan_savg(){
		return this.multy_house_plan_savg;
	}

	public String getLtrm_hous_savg(){
		return this.ltrm_hous_savg;
	}

	public String getLabr_hous_savg(){
		return this.labr_hous_savg;
	}

	public String getHous_hire_rcpm_won_li_amt_repa(){
		return this.hous_hire_rcpm_won_li_amt_repa;
	}

	public String getMonthly_rent_amt(){
		return this.monthly_rent_amt;
	}

	public String getHous_loan_amt_int_1(){
		return this.hous_loan_amt_int_1;
	}

	public String getLtrm_hous_mogg_loan_amt_int_re(){
		return this.ltrm_hous_mogg_loan_amt_int_re;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getLtrm_stok_type_savg_incm_dduc1(){
		return this.ltrm_stok_type_savg_incm_dduc1;
	}

	public String getLtrm_stok_type_savg_incm_dduc2(){
		return this.ltrm_stok_type_savg_incm_dduc2;
	}

	public String getLtrm_stok_type_savg_incm_dduc3(){
		return this.ltrm_stok_type_savg_incm_dduc3;
	}
}

/* 작성시간 : Wed Jan 05 12:39:26 KST 2011 */