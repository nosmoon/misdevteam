/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.smtb.rec;

import java.sql.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 * 
 */


public class CO_SMTB_1060_LCERT_STMTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cert_regno;
	public String cert_comname;
	public String userdn;
	public String userinfo;
	public String userinfoyn;
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

	public void setUserinfoyn(String userinfoyn){
		this.userinfoyn = userinfoyn;
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

	public String getUserinfoyn(){
		return this.userinfoyn;
	}

	public String getExpiration_dt(){
		return this.expiration_dt;
	}
}

/* �ۼ��ð� : Wed Dec 05 11:17:28 KST 2012 */