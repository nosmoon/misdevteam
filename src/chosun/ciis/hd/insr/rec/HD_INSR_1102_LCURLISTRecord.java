

package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String slf_burd_amt;
	public String cmpy_burd_amt;
	public String np_slf_ctrb_amt;
	public String np_cmpy_burd_amt;

	public HD_INSR_1102_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_burd_amt(String cmpy_burd_amt){
		this.cmpy_burd_amt = cmpy_burd_amt;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setNp_cmpy_burd_amt(String np_cmpy_burd_amt){
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_burd_amt(){
		return this.cmpy_burd_amt;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getNp_cmpy_burd_amt(){
		return this.np_cmpy_burd_amt;
	}
}

/* 작성시간 : Thu Aug 05 15:57:25 KST 2010 */