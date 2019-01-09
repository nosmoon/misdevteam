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


package chosun.ciis.co.mng.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.mng.dm.*;
import chosun.ciis.co.mng.rec.*;

/**
 * 
 */


public class CO_MNG_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String page_url;
	public String page_title;
	public String crud;

	public CO_MNG_1020_SDataSet(){}
	public CO_MNG_1020_SDataSet(String errcode, String errmsg, String page_url, String page_title, String crud){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.page_url = page_url;
		this.page_title = page_title;
		this.crud = crud;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPage_url(String page_url){
		this.page_url = page_url;
	}

	public void setPage_title(String page_title){
		this.page_title = page_title;
	}

	public void setCrud(String crud){
		this.crud = crud;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPage_url(){
		return this.page_url;
	}

	public String getPage_title(){
		return this.page_title;
	}

	public String getCrud(){
		return this.crud;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.page_url = Util.checkString(cstmt.getString(6));
		this.page_title = Util.checkString(cstmt.getString(7));
		this.crud = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_MNG_1020_SDataSet ds = (CO_MNG_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPage_url()%>
<%= ds.getPage_title()%>
<%= ds.getCrud()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 17:11:54 KST 2009 */