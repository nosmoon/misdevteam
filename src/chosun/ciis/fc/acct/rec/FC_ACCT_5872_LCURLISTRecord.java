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


public class FC_ACCT_5872_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pch_amt5;

	public FC_ACCT_5872_LCURLISTRecord(){}

	public void setPch_amt5(String pch_amt5){
		this.pch_amt5 = pch_amt5;
	}

	public String getPch_amt5(){
		return this.pch_amt5;
	}
}

/* 작성시간 : Wed Mar 11 20:47:28 KST 2009 */