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


public class MC_BUDG_6046_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6046_LDataSet(){}
	public MC_BUDG_6046_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6046_LCURLIST1Record rec = new MC_BUDG_6046_LCURLIST1Record();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.sub_cd = Util.checkString(rset0.getString("sub_cd"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MC_BUDG_6046_LCURLIST2Record rec = new MC_BUDG_6046_LCURLIST2Record();
			rec.chk = Util.checkString(rset1.getString("chk"));
			rec.yymm = Util.checkString(rset1.getString("yymm"));
			rec.sub_cd = Util.checkString(rset1.getString("sub_cd"));
			rec.clos_yn = Util.checkString(rset1.getString("clos_yn"));
			rec.incmg_dt_tm = Util.checkString(rset1.getString("incmg_dt_tm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6046_LDataSet ds = (MC_BUDG_6046_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6046_LCURLIST1Record curlist1Rec = (MC_BUDG_6046_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6046_LCURLIST2Record curlist2Rec = (MC_BUDG_6046_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.chk%>
<%= curlist1Rec.yymm%>
<%= curlist1Rec.sub_cd%>
<%= curlist1Rec.clos_yn%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist2Rec.chk%>
<%= curlist2Rec.yymm%>
<%= curlist2Rec.sub_cd%>
<%= curlist2Rec.clos_yn%>
<%= curlist2Rec.incmg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 15:01:53 KST 2009 */