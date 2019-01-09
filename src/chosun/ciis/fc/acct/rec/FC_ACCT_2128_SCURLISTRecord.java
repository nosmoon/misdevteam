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


public class FC_ACCT_2128_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_amt;

	public FC_ACCT_2128_SCURLISTRecord(){}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}
}

/* 작성시간 : Fri Aug 14 16:40:59 KST 2009 */