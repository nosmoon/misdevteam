/***************************************************************************************************
* ���ϸ� : SS_MO_L_LOGINAPLC_INITTEAMLISTRecord.java
* ��� :   ������-����ϰ���-�α��ν��ν�û �ʱ�ȭ���� ���� Record
* �ۼ����� : 2016-09-22
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *  ������-����ϰ���-�α��ν��ν�û �ʱ�ȭ���� ���� Record
 */


public class SS_MO_L_LOGINAPLC_INITTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_MO_L_LOGINAPLC_INITTEAMLISTRecord(){}

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

/* �ۼ��ð� : Thu Sep 22 11:22:28 KST 2016 */