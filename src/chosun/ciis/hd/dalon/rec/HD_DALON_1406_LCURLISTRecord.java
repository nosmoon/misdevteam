
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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1406_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String abrv_nm;

	public HD_DALON_1406_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}
}

/* �ۼ��ð� : Fri May 22 10:57:56 KST 2009 */