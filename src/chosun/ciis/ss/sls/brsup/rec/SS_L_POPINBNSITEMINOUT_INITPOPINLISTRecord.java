/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
* �ۼ����� : 2009-05-06
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
 */

public class SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public String cicodeval;

	public SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord(){}

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

/* �ۼ��ð� : Wed May 06 13:36:24 PDT 2009 */