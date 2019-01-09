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


public class FC_FUNC_3080_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_3080_LDataSet(){}
	public FC_FUNC_3080_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_3080_LCURLIST1Record rec = new FC_FUNC_3080_LCURLIST1Record();
			rec.busn_dt = Util.checkString(rset0.getString("busn_dt"));
			rec.week_day = Util.checkString(rset0.getString("week_day"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.col1 = Util.checkString(rset0.getString("col1"));
			rec.col2 = Util.checkString(rset0.getString("col2"));
			rec.col3 = Util.checkString(rset0.getString("col3"));
			rec.col4 = Util.checkString(rset0.getString("col4"));
			rec.col5 = Util.checkString(rset0.getString("col5"));
			rec.col6 = Util.checkString(rset0.getString("col6"));
			rec.col7 = Util.checkString(rset0.getString("col7"));
			rec.col8 = Util.checkString(rset0.getString("col8"));
			rec.col9 = Util.checkString(rset0.getString("col9"));
			rec.col10 = Util.checkString(rset0.getString("col10"));
			rec.col11 = Util.checkString(rset0.getString("col11"));
			rec.col12 = Util.checkString(rset0.getString("col12"));
			rec.col13 = Util.checkString(rset0.getString("col13"));
			rec.col14 = Util.checkString(rset0.getString("col14"));
			rec.col15 = Util.checkString(rset0.getString("col15"));
			rec.col16 = Util.checkString(rset0.getString("col16"));
			rec.col17 = Util.checkString(rset0.getString("col17"));
			rec.col18 = Util.checkString(rset0.getString("col18"));
			rec.col19 = Util.checkString(rset0.getString("col19"));
			rec.col20 = Util.checkString(rset0.getString("col20"));
			rec.col21 = Util.checkString(rset0.getString("col21"));
			rec.col22 = Util.checkString(rset0.getString("col22"));
			rec.col23 = Util.checkString(rset0.getString("col23"));
			rec.col24 = Util.checkString(rset0.getString("col24"));
			rec.col25 = Util.checkString(rset0.getString("col25"));
			rec.col26 = Util.checkString(rset0.getString("col26"));
			rec.col27 = Util.checkString(rset0.getString("col27"));
			rec.busn_dd_clsf_cd = Util.checkString(rset0.getString("busn_dd_clsf_cd"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_3080_LDataSet ds = (FC_FUNC_3080_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_3080_LCURLIST1Record curlist1Rec = (FC_FUNC_3080_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.busn_dt%>
<%= curlist1Rec.week_day%>
<%= curlist1Rec.tot_amt%>
<%= curlist1Rec.col1%>
<%= curlist1Rec.col2%>
<%= curlist1Rec.col3%>
<%= curlist1Rec.col4%>
<%= curlist1Rec.col5%>
<%= curlist1Rec.col6%>
<%= curlist1Rec.col7%>
<%= curlist1Rec.col8%>
<%= curlist1Rec.col9%>
<%= curlist1Rec.col10%>
<%= curlist1Rec.col11%>
<%= curlist1Rec.col12%>
<%= curlist1Rec.col13%>
<%= curlist1Rec.col14%>
<%= curlist1Rec.col15%>
<%= curlist1Rec.col16%>
<%= curlist1Rec.col17%>
<%= curlist1Rec.col18%>
<%= curlist1Rec.col19%>
<%= curlist1Rec.col20%>
<%= curlist1Rec.col21%>
<%= curlist1Rec.col22%>
<%= curlist1Rec.col23%>
<%= curlist1Rec.col24%>
<%= curlist1Rec.col25%>
<%= curlist1Rec.col26%>
<%= curlist1Rec.col27%>
<%= curlist1Rec.busn_dd_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 19:35:45 KST 2009 */