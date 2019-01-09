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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1008_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1008_LDataSet(){}
	public PR_PAPMAKE_1008_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PAPMAKE_1008_LCURLIST1Record rec = new PR_PAPMAKE_1008_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.ledt_cd = Util.checkString(rset0.getString("ledt_cd"));
			rec.ledt_nm = Util.checkString(rset0.getString("ledt_nm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.last_side = Util.checkString(rset0.getString("last_side"));
			rec.rmsg_tm = Util.checkString(rset0.getString("rmsg_tm"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.prt_qty = Util.checkString(rset0.getString("prt_qty"));
			rec.out_gate = Util.checkString(rset0.getString("out_gate"));
			rec.apcut_err = Util.checkString(rset0.getString("apcut_err"));
			rec.runcut_err = Util.checkString(rset0.getString("runcut_err"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_1008_LCURLIST2Record rec = new PR_PAPMAKE_1008_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.pj_qty = Util.checkString(rset1.getString("pj_qty"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1008_LDataSet ds = (PR_PAPMAKE_1008_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1008_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1008_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1008_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1008_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.ecnt%>
<%= curlist1Rec.ledt_cd%>
<%= curlist1Rec.ledt_nm%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.last_side%>
<%= curlist1Rec.rmsg_tm%>
<%= curlist1Rec.prt_bgn_tm%>
<%= curlist1Rec.prt_end_tm%>
<%= curlist1Rec.prt_qty%>
<%= curlist1Rec.out_gate%>
<%= curlist1Rec.apcut_err%>
<%= curlist1Rec.runcut_err%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.pj_qty%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 20:43:42 KST 2009 */