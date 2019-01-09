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


public class MC_BUDG_2073_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2073_LDataSet(){}
	public MC_BUDG_2073_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_2073_LCURLIST1Record rec = new MC_BUDG_2073_LCURLIST1Record();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.bgn_dt = Util.checkString(rset0.getString("bgn_dt"));
			rec.last_dt = Util.checkString(rset0.getString("last_dt"));
			rec.supv_dept_cd = Util.checkString(rset0.getString("supv_dept_cd"));
			rec.supv_dept_nm = Util.checkString(rset0.getString("supv_dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_2073_LDataSet ds = (MC_BUDG_2073_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_2073_LCURLIST1Record curlist1Rec = (MC_BUDG_2073_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.evnt_cd%>
<%= curlist1Rec.evnt_nm%>
<%= curlist1Rec.bgn_dt%>
<%= curlist1Rec.last_dt%>
<%= curlist1Rec.supv_dept_cd%>
<%= curlist1Rec.supv_dept_nm%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 15:28:51 KST 2009 */