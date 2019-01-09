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


public class FC_ACCT_1053_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cdnm2;

	public FC_ACCT_1053_SCURLISTRecord(){}

	public void setCdnm2(String cdnm2){
		this.cdnm2 = cdnm2;
	}

	public String getCdnm2(){
		return this.cdnm2;
	}
}

/* 작성시간 : Mon Mar 02 10:48:11 KST 2009 */