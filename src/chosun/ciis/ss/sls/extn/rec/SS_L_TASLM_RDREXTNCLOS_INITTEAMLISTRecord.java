/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ - ����Ȯ�帶�� ��� �ʱ�ȭ 
* �ۼ����� : 2009-08-26
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ - ����Ȯ�帶�� ��� �ʱ�ȭ 
 */

public class SS_L_TASLM_RDREXTNCLOS_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_TASLM_RDREXTNCLOS_INITTEAMLISTRecord(){}

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

/* �ۼ��ð� : Wed Aug 26 17:39:52 KST 2009 */