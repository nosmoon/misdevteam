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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1800_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String dept_nm;
	public String nm_korn;
	public String posi_nm;
	public String occr_dt;
	public String seq;
	public String vaca_clsf;
	public String vaca_dtls_clsf;
	public String vaca_clsf_nm;
	public String vaca_dtls_clsf_nm;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String alvc_use_dt;
	public String remk;
	public String proc_stat;
	public String proc_stat_nm;
	public String incmg_nm_korn;

	public HD_VACA_1800_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public void setVaca_dtls_clsf(String vaca_dtls_clsf){
		this.vaca_dtls_clsf = vaca_dtls_clsf;
	}

	public void setVaca_clsf_nm(String vaca_clsf_nm){
		this.vaca_clsf_nm = vaca_clsf_nm;
	}

	public void setVaca_dtls_clsf_nm(String vaca_dtls_clsf_nm){
		this.vaca_dtls_clsf_nm = vaca_dtls_clsf_nm;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setIncmg_nm_korn(String incmg_nm_korn){
		this.incmg_nm_korn = incmg_nm_korn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getVaca_dtls_clsf(){
		return this.vaca_dtls_clsf;
	}

	public String getVaca_clsf_nm(){
		return this.vaca_clsf_nm;
	}

	public String getVaca_dtls_clsf_nm(){
		return this.vaca_dtls_clsf_nm;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getIncmg_nm_korn(){
		return this.incmg_nm_korn;
	}
}

/* 작성시간 : Wed Dec 02 17:26:41 KST 2009 */