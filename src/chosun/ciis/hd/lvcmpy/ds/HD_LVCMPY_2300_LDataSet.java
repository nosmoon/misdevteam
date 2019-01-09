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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2300_LDataSet(){}
	public HD_LVCMPY_2300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_LVCMPY_2300_LCURLIST1Record rec = new HD_LVCMPY_2300_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.last_midl_adjm_dt = Util.checkString(rset0.getString("last_midl_adjm_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_LVCMPY_2300_LCURLIST2Record rec = new HD_LVCMPY_2300_LCURLIST2Record();
			rec.tot_pay_saly = Util.checkString(rset1.getString("tot_pay_saly"));
			rec.non_tax_stot = Util.checkString(rset1.getString("non_tax_stot"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_LVCMPY_2300_LCURLIST3Record rec = new HD_LVCMPY_2300_LCURLIST3Record();
			rec.adjm_rvrs_yy = Util.checkString(rset2.getString("adjm_rvrs_yy"));
			rec.labr_incm_amt = Util.checkString(rset2.getString("labr_incm_amt"));
			rec.base_dduc_slf = Util.checkString(rset2.getString("base_dduc_slf"));
			rec.base_dduc_spos = Util.checkString(rset2.getString("base_dduc_spos"));
			rec.boks_qunt_faml_nops = Util.checkString(rset2.getString("boks_qunt_faml_nops"));
			rec.rspc_nops = Util.checkString(rset2.getString("rspc_nops"));
			rec.addm_dduc_obcl_pers = Util.checkString(rset2.getString("addm_dduc_obcl_pers"));
			rec.addm_dduc_fml_hshd = Util.checkString(rset2.getString("addm_dduc_fml_hshd"));
			rec.addm_dduc_care_fee = Util.checkString(rset2.getString("addm_dduc_care_fee"));
			rec.mj1birth_ibyang = Util.checkString(rset2.getString("mj1birth_ibyang"));
			rec.multi_child_addm_dduc = Util.checkString(rset2.getString("multi_child_addm_dduc"));
			rec.np_insr_fee_dduc = Util.checkString(rset2.getString("np_insr_fee_dduc"));
			rec.temp1 = Util.checkString(rset2.getString("temp1"));
			rec.temp2 = Util.checkString(rset2.getString("temp2"));
			rec.spc_dduc_insr_fee = Util.checkString(rset2.getString("spc_dduc_insr_fee"));
			rec.spc_dduc_hosp_fee = Util.checkString(rset2.getString("spc_dduc_hosp_fee"));
			rec.spc_dduc_hous_fund = Util.checkString(rset2.getString("spc_dduc_hous_fund"));
			rec.hous_mogg_loan_amt_int = Util.checkString(rset2.getString("hous_mogg_loan_amt_int"));
			rec.spc_dduc_dona_amt = Util.checkString(rset2.getString("spc_dduc_dona_amt"));
			rec.spc_dduc_wedd_etc = Util.checkString(rset2.getString("spc_dduc_wedd_etc"));
			rec.spc_dduc_stot = Util.checkString(rset2.getString("spc_dduc_stot"));
			rec.std_dduc_amt = Util.checkString(rset2.getString("std_dduc_amt"));
			rec.dedu_labr_incm_amt = Util.checkString(rset2.getString("dedu_labr_incm_amt"));
			rec.prsn_pens_pymt_amt = Util.checkString(rset2.getString("prsn_pens_pymt_amt"));
			rec.pens_savg_pymt_amt = Util.checkString(rset2.getString("pens_savg_pymt_amt"));
			rec.plac_cmpy_plac_trad_authr_inc = Util.checkString(rset2.getString("plac_cmpy_plac_trad_authr_inc"));
			rec.hous_fund_pymt_amt = Util.checkString(rset2.getString("hous_fund_pymt_amt"));
			rec.invsm_cmpd_invsm_amt = Util.checkString(rset2.getString("invsm_cmpd_invsm_amt"));
			rec.emp_stok_ownr_cmpd_dona_amt_30 = Util.checkString(rset2.getString("emp_stok_ownr_cmpd_dona_amt_30"));
			rec.crdt_non_pcc_use = Util.checkString(rset2.getString("crdt_non_pcc_use"));
			rec.ltrm_stok_type_savg_incm_dduc = Util.checkString(rset2.getString("ltrm_stok_type_savg_incm_dduc"));
			rec.tax_amt_dduc_labr_incm = Util.checkString(rset2.getString("tax_amt_dduc_labr_incm"));
			rec.tax_amt_dduc_polt_fund = Util.checkString(rset2.getString("tax_amt_dduc_polt_fund"));
			rec.temp3 = Util.checkString(rset2.getString("temp3"));
			rec.tax_amt_dduc_hous_loan_amt_int = Util.checkString(rset2.getString("tax_amt_dduc_hous_loan_amt_int"));
			rec.tax_amt_dduc_forn_pymt = Util.checkString(rset2.getString("tax_amt_dduc_forn_pymt"));
			rec.tax_amt_dduc_stot = Util.checkString(rset2.getString("tax_amt_dduc_stot"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			HD_LVCMPY_2300_LCURLIST4Record rec = new HD_LVCMPY_2300_LCURLIST4Record();
			rec.non_tax_frnc = Util.checkString(rset3.getString("non_tax_frnc"));
			rec.non_tax_jrnst = Util.checkString(rset3.getString("non_tax_jrnst"));
			rec.saly_no = Util.checkString(rset3.getString("saly_no"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			HD_LVCMPY_2300_LCURLIST5Record rec = new HD_LVCMPY_2300_LCURLIST5Record();
			rec.etc_saly_amt = Util.checkString(rset4.getString("etc_saly_amt"));
			rec.year_end = Util.checkString(rset4.getString("year_end"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2300_LDataSet ds = (HD_LVCMPY_2300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_LVCMPY_2300_LCURLIST1Record curlist1Rec = (HD_LVCMPY_2300_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_2300_LCURLIST2Record curlist2Rec = (HD_LVCMPY_2300_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_LVCMPY_2300_LCURLIST3Record curlist3Rec = (HD_LVCMPY_2300_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_LVCMPY_2300_LCURLIST4Record curlist4Rec = (HD_LVCMPY_2300_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_LVCMPY_2300_LCURLIST5Record curlist5Rec = (HD_LVCMPY_2300_LCURLIST5Record)ds.curlist5.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.in_cmpy_dt%>
<%= curlist1Rec.last_midl_adjm_dt%>
<%= curlist1Rec.lvcmpy_dt%>
<%= curlist2Rec.tot_pay_saly%>
<%= curlist2Rec.non_tax_stot%>
<%= curlist3Rec.adjm_rvrs_yy%>
<%= curlist3Rec.labr_incm_amt%>
<%= curlist3Rec.base_dduc_slf%>
<%= curlist3Rec.base_dduc_spos%>
<%= curlist3Rec.boks_qunt_faml_nops%>
<%= curlist3Rec.rspc_nops%>
<%= curlist3Rec.addm_dduc_obcl_pers%>
<%= curlist3Rec.addm_dduc_fml_hshd%>
<%= curlist3Rec.addm_dduc_care_fee%>
<%= curlist3Rec.mj1birth_ibyang%>
<%= curlist3Rec.multi_child_addm_dduc%>
<%= curlist3Rec.np_insr_fee_dduc%>
<%= curlist3Rec.temp1%>
<%= curlist3Rec.temp2%>
<%= curlist3Rec.spc_dduc_insr_fee%>
<%= curlist3Rec.spc_dduc_hosp_fee%>
<%= curlist3Rec.spc_dduc_hous_fund%>
<%= curlist3Rec.hous_mogg_loan_amt_int%>
<%= curlist3Rec.spc_dduc_dona_amt%>
<%= curlist3Rec.spc_dduc_wedd_etc%>
<%= curlist3Rec.spc_dduc_stot%>
<%= curlist3Rec.std_dduc_amt%>
<%= curlist3Rec.dedu_labr_incm_amt%>
<%= curlist3Rec.prsn_pens_pymt_amt%>
<%= curlist3Rec.pens_savg_pymt_amt%>
<%= curlist3Rec.plac_cmpy_plac_trad_authr_inc%>
<%= curlist3Rec.hous_fund_pymt_amt%>
<%= curlist3Rec.invsm_cmpd_invsm_amt%>
<%= curlist3Rec.emp_stok_ownr_cmpd_dona_amt_30%>
<%= curlist3Rec.crdt_non_pcc_use%>
<%= curlist3Rec.ltrm_stok_type_savg_incm_dduc%>
<%= curlist3Rec.tax_amt_dduc_labr_incm%>
<%= curlist3Rec.tax_amt_dduc_polt_fund%>
<%= curlist3Rec.temp3%>
<%= curlist3Rec.tax_amt_dduc_hous_loan_amt_int%>
<%= curlist3Rec.tax_amt_dduc_forn_pymt%>
<%= curlist3Rec.tax_amt_dduc_stot%>
<%= curlist4Rec.non_tax_frnc%>
<%= curlist4Rec.non_tax_jrnst%>
<%= curlist4Rec.saly_no%>
<%= curlist5Rec.etc_saly_amt%>
<%= curlist5Rec.year_end%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 18 09:50:50 KST 2009 */