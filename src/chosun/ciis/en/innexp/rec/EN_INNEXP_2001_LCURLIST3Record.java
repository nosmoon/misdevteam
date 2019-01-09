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


public class EN_INNEXP_2001_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String reven_amt_3;
	public String expn_amt_3;
	public String bal_amt_3;

	public EN_INNEXP_2001_LCURLIST3Record(){}

	public void setReven_amt_3(String reven_amt_3){
		this.reven_amt_3 = reven_amt_3;
	}

	public void setExpn_amt_3(String expn_amt_3){
		this.expn_amt_3 = expn_amt_3;
	}

	public void setBal_amt_3(String bal_amt_3){
		this.bal_amt_3 = bal_amt_3;
	}

	public String getReven_amt_3(){
		return this.reven_amt_3;
	}

	public String getExpn_amt_3(){
		return this.expn_amt_3;
	}

	public String getBal_amt_3(){
		return this.bal_amt_3;
	}
}

/* 작성시간 : Wed Apr 29 14:49:12 KST 2009 */