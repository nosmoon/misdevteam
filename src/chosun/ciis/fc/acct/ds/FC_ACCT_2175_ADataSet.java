/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계 - 전표관리 - 수입결의관리 - 세금계산서조회
* 작성일자 : 2011-04-27
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 재무회계 - 전표관리 - 수입결의관리 - 세금계산서조회
 */

public class FC_ACCT_2175_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String batch_id;
	public String smart_id;
	public String smart_pw;

	public FC_ACCT_2175_ADataSet(){}
	public FC_ACCT_2175_ADataSet(String errcode, String errmsg, String batch_id, String smart_id, String smart_pw){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.batch_id = batch_id;
		this.smart_id = smart_id;
		this.smart_pw = smart_pw;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBatch_id(String batch_id){
		this.batch_id = batch_id;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}

	public void setSmart_pw(String smart_pw){
		this.smart_pw = smart_pw;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBatch_id(){
		return this.batch_id;
	}

	public String getSmart_id(){
		return this.smart_id;
	}

	public String getSmart_pw(){
		return this.smart_pw;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.batch_id = Util.checkString(cstmt.getString(11));
		this.smart_id = Util.checkString(cstmt.getString(12));
		this.smart_pw = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2175_ADataSet ds = (FC_ACCT_2175_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBatch_id()%>
<%= ds.getSmart_id()%>
<%= ds.getSmart_pw()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 03 12:26:51 KST 2011 */