/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_9003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String asst_evlu_pers_emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;

	public HD_EVLU_9003_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAsst_evlu_pers_emp_no(String asst_evlu_pers_emp_no){
		this.asst_evlu_pers_emp_no = asst_evlu_pers_emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAsst_evlu_pers_emp_no(){
		return this.asst_evlu_pers_emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}
}

/* 작성시간 : Mon May 04 18:21:26 KST 2009 */