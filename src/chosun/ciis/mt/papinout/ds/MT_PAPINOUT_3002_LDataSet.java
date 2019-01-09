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


public class MT_PAPINOUT_3002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_thowgt;
	public String prtwgt;
	public String totpjwgt;
	public String gitapjwgt;
	public String pajiyul;
	public String cnt;

	public MT_PAPINOUT_3002_LDataSet(){}
	public MT_PAPINOUT_3002_LDataSet(String errcode, String errmsg, String tot_thowgt, String prtwgt, String totpjwgt, String gitapjwgt, String pajiyul, String cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_thowgt = tot_thowgt;
		this.prtwgt = prtwgt;
		this.totpjwgt = totpjwgt;
		this.gitapjwgt = gitapjwgt;
		this.pajiyul = pajiyul;
		this.cnt = cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_thowgt(String tot_thowgt){
		this.tot_thowgt = tot_thowgt;
	}

	public void setPrtwgt(String prtwgt){
		this.prtwgt = prtwgt;
	}

	public void setTotpjwgt(String totpjwgt){
		this.totpjwgt = totpjwgt;
	}

	public void setGitapjwgt(String gitapjwgt){
		this.gitapjwgt = gitapjwgt;
	}

	public void setPajiyul(String pajiyul){
		this.pajiyul = pajiyul;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_thowgt(){
		return this.tot_thowgt;
	}

	public String getPrtwgt(){
		return this.prtwgt;
	}

	public String getTotpjwgt(){
		return this.totpjwgt;
	}

	public String getGitapjwgt(){
		return this.gitapjwgt;
	}

	public String getPajiyul(){
		return this.pajiyul;
	}

	public String getCnt(){
		return this.cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_3002_LCURLISTRecord rec = new MT_PAPINOUT_3002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.pj_kind = Util.checkString(rset0.getString("pj_kind"));
			rec.pj_wgt = Util.checkString(rset0.getString("pj_wgt"));
			rec.etc_pj_resn_cd = Util.checkString(rset0.getString("etc_pj_resn_cd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PAPINOUT_3002_LCURLIST1Record rec = new MT_PAPINOUT_3002_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.paper_clsf = Util.checkString(rset1.getString("paper_clsf"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.prt_clsf = Util.checkString(rset1.getString("prt_clsf"));
			rec.pap_std = Util.checkString(rset1.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset1.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset1.getString("slip_qty"));
			rec.somo_wgt = Util.checkString(rset1.getString("somo_wgt"));
			rec.avgynag = Util.checkString(rset1.getString("avgynag"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PAPINOUT_3002_LCURLIST2Record rec = new MT_PAPINOUT_3002_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.hdqt_paper_clsf = Util.checkString(rset2.getString("hdqt_paper_clsf"));
			rec.prt_clsf = Util.checkString(rset2.getString("prt_clsf"));
			rec.pj_kind = Util.checkString(rset2.getString("pj_kind"));
			rec.pj_cnt = Util.checkString(rset2.getString("pj_cnt"));
			rec.pj_wgt = Util.checkString(rset2.getString("pj_wgt"));
			rec.prt_dt = Util.checkString(rset2.getString("prt_dt"));
			this.curlist2.add(rec);
		}
		this.tot_thowgt = Util.checkString(cstmt.getString(9));
		this.prtwgt = Util.checkString(cstmt.getString(10));
		this.totpjwgt = Util.checkString(cstmt.getString(11));
		this.gitapjwgt = Util.checkString(cstmt.getString(12));
		this.pajiyul = Util.checkString(cstmt.getString(13));
		this.cnt = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_3002_LDataSet ds = (MT_PAPINOUT_3002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_3002_LCURLISTRecord curlistRec = (MT_PAPINOUT_3002_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_3002_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_3002_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_3002_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_3002_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getTot_thowgt()%>
<%= ds.getPrtwgt()%>
<%= ds.getTotpjwgt()%>
<%= ds.getGitapjwgt()%>
<%= ds.getPajiyul()%>
<%= ds.getCnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.pj_kind%>
<%= curlistRec.pj_wgt%>
<%= curlistRec.etc_pj_resn_cd%>
<%= curlistRec.remk%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.prt_dt%>
<%= curlist1Rec.paper_clsf%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.prt_clsf%>
<%= curlist1Rec.pap_std%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.clr_pcnt%>
<%= curlist1Rec.bw_pcnt%>
<%= curlist1Rec.slip_qty%>
<%= curlist1Rec.somo_wgt%>
<%= curlist1Rec.avgynag%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.hdqt_paper_clsf%>
<%= curlist2Rec.prt_clsf%>
<%= curlist2Rec.pj_kind%>
<%= curlist2Rec.pj_cnt%>
<%= curlist2Rec.pj_wgt%>
<%= curlist2Rec.prt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 08 01:15:57 KST 2009 */