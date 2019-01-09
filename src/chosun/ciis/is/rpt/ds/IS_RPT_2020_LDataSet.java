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


public class IS_RPT_2020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_2020_LDataSet(){}
	public IS_RPT_2020_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			IS_RPT_2020_LCURLIST1Record rec = new IS_RPT_2020_LCURLIST1Record();
			rec.sido = Util.checkString(rset0.getString("sido"));
			rec.gu = Util.checkString(rset0.getString("gu"));
			rec.purc_dlco_no = Util.checkString(rset0.getString("purc_dlco_no"));
			rec.sido_nm = Util.checkString(rset0.getString("sido_nm"));
			rec.gu_nm = Util.checkString(rset0.getString("gu_nm"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.scat_yyyy = Util.checkString(rset0.getString("scat_yyyy"));
			rec.scat_yyyy_2 = Util.checkString(rset0.getString("scat_yyyy_2"));
			rec.amt_01 = Util.checkString(rset0.getString("amt_01"));
			rec.amt_02 = Util.checkString(rset0.getString("amt_02"));
			rec.amt_03 = Util.checkString(rset0.getString("amt_03"));
			rec.amt_04 = Util.checkString(rset0.getString("amt_04"));
			rec.amt_05 = Util.checkString(rset0.getString("amt_05"));
			rec.amt_06 = Util.checkString(rset0.getString("amt_06"));
			rec.amt_07 = Util.checkString(rset0.getString("amt_07"));
			rec.amt_08 = Util.checkString(rset0.getString("amt_08"));
			rec.amt_09 = Util.checkString(rset0.getString("amt_09"));
			rec.amt_10 = Util.checkString(rset0.getString("amt_10"));
			rec.amt_11 = Util.checkString(rset0.getString("amt_11"));
			rec.amt_12 = Util.checkString(rset0.getString("amt_12"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_RPT_2020_LDataSet ds = (IS_RPT_2020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_2020_LCURLIST1Record curlist1Rec = (IS_RPT_2020_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlist1Rec.purc_dlco_no%>
<%= curlist1Rec.sido_nm%>
<%= curlist1Rec.gu_nm%>
<%= curlist1Rec.purc_dlco_nm%>
<%= curlist1Rec.scat_yyyy%>
<%= curlist1Rec.scat_yyyy_2%>
<%= curlist1Rec.amt_01%>
<%= curlist1Rec.amt_02%>
<%= curlist1Rec.amt_03%>
<%= curlist1Rec.amt_04%>
<%= curlist1Rec.amt_05%>
<%= curlist1Rec.amt_06%>
<%= curlist1Rec.amt_07%>
<%= curlist1Rec.amt_08%>
<%= curlist1Rec.amt_09%>
<%= curlist1Rec.amt_10%>
<%= curlist1Rec.amt_11%>
<%= curlist1Rec.amt_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 16:39:49 KST 2012 */