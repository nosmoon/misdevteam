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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_chrg_pers_seq;
	public String chrg_job_clsf;
	public String chrg_job_clsf_nm;
	public String chrg_pers_nm;
	public String ptph_no;
	public String tel_no_1;
	public String fax_no;
	public String email;
	public String kind_erplace_no;
	public String chg_dt_tm;

	public IS_COM_1410_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_chrg_pers_seq(String dlco_chrg_pers_seq){
		this.dlco_chrg_pers_seq = dlco_chrg_pers_seq;
	}

	public void setChrg_job_clsf(String chrg_job_clsf){
		this.chrg_job_clsf = chrg_job_clsf;
	}

	public void setChrg_job_clsf_nm(String chrg_job_clsf_nm){
		this.chrg_job_clsf_nm = chrg_job_clsf_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setKind_erplace_no(String kind_erplace_no){
		this.kind_erplace_no = kind_erplace_no;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_chrg_pers_seq(){
		return this.dlco_chrg_pers_seq;
	}

	public String getChrg_job_clsf(){
		return this.chrg_job_clsf;
	}

	public String getChrg_job_clsf_nm(){
		return this.chrg_job_clsf_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getKind_erplace_no(){
		return this.kind_erplace_no;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Wed May 09 11:26:56 KST 2012 */