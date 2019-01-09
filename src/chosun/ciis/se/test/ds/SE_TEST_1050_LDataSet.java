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


package chosun.ciis.se.test.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.test.dm.*;
import chosun.ciis.se.test.rec.*;

/**
 * 
 */


public class SE_TEST_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TEST_1050_LDataSet(){}
	public SE_TEST_1050_LDataSet(String errcode, String errmsg){
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
			SE_TEST_1050_LCURLIST1Record rec = new SE_TEST_1050_LCURLIST1Record();
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.mm = Util.checkString(rset0.getString("mm"));
			rec.week = Util.checkString(rset0.getString("week"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.erp_id = Util.checkString(rset0.getString("erp_id"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.workcd = Util.checkString(rset0.getString("workcd"));
			rec.vip_lastweek = Util.checkString(rset0.getString("vip_lastweek"));
			rec.lastweek = Util.checkString(rset0.getString("lastweek"));
			rec.thisweek = Util.checkString(rset0.getString("thisweek"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TEST_1050_LDataSet ds = (SE_TEST_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SE_TEST_1050_LCURLIST1Record curlist1Rec = (SE_TEST_1050_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.yy%>
<%= curlist1Rec.mm%>
<%= curlist1Rec.week%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.erp_id%>
<%= curlist1Rec.emp_nm%>
<%= curlist1Rec.cmpycd%>
<%= curlist1Rec.workcd%>
<%= curlist1Rec.vip_lastweek%>
<%= curlist1Rec.lastweek%>
<%= curlist1Rec.thisweek%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 27 10:24:36 KST 2013 */