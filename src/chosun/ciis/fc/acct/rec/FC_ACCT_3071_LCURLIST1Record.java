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


public class FC_ACCT_3071_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pch_count;

	public FC_ACCT_3071_LCURLIST1Record(){}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public String getPch_count(){
		return this.pch_count;
	}
}

/* 작성시간 : Wed Feb 18 09:28:39 KST 2009 */