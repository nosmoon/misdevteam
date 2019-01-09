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


public class IS_RPT_1220_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_cd_nm;
	public String sale_clsf_nm;
	public String dm_tgt_amt;
	public String dm_rst_amt;
	public String dm_d_rate;
	public String dm_tgt_amt_s;
	public String dm_rst_amt_s;
	public String dm_d_rate_s;
	public String ty_tgt_amt;
	public String ny_tgt_amt;
	public String ny_rst_amt;
	public String ny_d_rate;
	public String pl_rst_amt;

	public IS_RPT_1220_LCURLIST1Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
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

	public void setDm_tgt_amt_s(String dm_tgt_amt_s){
		this.dm_tgt_amt_s = dm_tgt_amt_s;
	}

	public void setDm_rst_amt_s(String dm_rst_amt_s){
		this.dm_rst_amt_s = dm_rst_amt_s;
	}

	public void setDm_d_rate_s(String dm_d_rate_s){
		this.dm_d_rate_s = dm_d_rate_s;
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

	public void setPl_rst_amt(String pl_rst_amt){
		this.pl_rst_amt = pl_rst_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
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

	public String getDm_tgt_amt_s(){
		return this.dm_tgt_amt_s;
	}

	public String getDm_rst_amt_s(){
		return this.dm_rst_amt_s;
	}

	public String getDm_d_rate_s(){
		return this.dm_d_rate_s;
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

	public String getPl_rst_amt(){
		return this.pl_rst_amt;
	}
}

/* 작성시간 : Mon Jun 04 15:31:35 KST 2012 */