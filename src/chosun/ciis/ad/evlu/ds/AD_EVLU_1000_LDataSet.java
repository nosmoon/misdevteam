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


package chosun.ciis.ad.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EVLU_1000_LDataSet(){}
	public AD_EVLU_1000_LDataSet(String errcode, String errmsg){
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
			AD_EVLU_1000_LCURLISTRecord rec = new AD_EVLU_1000_LCURLISTRecord();
			rec.team_cd = Util.checkString(rset0.getString("team_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.acct_id = Util.checkString(rset0.getString("acct_id"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.paper_scor = Util.checkString(rset0.getString("paper_scor"));
			rec.chk1 = Util.checkString(rset0.getString("chk1"));
			rec.paper_remk = Util.checkString(rset0.getString("paper_remk"));
			rec.pubsh_scor = Util.checkString(rset0.getString("pubsh_scor"));
			rec.chk2 = Util.checkString(rset0.getString("chk2"));
			rec.pubsh_remk = Util.checkString(rset0.getString("pubsh_remk"));
			rec.pric_scor = Util.checkString(rset0.getString("pric_scor"));
			rec.chk3 = Util.checkString(rset0.getString("chk3"));
			rec.pric_remk = Util.checkString(rset0.getString("pric_remk"));
			rec.spcl_scor = Util.checkString(rset0.getString("spcl_scor"));
			rec.chk4 = Util.checkString(rset0.getString("chk4"));
			rec.spcl_remk = Util.checkString(rset0.getString("spcl_remk"));
			rec.adj_evlu_scor = Util.checkString(rset0.getString("adj_evlu_scor"));
			rec.chk5 = Util.checkString(rset0.getString("chk5"));
			rec.adj_evlu_remk = Util.checkString(rset0.getString("adj_evlu_remk"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_EVLU_1000_LCURLIST2Record rec = new AD_EVLU_1000_LCURLIST2Record();
			rec.rvis_end_yn = Util.checkString(rset1.getString("rvis_end_yn"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EVLU_1000_LDataSet ds = (AD_EVLU_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_1000_LCURLISTRecord curlistRec = (AD_EVLU_1000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_EVLU_1000_LCURLIST2Record curlist2Rec = (AD_EVLU_1000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.team_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.acct_id%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.paper_scor%>
<%= curlistRec.chk1%>
<%= curlistRec.paper_remk%>
<%= curlistRec.pubsh_scor%>
<%= curlistRec.chk2%>
<%= curlistRec.pubsh_remk%>
<%= curlistRec.pric_scor%>
<%= curlistRec.chk3%>
<%= curlistRec.pric_remk%>
<%= curlistRec.spcl_scor%>
<%= curlistRec.chk4%>
<%= curlistRec.spcl_remk%>
<%= curlistRec.adj_evlu_scor%>
<%= curlistRec.chk5%>
<%= curlistRec.adj_evlu_remk%>
<%= curlist2Rec.rvis_end_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 16 10:49:19 KST 2010 */