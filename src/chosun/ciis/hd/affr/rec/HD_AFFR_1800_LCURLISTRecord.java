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


public class HD_AFFR_1800_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String child_flnm;
	public String child_seqo;
	public String child_bidt;
	public String prn;
	public String sply_strt_yymm;
	public String sply_amt;
	public String sply_susp_yn;
	public String last_sply_yymm;
	public String acml_sply_tms;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;

	public HD_AFFR_1800_LCURLISTRecord(){}

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

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setChild_seqo(String child_seqo){
		this.child_seqo = child_seqo;
	}

	public void setChild_bidt(String child_bidt){
		this.child_bidt = child_bidt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setSply_strt_yymm(String sply_strt_yymm){
		this.sply_strt_yymm = sply_strt_yymm;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public void setSply_susp_yn(String sply_susp_yn){
		this.sply_susp_yn = sply_susp_yn;
	}

	public void setLast_sply_yymm(String last_sply_yymm){
		this.last_sply_yymm = last_sply_yymm;
	}

	public void setAcml_sply_tms(String acml_sply_tms){
		this.acml_sply_tms = acml_sply_tms;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
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

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getChild_seqo(){
		return this.child_seqo;
	}

	public String getChild_bidt(){
		return this.child_bidt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSply_strt_yymm(){
		return this.sply_strt_yymm;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}

	public String getSply_susp_yn(){
		return this.sply_susp_yn;
	}

	public String getLast_sply_yymm(){
		return this.last_sply_yymm;
	}

	public String getAcml_sply_tms(){
		return this.acml_sply_tms;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}
}

/* 작성시간 : Fri Apr 03 16:24:17 KST 2009 */