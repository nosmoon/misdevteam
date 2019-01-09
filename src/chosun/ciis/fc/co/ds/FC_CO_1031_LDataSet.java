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


package chosun.ciis.fc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_CO_1031_LDataSet(){}
	public FC_CO_1031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_CO_1031_LCURLISTRecord rec = new FC_CO_1031_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.fund_mang_no = Util.checkString(rset1.getString("fund_mang_no"));
			rec.fund_mang_nonm = Util.checkString(rset1.getString("fund_mang_nonm"));
			rec.loan_no = Util.checkString(rset1.getString("loan_no"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.loan_amt = Util.checkString(rset1.getString("loan_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_CO_1031_LDataSet ds = (FC_CO_1031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_CO_1031_LCURLISTRecord curlistRec = (FC_CO_1031_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.fund_mang_no%>
<%= curlistRec.fund_mang_nonm%>
<%= curlistRec.loan_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.loan_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 11:25:54 KST 2009 */