/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹������Ȳ-����ȸȭ��-����߰�
* �ۼ����� : 2009-05-08
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * �������������ý��� ���˹������Ȳ ����ȸ ����߰��˾�
 */

public class SS_L_POPOUTBNSITEM_INITPOPOUTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public String cicodeval;

	public SS_L_POPOUTBNSITEM_INITPOPOUTLISTRecord(){}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}
}

/* �ۼ��ð� : Fri May 08 17:12:58 PDT 2009 */