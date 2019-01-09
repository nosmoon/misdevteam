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


public class FC_ACCT_6283_SCUR_VATDECLSTMT_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String form_nm;
	public String from_seq;
	public String file_data;

	public FC_ACCT_6283_SCUR_VATDECLSTMT_LIST_1Record(){}

	public void setForm_nm(String form_nm){
		this.form_nm = form_nm;
	}

	public void setFrom_seq(String from_seq){
		this.from_seq = from_seq;
	}

	public void setFile_data(String file_data){
		this.file_data = file_data;
	}

	public String getForm_nm(){
		return this.form_nm;
	}

	public String getFrom_seq(){
		return this.from_seq;
	}

	public String getFile_data(){
		return this.file_data;
	}
}

/* 작성시간 : Tue Jun 24 10:37:44 KST 2014 */