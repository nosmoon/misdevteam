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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String pay_plac_clsf;
	public String prn;
	public String chk_obj_pers_rshp;
	public String ocom_subm_yn;

	public HD_AFFR_2501_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setChk_obj_pers_rshp(String chk_obj_pers_rshp){
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
	}

	public void setOcom_subm_yn(String ocom_subm_yn){
		this.ocom_subm_yn = ocom_subm_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getChk_obj_pers_rshp(){
		return this.chk_obj_pers_rshp;
	}

	public String getOcom_subm_yn(){
		return this.ocom_subm_yn;
	}
}

/* 작성시간 : Mon Jun 29 12:03:00 KST 2009 */