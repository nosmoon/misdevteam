/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2610_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cyov_bal;
	public String rcpm_amt;
	public String bal;

	public SE_RCP_2610_LCURLIST3Record(){}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getBal(){
		return this.bal;
	}
}

/* �ۼ��ð� : Fri Apr 24 10:55:47 KST 2009 */