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
import chosun.ciis.ad.dep.rec.AD_DEP_2420_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2420_LDataSet(){}
	public AD_DEP_2420_LDataSet(String errcode, String errmsg){
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
			AD_DEP_2420_LCURLISTRecord rec = new AD_DEP_2420_LCURLISTRecord();
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dhon_occr_dt = Util.checkString(rset0.getString("dhon_occr_dt"));
			rec.rcpm_no = Util.checkString(rset0.getString("rcpm_no"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.clamt_chrg_emp = Util.checkString(rset0.getString("clamt_chrg_emp"));
			rec.slcrg_pers_emp = Util.checkString(rset0.getString("slcrg_pers_emp"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2420_LDataSet ds = (AD_DEP_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2420_LCURLISTRecord curlistRec = (AD_DEP_2420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dhon_occr_dt%>
<%= curlistRec.rcpm_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.dhon_amt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.clamt_chrg_emp%>
<%= curlistRec.slcrg_pers_emp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 09:23:19 KST 2009 */