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


public class FC_FUNC_1140_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList notetotz = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1140_LDataSet(){}
	public FC_FUNC_1140_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1140_LNOTETOTZRecord rec = new FC_FUNC_1140_LNOTETOTZRecord();
			rec.note_prvdd_bal = Util.checkString(rset0.getString("note_prvdd_bal"));
			rec.note_thdd_incr = Util.checkString(rset0.getString("note_thdd_incr"));
			rec.note_thdd_redu = Util.checkString(rset0.getString("note_thdd_redu"));
			rec.note_thdd_bal = Util.checkString(rset0.getString("note_thdd_bal"));
			rec.cmpy_prvdd_bal = Util.checkString(rset0.getString("cmpy_prvdd_bal"));
			rec.cmpy_thdd_incr = Util.checkString(rset0.getString("cmpy_thdd_incr"));
			rec.cmpy_thdd_redu = Util.checkString(rset0.getString("cmpy_thdd_redu"));
			rec.cmpy_thdd_bal = Util.checkString(rset0.getString("cmpy_thdd_bal"));
			rec.icty_prvdd_bal = Util.checkString(rset0.getString("icty_prvdd_bal"));
			rec.icty_thdd_incr = Util.checkString(rset0.getString("icty_thdd_incr"));
			rec.icty_thdd_redu = Util.checkString(rset0.getString("icty_thdd_redu"));
			rec.icty_thdd_bal = Util.checkString(rset0.getString("icty_thdd_bal"));
			rec.lcl_prvdd_bal = Util.checkString(rset0.getString("lcl_prvdd_bal"));
			rec.lcl_thdd_incr = Util.checkString(rset0.getString("lcl_thdd_incr"));
			rec.lcl_thdd_redu = Util.checkString(rset0.getString("lcl_thdd_redu"));
			rec.lcl_thdd_bal = Util.checkString(rset0.getString("lcl_thdd_bal"));
			rec.prvdd_bal6 = Util.checkString(rset0.getString("prvdd_bal6"));
			rec.thdd_incr6 = Util.checkString(rset0.getString("thdd_incr6"));
			rec.thdd_redu6 = Util.checkString(rset0.getString("thdd_redu6"));
			rec.thdd_bal6 = Util.checkString(rset0.getString("thdd_bal6"));
			rec.prvdd_bal7 = Util.checkString(rset0.getString("prvdd_bal7"));
			rec.thdd_incr7 = Util.checkString(rset0.getString("thdd_incr7"));
			rec.thdd_redu7 = Util.checkString(rset0.getString("thdd_redu7"));
			rec.thdd_bal7 = Util.checkString(rset0.getString("thdd_bal7"));
			rec.bank_prvdd_bal = Util.checkString(rset0.getString("bank_prvdd_bal"));
			rec.bank_thdd_incr = Util.checkString(rset0.getString("bank_thdd_incr"));
			rec.bank_thdd_redu = Util.checkString(rset0.getString("bank_thdd_redu"));
			rec.bank_thdd_bal = Util.checkString(rset0.getString("bank_thdd_bal"));
			rec.clct_ask_prvdd_bal = Util.checkString(rset0.getString("clct_ask_prvdd_bal"));
			rec.clct_ask_thdd_incr = Util.checkString(rset0.getString("clct_ask_thdd_incr"));
			rec.clct_ask_thdd_redu = Util.checkString(rset0.getString("clct_ask_thdd_redu"));
			rec.clct_ask_thdd_bal = Util.checkString(rset0.getString("clct_ask_thdd_bal"));
			rec.dscn_ask_prvdd_bal = Util.checkString(rset0.getString("dscn_ask_prvdd_bal"));
			rec.dscn_ask_thdd_incr = Util.checkString(rset0.getString("dscn_ask_thdd_incr"));
			rec.dscn_ask_thdd_redu = Util.checkString(rset0.getString("dscn_ask_thdd_redu"));
			rec.dscn_ask_thdd_bal = Util.checkString(rset0.getString("dscn_ask_thdd_bal"));
			rec.dscn_note_prvdd_bal = Util.checkString(rset0.getString("dscn_note_prvdd_bal"));
			rec.dscn_note_thdd_incr = Util.checkString(rset0.getString("dscn_note_thdd_incr"));
			rec.dscn_note_thdd_redu = Util.checkString(rset0.getString("dscn_note_thdd_redu"));
			rec.dscn_note_thdd_bal = Util.checkString(rset0.getString("dscn_note_thdd_bal"));
			rec.endr_note_prvdd_bal = Util.checkString(rset0.getString("endr_note_prvdd_bal"));
			rec.endr_note_thdd_incr = Util.checkString(rset0.getString("endr_note_thdd_incr"));
			rec.endr_note_thdd_redu = Util.checkString(rset0.getString("endr_note_thdd_redu"));
			rec.endr_note_thdd_bal = Util.checkString(rset0.getString("endr_note_thdd_bal"));
			rec.elseprvdd_bal = Util.checkString(rset0.getString("elseprvdd_bal"));
			rec.elsethdd_incr = Util.checkString(rset0.getString("elsethdd_incr"));
			rec.elsethdd_redu = Util.checkString(rset0.getString("elsethdd_redu"));
			rec.elsethdd_bal = Util.checkString(rset0.getString("elsethdd_bal"));
			this.notetotz.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1140_LDataSet ds = (FC_FUNC_1140_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.notetotz.size(); i++){
		FC_FUNC_1140_LNOTETOTZRecord notetotzRec = (FC_FUNC_1140_LNOTETOTZRecord)ds.notetotz.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNotetotz()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= notetotzRec.note_prvdd_bal%>
<%= notetotzRec.note_thdd_incr%>
<%= notetotzRec.note_thdd_redu%>
<%= notetotzRec.note_thdd_bal%>
<%= notetotzRec.cmpy_prvdd_bal%>
<%= notetotzRec.cmpy_thdd_incr%>
<%= notetotzRec.cmpy_thdd_redu%>
<%= notetotzRec.cmpy_thdd_bal%>
<%= notetotzRec.icty_prvdd_bal%>
<%= notetotzRec.icty_thdd_incr%>
<%= notetotzRec.icty_thdd_redu%>
<%= notetotzRec.icty_thdd_bal%>
<%= notetotzRec.lcl_prvdd_bal%>
<%= notetotzRec.lcl_thdd_incr%>
<%= notetotzRec.lcl_thdd_redu%>
<%= notetotzRec.lcl_thdd_bal%>
<%= notetotzRec.prvdd_bal6%>
<%= notetotzRec.thdd_incr6%>
<%= notetotzRec.thdd_redu6%>
<%= notetotzRec.thdd_bal6%>
<%= notetotzRec.prvdd_bal7%>
<%= notetotzRec.thdd_incr7%>
<%= notetotzRec.thdd_redu7%>
<%= notetotzRec.thdd_bal7%>
<%= notetotzRec.bank_prvdd_bal%>
<%= notetotzRec.bank_thdd_incr%>
<%= notetotzRec.bank_thdd_redu%>
<%= notetotzRec.bank_thdd_bal%>
<%= notetotzRec.clct_ask_prvdd_bal%>
<%= notetotzRec.clct_ask_thdd_incr%>
<%= notetotzRec.clct_ask_thdd_redu%>
<%= notetotzRec.clct_ask_thdd_bal%>
<%= notetotzRec.dscn_ask_prvdd_bal%>
<%= notetotzRec.dscn_ask_thdd_incr%>
<%= notetotzRec.dscn_ask_thdd_redu%>
<%= notetotzRec.dscn_ask_thdd_bal%>
<%= notetotzRec.dscn_note_prvdd_bal%>
<%= notetotzRec.dscn_note_thdd_incr%>
<%= notetotzRec.dscn_note_thdd_redu%>
<%= notetotzRec.dscn_note_thdd_bal%>
<%= notetotzRec.endr_note_prvdd_bal%>
<%= notetotzRec.endr_note_thdd_incr%>
<%= notetotzRec.endr_note_thdd_redu%>
<%= notetotzRec.endr_note_thdd_bal%>
<%= notetotzRec.elseprvdd_bal%>
<%= notetotzRec.elsethdd_incr%>
<%= notetotzRec.elsethdd_redu%>
<%= notetotzRec.elsethdd_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 21 13:19:32 KST 2009 */