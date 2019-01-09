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


public class FC_ACCT_9900_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String mcd1;
	public String mcd2;

	public FC_ACCT_9900_MCURLIST2Record(){}

	public void setMcd1(String mcd1){
		this.mcd1 = mcd1;
	}

	public void setMcd2(String mcd2){
		this.mcd2 = mcd2;
	}

	public String getMcd1(){
		return this.mcd1;
	}

	public String getMcd2(){
		return this.mcd2;
	}
}

/* 작성시간 : Fri Feb 14 14:05:33 KST 2014 */