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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2510_LCURLIST1Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2510_LCURLIST2Record;

/**
 * 
 */


public class AD_DEP_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2510_LDataSet(){}
	public AD_DEP_2510_LDataSet(String errcode, String errmsg){
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
			AD_DEP_2510_LCURLIST1Record rec = new AD_DEP_2510_LCURLIST1Record();
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_DEP_2510_LCURLIST2Record rec = new AD_DEP_2510_LCURLIST2Record();
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dhon_occr_dt = Util.checkString(rset1.getString("dhon_occr_dt"));
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.clamt_chrg_emp_no = Util.checkString(rset1.getString("clamt_chrg_emp_no"));
			rec.slcrg_pers_emp_no = Util.checkString(rset1.getString("slcrg_pers_emp_no"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2510_LDataSet ds = (AD_DEP_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_DEP_2510_LCURLIST1Record curlist1Rec = (AD_DEP_2510_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_2510_LCURLIST2Record curlist2Rec = (AD_DEP_2510_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.note_amt%>
<%= curlist1Rec.rcpay_amt%>
<%= curlist1Rec.amt%>
<%= curlist2Rec.dlco_clsf_cd%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.dhon_occr_dt%>
<%= curlist2Rec.issu_pers_nm%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.clamt_chrg_emp_no%>
<%= curlist2Rec.slcrg_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 10:38:27 KST 2009 */