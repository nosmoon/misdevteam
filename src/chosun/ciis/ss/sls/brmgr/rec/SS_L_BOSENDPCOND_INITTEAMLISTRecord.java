/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-�����μ���Ȳ �ʱ�ȭ��
* �ۼ����� : 2009-03-06
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-�����μ���Ȳ �ʱ�ȭ��
 */

public class SS_L_BOSENDPCOND_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_BOSENDPCOND_INITTEAMLISTRecord(){}

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

/* �ۼ��ð� : Fri Mar 06 16:23:01 KST 2009 */