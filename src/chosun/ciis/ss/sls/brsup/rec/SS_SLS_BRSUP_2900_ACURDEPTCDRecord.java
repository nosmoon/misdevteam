/***************************************************************************************************
* ���ϸ� : SS_SLS_BRSUP_2900_ACURDEPTCDRecord.java
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


public class SS_SLS_BRSUP_2900_ACURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_SLS_BRSUP_2900_ACURDEPTCDRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* �ۼ��ð� : Tue May 03 18:08:49 KST 2016 */