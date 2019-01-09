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


public class FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String erplace_cd;

	public FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}
}

/* 작성시간 : Thu Jul 09 12:48:09 KST 2015 */