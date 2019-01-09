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


public class FC_ACCT_6032_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist13 = new ArrayList();
	public ArrayList curlist12 = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6032_LDataSet(){}
	public FC_ACCT_6032_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6032_LCURLIST1Record rec = new FC_ACCT_6032_LCURLIST1Record();
			rec.data_clsf = Util.checkString(rset0.getString("data_clsf"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.firmnm = Util.checkString(rset0.getString("firmnm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.deal_prd = Util.checkString(rset0.getString("deal_prd"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.nul = Util.checkString(rset0.getString("nul"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			FC_ACCT_6032_LCURLIST2Record rec = new FC_ACCT_6032_LCURLIST2Record();
			rec.data_clsf = Util.checkString(rset1.getString("data_clsf"));
			rec.suply_pers_reg_no = Util.checkString(rset1.getString("suply_pers_reg_no"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.rec_suply_reg_no = Util.checkString(rset1.getString("rec_suply_reg_no"));
			rec.firmnm = Util.checkString(rset1.getString("firmnm"));
			rec.bizcond = Util.checkString(rset1.getString("bizcond"));
			rec.item = Util.checkString(rset1.getString("item"));
			rec.nosh = Util.checkString(rset1.getString("nosh"));
			rec.deal_cnt = Util.checkString(rset1.getString("deal_cnt"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.whosal_cd = Util.checkString(rset1.getString("whosal_cd"));
			rec.retail_cd = Util.checkString(rset1.getString("retail_cd"));
			rec.vol_no = Util.checkString(rset1.getString("vol_no"));
			rec.subm_paper = Util.checkString(rset1.getString("subm_paper"));
			rec.nul = Util.checkString(rset1.getString("nul"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			FC_ACCT_6032_LCURLIST3Record rec = new FC_ACCT_6032_LCURLIST3Record();
			rec.data_clsf = Util.checkString(rset2.getString("data_clsf"));
			rec.suply_pers_reg_no = Util.checkString(rset2.getString("suply_pers_reg_no"));
			rec.sale_dlco_cnt1 = Util.checkString(rset2.getString("sale_dlco_cnt1"));
			rec.nosh1 = Util.checkString(rset2.getString("nosh1"));
			rec.suply_amt1 = Util.checkString(rset2.getString("suply_amt1"));
			rec.vat_amt1 = Util.checkString(rset2.getString("vat_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset2.getString("sale_dlco_cnt2"));
			rec.nosh2 = Util.checkString(rset2.getString("nosh2"));
			rec.suply_amt2 = Util.checkString(rset2.getString("suply_amt2"));
			rec.vat_amt2 = Util.checkString(rset2.getString("vat_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset2.getString("sale_dlco_cnt3"));
			rec.nosh3 = Util.checkString(rset2.getString("nosh3"));
			rec.suply_amt3 = Util.checkString(rset2.getString("suply_amt3"));
			rec.vat_amt3 = Util.checkString(rset2.getString("vat_amt3"));
			rec.nul = Util.checkString(rset2.getString("nul"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			FC_ACCT_6032_LCURLIST4Record rec = new FC_ACCT_6032_LCURLIST4Record();
			rec.data_clsf = Util.checkString(rset3.getString("data_clsf"));
			rec.rec_suply_reg_no = Util.checkString(rset3.getString("rec_suply_reg_no"));
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.suply_pers_reg_no = Util.checkString(rset3.getString("suply_pers_reg_no"));
			rec.firmnm = Util.checkString(rset3.getString("firmnm"));
			rec.bizcond = Util.checkString(rset3.getString("bizcond"));
			rec.item = Util.checkString(rset3.getString("item"));
			rec.nosh = Util.checkString(rset3.getString("nosh"));
			rec.nul_cnt = Util.checkString(rset3.getString("nul_cnt"));
			rec.suply_amt = Util.checkString(rset3.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset3.getString("vat_amt"));
			rec.whosal_cd = Util.checkString(rset3.getString("whosal_cd"));
			rec.retail_cd = Util.checkString(rset3.getString("retail_cd"));
			rec.vol_no = Util.checkString(rset3.getString("vol_no"));
			rec.subm_paper = Util.checkString(rset3.getString("subm_paper"));
			rec.nul = Util.checkString(rset3.getString("nul"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(13);
		while(rset4.next()){
			FC_ACCT_6032_LCURLIST5Record rec = new FC_ACCT_6032_LCURLIST5Record();
			rec.data_clsf = Util.checkString(rset4.getString("data_clsf"));
			rec.rec_suply_reg_no = Util.checkString(rset4.getString("rec_suply_reg_no"));
			rec.sale_dlco_cnt1 = Util.checkString(rset4.getString("sale_dlco_cnt1"));
			rec.nosh1 = Util.checkString(rset4.getString("nosh1"));
			rec.suply_amt1 = Util.checkString(rset4.getString("suply_amt1"));
			rec.vat_amt1 = Util.checkString(rset4.getString("vat_amt1"));
			rec.sale_dlco_cnt2 = Util.checkString(rset4.getString("sale_dlco_cnt2"));
			rec.nosh2 = Util.checkString(rset4.getString("nosh2"));
			rec.suply_amt2 = Util.checkString(rset4.getString("suply_amt2"));
			rec.vat_amt2 = Util.checkString(rset4.getString("vat_amt2"));
			rec.sale_dlco_cnt3 = Util.checkString(rset4.getString("sale_dlco_cnt3"));
			rec.nosh3 = Util.checkString(rset4.getString("nosh3"));
			rec.suply_amt3 = Util.checkString(rset4.getString("suply_amt3"));
			rec.vat_amt3 = Util.checkString(rset4.getString("vat_amt3"));
			rec.nul = Util.checkString(rset4.getString("nul"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(14);
		while(rset5.next()){
			FC_ACCT_6032_LCURLIST10Record rec = new FC_ACCT_6032_LCURLIST10Record();
			rec.data_clsf = Util.checkString(rset5.getString("data_clsf"));
			rec.tax_clsf = Util.checkString(rset5.getString("tax_clsf"));
			rec.ern = Util.checkString(rset5.getString("ern"));
			rec.ern_nm = Util.checkString(rset5.getString("ern_nm"));
			rec.cnt = Util.checkString(rset5.getString("cnt"));
			rec.suply_amt = Util.checkString(rset5.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset5.getString("vat_amt"));
			rec.total_amt = Util.checkString(rset5.getString("total_amt"));
			this.curlist10.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(15);
		while(rset6.next()){
			FC_ACCT_6032_LCURLIST11Record rec = new FC_ACCT_6032_LCURLIST11Record();
			rec.data_clsf = Util.checkString(rset6.getString("data_clsf"));
			rec.rec_suply_reg_no = Util.checkString(rset6.getString("rec_suply_reg_no"));
			rec.sale_dlco_cnt1 = Util.checkString(rset6.getString("sale_dlco_cnt1"));
			rec.nosh1 = Util.checkString(rset6.getString("nosh1"));
			rec.suply_amt1 = Util.checkString(rset6.getString("suply_amt1"));
			rec.vat_amt1 = Util.checkString(rset6.getString("vat_amt1"));
			rec.total_amt1 = Util.checkString(rset6.getString("total_amt1"));
			rec.nul = Util.checkString(rset6.getString("nul"));
			this.curlist11.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(16);
		while(rset7.next()){
			FC_ACCT_6032_LCURLIST12Record rec = new FC_ACCT_6032_LCURLIST12Record();
			rec.data_clsf = Util.checkString(rset7.getString("data_clsf"));
			rec.tax_clsf = Util.checkString(rset7.getString("tax_clsf"));
			rec.ern = Util.checkString(rset7.getString("ern"));
			rec.ern_nm = Util.checkString(rset7.getString("ern_nm"));
			rec.cnt = Util.checkString(rset7.getString("cnt"));
			rec.suply_amt = Util.checkString(rset7.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset7.getString("vat_amt"));
			rec.total_amt = Util.checkString(rset7.getString("total_amt"));
			this.curlist12.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(17);
		while(rset8.next()){
			FC_ACCT_6032_LCURLIST13Record rec = new FC_ACCT_6032_LCURLIST13Record();
			rec.data_clsf = Util.checkString(rset8.getString("data_clsf"));
			rec.rec_suply_reg_no = Util.checkString(rset8.getString("rec_suply_reg_no"));
			rec.sale_dlco_cnt1 = Util.checkString(rset8.getString("sale_dlco_cnt1"));
			rec.nosh1 = Util.checkString(rset8.getString("nosh1"));
			rec.suply_amt1 = Util.checkString(rset8.getString("suply_amt1"));
			rec.vat_amt1 = Util.checkString(rset8.getString("vat_amt1"));
			rec.total_amt1 = Util.checkString(rset8.getString("total_amt1"));
			rec.nul = Util.checkString(rset8.getString("nul"));
			this.curlist13.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6032_LDataSet ds = (FC_ACCT_6032_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6032_LCURLIST1Record curlist1Rec = (FC_ACCT_6032_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6032_LCURLIST2Record curlist2Rec = (FC_ACCT_6032_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_6032_LCURLIST3Record curlist3Rec = (FC_ACCT_6032_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_6032_LCURLIST4Record curlist4Rec = (FC_ACCT_6032_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_ACCT_6032_LCURLIST5Record curlist5Rec = (FC_ACCT_6032_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		FC_ACCT_6032_LCURLIST10Record curlist10Rec = (FC_ACCT_6032_LCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist11.size(); i++){
		FC_ACCT_6032_LCURLIST11Record curlist11Rec = (FC_ACCT_6032_LCURLIST11Record)ds.curlist11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist12.size(); i++){
		FC_ACCT_6032_LCURLIST12Record curlist12Rec = (FC_ACCT_6032_LCURLIST12Record)ds.curlist12.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist13.size(); i++){
		FC_ACCT_6032_LCURLIST13Record curlist13Rec = (FC_ACCT_6032_LCURLIST13Record)ds.curlist13.get(i);%>
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
<%= ds.getCurlist10()%>
<%= ds.getCurlist11()%>
<%= ds.getCurlist12()%>
<%= ds.getCurlist13()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.data_clsf%>
<%= curlist1Rec.ern%>
<%= curlist1Rec.firmnm%>
<%= curlist1Rec.presi_nm%>
<%= curlist1Rec.addr%>
<%= curlist1Rec.bizcond%>
<%= curlist1Rec.item%>
<%= curlist1Rec.deal_prd%>
<%= curlist1Rec.make_dt%>
<%= curlist1Rec.nul%>
<%= curlist2Rec.data_clsf%>
<%= curlist2Rec.suply_pers_reg_no%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.rec_suply_reg_no%>
<%= curlist2Rec.firmnm%>
<%= curlist2Rec.bizcond%>
<%= curlist2Rec.item%>
<%= curlist2Rec.nosh%>
<%= curlist2Rec.deal_cnt%>
<%= curlist2Rec.suply_amt%>
<%= curlist2Rec.vat_amt%>
<%= curlist2Rec.whosal_cd%>
<%= curlist2Rec.retail_cd%>
<%= curlist2Rec.vol_no%>
<%= curlist2Rec.subm_paper%>
<%= curlist2Rec.nul%>
<%= curlist3Rec.data_clsf%>
<%= curlist3Rec.suply_pers_reg_no%>
<%= curlist3Rec.sale_dlco_cnt1%>
<%= curlist3Rec.nosh1%>
<%= curlist3Rec.suply_amt1%>
<%= curlist3Rec.vat_amt1%>
<%= curlist3Rec.sale_dlco_cnt2%>
<%= curlist3Rec.nosh2%>
<%= curlist3Rec.suply_amt2%>
<%= curlist3Rec.vat_amt2%>
<%= curlist3Rec.sale_dlco_cnt3%>
<%= curlist3Rec.nosh3%>
<%= curlist3Rec.suply_amt3%>
<%= curlist3Rec.vat_amt3%>
<%= curlist3Rec.nul%>
<%= curlist4Rec.data_clsf%>
<%= curlist4Rec.rec_suply_reg_no%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.suply_pers_reg_no%>
<%= curlist4Rec.firmnm%>
<%= curlist4Rec.bizcond%>
<%= curlist4Rec.item%>
<%= curlist4Rec.nosh%>
<%= curlist4Rec.nul_cnt%>
<%= curlist4Rec.suply_amt%>
<%= curlist4Rec.vat_amt%>
<%= curlist4Rec.whosal_cd%>
<%= curlist4Rec.retail_cd%>
<%= curlist4Rec.vol_no%>
<%= curlist4Rec.subm_paper%>
<%= curlist4Rec.nul%>
<%= curlist5Rec.data_clsf%>
<%= curlist5Rec.rec_suply_reg_no%>
<%= curlist5Rec.sale_dlco_cnt1%>
<%= curlist5Rec.nosh1%>
<%= curlist5Rec.suply_amt1%>
<%= curlist5Rec.vat_amt1%>
<%= curlist5Rec.sale_dlco_cnt2%>
<%= curlist5Rec.nosh2%>
<%= curlist5Rec.suply_amt2%>
<%= curlist5Rec.vat_amt2%>
<%= curlist5Rec.sale_dlco_cnt3%>
<%= curlist5Rec.nosh3%>
<%= curlist5Rec.suply_amt3%>
<%= curlist5Rec.vat_amt3%>
<%= curlist5Rec.nul%>
<%= curlist10Rec.data_clsf%>
<%= curlist10Rec.tax_clsf%>
<%= curlist10Rec.ern%>
<%= curlist10Rec.ern_nm%>
<%= curlist10Rec.cnt%>
<%= curlist10Rec.suply_amt%>
<%= curlist10Rec.vat_amt%>
<%= curlist10Rec.total_amt%>
<%= curlist11Rec.data_clsf%>
<%= curlist11Rec.rec_suply_reg_no%>
<%= curlist11Rec.sale_dlco_cnt1%>
<%= curlist11Rec.nosh1%>
<%= curlist11Rec.suply_amt1%>
<%= curlist11Rec.vat_amt1%>
<%= curlist11Rec.total_amt1%>
<%= curlist11Rec.nul%>
<%= curlist12Rec.data_clsf%>
<%= curlist12Rec.tax_clsf%>
<%= curlist12Rec.ern%>
<%= curlist12Rec.ern_nm%>
<%= curlist12Rec.cnt%>
<%= curlist12Rec.suply_amt%>
<%= curlist12Rec.vat_amt%>
<%= curlist12Rec.total_amt%>
<%= curlist13Rec.data_clsf%>
<%= curlist13Rec.rec_suply_reg_no%>
<%= curlist13Rec.sale_dlco_cnt1%>
<%= curlist13Rec.nosh1%>
<%= curlist13Rec.suply_amt1%>
<%= curlist13Rec.vat_amt1%>
<%= curlist13Rec.total_amt1%>
<%= curlist13Rec.nul%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */