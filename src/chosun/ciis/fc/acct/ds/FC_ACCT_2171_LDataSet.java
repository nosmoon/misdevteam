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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2171_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList tax_stmtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2171_LDataSet(){}
	public FC_ACCT_2171_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			FC_ACCT_2171_LTAX_STMTLISTRecord rec = new FC_ACCT_2171_LTAX_STMTLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.prof_type_nm = Util.checkString(rset0.getString("prof_type_nm"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_clsf_nm = Util.checkString(rset0.getString("slip_clsf_nm"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.issu_tms = Util.checkString(rset0.getString("issu_tms"));
			rec.issu_pers_emp_no = Util.checkString(rset0.getString("issu_pers_emp_no"));
			rec.issu_pers_emp_nm = Util.checkString(rset0.getString("issu_pers_emp_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.slip_rcpm_dt = Util.checkString(rset0.getString("slip_rcpm_dt"));
			rec.transmission_yn = Util.checkString(rset0.getString("transmission_yn"));
			rec.tax_stmt = Util.checkString(rset0.getString("tax_stmt"));
			rec.broker_issu_yn = Util.checkString(rset0.getString("broker_issu_yn"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.item = Util.checkString(rset0.getString("item"));
			this.tax_stmtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2171_LDataSet ds = (FC_ACCT_2171_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.tax_stmtlist.size(); i++){
		FC_ACCT_2171_LTAX_STMTLISTRecord tax_stmtlistRec = (FC_ACCT_2171_LTAX_STMTLISTRecord)ds.tax_stmtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTax_stmtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= tax_stmtlistRec.chk%>
<%= tax_stmtlistRec.prof_type_cd%>
<%= tax_stmtlistRec.prof_type_nm%>
<%= tax_stmtlistRec.slip_clsf_cd%>
<%= tax_stmtlistRec.slip_clsf_nm%>
<%= tax_stmtlistRec.slip_occr_dt%>
<%= tax_stmtlistRec.slip_seq%>
<%= tax_stmtlistRec.dlco_cd%>
<%= tax_stmtlistRec.dlco_nm%>
<%= tax_stmtlistRec.presi_nm%>
<%= tax_stmtlistRec.suply_amt%>
<%= tax_stmtlistRec.vat_amt%>
<%= tax_stmtlistRec.fisc_dt%>
<%= tax_stmtlistRec.issu_tms%>
<%= tax_stmtlistRec.issu_pers_emp_no%>
<%= tax_stmtlistRec.issu_pers_emp_nm%>
<%= tax_stmtlistRec.budg_cd%>
<%= tax_stmtlistRec.tax_stmt_aprv_yn%>
<%= tax_stmtlistRec.ask_dept_cd%>
<%= tax_stmtlistRec.slip_rcpm_dt%>
<%= tax_stmtlistRec.transmission_yn%>
<%= tax_stmtlistRec.tax_stmt%>
<%= tax_stmtlistRec.broker_issu_yn%>
<%= tax_stmtlistRec.make_dt%>
<%= tax_stmtlistRec.item%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 14:12:17 KST 2015 */