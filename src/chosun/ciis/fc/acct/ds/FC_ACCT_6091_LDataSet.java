/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계 - 부가세관리 - 세금계산서 조회
* 작성일자 : 2010-08-13
* 작성자 : 노상현
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
 * 재무회계 - 부가세관리 - 세금계산서 조회
 */


public class FC_ACCT_6091_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6091_LDataSet(){}
	public FC_ACCT_6091_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_6091_LCURLISTRecord rec = new FC_ACCT_6091_LCURLISTRecord();
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.taxstmt_no = Util.checkString(rset0.getString("taxstmt_no"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.suply_total = Util.checkString(rset0.getString("suply_total"));
			rec.vat_total = Util.checkString(rset0.getString("vat_total"));
			rec.elec_tax_comp_nm = Util.checkString(rset0.getString("elec_tax_comp_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6091_LDataSet ds = (FC_ACCT_6091_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6091_LCURLISTRecord curlistRec = (FC_ACCT_6091_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prof_type_cd%>
<%= curlistRec.taxstmt_no%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.erplace_cd%>
<%= curlistRec.make_dt%>
<%= curlistRec.vexc_cmpy_cd%>
<%= curlistRec.suply_total%>
<%= curlistRec.vat_total%>
<%= curlistRec.elec_tax_comp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 10 11:57:00 KST 2011 */