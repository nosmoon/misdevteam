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


public class FC_FUNC_7035_EDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7035_EDataSet(){}
	public FC_FUNC_7035_EDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			FC_FUNC_7035_ECURLISTRecord rec = new FC_FUNC_7035_ECURLISTRecord();
			rec.loan_nm = Util.checkString(rset3.getString("loan_nm"));
			rec.loan_amt = Util.checkString(rset3.getString("loan_amt"));
			rec.comp_dt = Util.checkString(rset3.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset3.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset3.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset3.getString("dlco_cd"));
			rec.int_clsf_cd = Util.checkString(rset3.getString("int_clsf_cd"));
			rec.loan_rmks = Util.checkString(rset3.getString("loan_rmks"));
			rec.loan_slip_occr_dt = Util.checkString(rset3.getString("loan_slip_occr_dt"));
			rec.loan_slip_clsf_cd = Util.checkString(rset3.getString("loan_slip_clsf_cd"));
			rec.loan_slip_seq = Util.checkString(rset3.getString("loan_slip_seq"));
			rec.loan_repay_clsf_cd = Util.checkString(rset3.getString("loan_repay_clsf_cd"));
			rec.compgbnm = Util.checkString(rset3.getString("compgbnm"));
			rec.compnm = Util.checkString(rset3.getString("compnm"));
			rec.intgbnm = Util.checkString(rset3.getString("intgbnm"));
			rec.cishgbnm = Util.checkString(rset3.getString("cishgbnm"));
			rec.int_rate = Util.checkString(rset3.getString("int_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7035_EDataSet ds = (FC_FUNC_7035_EDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_7035_ECURLISTRecord curlistRec = (FC_FUNC_7035_ECURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.loan_nm%>
<%= curlistRec.loan_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.int_clsf_cd%>
<%= curlistRec.loan_rmks%>
<%= curlistRec.loan_slip_occr_dt%>
<%= curlistRec.loan_slip_clsf_cd%>
<%= curlistRec.loan_slip_seq%>
<%= curlistRec.loan_repay_clsf_cd%>
<%= curlistRec.compgbnm%>
<%= curlistRec.compnm%>
<%= curlistRec.intgbnm%>
<%= curlistRec.cishgbnm%>
<%= curlistRec.int_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 11:13:48 KST 2009 */