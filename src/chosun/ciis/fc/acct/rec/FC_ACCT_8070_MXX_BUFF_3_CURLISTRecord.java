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


public class FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String erplace_cd;

	public FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}
}

/* �ۼ��ð� : Thu Jul 09 12:48:09 KST 2015 */