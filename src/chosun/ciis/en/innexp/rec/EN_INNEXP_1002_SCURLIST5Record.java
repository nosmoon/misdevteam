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


public class EN_INNEXP_1002_SCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String reven_amt;
	public String expn_amt;
	public String bal_amt;

	public EN_INNEXP_1002_SCURLIST5Record(){}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setExpn_amt(String expn_amt){
		this.expn_amt = expn_amt;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getExpn_amt(){
		return this.expn_amt;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}
}

/* 작성시간 : Fri May 22 14:20:59 KST 2009 */