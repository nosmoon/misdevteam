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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1150_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_type;
	public String abrv_nm;
	public String dept_cd;
	public String dept_sub;

	public MT_SUBMATRCLA_1150_LCURLISTRecord(){}

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

/* �ۼ��ð� : Thu Oct 15 17:30:42 KST 2009 */