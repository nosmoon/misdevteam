/***************************************************************************************************
* ���ϸ� : SE_ETC_1200_MTEAMLISTRecord.java
* ��� : �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1200_MTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd	;
	public String dept_nm	;
	
	public SE_ETC_1200_MTEAMLISTRecord(){}

	public String getDept_cd() {
		return dept_cd;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}

	public String getDept_nm() {
		return dept_nm;
	}

	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}

	
}

/* �ۼ��ð� : Thu Mar 05 09:42:35 KST 2009 */