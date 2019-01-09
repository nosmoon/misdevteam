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


public class FC_ACCT_2480_MMEDICDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cccodeval;
	public String cccdnm;
	public String cccdynm;

	public FC_ACCT_2480_MMEDICDLISTRecord(){}

	public void setCccodeval(String cccodeval){
		this.cccodeval = cccodeval;
	}

	public void setCccdnm(String cccdnm){
		this.cccdnm = cccdnm;
	}

	public void setCccdynm(String cccdynm){
		this.cccdynm = cccdynm;
	}

	public String getCccodeval(){
		return this.cccodeval;
	}

	public String getCccdnm(){
		return this.cccdnm;
	}

	public String getCccdynm(){
		return this.cccdynm;
	}
}

/* 작성시간 : Tue Dec 23 17:11:02 KST 2014 */