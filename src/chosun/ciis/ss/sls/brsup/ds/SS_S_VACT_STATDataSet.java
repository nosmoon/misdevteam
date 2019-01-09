/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_S_VACT_STATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList currdrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_VACT_STATDataSet(){}
	public SS_S_VACT_STATDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_S_VACT_STATCURRDRLISTRecord rec = new SS_S_VACT_STATCURRDRLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.shftdt = Util.checkString(rset0.getString("shftdt"));
			rec.clamt = rset0.getInt("clamt");
			rec.stats = Util.checkString(rset0.getString("stats"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.tr_no = Util.checkString(rset0.getString("tr_no"));
			this.currdrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_VACT_STATDataSet ds = (SS_S_VACT_STATDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.currdrlist.size(); i++){
		SS_S_VACT_STATCURRDRLISTRecord currdrlistRec = (SS_S_VACT_STATCURRDRLISTRecord)ds.currdrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurrdrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= currdrlistRec.bonm%>
<%= currdrlistRec.rdrnm%>
<%= currdrlistRec.rdr_no%>
<%= currdrlistRec.medinm%>
<%= currdrlistRec.banknm%>
<%= currdrlistRec.acctno%>
<%= currdrlistRec.shftdt%>
<%= currdrlistRec.clamt%>
<%= currdrlistRec.stats%>
<%= currdrlistRec.subsmappli%>
<%= currdrlistRec.tr_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 01 18:33:42 KST 2015 */