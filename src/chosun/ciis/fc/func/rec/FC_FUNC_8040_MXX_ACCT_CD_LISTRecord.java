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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8040_MXX_ACCT_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_abrv_nm;
	public String acct_cd;

	public FC_FUNC_8040_MXX_ACCT_CD_LISTRecord(){}

	public void setAcct_abrv_nm(String acct_abrv_nm){
		this.acct_abrv_nm = acct_abrv_nm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public String getAcct_abrv_nm(){
		return this.acct_abrv_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}
}

/* �ۼ��ð� : Tue Jan 10 09:59:41 KST 2012 */