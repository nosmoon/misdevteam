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


public class FC_ACCT_5881_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pch_gbcd;
	public String pch_amt1;
	public String pch_amt2;
	public String pch_amt3;
	public String pch_amt4;

	public FC_ACCT_5881_LCURLISTRecord(){}

	public void setPch_gbcd(String pch_gbcd){
		this.pch_gbcd = pch_gbcd;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public void setPch_amt3(String pch_amt3){
		this.pch_amt3 = pch_amt3;
	}

	public void setPch_amt4(String pch_amt4){
		this.pch_amt4 = pch_amt4;
	}

	public String getPch_gbcd(){
		return this.pch_gbcd;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}

	public String getPch_amt3(){
		return this.pch_amt3;
	}

	public String getPch_amt4(){
		return this.pch_amt4;
	}
}

/* 작성시간 : Wed Mar 11 14:31:49 KST 2009 */