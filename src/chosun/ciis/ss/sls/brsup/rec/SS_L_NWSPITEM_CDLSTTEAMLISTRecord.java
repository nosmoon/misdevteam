/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
* �ۼ����� : 2009-04-07
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-�Ź�������ǰ-�԰�-�ʱ�ȭ��
 */

public class SS_L_NWSPITEM_CDLSTTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_NWSPITEM_CDLSTTEAMLISTRecord(){}

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

/* �ۼ��ð� : Tue Apr 07 17:22:12 KST 2009 */