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


package chosun.ciis.hd.prz.rec;

import java.sql.*;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.ds.*;

/**
 * 
 */


public class HD_PRZ_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String aplc_clsf_nm;
	public String obj_clsf_nm;
	public String aplc_dt;
	public String req_pers_flnm;
	public String req_pers_dept_nm;
	public String case_nm;
	public String atic_pubc_dt;
	public String atic_pubc_side;
	public String clas_clsf_nm;
	public String dtls_cont;
	public String emp_no;
	public String flnm;
	public String superdept_nm;
	public String dept_nm;
	public String tms;
	public String prv_insp_dt;
	public String prv_insp_ocom;
	public String prv_insp_resn;
	public String main_insp_dt;
	public String main_insp_ocom;
	public String prz_pnsh_cd_nm;
	public String prz_grad;
	public String prz_amt;

	public HD_PRZ_1301_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setAplc_clsf_nm(String aplc_clsf_nm){
		this.aplc_clsf_nm = aplc_clsf_nm;
	}

	public void setObj_clsf_nm(String obj_clsf_nm){
		this.obj_clsf_nm = obj_clsf_nm;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setReq_pers_flnm(String req_pers_flnm){
		this.req_pers_flnm = req_pers_flnm;
	}

	public void setReq_pers_dept_nm(String req_pers_dept_nm){
		this.req_pers_dept_nm = req_pers_dept_nm;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setAtic_pubc_dt(String atic_pubc_dt){
		this.atic_pubc_dt = atic_pubc_dt;
	}

	public void setAtic_pubc_side(String atic_pubc_side){
		this.atic_pubc_side = atic_pubc_side;
	}
	
	public void setClas_clsf_nm(String clas_clsf_nm){
		this.clas_clsf_nm = clas_clsf_nm;
	}
	
	public void setDtls_cont(String dtls_cont){
		this.dtls_cont = dtls_cont;
	}
	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSuperdept_nm(String superdept_nm){
		this.superdept_nm = superdept_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setPrv_insp_dt(String prv_insp_dt){
		this.prv_insp_dt = prv_insp_dt;
	}

	public void setPrv_insp_ocom(String prv_insp_ocom){
		this.prv_insp_ocom = prv_insp_ocom;
	}

	public void setPrv_insp_resn(String prv_insp_resn){
		this.prv_insp_resn = prv_insp_resn;
	}

	public void setMain_insp_dt(String main_insp_dt){
		this.main_insp_dt = main_insp_dt;
	}

	public void setMain_insp_ocom(String main_insp_ocom){
		this.main_insp_ocom = main_insp_ocom;
	}

	public void setPrz_pnsh_cd_nm(String prz_pnsh_cd_nm){
		this.prz_pnsh_cd_nm = prz_pnsh_cd_nm;
	}

	public void setPrz_grad(String prz_grad){
		this.prz_grad = prz_grad;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getAplc_clsf_nm(){
		return this.aplc_clsf_nm;
	}

	public String getObj_clsf_nm(){
		return this.obj_clsf_nm;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getReq_pers_flnm(){
		return this.req_pers_flnm;
	}
	
	public String getReq_pers_dept_nm(){
		return this.req_pers_dept_nm;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getAtic_pubc_dt(){
		return this.atic_pubc_dt;
	}

	public String getAtic_pubc_side(){
		return this.atic_pubc_side;
	}
	
	public String getClas_clsf_nm(){
		return this.clas_clsf_nm;
	}
	
	public String getDtls_cont(){
		return this.dtls_cont;
	}
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSuperdept_nm(){
		return this.superdept_nm;
	}
	
	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getPrv_insp_dt(){
		return this.prv_insp_dt;
	}

	public String getPrv_insp_ocom(){
		return this.prv_insp_ocom;
	}

	public String getPrv_insp_resn(){
		return this.prv_insp_resn;
	}

	public String getMain_insp_dt(){
		return this.main_insp_dt;
	}

	public String getMain_insp_ocom(){
		return this.main_insp_ocom;
	}

	public String getPrz_pnsh_cd_nm(){
		return this.prz_pnsh_cd_nm;
	}

	public String getPrz_grad(){
		return this.prz_grad;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}
}

/* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */