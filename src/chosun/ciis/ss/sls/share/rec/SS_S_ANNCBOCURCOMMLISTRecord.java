/***************************************************************************************************
* ���ϸ� : .java
* ��� : ��������-�ǽð�����-�������� ����ȸ
* �ۼ����� : 2009-04-16
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��������-�ǽð�����-�������� ����ȸ
 */

public class SS_S_ANNCBOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_ANNCBOCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Thu Apr 16 15:05:47 KST 2009 */