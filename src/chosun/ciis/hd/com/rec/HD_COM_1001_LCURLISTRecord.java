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


package chosun.ciis.hd.com.rec;

import java.sql.*;
import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.ds.*;

/**
 * 
 */


public class HD_COM_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_type;
	public String abrv_nm;
	public String dept_cd;
	public String dept_sub;

	public HD_COM_1001_LCURLISTRecord(){}

	public void setDept_type(String dept_type){
		this.dept_type = dept_type;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_sub(String dept_sub){
		this.dept_sub = dept_sub;
	}

	public String getDept_type(){
		return this.dept_type;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_sub(){
		return this.dept_sub;
	}
}

/* �ۼ��ð� : Wed Apr 01 14:51:16 KST 2009 */