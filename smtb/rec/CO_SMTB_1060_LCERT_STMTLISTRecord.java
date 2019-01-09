/***************************************************************************************************
* 파일명 : .java
* 기능 : 공통 - 세금계산서 인증서 목록
* 작성일자 : 2011-05-16
* 작성자 : 전병희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.rec;

import java.sql.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 * 공통 - 세금계산서 인증서 목록
 */


public class CO_SMTB_1060_LCERT_STMTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cert_regno;
	public String cert_comname;
	public String userdn;
	public String userinfo;
	public String userinfoYn;
	public String expiration_dt;

	public CO_SMTB_1060_LCERT_STMTLISTRecord(){}

	public void setCert_regno(String cert_regno){
		this.cert_regno = cert_regno;
	}

	public void setCert_comname(String cert_comname){
		this.cert_comname = cert_comname;
	}

	public void setUserdn(String userdn){
		this.userdn = userdn;
	}

	public void setUserinfo(String userinfo){
		this.userinfo = userinfo;
	}
	
	public void setUserinfoYn(String userinfoYn){
		this.userinfoYn = userinfoYn;
	}

	public void setExpiration_dt(String expiration_dt){
		this.expiration_dt = expiration_dt;
	}

	public String getCert_regno(){
		return this.cert_regno;
	}

	public String getCert_comname(){
		return this.cert_comname;
	}

	public String getUserdn(){
		return this.userdn;
	}

	public String getUserinfo(){
		return this.userinfo;
	}
	
	public String getUserinfoYn(){
		return this.userinfoYn;
	}
	
	public String getExpiration_dt(){
		return this.expiration_dt;
	}
}

/* 작성시간 : Tue May 17 11:15:59 KST 2011 */