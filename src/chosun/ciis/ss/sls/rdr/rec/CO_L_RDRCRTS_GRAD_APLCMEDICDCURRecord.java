/***************************************************************************************************
* ���ϸ� : CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord.java
* ��� : ������Ȳ-���ڵ�޺ο�
* �ۼ����� : 2005-02-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ-���ڵ�޺ο�
 */


public class CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord(){}

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

/* �ۼ��ð� : Tue Feb 22 10:22:58 KST 2005 */