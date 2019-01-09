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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_yymm;
	public String rcpm_yymm;
	public String thmm_1tms_rcpm_dt;
	public String thmm_1tms_rcpm_wkdy;
	public String thmm_2tms_rcpm_dt;
	public String thmm_2tms_rcpm_wkdy;
	public String thmm_1tms_encur_amt;
	public String thmm_2tms_encur_amt;
	public String thmm_un_pymt_encur_amt;
	public String thmm_db_encur_amt;
	public String prvmm_1tms_encur_amt;
	public String prvmm_2tms_encur_amt;
	public String prvmm_un_pymt_encur_amt;
	public String boy_fpymt_encur_amt;
	public String boy_un_pymt_encur_amt;
	public String stetsell_fpymt_encur_amt;
	public String stetsell_un_pymt_encur_amt;
	public String edus_fpymt_encur_amt;
	public String edus_un_pymt_encur_amt;

	public SE_SAL_1105_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setThmm_1tms_rcpm_dt(String thmm_1tms_rcpm_dt){
		this.thmm_1tms_rcpm_dt = thmm_1tms_rcpm_dt;
	}

	public void setThmm_1tms_rcpm_wkdy(String thmm_1tms_rcpm_wkdy){
		this.thmm_1tms_rcpm_wkdy = thmm_1tms_rcpm_wkdy;
	}

	public void setThmm_2tms_rcpm_dt(String thmm_2tms_rcpm_dt){
		this.thmm_2tms_rcpm_dt = thmm_2tms_rcpm_dt;
	}

	public void setThmm_2tms_rcpm_wkdy(String thmm_2tms_rcpm_wkdy){
		this.thmm_2tms_rcpm_wkdy = thmm_2tms_rcpm_wkdy;
	}

	public void setThmm_1tms_encur_amt(String thmm_1tms_encur_amt){
		this.thmm_1tms_encur_amt = thmm_1tms_encur_amt;
	}

	public void setThmm_2tms_encur_amt(String thmm_2tms_encur_amt){
		this.thmm_2tms_encur_amt = thmm_2tms_encur_amt;
	}

	public void setThmm_un_pymt_encur_amt(String thmm_un_pymt_encur_amt){
		this.thmm_un_pymt_encur_amt = thmm_un_pymt_encur_amt;
	}

	public void setThmm_db_encur_amt(String thmm_db_encur_amt){
		this.thmm_db_encur_amt = thmm_db_encur_amt;
	}

	public void setPrvmm_1tms_encur_amt(String prvmm_1tms_encur_amt){
		this.prvmm_1tms_encur_amt = prvmm_1tms_encur_amt;
	}

	public void setPrvmm_2tms_encur_amt(String prvmm_2tms_encur_amt){
		this.prvmm_2tms_encur_amt = prvmm_2tms_encur_amt;
	}

	public void setPrvmm_un_pymt_encur_amt(String prvmm_un_pymt_encur_amt){
		this.prvmm_un_pymt_encur_amt = prvmm_un_pymt_encur_amt;
	}

	public void setBoy_fpymt_encur_amt(String boy_fpymt_encur_amt){
		this.boy_fpymt_encur_amt = boy_fpymt_encur_amt;
	}

	public void setBoy_un_pymt_encur_amt(String boy_un_pymt_encur_amt){
		this.boy_un_pymt_encur_amt = boy_un_pymt_encur_amt;
	}

	public void setStetsell_fpymt_encur_amt(String stetsell_fpymt_encur_amt){
		this.stetsell_fpymt_encur_amt = stetsell_fpymt_encur_amt;
	}

	public void setStetsell_un_pymt_encur_amt(String stetsell_un_pymt_encur_amt){
		this.stetsell_un_pymt_encur_amt = stetsell_un_pymt_encur_amt;
	}

	public void setEdus_fpymt_encur_amt(String edus_fpymt_encur_amt){
		this.edus_fpymt_encur_amt = edus_fpymt_encur_amt;
	}

	public void setEdus_un_pymt_encur_amt(String edus_un_pymt_encur_amt){
		this.edus_un_pymt_encur_amt = edus_un_pymt_encur_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public String getThmm_1tms_rcpm_dt(){
		return this.thmm_1tms_rcpm_dt;
	}

	public String getThmm_1tms_rcpm_wkdy(){
		return this.thmm_1tms_rcpm_wkdy;
	}

	public String getThmm_2tms_rcpm_dt(){
		return this.thmm_2tms_rcpm_dt;
	}

	public String getThmm_2tms_rcpm_wkdy(){
		return this.thmm_2tms_rcpm_wkdy;
	}

	public String getThmm_1tms_encur_amt(){
		return this.thmm_1tms_encur_amt;
	}

	public String getThmm_2tms_encur_amt(){
		return this.thmm_2tms_encur_amt;
	}

	public String getThmm_un_pymt_encur_amt(){
		return this.thmm_un_pymt_encur_amt;
	}

	public String getThmm_db_encur_amt(){
		return this.thmm_db_encur_amt;
	}

	public String getPrvmm_1tms_encur_amt(){
		return this.prvmm_1tms_encur_amt;
	}

	public String getPrvmm_2tms_encur_amt(){
		return this.prvmm_2tms_encur_amt;
	}

	public String getPrvmm_un_pymt_encur_amt(){
		return this.prvmm_un_pymt_encur_amt;
	}

	public String getBoy_fpymt_encur_amt(){
		return this.boy_fpymt_encur_amt;
	}

	public String getBoy_un_pymt_encur_amt(){
		return this.boy_un_pymt_encur_amt;
	}

	public String getStetsell_fpymt_encur_amt(){
		return this.stetsell_fpymt_encur_amt;
	}

	public String getStetsell_un_pymt_encur_amt(){
		return this.stetsell_un_pymt_encur_amt;
	}

	public String getEdus_fpymt_encur_amt(){
		return this.edus_fpymt_encur_amt;
	}

	public String getEdus_un_pymt_encur_amt(){
		return this.edus_un_pymt_encur_amt;
	}
}

/* 작성시간 : Thu Apr 16 20:37:52 KST 2009 */