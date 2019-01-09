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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_2001_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String reven_amt_1;
	public String expn_amt_1;
	public String bal_amt_1;

	public EN_INNEXP_2001_LCURLIST1Record(){}

	public void setReven_amt_1(String reven_amt_1){
		this.reven_amt_1 = reven_amt_1;
	}

	public void setExpn_amt_1(String expn_amt_1){
		this.expn_amt_1 = expn_amt_1;
	}

	public void setBal_amt_1(String bal_amt_1){
		this.bal_amt_1 = bal_amt_1;
	}

	public String getReven_amt_1(){
		return this.reven_amt_1;
	}

	public String getExpn_amt_1(){
		return this.expn_amt_1;
	}

	public String getBal_amt_1(){
		return this.bal_amt_1;
	}
}

/* 작성시간 : Wed Apr 29 14:49:12 KST 2009 */