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


public class MC_COST_3071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3071_LDataSet(){}
	public MC_COST_3071_LDataSet(String errcode, String errmsg){
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
			MC_COST_3071_LCURLISTRecord rec = new MC_COST_3071_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.gjbiyb = Util.checkString(rset0.getString("gjbiyb"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.dstb_dept_cd2 = Util.checkString(rset0.getString("dstb_dept_cd2"));
			rec.dstb_dept_nm2 = Util.checkString(rset0.getString("dstb_dept_nm2"));
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
			rec.bgsumamt = Util.checkString(rset0.getString("bgsumamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3071_LDataSet ds = (MC_COST_3071_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3071_LCURLISTRecord curlistRec = (MC_COST_3071_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.gjbiyb%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.dstb_dept_cd2%>
<%= curlistRec.dstb_dept_nm2%>
<%= curlistRec.bg11amt%>
<%= curlistRec.bg13amt%>
<%= curlistRec.bg19amt%>
<%= curlistRec.bg21amt%>
<%= curlistRec.bg22amt%>
<%= curlistRec.bg23amt%>
<%= curlistRec.bg24amt%>
<%= curlistRec.bg27amt%>
<%= curlistRec.bg31amt%>
<%= curlistRec.bg41amt%>
<%= curlistRec.bg42amt%>
<%= curlistRec.bg49amt%>
<%= curlistRec.bg61amt%>
<%= curlistRec.bg71amt%>
<%= curlistRec.bg81amt%>
<%= curlistRec.bg98amt%>
<%= curlistRec.bgsumamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 21 14:58:55 KST 2009 */