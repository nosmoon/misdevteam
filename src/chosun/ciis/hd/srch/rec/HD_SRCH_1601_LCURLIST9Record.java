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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1601_LCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String real_wrk_term;

	public HD_SRCH_1601_LCURLIST9Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setReal_wrk_term(String real_wrk_term){
		this.real_wrk_term = real_wrk_term;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getReal_wrk_term(){
		return this.real_wrk_term;
	}
}

/* 작성시간 : Thu Oct 08 18:16:01 KST 2009 */