

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


public class HD_INSR_1302_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_INSR_1302_LDataSet(){}
	public HD_INSR_1302_LDataSet(String errcode, String errmsg, String msg){
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
			HD_INSR_1302_LCURLISTRecord rec = new HD_INSR_1302_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.calc1_hlth_fee = Util.checkString(rset0.getString("calc1_hlth_fee"));
			rec.calc1_hlth_med_care_insr_fee = Util.checkString(rset0.getString("calc1_hlth_med_care_insr_fee"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_INSR_1302_LCURLIST1Record rec = new HD_INSR_1302_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.hlth_insr_fee = Util.checkString(rset1.getString("hlth_insr_fee"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset1.getString("hlth_insr_med_care_insr_fee"));
			rec.calc1_hlth_fee = Util.checkString(rset1.getString("calc1_hlth_fee"));
			rec.calc1_hlth_med_care_insr_fee = Util.checkString(rset1.getString("calc1_hlth_med_care_insr_fee"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_INSR_1302_LCURLIST2Record rec = new HD_INSR_1302_LCURLIST2Record();
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.hlth_insr_fee = Util.checkString(rset2.getString("hlth_insr_fee"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1302_LDataSet ds = (HD_INSR_1302_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1302_LCURLISTRecord curlistRec = (HD_INSR_1302_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INSR_1302_LCURLIST1Record curlist1Rec = (HD_INSR_1302_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INSR_1302_LCURLIST2Record curlist2Rec = (HD_INSR_1302_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.calc1_hlth_fee%>
<%= curlistRec.calc1_hlth_med_care_insr_fee%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.hlth_insr_fee%>
<%= curlist1Rec.hlth_insr_med_care_insr_fee%>
<%= curlist1Rec.calc1_hlth_fee%>
<%= curlist1Rec.calc1_hlth_med_care_insr_fee%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.hlth_insr_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 09 13:42:02 KST 2010 */