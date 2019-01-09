/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무 확정대상연결 (목록조회)
* 작성일자 : 2015.01.05
* 작성자 : 이혁
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


public class FC_ACCT_2641_LGRPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String nm;

	public FC_ACCT_2641_LGRPLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getNm(){
		return this.nm;
	}
}

/* 작성시간 : Mon Jan 05 17:39:06 KST 2015 */