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


public class FC_ACCT_8066_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String records;

	public FC_ACCT_8066_LCURLISTRecord(){}

	public void setRecords(String records){
		this.records = records;
	}

	public String getRecords(){
		return this.records;
	}
}

/* 작성시간 : Thu Aug 06 17:56:46 KST 2015 */