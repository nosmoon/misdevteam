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


package chosun.ciis.mt.knowhow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.rec.*;

/**
 * 
 */


public class MT_KNOWHOW_1003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_KNOWHOW_1003_LDataSet(){}
	public MT_KNOWHOW_1003_LDataSet(String errcode, String errmsg){
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
			MT_KNOWHOW_1003_LCURLIST1Record rec = new MT_KNOWHOW_1003_LCURLIST1Record();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.lcls = Util.checkString(rset0.getString("lcls"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.qust_answer = Util.checkString(rset0.getString("qust_answer"));
			rec.make_pers_emp_nm = Util.checkString(rset0.getString("make_pers_emp_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_KNOWHOW_1003_LCURLIST2Record rec = new MT_KNOWHOW_1003_LCURLIST2Record();
			rec.reg_dt = Util.checkString(rset1.getString("reg_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.make_pers_emp_nm = Util.checkString(rset1.getString("make_pers_emp_nm"));
			rec.qust_answer = Util.checkString(rset1.getString("qust_answer"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_KNOWHOW_1003_LDataSet ds = (MT_KNOWHOW_1003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_KNOWHOW_1003_LCURLIST1Record curlist1Rec = (MT_KNOWHOW_1003_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_KNOWHOW_1003_LCURLIST2Record curlist2Rec = (MT_KNOWHOW_1003_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.reg_dt%>
<%= curlist1Rec.lcls%>
<%= curlist1Rec.reg_seq%>
<%= curlist1Rec.qust_answer%>
<%= curlist1Rec.make_pers_emp_nm%>
<%= curlist2Rec.reg_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.make_pers_emp_nm%>
<%= curlist2Rec.qust_answer%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 16:29:15 KST 2009 */