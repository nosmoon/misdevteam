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


public class MT_PAPORD_4006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_3 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist_2 = new ArrayList();
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_4006_LDataSet(){}
	public MT_PAPORD_4006_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_4006_LCURLISTRecord rec = new MT_PAPORD_4006_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.prt_clsf = Util.checkString(rset0.getString("prt_clsf"));
			rec.slip_qty = rset0.getInt("slip_qty");
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.dual_out_nm = Util.checkString(rset0.getString("dual_out_nm"));
			rec.tot_wgt = Util.checkString(rset0.getString("tot_wgt"));
			rec.b_yn = Util.checkString(rset0.getString("b_yn"));
			rec.b_wgt = Util.checkString(rset0.getString("b_wgt"));
			rec.c_yn = Util.checkString(rset0.getString("c_yn"));
			rec.c_wgt = Util.checkString(rset0.getString("c_wgt"));
			rec.a_wgt = Util.checkString(rset0.getString("a_wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PAPORD_4006_LCURLIST_1Record rec = new MT_PAPORD_4006_LCURLIST_1Record();
			rec.paper_clsf_cd = Util.checkString(rset1.getString("paper_clsf_cd"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.roll_wgt = Util.checkString(rset1.getString("roll_wgt"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			this.curlist_1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			MT_PAPORD_4006_LCURLIST_2Record rec = new MT_PAPORD_4006_LCURLIST_2Record();
			rec.paper_clsf_cd = Util.checkString(rset2.getString("paper_clsf_cd"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.roll_wgt = Util.checkString(rset2.getString("roll_wgt"));
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			this.curlist_2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			MT_PAPORD_4006_LCURLIST_3Record rec = new MT_PAPORD_4006_LCURLIST_3Record();
			rec.paper_clsf_cd = Util.checkString(rset3.getString("paper_clsf_cd"));
			rec.fac_clsf = Util.checkString(rset3.getString("fac_clsf"));
			rec.roll_wgt = Util.checkString(rset3.getString("roll_wgt"));
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			this.curlist_3.add(rec);
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