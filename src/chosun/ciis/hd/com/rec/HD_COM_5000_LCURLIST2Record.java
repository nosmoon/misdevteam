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


public class HD_COM_5000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public HD_COM_5000_LCURLIST2Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* �ۼ��ð� : Tue Apr 06 14:07:34 KST 2010 */