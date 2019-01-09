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


public class SE_RCP_1120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_nm;
	public String area_nm;
	public String bo_head_nm;
	public String acct_rcpm_cnfm_tot_amt;
	public String acct_rcpm_reg_tot_amt;
	public String acct_rcpm_rem_amt;

	public SE_RCP_1120_LCURLISTRecord(){}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setAcct_rcpm_cnfm_tot_amt(String acct_rcpm_cnfm_tot_amt){
		this.acct_rcpm_cnfm_tot_amt = acct_rcpm_cnfm_tot_amt;
	}

	public void setAcct_rcpm_reg_tot_amt(String acct_rcpm_reg_tot_amt){
		this.acct_rcpm_reg_tot_amt = acct_rcpm_reg_tot_amt;
	}

	public void setAcct_rcpm_rem_amt(String acct_rcpm_rem_amt){
		this.acct_rcpm_rem_amt = acct_rcpm_rem_amt;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getAcct_rcpm_cnfm_tot_amt(){
		return this.acct_rcpm_cnfm_tot_amt;
	}

	public String getAcct_rcpm_reg_tot_amt(){
		return this.acct_rcpm_reg_tot_amt;
	}

	public String getAcct_rcpm_rem_amt(){
		return this.acct_rcpm_rem_amt;
	}
}

/* 작성시간 : Wed Apr 15 19:09:50 KST 2009 */