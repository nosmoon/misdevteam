/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_nm;
	public String chrg_flnm;
	public String bo_head_nm;
	public String vitl_acct_no;
	public String acct_rcpm_cnfm_tot_amt;
	public String acct_rcpm_reg_tot_amt;
	public String rem_amt;
	public String cntr_stat_nm;

	public SE_RCP_1020_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setVitl_acct_no(String vitl_acct_no){
		this.vitl_acct_no = vitl_acct_no;
	}

	public void setAcct_rcpm_cnfm_tot_amt(String acct_rcpm_cnfm_tot_amt){
		this.acct_rcpm_cnfm_tot_amt = acct_rcpm_cnfm_tot_amt;
	}

	public void setAcct_rcpm_reg_tot_amt(String acct_rcpm_reg_tot_amt){
		this.acct_rcpm_reg_tot_amt = acct_rcpm_reg_tot_amt;
	}

	public void setRem_amt(String rem_amt){
		this.rem_amt = rem_amt;
	}

	public void setCntr_stat_nm(String cntr_stat_nm){
		this.cntr_stat_nm = cntr_stat_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getVitl_acct_no(){
		return this.vitl_acct_no;
	}

	public String getAcct_rcpm_cnfm_tot_amt(){
		return this.acct_rcpm_cnfm_tot_amt;
	}

	public String getAcct_rcpm_reg_tot_amt(){
		return this.acct_rcpm_reg_tot_amt;
	}

	public String getRem_amt(){
		return this.rem_amt;
	}

	public String getCntr_stat_nm(){
		return this.cntr_stat_nm;
	}
}

/* 작성시간 : Wed Apr 15 20:17:04 KST 2009 */