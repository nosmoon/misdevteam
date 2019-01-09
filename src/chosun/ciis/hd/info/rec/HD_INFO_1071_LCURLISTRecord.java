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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1071_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String qulf_pems_seq;
	public String qulf_pems_cd;
	public String qulf_pems_flnm;
	public String qulf_no;
	public String qulf_pems_nm;
	public String qulf_pems_issu_plac_cd;
	public String qulf_pems_issu_plac_flnm;
	public String qulf_pems_issu_plac_nm;
	public String acqr_dt;
	public String mtry_dt;

	public HD_INFO_1071_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setQulf_pems_seq(String qulf_pems_seq){
		this.qulf_pems_seq = qulf_pems_seq;
	}

	public void setQulf_pems_cd(String qulf_pems_cd){
		this.qulf_pems_cd = qulf_pems_cd;
	}

	public void setQulf_pems_flnm(String qulf_pems_flnm){
		this.qulf_pems_flnm = qulf_pems_flnm;
	}

	public void setQulf_no(String qulf_no){
		this.qulf_no = qulf_no;
	}

	public void setQulf_pems_nm(String qulf_pems_nm){
		this.qulf_pems_nm = qulf_pems_nm;
	}

	public void setQulf_pems_issu_plac_cd(String qulf_pems_issu_plac_cd){
		this.qulf_pems_issu_plac_cd = qulf_pems_issu_plac_cd;
	}

	public void setQulf_pems_issu_plac_flnm(String qulf_pems_issu_plac_flnm){
		this.qulf_pems_issu_plac_flnm = qulf_pems_issu_plac_flnm;
	}

	public void setQulf_pems_issu_plac_nm(String qulf_pems_issu_plac_nm){
		this.qulf_pems_issu_plac_nm = qulf_pems_issu_plac_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getQulf_pems_seq(){
		return this.qulf_pems_seq;
	}

	public String getQulf_pems_cd(){
		return this.qulf_pems_cd;
	}

	public String getQulf_pems_flnm(){
		return this.qulf_pems_flnm;
	}

	public String getQulf_no(){
		return this.qulf_no;
	}

	public String getQulf_pems_nm(){
		return this.qulf_pems_nm;
	}

	public String getQulf_pems_issu_plac_cd(){
		return this.qulf_pems_issu_plac_cd;
	}

	public String getQulf_pems_issu_plac_flnm(){
		return this.qulf_pems_issu_plac_flnm;
	}

	public String getQulf_pems_issu_plac_nm(){
		return this.qulf_pems_issu_plac_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}
}

/* 작성시간 : Sat Feb 07 15:21:00 KST 2009 */