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

public class SS_L_APTDONGUNITTHRW_INIT1TEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_APTDONGUNITTHRW_INIT1TEAMLISTRecord(){}

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

/* �ۼ��ð� : Fri Aug 21 11:03:38 KST 2009 */