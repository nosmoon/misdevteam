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


public class HD_COM_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String abrv_nm;
	public String cnt;

	public HD_COM_1103_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* �ۼ��ð� : Mon Oct 26 19:45:47 KST 2009 */