

package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1351_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String exst_pay_saly_yy;
	public String exst_pay_saly_no;
	public String retr_rgla_saly;

	public HD_SALY_1351_LCURLISTRecord(){}

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

	public void setExst_pay_saly_yy(String exst_pay_saly_yy){
		this.exst_pay_saly_yy = exst_pay_saly_yy;
	}

	public void setExst_pay_saly_no(String exst_pay_saly_no){
		this.exst_pay_saly_no = exst_pay_saly_no;
	}

	public void setRetr_rgla_saly(String retr_rgla_saly){
		this.retr_rgla_saly = retr_rgla_saly;
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

	public String getExst_pay_saly_yy(){
		return this.exst_pay_saly_yy;
	}

	public String getExst_pay_saly_no(){
		return this.exst_pay_saly_no;
	}

	public String getRetr_rgla_saly(){
		return this.retr_rgla_saly;
	}
}

/* 작성시간 : Mon Apr 04 10:30:37 KST 2011 */