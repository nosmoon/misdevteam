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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_7031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7031_LDataSet(){}
	public FC_FUNC_7031_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_7031_LCURLIST1Record rec = new FC_FUNC_7031_LCURLIST1Record();
			rec.loan_nm = Util.checkString(rset0.getString("loan_nm"));
			rec.loan_amt = Util.checkString(rset0.getString("loan_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.int_clsf_cd = Util.checkString(rset0.getString("int_clsf_cd"));
			rec.loan_rmks = Util.checkString(rset0.getString("loan_rmks"));
			rec.loan_slip_occr_dt = Util.checkString(rset0.getString("loan_slip_occr_dt"));
			rec.loan_slip_clsf_cd = Util.checkString(rset0.getString("loan_slip_clsf_cd"));
			rec.loan_slip_seq = Util.checkString(rset0.getString("loan_slip_seq"));
			rec.loan_slip_no = Util.checkString(rset0.getString("loan_slip_no"));
			rec.loan_repay_clsf_cd = Util.checkString(rset0.getString("loan_repay_clsf_cd"));
			rec.compgbnm = Util.checkString(rset0.getString("compgbnm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.intgbnm = Util.checkString(rset0.getString("intgbnm"));
			rec.cishgbnm = Util.checkString(rset0.getString("cishgbnm"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_FUNC_7031_LCURLIST2Record rec = new FC_FUNC_7031_LCURLIST2Record();
			rec.prelae_pay_clsf_cd = Util.checkString(rset1.getString("prelae_pay_clsf_cd"));
			rec.shggbnm = Util.checkString(rset1.getString("shggbnm"));
			rec.cost_gain_stot = Util.checkString(rset1.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset1.getString("rcpay_amt_stot"));
			rec.janaeg = Util.checkString(rset1.getString("janaeg"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_FUNC_7031_LCURLIST3Record rec = new FC_FUNC_7031_LCURLIST3Record();
			rec.pay_dt = Util.checkString(rset2.getString("pay_dt"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.int_amt = Util.checkString(rset2.getString("int_amt"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			rec.patr_budg_cd = Util.checkString(rset2.getString("patr_budg_cd"));
			rec.deps_clsf_cd = Util.checkString(rset2.getString("deps_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7031_LDataSet ds = (FC_FUNC_7031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_7031_LCURLIST1Record curlist1Rec = (FC_FUNC_7031_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_7031_LCURLIST2Record curlist2Rec = (FC_FUNC_7031_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_FUNC_7031_LCURLIST3Record curlist3Rec = (FC_FUNC_7031_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.loan_nm%>
<%= curlist1Rec.loan_amt%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.int_clsf_cd%>
<%= curlist1Rec.loan_rmks%>
<%= curlist1Rec.loan_slip_occr_dt%>
<%= curlist1Rec.loan_slip_clsf_cd%>
<%= curlist1Rec.loan_slip_seq%>
<%= curlist1Rec.loan_slip_no%>
<%= curlist1Rec.loan_repay_clsf_cd%>
<%= curlist1Rec.compgbnm%>
<%= curlist1Rec.compnm%>
<%= curlist1Rec.intgbnm%>
<%= curlist1Rec.cishgbnm%>
<%= curlist1Rec.int_rate%>
<%= curlist2Rec.prelae_pay_clsf_cd%>
<%= curlist2Rec.shggbnm%>
<%= curlist2Rec.cost_gain_stot%>
<%= curlist2Rec.rcpay_amt_stot%>
<%= curlist2Rec.janaeg%>
<%= curlist3Rec.pay_dt%>
<%= curlist3Rec.comp_dt%>
<%= curlist3Rec.mtry_dt%>
<%= curlist3Rec.int_amt%>
<%= curlist3Rec.slip_no%>
<%= curlist3Rec.rmks%>
<%= curlist3Rec.patr_budg_cd%>
<%= curlist3Rec.deps_clsf_cd%>
<%= curlist3Rec.slip_occr_dt%>
<%= curlist3Rec.slip_clsf_cd%>
<%= curlist3Rec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 14:11:00 KST 2009 */