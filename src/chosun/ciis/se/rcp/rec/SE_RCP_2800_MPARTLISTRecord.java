/***************************************************************************************************
* ���ϸ� : SE_RCP_2800_MPARTLISTRecord.java
* ��� : �Ǹ� - �Աݰ��� - �����Աݰ��� - ������ä���뺸
* �ۼ����� : 2009-04-24
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


public class SE_RCP_2800_MPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd		;
	public String dept_nm		;
	public String supr_dept_cd	;

	public SE_RCP_2800_MPARTLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}
}

/* �ۼ��ð� : Fri Apr 24 13:21:16 KST 2009 */