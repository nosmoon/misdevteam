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


public class FC_ACCT_6034_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bill_sender;

	public FC_ACCT_6034_LCURLISTRecord(){}

	public void setBill_sender(String bill_sender){
		this.bill_sender = bill_sender;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* �ۼ��ð� : Thu Sep 17 19:57:22 KST 2009 */