/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2541_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String dr_amt;

	public FC_ACCT_2541_LCURLISTRecord(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}
}

/* 작성시간 : Tue Apr 28 13:57:03 KST 2009 */