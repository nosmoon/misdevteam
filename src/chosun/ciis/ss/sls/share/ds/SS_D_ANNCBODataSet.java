/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 삭제
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 삭제
 */

public class SS_D_ANNCBODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_D_ANNCBODataSet(){}
	public SS_D_ANNCBODataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_D_ANNCBODataSet ds = (SS_D_ANNCBODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 14:55:56 KST 2009 */