/***************************************************************************************************
* ���ϸ� : SE_RCP_5000_MTEAMLISTRecord.java
* ��� : �Ǹ�- �Աݰ��� - �������� - ���Աݸ���
* �ۼ����� : 2009-05-20
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_5000_MTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_RCP_5000_MTEAMLISTRecord(){}

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

/* �ۼ��ð� : Wed May 20 10:08:50 KST 2009 */