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


public class FC_ACCT_8070_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String ern;

	public FC_ACCT_8070_MCURLIST1Record(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public String getErn(){
		return this.ern;
	}
}

/* 작성시간 : Wed Jul 08 16:07:22 KST 2015 */