/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord.java
* 기능 : 확장현황-사이버확장-지급관리-초기화면
* 작성일자 : 2004-04-01
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-사이버확장-지급관리-초기화면
 *
 */

public class SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extncampno;
	public String campnm;

	public SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord(){}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}
}

/* 작성시간 : Thu Apr 01 21:17:07 KST 2004 */