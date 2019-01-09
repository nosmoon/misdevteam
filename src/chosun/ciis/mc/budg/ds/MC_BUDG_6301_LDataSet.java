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


public class MC_BUDG_6301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6301_LDataSet(){}
	public MC_BUDG_6301_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6301_LCURLIST1Record rec = new MC_BUDG_6301_LCURLIST1Record();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.mt1 = Util.checkString(rset0.getString("mt1"));
			rec.mt2 = Util.checkString(rset0.getString("mt2"));
			rec.mt3 = Util.checkString(rset0.getString("mt3"));
			rec.mt4 = Util.checkString(rset0.getString("mt4"));
			rec.mt5 = Util.checkString(rset0.getString("mt5"));
			rec.mt6 = Util.checkString(rset0.getString("mt6"));
			rec.mt7 = Util.checkString(rset0.getString("mt7"));
			rec.mt8 = Util.checkString(rset0.getString("mt8"));
			rec.mt9 = Util.checkString(rset0.getString("mt9"));
			rec.mt10 = Util.checkString(rset0.getString("mt10"));
			rec.mt11 = Util.checkString(rset0.getString("mt11"));
			rec.mt12 = Util.checkString(rset0.getString("mt12"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MC_BUDG_6301_LCURLIST2Record rec = new MC_BUDG_6301_LCURLIST2Record();
			rec.clos_mm = Util.checkString(rset1.getString("clos_mm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			MC_BUDG_6301_LCURLIST3Record rec = new MC_BUDG_6301_LCURLIST3Record();
			rec.su_cost_1 = Util.checkString(rset2.getString("su_cost_1"));
			rec.su_cost_2 = Util.checkString(rset2.getString("su_cost_2"));
			rec.su_cost_3 = Util.checkString(rset2.getString("su_cost_3"));
			rec.su_cost_4 = Util.checkString(rset2.getString("su_cost_4"));
			rec.j_cost_1 = Util.checkString(rset2.getString("j_cost_1"));
			rec.j_cost_2 = Util.checkString(rset2.getString("j_cost_2"));
			rec.j_cost_3 = Util.checkString(rset2.getString("j_cost_3"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6301_LDataSet ds = (MC_BUDG_6301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6301_LCURLIST1Record curlist1Rec = (MC_BUDG_6301_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6301_LCURLIST2Record curlist2Rec = (MC_BUDG_6301_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_6301_LCURLIST3Record curlist3Rec = (MC_BUDG_6301_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.yymm%>
<%= curlist1Rec.mt1%>
<%= curlist1Rec.mt2%>
<%= curlist1Rec.mt3%>
<%= curlist1Rec.mt4%>
<%= curlist1Rec.mt5%>
<%= curlist1Rec.mt6%>
<%= curlist1Rec.mt7%>
<%= curlist1Rec.mt8%>
<%= curlist1Rec.mt9%>
<%= curlist1Rec.mt10%>
<%= curlist1Rec.mt11%>
<%= curlist1Rec.mt12%>
<%= curlist2Rec.clos_mm%>
<%= curlist3Rec.su_cost_1%>
<%= curlist3Rec.su_cost_2%>
<%= curlist3Rec.su_cost_3%>
<%= curlist3Rec.su_cost_4%>
<%= curlist3Rec.j_cost_1%>
<%= curlist3Rec.j_cost_2%>
<%= curlist3Rec.j_cost_3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 13:40:29 KST 2009 */