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


public class HD_COM_1004_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String dept_cd;

	public HD_COM_1004_SCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}
}

/* �ۼ��ð� : Tue Feb 17 15:59:56 KST 2009 */