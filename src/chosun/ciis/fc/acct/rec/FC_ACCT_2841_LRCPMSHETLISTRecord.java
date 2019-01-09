/***************************************************************************************************
* 파일명 : .java
* 기능 : 회계관리
* 작성일자 : 2009-02-19
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 회계관리
 */


public class FC_ACCT_2841_LRCPMSHETLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_shet_kind;
	public String rcpm_indc_bgn_no;
	public String rcpm_clsf;
	public String rcpm_shet_dlv_dt;
	public String dlver_emp_no;
	public String dlver_emp_nm;
	public String recp_pers_emp_no;
	public String recp_pers_emp_nm;
	public String rcpm_shet_no;

	public FC_ACCT_2841_LRCPMSHETLISTRecord(){}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_indc_bgn_no(String rcpm_indc_bgn_no){
		this.rcpm_indc_bgn_no = rcpm_indc_bgn_no;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setRcpm_shet_dlv_dt(String rcpm_shet_dlv_dt){
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
	}

	public void setDlver_emp_no(String dlver_emp_no){
		this.dlver_emp_no = dlver_emp_no;
	}

	public void setDlver_emp_nm(String dlver_emp_nm){
		this.dlver_emp_nm = dlver_emp_nm;
	}

	public void setRecp_pers_emp_no(String recp_pers_emp_no){
		this.recp_pers_emp_no = recp_pers_emp_no;
	}

	public void setRecp_pers_emp_nm(String recp_pers_emp_nm){
		this.recp_pers_emp_nm = recp_pers_emp_nm;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_indc_bgn_no(){
		return this.rcpm_indc_bgn_no;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getRcpm_shet_dlv_dt(){
		return this.rcpm_shet_dlv_dt;
	}

	public String getDlver_emp_no(){
		return this.dlver_emp_no;
	}

	public String getDlver_emp_nm(){
		return this.dlver_emp_nm;
	}

	public String getRecp_pers_emp_no(){
		return this.recp_pers_emp_no;
	}

	public String getRecp_pers_emp_nm(){
		return this.recp_pers_emp_nm;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}
}

/* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */