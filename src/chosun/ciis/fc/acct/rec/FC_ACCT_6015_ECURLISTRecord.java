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


public class FC_ACCT_6015_ECURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sggss_cnt;

	public FC_ACCT_6015_ECURLISTRecord(){}

	public void setSggss_cnt(String sggss_cnt){
		this.sggss_cnt = sggss_cnt;
	}

	public String getSggss_cnt(){
		return this.sggss_cnt;
	}
}

/* 작성시간 : Wed Jul 01 11:12:11 KST 2009 */