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


public class FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String cd;

	public FC_ACCT_2170_MCUR_SLIP_CLSF_LISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* �ۼ��ð� : Thu Aug 13 16:28:41 KST 2009 */