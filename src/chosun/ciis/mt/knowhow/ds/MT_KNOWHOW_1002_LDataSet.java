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


public class MT_KNOWHOW_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_KNOWHOW_1002_LDataSet(){}
	public MT_KNOWHOW_1002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MT_KNOWHOW_1002_LCURLISTRecord rec = new MT_KNOWHOW_1002_LCURLISTRecord();
			rec.question = Util.checkString(rset0.getString("question"));
			rec.answer = Util.checkString(rset0.getString("answer"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.qust_emp_nm = Util.checkString(rset0.getString("qust_emp_nm"));
			rec.ans_emp_nm = Util.checkString(rset0.getString("ans_emp_nm"));
			rec.lcls = Util.checkString(rset0.getString("lcls"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.qna = Util.checkString(rset0.getString("qna"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_KNOWHOW_1002_LDataSet ds = (MT_KNOWHOW_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_KNOWHOW_1002_LCURLISTRecord curlistRec = (MT_KNOWHOW_1002_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.question%>
<%= curlistRec.answer%>
<%= curlistRec.reg_dt%>
<%= curlistRec.qust_emp_nm%>
<%= curlistRec.ans_emp_nm%>
<%= curlistRec.lcls%>
<%= curlistRec.reg_seq%>
<%= curlistRec.qna%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 13:20:24 KST 2009 */