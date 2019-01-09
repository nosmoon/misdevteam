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


public class FC_ACCT_5873_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pch_amt6;
	public String pch_amt7;
	public String pch_amt8;
	public String pch_amt9;

	public FC_ACCT_5873_LCURLISTRecord(){}

	public void setPch_amt6(String pch_amt6){
		this.pch_amt6 = pch_amt6;
	}

	public void setPch_amt7(String pch_amt7){
		this.pch_amt7 = pch_amt7;
	}

	public void setPch_amt8(String pch_amt8){
		this.pch_amt8 = pch_amt8;
	}

	public void setPch_amt9(String pch_amt9){
		this.pch_amt9 = pch_amt9;
	}

	public String getPch_amt6(){
		return this.pch_amt6;
	}

	public String getPch_amt7(){
		return this.pch_amt7;
	}

	public String getPch_amt8(){
		return this.pch_amt8;
	}

	public String getPch_amt9(){
		return this.pch_amt9;
	}
}

/* 작성시간 : Wed Mar 11 20:47:28 KST 2009 */