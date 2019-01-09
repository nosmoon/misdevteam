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


public class FC_ACCT_9011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col1;
	public String col2;

	public FC_ACCT_9011_LCURLISTRecord(){}

	public void setCol1(String col1){
		this.col1 = col1;
	}

	public void setCol2(String col2){
		this.col2 = col2;
	}

	public String getCol1(){
		return this.col1;
	}

	public String getCol2(){
		return this.col2;
	}
}

/* 작성시간 : Thu Jan 22 19:17:49 KST 2009 */