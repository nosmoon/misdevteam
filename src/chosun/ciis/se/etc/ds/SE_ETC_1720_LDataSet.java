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


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_ETC_1720_LDataSet(){}
	public SE_ETC_1720_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_ETC_1720_LCURLISTRecord rec = new SE_ETC_1720_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.pay_seq = Util.checkString(rset0.getString("pay_seq"));
			rec.pay_ptcr_seq = Util.checkString(rset0.getString("pay_ptcr_seq"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.real_amt = Util.checkString(rset0.getString("real_amt"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.supr_dept_nm = Util.checkString(rset0.getString("supr_dept_nm"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.recp_pers_nm = Util.checkString(rset0.getString("recp_pers_nm"));
			rec.tax_yn = Util.checkString(rset0.getString("tax_yn"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.rcpt_clsf = Util.checkString(rset0.getString("rcpt_clsf"));
			rec.stmt_clsf = Util.checkString(rset0.getString("stmt_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1720_LDataSet ds = (SE_ETC_1720_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1720_LCURLISTRecord curlistRec = (SE_ETC_1720_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.pay_seq%>
<%= curlistRec.pay_ptcr_seq%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.prn%>
<%= curlistRec.qty%>
<%= curlistRec.uprc%>
<%= curlistRec.amt%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.real_amt%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.supr_dept_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.acct_no%>
<%= curlistRec.rmks%>
<%= curlistRec.recp_pers_nm%>
<%= curlistRec.tax_yn%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.vat%>
<%= curlistRec.rcpt_clsf%>
<%= curlistRec.stmt_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 10 15:21:13 KST 2013 */