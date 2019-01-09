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


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1701_LDataSet(){}
	public TN_RPT_1701_LDataSet(String errcode, String errmsg){
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
			TN_RPT_1701_LCURLIST1Record rec = new TN_RPT_1701_LCURLIST1Record();
			rec.fundidx = Util.checkString(rset0.getString("fundidx"));
			rec.fund_nm = Util.checkString(rset0.getString("fund_nm"));
			rec.paymethodcode = Util.checkString(rset0.getString("paymethodcode"));
			rec.paymethod_nm = Util.checkString(rset0.getString("paymethod_nm"));
			rec.mp0 = Util.checkString(rset0.getString("mp0"));
			rec.mp1 = Util.checkString(rset0.getString("mp1"));
			rec.mp2 = Util.checkString(rset0.getString("mp2"));
			rec.mp3 = Util.checkString(rset0.getString("mp3"));
			rec.mp4 = Util.checkString(rset0.getString("mp4"));
			rec.mp5 = Util.checkString(rset0.getString("mp5"));
			rec.mp6 = Util.checkString(rset0.getString("mp6"));
			rec.mp7 = Util.checkString(rset0.getString("mp7"));
			rec.mp8 = Util.checkString(rset0.getString("mp8"));
			rec.mp9 = Util.checkString(rset0.getString("mp9"));
			rec.mp10 = Util.checkString(rset0.getString("mp10"));
			rec.mp11 = Util.checkString(rset0.getString("mp11"));
			rec.mp12 = Util.checkString(rset0.getString("mp12"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1701_LDataSet ds = (TN_RPT_1701_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_RPT_1701_LCURLIST1Record curlist1Rec = (TN_RPT_1701_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.fundidx%>
<%= curlist1Rec.fund_nm%>
<%= curlist1Rec.paymethodcode%>
<%= curlist1Rec.paymethod_nm%>
<%= curlist1Rec.mp0%>
<%= curlist1Rec.mp1%>
<%= curlist1Rec.mp2%>
<%= curlist1Rec.mp3%>
<%= curlist1Rec.mp4%>
<%= curlist1Rec.mp5%>
<%= curlist1Rec.mp6%>
<%= curlist1Rec.mp7%>
<%= curlist1Rec.mp8%>
<%= curlist1Rec.mp9%>
<%= curlist1Rec.mp10%>
<%= curlist1Rec.mp11%>
<%= curlist1Rec.mp12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 01 16:58:31 KST 2016 */