/***************************************************************************************************
* ���ϸ� : SE_BAS_1400_MDEPTLISTRecord.java
* ��� :  �Ǹ� - �������� - ����� ��� 
 * �ۼ����� : 2009.01.15
 * �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1400_MDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_BAS_1400_MDEPTLISTRecord(){}

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

/* �ۼ��ð� : Thu Jan 15 11:30:23 KST 2009 */