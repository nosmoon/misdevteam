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


public class FC_ACCT_9998_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String code_name;
	public long code_value;

	public FC_ACCT_9998_LCURLISTRecord(){}

	public void setCode_name(String code_name){
		this.code_name = code_name;
	}

	public void setCode_value(long code_value){
		this.code_value = code_value;
	}

	public String getCode_name(){
		return this.code_name;
	}

	public long getCode_value(){
		return this.code_value;
	}
}

/* 작성시간 : Mon Feb 16 18:53:04 KST 2009 */