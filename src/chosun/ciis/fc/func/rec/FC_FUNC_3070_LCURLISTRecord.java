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


public class FC_FUNC_3070_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fund_cd;
	public String fund_cdnm;
	public String pay_condition;
	public String pay_amt;

	public FC_FUNC_3070_LCURLISTRecord(){}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setFund_cdnm(String fund_cdnm){
		this.fund_cdnm = fund_cdnm;
	}

	public void setPay_condition(String pay_condition){
		this.pay_condition = pay_condition;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getFund_cdnm(){
		return this.fund_cdnm;
	}

	public String getPay_condition(){
		return this.pay_condition;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* �ۼ��ð� : Fri Mar 27 13:49:59 KST 2009 */