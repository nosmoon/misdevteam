/***************************************************************************************************
* ���ϸ� : SE_BNS_2000_MPARTLISTRecord.java
* ��� : �Ǹ� - ���˹����� - ���˹� ���ݰ�꼭 ����
* �ۼ����� : 2009-05-01
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_2000_MPARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd		;
	public String dept_nm		;
	public String supr_dept_cd	;

	public SE_BNS_2000_MPARTLISTRecord(){}

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

/* �ۼ��ð� : Fri May 01 13:59:05 KST 2009 */