/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대 입출금 관리 - 상세조회
* 작성일자 : 2010-06-07
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 임대입출금 관리 - 상세조회
 */


public class AS_LEAS_1303_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1303_SDataSet(){}
	public AS_LEAS_1303_SDataSet(String errcode, String errmsg){
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
			AS_LEAS_1303_SCURLIST1Record rec = new AS_LEAS_1303_SCURLIST1Record();
			rec.flag = Util.checkString(rset0.getString("flag"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_ern = Util.checkString(rset0.getString("dlco_ern"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.inout_clsf = Util.checkString(rset0.getString("inout_clsf"));
			rec.inout_acct_clsf = Util.checkString(rset0.getString("inout_acct_clsf"));
			rec.gurt_payo_clsf = Util.checkString(rset0.getString("gurt_payo_clsf"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.clam_yymm = Util.checkString(rset0.getString("clam_yymm"));
			rec.clam_seq = Util.checkString(rset0.getString("clam_seq"));
			rec.leas_clam_amt = Util.checkString(rset0.getString("leas_clam_amt"));
			rec.mang_clam_amt = Util.checkString(rset0.getString("mang_clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset0.getString("vat_clam_amt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.leas_rcpm_amt = Util.checkString(rset0.getString("leas_rcpm_amt"));
			rec.mang_rcpm_amt = Util.checkString(rset0.getString("mang_rcpm_amt"));
			rec.vat_rcpm_amt = Util.checkString(rset0.getString("vat_rcpm_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.gurt_amt = Util.checkString(rset0.getString("gurt_amt"));
			rec.precpt_amt = Util.checkString(rset0.getString("precpt_amt"));
			rec.gurt_rcpm_amt = Util.checkString(rset0.getString("gurt_rcpm_amt"));
			rec.precpt_rcpm_amt = Util.checkString(rset0.getString("precpt_rcpm_amt"));
			rec.trufnd_rcpm_amt = Util.checkString(rset0.getString("trufnd_rcpm_amt"));
			rec.trufnd_dlco_ern = Util.checkString(rset0.getString("trufnd_dlco_ern"));
			rec.trufnd_dlco_nm = Util.checkString(rset0.getString("trufnd_dlco_nm"));
			rec.trufnd_slip_clsf_cd = Util.checkString(rset0.getString("trufnd_slip_clsf_cd"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_LEAS_1303_SCURLIST2Record rec = new AS_LEAS_1303_SCURLIST2Record();
			rec.cash_sub_seq = Util.checkString(rset1.getString("cash_sub_seq"));
			rec.cash_rcpm_amt = Util.checkString(rset1.getString("cash_rcpm_amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AS_LEAS_1303_SCURLIST3Record rec = new AS_LEAS_1303_SCURLIST3Record();
			rec.deps_rmtt_dt = Util.checkString(rset2.getString("deps_rmtt_dt"));
			rec.deps_rcpm_amt = Util.checkString(rset2.getString("deps_rcpm_amt"));
			rec.deps_rmtt_plac = Util.checkString(rset2.getString("deps_rmtt_plac"));
			rec.deps_acct_mang_no = Util.checkString(rset2.getString("deps_acct_mang_no"));
			rec.deps_acct_mang_nm = Util.checkString(rset2.getString("deps_acct_mang_nm"));
			rec.deps_coms_amt = Util.checkString(rset2.getString("deps_coms_amt"));
			rec.deps_sub_seq = Util.checkString(rset2.getString("deps_sub_seq"));
			rec.deps_biz_reg_no = Util.checkString(rset2.getString("deps_biz_reg_no"));
			rec.deps_bank_id = Util.checkString(rset2.getString("deps_bank_id"));
			rec.deps_acct_num = Util.checkString(rset2.getString("deps_acct_num"));
			rec.deps_tran_date = Util.checkString(rset2.getString("deps_tran_date"));
			rec.deps_tran_date_seq = Util.checkString(rset2.getString("deps_tran_date_seq"));
			rec.deps_current_clsf_ref = Util.checkString(rset2.getString("deps_current_clsf_ref"));
			rec.deps_acct_tonghwa_ref = Util.checkString(rset2.getString("deps_acct_tonghwa_ref"));
			rec.deps_frex_amt = Util.checkString(rset2.getString("deps_frex_amt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AS_LEAS_1303_SCURLIST4Record rec = new AS_LEAS_1303_SCURLIST4Record();
			rec.note_note_no = Util.checkString(rset3.getString("note_note_no"));
			rec.note_rcpm_amt = Util.checkString(rset3.getString("note_rcpm_amt"));
			rec.note_note_clsf_cd = Util.checkString(rset3.getString("note_note_clsf_cd"));
			rec.note_bank_cd = Util.checkString(rset3.getString("note_bank_cd"));
			rec.note_bank_nm = Util.checkString(rset3.getString("note_bank_nm"));
			rec.note_issu_pers_nm = Util.checkString(rset3.getString("note_issu_pers_nm"));
			rec.note_issu_cmpy_clsf = Util.checkString(rset3.getString("note_issu_cmpy_clsf"));
			rec.note_comp_dt = Util.checkString(rset3.getString("note_comp_dt"));
			rec.note_mtry_dt = Util.checkString(rset3.getString("note_mtry_dt"));
			rec.note_rcpm_acct = Util.checkString(rset3.getString("note_rcpm_acct"));
			rec.note_sale_aprv_no = Util.checkString(rset3.getString("note_sale_aprv_no"));
			rec.note_sub_seq = Util.checkString(rset3.getString("note_sub_seq"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			AS_LEAS_1303_SCURLIST5Record rec = new AS_LEAS_1303_SCURLIST5Record();
			rec.etc_budg_cd = Util.checkString(rset4.getString("etc_budg_cd"));
			rec.etc_budg_nm = Util.checkString(rset4.getString("etc_budg_nm"));
			rec.etc_rcpm_amt = Util.checkString(rset4.getString("etc_rcpm_amt"));
			rec.etc_bal_occr_slip_clsf = Util.checkString(rset4.getString("etc_bal_occr_slip_clsf"));
			rec.etc_bal_occr_slip_no = Util.checkString(rset4.getString("etc_bal_occr_slip_no"));
			rec.etc_sub_seq = Util.checkString(rset4.getString("etc_sub_seq"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			AS_LEAS_1303_SCURLIST6Record rec = new AS_LEAS_1303_SCURLIST6Record();
			rec.cntr_no = Util.checkString(rset5.getString("cntr_no"));
			rec.clam_yymm = Util.checkString(rset5.getString("clam_yymm"));
			rec.clam_seq = Util.checkString(rset5.getString("clam_seq"));
			rec.leas_clam_amt = Util.checkString(rset5.getString("leas_clam_amt"));
			rec.mang_clam_amt = Util.checkString(rset5.getString("mang_clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset5.getString("vat_clam_amt"));
			rec.clam_tot_amt = Util.checkString(rset5.getString("clam_tot_amt"));
			rec.leas_rcpm_amt = Util.checkString(rset5.getString("leas_rcpm_amt"));
			rec.mang_rcpm_amt = Util.checkString(rset5.getString("mang_rcpm_amt"));
			rec.vat_rcpm_amt = Util.checkString(rset5.getString("vat_rcpm_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset5.getString("rcpm_tot_amt"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1303_SDataSet ds = (AS_LEAS_1303_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAS_1303_SCURLIST1Record curlist1Rec = (AS_LEAS_1303_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_LEAS_1303_SCURLIST2Record curlist2Rec = (AS_LEAS_1303_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AS_LEAS_1303_SCURLIST3Record curlist3Rec = (AS_LEAS_1303_SCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AS_LEAS_1303_SCURLIST4Record curlist4Rec = (AS_LEAS_1303_SCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AS_LEAS_1303_SCURLIST5Record curlist5Rec = (AS_LEAS_1303_SCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AS_LEAS_1303_SCURLIST6Record curlist6Rec = (AS_LEAS_1303_SCURLIST6Record)ds.curlist6.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.flag%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.occr_seq%>
<%= curlist1Rec.rcpm_dt%>
<%= curlist1Rec.rcpm_shet_no%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_ern%>
<%= curlist1Rec.hire_dlco_nm%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.inout_clsf%>
<%= curlist1Rec.inout_acct_clsf%>
<%= curlist1Rec.gurt_payo_clsf%>
<%= curlist1Rec.bldg_cd%>
<%= curlist1Rec.bldg_nm%>
<%= curlist1Rec.cntr_yy%>
<%= curlist1Rec.cntr_seq%>
<%= curlist1Rec.cntr_no%>
<%= curlist1Rec.clam_yymm%>
<%= curlist1Rec.clam_seq%>
<%= curlist1Rec.leas_clam_amt%>
<%= curlist1Rec.mang_clam_amt%>
<%= curlist1Rec.vat_clam_amt%>
<%= curlist1Rec.clam_tot_amt%>
<%= curlist1Rec.leas_rcpm_amt%>
<%= curlist1Rec.mang_rcpm_amt%>
<%= curlist1Rec.vat_rcpm_amt%>
<%= curlist1Rec.rcpm_tot_amt%>
<%= curlist1Rec.gurt_amt%>
<%= curlist1Rec.precpt_amt%>
<%= curlist1Rec.gurt_rcpm_amt%>
<%= curlist1Rec.precpt_rcpm_amt%>
<%= curlist1Rec.trufnd_rcpm_amt%>
<%= curlist1Rec.trufnd_dlco_ern%>
<%= curlist1Rec.trufnd_dlco_nm%>
<%= curlist1Rec.trufnd_slip_clsf_cd%>
<%= curlist1Rec.slip_no%>
<%= curlist2Rec.cash_sub_seq%>
<%= curlist2Rec.cash_rcpm_amt%>
<%= curlist3Rec.deps_rmtt_dt%>
<%= curlist3Rec.deps_rcpm_amt%>
<%= curlist3Rec.deps_rmtt_plac%>
<%= curlist3Rec.deps_acct_mang_no%>
<%= curlist3Rec.deps_acct_mang_nm%>
<%= curlist3Rec.deps_coms_amt%>
<%= curlist3Rec.deps_sub_seq%>
<%= curlist3Rec.deps_biz_reg_no%>
<%= curlist3Rec.deps_bank_id%>
<%= curlist3Rec.deps_acct_num%>
<%= curlist3Rec.deps_tran_date%>
<%= curlist3Rec.deps_tran_date_seq%>
<%= curlist3Rec.deps_current_clsf_ref%>
<%= curlist3Rec.deps_acct_tonghwa_ref%>
<%= curlist3Rec.deps_frex_amt%>
<%= curlist4Rec.note_note_no%>
<%= curlist4Rec.note_rcpm_amt%>
<%= curlist4Rec.note_note_clsf_cd%>
<%= curlist4Rec.note_bank_cd%>
<%= curlist4Rec.note_bank_nm%>
<%= curlist4Rec.note_issu_pers_nm%>
<%= curlist4Rec.note_issu_cmpy_clsf%>
<%= curlist4Rec.note_comp_dt%>
<%= curlist4Rec.note_mtry_dt%>
<%= curlist4Rec.note_rcpm_acct%>
<%= curlist4Rec.note_sale_aprv_no%>
<%= curlist4Rec.note_sub_seq%>
<%= curlist5Rec.etc_budg_cd%>
<%= curlist5Rec.etc_budg_nm%>
<%= curlist5Rec.etc_rcpm_amt%>
<%= curlist5Rec.etc_bal_occr_slip_clsf%>
<%= curlist5Rec.etc_bal_occr_slip_no%>
<%= curlist5Rec.etc_sub_seq%>
<%= curlist6Rec.cntr_no%>
<%= curlist6Rec.clam_yymm%>
<%= curlist6Rec.clam_seq%>
<%= curlist6Rec.leas_clam_amt%>
<%= curlist6Rec.mang_clam_amt%>
<%= curlist6Rec.vat_clam_amt%>
<%= curlist6Rec.clam_tot_amt%>
<%= curlist6Rec.leas_rcpm_amt%>
<%= curlist6Rec.mang_rcpm_amt%>
<%= curlist6Rec.vat_rcpm_amt%>
<%= curlist6Rec.rcpm_tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 14 19:56:40 KST 2010 */