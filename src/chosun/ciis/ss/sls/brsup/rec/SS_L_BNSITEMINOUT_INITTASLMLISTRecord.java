/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹�������-�ʱ�ȭ��
* �ۼ����� : 2009-04-28
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * �������������ý���-���˹�������-�ʱ�ȭ��
 */

public class SS_L_BNSITEMINOUT_INITTASLMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public SS_L_BNSITEMINOUT_INITTASLMLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* �ۼ��ð� : Tue Apr 28 20:49:48 PDT 2009 */