

package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String posi_cd;
	public String posi_nm;
	public String start_mm;
	public String end_mm;
	public String lock_use_yn;
	public String term;
	public String saly_st_mm;
	public String saly_ed_mm;
	public String cur_used2;
	public String cur_used;
	public String occr_dt;
	public String seq;

	public HD_SALY_6000_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setStart_mm(String start_mm){
		this.start_mm = start_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setLock_use_yn(String lock_use_yn){
		this.lock_use_yn = lock_use_yn;
	}

	public void setTerm(String term){
		this.term = term;
	}

	public void setSaly_st_mm(String saly_st_mm){
		this.saly_st_mm = saly_st_mm;
	}

	public void setSaly_ed_mm(String saly_ed_mm){
		this.saly_ed_mm = saly_ed_mm;
	}

	public void setCur_used2(String cur_used2){
		this.cur_used2 = cur_used2;
	}

	public void setCur_used(String cur_used){
		this.cur_used = cur_used;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getStart_mm(){
		return this.start_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getLock_use_yn(){
		return this.lock_use_yn;
	}

	public String getTerm(){
		return this.term;
	}

	public String getSaly_st_mm(){
		return this.saly_st_mm;
	}

	public String getSaly_ed_mm(){
		return this.saly_ed_mm;
	}

	public String getCur_used2(){
		return this.cur_used2;
	}

	public String getCur_used(){
		return this.cur_used;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Nov 24 13:17:23 KST 2010 */