/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record extends java.lang.Object implements java.io.Serializable{

	public String form_no;
	public String form_nm;
	public String make_yn;

	public FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record(){}

	public void setForm_no(String form_no){
		this.form_no = form_no;
	}

	public void setForm_nm(String form_nm){
		this.form_nm = form_nm;
	}

	public void setMake_yn(String make_yn){
		this.make_yn = make_yn;
	}

	public String getForm_no(){
		return this.form_no;
	}

	public String getForm_nm(){
		return this.form_nm;
	}

	public String getMake_yn(){
		return this.make_yn;
	}
}

/* 작성시간 : Tue Apr 21 11:14:03 KST 2015 */