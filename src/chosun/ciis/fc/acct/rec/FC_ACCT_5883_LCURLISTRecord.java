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


public class FC_ACCT_5883_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_dt;

	public FC_ACCT_5883_LCURLISTRecord(){}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}
}

/* �ۼ��ð� : Wed Mar 11 14:31:49 KST 2009 */