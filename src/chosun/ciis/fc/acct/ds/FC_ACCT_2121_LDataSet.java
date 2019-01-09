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


public class FC_ACCT_2121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2121_LDataSet(){}
	public FC_ACCT_2121_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2121_LCURLISTRecord rec = new FC_ACCT_2121_LCURLISTRecord();
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.occr_slip_occr_dt = Util.checkString(rset0.getString("occr_slip_occr_dt"));
			rec.occr_slip_clsf_cd = Util.checkString(rset0.getString("occr_slip_clsf_cd"));
			rec.occr_slip_seq = Util.checkString(rset0.getString("occr_slip_seq"));
			rec.occr_slip_sub_seq = Util.checkString(rset0.getString("occr_slip_sub_seq"));
			rec.occr_slip_arow_no = Util.checkString(rset0.getString("occr_slip_arow_no"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.deal_clsf = Util.checkString(rset0.getString("deal_clsf"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.presi_item = Util.checkString(rset0.getString("presi_item"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.upd_tms = Util.checkString(rset0.getString("upd_tms"));
			rec.rcpt_nosh = Util.checkString(rset0.getString("rcpt_nosh"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cd_nm = Util.checkString(rset0.getString("budg_cd_nm"));
			rec.ask_emp_no = Util.checkString(rset0.getString("ask_emp_no"));
			rec.ask_emp_nm = Util.checkString(rset0.getString("ask_emp_nm"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.ask_dept_nm = Util.checkString(rset0.getString("ask_dept_nm"));
			rec.rcpm_plan_dt = Util.checkString(rset0.getString("rcpm_plan_dt"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cd_nm = Util.checkString(rset0.getString("dtls_medi_cd_nm"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.draft_impt_amt = Util.checkString(rset0.getString("draft_impt_amt"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.vexc_cmpy_cd_ern = Util.checkString(rset0.getString("vexc_cmpy_cd_ern"));
			rec.vexc_cmpy_cd_nm = Util.checkString(rset0.getString("vexc_cmpy_cd_nm"));
			rec.reg_clsf = Util.checkString(rset0.getString("reg_clsf"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.elec_tax_comp_cd = Util.checkString(rset0.getString("elec_tax_comp_cd"));
			rec.chnl_clsf_cd = Util.checkString(rset0.getString("chnl_clsf_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			FC_ACCT_2121_LCURLIST1Record rec = new FC_ACCT_2121_LCURLIST1Record();
			rec.rcpm_slip_no = Util.checkString(rset1.getString("rcpm_slip_no"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			FC_ACCT_2121_LCURLIST2Record rec = new FC_ACCT_2121_LCURLIST2Record();
			rec.rcpm_slip_no2 = Util.checkString(rset2.getString("rcpm_slip_no2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2121_LDataSet ds = (FC_ACCT_2121_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2121_LCURLISTRecord curlistRec = (FC_ACCT_2121_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2121_LCURLIST1Record curlist1Rec = (FC_ACCT_2121_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2121_LCURLIST2Record curlist2Rec = (FC_ACCT_2121_LCURLIST2Record)ds.curlist2.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.prof_type_cd%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.occr_slip_occr_dt%>
<%= curlistRec.occr_slip_clsf_cd%>
<%= curlistRec.occr_slip_seq%>
<%= curlistRec.occr_slip_sub_seq%>
<%= curlistRec.occr_slip_arow_no%>
<%= curlistRec.make_dt%>
<%= curlistRec.erplace_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.deal_clsf%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.addr%>
<%= curlistRec.bizcond%>
<%= curlistRec.presi_item%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tax_stmt_aprv_yn%>
<%= curlistRec.upd_tms%>
<%= curlistRec.rcpt_nosh%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cd_nm%>
<%= curlistRec.ask_emp_no%>
<%= curlistRec.ask_emp_nm%>
<%= curlistRec.ask_dept_cd%>
<%= curlistRec.ask_dept_nm%>
<%= curlistRec.rcpm_plan_dt%>
<%= curlistRec.item%>
<%= curlistRec.medi_cd%>
<%= curlistRec.remk%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_cd_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_cd_nm%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.draft_impt_amt%>
<%= curlistRec.draft_expn_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.vexc_cmpy_cd%>
<%= curlistRec.vexc_cmpy_cd_ern%>
<%= curlistRec.vexc_cmpy_cd_nm%>
<%= curlistRec.reg_clsf%>
<%= curlistRec.unit%>
<%= curlistRec.qunt%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.email%>
<%= curlistRec.semuro_no%>
<%= curlistRec.elec_tax_comp_cd%>
<%= curlistRec.chnl_clsf_cd%>
<%= curlist1Rec.rcpm_slip_no%>
<%= curlist2Rec.rcpm_slip_no2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 19 14:30:10 KST 2014 */