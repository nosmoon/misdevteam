/***************************************************************************************************
* ���ϸ� : .java
* ��� : ����Ȯ�� �ʱ�ȭ 
* �ۼ����� : 2009-07-23
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * ����Ȯ�� �ʱ�ȭ 
 */

public class SS_L_EXTN_HDQT_INITCURONLINECDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_EXTN_HDQT_INITCURONLINECDRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Thu Jul 23 13:32:35 KST 2009 */