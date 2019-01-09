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


public class PR_OTHCNSM_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String film_qunt;

	public PR_OTHCNSM_2100_LDataSet(){}
	public PR_OTHCNSM_2100_LDataSet(String errcode, String errmsg, String film_qunt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.film_qunt = film_qunt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFilm_qunt(String film_qunt){
		this.film_qunt = film_qunt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFilm_qunt(){
		return this.film_qunt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PR_OTHCNSM_2100_LCURLIST3Record rec = new PR_OTHCNSM_2100_LCURLIST3Record();
			rec.film_use_qunt = Util.checkString(rset0.getString("film_use_qunt"));
			rec.prd_cnt = Util.checkString(rset0.getString("prd_cnt"));
			rec.dest_fee = Util.checkString(rset0.getString("dest_fee"));
			rec.dest_qunt = Util.checkString(rset0.getString("dest_qunt"));
			rec.paper_wgt = Util.checkString(rset0.getString("paper_wgt"));
			rec.ink_use_qunt = Util.checkString(rset0.getString("ink_use_qunt"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			this.curlist3.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			PR_OTHCNSM_2100_LCURLIST4Record rec = new PR_OTHCNSM_2100_LCURLIST4Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.prt_fee = Util.checkString(rset1.getString("prt_fee"));
			rec.paper_amt = Util.checkString(rset1.getString("paper_amt"));
			rec.psplat_use_amt = Util.checkString(rset1.getString("psplat_use_amt"));
			rec.film_make_fee = Util.checkString(rset1.getString("film_make_fee"));
			rec.gnaw_fee = Util.checkString(rset1.getString("gnaw_fee"));
			rec.pack_fee = Util.checkString(rset1.getString("pack_fee"));
			rec.ink_use_amt = Util.checkString(rset1.getString("ink_use_amt"));
			rec.total = Util.checkString(rset1.getString("total"));
			rec.dest_fee = Util.checkString(rset1.getString("dest_fee"));
			rec.base_leas_fee = Util.checkString(rset1.getString("base_leas_fee"));
			rec.real_leas_fee = Util.checkString(rset1.getString("real_leas_fee"));
			rec.etc_matr_fee = Util.checkString(rset1.getString("etc_matr_fee"));
			rec.leas_use_fee = Util.checkString(rset1.getString("leas_use_fee"));
			this.curlist4.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(13);
		while(rset2.next()){
			PR_OTHCNSM_2100_LCURLIST5Record rec = new PR_OTHCNSM_2100_LCURLIST5Record();
			rec.issu_qty = Util.checkString(rset2.getString("issu_qty"));
			rec.pap_std = Util.checkString(rset2.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset2.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset2.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset2.getString("clr_pcnt"));
			rec.pj_wgt = Util.checkString(rset2.getString("pj_wgt"));
			rec.hdqt_paper_clsf = Util.checkString(rset2.getString("hdqt_paper_clsf"));
			rec.prt_wgt = Util.checkString(rset2.getString("prt_wgt"));
			rec.paper_uprc = Util.checkString(rset2.getString("paper_uprc"));
			this.curlist5.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(14);
		while(rset3.next()){
			PR_OTHCNSM_2100_LCURLIST6Record rec = new PR_OTHCNSM_2100_LCURLIST6Record();
			rec.film_make_fee = Util.checkString(rset3.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset3.getString("pack_fee"));
			rec.paper_uprc = Util.checkString(rset3.getString("paper_uprc"));
			rec.paper_wgt = Util.checkString(rset3.getString("paper_wgt"));
			rec.dest_fee = Util.checkString(rset3.getString("dest_fee"));
			rec.base_leas_fee = Util.checkString(rset3.getString("base_leas_fee"));
			rec.real_leas_fee = Util.checkString(rset3.getString("real_leas_fee"));
			rec.etc_matr_fee_bw = Util.checkString(rset3.getString("etc_matr_fee_bw"));
			rec.etc_matr_fee_clr = Util.checkString(rset3.getString("etc_matr_fee_clr"));
			rec.leas_use_fee_bw = Util.checkString(rset3.getString("leas_use_fee_bw"));
			rec.leas_use_fee_clr = Util.checkString(rset3.getString("leas_use_fee_clr"));
			rec.prt_pj_rate = Util.checkString(rset3.getString("prt_pj_rate"));
			this.curlist6.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(15);
		while(rset4.next()){
			PR_OTHCNSM_2100_LCURLIST7Record rec = new PR_OTHCNSM_2100_LCURLIST7Record();
			rec.paper_uprc = Util.checkString(rset4.getString("paper_uprc"));
			this.curlist7.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(16);
		while(rset5.next()){
			PR_OTHCNSM_2100_LCURLIST8Record rec = new PR_OTHCNSM_2100_LCURLIST8Record();
			rec.occr_dt = Util.checkString(rset5.getString("occr_dt"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.sub_seq = Util.checkString(rset5.getString("sub_seq"));
			rec.psplat_clsf = Util.checkString(rset5.getString("psplat_clsf"));
			rec.psplat_fee = Util.checkString(rset5.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset5.getString("gnaw_fee"));
			rec.psplat_qunt = Util.checkString(rset5.getString("psplat_qunt"));
			rec.nul_plat_cnt = Util.checkString(rset5.getString("nul_plat_cnt"));
			rec.psplat_amt = Util.checkString(rset5.getString("psplat_amt"));
			rec.gnaw_amt = Util.checkString(rset5.getString("gnaw_amt"));
			this.curlist8.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(17);
		while(rset6.next()){
			PR_OTHCNSM_2100_LCURLIST9Record rec = new PR_OTHCNSM_2100_LCURLIST9Record();
			rec.ink_matr = Util.checkString(rset6.getString("ink_matr"));
			rec.matr_nm = Util.checkString(rset6.getString("matr_nm"));
			rec.ink_uprc = Util.checkString(rset6.getString("ink_uprc"));
			rec.qunt = Util.checkString(rset6.getString("qunt"));
			rec.ink_fee = Util.checkString(rset6.getString("ink_fee"));
			rec.occr_dt = Util.checkString(rset6.getString("occr_dt"));
			rec.seq = Util.checkString(rset6.getString("seq"));
			rec.sub_seq = Util.checkString(rset6.getString("sub_seq"));
			this.curlist9.add(rec);
		}
		this.film_qunt = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_OTHCNSM_2100_LDataSet ds = (PR_OTHCNSM_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_OTHCNSM_2100_LCURLIST3Record curlist3Rec = (PR_OTHCNSM_2100_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		PR_OTHCNSM_2100_LCURLIST4Record curlist4Rec = (PR_OTHCNSM_2100_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		PR_OTHCNSM_2100_LCURLIST5Record curlist5Rec = (PR_OTHCNSM_2100_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		PR_OTHCNSM_2100_LCURLIST6Record curlist6Rec = (PR_OTHCNSM_2100_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		PR_OTHCNSM_2100_LCURLIST7Record curlist7Rec = (PR_OTHCNSM_2100_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		PR_OTHCNSM_2100_LCURLIST8Record curlist8Rec = (PR_OTHCNSM_2100_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		PR_OTHCNSM_2100_LCURLIST9Record curlist9Rec = (PR_OTHCNSM_2100_LCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getFilm_qunt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist3Rec.film_use_qunt%>
<%= curlist3Rec.prd_cnt%>
<%= curlist3Rec.dest_fee%>
<%= curlist3Rec.dest_qunt%>
<%= curlist3Rec.paper_wgt%>
<%= curlist3Rec.ink_use_qunt%>
<%= curlist3Rec.prt_bgn_tm%>
<%= curlist3Rec.prt_end_tm%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.occr_dt%>
<%= curlist4Rec.cmpy_cd%>
<%= curlist4Rec.occr_dt%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.prt_fee%>
<%= curlist4Rec.paper_amt%>
<%= curlist4Rec.psplat_use_amt%>
<%= curlist4Rec.film_make_fee%>
<%= curlist4Rec.gnaw_fee%>
<%= curlist4Rec.pack_fee%>
<%= curlist4Rec.ink_use_amt%>
<%= curlist4Rec.total%>
<%= curlist4Rec.dest_fee%>
<%= curlist4Rec.base_leas_fee%>
<%= curlist4Rec.real_leas_fee%>
<%= curlist4Rec.etc_matr_fee%>
<%= curlist4Rec.leas_use_fee%>
<%= curlist5Rec.issu_qty%>
<%= curlist5Rec.pap_std%>
<%= curlist5Rec.issu_pcnt%>
<%= curlist5Rec.bw_pcnt%>
<%= curlist5Rec.clr_pcnt%>
<%= curlist5Rec.pj_wgt%>
<%= curlist5Rec.prt_wgt%>
<%= curlist5Rec.paper_uprc%>
<%= curlist6Rec.film_make_fee%>
<%= curlist6Rec.pack_fee%>
<%= curlist6Rec.paper_uprc%>
<%= curlist6Rec.paper_wgt%>
<%= curlist6Rec.dest_fee%>
<%= curlist6Rec.base_leas_fee%>
<%= curlist6Rec.real_leas_fee%>
<%= curlist6Rec.etc_matr_fee_bw%>
<%= curlist6Rec.etc_matr_fee_clr%>
<%= curlist6Rec.leas_use_fee_bw%>
<%= curlist6Rec.leas_use_fee_clr%>
<%= curlist6Rec.prt_pj_rate%>
<%= curlist7Rec.paper_uprc%>
<%= curlist8Rec.occr_dt%>
<%= curlist8Rec.seq%>
<%= curlist8Rec.sub_seq%>
<%= curlist8Rec.psplat_clsf%>
<%= curlist8Rec.psplat_fee%>
<%= curlist8Rec.gnaw_fee%>
<%= curlist8Rec.psplat_qunt%>
<%= curlist8Rec.nul_plat_cnt%>
<%= curlist8Rec.psplat_amt%>
<%= curlist8Rec.gnaw_amt%>
<%= curlist9Rec.ink_matr%>
<%= curlist9Rec.matr_nm%>
<%= curlist9Rec.ink_uprc%>
<%= curlist9Rec.qunt%>
<%= curlist9Rec.ink_fee%>
<%= curlist9Rec.occr_dt%>
<%= curlist9Rec.seq%>
<%= curlist9Rec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */