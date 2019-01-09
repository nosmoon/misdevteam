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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1002_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1002_SDataSet(){}
	public EN_INNEXP_1002_SDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			EN_INNEXP_1002_SCURLIST1Record rec = new EN_INNEXP_1002_SCURLIST1Record();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.reven_dt = Util.checkString(rset0.getString("reven_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.reven_amt = Util.checkString(rset0.getString("reven_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_shet_kind = Util.checkString(rset0.getString("rcpm_shet_kind"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.stmt_occr_dt = Util.checkString(rset0.getString("stmt_occr_dt"));
			rec.stmt_occr_seq = Util.checkString(rset0.getString("stmt_occr_seq"));
			rec.chrg_dept_cd = Util.checkString(rset0.getString("chrg_dept_cd"));
			rec.chrg_dept_nm = Util.checkString(rset0.getString("chrg_dept_nm"));
			rec.chrg_pers_emp_no = Util.checkString(rset0.getString("chrg_pers_emp_no"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.payo_clsf = Util.checkString(rset0.getString("payo_clsf"));
			rec.rcpm_occr_dt = Util.checkString(rset0.getString("rcpm_occr_dt"));
			rec.rcpm_occr_seq = Util.checkString(rset0.getString("rcpm_occr_seq"));
			rec.p_upd_occr_dt = Util.checkString(rset0.getString("p_upd_occr_dt"));
			rec.p_upd_occr_seq = Util.checkString(rset0.getString("p_upd_occr_seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			EN_INNEXP_1002_SCURLIST2Record rec = new EN_INNEXP_1002_SCURLIST2Record();
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.acct_mang_no = Util.checkString(rset1.getString("acct_mang_no"));
			rec.rmtt_dt = Util.checkString(rset1.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset1.getString("rmtt_plac"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.note_clsf_cd = Util.checkString(rset1.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset1.getString("bank_nm"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset1.getString("issu_cmpy_clsf_cd"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.rcpm_acct = Util.checkString(rset1.getString("rcpm_acct"));
			rec.sale_aprv_no = Util.checkString(rset1.getString("sale_aprv_no"));
			rec.bal_occr_slip_no = Util.checkString(rset1.getString("bal_occr_slip_no"));
			rec.extnc_obj_slip_clsf = Util.checkString(rset1.getString("extnc_obj_slip_clsf"));
			rec.extnc_dlco_no = Util.checkString(rset1.getString("extnc_dlco_no"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.acct_mang_nm = Util.checkString(rset1.getString("acct_mang_nm"));
			rec.biz_reg_no = Util.checkString(rset1.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset1.getString("bank_id"));
			rec.acct_num = Util.checkString(rset1.getString("acct_num"));
			rec.tran_date = Util.checkString(rset1.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset1.getString("tran_date_seq"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			EN_INNEXP_1002_SCURLIST3Record rec = new EN_INNEXP_1002_SCURLIST3Record();
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset2.getString("budg_nm"));
			rec.amt = Util.checkString(rset2.getString("amt"));
			rec.acct_mang_no = Util.checkString(rset2.getString("acct_mang_no"));
			rec.rmtt_dt = Util.checkString(rset2.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset2.getString("rmtt_plac"));
			rec.note_no = Util.checkString(rset2.getString("note_no"));
			rec.note_clsf_cd = Util.checkString(rset2.getString("note_clsf_cd"));
			rec.bank_cd = Util.checkString(rset2.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset2.getString("bank_nm"));
			rec.issu_pers_nm = Util.checkString(rset2.getString("issu_pers_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset2.getString("issu_cmpy_clsf_cd"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.rcpm_acct = Util.checkString(rset2.getString("rcpm_acct"));
			rec.sale_aprv_no = Util.checkString(rset2.getString("sale_aprv_no"));
			rec.bal_occr_slip_no = Util.checkString(rset2.getString("bal_occr_slip_no"));
			rec.extnc_obj_slip_clsf = Util.checkString(rset2.getString("extnc_obj_slip_clsf"));
			rec.extnc_dlco_no = Util.checkString(rset2.getString("extnc_dlco_no"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.acct_mang_nm = Util.checkString(rset2.getString("acct_mang_nm"));
			rec.biz_reg_no = Util.checkString(rset2.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset2.getString("bank_id"));
			rec.acct_num = Util.checkString(rset2.getString("acct_num"));
			rec.tran_date = Util.checkString(rset2.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset2.getString("tran_date_seq"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(13);
		while(rset3.next()){
			EN_INNEXP_1002_SCURLIST4Record rec = new EN_INNEXP_1002_SCURLIST4Record();
			rec.evnt_seq = Util.checkString(rset3.getString("evnt_seq"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(14);
		while(rset4.next()){
			EN_INNEXP_1002_SCURLIST5Record rec = new EN_INNEXP_1002_SCURLIST5Record();
			rec.reven_amt = Util.checkString(rset4.getString("reven_amt"));
			rec.expn_amt = Util.checkString(rset4.getString("expn_amt"));
			rec.bal_amt = Util.checkString(rset4.getString("bal_amt"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(15);
		while(rset5.next()){
			EN_INNEXP_1002_SCURLIST6Record rec = new EN_INNEXP_1002_SCURLIST6Record();
			rec.reven_stot = Util.checkString(rset5.getString("reven_stot"));
			rec.expn_stot = Util.checkString(rset5.getString("expn_stot"));
			rec.bal_stot = Util.checkString(rset5.getString("bal_stot"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(16);
		while(rset6.next()){
			EN_INNEXP_1002_SCURLIST7Record rec = new EN_INNEXP_1002_SCURLIST7Record();
			rec.biz_reg_no = Util.checkString(rset6.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset6.getString("bank_id"));
			rec.acct_num = Util.checkString(rset6.getString("acct_num"));
			rec.tran_date = Util.checkString(rset6.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset6.getString("tran_date_seq"));
			rec.slip_no = Util.checkString(rset6.getString("slip_no"));
			rec.extnc_amt = Util.checkString(rset6.getString("extnc_amt"));
			this.curlist7.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1002_SDataSet ds = (EN_INNEXP_1002_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		EN_INNEXP_1002_SCURLIST1Record curlist1Rec = (EN_INNEXP_1002_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		EN_INNEXP_1002_SCURLIST2Record curlist2Rec = (EN_INNEXP_1002_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		EN_INNEXP_1002_SCURLIST3Record curlist3Rec = (EN_INNEXP_1002_SCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		EN_INNEXP_1002_SCURLIST4Record curlist4Rec = (EN_INNEXP_1002_SCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		EN_INNEXP_1002_SCURLIST5Record curlist5Rec = (EN_INNEXP_1002_SCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		EN_INNEXP_1002_SCURLIST6Record curlist6Rec = (EN_INNEXP_1002_SCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		EN_INNEXP_1002_SCURLIST7Record curlist7Rec = (EN_INNEXP_1002_SCURLIST7Record)ds.curlist7.get(i);%>
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
<%= ds.getCurlist7()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.occr_seq%>
<%= curlist1Rec.reven_dt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.boks_dlco_nm%>
<%= curlist1Rec.titl%>
<%= curlist1Rec.reven_amt%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.rcpm_amt%>
<%= curlist1Rec.rcpm_shet_kind%>
<%= curlist1Rec.rcpm_shet_no%>
<%= curlist1Rec.prof_type_cd%>
<%= curlist1Rec.stmt_occr_dt%>
<%= curlist1Rec.stmt_occr_seq%>
<%= curlist1Rec.chrg_dept_cd%>
<%= curlist1Rec.chrg_dept_nm%>
<%= curlist1Rec.chrg_pers_emp_no%>
<%= curlist1Rec.chrg_pers_emp_nm%>
<%= curlist1Rec.evnt_yy%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.evnt_nm%>
<%= curlist1Rec.evnt_seq%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.payo_clsf%>
<%= curlist1Rec.rcpm_occr_dt%>
<%= curlist1Rec.rcpm_occr_seq%>
<%= curlist1Rec.p_upd_occr_dt%>
<%= curlist1Rec.p_upd_occr_seq%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.budg_nm%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.acct_mang_no%>
<%= curlist2Rec.rmtt_dt%>
<%= curlist2Rec.rmtt_plac%>
<%= curlist2Rec.note_no%>
<%= curlist2Rec.note_clsf_cd%>
<%= curlist2Rec.bank_cd%>
<%= curlist2Rec.bank_nm%>
<%= curlist2Rec.issu_pers_nm%>
<%= curlist2Rec.issu_cmpy_clsf_cd%>
<%= curlist2Rec.comp_dt%>
<%= curlist2Rec.mtry_dt%>
<%= curlist2Rec.rcpm_acct%>
<%= curlist2Rec.sale_aprv_no%>
<%= curlist2Rec.bal_occr_slip_no%>
<%= curlist2Rec.extnc_obj_slip_clsf%>
<%= curlist2Rec.extnc_dlco_no%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.acct_mang_nm%>
<%= curlist2Rec.biz_reg_no%>
<%= curlist2Rec.bank_id%>
<%= curlist2Rec.acct_num%>
<%= curlist2Rec.tran_date%>
<%= curlist2Rec.tran_date_seq%>
<%= curlist2Rec.slip_no%>
<%= curlist3Rec.budg_cd%>
<%= curlist3Rec.budg_nm%>
<%= curlist3Rec.amt%>
<%= curlist3Rec.acct_mang_no%>
<%= curlist3Rec.rmtt_dt%>
<%= curlist3Rec.rmtt_plac%>
<%= curlist3Rec.note_no%>
<%= curlist3Rec.note_clsf_cd%>
<%= curlist3Rec.bank_cd%>
<%= curlist3Rec.bank_nm%>
<%= curlist3Rec.issu_pers_nm%>
<%= curlist3Rec.issu_cmpy_clsf_cd%>
<%= curlist3Rec.comp_dt%>
<%= curlist3Rec.mtry_dt%>
<%= curlist3Rec.rcpm_acct%>
<%= curlist3Rec.sale_aprv_no%>
<%= curlist3Rec.bal_occr_slip_no%>
<%= curlist3Rec.extnc_obj_slip_clsf%>
<%= curlist3Rec.extnc_dlco_no%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.acct_mang_nm%>
<%= curlist3Rec.biz_reg_no%>
<%= curlist3Rec.bank_id%>
<%= curlist3Rec.acct_num%>
<%= curlist3Rec.tran_date%>
<%= curlist3Rec.tran_date_seq%>
<%= curlist3Rec.slip_no%>
<%= curlist4Rec.evnt_seq%>
<%= curlist5Rec.reven_amt%>
<%= curlist5Rec.expn_amt%>
<%= curlist5Rec.bal_amt%>
<%= curlist6Rec.reven_stot%>
<%= curlist6Rec.expn_stot%>
<%= curlist6Rec.bal_stot%>
<%= curlist7Rec.biz_reg_no%>
<%= curlist7Rec.bank_id%>
<%= curlist7Rec.acct_num%>
<%= curlist7Rec.tran_date%>
<%= curlist7Rec.tran_date_seq%>
<%= curlist7Rec.slip_no%>
<%= curlist7Rec.extnc_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 14:20:59 KST 2009 */