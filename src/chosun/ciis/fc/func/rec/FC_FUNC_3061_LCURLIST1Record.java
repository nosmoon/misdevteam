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


public class FC_FUNC_3061_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dd;
	public String newspap_cash;
	public String newspap_bill_90;
	public String newspap_bill_120;

	public FC_FUNC_3061_LCURLIST1Record(){}

	public void setRcpm_dd(String rcpm_dd){
		this.rcpm_dd = rcpm_dd;
	}

	public void setNewspap_cash(String newspap_cash){
		this.newspap_cash = newspap_cash;
	}

	public void setNewspap_bill_90(String newspap_bill_90){
		this.newspap_bill_90 = newspap_bill_90;
	}

	public void setNewspap_bill_120(String newspap_bill_120){
		this.newspap_bill_120 = newspap_bill_120;
	}

	public String getRcpm_dd(){
		return this.rcpm_dd;
	}

	public String getNewspap_cash(){
		return this.newspap_cash;
	}

	public String getNewspap_bill_90(){
		return this.newspap_bill_90;
	}

	public String getNewspap_bill_120(){
		return this.newspap_bill_120;
	}
}

/* �ۼ��ð� : Tue Mar 31 14:44:45 KST 2009 */