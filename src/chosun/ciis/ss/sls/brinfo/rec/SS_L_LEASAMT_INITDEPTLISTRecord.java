/***************************************************************************************************
* ���ϸ� : SS_L_LEASAMT_INITDEPTLISTRecord.java
* ��� : ����INFO-������������ȭ-�ʱ� ȭ��(�μ��ڵ���ȸ)
* �ۼ����� : 2004-02-09
* �ۼ��� : �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����INFO-������������Ȳ-�ʱ� ȭ��(�μ���ȸ)
 *
 */


public class SS_L_LEASAMT_INITDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_LEASAMT_INITDEPTLISTRecord(){}

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

/* �ۼ��ð� : Mon Feb 09 16:39:26 KST 2004 */