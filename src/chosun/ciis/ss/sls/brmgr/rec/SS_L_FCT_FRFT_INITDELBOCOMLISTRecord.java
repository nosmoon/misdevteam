/***************************************************************************************************
* ���ϸ� : SS_L_FCT_FRFT_INITDELBOCOMLISTRecord.java
* ��� : �����濵-������ ����� ��ȸ ȭ��
* �ۼ����� : 2004-03-03
* �ۼ��� : �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-������ ����� ��ȸ ȭ��
 *
 */


public class SS_L_FCT_FRFT_INITDELBOCOMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_FCT_FRFT_INITDELBOCOMLISTRecord(){}

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

/* �ۼ��ð� : Mon Mar 22 16:50:35 KST 2004 */