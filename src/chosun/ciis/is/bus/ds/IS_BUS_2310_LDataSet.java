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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_2310_LDataSet(){}
	public IS_BUS_2310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			IS_BUS_2310_LCURLIST_1Record rec = new IS_BUS_2310_LCURLIST_1Record();
			rec.sido_nm = Util.checkString(rset0.getString("sido_nm"));
			rec.gu_nm = Util.checkString(rset0.getString("gu_nm"));
			rec.tot_bo_cnt = Util.checkString(rset0.getString("tot_bo_cnt"));
			rec.in_bo_cnt = Util.checkString(rset0.getString("in_bo_cnt"));
			rec.in_bo_rate = Util.checkString(rset0.getString("in_bo_rate"));
			rec.cnt_0 = Util.checkString(rset0.getString("cnt_0"));
			rec.cnt_1 = Util.checkString(rset0.getString("cnt_1"));
			rec.cnt_2 = Util.checkString(rset0.getString("cnt_2"));
			rec.cnt_3 = Util.checkString(rset0.getString("cnt_3"));
			rec.cnt_4 = Util.checkString(rset0.getString("cnt_4"));
			rec.cnt_t = Util.checkString(rset0.getString("cnt_t"));
			rec.per_2 = Util.checkString(rset0.getString("per_2"));
			rec.per_3 = Util.checkString(rset0.getString("per_3"));
			rec.per_4 = Util.checkString(rset0.getString("per_4"));
			rec.minus_2 = Util.checkString(rset0.getString("minus_2"));
			rec.minus_3 = Util.checkString(rset0.getString("minus_3"));
			rec.minus_4 = Util.checkString(rset0.getString("minus_4"));
			this.curlist_1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_2310_LDataSet ds = (IS_BUS_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		IS_BUS_2310_LCURLIST_1Record curlist_1Rec = (IS_BUS_2310_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_1Rec.sido_nm%>
<%= curlist_1Rec.gu_nm%>
<%= curlist_1Rec.tot_bo_cnt%>
<%= curlist_1Rec.in_bo_cnt%>
<%= curlist_1Rec.in_bo_rate%>
<%= curlist_1Rec.cnt_0%>
<%= curlist_1Rec.cnt_1%>
<%= curlist_1Rec.cnt_2%>
<%= curlist_1Rec.cnt_3%>
<%= curlist_1Rec.cnt_4%>
<%= curlist_1Rec.cnt_t%>
<%= curlist_1Rec.per_2%>
<%= curlist_1Rec.per_3%>
<%= curlist_1Rec.per_4%>
<%= curlist_1Rec.minus_2%>
<%= curlist_1Rec.minus_3%>
<%= curlist_1Rec.minus_4%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 20:06:04 KST 2012 */