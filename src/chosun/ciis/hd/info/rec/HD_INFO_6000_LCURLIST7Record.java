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


public class HD_INFO_6000_LCURLIST7Record extends java.lang.Object implements java.io.Serializable{

	public String qulf_pems_seq;
	public String qulf_pems_cd;
	public String qulf_pems_flnm;
	public String acqr_dt;
	public String mtry_dt;
	public String qulf_no;
	public String qulf_pems_issu_plac_cd;
	public String qulf_pems_issu_plac_flnm;

	public HD_INFO_6000_LCURLIST7Record(){}

	public void setQulf_pems_seq(String qulf_pems_seq){
		this.qulf_pems_seq = qulf_pems_seq;
	}

	public void setQulf_pems_cd(String qulf_pems_cd){
		this.qulf_pems_cd = qulf_pems_cd;
	}

	public void setQulf_pems_flnm(String qulf_pems_flnm){
		this.qulf_pems_flnm = qulf_pems_flnm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setQulf_no(String qulf_no){
		this.qulf_no = qulf_no;
	}

	public void setQulf_pems_issu_plac_cd(String qulf_pems_issu_plac_cd){
		this.qulf_pems_issu_plac_cd = qulf_pems_issu_plac_cd;
	}

	public void setQulf_pems_issu_plac_flnm(String qulf_pems_issu_plac_flnm){
		this.qulf_pems_issu_plac_flnm = qulf_pems_issu_plac_flnm;
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

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getQulf_no(){
		return this.qulf_no;
	}

	public String getQulf_pems_issu_plac_cd(){
		return this.qulf_pems_issu_plac_cd;
	}

	public String getQulf_pems_issu_plac_flnm(){
		return this.qulf_pems_issu_plac_flnm;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */