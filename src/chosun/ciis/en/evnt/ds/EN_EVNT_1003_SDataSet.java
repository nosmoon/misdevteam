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


public class EN_EVNT_1003_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_EVNT_1003_SDataSet(){}
	public EN_EVNT_1003_SDataSet(String errcode, String errmsg){
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
			EN_EVNT_1003_SCURLISTRecord rec = new EN_EVNT_1003_SCURLISTRecord();
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
			rec.reven_budg_amt = Util.checkString(rset0.getString("reven_budg_amt"));
			rec.expn_budg_amt = Util.checkString(rset0.getString("expn_budg_amt"));
			rec.enpr_reven_stlm_amt = Util.checkString(rset0.getString("enpr_reven_stlm_amt"));
			rec.enpr_expn_stlm_amt = Util.checkString(rset0.getString("enpr_expn_stlm_amt"));
			rec.acct_reven_stlm_amt = Util.checkString(rset0.getString("acct_reven_stlm_amt"));
			rec.acct_expn_stlm_amt = Util.checkString(rset0.getString("acct_expn_stlm_amt"));
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
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_EVNT_1003_SDataSet ds = (EN_EVNT_1003_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_EVNT_1003_SCURLISTRecord curlistRec = (EN_EVNT_1003_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.evnt_yy%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_seq%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.evnt_type%>
<%= curlistRec.regu_non_regu_clsf%>
<%= curlistRec.spons_clsf%>
<%= curlistRec.entr_cost%>
<%= curlistRec.charg_entr_nops%>
<%= curlistRec.free_entr_nops%>
<%= curlistRec.grp_entr_nops%>
<%= curlistRec.grp_entr_team_cnt%>
<%= curlistRec.evnt_dds%>
<%= curlistRec.evnt_frdt%>
<%= curlistRec.evnt_todt%>
<%= curlistRec.plac_1%>
<%= curlistRec.plac_2%>
<%= curlistRec.plac_3%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.chrg_pers_emp_no%>
<%= curlistRec.chrg_pers_emp_nm%>
<%= curlistRec.reven_budg_amt%>
<%= curlistRec.expn_budg_amt%>
<%= curlistRec.enpr_reven_stlm_amt%>
<%= curlistRec.enpr_expn_stlm_amt%>
<%= curlistRec.acct_reven_stlm_amt%>
<%= curlistRec.acct_expn_stlm_amt%>
<%= curlistRec.stlm_dt%>
<%= curlistRec.stlm_proc_dt%>
<%= curlistRec.stlm_proc_pers_emp_no%>
<%= curlistRec.vat_incd_yn%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_emp_nm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_pers_emp_nm%>
<%= curlistRec.chg_dt%>
<%= curlistRec.evnt_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 14:18:30 KST 2009 */