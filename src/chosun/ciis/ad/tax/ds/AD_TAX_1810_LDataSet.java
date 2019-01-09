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


package chosun.ciis.ad.tax.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.tax.rec.AD_TAX_1810_LCURLIST2Record;
import chosun.ciis.ad.tax.rec.AD_TAX_1810_LCURLISTRecord;

/**
 * 
 */


public class AD_TAX_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_1810_LDataSet(){}
	public AD_TAX_1810_LDataSet(String errcode, String errmsg){
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
			AD_TAX_1810_LCURLISTRecord rec = new AD_TAX_1810_LCURLISTRecord();
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			AD_TAX_1810_LCURLIST2Record rec = new AD_TAX_1810_LCURLIST2Record();
			rec.tax_stmt_no = Util.checkString(rset1.getString("tax_stmt_no"));
			rec.make_dt = Util.checkString(rset1.getString("make_dt"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.clamt_stat = Util.checkString(rset1.getString("clamt_stat"));
			rec.clamt_stat_nm = Util.checkString(rset1.getString("clamt_stat_nm"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_1810_LDataSet ds = (AD_TAX_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1810_LCURLISTRecord curlistRec = (AD_TAX_1810_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_TAX_1810_LCURLIST2Record curlist2Rec = (AD_TAX_1810_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.fee%>
<%= curlist2Rec.tax_stmt_no%>
<%= curlist2Rec.make_dt%>
<%= curlist2Rec.suply_amt%>
<%= curlist2Rec.vat_amt%>
<%= curlist2Rec.clamt_stat%>
<%= curlist2Rec.clamt_stat_nm%>
<%= curlist2Rec.slip_clsf_cd%>
<%= curlist2Rec.slip_occr_dt%>
<%= curlist2Rec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 18:03:48 KST 2009 */