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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_3210_LDataSet(){}
	public IS_AGR_3210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			IS_AGR_3210_LCURLISTRecord rec = new IS_AGR_3210_LCURLISTRecord();
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.make_ask_reg_dt = Util.checkString(rset0.getString("make_ask_reg_dt"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.work_kind_nm = Util.checkString(rset0.getString("work_kind_nm"));
			rec.make_clsf_nm = Util.checkString(rset0.getString("make_clsf_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.clr_cd_nm = Util.checkString(rset0.getString("clr_cd_nm"));
			rec.rvord_qunt = Util.checkString(rset0.getString("rvord_qunt"));
			rec.rvord_uprc = Util.checkString(rset0.getString("rvord_uprc"));
			rec.rvord_amt = Util.checkString(rset0.getString("rvord_amt"));
			rec.acwr_incmg_dt_tm = Util.checkString(rset0.getString("acwr_incmg_dt_tm"));
			rec.draft_end_dt = Util.checkString(rset0.getString("draft_end_dt"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.purc_clsf_nm = Util.checkString(rset0.getString("purc_clsf_nm"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.stmt_recp_yn = Util.checkString(rset0.getString("stmt_recp_yn"));
			rec.make_ask_reg_seq = Util.checkString(rset0.getString("make_ask_reg_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_3210_LDataSet ds = (IS_AGR_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_3210_LCURLISTRecord curlistRec = (IS_AGR_3210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_stat_nm%>
<%= curlistRec.make_ask_reg_dt%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_nm%>
<%= curlistRec.work_kind_nm%>
<%= curlistRec.make_clsf_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.clr_cd_nm%>
<%= curlistRec.rvord_qunt%>
<%= curlistRec.rvord_uprc%>
<%= curlistRec.rvord_amt%>
<%= curlistRec.acwr_incmg_dt_tm%>
<%= curlistRec.draft_end_dt%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.purc_dlco_nm%>
<%= curlistRec.purc_clsf_nm%>
<%= curlistRec.purc_amt%>
<%= curlistRec.stmt_recp_yn%>
<%= curlistRec.make_ask_reg_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 16:40:01 KST 2012 */