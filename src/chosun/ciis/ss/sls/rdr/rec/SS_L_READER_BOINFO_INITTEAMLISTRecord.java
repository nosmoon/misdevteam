/***************************************************************************************************
* ���ϸ� : .java
* ��� : *����Info-������Ȳ �ʱ�ȭ
* �ۼ����� : 2009-04-24
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ����Info-������Ȳ �ʱ�ȭ
 */

public class SS_L_READER_BOINFO_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_READER_BOINFO_INITTEAMLISTRecord(){}

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

/* �ۼ��ð� : Fri Apr 24 19:15:56 KST 2009 */