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


public class FC_ACCT_8999_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String code_name;
	public int code_value;
	public long code_value2;

	public FC_ACCT_8999_LCURLISTRecord(){}

	public void setCode_name(String code_name){
		this.code_name = code_name;
	}

	public void setCode_value(int code_value){
		this.code_value = code_value;
	}

	public void setCode_value2(long code_value2){
		this.code_value2 = code_value2;
	}

	public String getCode_name(){
		return this.code_name;
	}

	public int getCode_value(){
		return this.code_value;
	}

	public long getCode_value2(){
		return this.code_value2;
	}
}

/* 작성시간 : Mon Feb 16 19:48:40 KST 2009 */