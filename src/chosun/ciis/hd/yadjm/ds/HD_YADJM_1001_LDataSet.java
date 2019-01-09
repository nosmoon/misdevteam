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


public class HD_YADJM_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1001_LDataSet(){}
	public HD_YADJM_1001_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_1001_LCURLISTRecord rec = new HD_YADJM_1001_LCURLISTRecord();
			rec.adjm_yy = Util.checkString(rset0.getString("adjm_yy"));
			rec.slf_dduc_amt = Util.checkString(rset0.getString("slf_dduc_amt"));
			rec.spos_dduc_amt = Util.checkString(rset0.getString("spos_dduc_amt"));
			rec.child_dduc_amt = Util.checkString(rset0.getString("child_dduc_amt"));
			rec.child_dduc_basi_yy = Util.checkString(rset0.getString("child_dduc_basi_yy"));
			rec.prnt_dduc_amt_1 = Util.checkString(rset0.getString("prnt_dduc_amt_1"));
			rec.prnt_dduc_basi_yy_1 = Util.checkString(rset0.getString("prnt_dduc_basi_yy_1"));
			rec.prnt_dduc_amt_2 = Util.checkString(rset0.getString("prnt_dduc_amt_2"));
			rec.prnt_dduc_basi_yy_2 = Util.checkString(rset0.getString("prnt_dduc_basi_yy_2"));
			rec.brth_istt_amt_1 = Util.checkString(rset0.getString("brth_istt_amt_1"));
			rec.brth_istt_basi_yy_1 = Util.checkString(rset0.getString("brth_istt_basi_yy_1"));
			rec.brth_istt_amt_2 = Util.checkString(rset0.getString("brth_istt_amt_2"));
			rec.brth_istt_basi_yy_2 = Util.checkString(rset0.getString("brth_istt_basi_yy_2"));
			rec.brth_istt_amt_3 = Util.checkString(rset0.getString("brth_istt_amt_3"));
			rec.brth_istt_basi_yy_3 = Util.checkString(rset0.getString("brth_istt_basi_yy_3"));
			rec.rspc_dduc_amt_1 = Util.checkString(rset0.getString("rspc_dduc_amt_1"));
			rec.rspc_dduc_basi_yy_1_fr = Util.checkString(rset0.getString("rspc_dduc_basi_yy_1_fr"));
			rec.rspc_dduc_basi_yy_1_to = Util.checkString(rset0.getString("rspc_dduc_basi_yy_1_to"));
			rec.rspc_dduc_amt_2 = Util.checkString(rset0.getString("rspc_dduc_amt_2"));
			rec.rspc_dduc_basi_yy_2 = Util.checkString(rset0.getString("rspc_dduc_basi_yy_2"));
			rec.obcl_pers_dduc_amt = Util.checkString(rset0.getString("obcl_pers_dduc_amt"));
			rec.fml_dduc_amt = Util.checkString(rset0.getString("fml_dduc_amt"));
			rec.child_care_fee_dduc_amt = Util.checkString(rset0.getString("child_care_fee_dduc_amt"));
			rec.mlt_chld_basi_dduc_amt = Util.checkString(rset0.getString("mlt_chld_basi_dduc_amt"));
			rec.mlt_chld_pers_dduc_amt = Util.checkString(rset0.getString("mlt_chld_pers_dduc_amt"));
			rec.mlt_chld_birth_dduc_amt = Util.checkString(rset0.getString("mlt_chld_birth_dduc_amt"));
			rec.one_paren_dduc_amt = Util.checkString(rset0.getString("one_paren_dduc_amt"));
			rec.gnr_insr_limt_amt = Util.checkString(rset0.getString("gnr_insr_limt_amt"));
			rec.obcl_pers_insr_limt_amt = Util.checkString(rset0.getString("obcl_pers_insr_limt_amt"));
			rec.hosp_fee_basi_ratio = Util.checkString(rset0.getString("hosp_fee_basi_ratio"));
			rec.hosp_fee_limt_amt = Util.checkString(rset0.getString("hosp_fee_limt_amt"));
			rec.baby_edu_fee = Util.checkString(rset0.getString("baby_edu_fee"));
			rec.elmihi_edu_fee = Util.checkString(rset0.getString("elmihi_edu_fee"));
			rec.univ_edu_fee = Util.checkString(rset0.getString("univ_edu_fee"));
			rec.hous_savg_aply_ratio = Util.checkString(rset0.getString("hous_savg_aply_ratio"));
			rec.hous_savg_aply_limt_amt = Util.checkString(rset0.getString("hous_savg_aply_limt_amt"));
			rec.hous_hire_aply_ratio = Util.checkString(rset0.getString("hous_hire_aply_ratio"));
			rec.hous_hire_aply_limt_amt = Util.checkString(rset0.getString("hous_hire_aply_limt_amt"));
			rec.ltrm_hous_loan_amt_limt_amt_1 = Util.checkString(rset0.getString("ltrm_hous_loan_amt_limt_amt_1"));
			rec.ltrm_hous_loan_amt_limt_amt_2 = Util.checkString(rset0.getString("ltrm_hous_loan_amt_limt_amt_2"));
			rec.ltrm_hous_loan_amt_limt_amt_3 = Util.checkString(rset0.getString("ltrm_hous_loan_amt_limt_amt_3"));
			rec.wedd_fnrl_movm_widr_amt = Util.checkString(rset0.getString("wedd_fnrl_movm_widr_amt"));
			rec.wedd_fnrl_movm_tot_saly_amt = Util.checkString(rset0.getString("wedd_fnrl_movm_tot_saly_amt"));
			rec.wedd_fnrl_movm_dduc_incm_amt = Util.checkString(rset0.getString("wedd_fnrl_movm_dduc_incm_amt"));
			rec.std_dduc_amt = Util.checkString(rset0.getString("std_dduc_amt"));
			rec.prsn_pens_savg_ratio = Util.checkString(rset0.getString("prsn_pens_savg_ratio"));
			rec.prsn_pens_savg_limt_amt = Util.checkString(rset0.getString("prsn_pens_savg_limt_amt"));
			rec.pens_savg_limt_amt = Util.checkString(rset0.getString("pens_savg_limt_amt"));
			rec.invsm_cmpd_invsm_ratio = Util.checkString(rset0.getString("invsm_cmpd_invsm_ratio"));
			rec.lvcmpy_pens_limt_amt = Util.checkString(rset0.getString("lvcmpy_pens_limt_amt"));
			rec.emp_stok_ownr_limt_amt = Util.checkString(rset0.getString("emp_stok_ownr_limt_amt"));
			rec.crdt_card_tot_saly_ratio = Util.checkString(rset0.getString("crdt_card_tot_saly_ratio"));
			rec.crdt_card_excs_amt_ratio = Util.checkString(rset0.getString("crdt_card_excs_amt_ratio"));
			rec.crdt_card_limt_amt = Util.checkString(rset0.getString("crdt_card_limt_amt"));
			rec.monthly_rent_amt_ratio = Util.checkString(rset0.getString("monthly_rent_amt_ratio"));
			rec.no_lar_sum_lease_limt_amt = Util.checkString(rset0.getString("no_lar_sum_lease_limt_amt"));
			rec.no_lar_sum_lease_limt_ratio = Util.checkString(rset0.getString("no_lar_sum_lease_limt_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1001_LDataSet ds = (HD_YADJM_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1001_LCURLISTRecord curlistRec = (HD_YADJM_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.adjm_yy%>
<%= curlistRec.slf_dduc_amt%>
<%= curlistRec.spos_dduc_amt%>
<%= curlistRec.child_dduc_amt%>
<%= curlistRec.child_dduc_basi_yy%>
<%= curlistRec.prnt_dduc_amt_1%>
<%= curlistRec.prnt_dduc_basi_yy_1%>
<%= curlistRec.prnt_dduc_amt_2%>
<%= curlistRec.prnt_dduc_basi_yy_2%>
<%= curlistRec.brth_istt_amt_1%>
<%= curlistRec.brth_istt_basi_yy_1%>
<%= curlistRec.brth_istt_amt_2%>
<%= curlistRec.brth_istt_basi_yy_2%>
<%= curlistRec.brth_istt_amt_3%>
<%= curlistRec.brth_istt_basi_yy_3%>
<%= curlistRec.rspc_dduc_amt_1%>
<%= curlistRec.rspc_dduc_basi_yy_1_fr%>
<%= curlistRec.rspc_dduc_basi_yy_1_to%>
<%= curlistRec.rspc_dduc_amt_2%>
<%= curlistRec.rspc_dduc_basi_yy_2%>
<%= curlistRec.obcl_pers_dduc_amt%>
<%= curlistRec.fml_dduc_amt%>
<%= curlistRec.child_care_fee_dduc_amt%>
<%= curlistRec.mlt_chld_basi_dduc_amt%>
<%= curlistRec.mlt_chld_pers_dduc_amt%>
<%= curlistRec.mlt_chld_birth_dduc_amt%>
<%= curlistRec.one_paren_dduc_amt%>
<%= curlistRec.gnr_insr_limt_amt%>
<%= curlistRec.obcl_pers_insr_limt_amt%>
<%= curlistRec.hosp_fee_basi_ratio%>
<%= curlistRec.hosp_fee_limt_amt%>
<%= curlistRec.baby_edu_fee%>
<%= curlistRec.elmihi_edu_fee%>
<%= curlistRec.univ_edu_fee%>
<%= curlistRec.hous_savg_aply_ratio%>
<%= curlistRec.hous_savg_aply_limt_amt%>
<%= curlistRec.hous_hire_aply_ratio%>
<%= curlistRec.hous_hire_aply_limt_amt%>
<%= curlistRec.ltrm_hous_loan_amt_limt_amt_1%>
<%= curlistRec.ltrm_hous_loan_amt_limt_amt_2%>
<%= curlistRec.ltrm_hous_loan_amt_limt_amt_3%>
<%= curlistRec.wedd_fnrl_movm_widr_amt%>
<%= curlistRec.wedd_fnrl_movm_tot_saly_amt%>
<%= curlistRec.wedd_fnrl_movm_dduc_incm_amt%>
<%= curlistRec.std_dduc_amt%>
<%= curlistRec.prsn_pens_savg_ratio%>
<%= curlistRec.prsn_pens_savg_limt_amt%>
<%= curlistRec.pens_savg_limt_amt%>
<%= curlistRec.invsm_cmpd_invsm_ratio%>
<%= curlistRec.lvcmpy_pens_limt_amt%>
<%= curlistRec.emp_stok_ownr_limt_amt%>
<%= curlistRec.crdt_card_tot_saly_ratio%>
<%= curlistRec.crdt_card_excs_amt_ratio%>
<%= curlistRec.crdt_card_limt_amt%>
<%= curlistRec.monthly_rent_amt_ratio%>
<%= curlistRec.no_lar_sum_lease_limt_amt%>
<%= curlistRec.no_lar_sum_lease_limt_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 23 13:50:22 KST 2013 */