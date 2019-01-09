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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3181_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3181_LDataSet(){}
	public MC_COST_3181_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			MC_COST_3181_LCURLIST1Record rec = new MC_COST_3181_LCURLIST1Record();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.bgysnm = Util.checkString(rset0.getString("bgysnm"));
			rec.dstb_dept_cd2 = Util.checkString(rset0.getString("dstb_dept_cd2"));
			rec.bg2stbsnm = Util.checkString(rset0.getString("bg2stbsnm"));
			rec.bgsumamt = Util.checkString(rset0.getString("bgsumamt"));
			rec.bg11amt = Util.checkString(rset0.getString("bg11amt"));
			rec.bg13amt = Util.checkString(rset0.getString("bg13amt"));
			rec.bg19amt = Util.checkString(rset0.getString("bg19amt"));
			rec.bg21amt = Util.checkString(rset0.getString("bg21amt"));
			rec.bg22amt = Util.checkString(rset0.getString("bg22amt"));
			rec.bg23amt = Util.checkString(rset0.getString("bg23amt"));
			rec.bg24amt = Util.checkString(rset0.getString("bg24amt"));
			rec.bg27amt = Util.checkString(rset0.getString("bg27amt"));
			rec.bg31amt = Util.checkString(rset0.getString("bg31amt"));
			rec.bg41amt = Util.checkString(rset0.getString("bg41amt"));
			rec.bg42amt = Util.checkString(rset0.getString("bg42amt"));
			rec.bg49amt = Util.checkString(rset0.getString("bg49amt"));
			rec.bg61amt = Util.checkString(rset0.getString("bg61amt"));
			rec.bg71amt = Util.checkString(rset0.getString("bg71amt"));
			rec.bg81amt = Util.checkString(rset0.getString("bg81amt"));
			rec.bg98amt = Util.checkString(rset0.getString("bg98amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			MC_COST_3181_LCURLIST2Record rec = new MC_COST_3181_LCURLIST2Record();
			rec.yymm = Util.checkString(rset1.getString("yymm"));
			rec.gjbiyb = Util.checkString(rset1.getString("gjbiyb"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.bgysnm = Util.checkString(rset1.getString("bgysnm"));
			rec.dstb_dept_cd2 = Util.checkString(rset1.getString("dstb_dept_cd2"));
			rec.bg2stbsnm = Util.checkString(rset1.getString("bg2stbsnm"));
			rec.bgsumamt = Util.checkString(rset1.getString("bgsumamt"));
			rec.bg11amt = Util.checkString(rset1.getString("bg11amt"));
			rec.bg13amt = Util.checkString(rset1.getString("bg13amt"));
			rec.bg19amt = Util.checkString(rset1.getString("bg19amt"));
			rec.bg21amt = Util.checkString(rset1.getString("bg21amt"));
			rec.bg22amt = Util.checkString(rset1.getString("bg22amt"));
			rec.bg23amt = Util.checkString(rset1.getString("bg23amt"));
			rec.bg24amt = Util.checkString(rset1.getString("bg24amt"));
			rec.bg27amt = Util.checkString(rset1.getString("bg27amt"));
			rec.bg31amt = Util.checkString(rset1.getString("bg31amt"));
			rec.bg41amt = Util.checkString(rset1.getString("bg41amt"));
			rec.bg42amt = Util.checkString(rset1.getString("bg42amt"));
			rec.bg49amt = Util.checkString(rset1.getString("bg49amt"));
			rec.bg61amt = Util.checkString(rset1.getString("bg61amt"));
			rec.bg71amt = Util.checkString(rset1.getString("bg71amt"));
			rec.bg81amt = Util.checkString(rset1.getString("bg81amt"));
			rec.bg98amt = Util.checkString(rset1.getString("bg98amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			MC_COST_3181_LCURLIST3Record rec = new MC_COST_3181_LCURLIST3Record();
			rec.yymm = Util.checkString(rset2.getString("yymm"));
			rec.bbgbcd = Util.checkString(rset2.getString("bbgbcd"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.bgysnm = Util.checkString(rset2.getString("bgysnm"));
			rec.dstb_dept_cd2 = Util.checkString(rset2.getString("dstb_dept_cd2"));
			rec.bg2stbsnm = Util.checkString(rset2.getString("bg2stbsnm"));
			rec.bgsumamt = Util.checkString(rset2.getString("bgsumamt"));
			rec.bg11amt = Util.checkString(rset2.getString("bg11amt"));
			rec.bg13amt = Util.checkString(rset2.getString("bg13amt"));
			rec.bg19amt = Util.checkString(rset2.getString("bg19amt"));
			rec.bg21amt = Util.checkString(rset2.getString("bg21amt"));
			rec.bg22amt = Util.checkString(rset2.getString("bg22amt"));
			rec.bg23amt = Util.checkString(rset2.getString("bg23amt"));
			rec.bg24amt = Util.checkString(rset2.getString("bg24amt"));
			rec.bg27amt = Util.checkString(rset2.getString("bg27amt"));
			rec.bg31amt = Util.checkString(rset2.getString("bg31amt"));
			rec.bg41amt = Util.checkString(rset2.getString("bg41amt"));
			rec.bg42amt = Util.checkString(rset2.getString("bg42amt"));
			rec.bg49amt = Util.checkString(rset2.getString("bg49amt"));
			rec.bg61amt = Util.checkString(rset2.getString("bg61amt"));
			rec.bg71amt = Util.checkString(rset2.getString("bg71amt"));
			rec.bg81amt = Util.checkString(rset2.getString("bg81amt"));
			rec.bg98amt = Util.checkString(rset2.getString("bg98amt"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3181_LDataSet ds = (MC_COST_3181_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_COST_3181_LCURLIST1Record curlist1Rec = (MC_COST_3181_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_COST_3181_LCURLIST2Record curlist2Rec = (MC_COST_3181_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_COST_3181_LCURLIST3Record curlist3Rec = (MC_COST_3181_LCURLIST3Record)ds.curlist3.get(i);%>
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
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.bgysnm%>
<%= curlist1Rec.dstb_dept_cd2%>
<%= curlist1Rec.bg2stbsnm%>
<%= curlist1Rec.bgsumamt%>
<%= curlist1Rec.bg11amt%>
<%= curlist1Rec.bg13amt%>
<%= curlist1Rec.bg19amt%>
<%= curlist1Rec.bg21amt%>
<%= curlist1Rec.bg22amt%>
<%= curlist1Rec.bg23amt%>
<%= curlist1Rec.bg24amt%>
<%= curlist1Rec.bg27amt%>
<%= curlist1Rec.bg31amt%>
<%= curlist1Rec.bg41amt%>
<%= curlist1Rec.bg42amt%>
<%= curlist1Rec.bg49amt%>
<%= curlist1Rec.bg61amt%>
<%= curlist1Rec.bg71amt%>
<%= curlist1Rec.bg81amt%>
<%= curlist1Rec.bg98amt%>
<%= curlist2Rec.yymm%>
<%= curlist2Rec.gjbiyb%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.bgysnm%>
<%= curlist2Rec.dstb_dept_cd2%>
<%= curlist2Rec.bg2stbsnm%>
<%= curlist2Rec.bgsumamt%>
<%= curlist2Rec.bg11amt%>
<%= curlist2Rec.bg13amt%>
<%= curlist2Rec.bg19amt%>
<%= curlist2Rec.bg21amt%>
<%= curlist2Rec.bg22amt%>
<%= curlist2Rec.bg23amt%>
<%= curlist2Rec.bg24amt%>
<%= curlist2Rec.bg27amt%>
<%= curlist2Rec.bg31amt%>
<%= curlist2Rec.bg41amt%>
<%= curlist2Rec.bg42amt%>
<%= curlist2Rec.bg49amt%>
<%= curlist2Rec.bg61amt%>
<%= curlist2Rec.bg71amt%>
<%= curlist2Rec.bg81amt%>
<%= curlist2Rec.bg98amt%>
<%= curlist3Rec.yymm%>
<%= curlist3Rec.bbgbcd%>
<%= curlist3Rec.budg_cd%>
<%= curlist3Rec.bgysnm%>
<%= curlist3Rec.dstb_dept_cd2%>
<%= curlist3Rec.bg2stbsnm%>
<%= curlist3Rec.bgsumamt%>
<%= curlist3Rec.bg11amt%>
<%= curlist3Rec.bg13amt%>
<%= curlist3Rec.bg19amt%>
<%= curlist3Rec.bg21amt%>
<%= curlist3Rec.bg22amt%>
<%= curlist3Rec.bg23amt%>
<%= curlist3Rec.bg24amt%>
<%= curlist3Rec.bg27amt%>
<%= curlist3Rec.bg31amt%>
<%= curlist3Rec.bg41amt%>
<%= curlist3Rec.bg42amt%>
<%= curlist3Rec.bg49amt%>
<%= curlist3Rec.bg61amt%>
<%= curlist3Rec.bg71amt%>
<%= curlist3Rec.bg81amt%>
<%= curlist3Rec.bg98amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 17:25:20 KST 2009 */