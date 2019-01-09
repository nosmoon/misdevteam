

package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1302_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String hlth_insr_fee;

	public HD_INSR_1302_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}
}

/* 작성시간 : Mon Aug 09 13:42:02 KST 2010 */