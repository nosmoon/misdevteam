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


public class FC_FUNC_7041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_7041_LDataSet(){}
	public FC_FUNC_7041_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			FC_FUNC_7041_LCURLISTRecord rec = new FC_FUNC_7041_LCURLISTRecord();
			rec.fund_mang_no = Util.checkString(rset2.getString("fund_mang_no"));
			rec.loan_no = Util.checkString(rset2.getString("loan_no"));
			rec.dlco_clsf_cd = Util.checkString(rset2.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.loan_amt = Util.checkString(rset2.getString("loan_amt"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.iyul = Util.checkString(rset2.getString("iyul"));
			rec.totint = Util.checkString(rset2.getString("totint"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.cigbnm = Util.checkString(rset2.getString("cigbnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7041_LDataSet ds = (FC_FUNC_7041_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_7041_LCURLISTRecord curlistRec = (FC_FUNC_7041_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fund_mang_no%>
<%= curlistRec.loan_no%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.loan_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.iyul%>
<%= curlistRec.totint%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.cigbnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 10:37:12 KST 2009 */