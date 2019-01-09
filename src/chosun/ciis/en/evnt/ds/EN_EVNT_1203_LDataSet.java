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


package chosun.ciis.en.evnt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.rec.*;

/**
 * 
 */


public class EN_EVNT_1203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_EVNT_1203_LDataSet(){}
	public EN_EVNT_1203_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			EN_EVNT_1203_LCURLIST1Record rec = new EN_EVNT_1203_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.evnt_type = Util.checkString(rset0.getString("evnt_type"));
			rec.regu_non_regu_clsf = Util.checkString(rset0.getString("regu_non_regu_clsf"));
			rec.spons_clsf = Util.checkString(rset0.getString("spons_clsf"));
			rec.entr_cost = rset0.getInt("entr_cost");
			rec.charg_entr_nops = rset0.getInt("charg_entr_nops");
			rec.free_entr_nops = rset0.getInt("free_entr_nops");
			rec.grp_entr_nops = rset0.getInt("grp_entr_nops");
			rec.grp_entr_team_cnt = rset0.getInt("grp_entr_team_cnt");
			rec.evnt_dds = rset0.getInt("evnt_dds");
			rec.evnt_frdt = Util.checkString(rset0.getString("evnt_frdt"));
			rec.evnt_todt = Util.checkString(rset0.getString("evnt_todt"));
			rec.plac_1 = Util.checkString(rset0.getString("plac_1"));
			rec.plac_2 = Util.checkString(rset0.getString("plac_2"));
			rec.plac_3 = Util.checkString(rset0.getString("plac_3"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.chrg_pers_emp_no = Util.checkString(rset0.getString("chrg_pers_emp_no"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.reven_budg_amt = rset0.getInt("reven_budg_amt");
			rec.expn_budg_amt = rset0.getInt("expn_budg_amt");
			rec.enpr_reven_stlm_amt = rset0.getInt("enpr_reven_stlm_amt");
			rec.enpr_expn_stlm_amt = rset0.getInt("enpr_expn_stlm_amt");
			rec.acct_reven_stlm_amt = rset0.getInt("acct_reven_stlm_amt");
			rec.acct_expn_stlm_amt = rset0.getInt("acct_expn_stlm_amt");
			rec.stlm_dt = Util.checkString(rset0.getString("stlm_dt"));
			rec.stlm_proc_dt = Util.checkString(rset0.getString("stlm_proc_dt"));
			rec.stlm_proc_pers_emp_no = Util.checkString(rset0.getString("stlm_proc_pers_emp_no"));
			rec.vat_incd_yn = Util.checkString(rset0.getString("vat_incd_yn"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_emp_nm = Util.checkString(rset0.getString("incmg_pers_emp_nm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_pers_emp_nm = Util.checkString(rset0.getString("chg_pers_emp_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			EN_EVNT_1203_LCURLIST2Record rec = new EN_EVNT_1203_LCURLIST2Record();
			rec.tmp_evnt_cd = Util.checkString(rset1.getString("tmp_evnt_cd"));
			rec.evnt_nm = Util.checkString(rset1.getString("evnt_nm"));
			rec.evnt_rcpm_unit_clsf = Util.checkString(rset1.getString("evnt_rcpm_unit_clsf"));
			rec.evnt_rcpm_unit_nm = Util.checkString(rset1.getString("evnt_rcpm_unit_nm"));
			rec.vitl_acct_no_bgn = Util.checkString(rset1.getString("vitl_acct_no_bgn"));
			rec.vitl_acct_no_end = Util.checkString(rset1.getString("vitl_acct_no_end"));
			rec.use_end_yn = Util.checkString(rset1.getString("use_end_yn"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_pers_emp_nm = Util.checkString(rset1.getString("incmg_pers_emp_nm"));
			rec.incmg_dt = Util.checkString(rset1.getString("incmg_dt"));
			rec.chg_pers = Util.checkString(rset1.getString("chg_pers"));
			rec.chg_pers_emp_nm = Util.checkString(rset1.getString("chg_pers_emp_nm"));
			rec.chg_dt = Util.checkString(rset1.getString("chg_dt"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.evnt_yy = Util.checkString(rset1.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset1.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset1.getString("evnt_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_EVNT_1203_LDataSet ds = (EN_EVNT_1203_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		EN_EVNT_1203_LCURLIST1Record curlist1Rec = (EN_EVNT_1203_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		EN_EVNT_1203_LCURLIST2Record curlist2Rec = (EN_EVNT_1203_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.evnt_yy%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.evnt_seq%>
<%= curlist1Rec.evnt_nm%>
<%= curlist1Rec.evnt_type%>
<%= curlist1Rec.regu_non_regu_clsf%>
<%= curlist1Rec.spons_clsf%>
<%= curlist1Rec.entr_cost%>
<%= curlist1Rec.charg_entr_nops%>
<%= curlist1Rec.free_entr_nops%>
<%= curlist1Rec.grp_entr_nops%>
<%= curlist1Rec.grp_entr_team_cnt%>
<%= curlist1Rec.evnt_dds%>
<%= curlist1Rec.evnt_frdt%>
<%= curlist1Rec.evnt_todt%>
<%= curlist1Rec.plac_1%>
<%= curlist1Rec.plac_2%>
<%= curlist1Rec.plac_3%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.chrg_pers_emp_no%>
<%= curlist1Rec.chrg_pers_emp_nm%>
<%= curlist1Rec.reven_budg_amt%>
<%= curlist1Rec.expn_budg_amt%>
<%= curlist1Rec.enpr_reven_stlm_amt%>
<%= curlist1Rec.enpr_expn_stlm_amt%>
<%= curlist1Rec.acct_reven_stlm_amt%>
<%= curlist1Rec.acct_expn_stlm_amt%>
<%= curlist1Rec.stlm_dt%>
<%= curlist1Rec.stlm_proc_dt%>
<%= curlist1Rec.stlm_proc_pers_emp_no%>
<%= curlist1Rec.vat_incd_yn%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_pers_emp_nm%>
<%= curlist1Rec.incmg_dt%>
<%= curlist1Rec.chg_pers%>
<%= curlist1Rec.chg_pers_emp_nm%>
<%= curlist1Rec.chg_dt%>
<%= curlist1Rec.evnt_cd_nm%>
<%= curlist2Rec.tmp_evnt_cd%>
<%= curlist2Rec.evnt_nm%>
<%= curlist2Rec.evnt_rcpm_unit_clsf%>
<%= curlist2Rec.evnt_rcpm_unit_nm%>
<%= curlist2Rec.vitl_acct_no_bgn%>
<%= curlist2Rec.vitl_acct_no_end%>
<%= curlist2Rec.use_end_yn%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.incmg_pers%>
<%= curlist2Rec.incmg_pers_emp_nm%>
<%= curlist2Rec.incmg_dt%>
<%= curlist2Rec.chg_pers%>
<%= curlist2Rec.chg_pers_emp_nm%>
<%= curlist2Rec.chg_dt%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.evnt_yy%>
<%= curlist2Rec.evnt_cd%>
<%= curlist2Rec.evnt_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 12:00:56 KST 2009 */