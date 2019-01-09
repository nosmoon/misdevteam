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


public class MC_BUDG_6293_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6293_LDataSet(){}
	public MC_BUDG_6293_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6293_LCURLIST1Record rec = new MC_BUDG_6293_LCURLIST1Record();
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.pcnt_fee = Util.checkString(rset0.getString("pcnt_fee"));
			rec.d_fee = Util.checkString(rset0.getString("d_fee"));
			rec.m_fee = Util.checkString(rset0.getString("m_fee"));
			rec.y_fee = Util.checkString(rset0.getString("y_fee"));
			rec.pcnt1 = Util.checkString(rset0.getString("pcnt1"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MC_BUDG_6293_LCURLIST2Record rec = new MC_BUDG_6293_LCURLIST2Record();
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.pcnt_fee = Util.checkString(rset1.getString("pcnt_fee"));
			rec.d_fee = Util.checkString(rset1.getString("d_fee"));
			rec.m_fee = Util.checkString(rset1.getString("m_fee"));
			rec.y_fee = Util.checkString(rset1.getString("y_fee"));
			rec.pcnt1 = Util.checkString(rset1.getString("pcnt1"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MC_BUDG_6293_LCURLIST3Record rec = new MC_BUDG_6293_LCURLIST3Record();
			rec.aply_rate = Util.checkString(rset2.getString("aply_rate"));
			rec.fix_fee = Util.checkString(rset2.getString("fix_fee"));
			rec.iss_cnt = Util.checkString(rset2.getString("iss_cnt"));
			rec.iss_cnt1 = Util.checkString(rset2.getString("iss_cnt1"));
			rec.chg_cost = Util.checkString(rset2.getString("chg_cost"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6293_LDataSet ds = (MC_BUDG_6293_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6293_LCURLIST1Record curlist1Rec = (MC_BUDG_6293_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6293_LCURLIST2Record curlist2Rec = (MC_BUDG_6293_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_6293_LCURLIST3Record curlist3Rec = (MC_BUDG_6293_LCURLIST3Record)ds.curlist3.get(i);%>
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
<%= curlist1Rec.pcnt_fee%>
<%= curlist1Rec.d_fee%>
<%= curlist1Rec.m_fee%>
<%= curlist1Rec.y_fee%>
<%= curlist1Rec.pcnt1%>
<%= curlist2Rec.pcnt%>
<%= curlist2Rec.pcnt_fee%>
<%= curlist2Rec.d_fee%>
<%= curlist2Rec.m_fee%>
<%= curlist2Rec.y_fee%>
<%= curlist2Rec.pcnt1%>
<%= curlist3Rec.aply_rate%>
<%= curlist3Rec.fix_fee%>
<%= curlist3Rec.iss_cnt%>
<%= curlist3Rec.iss_cnt1%>
<%= curlist3Rec.chg_cost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 16:19:04 KST 2009 */