/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_YEARLY_SUBS_GETUSERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_YEARLY_SUBS_GETUSERDataSet(){}
	public SS_L_YEARLY_SUBS_GETUSERDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord rec = new SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.nm = Util.checkString(rset0.getString("nm"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			rec.teamnm = Util.checkString(rset0.getString("teamnm"));
			rec.ptph = Util.checkString(rset0.getString("ptph"));
			this.userlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_YEARLY_SUBS_GETUSERDataSet ds = (SS_L_YEARLY_SUBS_GETUSERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.userlist.size(); i++){
		SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord userlistRec = (SS_L_YEARLY_SUBS_GETUSERUSERLISTRecord)ds.userlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUserlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= userlistRec.acct_cd%>
<%= userlistRec.nm%>
<%= userlistRec.cmpycd%>
<%= userlistRec.cmpynm%>
<%= userlistRec.deptcd%>
<%= userlistRec.deptnm%>
<%= userlistRec.teamcd%>
<%= userlistRec.teamnm%>
<%= userlistRec.ptph%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 30 01:41:34 GMT 2013 */