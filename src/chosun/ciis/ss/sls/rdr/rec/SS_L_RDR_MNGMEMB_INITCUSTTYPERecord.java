/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڰ��� �ʱ�ȭ��
* �ۼ����� : 2009-08-07
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ���ڰ��� �ʱ�ȭ�� 
 */

public class SS_L_RDR_MNGMEMB_INITCUSTTYPERecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_RDR_MNGMEMB_INITCUSTTYPERecord(){}

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

/* �ۼ��ð� : Fri Aug 07 16:31:16 KST 2009 */