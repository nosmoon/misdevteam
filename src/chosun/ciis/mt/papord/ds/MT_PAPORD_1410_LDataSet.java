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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_1410_LDataSet(){}
	public MT_PAPORD_1410_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_1410_LCURLISTRecord rec = new MT_PAPORD_1410_LCURLISTRecord();
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.pap_model = Util.checkString(rset0.getString("pap_model"));
			rec.a_wgt = Util.checkString(rset0.getString("a_wgt"));
			rec.b_wgt = Util.checkString(rset0.getString("b_wgt"));
			rec.c_wgt = Util.checkString(rset0.getString("c_wgt"));
			rec.wk_pap_std = Util.checkString(rset0.getString("wk_pap_std"));
			rec.wk_issu_pcnt = Util.checkString(rset0.getString("wk_issu_pcnt"));
			rec.wk_slip_qty = Util.checkString(rset0.getString("wk_slip_qty"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_4006_LDataSet ds = (MT_PAPORD_4006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_4006_LCURLISTRecord curlistRec = (MT_PAPORD_4006_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		MT_PAPORD_4006_LCURLIST_1Record curlist_1Rec = (MT_PAPORD_4006_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		MT_PAPORD_4006_LCURLIST_2Record curlist_2Rec = (MT_PAPORD_4006_LCURLIST_2Record)ds.curlist_2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_3.size(); i++){
		MT_PAPORD_4006_LCURLIST_3Record curlist_3Rec = (MT_PAPORD_4006_LCURLIST_3Record)ds.curlist_3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist_1()%>
<%= ds.getCurlist_2()%>
<%= ds.getCurlist_3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.issu_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.pcnt%>
<%= curlistRec.dual_out_clsf%>
<%= curlistRec.slip_qty%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.dual_out_nm%>
<%= curlistRec.tot_wgt%>
<%= curlistRec.b_yn%>
<%= curlistRec.b_wgt%>
<%= curlistRec.c_yn%>
<%= curlistRec.c_wgt%>
<%= curlistRec.a_wgt%>
<%= curlist_1Rec.paper_clsf_cd%>
<%= curlist_1Rec.fac_clsf%>
<%= curlist_1Rec.roll_wgt%>
<%= curlist_1Rec.matr_cd%>
<%= curlist_1Rec.matr_nm%>
<%= curlist_2Rec.paper_clsf_cd%>
<%= curlist_2Rec.fac_clsf%>
<%= curlist_2Rec.roll_wgt%>
<%= curlist_2Rec.matr_cd%>
<%= curlist_2Rec.matr_nm%>
<%= curlist_3Rec.paper_clsf_cd%>
<%= curlist_3Rec.fac_clsf%>
<%= curlist_3Rec.roll_wgt%>
<%= curlist_3Rec.matr_cd%>
<%= curlist_3Rec.matr_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 20:00:26 KST 2009 */