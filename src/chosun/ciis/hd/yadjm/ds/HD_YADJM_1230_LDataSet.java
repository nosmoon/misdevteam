
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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1230_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1230_LDataSet(){}
	public HD_YADJM_1230_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_1230_LCURLISTRecord rec = new HD_YADJM_1230_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.adjm_clsf = Util.checkString(rset0.getString("adjm_clsf"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.wedd_tms = Util.checkString(rset0.getString("wedd_tms"));
			rec.movm_tms = Util.checkString(rset0.getString("movm_tms"));
			rec.fnrl_tms = Util.checkString(rset0.getString("fnrl_tms"));
			rec.prsn_pens_2000yy_aft = Util.checkString(rset0.getString("prsn_pens_2000yy_aft"));
			rec.pens_low_out_2001yy_aft = Util.checkString(rset0.getString("pens_low_out_2001yy_aft"));
			rec.crdt_non_pcc_use = Util.checkString(rset0.getString("crdt_non_pcc_use"));
			rec.cash_rcpt = Util.checkString(rset0.getString("cash_rcpt"));
			rec.edu_cost_giro_pymt_amt = Util.checkString(rset0.getString("edu_cost_giro_pymt_amt"));
			rec.invsm_cmpd_invsm_amt = Util.checkString(rset0.getString("invsm_cmpd_invsm_amt"));
			rec.emp_stok_ownr_out_pens = Util.checkString(rset0.getString("emp_stok_ownr_out_pens"));
			rec.lvcmpy_pens_incm_dduc = Util.checkString(rset0.getString("lvcmpy_pens_incm_dduc"));
			rec.plac_cmpy_plac_trad_authr_inc = Util.checkString(rset0.getString("plac_cmpy_plac_trad_authr_inc"));
			rec.ltrm_stok_type_savg_incm_dduc = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc"));
			rec.hous_loan_amt_int = Util.checkString(rset0.getString("hous_loan_amt_int"));
			rec.tax_paymt_cmpd_dduc = Util.checkString(rset0.getString("tax_paymt_cmpd_dduc"));
			rec.dona_polt_fund_10 = Util.checkString(rset0.getString("dona_polt_fund_10"));
			rec.forn_duty_plac = Util.checkString(rset0.getString("forn_duty_plac"));
			rec.forn_duty_dty = Util.checkString(rset0.getString("forn_duty_dty"));
			rec.forn_duty_prd_frdt = Util.checkString(rset0.getString("forn_duty_prd_frdt"));
			rec.forn_duty_prd_todt = Util.checkString(rset0.getString("forn_duty_prd_todt"));
			rec.forn_duty_tot_saly = Util.checkString(rset0.getString("forn_duty_tot_saly"));
			rec.tax_paymt_offi_nm = Util.checkString(rset0.getString("tax_paymt_offi_nm"));
			rec.tax_paymt_amt_frex = Util.checkString(rset0.getString("tax_paymt_amt_frex"));
			rec.tax_paymt_amt_won = Util.checkString(rset0.getString("tax_paymt_amt_won"));
			rec.forn_duty_clsf = Util.checkString(rset0.getString("forn_duty_clsf"));
			rec.txn_obj_addm_amt = Util.checkString(rset0.getString("txn_obj_addm_amt"));
			rec.ltrm_stok_type_savg_incm_dduc1 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc1"));
			rec.ltrm_stok_type_savg_incm_dduc2 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc2"));
			rec.ltrm_stok_type_savg_incm_dduc3 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc3"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.ltrm_hous_savg = Util.checkString(rset0.getString("ltrm_hous_savg"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1230_LDataSet ds = (HD_YADJM_1230_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1230_LCURLISTRecord curlistRec = (HD_YADJM_1230_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.adjm_clsf%>
<%= curlistRec.emp_no%>
<%= curlistRec.wedd_tms%>
<%= curlistRec.movm_tms%>
<%= curlistRec.fnrl_tms%>
<%= curlistRec.prsn_pens_2000yy_aft%>
<%= curlistRec.pens_low_out_2001yy_aft%>
<%= curlistRec.crdt_non_pcc_use%>
<%= curlistRec.cash_rcpt%>
<%= curlistRec.edu_cost_giro_pymt_amt%>
<%= curlistRec.invsm_cmpd_invsm_amt%>
<%= curlistRec.emp_stok_ownr_out_pens%>
<%= curlistRec.lvcmpy_pens_incm_dduc%>
<%= curlistRec.plac_cmpy_plac_trad_authr_inc%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc%>
<%= curlistRec.hous_loan_amt_int%>
<%= curlistRec.tax_paymt_cmpd_dduc%>
<%= curlistRec.dona_polt_fund_10%>
<%= curlistRec.forn_duty_plac%>
<%= curlistRec.forn_duty_dty%>
<%= curlistRec.forn_duty_prd_frdt%>
<%= curlistRec.forn_duty_prd_todt%>
<%= curlistRec.forn_duty_tot_saly%>
<%= curlistRec.tax_paymt_offi_nm%>
<%= curlistRec.tax_paymt_amt_frex%>
<%= curlistRec.tax_paymt_amt_won%>
<%= curlistRec.forn_duty_clsf%>
<%= curlistRec.txn_obj_addm_amt%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc1%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc2%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc3%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.ltrm_hous_savg%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 15:31:39 KST 2009 */