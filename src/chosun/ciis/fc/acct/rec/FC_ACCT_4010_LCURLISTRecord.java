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


public class FC_ACCT_4010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String setoff_reserv_dt;
	public String pch_sgjbcnt;
	public String pch_sgjbwrcnt;

	public FC_ACCT_4010_LCURLISTRecord(){}

	public void setSetoff_reserv_dt(String setoff_reserv_dt){
		this.setoff_reserv_dt = setoff_reserv_dt;
	}

	public void setPch_sgjbcnt(String pch_sgjbcnt){
		this.pch_sgjbcnt = pch_sgjbcnt;
	}

	public void setPch_sgjbwrcnt(String pch_sgjbwrcnt){
		this.pch_sgjbwrcnt = pch_sgjbwrcnt;
	}

	public String getSetoff_reserv_dt(){
		return this.setoff_reserv_dt;
	}

	public String getPch_sgjbcnt(){
		return this.pch_sgjbcnt;
	}

	public String getPch_sgjbwrcnt(){
		return this.pch_sgjbwrcnt;
	}
}

/* �ۼ��ð� : Fri Mar 20 20:32:44 KST 2009 */