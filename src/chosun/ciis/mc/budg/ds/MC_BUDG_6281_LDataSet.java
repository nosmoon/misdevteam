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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6281_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6281_LDataSet(){}
	public MC_BUDG_6281_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6281_LCURLIST1Record rec = new MC_BUDG_6281_LCURLIST1Record();
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.pcnt_amt = Util.checkString(rset0.getString("pcnt_amt"));
			rec.d_amt = Util.checkString(rset0.getString("d_amt"));
			rec.m_amt = Util.checkString(rset0.getString("m_amt"));
			rec.y_amt = Util.checkString(rset0.getString("y_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MC_BUDG_6281_LCURLIST2Record rec = new MC_BUDG_6281_LCURLIST2Record();
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.fee_1 = Util.checkString(rset1.getString("fee_1"));
			rec.fee_2 = Util.checkString(rset1.getString("fee_2"));
			rec.fee_3 = Util.checkString(rset1.getString("fee_3"));
			rec.fee_4 = Util.checkString(rset1.getString("fee_4"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MC_BUDG_6281_LCURLIST3Record rec = new MC_BUDG_6281_LCURLIST3Record();
			rec.float_cost = Util.checkString(rset2.getString("float_cost"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6281_LDataSet ds = (MC_BUDG_6281_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6281_LCURLIST1Record curlist1Rec = (MC_BUDG_6281_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6281_LCURLIST2Record curlist2Rec = (MC_BUDG_6281_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_6281_LCURLIST3Record curlist3Rec = (MC_BUDG_6281_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.pcnt%>
<%= curlist1Rec.pcnt_amt%>
<%= curlist1Rec.d_amt%>
<%= curlist1Rec.m_amt%>
<%= curlist1Rec.y_amt%>
<%= curlist2Rec.pcnt%>
<%= curlist2Rec.fee_1%>
<%= curlist2Rec.fee_2%>
<%= curlist2Rec.fee_3%>
<%= curlist2Rec.fee_4%>
<%= curlist3Rec.float_cost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 23 17:08:27 KST 2009 */