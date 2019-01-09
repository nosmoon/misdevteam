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


public class FC_ACCT_2351_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_seq;

	public FC_ACCT_2351_LCURLISTRecord(){}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Thu Apr 16 16:26:02 KST 2009 */