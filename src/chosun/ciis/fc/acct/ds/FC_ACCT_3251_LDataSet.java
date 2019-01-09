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


public class FC_ACCT_3251_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3251_LDataSet(){}
	public FC_ACCT_3251_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_3251_LCURLISTRecord rec = new FC_ACCT_3251_LCURLISTRecord();
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.pch_cgbuseonm = Util.checkString(rset0.getString("pch_cgbuseonm"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.pch_irjnm = Util.checkString(rset0.getString("pch_irjnm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			rec.reso_amt_ch = Util.checkString(rset0.getString("reso_amt_ch"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_3251_LCURLIST1Record rec = new FC_ACCT_3251_LCURLIST1Record();
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.pch_sdysnm = Util.checkString(rset1.getString("pch_sdysnm"));
			rec.dr_amt = Util.checkString(rset1.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset1.getString("crdt_amt"));
			rec.rmks1 = Util.checkString(rset1.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.drcr_clsf = Util.checkString(rset1.getString("drcr_clsf"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset1.getString("boks_dlco_nm"));
			rec.mang_clsf_cd = Util.checkString(rset1.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.incm_clsf_cd = Util.checkString(rset1.getString("incm_clsf_cd"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset1.getString("dtls_medi_cd"));
			rec.evnt_cd = Util.checkString(rset1.getString("evnt_cd"));
			rec.pch_hsnm = Util.checkString(rset1.getString("pch_hsnm"));
			rec.use_dept_cd = Util.checkString(rset1.getString("use_dept_cd"));
			rec.pch_buseonm = Util.checkString(rset1.getString("pch_buseonm"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.pch_banknm = Util.checkString(rset1.getString("pch_banknm"));
			rec.unit = Util.checkString(rset1.getString("unit"));
			rec.qunt = Util.checkString(rset1.getString("qunt"));
			rec.obj_acct_cd = Util.checkString(rset1.getString("obj_acct_cd"));
			rec.pch_dsacctnm = Util.checkString(rset1.getString("pch_dsacctnm"));
			rec.obj_dt = Util.checkString(rset1.getString("obj_dt"));
			rec.obj_amt = Util.checkString(rset1.getString("obj_amt"));
			rec.frcr_clsf_cd = Util.checkString(rset1.getString("frcr_clsf_cd"));
			rec.frcr_amt = Util.checkString(rset1.getString("frcr_amt"));
			rec.exrate = Util.checkString(rset1.getString("exrate"));
			rec.note_stat = Util.checkString(rset1.getString("note_stat"));
			rec.intg_dlco_cd = Util.checkString(rset1.getString("intg_dlco_cd"));
			rec.prop_equip_cd = Util.checkString(rset1.getString("prop_equip_cd"));
			rec.tax_stmt_no = Util.checkString(rset1.getString("tax_stmt_no"));
			rec.make_dt = Util.checkString(rset1.getString("make_dt"));
			rec.erplace_cd = Util.checkString(rset1.getString("erplace_cd"));
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.setoff_slip_no = Util.checkString(rset1.getString("setoff_slip_no"));
			rec.occr_slip_clsf = Util.checkString(rset1.getString("occr_slip_clsf"));
			rec.occr_slip = Util.checkString(rset1.getString("occr_slip"));
			rec.mang_clsf_nm = Util.checkString(rset1.getString("mang_clsf_nm"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.email_id = Util.checkString(rset1.getString("email_id"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.item = Util.checkString(rset1.getString("item"));
			rec.re_issu_resn_cd = Util.checkString(rset1.getString("re_issu_resn_cd"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_3251_LDataSet ds = (FC_ACCT_3251_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3251_LCURLISTRecord curlistRec = (FC_ACCT_3251_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_3251_LCURLIST1Record curlist1Rec = (FC_ACCT_3251_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlistRec.clam_dept_cd%>
<%= curlistRec.pch_cgbuseonm%>
<%= curlistRec.incmg_emp_no%>
<%= curlistRec.pch_irjnm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.reso_amt%>
<%= curlistRec.reso_amt_ch%>
<%= curlist1Rec.slip_arow_no%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.pch_sdysnm%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.rmks1%>
<%= curlist1Rec.rmks2%>
<%= curlist1Rec.drcr_clsf%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.boks_dlco_nm%>
<%= curlist1Rec.mang_clsf_cd%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.incm_clsf_cd%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.dtls_medi_cd%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.pch_hsnm%>
<%= curlist1Rec.use_dept_cd%>
<%= curlist1Rec.pch_buseonm%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.bank_cd%>
<%= curlist1Rec.pch_banknm%>
<%= curlist1Rec.unit%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.obj_acct_cd%>
<%= curlist1Rec.pch_dsacctnm%>
<%= curlist1Rec.obj_dt%>
<%= curlist1Rec.obj_amt%>
<%= curlist1Rec.frcr_clsf_cd%>
<%= curlist1Rec.frcr_amt%>
<%= curlist1Rec.exrate%>
<%= curlist1Rec.note_stat%>
<%= curlist1Rec.intg_dlco_cd%>
<%= curlist1Rec.prop_equip_cd%>
<%= curlist1Rec.tax_stmt_no%>
<%= curlist1Rec.make_dt%>
<%= curlist1Rec.erplace_cd%>
<%= curlist1Rec.ern%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.setoff_slip_no%>
<%= curlist1Rec.occr_slip_clsf%>
<%= curlist1Rec.occr_slip%>
<%= curlist1Rec.mang_clsf_nm%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.email_id%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.item%>
<%= curlist1Rec.re_issu_resn_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 16:18:25 KST 2015 */