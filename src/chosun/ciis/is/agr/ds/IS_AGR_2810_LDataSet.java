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


public class IS_AGR_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2810_LDataSet(){}
	public IS_AGR_2810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			IS_AGR_2810_LCURLISTRecord rec = new IS_AGR_2810_LCURLISTRecord();
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.make_ask_reg_dt = Util.checkString(rset0.getString("make_ask_reg_dt"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tot_rvord_amt = Util.checkString(rset0.getString("tot_rvord_amt"));
			rec.prt_paper_cd_nm = Util.checkString(rset0.getString("prt_paper_cd_nm"));
			rec.prt_plan_dt = Util.checkString(rset0.getString("prt_plan_dt"));
			rec.work_clsf_nm = Util.checkString(rset0.getString("work_clsf_nm"));
			rec.clr_cd_nm = Util.checkString(rset0.getString("clr_cd_nm"));
			rec.pcnt_clsf_nm = Util.checkString(rset0.getString("pcnt_clsf_nm"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.purc_clsf_nm = Util.checkString(rset0.getString("purc_clsf_nm"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.make_ask_reg_seq = Util.checkString(rset0.getString("make_ask_reg_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2810_LDataSet ds = (IS_AGR_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2810_LCURLISTRecord curlistRec = (IS_AGR_2810_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dlvs_dt%>
<%= curlistRec.make_ask_reg_dt%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.tot_rvord_amt%>
<%= curlistRec.prt_paper_cd_nm%>
<%= curlistRec.prt_plan_dt%>
<%= curlistRec.work_clsf_nm%>
<%= curlistRec.clr_cd_nm%>
<%= curlistRec.pcnt_clsf_nm%>
<%= curlistRec.yy%>
<%= curlistRec.purc_dlco_nm%>
<%= curlistRec.purc_clsf_nm%>
<%= curlistRec.purc_amt%>
<%= curlistRec.make_ask_reg_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 06 17:19:31 KST 2012 */