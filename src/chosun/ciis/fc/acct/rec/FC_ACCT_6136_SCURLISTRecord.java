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


public class FC_ACCT_6136_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;

	public FC_ACCT_6136_SCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Tue Sep 15 19:43:14 KST 2009 */