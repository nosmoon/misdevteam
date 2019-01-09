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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1011_LDataSet(){}
	public HD_INFO_1011_LDataSet(String errcode, String errmsg){
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
			HD_INFO_1011_LCURLISTRecord rec = new HD_INFO_1011_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.duty_area_cd = Util.checkString(rset0.getString("duty_area_cd"));
			rec.duty_area_nm = Util.checkString(rset0.getString("duty_area_nm"));
			rec.dtplc_cd = Util.checkString(rset0.getString("dtplc_cd"));
			rec.dtplc_nm = Util.checkString(rset0.getString("dtplc_nm"));
			rec.in_cmpy_psgp_cd = Util.checkString(rset0.getString("in_cmpy_psgp_cd"));
			rec.in_cmpy_psgp_nm = Util.checkString(rset0.getString("in_cmpy_psgp_nm"));
			rec.in_cmpy_octgr_cd = Util.checkString(rset0.getString("in_cmpy_octgr_cd"));
			rec.in_cmpy_octgr_nm = Util.checkString(rset0.getString("in_cmpy_octgr_nm"));
			rec.in_cmpy_posk_cd = Util.checkString(rset0.getString("in_cmpy_posk_cd"));
			rec.in_cmpy_posk_nm = Util.checkString(rset0.getString("in_cmpy_posk_nm"));
			rec.cur_jobforc_cd = Util.checkString(rset0.getString("cur_jobforc_cd"));
			rec.cur_jobforc_nm = Util.checkString(rset0.getString("cur_jobforc_nm"));
			rec.cur_jobkind_cd = Util.checkString(rset0.getString("cur_jobkind_cd"));
			rec.cur_jobkind_nm = Util.checkString(rset0.getString("cur_jobkind_nm"));
			rec.cur_jobnon_cd = Util.checkString(rset0.getString("cur_jobnon_cd"));
			rec.cur_jobnon_nm = Util.checkString(rset0.getString("cur_jobnon_nm"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.lvcmpy_resn_cd = Util.checkString(rset0.getString("lvcmpy_resn_cd"));
			rec.lvcmpy_resn_nm = Util.checkString(rset0.getString("lvcmpy_resn_nm"));
			rec.last_midl_adjm_dt = Util.checkString(rset0.getString("last_midl_adjm_dt"));
			rec.midl_adjm_tms = Util.checkString(rset0.getString("midl_adjm_tms"));
			rec.last_upgrd_dt = Util.checkString(rset0.getString("last_upgrd_dt"));
			rec.last_saly_chg_appmt_dt = Util.checkString(rset0.getString("last_saly_chg_appmt_dt"));
			rec.last_appmt_dt = Util.checkString(rset0.getString("last_appmt_dt"));
			rec.last_appmt_cd = Util.checkString(rset0.getString("last_appmt_cd"));
			rec.last_appmt_nm = Util.checkString(rset0.getString("last_appmt_nm"));
			rec.last_appmt_cont = Util.checkString(rset0.getString("last_appmt_cont"));
			rec.last_temp_dt = Util.checkString(rset0.getString("last_temp_dt"));
			rec.last_reinst_dt = Util.checkString(rset0.getString("last_reinst_dt"));
			rec.last_temp_clsf = Util.checkString(rset0.getString("last_temp_clsf"));
			rec.last_temp_clsf_nm = Util.checkString(rset0.getString("last_temp_clsf_nm"));
			rec.last_stdy_dt = Util.checkString(rset0.getString("last_stdy_dt"));
			rec.last_stdy_reinst_dt = Util.checkString(rset0.getString("last_stdy_reinst_dt"));
			rec.in_cmpy_clsf = Util.checkString(rset0.getString("in_cmpy_clsf"));
			rec.in_cmpy_clsf_nm = Util.checkString(rset0.getString("in_cmpy_clsf_nm"));
			rec.open_invit_clsf = Util.checkString(rset0.getString("open_invit_clsf"));
			rec.open_invit_clsf_nm = Util.checkString(rset0.getString("open_invit_clsf_nm"));
			rec.open_invit_desty = Util.checkString(rset0.getString("open_invit_desty"));
			rec.relg_cd = Util.checkString(rset0.getString("relg_cd"));
			rec.relg_nm = Util.checkString(rset0.getString("relg_nm"));
			rec.in_cmpy_resn_cd = Util.checkString(rset0.getString("in_cmpy_resn_cd"));
			rec.in_cmpy_resn_nm = Util.checkString(rset0.getString("in_cmpy_resn_nm"));
			rec.recom_pers_rshp_cd = Util.checkString(rset0.getString("recom_pers_rshp_cd"));
			rec.recom_pers_rshp_nm = Util.checkString(rset0.getString("recom_pers_rshp_nm"));
			rec.recom_pers_flnm = Util.checkString(rset0.getString("recom_pers_flnm"));
			rec.blod_cd = Util.checkString(rset0.getString("blod_cd"));
			rec.blod_nm = Util.checkString(rset0.getString("blod_nm"));
			rec.nativ_cd = Util.checkString(rset0.getString("nativ_cd"));
			rec.nativ_dtls_area = Util.checkString(rset0.getString("nativ_dtls_area"));
			rec.hby_1 = Util.checkString(rset0.getString("hby_1"));
			rec.hby_2 = Util.checkString(rset0.getString("hby_2"));
			rec.spc_1 = Util.checkString(rset0.getString("spc_1"));
			rec.spc_2 = Util.checkString(rset0.getString("spc_2"));
			rec.saly_shft_bank_cd = Util.checkString(rset0.getString("saly_shft_bank_cd"));
			rec.saly_shft_bank_nm = Util.checkString(rset0.getString("saly_shft_bank_nm"));
			rec.saly_shft_acct_no = Util.checkString(rset0.getString("saly_shft_acct_no"));
			rec.alon_shft_bank_cd = Util.checkString(rset0.getString("alon_shft_bank_cd"));
			rec.alon_shft_bank_nm = Util.checkString(rset0.getString("alon_shft_bank_nm"));
			rec.alon_shft_acct_no = Util.checkString(rset0.getString("alon_shft_acct_no"));
			rec.encrg_amt_shft_bank_cd = Util.checkString(rset0.getString("encrg_amt_shft_bank_cd"));
			rec.encrg_amt_shft_bank_nm = Util.checkString(rset0.getString("encrg_amt_shft_bank_nm"));
			rec.encrg_amt_shft_acct_no = Util.checkString(rset0.getString("encrg_amt_shft_acct_no"));
			rec.etc_shft_bank_cd = Util.checkString(rset0.getString("etc_shft_bank_cd"));
			rec.etc_shft_bank_nm = Util.checkString(rset0.getString("etc_shft_bank_nm"));
			rec.etc_shft_acct_no = Util.checkString(rset0.getString("etc_shft_acct_no"));
			rec.etc_shft_chqe_pay_yn = Util.checkString(rset0.getString("etc_shft_chqe_pay_yn"));
			rec.aprv_in_cmpy = Util.checkString(rset0.getString("aprv_in_cmpy"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1011_LDataSet ds = (HD_INFO_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1011_LCURLISTRecord curlistRec = (HD_INFO_1011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.duty_area_cd%>
<%= curlistRec.duty_area_nm%>
<%= curlistRec.dtplc_cd%>
<%= curlistRec.dtplc_nm%>
<%= curlistRec.in_cmpy_psgp_cd%>
<%= curlistRec.in_cmpy_psgp_nm%>
<%= curlistRec.in_cmpy_octgr_cd%>
<%= curlistRec.in_cmpy_octgr_nm%>
<%= curlistRec.in_cmpy_posk_cd%>
<%= curlistRec.in_cmpy_posk_nm%>
<%= curlistRec.cur_jobforc_cd%>
<%= curlistRec.cur_jobforc_nm%>
<%= curlistRec.cur_jobkind_cd%>
<%= curlistRec.cur_jobkind_nm%>
<%= curlistRec.cur_jobnon_cd%>
<%= curlistRec.cur_jobnon_nm%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.lvcmpy_resn_cd%>
<%= curlistRec.lvcmpy_resn_nm%>
<%= curlistRec.last_midl_adjm_dt%>
<%= curlistRec.midl_adjm_tms%>
<%= curlistRec.last_upgrd_dt%>
<%= curlistRec.last_saly_chg_appmt_dt%>
<%= curlistRec.last_appmt_dt%>
<%= curlistRec.last_appmt_cd%>
<%= curlistRec.last_appmt_nm%>
<%= curlistRec.last_appmt_cont%>
<%= curlistRec.last_temp_dt%>
<%= curlistRec.last_reinst_dt%>
<%= curlistRec.last_temp_clsf%>
<%= curlistRec.last_temp_clsf_nm%>
<%= curlistRec.last_stdy_dt%>
<%= curlistRec.last_stdy_reinst_dt%>
<%= curlistRec.in_cmpy_clsf%>
<%= curlistRec.in_cmpy_clsf_nm%>
<%= curlistRec.open_invit_clsf%>
<%= curlistRec.open_invit_clsf_nm%>
<%= curlistRec.open_invit_desty%>
<%= curlistRec.relg_cd%>
<%= curlistRec.relg_nm%>
<%= curlistRec.in_cmpy_resn_cd%>
<%= curlistRec.in_cmpy_resn_nm%>
<%= curlistRec.recom_pers_rshp_cd%>
<%= curlistRec.recom_pers_rshp_nm%>
<%= curlistRec.recom_pers_flnm%>
<%= curlistRec.blod_cd%>
<%= curlistRec.blod_nm%>
<%= curlistRec.nativ_cd%>
<%= curlistRec.nativ_dtls_area%>
<%= curlistRec.hby_1%>
<%= curlistRec.hby_2%>
<%= curlistRec.spc_1%>
<%= curlistRec.spc_2%>
<%= curlistRec.saly_shft_bank_cd%>
<%= curlistRec.saly_shft_bank_nm%>
<%= curlistRec.saly_shft_acct_no%>
<%= curlistRec.alon_shft_bank_cd%>
<%= curlistRec.alon_shft_bank_nm%>
<%= curlistRec.alon_shft_acct_no%>
<%= curlistRec.encrg_amt_shft_bank_cd%>
<%= curlistRec.encrg_amt_shft_bank_nm%>
<%= curlistRec.encrg_amt_shft_acct_no%>
<%= curlistRec.etc_shft_bank_cd%>
<%= curlistRec.etc_shft_bank_nm%>
<%= curlistRec.etc_shft_acct_no%>
<%= curlistRec.etc_shft_chqe_pay_yn%>
<%= curlistRec.aprv_in_cmpy%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 18 15:04:47 KST 2017 */