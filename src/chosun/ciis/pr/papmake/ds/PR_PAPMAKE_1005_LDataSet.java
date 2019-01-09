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


public class PR_PAPMAKE_1005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1005_LDataSet(){}
	public PR_PAPMAKE_1005_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_1005_LCURLIST1Record rec = new PR_PAPMAKE_1005_LCURLIST1Record();
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.ecnt_nm = Util.checkString(rset0.getString("ecnt_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_1005_LCURLIST2Record rec = new PR_PAPMAKE_1005_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.pj_qty = Util.checkString(rset1.getString("pj_qty"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PAPMAKE_1005_LCURLIST3Record rec = new PR_PAPMAKE_1005_LCURLIST3Record();
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.ecnt = Util.checkString(rset2.getString("ecnt"));
			rec.ledt_cd = Util.checkString(rset2.getString("ledt_cd"));
			rec.ledt_nm = Util.checkString(rset2.getString("ledt_nm"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.last_side = Util.checkString(rset2.getString("last_side"));
			rec.rmsg_tm = Util.checkString(rset2.getString("rmsg_tm"));
			rec.prt_bgn_tm = Util.checkString(rset2.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset2.getString("prt_end_tm"));
			rec.prt_qty = Util.checkString(rset2.getString("prt_qty"));
			rec.out_gate = Util.checkString(rset2.getString("out_gate"));
			rec.apcut_err = Util.checkString(rset2.getString("apcut_err"));
			rec.runcut_err = Util.checkString(rset2.getString("runcut_err"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_1005_LDataSet ds = (PR_PAPMAKE_1005_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1005_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1005_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1005_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1005_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PAPMAKE_1005_LCURLIST3Record curlist3Rec = (PR_PAPMAKE_1005_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.ecnt%>
<%= curlist1Rec.ecnt_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.pj_qty%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.seq%>
<%= curlist3Rec.issu_dt%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.medi_nm%>
<%= curlist3Rec.ecnt%>
<%= curlist3Rec.ledt_cd%>
<%= curlist3Rec.ledt_nm%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.last_side%>
<%= curlist3Rec.rmsg_tm%>
<%= curlist3Rec.prt_bgn_tm%>
<%= curlist3Rec.prt_end_tm%>
<%= curlist3Rec.prt_qty%>
<%= curlist3Rec.out_gate%>
<%= curlist3Rec.apcut_err%>
<%= curlist3Rec.runcut_err%>
<%= curlist3Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 20:39:13 KST 2009 */