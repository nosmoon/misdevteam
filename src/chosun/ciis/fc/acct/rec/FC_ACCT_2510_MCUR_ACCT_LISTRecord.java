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


public class FC_ACCT_2510_MCUR_ACCT_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acct_abrv_nm;

	public FC_ACCT_2510_MCUR_ACCT_LISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_abrv_nm(String acct_abrv_nm){
		this.acct_abrv_nm = acct_abrv_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_abrv_nm(){
		return this.acct_abrv_nm;
	}
}

/* �ۼ��ð� : Tue Jan 03 13:31:35 KST 2012 */