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


public class FC_ACCT_6034_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist13 = new ArrayList();
	public ArrayList curlist12 = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6034_LDataSet(){}
	public FC_ACCT_6034_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_6034_LCURLIST1Record rec = new FC_ACCT_6034_LCURLIST1Record();
			rec.seq1 = Util.checkString(rset0.getString("seq1"));
			rec.seq2 = Util.checkString(rset0.getString("seq2"));
			rec.seq3 = Util.checkString(rset0.getString("seq3"));
			rec.seq4 = Util.checkString(rset0.getString("seq4"));
			rec.seq5 = Util.checkString(rset0.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset0.getString("recd_clsf"));
			rec.taxoff = Util.checkString(rset0.getString("taxoff"));
			rec.subm_ymd = Util.checkString(rset0.getString("subm_ymd"));
			rec.subm_pers_clsf = Util.checkString(rset0.getString("subm_pers_clsf"));
			rec.tax_agnt_no = Util.checkString(rset0.getString("tax_agnt_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.corp_nm = Util.checkString(rset0.getString("corp_nm"));
			rec.corp_reg_no = Util.checkString(rset0.getString("corp_reg_no"));
			rec.presi = Util.checkString(rset0.getString("presi"));
			rec.plcw_law_cd = Util.checkString(rset0.getString("plcw_law_cd"));
			rec.plcw_law_addr = Util.checkString(rset0.getString("plcw_law_addr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.subm_noit_tot = Util.checkString(rset0.getString("subm_noit_tot"));
			rec.use_korn_cd_kind = Util.checkString(rset0.getString("use_korn_cd_kind"));
			rec.bill_sender = Util.checkString(rset0.getString("bill_sender"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_6034_LCURLIST2Record rec = new FC_ACCT_6034_LCURLIST2Record();
			rec.seq1 = Util.checkString(rset1.getString("seq1"));
			rec.seq2 = Util.checkString(rset1.getString("seq2"));
			rec.seq3 = Util.checkString(rset1.getString("seq3"));
			rec.seq4 = Util.checkString(rset1.getString("seq4"));
			rec.seq5 = Util.checkString(rset1.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset1.getString("recd_clsf"));
			rec.taxoff = Util.checkString(rset1.getString("taxoff"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.corp_nm = Util.checkString(rset1.getString("corp_nm"));
			rec.presi = Util.checkString(rset1.getString("presi"));
			rec.erplace_law_dstc_cd = Util.checkString(rset1.getString("erplace_law_dstc_cd"));
			rec.erplace_plcw = Util.checkString(rset1.getString("erplace_plcw"));
			rec.bill_sender = Util.checkString(rset1.getString("bill_sender"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			FC_ACCT_6034_LCURLIST3Record rec = new FC_ACCT_6034_LCURLIST3Record();
			rec.seq1 = Util.checkString(rset2.getString("seq1"));
			rec.seq2 = Util.checkString(rset2.getString("seq2"));
			rec.seq3 = Util.checkString(rset2.getString("seq3"));
			rec.seq4 = Util.checkString(rset2.getString("seq4"));
			rec.seq5 = Util.checkString(rset2.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset2.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset2.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset2.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset2.getString("taxoff"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.subm_ern = Util.checkString(rset2.getString("subm_ern"));
			rec.rvrs_yy = Util.checkString(rset2.getString("rvrs_yy"));
			rec.deal_prd_fr = Util.checkString(rset2.getString("deal_prd_fr"));
			rec.deal_prd_to = Util.checkString(rset2.getString("deal_prd_to"));
			rec.make_dt = Util.checkString(rset2.getString("make_dt"));
			rec.sale_dlco_cnt1 = Util.checkString(rset2.getString("sale_dlco_cnt1"));
			rec.stmt_nosh1 = Util.checkString(rset2.getString("stmt_nosh1"));
			rec.minus_indc1 = Util.checkString(rset2.getString("minus_indc1"));
			rec.sale_amt1 = Util.checkString(rset2.getString("sale_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset2.getString("sale_dlco_cnt2"));
			rec.stmt_nosh2 = Util.checkString(rset2.getString("stmt_nosh2"));
			rec.minus_indc2 = Util.checkString(rset2.getString("minus_indc2"));
			rec.sale_amt2 = Util.checkString(rset2.getString("sale_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset2.getString("sale_dlco_cnt3"));
			rec.stmt_nosh3 = Util.checkString(rset2.getString("stmt_nosh3"));
			rec.minus_indc3 = Util.checkString(rset2.getString("minus_indc3"));
			rec.sale_amt3 = Util.checkString(rset2.getString("sale_amt3"));
			rec.bill_sender = Util.checkString(rset2.getString("bill_sender"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			FC_ACCT_6034_LCURLIST4Record rec = new FC_ACCT_6034_LCURLIST4Record();
			rec.seq1 = Util.checkString(rset3.getString("seq1"));
			rec.seq2 = Util.checkString(rset3.getString("seq2"));
			rec.seq3 = Util.checkString(rset3.getString("seq3"));
			rec.seq4 = Util.checkString(rset3.getString("seq4"));
			rec.seq5 = Util.checkString(rset3.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset3.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset3.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset3.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset3.getString("taxoff"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.subm_ern = Util.checkString(rset3.getString("subm_ern"));
			rec.sale_dlco_ern = Util.checkString(rset3.getString("sale_dlco_ern"));
			rec.corp_nm = Util.checkString(rset3.getString("corp_nm"));
			rec.stmt_nosh = Util.checkString(rset3.getString("stmt_nosh"));
			rec.minus_indc = Util.checkString(rset3.getString("minus_indc"));
			rec.sale_amt = Util.checkString(rset3.getString("sale_amt"));
			rec.bill_sender = Util.checkString(rset3.getString("bill_sender"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			FC_ACCT_6034_LCURLIST5Record rec = new FC_ACCT_6034_LCURLIST5Record();
			rec.seq1 = Util.checkString(rset4.getString("seq1"));
			rec.seq2 = Util.checkString(rset4.getString("seq2"));
			rec.seq3 = Util.checkString(rset4.getString("seq3"));
			rec.seq4 = Util.checkString(rset4.getString("seq4"));
			rec.seq5 = Util.checkString(rset4.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset4.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset4.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset4.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset4.getString("taxoff"));
			rec.seq = Util.checkString(rset4.getString("seq"));
			rec.subm_ern = Util.checkString(rset4.getString("subm_ern"));
			rec.rvrs_yy = Util.checkString(rset4.getString("rvrs_yy"));
			rec.deal_prd_fr = Util.checkString(rset4.getString("deal_prd_fr"));
			rec.deal_prd_to = Util.checkString(rset4.getString("deal_prd_to"));
			rec.make_dt = Util.checkString(rset4.getString("make_dt"));
			rec.sale_dlco_cnt1 = Util.checkString(rset4.getString("sale_dlco_cnt1"));
			rec.stmt_nosh1 = Util.checkString(rset4.getString("stmt_nosh1"));
			rec.minus_indc1 = Util.checkString(rset4.getString("minus_indc1"));
			rec.sale_amt1 = Util.checkString(rset4.getString("sale_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset4.getString("sale_dlco_cnt2"));
			rec.stmt_nosh2 = Util.checkString(rset4.getString("stmt_nosh2"));
			rec.minus_indc2 = Util.checkString(rset4.getString("minus_indc2"));
			rec.sale_amt2 = Util.checkString(rset4.getString("sale_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset4.getString("sale_dlco_cnt3"));
			rec.stmt_nosh3 = Util.checkString(rset4.getString("stmt_nosh3"));
			rec.minus_indc3 = Util.checkString(rset4.getString("minus_indc3"));
			rec.sale_amt3 = Util.checkString(rset4.getString("sale_amt3"));
			rec.bill_sender = Util.checkString(rset4.getString("bill_sender"));
			this.curlist5.add(rec);
		}
		System.out.println("bong.ds");
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		System.out.println(rset5.getRow());
		while(rset5.next()){
			FC_ACCT_6034_LCURLIST6Record rec = new FC_ACCT_6034_LCURLIST6Record();
			rec.seq1 = Util.checkString(rset5.getString("seq1"));
			rec.seq2 = Util.checkString(rset5.getString("seq2"));
			rec.seq3 = Util.checkString(rset5.getString("seq3"));
			rec.seq4 = Util.checkString(rset5.getString("seq4"));
			rec.seq5 = Util.checkString(rset5.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset5.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset5.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset5.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset5.getString("taxoff"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.subm_ern = Util.checkString(rset5.getString("subm_ern"));
			rec.sale_dlco_ern = Util.checkString(rset5.getString("sale_dlco_ern"));
			rec.corp_nm = Util.checkString(rset5.getString("corp_nm"));
			rec.stmt_nosh = Util.checkString(rset5.getString("stmt_nosh"));
			rec.minus_indc = Util.checkString(rset5.getString("minus_indc"));
			rec.sale_amt = Util.checkString(rset5.getString("sale_amt"));
			rec.bill_sender = Util.checkString(rset5.getString("bill_sender"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			FC_ACCT_6034_LCURLIST10Record rec = new FC_ACCT_6034_LCURLIST10Record();
			rec.seq1 = Util.checkString(rset6.getString("seq1"));
			rec.seq2 = Util.checkString(rset6.getString("seq2"));
			rec.seq3 = Util.checkString(rset6.getString("seq3"));
			rec.seq4 = Util.checkString(rset6.getString("seq4"));
			rec.seq5 = Util.checkString(rset6.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset6.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset6.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset6.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset6.getString("taxoff"));
			rec.seq = Util.checkString(rset6.getString("seq"));
			rec.subm_ern = Util.checkString(rset6.getString("subm_ern"));
			rec.rvrs_yy = Util.checkString(rset6.getString("rvrs_yy"));
			rec.deal_prd_fr = Util.checkString(rset6.getString("deal_prd_fr"));
			rec.deal_prd_to = Util.checkString(rset6.getString("deal_prd_to"));
			rec.make_dt = Util.checkString(rset6.getString("make_dt"));
			rec.sale_dlco_cnt1 = Util.checkString(rset6.getString("sale_dlco_cnt1"));
			rec.stmt_nosh1 = Util.checkString(rset6.getString("stmt_nosh1"));
			rec.minus_indc1 = Util.checkString(rset6.getString("minus_indc1"));
			rec.sale_amt1 = Util.checkString(rset6.getString("sale_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset6.getString("sale_dlco_cnt2"));
			rec.stmt_nosh2 = Util.checkString(rset6.getString("stmt_nosh2"));
			rec.minus_indc2 = Util.checkString(rset6.getString("minus_indc2"));
			rec.sale_amt2 = Util.checkString(rset6.getString("sale_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset6.getString("sale_dlco_cnt3"));
			rec.stmt_nosh3 = Util.checkString(rset6.getString("stmt_nosh3"));
			rec.minus_indc3 = Util.checkString(rset6.getString("minus_indc3"));
			rec.sale_amt3 = Util.checkString(rset6.getString("sale_amt3"));
			rec.bill_sender = Util.checkString(rset6.getString("bill_sender"));
			this.curlist10.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			FC_ACCT_6034_LCURLIST11Record rec = new FC_ACCT_6034_LCURLIST11Record();
			rec.data_clsf = Util.checkString(rset7.getString("data_clsf"));
			rec.tax_clsf = Util.checkString(rset7.getString("tax_clsf"));
			rec.ern = Util.checkString(rset7.getString("ern"));
			rec.ern_nm = Util.checkString(rset7.getString("ern_nm"));
			rec.cnt = Util.checkString(rset7.getString("cnt"));
			rec.suply_amt = Util.checkString(rset7.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset7.getString("vat_amt"));
			rec.total_amt = Util.checkString(rset7.getString("total_amt"));
			this.curlist11.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(16);
		while(rset8.next()){
			FC_ACCT_6034_LCURLIST12Record rec = new FC_ACCT_6034_LCURLIST12Record();
			rec.seq1 = Util.checkString(rset8.getString("seq1"));
			rec.seq2 = Util.checkString(rset8.getString("seq2"));
			rec.seq3 = Util.checkString(rset8.getString("seq3"));
			rec.seq4 = Util.checkString(rset8.getString("seq4"));
			rec.seq5 = Util.checkString(rset8.getString("seq5"));
			rec.recd_clsf = Util.checkString(rset8.getString("recd_clsf"));
			rec.data_clsf = Util.checkString(rset8.getString("data_clsf"));
			rec.qt_clsf = Util.checkString(rset8.getString("qt_clsf"));
			rec.taxoff = Util.checkString(rset8.getString("taxoff"));
			rec.seq = Util.checkString(rset8.getString("seq"));
			rec.subm_ern = Util.checkString(rset8.getString("subm_ern"));
			rec.rvrs_yy = Util.checkString(rset8.getString("rvrs_yy"));
			rec.deal_prd_fr = Util.checkString(rset8.getString("deal_prd_fr"));
			rec.deal_prd_to = Util.checkString(rset8.getString("deal_prd_to"));
			rec.make_dt = Util.checkString(rset8.getString("make_dt"));
			rec.sale_dlco_cnt1 = Util.checkString(rset8.getString("sale_dlco_cnt1"));
			rec.stmt_nosh1 = Util.checkString(rset8.getString("stmt_nosh1"));
			rec.minus_indc1 = Util.checkString(rset8.getString("minus_indc1"));
			rec.sale_amt1 = Util.checkString(rset8.getString("sale_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset8.getString("sale_dlco_cnt2"));
			rec.stmt_nosh2 = Util.checkString(rset8.getString("stmt_nosh2"));
			rec.minus_indc2 = Util.checkString(rset8.getString("minus_indc2"));
			rec.sale_amt2 = Util.checkString(rset8.getString("sale_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset8.getString("sale_dlco_cnt3"));
			rec.stmt_nosh3 = Util.checkString(rset8.getString("stmt_nosh3"));
			rec.minus_indc3 = Util.checkString(rset8.getString("minus_indc3"));
			rec.sale_amt3 = Util.checkString(rset8.getString("sale_amt3"));
			rec.bill_sender = Util.checkString(rset8.getString("bill_sender"));
			this.curlist12.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(17);
		while(rset9.next()){
			FC_ACCT_6034_LCURLIST13Record rec = new FC_ACCT_6034_LCURLIST13Record();
			rec.data_clsf = Util.checkString(rset9.getString("data_clsf"));
			rec.tax_clsf = Util.checkString(rset9.getString("tax_clsf"));
			rec.ern = Util.checkString(rset9.getString("ern"));
			rec.ern_nm = Util.checkString(rset9.getString("ern_nm"));
			rec.cnt = Util.checkString(rset9.getString("cnt"));
			rec.suply_amt = Util.checkString(rset9.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset9.getString("vat_amt"));
			rec.total_amt = Util.checkString(rset9.getString("total_amt"));
			this.curlist13.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6034_LDataSet ds = (FC_ACCT_6034_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6034_LCURLIST1Record curlist1Rec = (FC_ACCT_6034_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6034_LCURLIST2Record curlist2Rec = (FC_ACCT_6034_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_6034_LCURLIST3Record curlist3Rec = (FC_ACCT_6034_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_6034_LCURLIST4Record curlist4Rec = (FC_ACCT_6034_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_ACCT_6034_LCURLIST5Record curlist5Rec = (FC_ACCT_6034_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		FC_ACCT_6034_LCURLIST6Record curlist6Rec = (FC_ACCT_6034_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		FC_ACCT_6034_LCURLIST10Record curlist10Rec = (FC_ACCT_6034_LCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist11.size(); i++){
		FC_ACCT_6034_LCURLIST11Record curlist11Rec = (FC_ACCT_6034_LCURLIST11Record)ds.curlist11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist12.size(); i++){
		FC_ACCT_6034_LCURLIST12Record curlist12Rec = (FC_ACCT_6034_LCURLIST12Record)ds.curlist12.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist13.size(); i++){
		FC_ACCT_6034_LCURLIST13Record curlist13Rec = (FC_ACCT_6034_LCURLIST13Record)ds.curlist13.get(i);%>
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
<%= ds.getCurlist10()%>
<%= ds.getCurlist11()%>
<%= ds.getCurlist12()%>
<%= ds.getCurlist13()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.seq1%>
<%= curlist1Rec.seq2%>
<%= curlist1Rec.seq3%>
<%= curlist1Rec.seq4%>
<%= curlist1Rec.seq5%>
<%= curlist1Rec.recd_clsf%>
<%= curlist1Rec.taxoff%>
<%= curlist1Rec.subm_ymd%>
<%= curlist1Rec.subm_pers_clsf%>
<%= curlist1Rec.tax_agnt_no%>
<%= curlist1Rec.ern%>
<%= curlist1Rec.corp_nm%>
<%= curlist1Rec.corp_reg_no%>
<%= curlist1Rec.presi%>
<%= curlist1Rec.plcw_law_cd%>
<%= curlist1Rec.plcw_law_addr%>
<%= curlist1Rec.tel_no%>
<%= curlist1Rec.subm_noit_tot%>
<%= curlist1Rec.use_korn_cd_kind%>
<%= curlist1Rec.bill_sender%>
<%= curlist2Rec.seq1%>
<%= curlist2Rec.seq2%>
<%= curlist2Rec.seq3%>
<%= curlist2Rec.seq4%>
<%= curlist2Rec.seq5%>
<%= curlist2Rec.recd_clsf%>
<%= curlist2Rec.taxoff%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.ern%>
<%= curlist2Rec.corp_nm%>
<%= curlist2Rec.presi%>
<%= curlist2Rec.erplace_law_dstc_cd%>
<%= curlist2Rec.erplace_plcw%>
<%= curlist2Rec.bill_sender%>
<%= curlist3Rec.seq1%>
<%= curlist3Rec.seq2%>
<%= curlist3Rec.seq3%>
<%= curlist3Rec.seq4%>
<%= curlist3Rec.seq5%>
<%= curlist3Rec.recd_clsf%>
<%= curlist3Rec.data_clsf%>
<%= curlist3Rec.qt_clsf%>
<%= curlist3Rec.taxoff%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.subm_ern%>
<%= curlist3Rec.rvrs_yy%>
<%= curlist3Rec.deal_prd_fr%>
<%= curlist3Rec.deal_prd_to%>
<%= curlist3Rec.make_dt%>
<%= curlist3Rec.sale_dlco_cnt1%>
<%= curlist3Rec.stmt_nosh1%>
<%= curlist3Rec.minus_indc1%>
<%= curlist3Rec.sale_amt1%>
<%= curlist3Rec.sale_dlco_cnt2%>
<%= curlist3Rec.stmt_nosh2%>
<%= curlist3Rec.minus_indc2%>
<%= curlist3Rec.sale_amt2%>
<%= curlist3Rec.sale_dlco_cnt3%>
<%= curlist3Rec.stmt_nosh3%>
<%= curlist3Rec.minus_indc3%>
<%= curlist3Rec.sale_amt3%>
<%= curlist3Rec.bill_sender%>
<%= curlist4Rec.seq1%>
<%= curlist4Rec.seq2%>
<%= curlist4Rec.seq3%>
<%= curlist4Rec.seq4%>
<%= curlist4Rec.seq5%>
<%= curlist4Rec.recd_clsf%>
<%= curlist4Rec.data_clsf%>
<%= curlist4Rec.qt_clsf%>
<%= curlist4Rec.taxoff%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.subm_ern%>
<%= curlist4Rec.sale_dlco_ern%>
<%= curlist4Rec.corp_nm%>
<%= curlist4Rec.stmt_nosh%>
<%= curlist4Rec.minus_indc%>
<%= curlist4Rec.sale_amt%>
<%= curlist4Rec.bill_sender%>
<%= curlist5Rec.seq1%>
<%= curlist5Rec.seq2%>
<%= curlist5Rec.seq3%>
<%= curlist5Rec.seq4%>
<%= curlist5Rec.seq5%>
<%= curlist5Rec.recd_clsf%>
<%= curlist5Rec.data_clsf%>
<%= curlist5Rec.qt_clsf%>
<%= curlist5Rec.taxoff%>
<%= curlist5Rec.seq%>
<%= curlist5Rec.subm_ern%>
<%= curlist5Rec.rvrs_yy%>
<%= curlist5Rec.deal_prd_fr%>
<%= curlist5Rec.deal_prd_to%>
<%= curlist5Rec.make_dt%>
<%= curlist5Rec.sale_dlco_cnt1%>
<%= curlist5Rec.stmt_nosh1%>
<%= curlist5Rec.minus_indc1%>
<%= curlist5Rec.sale_amt1%>
<%= curlist5Rec.sale_dlco_cnt2%>
<%= curlist5Rec.stmt_nosh2%>
<%= curlist5Rec.minus_indc2%>
<%= curlist5Rec.sale_amt2%>
<%= curlist5Rec.sale_dlco_cnt3%>
<%= curlist5Rec.stmt_nosh3%>
<%= curlist5Rec.minus_indc3%>
<%= curlist5Rec.sale_amt3%>
<%= curlist5Rec.bill_sender%>
<%= curlist6Rec.seq1%>
<%= curlist6Rec.seq2%>
<%= curlist6Rec.seq3%>
<%= curlist6Rec.seq4%>
<%= curlist6Rec.seq5%>
<%= curlist6Rec.recd_clsf%>
<%= curlist6Rec.data_clsf%>
<%= curlist6Rec.qt_clsf%>
<%= curlist6Rec.taxoff%>
<%= curlist6Rec.seq%>
<%= curlist6Rec.subm_ern%>
<%= curlist6Rec.sale_dlco_ern%>
<%= curlist6Rec.corp_nm%>
<%= curlist6Rec.stmt_nosh%>
<%= curlist6Rec.minus_indc%>
<%= curlist6Rec.sale_amt%>
<%= curlist6Rec.bill_sender%>
<%= curlist10Rec.seq1%>
<%= curlist10Rec.seq2%>
<%= curlist10Rec.seq3%>
<%= curlist10Rec.seq4%>
<%= curlist10Rec.seq5%>
<%= curlist10Rec.recd_clsf%>
<%= curlist10Rec.data_clsf%>
<%= curlist10Rec.qt_clsf%>
<%= curlist10Rec.taxoff%>
<%= curlist10Rec.seq%>
<%= curlist10Rec.subm_ern%>
<%= curlist10Rec.rvrs_yy%>
<%= curlist10Rec.deal_prd_fr%>
<%= curlist10Rec.deal_prd_to%>
<%= curlist10Rec.make_dt%>
<%= curlist10Rec.sale_dlco_cnt1%>
<%= curlist10Rec.stmt_nosh1%>
<%= curlist10Rec.minus_indc1%>
<%= curlist10Rec.sale_amt1%>
<%= curlist10Rec.sale_dlco_cnt2%>
<%= curlist10Rec.stmt_nosh2%>
<%= curlist10Rec.minus_indc2%>
<%= curlist10Rec.sale_amt2%>
<%= curlist10Rec.sale_dlco_cnt3%>
<%= curlist10Rec.stmt_nosh3%>
<%= curlist10Rec.minus_indc3%>
<%= curlist10Rec.sale_amt3%>
<%= curlist10Rec.bill_sender%>
<%= curlist11Rec.data_clsf%>
<%= curlist11Rec.tax_clsf%>
<%= curlist11Rec.ern%>
<%= curlist11Rec.ern_nm%>
<%= curlist11Rec.cnt%>
<%= curlist11Rec.suply_amt%>
<%= curlist11Rec.vat_amt%>
<%= curlist11Rec.total_amt%>
<%= curlist12Rec.seq1%>
<%= curlist12Rec.seq2%>
<%= curlist12Rec.seq3%>
<%= curlist12Rec.seq4%>
<%= curlist12Rec.seq5%>
<%= curlist12Rec.recd_clsf%>
<%= curlist12Rec.data_clsf%>
<%= curlist12Rec.qt_clsf%>
<%= curlist12Rec.taxoff%>
<%= curlist12Rec.seq%>
<%= curlist12Rec.subm_ern%>
<%= curlist12Rec.rvrs_yy%>
<%= curlist12Rec.deal_prd_fr%>
<%= curlist12Rec.deal_prd_to%>
<%= curlist12Rec.make_dt%>
<%= curlist12Rec.sale_dlco_cnt1%>
<%= curlist12Rec.stmt_nosh1%>
<%= curlist12Rec.minus_indc1%>
<%= curlist12Rec.sale_amt1%>
<%= curlist12Rec.sale_dlco_cnt2%>
<%= curlist12Rec.stmt_nosh2%>
<%= curlist12Rec.minus_indc2%>
<%= curlist12Rec.sale_amt2%>
<%= curlist12Rec.sale_dlco_cnt3%>
<%= curlist12Rec.stmt_nosh3%>
<%= curlist12Rec.minus_indc3%>
<%= curlist12Rec.sale_amt3%>
<%= curlist12Rec.bill_sender%>
<%= curlist13Rec.data_clsf%>
<%= curlist13Rec.tax_clsf%>
<%= curlist13Rec.ern%>
<%= curlist13Rec.ern_nm%>
<%= curlist13Rec.cnt%>
<%= curlist13Rec.suply_amt%>
<%= curlist13Rec.vat_amt%>
<%= curlist13Rec.total_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */