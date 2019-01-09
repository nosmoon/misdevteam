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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1810_LDataSet(){}
	public SP_SAL_1810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SP_SAL_1810_LCURLISTRecord rec = new SP_SAL_1810_LCURLISTRecord();
			rec.rdr_extn_yymm = Util.checkString(rset0.getString("rdr_extn_yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.staf_no = Util.checkString(rset0.getString("staf_no"));
			rec.staf_nm = Util.checkString(rset0.getString("staf_nm"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.acty_area = Util.checkString(rset0.getString("acty_area"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.a_hous_rdr_extn_qty = Util.checkString(rset0.getString("a_hous_rdr_extn_qty"));
			rec.a_apt_rdr_extn_qty = Util.checkString(rset0.getString("a_apt_rdr_extn_qty"));
			rec.a_shop_rdr_extn_qty = Util.checkString(rset0.getString("a_shop_rdr_extn_qty"));
			rec.a_hous_ufth_qty = Util.checkString(rset0.getString("a_hous_ufth_qty"));
			rec.a_apt_ufth_qty = Util.checkString(rset0.getString("a_apt_ufth_qty"));
			rec.a_shop_ufth_qty = Util.checkString(rset0.getString("a_shop_ufth_qty"));
			rec.a_hous_fix_qty = Util.checkString(rset0.getString("a_hous_fix_qty"));
			rec.a_apt_fix_qty = Util.checkString(rset0.getString("a_apt_fix_qty"));
			rec.a_shop_fix_qty = Util.checkString(rset0.getString("a_shop_fix_qty"));
			rec.b_hous_rdr_extn_qty = Util.checkString(rset0.getString("b_hous_rdr_extn_qty"));
			rec.b_apt_rdr_extn_qty = Util.checkString(rset0.getString("b_apt_rdr_extn_qty"));
			rec.b_shop_rdr_extn_qty = Util.checkString(rset0.getString("b_shop_rdr_extn_qty"));
			rec.b_hous_ufth_qty = Util.checkString(rset0.getString("b_hous_ufth_qty"));
			rec.b_apt_ufth_qty = Util.checkString(rset0.getString("b_apt_ufth_qty"));
			rec.b_shop_ufth_qty = Util.checkString(rset0.getString("b_shop_ufth_qty"));
			rec.b_hous_fix_qty = Util.checkString(rset0.getString("b_hous_fix_qty"));
			rec.b_apt_fix_qty = Util.checkString(rset0.getString("b_apt_fix_qty"));
			rec.b_shop_fix_qty = Util.checkString(rset0.getString("b_shop_fix_qty"));
			rec.a_tot = Util.checkString(rset0.getString("a_tot"));
			rec.rdr_extn_alon = Util.checkString(rset0.getString("rdr_extn_alon"));
			rec.leader_alon = Util.checkString(rset0.getString("leader_alon"));
			rec.jungbuhonam_spc_acty_cost = Util.checkString(rset0.getString("jungbuhonam_spc_acty_cost"));
			rec.mvin_team_spc_acty_cost = Util.checkString(rset0.getString("mvin_team_spc_acty_cost"));
			rec.no_val_shrt_fee = Util.checkString(rset0.getString("no_val_shrt_fee"));
			rec.rdr_extn_sctn_clsi_fee = Util.checkString(rset0.getString("rdr_extn_sctn_clsi_fee"));
			rec.etc_alon_1 = Util.checkString(rset0.getString("etc_alon_1"));
			rec.etc_alon_2 = Util.checkString(rset0.getString("etc_alon_2"));
			rec.etc_alon_3 = Util.checkString(rset0.getString("etc_alon_3"));
			rec.pre_pay_dduc = Util.checkString(rset0.getString("pre_pay_dduc"));
			rec.tax_amt_dduc = Util.checkString(rset0.getString("tax_amt_dduc"));
			rec.res_tax_dduc = Util.checkString(rset0.getString("res_tax_dduc"));
			rec.etc_dduc_1 = Util.checkString(rset0.getString("etc_dduc_1"));
			rec.etc_dduc_2 = Util.checkString(rset0.getString("etc_dduc_2"));
			rec.etc_dduc_3 = Util.checkString(rset0.getString("etc_dduc_3"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.real_pay_amt = Util.checkString(rset0.getString("real_pay_amt"));
			rec.wclam_subm_yn = Util.checkString(rset0.getString("wclam_subm_yn"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.pay_plan_dt = Util.checkString(rset0.getString("pay_plan_dt"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1810_LDataSet ds = (SP_SAL_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_1810_LCURLISTRecord curlistRec = (SP_SAL_1810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rdr_extn_yymm%>
<%= curlistRec.seq%>
<%= curlistRec.staf_no%>
<%= curlistRec.staf_nm%>
<%= curlistRec.ptph_no%>
<%= curlistRec.acty_area%>
<%= curlistRec.prn%>
<%= curlistRec.a_hous_rdr_extn_qty%>
<%= curlistRec.a_apt_rdr_extn_qty%>
<%= curlistRec.a_shop_rdr_extn_qty%>
<%= curlistRec.a_hous_ufth_qty%>
<%= curlistRec.a_apt_ufth_qty%>
<%= curlistRec.a_shop_ufth_qty%>
<%= curlistRec.a_hous_fix_qty%>
<%= curlistRec.a_apt_fix_qty%>
<%= curlistRec.a_shop_fix_qty%>
<%= curlistRec.b_hous_rdr_extn_qty%>
<%= curlistRec.b_apt_rdr_extn_qty%>
<%= curlistRec.b_shop_rdr_extn_qty%>
<%= curlistRec.b_hous_ufth_qty%>
<%= curlistRec.b_apt_ufth_qty%>
<%= curlistRec.b_shop_ufth_qty%>
<%= curlistRec.b_hous_fix_qty%>
<%= curlistRec.b_apt_fix_qty%>
<%= curlistRec.b_shop_fix_qty%>
<%= curlistRec.a_tot%>
<%= curlistRec.rdr_extn_alon%>
<%= curlistRec.leader_alon%>
<%= curlistRec.jungbuhonam_spc_acty_cost%>
<%= curlistRec.mvin_team_spc_acty_cost%>
<%= curlistRec.no_val_shrt_fee%>
<%= curlistRec.rdr_extn_sctn_clsi_fee%>
<%= curlistRec.etc_alon_1%>
<%= curlistRec.etc_alon_2%>
<%= curlistRec.etc_alon_3%>
<%= curlistRec.pre_pay_dduc%>
<%= curlistRec.tax_amt_dduc%>
<%= curlistRec.res_tax_dduc%>
<%= curlistRec.etc_dduc_1%>
<%= curlistRec.etc_dduc_2%>
<%= curlistRec.etc_dduc_3%>
<%= curlistRec.stot_amt%>
<%= curlistRec.real_pay_amt%>
<%= curlistRec.wclam_subm_yn%>
<%= curlistRec.clos_yn%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.pay_plan_dt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 30 17:07:31 KST 2012 */