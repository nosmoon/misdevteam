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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1085_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1085_LDataSet(){}
	public FC_FUNC_1085_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_FUNC_1085_LCURLISTRecord rec = new FC_FUNC_1085_LCURLISTRecord();
			rec.note_clsf_cdnm = Util.checkString(rset2.getString("note_clsf_cdnm"));
			rec.note_no = Util.checkString(rset2.getString("note_no"));
			rec.note_amt = Util.checkString(rset2.getString("note_amt"));
			rec.sale_dscn_amt = Util.checkString(rset2.getString("sale_dscn_amt"));
			rec.rcpay_amt = Util.checkString(rset2.getString("rcpay_amt"));
			rec.corp_tax = Util.checkString(rset2.getString("corp_tax"));
			rec.etc_prft = Util.checkString(rset2.getString("etc_prft"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset2.getString("issu_pers_nm"));
			rec.dlco_cdnm = Util.checkString(rset2.getString("dlco_cdnm"));
			rec.pay_plac_cdnm = Util.checkString(rset2.getString("pay_plac_cdnm"));
			rec.now_note_stat_cdnm = Util.checkString(rset2.getString("now_note_stat_cdnm"));
			rec.dlco_cdnm2 = Util.checkString(rset2.getString("dlco_cdnm2"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.note_no1 = Util.checkString(rset2.getString("note_no1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1085_LDataSet ds = (FC_FUNC_1085_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1085_LCURLISTRecord curlistRec = (FC_FUNC_1085_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cdnm%>
<%= curlistRec.note_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.sale_dscn_amt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.corp_tax%>
<%= curlistRec.etc_prft%>
<%= curlistRec.slip_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.dlco_cdnm%>
<%= curlistRec.pay_plac_cdnm%>
<%= curlistRec.now_note_stat_cdnm%>
<%= curlistRec.dlco_cdnm2%>
<%= curlistRec.comp_dt%>
<%= curlistRec.note_no1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 18 17:51:44 KST 2009 */