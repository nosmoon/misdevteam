/***************************************************************************************************
* ���ϸ� : .java
* ��� : *����Info-�߼۳뼱(�ʱ�ȭ��)
* �ۼ����� : 2009-06-11
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-�߼۳뼱(�ʱ�ȭ��)
 */

public class SS_L_BSNS_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_BSNS_INITTEAMLISTRecord(){}

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

/* �ۼ��ð� : Thu Jun 11 15:37:51 KST 2009 */