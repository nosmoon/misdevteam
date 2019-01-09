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


public class IS_RPT_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_2420_LDataSet(){}
	public IS_RPT_2420_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			IS_RPT_2420_LCURLIST1Record rec = new IS_RPT_2420_LCURLIST1Record();
			rec.sido = Util.checkString(rset0.getString("sido"));
			rec.gu = Util.checkString(rset0.getString("gu"));
			rec.purc_dlco_no_sort = Util.checkString(rset0.getString("purc_dlco_no_sort"));
			rec.sido_nm = Util.checkString(rset0.getString("sido_nm"));
			rec.gu_nm = Util.checkString(rset0.getString("gu_nm"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.purc_dlco_no = Util.checkString(rset0.getString("purc_dlco_no"));
			rec.o_amt_01 = Util.checkString(rset0.getString("o_amt_01"));
			rec.o_amt_02 = Util.checkString(rset0.getString("o_amt_02"));
			rec.o_amt_03 = Util.checkString(rset0.getString("o_amt_03"));
			rec.o_amt_04 = Util.checkString(rset0.getString("o_amt_04"));
			rec.o_amt_05 = Util.checkString(rset0.getString("o_amt_05"));
			rec.o_amt_06 = Util.checkString(rset0.getString("o_amt_06"));
			rec.o_amt_07 = Util.checkString(rset0.getString("o_amt_07"));
			rec.o_amt_08 = Util.checkString(rset0.getString("o_amt_08"));
			rec.o_amt_09 = Util.checkString(rset0.getString("o_amt_09"));
			rec.o_amt_10 = Util.checkString(rset0.getString("o_amt_10"));
			rec.o_amt_11 = Util.checkString(rset0.getString("o_amt_11"));
			rec.o_amt_12 = Util.checkString(rset0.getString("o_amt_12"));
			rec.p_amt_01 = Util.checkString(rset0.getString("p_amt_01"));
			rec.p_amt_02 = Util.checkString(rset0.getString("p_amt_02"));
			rec.p_amt_03 = Util.checkString(rset0.getString("p_amt_03"));
			rec.p_amt_04 = Util.checkString(rset0.getString("p_amt_04"));
			rec.p_amt_05 = Util.checkString(rset0.getString("p_amt_05"));
			rec.p_amt_06 = Util.checkString(rset0.getString("p_amt_06"));
			rec.p_amt_07 = Util.checkString(rset0.getString("p_amt_07"));
			rec.p_amt_08 = Util.checkString(rset0.getString("p_amt_08"));
			rec.p_amt_09 = Util.checkString(rset0.getString("p_amt_09"));
			rec.p_amt_10 = Util.checkString(rset0.getString("p_amt_10"));
			rec.p_amt_11 = Util.checkString(rset0.getString("p_amt_11"));
			rec.p_amt_12 = Util.checkString(rset0.getString("p_amt_12"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_RPT_2420_LDataSet ds = (IS_RPT_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_2420_LCURLIST1Record curlist1Rec = (IS_RPT_2420_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlist1Rec.purc_dlco_no_sort%>
<%= curlist1Rec.sido_nm%>
<%= curlist1Rec.gu_nm%>
<%= curlist1Rec.purc_dlco_nm%>
<%= curlist1Rec.purc_dlco_no%>
<%= curlist1Rec.o_amt_01%>
<%= curlist1Rec.o_amt_02%>
<%= curlist1Rec.o_amt_03%>
<%= curlist1Rec.o_amt_04%>
<%= curlist1Rec.o_amt_05%>
<%= curlist1Rec.o_amt_06%>
<%= curlist1Rec.o_amt_07%>
<%= curlist1Rec.o_amt_08%>
<%= curlist1Rec.o_amt_09%>
<%= curlist1Rec.o_amt_10%>
<%= curlist1Rec.o_amt_11%>
<%= curlist1Rec.o_amt_12%>
<%= curlist1Rec.p_amt_01%>
<%= curlist1Rec.p_amt_02%>
<%= curlist1Rec.p_amt_03%>
<%= curlist1Rec.p_amt_04%>
<%= curlist1Rec.p_amt_05%>
<%= curlist1Rec.p_amt_06%>
<%= curlist1Rec.p_amt_07%>
<%= curlist1Rec.p_amt_08%>
<%= curlist1Rec.p_amt_09%>
<%= curlist1Rec.p_amt_10%>
<%= curlist1Rec.p_amt_11%>
<%= curlist1Rec.p_amt_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 28 15:54:07 KST 2012 */