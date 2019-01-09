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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1300_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_id;
	public String acct_nm;

	public AD_RES_1300_MCURLISTRecord(){}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}
}

/* 작성시간 : Fri Feb 17 11:37:32 KST 2012 */