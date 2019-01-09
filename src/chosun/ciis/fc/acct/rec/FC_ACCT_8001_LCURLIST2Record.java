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


public class FC_ACCT_8001_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String diff_amt;

	public FC_ACCT_8001_LCURLIST2Record(){}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}
}

/* 작성시간 : Thu Jul 30 10:21:50 KST 2009 */