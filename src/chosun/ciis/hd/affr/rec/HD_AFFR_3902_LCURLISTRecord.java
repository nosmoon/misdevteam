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


public class HD_AFFR_3902_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String aplc_dt;
	public String acq_pers;
	public String start_plac;
	public String ariv_plac;
	public String use_purp;
	public String cont_item;
	public String remk;
	public String aplc_cnfm_yn;
	public String aplc_cnfm_ynnm;

	public HD_AFFR_3902_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAcq_pers(String acq_pers){
		this.acq_pers = acq_pers;
	}

	public void setStart_plac(String start_plac){
		this.start_plac = start_plac;
	}

	public void setAriv_plac(String ariv_plac){
		this.ariv_plac = ariv_plac;
	}

	public void setUse_purp(String use_purp){
		this.use_purp = use_purp;
	}

	public void setCont_item(String cont_item){
		this.cont_item = cont_item;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplc_cnfm_yn(String aplc_cnfm_yn){
		this.aplc_cnfm_yn = aplc_cnfm_yn;
	}

	public void setAplc_cnfm_ynnm(String aplc_cnfm_ynnm){
		this.aplc_cnfm_ynnm = aplc_cnfm_ynnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAcq_pers(){
		return this.acq_pers;
	}

	public String getStart_plac(){
		return this.start_plac;
	}

	public String getAriv_plac(){
		return this.ariv_plac;
	}

	public String getUse_purp(){
		return this.use_purp;
	}

	public String getCont_item(){
		return this.cont_item;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAplc_cnfm_yn(){
		return this.aplc_cnfm_yn;
	}

	public String getAplc_cnfm_ynnm(){
		return this.aplc_cnfm_ynnm;
	}
}

/* 작성시간 : Tue Dec 11 09:50:47 KST 2018 */