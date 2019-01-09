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


public class IS_RPT_1060_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String dlco_nm;
	public String amt;
	public String rcpm_clsf_nm;
	public String rcpm_acct_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;

	public IS_RPT_1060_LCURLIST1Record(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm){
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public void setRcpm_acct_nm(String rcpm_acct_nm){
		this.rcpm_acct_nm = rcpm_acct_nm;
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

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRcpm_clsf_nm(){
		return this.rcpm_clsf_nm;
	}

	public String getRcpm_acct_nm(){
		return this.rcpm_acct_nm;
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
}

/* 작성시간 : Tue Jun 05 14:15:56 KST 2012 */