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


public class FC_ACCT_2223_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;
	public String slip_aprv_yn;

	public FC_ACCT_2223_SCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}
}

/* �ۼ��ð� : Tue Jul 21 17:39:12 KST 2009 */