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


public class FC_ACCT_1042_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String min_acct_cd;

	public FC_ACCT_1042_LCURLISTRecord(){}

	public void setMin_acct_cd(String min_acct_cd){
		this.min_acct_cd = min_acct_cd;
	}

	public String getMin_acct_cd(){
		return this.min_acct_cd;
	}
}

/* 작성시간 : Thu Apr 02 09:18:55 KST 2009 */