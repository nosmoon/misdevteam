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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_2010_LDataSet(){}
	public MT_PRNPAP_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_PRNPAP_2010_LCURLISTRecord rec = new MT_PRNPAP_2010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.real_prt_paper_clsf = Util.checkString(rset0.getString("real_prt_paper_clsf"));
			rec.real_paper_std = Util.checkString(rset0.getString("real_paper_std"));
			rec.prt_nm = Util.checkString(rset0.getString("prt_nm"));
			rec.prt_plan_dd_pers = Util.checkString(rset0.getString("prt_plan_dd_pers"));
			rec.prt_frdt = Util.checkString(rset0.getString("prt_frdt"));
			rec.prt_todt = Util.checkString(rset0.getString("prt_todt"));
			rec.prt_tms = Util.checkString(rset0.getString("prt_tms"));
			rec.paper_std = Util.checkString(rset0.getString("paper_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.prt_qty = Util.checkString(rset0.getString("prt_qty"));
			rec.prt_paper_clsf = Util.checkString(rset0.getString("prt_paper_clsf"));
			rec.qunt_out_yn = Util.checkString(rset0.getString("qunt_out_yn"));
			rec.paper_gm = Util.checkString(rset0.getString("paper_gm"));
			rec.brk_rate = Util.checkString(rset0.getString("brk_rate"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PRNPAP_2010_LCURLIST1Record rec = new MT_PRNPAP_2010_LCURLIST1Record();
			rec.real_matr_clsf = Util.checkString(rset1.getString("real_matr_clsf"));
			rec.matr_clsf = Util.checkString(rset1.getString("matr_clsf"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_2010_LDataSet ds = (MT_PRNPAP_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_2010_LCURLISTRecord curlistRec = (MT_PRNPAP_2010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_2010_LCURLIST1Record curlist1Rec = (MT_PRNPAP_2010_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.real_prt_paper_clsf%>
<%= curlistRec.real_paper_std%>
<%= curlistRec.prt_nm%>
<%= curlistRec.prt_plan_dd_pers%>
<%= curlistRec.prt_frdt%>
<%= curlistRec.prt_todt%>
<%= curlistRec.prt_tms%>
<%= curlistRec.paper_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.prt_qty%>
<%= curlistRec.prt_paper_clsf%>
<%= curlistRec.qunt_out_yn%>
<%= curlistRec.paper_gm%>
<%= curlistRec.brk_rate%>
<%= curlistRec.remk%>
<%= curlist1Rec.real_matr_clsf%>
<%= curlist1Rec.matr_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 23 18:00:58 KST 2009 */