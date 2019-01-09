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


public class PR_OTHCNSM_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_1100_LDataSet(){}
	public PR_OTHCNSM_1100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PR_OTHCNSM_1100_LCURLIST1Record rec = new PR_OTHCNSM_1100_LCURLIST1Record();
			rec.psplat_clsf = Util.checkString(rset0.getString("psplat_clsf"));
			rec.use_qunt = Util.checkString(rset0.getString("use_qunt"));
			rec.nul_plat_cnt = Util.checkString(rset0.getString("nul_plat_cnt"));
			rec.psplat_fee = Util.checkString(rset0.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			PR_OTHCNSM_1100_LCURLIST2Record rec = new PR_OTHCNSM_1100_LCURLIST2Record();
			rec.data = Util.checkString(rset1.getString("data"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(13);
		while(rset2.next()){
			PR_OTHCNSM_1100_LCURLIST3Record rec = new PR_OTHCNSM_1100_LCURLIST3Record();
			rec.film_use_qunt = Util.checkString(rset2.getString("film_use_qunt"));
			rec.paper_wgt = Util.checkString(rset2.getString("paper_wgt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(14);
		while(rset3.next()){
			PR_OTHCNSM_1100_LCURLIST4Record rec = new PR_OTHCNSM_1100_LCURLIST4Record();
			rec.cmpy_cd = Util.checkString(rset3.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset3.getString("occr_dt"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.prt_fee = Util.checkString(rset3.getString("prt_fee"));
			rec.paper_amt = Util.checkString(rset3.getString("paper_amt"));
			rec.psplat_use_amt = Util.checkString(rset3.getString("psplat_use_amt"));
			rec.film_make_fee = Util.checkString(rset3.getString("film_make_fee"));
			rec.gnaw_fee = Util.checkString(rset3.getString("gnaw_fee"));
			rec.pack_fee = Util.checkString(rset3.getString("pack_fee"));
			rec.paper_portage = Util.checkString(rset3.getString("paper_portage"));
			rec.total = Util.checkString(rset3.getString("total"));
			rec.clr_prt_fee = Util.checkString(rset3.getString("clr_prt_fee"));
			rec.bw_prt_fee = Util.checkString(rset3.getString("bw_prt_fee"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(15);
		while(rset4.next()){
			PR_OTHCNSM_1100_LCURLIST5Record rec = new PR_OTHCNSM_1100_LCURLIST5Record();
			rec.issu_qty = Util.checkString(rset4.getString("issu_qty"));
			rec.pap_std = Util.checkString(rset4.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset4.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset4.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset4.getString("clr_pcnt"));
			rec.paper_portage = Util.checkString(rset4.getString("paper_portage"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(16);
		while(rset5.next()){
			PR_OTHCNSM_1100_LCURLIST6Record rec = new PR_OTHCNSM_1100_LCURLIST6Record();
			rec.film_make_fee = Util.checkString(rset5.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset5.getString("pack_fee"));
			rec.paper_portage = Util.checkString(rset5.getString("paper_portage"));
			rec.pj_basi_qty = Util.checkString(rset5.getString("pj_basi_qty"));
			rec.prt_pj_rate_bw_1 = Util.checkString(rset5.getString("prt_pj_rate_bw_1"));
			rec.prt_pj_rate_clr_1 = Util.checkString(rset5.getString("prt_pj_rate_clr_1"));
			rec.prt_pj_rate_bw_2 = Util.checkString(rset5.getString("prt_pj_rate_bw_2"));
			rec.prt_pj_rate_clr_2 = Util.checkString(rset5.getString("prt_pj_rate_clr_2"));
			rec.paper_wgt = Util.checkString(rset5.getString("paper_wgt"));
			rec.eps_no = Util.checkString(rset5.getString("eps_no"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(17);
		while(rset6.next()){
			PR_OTHCNSM_1100_LCURLIST7Record rec = new PR_OTHCNSM_1100_LCURLIST7Record();
			rec.paper_uprc = Util.checkString(rset6.getString("paper_uprc"));
			rec.paper_portage = Util.checkString(rset6.getString("paper_portage"));
			this.curlist7.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_OTHCNSM_1100_LDataSet ds = (PR_OTHCNSM_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_OTHCNSM_1100_LCURLIST1Record curlist1Rec = (PR_OTHCNSM_1100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_OTHCNSM_1100_LCURLIST2Record curlist2Rec = (PR_OTHCNSM_1100_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_OTHCNSM_1100_LCURLIST3Record curlist3Rec = (PR_OTHCNSM_1100_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		PR_OTHCNSM_1100_LCURLIST4Record curlist4Rec = (PR_OTHCNSM_1100_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		PR_OTHCNSM_1100_LCURLIST5Record curlist5Rec = (PR_OTHCNSM_1100_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		PR_OTHCNSM_1100_LCURLIST6Record curlist6Rec = (PR_OTHCNSM_1100_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		PR_OTHCNSM_1100_LCURLIST7Record curlist7Rec = (PR_OTHCNSM_1100_LCURLIST7Record)ds.curlist7.get(i);%>
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
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.psplat_clsf%>
<%= curlist1Rec.use_qunt%>
<%= curlist1Rec.nul_plat_cnt%>
<%= curlist1Rec.psplat_fee%>
<%= curlist1Rec.gnaw_fee%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.sub_seq%>
<%= curlist2Rec.data%>
<%= curlist3Rec.film_use_qunt%>
<%= curlist3Rec.paper_wgt%>
<%= curlist3Rec.seq%>
<%= curlist4Rec.cmpy_cd%>
<%= curlist4Rec.occr_dt%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.prt_fee%>
<%= curlist4Rec.paper_amt%>
<%= curlist4Rec.psplat_use_amt%>
<%= curlist4Rec.film_make_fee%>
<%= curlist4Rec.gnaw_fee%>
<%= curlist4Rec.pack_fee%>
<%= curlist4Rec.paper_portage%>
<%= curlist4Rec.total%>
<%= curlist4Rec.clr_prt_fee%>
<%= curlist4Rec.bw_prt_fee%>
<%= curlist5Rec.issu_qty%>
<%= curlist5Rec.pap_std%>
<%= curlist5Rec.issu_pcnt%>
<%= curlist5Rec.bw_pcnt%>
<%= curlist5Rec.clr_pcnt%>
<%= curlist5Rec.paper_portage%>
<%= curlist6Rec.film_make_fee%>
<%= curlist6Rec.pack_fee%>
<%= curlist6Rec.paper_portage%>
<%= curlist6Rec.pj_basi_qty%>
<%= curlist6Rec.prt_pj_rate_bw_1%>
<%= curlist6Rec.prt_pj_rate_clr_1%>
<%= curlist6Rec.prt_pj_rate_bw_2%>
<%= curlist6Rec.prt_pj_rate_clr_2%>
<%= curlist6Rec.paper_wgt%>
<%= curlist6Rec.eps_no%>
<%= curlist7Rec.paper_uprc%>
<%= curlist7Rec.paper_portage%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 16:34:35 KST 2009 */