/***************************************************************************************************
* ���ϸ� : SE_SAL_1600_MTEAMLISTRecord.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-14
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1600_MTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_SAL_1600_MTEAMLISTRecord(){}

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

/* �ۼ��ð� : Tue Apr 14 19:43:40 KST 2009 */