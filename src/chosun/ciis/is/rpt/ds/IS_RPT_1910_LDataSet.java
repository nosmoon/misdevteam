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


package chosun.ciis.is.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1910_LDataSet(){}
	public IS_RPT_1910_LDataSet(String errcode, String errmsg){
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
			IS_RPT_1910_LCURLIST1Record rec = new IS_RPT_1910_LCURLIST1Record();
			rec.sido = Util.checkString(rset0.getString("sido"));
			rec.gu = Util.checkString(rset0.getString("gu"));
			rec.sido_nm = Util.checkString(rset0.getString("sido_nm"));
			rec.gu_nm = Util.checkString(rset0.getString("gu_nm"));
			rec.p_amt_010 = Util.checkString(rset0.getString("p_amt_010"));
			rec.p_amt_020 = Util.checkString(rset0.getString("p_amt_020"));
			rec.p_amt_030 = Util.checkString(rset0.getString("p_amt_030"));
			rec.p_amt_tot = Util.checkString(rset0.getString("p_amt_tot"));
			rec.b_amt_010 = Util.checkString(rset0.getString("b_amt_010"));
			rec.b_amt_020 = Util.checkString(rset0.getString("b_amt_020"));
			rec.b_amt_030 = Util.checkString(rset0.getString("b_amt_030"));
			rec.b_amt_tot = Util.checkString(rset0.getString("b_amt_tot"));
			rec.c_amt_010 = Util.checkString(rset0.getString("c_amt_010"));
			rec.c_amt_020 = Util.checkString(rset0.getString("c_amt_020"));
			rec.c_amt_030 = Util.checkString(rset0.getString("c_amt_030"));
			rec.c_amt_tot = Util.checkString(rset0.getString("c_amt_tot"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_RPT_1910_LDataSet ds = (IS_RPT_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1910_LCURLIST1Record curlist1Rec = (IS_RPT_1910_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.sido%>
<%= curlist1Rec.gu%>
<%= curlist1Rec.sido_nm%>
<%= curlist1Rec.gu_nm%>
<%= curlist1Rec.p_amt_010%>
<%= curlist1Rec.p_amt_020%>
<%= curlist1Rec.p_amt_030%>
<%= curlist1Rec.p_amt_tot%>
<%= curlist1Rec.b_amt_010%>
<%= curlist1Rec.b_amt_020%>
<%= curlist1Rec.b_amt_030%>
<%= curlist1Rec.b_amt_tot%>
<%= curlist1Rec.c_amt_010%>
<%= curlist1Rec.c_amt_020%>
<%= curlist1Rec.c_amt_030%>
<%= curlist1Rec.c_amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 09:40:30 KST 2012 */