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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_4004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_2 = new ArrayList();
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_4004_LDataSet(){}
	public PR_PRTEXEC_4004_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PR_PRTEXEC_4004_LCURLIST_1Record rec = new PR_PRTEXEC_4004_LCURLIST_1Record();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.add_prt_seq = Util.checkString(rset0.getString("add_prt_seq"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.prt_tm = Util.checkString(rset0.getString("prt_tm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.dual_out_nm = Util.checkString(rset0.getString("dual_out_nm"));
			rec.tm_in_yn = Util.checkString(rset0.getString("tm_in_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.add_prt_cnt = Util.checkString(rset0.getString("add_prt_cnt"));
			rec.rdata = Util.checkString(rset0.getString("rdata"));
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			this.curlist_1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PR_PRTEXEC_4004_LCURLIST_2Record rec = new PR_PRTEXEC_4004_LCURLIST_2Record();
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.std = Util.checkString(rset1.getString("std"));
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.prt_tm = Util.checkString(rset1.getString("prt_tm"));
			rec.dual_out_nm = Util.checkString(rset1.getString("dual_out_nm"));
			rec.tm_in_yn = Util.checkString(rset1.getString("tm_in_yn"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist_2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_4004_LDataSet ds = (PR_PRTEXEC_4004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		PR_PRTEXEC_4004_LCURLIST_1Record curlist_1Rec = (PR_PRTEXEC_4004_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		PR_PRTEXEC_4004_LCURLIST_2Record curlist_2Rec = (PR_PRTEXEC_4004_LCURLIST_2Record)ds.curlist_2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
<%= ds.getCurlist_2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_1Rec.issu_dt%>
<%= curlist_1Rec.add_prt_seq%>
<%= curlist_1Rec.prt_dt%>
<%= curlist_1Rec.prt_tm%>
<%= curlist_1Rec.std%>
<%= curlist_1Rec.dual_out_nm%>
<%= curlist_1Rec.tm_in_yn%>
<%= curlist_1Rec.remk%>
<%= curlist_1Rec.add_prt_cnt%>
<%= curlist_1Rec.rdata%>
<%= curlist_1Rec.pcnt%>
<%= curlist_1Rec.clr_pcnt%>
<%= curlist_2Rec.issu_dt%>
<%= curlist_2Rec.medi_nm%>
<%= curlist_2Rec.sect_nm%>
<%= curlist_2Rec.pcnt%>
<%= curlist_2Rec.clr_pcnt%>
<%= curlist_2Rec.std%>
<%= curlist_2Rec.prt_dt%>
<%= curlist_2Rec.prt_tm%>
<%= curlist_2Rec.dual_out_nm%>
<%= curlist_2Rec.tm_in_yn%>
<%= curlist_2Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 18:51:42 KST 2009 */