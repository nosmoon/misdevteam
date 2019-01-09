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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1722_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String rnum;
	public String tms;
	public String emp_no;
	public String flnm;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String insr_amt_recp_resn;
	public String rela_spc_agrmnt;
	public String recp_insr_amt;
	public String dlay_int;
	public String clam_resn_occr_dt;
	public String insr_amt_recp_dt;
	public String remk;

	public HD_INSR_1722_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setTms(String tms){
		this.tms = tms;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setInsr_amt_recp_resn(String insr_amt_recp_resn){
		this.insr_amt_recp_resn = insr_amt_recp_resn;
	}

	public void setRela_spc_agrmnt(String rela_spc_agrmnt){
		this.rela_spc_agrmnt = rela_spc_agrmnt;
	}

	public void setRecp_insr_amt(String recp_insr_amt){
		this.recp_insr_amt = recp_insr_amt;
	}

	public void setDlay_int(String dlay_int){
		this.dlay_int = dlay_int;
	}

	public void setClam_resn_occr_dt(String clam_resn_occr_dt){
		this.clam_resn_occr_dt = clam_resn_occr_dt;
	}

	public void setInsr_amt_recp_dt(String insr_amt_recp_dt){
		this.insr_amt_recp_dt = insr_amt_recp_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getRnum(){
		return this.rnum;
	}

	public String getTms(){
		return this.tms;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getInsr_amt_recp_resn(){
		return this.insr_amt_recp_resn;
	}

	public String getRela_spc_agrmnt(){
		return this.rela_spc_agrmnt;
	}

	public String getRecp_insr_amt(){
		return this.recp_insr_amt;
	}

	public String getDlay_int(){
		return this.dlay_int;
	}

	public String getClam_resn_occr_dt(){
		return this.clam_resn_occr_dt;
	}

	public String getInsr_amt_recp_dt(){
		return this.insr_amt_recp_dt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue May 19 16:42:17 KST 2009 */