/***************************************************************************************************
* ���ϸ� : .java
* ��� : ����/���� Ȯ�� ���� ��� �ʱ�ȭ��(�˾�) 
* �ۼ����� : 2009-05-26
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * ����/���� Ȯ�� ���� ��� �ʱ�ȭ��(�˾�) 
 */

public class SS_L_EXTN_EDURDR_INITCURINSTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String insttcd;
	public String insttnm;

	public SS_L_EXTN_EDURDR_INITCURINSTCDRecord(){}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setInsttnm(String insttnm){
		this.insttnm = insttnm;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getInsttnm(){
		return this.insttnm;
	}
}

/* �ۼ��ð� : Thu May 28 14:40:01 KST 2009 */