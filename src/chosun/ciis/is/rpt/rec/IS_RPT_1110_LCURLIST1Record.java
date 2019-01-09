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


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1110_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String sale_clsf;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String sale_clsf_nm;
	public String dm_tgt_amt;
	public String dm_rst_amt;
	public String dm_d_rate;
	public String dm_won_amt;
	public String dm_i_rate;
	public String ty_tgt_amt;
	public String ny_tgt_amt;
	public String ny_rst_amt;
	public String ny_d_rate;
	public String ny_won_amt;
	public String ny_i_rate;
	public String pl_rst_amt;

	public IS_RPT_1110_LCURLIST1Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setDm_tgt_amt(String dm_tgt_amt){
		this.dm_tgt_amt = dm_tgt_amt;
	}

	public void setDm_rst_amt(String dm_rst_amt){
		this.dm_rst_amt = dm_rst_amt;
	}

	public void setDm_d_rate(String dm_d_rate){
		this.dm_d_rate = dm_d_rate;
	}

	public void setDm_won_amt(String dm_won_amt){
		this.dm_won_amt = dm_won_amt;
	}

	public void setDm_i_rate(String dm_i_rate){
		this.dm_i_rate = dm_i_rate;
	}

	public void setTy_tgt_amt(String ty_tgt_amt){
		this.ty_tgt_amt = ty_tgt_amt;
	}

	public void setNy_tgt_amt(String ny_tgt_amt){
		this.ny_tgt_amt = ny_tgt_amt;
	}

	public void setNy_rst_amt(String ny_rst_amt){
		this.ny_rst_amt = ny_rst_amt;
	}

	public void setNy_d_rate(String ny_d_rate){
		this.ny_d_rate = ny_d_rate;
	}

	public void setNy_won_amt(String ny_won_amt){
		this.ny_won_amt = ny_won_amt;
	}

	public void setNy_i_rate(String ny_i_rate){
		this.ny_i_rate = ny_i_rate;
	}

	public void setPl_rst_amt(String pl_rst_amt){
		this.pl_rst_amt = pl_rst_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getDm_tgt_amt(){
		return this.dm_tgt_amt;
	}

	public String getDm_rst_amt(){
		return this.dm_rst_amt;
	}

	public String getDm_d_rate(){
		return this.dm_d_rate;
	}

	public String getDm_won_amt(){
		return this.dm_won_amt;
	}

	public String getDm_i_rate(){
		return this.dm_i_rate;
	}

	public String getTy_tgt_amt(){
		return this.ty_tgt_amt;
	}

	public String getNy_tgt_amt(){
		return this.ny_tgt_amt;
	}

	public String getNy_rst_amt(){
		return this.ny_rst_amt;
	}

	public String getNy_d_rate(){
		return this.ny_d_rate;
	}

	public String getNy_won_amt(){
		return this.ny_won_amt;
	}

	public String getNy_i_rate(){
		return this.ny_i_rate;
	}

	public String getPl_rst_amt(){
		return this.pl_rst_amt;
	}
}

/* 작성시간 : Thu May 31 11:49:14 KST 2012 */