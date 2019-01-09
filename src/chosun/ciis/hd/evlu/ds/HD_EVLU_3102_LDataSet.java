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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String s_nops_2tms;
	public String a_pls_nops_2tms;

	public HD_EVLU_3102_LDataSet(){}
	public HD_EVLU_3102_LDataSet(String errcode, String errmsg, String s_nops_2tms, String a_pls_nops_2tms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.s_nops_2tms = s_nops_2tms;
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setS_nops_2tms(String s_nops_2tms){
		this.s_nops_2tms = s_nops_2tms;
	}

	public void setA_pls_nops_2tms(String a_pls_nops_2tms){
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getS_nops_2tms(){
		return this.s_nops_2tms;
	}

	public String getA_pls_nops_2tms(){
		return this.a_pls_nops_2tms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EVLU_3102_LCURLISTRecord rec = new HD_EVLU_3102_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.self_evlu_proc_stat = Util.checkString(rset0.getString("self_evlu_proc_stat"));
			rec.asst_evlu_proc_stat = Util.checkString(rset0.getString("asst_evlu_proc_stat"));
			rec.evlu_proc_stat_1tms = Util.checkString(rset0.getString("evlu_proc_stat_1tms"));
			rec.asst_pnt = Util.checkString(rset0.getString("asst_pnt"));
			rec.spc_psdo_redu_scorcnt = Util.checkString(rset0.getString("spc_psdo_redu_scorcnt"));
			rec.tmp_grad = Util.checkString(rset0.getString("tmp_grad"));
			rec.evlu_pers_meda_grad_1tms = Util.checkString(rset0.getString("evlu_pers_meda_grad_1tms"));
			rec.evlu_pers_deci_grad_2tms = Util.checkString(rset0.getString("evlu_pers_deci_grad_2tms"));
			rec.evlu_grad_cd_01 = Util.checkString(rset0.getString("evlu_grad_cd_01"));
			rec.evlu_grad_cd_02 = Util.checkString(rset0.getString("evlu_grad_cd_02"));
			rec.evlu_grad_cd_03 = Util.checkString(rset0.getString("evlu_grad_cd_03"));
			rec.evlu_grad_cd_04 = Util.checkString(rset0.getString("evlu_grad_cd_04"));
			rec.evlu_grad_cd_05 = Util.checkString(rset0.getString("evlu_grad_cd_05"));
			rec.busn_rslt_scor = Util.checkString(rset0.getString("busn_rslt_scor"));
			rec.evlu_dp_scorcnt = Util.checkString(rset0.getString("evlu_dp_scorcnt"));
			this.curlist.add(rec);
		}
		this.s_nops_2tms = Util.checkString(cstmt.getString(9));
		this.a_pls_nops_2tms = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3102_LDataSet ds = (HD_EVLU_3102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3102_LCURLISTRecord curlistRec = (HD_EVLU_3102_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getS_nops_2tms()%>
<%= ds.getA_pls_nops_2tms()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sel_chk%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.self_evlu_proc_stat%>
<%= curlistRec.asst_evlu_proc_stat%>
<%= curlistRec.evlu_proc_stat_1tms%>
<%= curlistRec.asst_pnt%>
<%= curlistRec.spc_psdo_redu_scorcnt%>
<%= curlistRec.tmp_grad%>
<%= curlistRec.evlu_pers_meda_grad_1tms%>
<%= curlistRec.evlu_pers_deci_grad_2tms%>
<%= curlistRec.evlu_grad_cd_01%>
<%= curlistRec.evlu_grad_cd_02%>
<%= curlistRec.evlu_grad_cd_03%>
<%= curlistRec.evlu_grad_cd_04%>
<%= curlistRec.evlu_grad_cd_05%>
<%= curlistRec.busn_rslt_scor%>
<%= curlistRec.evlu_dp_scorcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 29 13:52:13 KST 2016 */