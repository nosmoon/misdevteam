/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �Ӵ� ����� ���� - ����ȸ
* �ۼ����� : 2010-06-07
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * �Ӵ������ ���� - ����ȸ
 */


public class AS_LEAS_1303_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cash_sub_seq;
	public String cash_rcpm_amt;

	public AS_LEAS_1303_SCURLIST2Record(){}

	public void setCash_sub_seq(String cash_sub_seq){
		this.cash_sub_seq = cash_sub_seq;
	}

	public void setCash_rcpm_amt(String cash_rcpm_amt){
		this.cash_rcpm_amt = cash_rcpm_amt;
	}

	public String getCash_sub_seq(){
		return this.cash_sub_seq;
	}

	public String getCash_rcpm_amt(){
		return this.cash_rcpm_amt;
	}
}

/* �ۼ��ð� : Mon Jun 14 19:56:40 KST 2010 */