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


public class FC_ACCT_8001_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String diff_amt;

	public FC_ACCT_8001_LCURLIST2Record(){}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}
}

/* �ۼ��ð� : Thu Jul 30 10:21:50 KST 2009 */