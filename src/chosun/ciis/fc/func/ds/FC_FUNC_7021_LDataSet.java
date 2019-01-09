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


public class FC_FUNC_7021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7021_LDataSet(){}
	public FC_FUNC_7021_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_7021_LCURLIST1Record rec = new FC_FUNC_7021_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.loan_nm = Util.checkString(rset0.getString("loan_nm"));
			rec.loan_amt = Util.checkString(rset0.getString("loan_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.int_clsf_cd = Util.checkString(rset0.getString("int_clsf_cd"));
			rec.loan_rmks = Util.checkString(rset0.getString("loan_rmks"));
			rec.loan_slip_no = Util.checkString(rset0.getString("loan_slip_no"));
			rec.loan_repay_clsf_cd = Util.checkString(rset0.getString("loan_repay_clsf_cd"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.loan_slip_occr_dt = Util.checkString(rset0.getString("loan_slip_occr_dt"));
			rec.loan_slip_clsf_cd = Util.checkString(rset0.getString("loan_slip_clsf_cd"));
			rec.loan_slip_seq = Util.checkString(rset0.getString("loan_slip_seq"));
			rec.loan_repay_clsf_nm = Util.checkString(rset0.getString("loan_repay_clsf_nm"));
			rec.prelae_pay_clsf_nm = Util.checkString(rset0.getString("prelae_pay_clsf_nm"));
			rec.janaeg = Util.checkString(rset0.getString("janaeg"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_FUNC_7021_LCURLIST2Record rec = new FC_FUNC_7021_LCURLIST2Record();
			rec.repay_dt = Util.checkString(rset1.getString("repay_dt"));
			rec.repay_amt = Util.checkString(rset1.getString("repay_amt"));
			rec.repay_rmks = Util.checkString(rset1.getString("repay_rmks"));
			rec.repay_slip_no = Util.checkString(rset1.getString("repay_slip_no"));
			rec.nomach_adpay_bal = Util.checkString(rset1.getString("nomach_adpay_bal"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7021_LDataSet ds = (FC_FUNC_7021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_7021_LCURLIST1Record curlist1Rec = (FC_FUNC_7021_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_7021_LCURLIST2Record curlist2Rec = (FC_FUNC_7021_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.loan_nm%>
<%= curlist1Rec.loan_amt%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_clsf_nm%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.compnm%>
<%= curlist1Rec.int_clsf_cd%>
<%= curlist1Rec.loan_rmks%>
<%= curlist1Rec.loan_slip_no%>
<%= curlist1Rec.loan_repay_clsf_cd%>
<%= curlist1Rec.prelae_pay_clsf_cd%>
<%= curlist1Rec.cost_gain_stot%>
<%= curlist1Rec.rcpay_amt_stot%>
<%= curlist1Rec.loan_slip_occr_dt%>
<%= curlist1Rec.loan_slip_clsf_cd%>
<%= curlist1Rec.loan_slip_seq%>
<%= curlist1Rec.loan_repay_clsf_nm%>
<%= curlist1Rec.prelae_pay_clsf_nm%>
<%= curlist1Rec.janaeg%>
<%= curlist2Rec.repay_dt%>
<%= curlist2Rec.repay_amt%>
<%= curlist2Rec.repay_rmks%>
<%= curlist2Rec.repay_slip_no%>
<%= curlist2Rec.nomach_adpay_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 15:59:36 KST 2009 */