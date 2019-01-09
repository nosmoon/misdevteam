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


public class HD_YADJM_5200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_5200_LDataSet(){}
	public HD_YADJM_5200_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_5200_LCURLISTRecord rec = new HD_YADJM_5200_LCURLISTRecord();
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset0.getString("faml_seq"));
			rec.base_dduc_yn = Util.checkString(rset0.getString("base_dduc_yn"));
			rec.obcl_pers_dduc_yn = Util.checkString(rset0.getString("obcl_pers_dduc_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset0.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset0.getString("care_fee_dduc_yn"));
			rec.faml_rshp_cd = Util.checkString(rset0.getString("faml_rshp_cd"));
			rec.faml_flnm = Util.checkString(rset0.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset0.getString("faml_prn"));
			rec.adopt_dt = Util.checkString(rset0.getString("adopt_dt"));
			rec.dth_dt = Util.checkString(rset0.getString("dth_dt"));
			rec.edu_suppamt = Util.checkString(rset0.getString("edu_suppamt"));
			rec.edu_fee_clsf_cd = Util.checkString(rset0.getString("edu_fee_clsf_cd"));
			rec.edu_cost_onta = Util.checkString(rset0.getString("edu_cost_onta"));
			rec.edu_cost_etc = Util.checkString(rset0.getString("edu_cost_etc"));
			rec.edu_splen_pers_onta = Util.checkString(rset0.getString("edu_splen_pers_onta"));
			rec.edu_splen_pers_etc = Util.checkString(rset0.getString("edu_splen_pers_etc"));
			rec.heal_suppamt = Util.checkString(rset0.getString("heal_suppamt"));
			rec.hosp_cost_onta = Util.checkString(rset0.getString("hosp_cost_onta"));
			rec.hosp_cost_etc = Util.checkString(rset0.getString("hosp_cost_etc"));
			rec.asrc_prpn_insr_fee_onta = Util.checkString(rset0.getString("asrc_prpn_insr_fee_onta"));
			rec.asrc_prpn_insr_fee_etc = Util.checkString(rset0.getString("asrc_prpn_insr_fee_etc"));
			rec.obcl_pers_insr_onta = Util.checkString(rset0.getString("obcl_pers_insr_onta"));
			rec.obcl_pers_insr_etc = Util.checkString(rset0.getString("obcl_pers_insr_etc"));
			rec.relg_appm_dona_amt_etc = Util.checkString(rset0.getString("relg_appm_dona_amt_etc"));
			rec.appm_dona_amt_etc = Util.checkString(rset0.getString("appm_dona_amt_etc"));
			rec.lgl_dona_amt_etc = Util.checkString(rset0.getString("lgl_dona_amt_etc"));
			rec.dduc_polt_fund = Util.checkString(rset0.getString("dduc_polt_fund"));
			rec.spc_case_dona_amt_etc = Util.checkString(rset0.getString("spc_case_dona_amt_etc"));
			rec.crdt_card_tot_amt_onta = Util.checkString(rset0.getString("crdt_card_tot_amt_onta"));
			rec.crdt_card_tot_amt_etc = Util.checkString(rset0.getString("crdt_card_tot_amt_etc"));
			rec.edu_cost_giro_pymt_onta = Util.checkString(rset0.getString("edu_cost_giro_pymt_onta"));
			rec.edu_cost_giro_pymt_etc = Util.checkString(rset0.getString("edu_cost_giro_pymt_etc"));
			rec.cash_rcpt_onta = Util.checkString(rset0.getString("cash_rcpt_onta"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_5200_LDataSet ds = (HD_YADJM_5200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_5200_LCURLISTRecord curlistRec = (HD_YADJM_5200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.emp_no%>
<%= curlistRec.faml_seq%>
<%= curlistRec.base_dduc_yn%>
<%= curlistRec.obcl_pers_dduc_yn%>
<%= curlistRec.fml_hshd_dduc_yn%>
<%= curlistRec.care_fee_dduc_yn%>
<%= curlistRec.faml_rshp_cd%>
<%= curlistRec.faml_flnm%>
<%= curlistRec.faml_prn%>
<%= curlistRec.adopt_dt%>
<%= curlistRec.dth_dt%>
<%= curlistRec.edu_suppamt%>
<%= curlistRec.edu_fee_clsf_cd%>
<%= curlistRec.edu_cost_onta%>
<%= curlistRec.edu_cost_etc%>
<%= curlistRec.edu_splen_pers_onta%>
<%= curlistRec.edu_splen_pers_etc%>
<%= curlistRec.heal_suppamt%>
<%= curlistRec.hosp_cost_onta%>
<%= curlistRec.hosp_cost_etc%>
<%= curlistRec.asrc_prpn_insr_fee_onta%>
<%= curlistRec.asrc_prpn_insr_fee_etc%>
<%= curlistRec.obcl_pers_insr_onta%>
<%= curlistRec.obcl_pers_insr_etc%>
<%= curlistRec.relg_appm_dona_amt_etc%>
<%= curlistRec.appm_dona_amt_etc%>
<%= curlistRec.lgl_dona_amt_etc%>
<%= curlistRec.dduc_polt_fund%>
<%= curlistRec.spc_case_dona_amt_etc%>
<%= curlistRec.crdt_card_tot_amt_onta%>
<%= curlistRec.crdt_card_tot_amt_etc%>
<%= curlistRec.edu_cost_giro_pymt_onta%>
<%= curlistRec.edu_cost_giro_pymt_etc%>
<%= curlistRec.cash_rcpt_onta%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 25 11:19:21 KST 2010 */