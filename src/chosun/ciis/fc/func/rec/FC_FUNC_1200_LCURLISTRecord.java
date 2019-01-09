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


public class FC_FUNC_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String totz_dt;

	public FC_FUNC_1200_LCURLISTRecord(){}

	public void setTotz_dt(String totz_dt){
		this.totz_dt = totz_dt;
	}

	public String getTotz_dt(){
		return this.totz_dt;
	}
}

/* 작성시간 : Sat Feb 28 12:49:05 KST 2009 */