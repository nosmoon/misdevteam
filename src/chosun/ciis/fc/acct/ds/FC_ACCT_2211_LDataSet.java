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


public class FC_ACCT_2211_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2211_LDataSet(){}
	public FC_ACCT_2211_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2211_LCURLISTRecord rec = new FC_ACCT_2211_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.pch_yscdnm = Util.checkString(rset0.getString("pch_yscdnm"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.occr_slip_occr_dt = Util.checkString(rset0.getString("occr_slip_occr_dt"));
			rec.occr_slip_clsf_cd = Util.checkString(rset0.getString("occr_slip_clsf_cd"));
			rec.occr_slip_seq = Util.checkString(rset0.getString("occr_slip_seq"));
			rec.occr_slip_sub_seq = Util.checkString(rset0.getString("occr_slip_sub_seq"));
			rec.occr_slip_arow_no = Util.checkString(rset0.getString("occr_slip_arow_no"));
			rec.acntcymd = Util.checkString(rset0.getString("acntcymd"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.pch_irjnm = Util.checkString(rset0.getString("pch_irjnm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ask_emp_no = Util.checkString(rset0.getString("ask_emp_no"));
			rec.pch_erirjnm = Util.checkString(rset0.getString("pch_erirjnm"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.pch_cgbuseonm = Util.checkString(rset0.getString("pch_cgbuseonm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.unrcp_excl_yn = Util.checkString(rset0.getString("unrcp_excl_yn"));
			rec.igamt = Util.checkString(rset0.getString("igamt"));
			rec.janamt = Util.checkString(rset0.getString("janamt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.occr_slip_no = Util.checkString(rset0.getString("occr_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2211_LDataSet ds = (FC_ACCT_2211_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2211_LCURLISTRecord curlistRec = (FC_ACCT_2211_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.pch_yscdnm%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.occr_slip_occr_dt%>
<%= curlistRec.occr_slip_clsf_cd%>
<%= curlistRec.occr_slip_seq%>
<%= curlistRec.occr_slip_sub_seq%>
<%= curlistRec.occr_slip_arow_no%>
<%= curlistRec.acntcymd%>
<%= curlistRec.ern%>
<%= curlistRec.pch_irjnm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ask_emp_no%>
<%= curlistRec.pch_erirjnm%>
<%= curlistRec.ask_dept_cd%>
<%= curlistRec.pch_cgbuseonm%>
<%= curlistRec.remk%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.unrcp_excl_yn%>
<%= curlistRec.igamt%>
<%= curlistRec.janamt%>
<%= curlistRec.slip_no%>
<%= curlistRec.occr_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 24 17:20:35 KST 2017 */