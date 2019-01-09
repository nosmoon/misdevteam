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


public class HD_INFO_7200_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String tot_amt;
	public String tmp_crdt_amt;
	public String titl;
	public String actu_slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String proc_stat;

	public HD_INFO_7200_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
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

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTmp_crdt_amt(String tmp_crdt_amt){
		this.tmp_crdt_amt = tmp_crdt_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
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

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTmp_crdt_amt(){
		return this.tmp_crdt_amt;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Thu Apr 25 14:54:40 KST 2013 */