/***************************************************************************************************
* ���ϸ� : SS_L_INFOEXG_INITBUSEOLISTRecord.java
* ��� : �������� �Խ��� �ʱ�ȭ�� ����Ʈ
* �ۼ����� : 2004-05-18
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * �������� �Խ��� �ʱ�ȭ�� ����Ʈ
 *
 */

public class SS_L_INFOEXG_INITBUSEOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_INFOEXG_INITBUSEOLISTRecord(){}

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

/* �ۼ��ð� : Tue May 18 16:37:41 KST 2004 */