

package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_6100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String posi_nm;
	public String start_mm;
	public String end_mm;
	public String saly_st_mm;
	public String saly_ed_mm;
	public String dedu_amt;
	public String lock_amt;
	public String total_amt;
	public String total_amt2;
	public String saly_proc_yn;

	public HD_SALY_6100_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
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

	public void setSaly_st_mm(String saly_st_mm){
		this.saly_st_mm = saly_st_mm;
	}

	public void setSaly_ed_mm(String saly_ed_mm){
		this.saly_ed_mm = saly_ed_mm;
	}

	public void setDedu_amt(String dedu_amt){
		this.dedu_amt = dedu_amt;
	}

	public void setLock_amt(String lock_amt){
		this.lock_amt = lock_amt;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setTotal_amt2(String total_amt2){
		this.total_amt2 = total_amt2;
	}

	public void setSaly_proc_yn(String saly_proc_yn){
		this.saly_proc_yn = saly_proc_yn;
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

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getStart_mm(){
		return this.start_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getSaly_st_mm(){
		return this.saly_st_mm;
	}

	public String getSaly_ed_mm(){
		return this.saly_ed_mm;
	}

	public String getDedu_amt(){
		return this.dedu_amt;
	}

	public String getLock_amt(){
		return this.lock_amt;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getTotal_amt2(){
		return this.total_amt2;
	}

	public String getSaly_proc_yn(){
		return this.saly_proc_yn;
	}
}

/* 작성시간 : Wed Nov 24 14:30:07 KST 2010 */