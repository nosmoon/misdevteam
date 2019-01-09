/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.dwnwrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 *
 */

public class HD_DWNWRK_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DWNWRK_1300_LDataSet(){}
	public HD_DWNWRK_1300_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_DWNWRK_1300_LCURLISTRecord rec = new HD_DWNWRK_1300_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.erl_prsnt_bgn_tm = Util.checkString(rset0.getString("erl_prsnt_bgn_tm"));
			rec.erl_prsnt_end_tm = Util.checkString(rset0.getString("erl_prsnt_end_tm"));
			rec.erl_prsnt_duty_tm = Util.checkString(rset0.getString("erl_prsnt_duty_tm"));
			rec.alon_amt = Util.checkString(rset0.getString("alon_amt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.duty_resn = Util.checkString(rset0.getString("duty_resn"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_DWNWRK_1300_LCURLIST1Record rec = new HD_DWNWRK_1300_LCURLIST1Record();
			rec.s_cmpy_cd = Util.checkString(rset1.getString("s_cmpy_cd"));
			rec.s_emp_no = Util.checkString(rset1.getString("s_emp_no"));
			rec.s_flnm = Util.checkString(rset1.getString("s_flnm"));
			rec.s_dept_cd = Util.checkString(rset1.getString("s_dept_cd"));
			rec.s_total_alon_amt = Util.checkString(rset1.getString("s_total_alon_amt"));
			rec.s_pay_dt = Util.checkString(rset1.getString("s_pay_dt"));
			rec.s_duty_dds = Util.checkString(rset1.getString("s_duty_dds"));
			rec.s_total_amt = Util.checkString(rset1.getString("s_total_amt"));
			rec.s_total_peple = Util.checkString(rset1.getString("s_total_peple"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.incmg_pres = Util.checkString(rset1.getString("incmg_pres"));
			rec.incmg_pres_ipadd = Util.checkString(rset1.getString("incmg_pres_ipadd"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DWNWRK_1300_LDataSet ds = (HD_DWNWRK_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DWNWRK_1300_LCURLISTRecord curlistRec = (HD_DWNWRK_1300_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_DWNWRK_1300_LCURLIST1Record curlist1Rec = (HD_DWNWRK_1300_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.erl_prsnt_bgn_tm%>
<%= curlistRec.erl_prsnt_end_tm%>
<%= curlistRec.erl_prsnt_duty_tm%>
<%= curlistRec.alon_amt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.duty_resn%>
<%= curlistRec.pay_dt%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.dept_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.db_status%>
<%= curlist1Rec.s_cmpy_cd%>
<%= curlist1Rec.s_emp_no%>
<%= curlist1Rec.s_flnm%>
<%= curlist1Rec.s_dept_cd%>
<%= curlist1Rec.s_total_alon_amt%>
<%= curlist1Rec.s_pay_dt%>
<%= curlist1Rec.s_duty_dds%>
<%= curlist1Rec.s_total_amt%>
<%= curlist1Rec.s_total_peple%>
<%= curlist1Rec.actu_slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.incmg_pres%>
<%= curlist1Rec.incmg_pres_ipadd%>
<%= curlist1Rec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 17:12:39 KST 2009 */