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


public class FC_ACCT_5883_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_dt;

	public FC_ACCT_5883_LCURLISTRecord(){}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}
}

/* 작성시간 : Wed Mar 11 14:31:49 KST 2009 */