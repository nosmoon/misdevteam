/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String congr_condl_dt;
	public String congr_condl_cd;
	public String congr_condl_nm;
	public String congr_condl_fee;
	public String art_flower;
	public String ofcr_congr_condl_fee;
	public String ofcr_art_flower;
	public String remk;
	public String proc_stat_nm;
	public String proc_clsf;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;

	public HD_AFFR_2220_LCURLISTRecord(){}

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

	public void setCongr_condl_dt(String congr_condl_dt){
		this.congr_condl_dt = congr_condl_dt;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setCongr_condl_nm(String congr_condl_nm){
		this.congr_condl_nm = congr_condl_nm;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setArt_flower(String art_flower){
		this.art_flower = art_flower;
	}

	public void setOfcr_congr_condl_fee(String ofcr_congr_condl_fee){
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
	}

	public void setOfcr_art_flower(String ofcr_art_flower){
		this.ofcr_art_flower = ofcr_art_flower;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
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

	public String getCongr_condl_dt(){
		return this.congr_condl_dt;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getCongr_condl_nm(){
		return this.congr_condl_nm;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getArt_flower(){
		return this.art_flower;
	}

	public String getOfcr_congr_condl_fee(){
		return this.ofcr_congr_condl_fee;
	}

	public String getOfcr_art_flower(){
		return this.ofcr_art_flower;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}
}

/* 작성시간 : Wed Sep 23 09:58:25 KST 2015 */