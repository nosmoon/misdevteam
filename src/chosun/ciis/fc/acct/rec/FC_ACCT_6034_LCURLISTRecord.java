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


public class FC_ACCT_6034_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bill_sender;

	public FC_ACCT_6034_LCURLISTRecord(){}

	public void setBill_sender(String bill_sender){
		this.bill_sender = bill_sender;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* 작성시간 : Thu Sep 17 19:57:22 KST 2009 */