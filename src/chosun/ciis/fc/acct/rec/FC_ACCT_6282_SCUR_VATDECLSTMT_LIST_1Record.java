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


public class FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String erplace_cd;
	public String form_no;
	public String form_nm;
	public String make_yn;

	public FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record(){}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setForm_no(String form_no){
		this.form_no = form_no;
	}

	public void setForm_nm(String form_nm){
		this.form_nm = form_nm;
	}

	public void setMake_yn(String make_yn){
		this.make_yn = make_yn;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
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

/* 작성시간 : Mon Jun 23 21:17:17 KST 2014 */