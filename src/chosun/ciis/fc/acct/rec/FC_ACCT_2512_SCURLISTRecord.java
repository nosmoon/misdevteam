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


public class FC_ACCT_2512_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_nm;

	public FC_ACCT_2512_SCURLISTRecord(){}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}
}

/* 작성시간 : Wed Feb 11 19:23:05 KST 2009 */