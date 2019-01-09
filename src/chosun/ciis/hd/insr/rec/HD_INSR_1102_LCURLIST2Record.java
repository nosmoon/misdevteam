

package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1102_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String np_slf_ctrb_amt;

	public HD_INSR_1102_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}
}

/* 작성시간 : Thu Aug 05 15:57:25 KST 2010 */