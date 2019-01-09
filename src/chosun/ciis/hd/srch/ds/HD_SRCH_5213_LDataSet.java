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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5213_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tag1;

	public HD_SRCH_5213_LDataSet(){}
	public HD_SRCH_5213_LDataSet(String errcode, String errmsg, String tag1){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tag1 = tag1;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTag1(String tag1){
		this.tag1 = tag1;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTag1(){
		return this.tag1;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5213_LCURLIST1Record rec = new HD_SRCH_5213_LCURLIST1Record();
			rec.addm_dept_nm = Util.checkString(rset0.getString("addm_dept_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dspch_prd = Util.checkString(rset0.getString("dspch_prd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_SRCH_5213_LCURLIST2Record rec = new HD_SRCH_5213_LCURLIST2Record();
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.dspch_prd = Util.checkString(rset1.getString("dspch_prd"));
			this.curlist2.add(rec);
		}
		this.tag1 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5213_LDataSet ds = (HD_SRCH_5213_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5213_LCURLIST1Record curlist1Rec = (HD_SRCH_5213_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_SRCH_5213_LCURLIST2Record curlist2Rec = (HD_SRCH_5213_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getTag1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.addm_dept_nm%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.dspch_prd%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.posi_nm%>
<%= curlist2Rec.flnm%>
<%= curlist2Rec.dspch_prd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 18 13:37:19 KST 2018 */