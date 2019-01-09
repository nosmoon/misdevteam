/***************************************************************************************************
* 파일명 : .java
* 기능 :  모금보고 - 일일보고현황
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 모금보고 - 일일보고현황
 */

public class TN_RPT_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1301_LDataSet(){}
	public TN_RPT_1301_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_RPT_1301_LCURLIST1Record rec = new TN_RPT_1301_LCURLIST1Record();
			rec.clos_clsf2 = Util.checkString(rset0.getString("clos_clsf2"));
			rec.clos_clsf2_nm = Util.checkString(rset0.getString("clos_clsf2_nm"));
			rec.clos_clsf3 = Util.checkString(rset0.getString("clos_clsf3"));
			rec.clos_clsf3_nm = Util.checkString(rset0.getString("clos_clsf3_nm"));
			rec.yes_cnt = Util.checkString(rset0.getString("yes_cnt"));
			rec.yes_amt = Util.checkString(rset0.getString("yes_amt"));
			rec.to_cnt = Util.checkString(rset0.getString("to_cnt"));
			rec.to_amt = Util.checkString(rset0.getString("to_amt"));
			rec.diff_cnt = Util.checkString(rset0.getString("diff_cnt"));
			rec.diff_amt = Util.checkString(rset0.getString("diff_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			TN_RPT_1301_LCURLIST2Record rec = new TN_RPT_1301_LCURLIST2Record();
			rec.clos_clsf2 = Util.checkString(rset1.getString("clos_clsf2"));
			rec.clos_clsf2_nm = Util.checkString(rset1.getString("clos_clsf2_nm"));
			rec.clos_clsf3 = Util.checkString(rset1.getString("clos_clsf3"));
			rec.clos_clsf3_nm = Util.checkString(rset1.getString("clos_clsf3_nm"));
			rec.yes_cnt = Util.checkString(rset1.getString("yes_cnt"));
			rec.yes_amt = Util.checkString(rset1.getString("yes_amt"));
			rec.to_cnt = Util.checkString(rset1.getString("to_cnt"));
			rec.to_amt = Util.checkString(rset1.getString("to_amt"));
			rec.diff_cnt = Util.checkString(rset1.getString("diff_cnt"));
			rec.diff_amt = Util.checkString(rset1.getString("diff_amt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			TN_RPT_1301_LCURLIST3Record rec = new TN_RPT_1301_LCURLIST3Record();
			rec.clos_clsf2 = Util.checkString(rset2.getString("clos_clsf2"));
			rec.clos_clsf2_nm = Util.checkString(rset2.getString("clos_clsf2_nm"));
			rec.clos_clsf3 = Util.checkString(rset2.getString("clos_clsf3"));
			rec.clos_clsf3_nm = Util.checkString(rset2.getString("clos_clsf3_nm"));
			rec.yes_cnt = Util.checkString(rset2.getString("yes_cnt"));
			rec.yes_amt = Util.checkString(rset2.getString("yes_amt"));
			rec.to_cnt = Util.checkString(rset2.getString("to_cnt"));
			rec.to_amt = Util.checkString(rset2.getString("to_amt"));
			rec.diff_cnt = Util.checkString(rset2.getString("diff_cnt"));
			rec.diff_amt = Util.checkString(rset2.getString("diff_amt"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1301_LDataSet ds = (TN_RPT_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_RPT_1301_LCURLIST1Record curlist1Rec = (TN_RPT_1301_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_RPT_1301_LCURLIST2Record curlist2Rec = (TN_RPT_1301_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		TN_RPT_1301_LCURLIST3Record curlist3Rec = (TN_RPT_1301_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.clos_clsf2%>
<%= curlist1Rec.clos_clsf2_nm%>
<%= curlist1Rec.clos_clsf3%>
<%= curlist1Rec.clos_clsf3_nm%>
<%= curlist1Rec.yes_cnt%>
<%= curlist1Rec.yes_amt%>
<%= curlist1Rec.to_cnt%>
<%= curlist1Rec.to_amt%>
<%= curlist1Rec.diff_cnt%>
<%= curlist1Rec.diff_amt%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.clos_clsf2%>
<%= curlist2Rec.clos_clsf2_nm%>
<%= curlist2Rec.clos_clsf3%>
<%= curlist2Rec.clos_clsf3_nm%>
<%= curlist2Rec.yes_cnt%>
<%= curlist2Rec.yes_amt%>
<%= curlist2Rec.to_cnt%>
<%= curlist2Rec.to_amt%>
<%= curlist2Rec.diff_cnt%>
<%= curlist2Rec.diff_amt%>
<%= curlist2Rec.remk%>
<%= curlist3Rec.clos_clsf2%>
<%= curlist3Rec.clos_clsf2_nm%>
<%= curlist3Rec.clos_clsf3%>
<%= curlist3Rec.clos_clsf3_nm%>
<%= curlist3Rec.yes_cnt%>
<%= curlist3Rec.yes_amt%>
<%= curlist3Rec.to_cnt%>
<%= curlist3Rec.to_amt%>
<%= curlist3Rec.diff_cnt%>
<%= curlist3Rec.diff_amt%>
<%= curlist3Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 21 11:20:46 KST 2016 */