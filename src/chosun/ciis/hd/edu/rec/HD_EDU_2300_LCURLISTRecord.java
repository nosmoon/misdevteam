/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_2300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_nm;
	public int lang_aprv_tms;

	public HD_EDU_2300_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setLang_aprv_tms(int lang_aprv_tms){
		this.lang_aprv_tms = lang_aprv_tms;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public int getLang_aprv_tms(){
		return this.lang_aprv_tms;
	}
}

/* �ۼ��ð� : Wed Sep 12 18:00:24 KST 2018 */