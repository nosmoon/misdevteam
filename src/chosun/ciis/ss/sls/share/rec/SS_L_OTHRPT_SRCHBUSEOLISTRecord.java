/***************************************************************************************************
* ���ϸ� : SS_L_OTHRPT_SRCHBUSEOLISTRecord.java
* ��� : ��������-�����׺���-Ÿ�絿�⺸��-���-�μ��ڵ�,�μ��� ����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
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
 * ��������-�����׺���-Ÿ�絿�⺸��-���-�μ��ڵ�,�μ��� ����� ���� Record
 */


public class SS_L_OTHRPT_SRCHBUSEOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_OTHRPT_SRCHBUSEOLISTRecord(){}

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

/* �ۼ��ð� : Fri Jun 11 20:16:17 KST 2004 */