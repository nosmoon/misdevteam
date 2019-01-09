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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_4120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_4120_LDataSet(){}
	public TN_LNK_4120_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_LNK_4120_LCURLIST1Record rec = new TN_LNK_4120_LCURLIST1Record();
			rec.umsidx = Util.checkString(rset0.getString("umsidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.purpose = Util.checkString(rset0.getString("purpose"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.sendtype = Util.checkString(rset0.getString("sendtype"));
			rec.startdate = Util.checkString(rset0.getString("startdate"));
			rec.enddate = Util.checkString(rset0.getString("enddate"));
			rec.remk1 = Util.checkString(rset0.getString("remk1"));
			rec.remk2 = Util.checkString(rset0.getString("remk2"));
			rec.sendcontents = Util.checkString(rset0.getString("sendcontents"));
			rec.isreserved = Util.checkString(rset0.getString("isreserved"));
			rec.adminname = Util.checkString(rset0.getString("adminname"));
			rec.writedate = Util.checkString(rset0.getString("writedate"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			TN_LNK_4120_LCURLIST2Record rec = new TN_LNK_4120_LCURLIST2Record();
			rec.umsidx = Util.checkString(rset1.getString("umsidx"));
			rec.memberidx = Util.checkString(rset1.getString("memberidx"));
			rec.name = Util.checkString(rset1.getString("name"));
			rec.receiverinfo = Util.checkString(rset1.getString("receiverinfo"));
			rec.status = Util.checkString(rset1.getString("status"));
			rec.senddate = Util.checkString(rset1.getString("senddate"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_4120_LDataSet ds = (TN_LNK_4120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_LNK_4120_LCURLIST1Record curlist1Rec = (TN_LNK_4120_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_LNK_4120_LCURLIST2Record curlist2Rec = (TN_LNK_4120_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.umsidx%>
<%= curlist1Rec.deptidx%>
<%= curlist1Rec.status%>
<%= curlist1Rec.purpose%>
<%= curlist1Rec.title%>
<%= curlist1Rec.sendtype%>
<%= curlist1Rec.startdate%>
<%= curlist1Rec.remk1%>
<%= curlist1Rec.remk2%>
<%= curlist1Rec.sendcontents%>
<%= curlist1Rec.isreserved%>
<%= curlist1Rec.adminname%>
<%= curlist1Rec.writedate%>
<%= curlist2Rec.umsidx%>
<%= curlist2Rec.memberidx%>
<%= curlist2Rec.name%>
<%= curlist2Rec.receiverinfo%>
<%= curlist2Rec.status%>
<%= curlist2Rec.senddate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 06 19:21:28 KST 2016 */