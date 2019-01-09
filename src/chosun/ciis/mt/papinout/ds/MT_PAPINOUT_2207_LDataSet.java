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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2207_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pj_arg1;
	public String pj_arg2;
	public String wgt;
	public String slip_occr_dt;
	public String prt_wgt;

	public MT_PAPINOUT_2207_LDataSet(){}
	public MT_PAPINOUT_2207_LDataSet(String errcode, String errmsg, String pj_arg1, String pj_arg2, String wgt, String slip_occr_dt, String prt_wgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pj_arg1 = pj_arg1;
		this.pj_arg2 = pj_arg2;
		this.wgt = wgt;
		this.slip_occr_dt = slip_occr_dt;
		this.prt_wgt = prt_wgt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPj_arg1(String pj_arg1){
		this.pj_arg1 = pj_arg1;
	}

	public void setPj_arg2(String pj_arg2){
		this.pj_arg2 = pj_arg2;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPj_arg1(){
		return this.pj_arg1;
	}

	public String getPj_arg2(){
		return this.pj_arg2;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_PAPINOUT_2207_LCURLISTRecord rec = new MT_PAPINOUT_2207_LCURLISTRecord();
			rec.title = Util.checkString(rset0.getString("title"));
			rec.roll = Util.checkString(rset0.getString("roll"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.tot_jgroll = Util.checkString(rset0.getString("tot_jgroll"));
			rec.tot_jgwgt = Util.checkString(rset0.getString("tot_jgwgt"));
			rec.tot_jgamt = Util.checkString(rset0.getString("tot_jgamt"));
			rec.inout_dt = Util.checkString(rset0.getString("inout_dt"));
			rec.iw_roll = Util.checkString(rset0.getString("iw_roll"));
			rec.s_wiibgoroll = Util.checkString(rset0.getString("s_wiibgoroll"));
			rec.s_wccgroll = Util.checkString(rset0.getString("s_wccgroll"));
			rec.iw_wt = Util.checkString(rset0.getString("iw_wt"));
			rec.s_wiibgowt = Util.checkString(rset0.getString("s_wiibgowt"));
			rec.s_wccgwt = Util.checkString(rset0.getString("s_wccgwt"));
			rec.cut_err_tms = Util.checkString(rset0.getString("cut_err_tms"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			rec.grp = Util.checkString(rset0.getString("grp"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PAPINOUT_2207_LCURLIST2Record rec = new MT_PAPINOUT_2207_LCURLIST2Record();
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.medi_cdnm = Util.checkString(rset1.getString("medi_cdnm"));
			rec.sect_cdnm = Util.checkString(rset1.getString("sect_cdnm"));
			rec.pap_std = Util.checkString(rset1.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset1.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset1.getString("slip_qty"));
			rec.prt_wgt = Util.checkString(rset1.getString("prt_wgt"));
			this.curlist2.add(rec);
		}
		this.pj_arg1 = Util.checkString(cstmt.getString(9));
		this.pj_arg2 = Util.checkString(cstmt.getString(10));
		this.wgt = Util.checkString(cstmt.getString(11));
		this.slip_occr_dt = Util.checkString(cstmt.getString(12));
		this.prt_wgt = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2207_LDataSet ds = (MT_PAPINOUT_2207_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2207_LCURLISTRecord curlistRec = (MT_PAPINOUT_2207_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_2207_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_2207_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getPj_arg1()%>
<%= ds.getPj_arg2()%>
<%= ds.getWgt()%>
<%= ds.getSlip_occr_dt()%>
<%= ds.getPrt_wgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.title%>
<%= curlistRec.roll%>
<%= curlistRec.wgt%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.amt%>
<%= curlistRec.tot_jgroll%>
<%= curlistRec.tot_jgwgt%>
<%= curlistRec.tot_jgamt%>
<%= curlistRec.inout_dt%>
<%= curlistRec.iw_roll%>
<%= curlistRec.s_wiibgoroll%>
<%= curlistRec.s_wccgroll%>
<%= curlistRec.iw_wt%>
<%= curlistRec.s_wiibgowt%>
<%= curlistRec.s_wccgwt%>
<%= curlistRec.cut_err_tms%>
<%= curlistRec.matr_cd%>
<%= curlistRec.roll_wgt%>
<%= curlistRec.grp%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.prt_dt%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.medi_cdnm%>
<%= curlist2Rec.sect_cdnm%>
<%= curlist2Rec.pap_std%>
<%= curlist2Rec.issu_pcnt%>
<%= curlist2Rec.bw_pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.slip_qty%>
<%= curlist2Rec.prt_wgt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Dec 05 15:41:38 KST 2009 */