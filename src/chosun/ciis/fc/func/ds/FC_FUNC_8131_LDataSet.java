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


public class FC_FUNC_8131_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8131_LDataSet(){}
	public FC_FUNC_8131_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_8131_LCURLIST1Record rec = new FC_FUNC_8131_LCURLIST1Record();
			rec.pymt_plan_dt = Util.checkString(rset0.getString("pymt_plan_dt"));
			rec.pymt_plan_prcp_bal = Util.checkString(rset0.getString("pymt_plan_prcp_bal"));
			rec.pymt_plan_prcp = Util.checkString(rset0.getString("pymt_plan_prcp"));
			rec.pymt_plan_int = Util.checkString(rset0.getString("pymt_plan_int"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_8131_LCURLIST2Record rec = new FC_FUNC_8131_LCURLIST2Record();
			rec.pymt_plan_dt = Util.checkString(rset1.getString("pymt_plan_dt"));
			rec.pymt_plan_prcp_bal = Util.checkString(rset1.getString("pymt_plan_prcp_bal"));
			rec.pymt_plan_prcp = Util.checkString(rset1.getString("pymt_plan_prcp"));
			rec.pymt_plan_int = Util.checkString(rset1.getString("pymt_plan_int"));
			rec.bal = Util.checkString(rset1.getString("bal"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_8131_LCURLIST3Record rec = new FC_FUNC_8131_LCURLIST3Record();
			rec.dt = Util.checkString(rset2.getString("dt"));
			rec.memo_cont = Util.checkString(rset2.getString("memo_cont"));
			rec.memo_seq = Util.checkString(rset2.getString("memo_seq"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8131_LDataSet ds = (FC_FUNC_8131_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8131_LCURLIST1Record curlist1Rec = (FC_FUNC_8131_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_8131_LCURLIST2Record curlist2Rec = (FC_FUNC_8131_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_FUNC_8131_LCURLIST3Record curlist3Rec = (FC_FUNC_8131_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.pymt_plan_dt%>
<%= curlist1Rec.pymt_plan_prcp_bal%>
<%= curlist1Rec.pymt_plan_prcp%>
<%= curlist1Rec.pymt_plan_int%>
<%= curlist1Rec.bal%>
<%= curlist1Rec.slip_no%>
<%= curlist2Rec.pymt_plan_dt%>
<%= curlist2Rec.pymt_plan_prcp_bal%>
<%= curlist2Rec.pymt_plan_prcp%>
<%= curlist2Rec.pymt_plan_int%>
<%= curlist2Rec.bal%>
<%= curlist2Rec.slip_no%>
<%= curlist3Rec.dt%>
<%= curlist3Rec.memo_cont%>
<%= curlist3Rec.memo_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 13:44:11 KST 2009 */