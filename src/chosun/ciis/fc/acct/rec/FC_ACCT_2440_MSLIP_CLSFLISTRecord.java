/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2440_MSLIP_CLSFLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cccodeval;
	public String cccdnm;
	public String cccdynm;

	public FC_ACCT_2440_MSLIP_CLSFLISTRecord(){}

	public void setCccodeval(String cccodeval){
		this.cccodeval = cccodeval;
	}

	public void setCccdnm(String cccdnm){
		this.cccdnm = cccdnm;
	}

	public void setCccdynm(String cccdynm){
		this.cccdynm = cccdynm;
	}

	public String getCccodeval(){
		return this.cccodeval;
	}

	public String getCccdnm(){
		return this.cccdnm;
	}

	public String getCccdynm(){
		return this.cccdynm;
	}
}

/* �ۼ��ð� : Fri Jun 26 18:14:40 KST 2009 */