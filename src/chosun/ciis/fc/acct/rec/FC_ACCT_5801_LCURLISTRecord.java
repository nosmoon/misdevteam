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


public class FC_ACCT_5801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acctym;
	public String prvdd_bal;
	public String dr_amt;
	public String crdt_amt;
	public String curdd_bal;

	public FC_ACCT_5801_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcctym(String acctym){
		this.acctym = acctym;
	}

	public void setPrvdd_bal(String prvdd_bal){
		this.prvdd_bal = prvdd_bal;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setCurdd_bal(String curdd_bal){
		this.curdd_bal = curdd_bal;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcctym(){
		return this.acctym;
	}

	public String getPrvdd_bal(){
		return this.prvdd_bal;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getCurdd_bal(){
		return this.curdd_bal;
	}
}

/* �ۼ��ð� : Tue Mar 10 20:37:48 KST 2009 */