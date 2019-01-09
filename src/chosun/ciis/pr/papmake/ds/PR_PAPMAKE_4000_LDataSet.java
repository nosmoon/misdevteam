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


public class PR_PAPMAKE_4000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_4000_LDataSet(){}
	public PR_PAPMAKE_4000_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_4000_LCURLIST1Record rec = new PR_PAPMAKE_4000_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.days = Util.checkString(rset0.getString("days"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.sect_type = Util.checkString(rset0.getString("sect_type"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.duty_ovt_prt_yn = Util.checkString(rset0.getString("duty_ovt_prt_yn"));
			rec.all_slip_qty = Util.checkString(rset0.getString("all_slip_qty"));
			rec.all_slip_qty_1 = Util.checkString(rset0.getString("all_slip_qty_1"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_4000_LCURLIST2Record rec = new PR_PAPMAKE_4000_LCURLIST2Record();
			rec.basi_prt_qty = Util.checkString(rset1.getString("basi_prt_qty"));
			rec.basi_excs_qty = Util.checkString(rset1.getString("basi_excs_qty"));
			rec.base_servcost = Util.checkString(rset1.getString("base_servcost"));
			rec.basi_excs_servcost = Util.checkString(rset1.getString("basi_excs_servcost"));
			rec.basi_ovt_prt_qty = Util.checkString(rset1.getString("basi_ovt_prt_qty"));
			rec.basi_sep_prtn_servcost = Util.checkString(rset1.getString("basi_sep_prtn_servcost"));
			rec.base_make_servcost = Util.checkString(rset1.getString("base_make_servcost"));
			rec.basi_make_pcnt = Util.checkString(rset1.getString("basi_make_pcnt"));
			rec.basi_excs_pcnt = Util.checkString(rset1.getString("basi_excs_pcnt"));
			rec.basi_excs_make_servcost = Util.checkString(rset1.getString("basi_excs_make_servcost"));
			rec.crps_cost = Util.checkString(rset1.getString("crps_cost"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PAPMAKE_4000_LCURLIST3Record rec = new PR_PAPMAKE_4000_LCURLIST3Record();
			rec.addm_prt_servcost = Util.checkString(rset2.getString("addm_prt_servcost"));
			rec.sep_prt_servcost = Util.checkString(rset2.getString("sep_prt_servcost"));
			rec.crps_cost = Util.checkString(rset2.getString("crps_cost"));
			rec.dduc_cost = Util.checkString(rset2.getString("dduc_cost"));
			rec.addm_make_servcost = Util.checkString(rset2.getString("addm_make_servcost"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_4000_LDataSet ds = (PR_PAPMAKE_4000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_4000_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_4000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_4000_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_4000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PAPMAKE_4000_LCURLIST3Record curlist3Rec = (PR_PAPMAKE_4000_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.days%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.sect_type%>
<%= curlist1Rec.pap_std%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.clr_pcnt%>
<%= curlist1Rec.slip_qty%>
<%= curlist1Rec.dual_out_clsf%>
<%= curlist1Rec.duty_ovt_prt_yn%>
<%= curlist1Rec.all_slip_qty%>
<%= curlist1Rec.all_slip_qty_1%>
<%= curlist1Rec.seq%>
<%= curlist2Rec.basi_prt_qty%>
<%= curlist2Rec.basi_excs_qty%>
<%= curlist2Rec.base_servcost%>
<%= curlist2Rec.basi_excs_servcost%>
<%= curlist2Rec.basi_ovt_prt_qty%>
<%= curlist2Rec.basi_sep_prtn_servcost%>
<%= curlist2Rec.base_make_servcost%>
<%= curlist2Rec.basi_make_pcnt%>
<%= curlist2Rec.basi_excs_pcnt%>
<%= curlist2Rec.basi_excs_make_servcost%>
<%= curlist2Rec.crps_cost%>
<%= curlist3Rec.addm_prt_servcost%>
<%= curlist3Rec.sep_prt_servcost%>
<%= curlist3Rec.crps_cost%>
<%= curlist3Rec.dduc_cost%>
<%= curlist3Rec.addm_make_servcost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 15:07:42 KST 2009 */