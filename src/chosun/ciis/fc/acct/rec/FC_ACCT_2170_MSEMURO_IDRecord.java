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


public class FC_ACCT_2170_MSEMURO_IDRecord extends java.lang.Object implements java.io.Serializable{

	public String semuro_id;

	public FC_ACCT_2170_MSEMURO_IDRecord(){}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}
}

/* 작성시간 : Thu Aug 13 16:28:41 KST 2009 */