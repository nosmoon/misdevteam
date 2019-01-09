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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2540_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2540_LDataSet(){}
	public FC_ACCT_2540_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			FC_ACCT_2540_LCURLIST1Record rec = new FC_ACCT_2540_LCURLIST1Record();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.pch_gwgbnm = Util.checkString(rset0.getString("pch_gwgbnm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.pch_compgbnm = Util.checkString(rset0.getString("pch_compgbnm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pch_mccdnm = Util.checkString(rset0.getString("pch_mccdnm"));
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.pch_hsnm = Util.checkString(rset0.getString("pch_hsnm"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.pch_cgbsnm = Util.checkString(rset0.getString("pch_cgbsnm"));
			rec.pch_dsacctnm = Util.checkString(rset0.getString("pch_dsacctnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(21);
		while(rset1.next()){
			FC_ACCT_2540_LCURLIST2Record rec = new FC_ACCT_2540_LCURLIST2Record();
			rec.out_cbjunamt = Util.checkString(rset1.getString("out_cbjunamt"));
			rec.out_dbjunamt = Util.checkString(rset1.getString("out_dbjunamt"));
			rec.out_cbhapamt = Util.checkString(rset1.getString("out_cbhapamt"));
			rec.out_dbhapamt = Util.checkString(rset1.getString("out_dbhapamt"));
			rec.out_cbjanamt = Util.checkString(rset1.getString("out_cbjanamt"));
			rec.out_dbjanamt = Util.checkString(rset1.getString("out_dbjanamt"));
			rec.out_accdjagb = Util.checkString(rset1.getString("out_accdjagb"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2540_LDataSet ds = (FC_ACCT_2540_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2540_LCURLIST1Record curlist1Rec = (FC_ACCT_2540_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2540_LCURLIST2Record curlist2Rec = (FC_ACCT_2540_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.fisc_dt%>
<%= curlist1Rec.slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.slip_sub_seq%>
<%= curlist1Rec.slip_arow_no%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.mang_clsf_cd%>
<%= curlist1Rec.pch_gwgbnm%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.pch_compgbnm%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.boks_dlco_nm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.pch_mccdnm%>
<%= curlist1Rec.insd_acct_cd%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.pch_hsnm%>
<%= curlist1Rec.obj_amt%>
<%= curlist1Rec.pch_cgbsnm%>
<%= curlist1Rec.pch_dsacctnm%>
<%= curlist2Rec.out_cbjunamt%>
<%= curlist2Rec.out_dbjunamt%>
<%= curlist2Rec.out_cbhapamt%>
<%= curlist2Rec.out_dbhapamt%>
<%= curlist2Rec.out_cbjanamt%>
<%= curlist2Rec.out_dbjanamt%>
<%= curlist2Rec.out_accdjagb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 18:02:12 KST 2009 */