/***************************************************************************************************
* ���ϸ� : FC_ACCT_2860_M
* ��� : �Ա�ǥó�������ʱ�
* �ۼ����� : 2009-01-13
* �ۼ��� : ����ǥ
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
 * �Ա�ǥó�������ʱ�
 *
 */

public class FC_ACCT_2860_MRCPM_CLSFCDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cccodeval;
	public String cccdnm;
	public String cccdynm;

	public FC_ACCT_2860_MRCPM_CLSFCDLISTRecord(){}

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

/* �ۼ��ð� : Tue Jan 20 17:04:57 KST 2009 */
