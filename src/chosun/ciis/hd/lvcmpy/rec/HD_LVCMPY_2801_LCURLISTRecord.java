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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_nm;
	public String posi_nm;
	public String lvcmpy_dt;
	public String mm_avg_charg_amt;
	public String cont_svc_yys;
	public String lvcmpy_amt;
	public String real_lvcmpy_amt;
	public String lvcmpy_clsf;

	public HD_LVCMPY_2801_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setMm_avg_charg_amt(String mm_avg_charg_amt){
		this.mm_avg_charg_amt = mm_avg_charg_amt;
	}

	public void setCont_svc_yys(String cont_svc_yys){
		this.cont_svc_yys = cont_svc_yys;
	}

	public void setLvcmpy_amt(String lvcmpy_amt){
		this.lvcmpy_amt = lvcmpy_amt;
	}

	public void setReal_lvcmpy_amt(String real_lvcmpy_amt){
		this.real_lvcmpy_amt = real_lvcmpy_amt;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getMm_avg_charg_amt(){
		return this.mm_avg_charg_amt;
	}

	public String getCont_svc_yys(){
		return this.cont_svc_yys;
	}

	public String getLvcmpy_amt(){
		return this.lvcmpy_amt;
	}

	public String getReal_lvcmpy_amt(){
		return this.real_lvcmpy_amt;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}
}

/* 작성시간 : Thu May 21 19:10:31 KST 2009 */