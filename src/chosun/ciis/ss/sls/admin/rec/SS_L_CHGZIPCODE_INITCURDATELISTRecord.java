/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������-��纰 �����ȣ ����ó��-�ʱ�ȭ��
* �ۼ����� : 2009-04-28
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-��纰 �����ȣ ����ó��-�ʱ�ȭ��
 */

public class SS_L_CHGZIPCODE_INITCURDATELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String workver;
	public String workvernm;

	public SS_L_CHGZIPCODE_INITCURDATELISTRecord(){}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public void setWorkvernm(String workvernm){
		this.workvernm = workvernm;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getWorkvernm(){
		return this.workvernm;
	}
}

/* �ۼ��ð� : Tue Apr 28 09:46:54 KST 2009 */