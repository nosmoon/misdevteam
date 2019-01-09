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


public class FC_ACCT_2700_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_nm;
	public String before_amt;
	public String dd_amt1;
	public String dd_amt2;
	public String dd_amt3;

	public FC_ACCT_2700_LCURLIST2Record(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBefore_amt(String before_amt){
		this.before_amt = before_amt;
	}

	public void setDd_amt1(String dd_amt1){
		this.dd_amt1 = dd_amt1;
	}

	public void setDd_amt2(String dd_amt2){
		this.dd_amt2 = dd_amt2;
	}

	public void setDd_amt3(String dd_amt3){
		this.dd_amt3 = dd_amt3;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBefore_amt(){
		return this.before_amt;
	}

	public String getDd_amt1(){
		return this.dd_amt1;
	}

	public String getDd_amt2(){
		return this.dd_amt2;
	}

	public String getDd_amt3(){
		return this.dd_amt3;
	}
}

/* 작성시간 : Fri Oct 24 15:37:56 KST 2014 */