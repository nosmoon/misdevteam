/***************************************************************************************************
* ���ϸ� : SS_SLS_BRSUP_2900_ATEAMLISTRecord.java
* ��� : ��������-������Ȳ-�������-�������������
* �ۼ����� : 2016-05-02
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  ��������-������Ȳ-�������-�������������
**/


public class SS_SLS_BRSUP_2900_ATEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_SLS_BRSUP_2900_ATEAMLISTRecord(){}

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

/* �ۼ��ð� : Tue May 03 18:08:49 KST 2016 */