/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ-����/����Ȯ�� �ʱ�ȭ��
* �ۼ����� : 2009-05-25
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-����/����Ȯ�� �ʱ�ȭ��
 */

public class SS_L_EXTN_EDU_INITCURJEHUCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_EXTN_EDU_INITCURJEHUCDRecord(){}

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

/* �ۼ��ð� : Mon May 25 19:46:41 KST 2009 */