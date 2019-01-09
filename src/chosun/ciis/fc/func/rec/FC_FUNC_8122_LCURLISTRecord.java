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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8122_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String leas_no;
	public String leas_nm;

	public FC_FUNC_8122_LCURLISTRecord(){}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}
}

/* 작성시간 : Mon Apr 20 18:10:37 KST 2009 */