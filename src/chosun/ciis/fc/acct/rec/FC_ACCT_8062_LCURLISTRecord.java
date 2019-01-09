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


public class FC_ACCT_8062_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String soaegcnt;
	public String soaegamt;

	public FC_ACCT_8062_LCURLISTRecord(){}

	public void setSoaegcnt(String soaegcnt){
		this.soaegcnt = soaegcnt;
	}

	public void setSoaegamt(String soaegamt){
		this.soaegamt = soaegamt;
	}

	public String getSoaegcnt(){
		return this.soaegcnt;
	}

	public String getSoaegamt(){
		return this.soaegamt;
	}
}

/* 작성시간 : Thu Jul 09 12:53:40 KST 2015 */