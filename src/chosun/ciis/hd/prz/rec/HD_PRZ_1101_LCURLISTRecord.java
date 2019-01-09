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


public class HD_PRZ_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String req_pers_flnm;
	public String aplc_clsf;
	public String aplc_clsf_nm;
	public String obj_clsf;
	public String obj_clsf_nm;
	public String aplc_dt;
	public String req_pers_dept_nm;
	public String case_nm;
	public String atic_pubc_dt;
	public String atic_pubc_side;
	public String clas_clsf_cd;
	public String clas_clsf_nm;
	public String dtls_cont;
	public String emp_no;
	public String flnm;
	public String dept_nm;
	public String tms;
	public String prv_insp_dt;
	public String prv_insp_ocom;
	public String prv_insp_ocom_nm;
	public String prv_insp_resn;
	public String main_insp_dt;
	public String main_insp_ocom;
	public String main_insp_ocom_nm;
	public String prz_cd;
	public String prz_nm;
	public String prz_pnsh_cd;
	public String prz_pnsh_nm;
	public String prz_resn_cd;
	public String prz_resn_nm;
	public String prz_grad;
	public String prz_amt;
	public String atic_add_file_nm;

	public HD_PRZ_1101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setReq_pers_flnm(String req_pers_flnm){
		this.req_pers_flnm = req_pers_flnm;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setAplc_clsf_nm(String aplc_clsf_nm){
		this.aplc_clsf_nm = aplc_clsf_nm;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setObj_clsf_nm(String obj_clsf_nm){
		this.obj_clsf_nm = obj_clsf_nm;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
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
	
	public void setClas_clsf_cd(String clas_clsf_cd){
		this.clas_clsf_cd = clas_clsf_cd;
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

	public void setPrv_insp_ocom_nm(String prv_insp_ocom_nm){
		this.prv_insp_ocom_nm = prv_insp_ocom_nm;
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

	public void setMain_insp_ocom_nm(String main_insp_ocom_nm){
		this.main_insp_ocom_nm = main_insp_ocom_nm;
	}

	public void setPrz_cd(String prz_cd){
		this.prz_cd = prz_cd;
	}

	public void setPrz_nm(String prz_nm){
		this.prz_nm = prz_nm;
	}

	public void setPrz_pnsh_cd(String prz_pnsh_cd){
		this.prz_pnsh_cd = prz_pnsh_cd;
	}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setPrz_resn_cd(String prz_resn_cd){
		this.prz_resn_cd = prz_resn_cd;
	}

	public void setPrz_resn_nm(String prz_resn_nm){
		this.prz_resn_nm = prz_resn_nm;
	}

	public void setPrz_grad(String prz_grad){
		this.prz_grad = prz_grad;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setAtic_add_file_nm(String atic_add_file_nm){
		this.atic_add_file_nm = atic_add_file_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getReq_pers_flnm(){
		return this.req_pers_flnm;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getAplc_clsf_nm(){
		return this.aplc_clsf_nm;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getObj_clsf_nm(){
		return this.obj_clsf_nm;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
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
	
	public String getClas_clsf_cd(){
		return this.clas_clsf_cd;
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

	public String getPrv_insp_ocom_nm(){
		return this.prv_insp_ocom_nm;
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

	public String getMain_insp_ocom_nm(){
		return this.main_insp_ocom_nm;
	}

	public String getPrz_cd(){
		return this.prz_cd;
	}

	public String getPrz_nm(){
		return this.prz_nm;
	}

	public String getPrz_pnsh_cd(){
		return this.prz_pnsh_cd;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getPrz_resn_cd(){
		return this.prz_resn_cd;
	}

	public String getPrz_resn_nm(){
		return this.prz_resn_nm;
	}

	public String getPrz_grad(){
		return this.prz_grad;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getAtic_add_file_nm(){
		return this.atic_add_file_nm;
	}
}

/* 작성시간 : Thu Aug 20 15:52:42 KST 2009 */