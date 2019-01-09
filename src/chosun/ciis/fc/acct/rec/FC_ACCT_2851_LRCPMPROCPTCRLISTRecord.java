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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2851_LRCPMPROCPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String rcpm_clsf;
	public String rcpm_shet_dlv_dt;
	public String dlver_emp_no;
	public String dlver_emp_nm;
	public String recp_pers_emp_no;
	public String recp_pers_emp_nm;
	public String widr_dt;
	public String rcpm_shet_stat;
	public String widr_resn;
	public String rmks;
	public String rsrt_pers_emp_no;
	public String rsrt_pers_emp_nm;

	public FC_ACCT_2851_LRCPMPROCPTCRLISTRecord(){}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
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

	public void setWidr_dt(String widr_dt){
		this.widr_dt = widr_dt;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setWidr_resn(String widr_resn){
		this.widr_resn = widr_resn;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRsrt_pers_emp_no(String rsrt_pers_emp_no){
		this.rsrt_pers_emp_no = rsrt_pers_emp_no;
	}

	public void setRsrt_pers_emp_nm(String rsrt_pers_emp_nm){
		this.rsrt_pers_emp_nm = rsrt_pers_emp_nm;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
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

	public String getWidr_dt(){
		return this.widr_dt;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getWidr_resn(){
		return this.widr_resn;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRsrt_pers_emp_no(){
		return this.rsrt_pers_emp_no;
	}

	public String getRsrt_pers_emp_nm(){
		return this.rsrt_pers_emp_nm;
	}
}

/* 작성시간 : Wed Jun 24 11:57:24 KST 2009 */