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


public class FC_ACCT_2131_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2131_LDataSet(){}
	public FC_ACCT_2131_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2131_LCURLISTRecord rec = new FC_ACCT_2131_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
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
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.upd_tms = Util.checkString(rset0.getString("upd_tms"));
			rec.rcpt_nosh = Util.checkString(rset0.getString("rcpt_nosh"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.ask_emp_no = Util.checkString(rset0.getString("ask_emp_no"));
			rec.ask_emp_nm = Util.checkString(rset0.getString("ask_emp_nm"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.ask_dept_nm = Util.checkString(rset0.getString("ask_dept_nm"));
			rec.rcpm_plan_dt = Util.checkString(rset0.getString("rcpm_plan_dt"));
			rec.item2 = Util.checkString(rset0.getString("item2"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2131_LDataSet ds = (FC_ACCT_2131_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2131_LCURLISTRecord curlistRec = (FC_ACCT_2131_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
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
<%= curlistRec.presi_nm%>
<%= curlistRec.addr%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tax_stmt_aprv_yn%>
<%= curlistRec.upd_tms%>
<%= curlistRec.rcpt_nosh%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.ask_emp_no%>
<%= curlistRec.ask_emp_nm%>
<%= curlistRec.ask_dept_cd%>
<%= curlistRec.ask_dept_nm%>
<%= curlistRec.rcpm_plan_dt%>
<%= curlistRec.item2%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.remk%>
<%= curlistRec.slip_no%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 10:29:16 KST 2009 */