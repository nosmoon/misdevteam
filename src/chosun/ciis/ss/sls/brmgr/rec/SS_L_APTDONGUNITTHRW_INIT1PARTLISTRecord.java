/***************************************************************************************************
* ���ϸ� : .java
* ��� : �����濵- ����Ʈ������ ���Է� �ʱ�ȭ��
* �ۼ����� : 2009-08-21
* �ۼ��� : ������
***************************************************************************************************/

 
package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵- ����Ʈ������ ���Է� �ʱ�ȭ��
 */

public class SS_L_APTDONGUNITTHRW_INIT1PARTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;

	public SS_L_APTDONGUNITTHRW_INIT1PARTLISTRecord(){}

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

/* �ۼ��ð� : Fri Aug 21 11:03:38 KST 2009 */