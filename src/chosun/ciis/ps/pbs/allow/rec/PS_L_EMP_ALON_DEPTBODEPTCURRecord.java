/***************************************************************************************************
* ���ϸ� : SP_PS_L_EMP_ALON_DEPT.java
* ����-������� ���纰 �μ��ڵ�
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����-������� ���纰 �μ��ڵ� ��ȸȭ��  
 *
 */ 

 

public class PS_L_EMP_ALON_DEPTBODEPTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PS_L_EMP_ALON_DEPTBODEPTCURRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* �ۼ��ð� : Mon Mar 08 14:54:16 KST 2004 */