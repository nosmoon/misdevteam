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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2122_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2122_LDataSet(){}
	public MC_BUDG_2122_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MC_BUDG_2122_LCURLIST1Record rec = new MC_BUDG_2122_LCURLIST1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.budg_yyyy = Util.checkString(rset0.getString("budg_yyyy"));
			rec.req_amt_01 = Util.checkString(rset0.getString("req_amt_01"));
			rec.req_amt_02 = Util.checkString(rset0.getString("req_amt_02"));
			rec.req_amt_03 = Util.checkString(rset0.getString("req_amt_03"));
			rec.req_amt_04 = Util.checkString(rset0.getString("req_amt_04"));
			rec.req_amt_05 = Util.checkString(rset0.getString("req_amt_05"));
			rec.req_amt_06 = Util.checkString(rset0.getString("req_amt_06"));
			rec.req_amt_07 = Util.checkString(rset0.getString("req_amt_07"));
			rec.req_amt_08 = Util.checkString(rset0.getString("req_amt_08"));
			rec.req_amt_09 = Util.checkString(rset0.getString("req_amt_09"));
			rec.req_amt_10 = Util.checkString(rset0.getString("req_amt_10"));
			rec.req_amt_11 = Util.checkString(rset0.getString("req_amt_11"));
			rec.req_amt_12 = Util.checkString(rset0.getString("req_amt_12"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_2122_LDataSet ds = (MC_BUDG_2122_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_2122_LCURLIST1Record curlist1Rec = (MC_BUDG_2122_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.seq%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.budg_nm%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.budg_yyyy%>
<%= curlist1Rec.req_amt_01%>
<%= curlist1Rec.req_amt_02%>
<%= curlist1Rec.req_amt_03%>
<%= curlist1Rec.req_amt_04%>
<%= curlist1Rec.req_amt_05%>
<%= curlist1Rec.req_amt_06%>
<%= curlist1Rec.req_amt_07%>
<%= curlist1Rec.req_amt_08%>
<%= curlist1Rec.req_amt_09%>
<%= curlist1Rec.req_amt_10%>
<%= curlist1Rec.req_amt_11%>
<%= curlist1Rec.req_amt_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 15:37:18 KST 2009 */