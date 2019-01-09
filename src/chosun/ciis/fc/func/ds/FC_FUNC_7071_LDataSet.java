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


public class FC_FUNC_7071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7071_LDataSet(){}
	public FC_FUNC_7071_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_7071_LCURLISTRecord rec = new FC_FUNC_7071_LCURLISTRecord();
			rec.checked = Util.checkString(rset0.getString("checked"));
			rec.fund_mang_no = Util.checkString(rset0.getString("fund_mang_no"));
			rec.loan_no = Util.checkString(rset0.getString("loan_no"));
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
			rec.loan_repay_clsf_cd = Util.checkString(rset0.getString("loan_repay_clsf_cd"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.int_clsf_nm = Util.checkString(rset0.getString("int_clsf_nm"));
			rec.loan_repay_clsf_nm = Util.checkString(rset0.getString("loan_repay_clsf_nm"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.prelae_pay_clsfnm = Util.checkString(rset0.getString("prelae_pay_clsfnm"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.rest_amt = Util.checkString(rset0.getString("rest_amt"));
			rec.repay_dt = Util.checkString(rset0.getString("repay_dt"));
			rec.repay_amt = Util.checkString(rset0.getString("repay_amt"));
			rec.repay_rmks = Util.checkString(rset0.getString("repay_rmks"));
			rec.repay_slip_occr_dt = Util.checkString(rset0.getString("repay_slip_occr_dt"));
			rec.repay_slip_clsf_cd = Util.checkString(rset0.getString("repay_slip_clsf_cd"));
			rec.repay_slip_seq = Util.checkString(rset0.getString("repay_slip_seq"));
			rec.nomach_adpay_bal = Util.checkString(rset0.getString("nomach_adpay_bal"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7071_LDataSet ds = (FC_FUNC_7071_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_7071_LCURLISTRecord curlistRec = (FC_FUNC_7071_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.checked%>
<%= curlistRec.fund_mang_no%>
<%= curlistRec.loan_no%>
<%= curlistRec.loan_nm%>
<%= curlistRec.loan_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.int_clsf_cd%>
<%= curlistRec.loan_rmks%>
<%= curlistRec.loan_slip_occr_dt%>
<%= curlistRec.loan_slip_clsf_cd%>
<%= curlistRec.loan_slip_seq%>
<%= curlistRec.loan_repay_clsf_cd%>
<%= curlistRec.dlco_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.int_clsf_nm%>
<%= curlistRec.loan_repay_clsf_nm%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.prelae_pay_clsfnm%>
<%= curlistRec.cost_gain_stot%>
<%= curlistRec.rcpay_amt_stot%>
<%= curlistRec.rest_amt%>
<%= curlistRec.repay_dt%>
<%= curlistRec.repay_amt%>
<%= curlistRec.repay_rmks%>
<%= curlistRec.repay_slip_occr_dt%>
<%= curlistRec.repay_slip_clsf_cd%>
<%= curlistRec.repay_slip_seq%>
<%= curlistRec.nomach_adpay_bal%>
<%= curlistRec.cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 19:04:26 KST 2009 */