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


public class HD_EVLU_3701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_3701_LDataSet(){}
	public HD_EVLU_3701_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_3701_LCURLISTRecord rec = new HD_EVLU_3701_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.evlu_lcls_grp_nm = Util.checkString(rset0.getString("evlu_lcls_grp_nm"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.asst_nm_korn = Util.checkString(rset0.getString("asst_nm_korn"));
			rec.tms1_nm_korn = Util.checkString(rset0.getString("tms1_nm_korn"));
			rec.tms2_nm_korn = Util.checkString(rset0.getString("tms2_nm_korn"));
			rec.asst_pnt = Util.checkString(rset0.getString("asst_pnt"));
			rec.spc_psdo_redu_scorcnt = Util.checkString(rset0.getString("spc_psdo_redu_scorcnt"));
			rec.tmp_grad = Util.checkString(rset0.getString("tmp_grad"));
			rec.evlu_pers_meda_grad_1tms = Util.checkString(rset0.getString("evlu_pers_meda_grad_1tms"));
			rec.evlu_pers_deci_grad_2tms = Util.checkString(rset0.getString("evlu_pers_deci_grad_2tms"));
			rec.rank = Util.checkString(rset0.getString("rank"));
			rec.cmpt_scor = Util.checkString(rset0.getString("cmpt_scor"));
			rec.slf_schv_desc1 = Util.checkString(rset0.getString("slf_schv_desc1"));
			rec.slf_schv_desc2 = Util.checkString(rset0.getString("slf_schv_desc2"));
			rec.evlu_scor = Util.checkString(rset0.getString("evlu_scor"));
			rec.rvis_scor_1tms = Util.checkString(rset0.getString("rvis_scor_1tms"));
			rec.evlu_pers_meda_opn_1tms = Util.checkString(rset0.getString("evlu_pers_meda_opn_1tms"));
			rec.evlu_pers_meda_opn_2tms = Util.checkString(rset0.getString("evlu_pers_meda_opn_2tms"));
			rec.evlu_cmpt_opn_1tms = Util.checkString(rset0.getString("evlu_cmpt_opn_1tms"));
			rec.evlu_opn = Util.checkString(rset0.getString("evlu_opn"));
			rec.evlu_grad_cd_01 = Util.checkString(rset0.getString("evlu_grad_cd_01"));
			rec.evlu_grad_cd_02 = Util.checkString(rset0.getString("evlu_grad_cd_02"));
			rec.evlu_grad_cd_03 = Util.checkString(rset0.getString("evlu_grad_cd_03"));
			rec.evlu_grad_cd_04 = Util.checkString(rset0.getString("evlu_grad_cd_04"));
			rec.evlu_grad_cd_05 = Util.checkString(rset0.getString("evlu_grad_cd_05"));
			rec.evlu_grad_cd_06 = Util.checkString(rset0.getString("evlu_grad_cd_06"));
			rec.evlu_dp_scorcnt = Util.checkString(rset0.getString("evlu_dp_scorcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3701_LDataSet ds = (HD_EVLU_3701_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3701_LCURLISTRecord curlistRec = (HD_EVLU_3701_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sel_chk%>
<%= curlistRec.evlu_lcls_grp_nm%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.asst_nm_korn%>
<%= curlistRec.tms1_nm_korn%>
<%= curlistRec.tms2_nm_korn%>
<%= curlistRec.asst_pnt%>
<%= curlistRec.spc_psdo_redu_scorcnt%>
<%= curlistRec.tmp_grad%>
<%= curlistRec.evlu_pers_meda_grad_1tms%>
<%= curlistRec.evlu_pers_deci_grad_2tms%>
<%= curlistRec.rank%>
<%= curlistRec.cmpt_scor%>
<%= curlistRec.slf_schv_desc1%>
<%= curlistRec.slf_schv_desc2%>
<%= curlistRec.evlu_scor%>
<%= curlistRec.rvis_scor_1tms%>
<%= curlistRec.evlu_pers_meda_opn_1tms%>
<%= curlistRec.evlu_pers_meda_opn_2tms%>
<%= curlistRec.evlu_cmpt_opn_1tms%>
<%= curlistRec.evlu_opn%>
<%= curlistRec.evlu_grad_cd_01%>
<%= curlistRec.evlu_grad_cd_02%>
<%= curlistRec.evlu_grad_cd_03%>
<%= curlistRec.evlu_grad_cd_04%>
<%= curlistRec.evlu_grad_cd_05%>
<%= curlistRec.evlu_grad_cd_06%>
<%= curlistRec.evlu_dp_scorcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 11:28:01 KST 2018 */