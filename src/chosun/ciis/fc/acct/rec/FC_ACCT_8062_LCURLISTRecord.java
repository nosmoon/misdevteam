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


public class FC_ACCT_8062_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String soaegcnt;
	public String soaegamt;

	public FC_ACCT_8062_LCURLISTRecord(){}

	public void setSoaegcnt(String soaegcnt){
		this.soaegcnt = soaegcnt;
	}

	public void setSoaegamt(String soaegamt){
		this.soaegamt = soaegamt;
	}

	public String getSoaegcnt(){
		return this.soaegcnt;
	}

	public String getSoaegamt(){
		return this.soaegamt;
	}
}

/* �ۼ��ð� : Thu Jul 09 12:53:40 KST 2015 */