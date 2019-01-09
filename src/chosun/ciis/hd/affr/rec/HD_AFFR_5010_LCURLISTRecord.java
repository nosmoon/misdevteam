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


public class HD_AFFR_5010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String certi_clsf;
	public String certi_clsf_name;
	public String occr_dt;
	public String seq;
	public String aplc_dt;
	public String aplc_seq;
	public String issu_num_shet;
	public String usag;
	public String remk;
	public String cntc_plac;
	public String email;
	public String engl_flnm;

	public HD_AFFR_5010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setCerti_clsf_name(String certi_clsf_name){
		this.certi_clsf_name = certi_clsf_name;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAplc_seq(String aplc_seq){
		this.aplc_seq = aplc_seq;
	}

	public void setIssu_num_shet(String issu_num_shet){
		this.issu_num_shet = issu_num_shet;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setEngl_flnm(String engl_flnm){
		this.engl_flnm = engl_flnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getCerti_clsf_name(){
		return this.certi_clsf_name;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAplc_seq(){
		return this.aplc_seq;
	}

	public String getIssu_num_shet(){
		return this.issu_num_shet;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getEmail(){
		return this.email;
	}

	public String getEngl_flnm(){
		return this.engl_flnm;
	}
}

/* 작성시간 : Sun Jun 21 14:01:24 KST 2009 */