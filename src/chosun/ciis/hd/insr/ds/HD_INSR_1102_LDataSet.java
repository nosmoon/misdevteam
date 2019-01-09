

package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_INSR_1102_LDataSet(){}
	public HD_INSR_1102_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_INSR_1102_LCURLISTRecord rec = new HD_INSR_1102_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.slf_burd_amt = Util.checkString(rset0.getString("slf_burd_amt"));
			rec.cmpy_burd_amt = Util.checkString(rset0.getString("cmpy_burd_amt"));
			rec.np_slf_ctrb_amt = Util.checkString(rset0.getString("np_slf_ctrb_amt"));
			rec.np_cmpy_burd_amt = Util.checkString(rset0.getString("np_cmpy_burd_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_INSR_1102_LCURLIST1Record rec = new HD_INSR_1102_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.slf_burd_amt = Util.checkString(rset1.getString("slf_burd_amt"));
			rec.cmpy_burd_amt = Util.checkString(rset1.getString("cmpy_burd_amt"));
			rec.np_slf_ctrb_amt = Util.checkString(rset1.getString("np_slf_ctrb_amt"));
			rec.np_cmpy_burd_amt = Util.checkString(rset1.getString("np_cmpy_burd_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_INSR_1102_LCURLIST2Record rec = new HD_INSR_1102_LCURLIST2Record();
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.np_slf_ctrb_amt = Util.checkString(rset2.getString("np_slf_ctrb_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1102_LDataSet ds = (HD_INSR_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1102_LCURLISTRecord curlistRec = (HD_INSR_1102_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INSR_1102_LCURLIST1Record curlist1Rec = (HD_INSR_1102_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INSR_1102_LCURLIST2Record curlist2Rec = (HD_INSR_1102_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.emp_no%>
<%= curlistRec.slf_burd_amt%>
<%= curlistRec.cmpy_burd_amt%>
<%= curlistRec.np_slf_ctrb_amt%>
<%= curlistRec.np_cmpy_burd_amt%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.slf_burd_amt%>
<%= curlist1Rec.cmpy_burd_amt%>
<%= curlist1Rec.np_slf_ctrb_amt%>
<%= curlist1Rec.np_cmpy_burd_amt%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.np_slf_ctrb_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 05 15:57:25 KST 2010 */