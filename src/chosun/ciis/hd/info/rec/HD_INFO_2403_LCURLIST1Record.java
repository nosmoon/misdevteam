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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2403_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String dept_cd;
	public String cmpy_cd;
	public String nm_korn;

	public HD_INFO_2403_LCURLIST1Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}
}

/* �ۼ��ð� : Mon Jul 13 10:57:21 KST 2009 */