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


package chosun.ciis.mc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_2072_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_CO_2072_LDataSet(){}
	public MC_CO_2072_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MC_CO_2072_LCURLIST1Record rec = new MC_CO_2072_LCURLIST1Record();
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_cdnm = Util.checkString(rset0.getString("use_dept_cdnm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.req_amt_tot = Util.checkString(rset0.getString("req_amt_tot"));
			rec.req_uprc = Util.checkString(rset0.getString("req_uprc"));
			rec.req_qunt_tot = Util.checkString(rset0.getString("req_qunt_tot"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_CO_2072_LDataSet ds = (MC_CO_2072_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_CO_2072_LCURLIST1Record curlist1Rec = (MC_CO_2072_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.work_no%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.budg_yymm%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.budg_cdnm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.use_dept_cd%>
<%= curlist1Rec.use_dept_cdnm%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.req_amt_tot%>
<%= curlist1Rec.req_uprc%>
<%= curlist1Rec.req_qunt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 09:05:55 KST 2009 */