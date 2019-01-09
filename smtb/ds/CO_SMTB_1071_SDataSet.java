/***************************************************************************************************
* 파일명 : .java
* 기능 : 공통 - 세금계산서 사용자 상세조회 
* 작성일자 : 2011-05-16
* 작성자 : 전병희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통 - 세금계산서 사용자 상세조회
 */


public class CO_SMTB_1071_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String fnd_user;
	public String fnd_regno;
	public String fnd_user_name;
	public String smart_id;
	public String smart_password;
	public String smart_email;

	public CO_SMTB_1071_SDataSet(){}
	public CO_SMTB_1071_SDataSet(String errcode, String errmsg, String fnd_user, String fnd_regno, String fnd_user_name, String smart_id, String smart_password, String smart_email){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.fnd_user = fnd_user;
		this.fnd_regno = fnd_regno;
		this.fnd_user_name = fnd_user_name;
		this.smart_id = smart_id;
		this.smart_password = smart_password;
		this.smart_email = smart_email;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFnd_user(String fnd_user){
		this.fnd_user = fnd_user;
	}

	public void setFnd_regno(String fnd_regno){
		this.fnd_regno = fnd_regno;
	}

	public void setFnd_user_name(String fnd_user_name){
		this.fnd_user_name = fnd_user_name;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}

	public void setSmart_password(String smart_password){
		this.smart_password = smart_password;
	}

	public void setSmart_email(String smart_email){
		this.smart_email = smart_email;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFnd_user(){
		return this.fnd_user;
	}

	public String getFnd_regno(){
		return this.fnd_regno;
	}

	public String getFnd_user_name(){
		return this.fnd_user_name;
	}

	public String getSmart_id(){
		return this.smart_id;
	}

	public String getSmart_password(){
		return this.smart_password;
	}

	public String getSmart_email(){
		return this.smart_email;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.fnd_user = Util.checkString(cstmt.getString(5));
		this.fnd_regno = Util.checkString(cstmt.getString(6));
		this.fnd_user_name = Util.checkString(cstmt.getString(7));
		this.smart_id = Util.checkString(cstmt.getString(8));
		this.smart_password = Util.checkString(cstmt.getString(9));
		this.smart_email = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SMTB_1071_SDataSet ds = (CO_SMTB_1071_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFnd_user()%>
<%= ds.getFnd_regno()%>
<%= ds.getFnd_user_name()%>
<%= ds.getSmart_id()%>
<%= ds.getSmart_password()%>
<%= ds.getSmart_email()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 16 10:51:37 KST 2011 */