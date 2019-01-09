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


public class MC_BUDG_2071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2071_LDataSet(){}
	public MC_BUDG_2071_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_2071_LCURLIST1Record rec = new MC_BUDG_2071_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cd_nm = Util.checkString(rset0.getString("dtls_medi_cd_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			MC_BUDG_2071_LCURLIST2Record rec = new MC_BUDG_2071_LCURLIST2Record();
			rec.budg_yy = Util.checkString(rset1.getString("budg_yy"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.work_no = Util.checkString(rset1.getString("work_no"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.use_dept_cd = Util.checkString(rset1.getString("use_dept_cd"));
			rec.abrv_nm = Util.checkString(rset1.getString("abrv_nm"));
			rec.budg_yymm01 = Util.checkString(rset1.getString("budg_yymm01"));
			rec.budg_yymm02 = Util.checkString(rset1.getString("budg_yymm02"));
			rec.budg_yymm03 = Util.checkString(rset1.getString("budg_yymm03"));
			rec.budg_yymm04 = Util.checkString(rset1.getString("budg_yymm04"));
			rec.budg_yymm05 = Util.checkString(rset1.getString("budg_yymm05"));
			rec.budg_yymm06 = Util.checkString(rset1.getString("budg_yymm06"));
			rec.budg_yymm07 = Util.checkString(rset1.getString("budg_yymm07"));
			rec.budg_yymm08 = Util.checkString(rset1.getString("budg_yymm08"));
			rec.budg_yymm09 = Util.checkString(rset1.getString("budg_yymm09"));
			rec.budg_yymm10 = Util.checkString(rset1.getString("budg_yymm10"));
			rec.budg_yymm11 = Util.checkString(rset1.getString("budg_yymm11"));
			rec.budg_yymm12 = Util.checkString(rset1.getString("budg_yymm12"));
			rec.req_amt_tot = Util.checkString(rset1.getString("req_amt_tot"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_2071_LDataSet ds = (MC_BUDG_2071_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_2071_LCURLIST1Record curlist1Rec = (MC_BUDG_2071_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_2071_LCURLIST2Record curlist2Rec = (MC_BUDG_2071_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.budg_yymm%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.work_no%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.medi_cd%>
<%= curlist2Rec.budg_yy%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.rmks%>
<%= curlist2Rec.work_no%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.use_dept_cd%>
<%= curlist2Rec.abrv_nm%>
<%= curlist2Rec.budg_yymm01%>
<%= curlist2Rec.budg_yymm02%>
<%= curlist2Rec.budg_yymm03%>
<%= curlist2Rec.budg_yymm04%>
<%= curlist2Rec.budg_yymm05%>
<%= curlist2Rec.budg_yymm06%>
<%= curlist2Rec.budg_yymm07%>
<%= curlist2Rec.budg_yymm08%>
<%= curlist2Rec.budg_yymm09%>
<%= curlist2Rec.budg_yymm10%>
<%= curlist2Rec.budg_yymm11%>
<%= curlist2Rec.budg_yymm12%>
<%= curlist2Rec.req_amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 17:38:54 KST 2009 */