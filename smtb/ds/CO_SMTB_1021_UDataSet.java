/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통-세금계산서-상태변경(스마트빌)
* 작성일자 : 2010-03-23
* 작성자 : 노상현
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
 * 공통-세금계산서-상태변경(스마트빌)
 */


public class CO_SMTB_1021_UDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String smart_id;
	public String smart_pw;
	public String batch_id;

	public CO_SMTB_1021_UDataSet(){}
	public CO_SMTB_1021_UDataSet(String errcode, String errmsg, String smart_id, String smart_pw, String batch_id){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.smart_id = smart_id;
		this.smart_pw = smart_pw;
		this.batch_id = batch_id;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}

	public void setSmart_pw(String smart_pw){
		this.smart_pw = smart_pw;
	}

	public void setBatch_id(String batch_id){
		this.batch_id = batch_id;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSmart_id(){
		return this.smart_id;
	}

	public String getSmart_pw(){
		return this.smart_pw;
	}

	public String getBatch_id(){
		return this.batch_id;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.smart_id = Util.checkString(cstmt.getString(7));
		this.smart_pw = Util.checkString(cstmt.getString(8));
		this.batch_id = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SMTB_1021_UDataSet ds = (CO_SMTB_1021_UDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSmart_id()%>
<%= ds.getSmart_pw()%>
<%= ds.getBatch_id()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 17:40:31 KST 2010 */