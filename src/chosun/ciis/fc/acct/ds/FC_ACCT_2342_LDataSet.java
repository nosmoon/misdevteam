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


public class FC_ACCT_2342_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2342_LDataSet(){}
	public FC_ACCT_2342_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2342_LCURLISTRecord rec = new FC_ACCT_2342_LCURLISTRecord();
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.cgbuseonm = Util.checkString(rset0.getString("cgbuseonm"));
			rec.slip_aprv_yn = Util.checkString(rset0.getString("slip_aprv_yn"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.hjpddsabeonnm = Util.checkString(rset0.getString("hjpddsabeonnm"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.hjpysnm = Util.checkString(rset0.getString("hjpysnm"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.setoff_slip_occr_dt = Util.checkString(rset0.getString("setoff_slip_occr_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset0.getString("setoff_slip_clsf_cd"));
			rec.setoff_slip_seq = Util.checkString(rset0.getString("setoff_slip_seq"));
			rec.setoff_slip_sub_seq = Util.checkString(rset0.getString("setoff_slip_sub_seq"));
			rec.setoff_slip_arow_no = Util.checkString(rset0.getString("setoff_slip_arow_no"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			rec.obj_dt = Util.checkString(rset0.getString("obj_dt"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.usebuseonm = Util.checkString(rset0.getString("usebuseonm"));
			rec.incmg_emp_no = Util.checkString(rset0.getString("incmg_emp_no"));
			rec.hjpinsabeonnm = Util.checkString(rset0.getString("hjpinsabeonnm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.etc_in = Util.checkString(rset0.getString("etc_in"));
			rec.prop_equip_cd = Util.checkString(rset0.getString("prop_equip_cd"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.prt_no = Util.checkString(rset0.getString("prt_no"));
			rec.adpay_adjm_flag = Util.checkString(rset0.getString("adpay_adjm_flag"));
			rec.note_stat = Util.checkString(rset0.getString("note_stat"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_clsf_cd2 = Util.checkString(rset0.getString("dlco_clsf_cd2"));
			rec.dlco_cd2 = Util.checkString(rset0.getString("dlco_cd2"));
			rec.dlco_nm2 = Util.checkString(rset0.getString("dlco_nm2"));
			rec.usebuseonm2 = Util.checkString(rset0.getString("usebuseonm2"));
			rec.dlco_cd3 = Util.checkString(rset0.getString("dlco_cd3"));
			rec.dlco_nm3 = Util.checkString(rset0.getString("dlco_nm3"));
			rec.setoff_slip_no = Util.checkString(rset0.getString("setoff_slip_no"));
			rec.vat_amt2 = Util.checkString(rset0.getString("vat_amt2"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.draft_doc_dept_cd = Util.checkString(rset0.getString("draft_doc_dept_cd"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2342_LDataSet ds = (FC_ACCT_2342_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2342_LCURLISTRecord curlistRec = (FC_ACCT_2342_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.cgbuseonm%>
<%= curlistRec.slip_aprv_yn%>
<%= curlistRec.chrg_emp_no%>
<%= curlistRec.hjpddsabeonnm%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.hjpysnm%>
<%= curlistRec.drcr_clsf%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.tax_stmt_no%>
<%= curlistRec.setoff_slip_occr_dt%>
<%= curlistRec.setoff_slip_clsf_cd%>
<%= curlistRec.setoff_slip_seq%>
<%= curlistRec.setoff_slip_sub_seq%>
<%= curlistRec.setoff_slip_arow_no%>
<%= curlistRec.obj_acct_cd%>
<%= curlistRec.obj_dt%>
<%= curlistRec.obj_amt%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.usebuseonm%>
<%= curlistRec.incmg_emp_no%>
<%= curlistRec.hjpinsabeonnm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.etc_in%>
<%= curlistRec.prop_equip_cd%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.prt_no%>
<%= curlistRec.adpay_adjm_flag%>
<%= curlistRec.note_stat%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.erplace_cd%>
<%= curlistRec.make_dt%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_clsf_cd2%>
<%= curlistRec.dlco_cd2%>
<%= curlistRec.dlco_nm2%>
<%= curlistRec.usebuseonm2%>
<%= curlistRec.dlco_cd3%>
<%= curlistRec.dlco_nm3%>
<%= curlistRec.setoff_slip_no%>
<%= curlistRec.vat_amt2%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.draft_doc_dept_cd%>
<%= curlistRec.draft_expn_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 14:34:43 KST 2009 */