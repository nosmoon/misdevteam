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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1440_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1440_LDataSet(){}
	public IS_BUS_1440_LDataSet(String errcode, String errmsg){
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
			IS_BUS_1440_LCURLIST_ARecord rec = new IS_BUS_1440_LCURLIST_ARecord();
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dw_amt_1 = Util.checkString(rset0.getString("dw_amt_1"));
			rec.jw_amt_1 = Util.checkString(rset0.getString("jw_amt_1"));
			rec.w_amt_1_rate = Util.checkString(rset0.getString("w_amt_1_rate"));
			rec.dm_amt_1 = Util.checkString(rset0.getString("dm_amt_1"));
			rec.jm_amt_1 = Util.checkString(rset0.getString("jm_amt_1"));
			rec.m_amt_1_rate = Util.checkString(rset0.getString("m_amt_1_rate"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1440_LDataSet ds = (IS_BUS_1440_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1440_LCURLIST_ARecord curlist_aRec = (IS_BUS_1440_LCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_a()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.dept_cd_nm%>
<%= curlist_aRec.dw_amt_1%>
<%= curlist_aRec.jw_amt_1%>
<%= curlist_aRec.w_amt_1_rate%>
<%= curlist_aRec.dm_amt_1%>
<%= curlist_aRec.jm_amt_1%>
<%= curlist_aRec.m_amt_1_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 18 11:36:23 KST 2012 */