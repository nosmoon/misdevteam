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


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통 - 세금계산서 인증서 목록
 */


public class CO_SMTB_1060_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cert_stmtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1060_LDataSet(){}
	public CO_SMTB_1060_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			CO_SMTB_1060_LCERT_STMTLISTRecord rec = new CO_SMTB_1060_LCERT_STMTLISTRecord();
			rec.cert_regno = Util.checkString(rset0.getString("cert_regno"));
			rec.cert_comname = Util.checkString(rset0.getString("cert_comname"));
			rec.userdn = Util.checkString(rset0.getString("userdn"));
			rec.userinfo = Util.checkString(rset0.getString("userinfo"));
			rec.userinfoYn = Util.checkString(rset0.getString("userinfoYn"));
			rec.expiration_dt = Util.checkString(rset0.getString("expiration_dt"));
			this.cert_stmtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SMTB_1060_LDataSet ds = (CO_SMTB_1060_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cert_stmtlist.size(); i++){
		CO_SMTB_1060_LCERT_STMTLISTRecord cert_stmtlistRec = (CO_SMTB_1060_LCERT_STMTLISTRecord)ds.cert_stmtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCert_stmtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cert_stmtlistRec.cert_regno%>
<%= cert_stmtlistRec.cert_comname%>
<%= cert_stmtlistRec.userdn%>
<%= cert_stmtlistRec.userinfo%>
<%= cert_stmtlistRec.expiration_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 17 11:15:59 KST 2011 */