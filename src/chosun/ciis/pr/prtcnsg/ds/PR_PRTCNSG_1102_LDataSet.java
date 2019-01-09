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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTCNSG_1102_LDataSet(){}
	public PR_PRTCNSG_1102_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PR_PRTCNSG_1102_LCURLIST1Record rec = new PR_PRTCNSG_1102_LCURLIST1Record();
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			PR_PRTCNSG_1102_LCURLIST2Record rec = new PR_PRTCNSG_1102_LCURLIST2Record();
			rec.paper_uprc = Util.checkString(rset1.getString("paper_uprc"));
			rec.paper_portage = Util.checkString(rset1.getString("paper_portage"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTCNSG_1102_LDataSet ds = (PR_PRTCNSG_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PRTCNSG_1102_LCURLIST1Record curlist1Rec = (PR_PRTCNSG_1102_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PRTCNSG_1102_LCURLIST2Record curlist2Rec = (PR_PRTCNSG_1102_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.pap_std%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.bw_pcnt%>
<%= curlist1Rec.clr_pcnt%>
<%= curlist1Rec.slip_qty%>
<%= curlist2Rec.paper_uprc%>
<%= curlist2Rec.paper_portage%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 12:37:22 KST 2009 */