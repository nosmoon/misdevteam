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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2420_LDataSet(){}
	public SP_SAL_2420_LDataSet(String errcode, String errmsg){
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
			SP_SAL_2420_LCURLIST1Record rec = new SP_SAL_2420_LCURLIST1Record();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.deps_pers = Util.checkString(rset0.getString("deps_pers"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.req_amt_1 = Util.checkString(rset0.getString("req_amt_1"));
			rec.req_amt_2 = Util.checkString(rset0.getString("req_amt_2"));
			rec.req_amt_3 = Util.checkString(rset0.getString("req_amt_3"));
			rec.req_amt_4 = Util.checkString(rset0.getString("req_amt_4"));
			rec.req_amt_5 = Util.checkString(rset0.getString("req_amt_5"));
			rec.req_amt_6 = Util.checkString(rset0.getString("req_amt_6"));
			rec.req_amt_7 = Util.checkString(rset0.getString("req_amt_7"));
			rec.req_amt_8 = Util.checkString(rset0.getString("req_amt_8"));
			rec.req_amt_9 = Util.checkString(rset0.getString("req_amt_9"));
			rec.req_amt_10 = Util.checkString(rset0.getString("req_amt_10"));
			rec.req_amt_11 = Util.checkString(rset0.getString("req_amt_11"));
			rec.req_amt_12 = Util.checkString(rset0.getString("req_amt_12"));
			rec.req_amt_13 = Util.checkString(rset0.getString("req_amt_13"));
			rec.req_amt_14 = Util.checkString(rset0.getString("req_amt_14"));
			rec.req_amt_15 = Util.checkString(rset0.getString("req_amt_15"));
			rec.tot = Util.checkString(rset0.getString("tot"));
			rec.mappli = Util.checkString(rset0.getString("mappli"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2420_LDataSet ds = (SP_SAL_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_2420_LCURLIST1Record curlist1Rec = (SP_SAL_2420_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.bo_cd%>
<%= curlist1Rec.bo_nm%>
<%= curlist1Rec.bank_nm%>
<%= curlist1Rec.bank_cd%>
<%= curlist1Rec.acct_no%>
<%= curlist1Rec.deps_pers%>
<%= curlist1Rec.amt%>
<%= curlist1Rec.req_amt_1%>
<%= curlist1Rec.req_amt_2%>
<%= curlist1Rec.req_amt_3%>
<%= curlist1Rec.req_amt_4%>
<%= curlist1Rec.req_amt_5%>
<%= curlist1Rec.req_amt_6%>
<%= curlist1Rec.req_amt_7%>
<%= curlist1Rec.req_amt_8%>
<%= curlist1Rec.req_amt_9%>
<%= curlist1Rec.req_amt_10%>
<%= curlist1Rec.req_amt_11%>
<%= curlist1Rec.req_amt_12%>
<%= curlist1Rec.req_amt_13%>
<%= curlist1Rec.req_amt_14%>
<%= curlist1Rec.req_amt_15%>
<%= curlist1Rec.tot%>
<%= curlist1Rec.mappli%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 18 14:18:33 KST 2012 */