/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2310_LDataSet(){}
	public SS_SLS_BRMGR_2310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_SLS_BRMGR_2310_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_2310_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.clsfnm = Util.checkString(rset0.getString("clsfnm"));
			rec.rate_a_min = Util.checkString(rset0.getString("rate_a_min"));
			rec.rate_a_max = Util.checkString(rset0.getString("rate_a_max"));
			rec.rate_a_point = Util.checkString(rset0.getString("rate_a_point"));
			rec.rate_b_min = Util.checkString(rset0.getString("rate_b_min"));
			rec.rate_b_max = Util.checkString(rset0.getString("rate_b_max"));
			rec.rate_b_point = Util.checkString(rset0.getString("rate_b_point"));
			rec.rate_c_min = Util.checkString(rset0.getString("rate_c_min"));
			rec.rate_c_max = Util.checkString(rset0.getString("rate_c_max"));
			rec.rate_c_point = Util.checkString(rset0.getString("rate_c_point"));
			rec.rate_d_min = Util.checkString(rset0.getString("rate_d_min"));
			rec.rate_d_max = Util.checkString(rset0.getString("rate_d_max"));
			rec.rate_d_point = Util.checkString(rset0.getString("rate_d_point"));
			rec.add_point = Util.checkString(rset0.getString("add_point"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2310_LDataSet ds = (SS_SLS_BRMGR_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_2310_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_2310_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.clsfnm%>
<%= curcommlistRec.rate_a_min%>
<%= curcommlistRec.rate_a_max%>
<%= curcommlistRec.rate_a_point%>
<%= curcommlistRec.rate_b_min%>
<%= curcommlistRec.rate_b_max%>
<%= curcommlistRec.rate_b_point%>
<%= curcommlistRec.rate_c_min%>
<%= curcommlistRec.rate_c_max%>
<%= curcommlistRec.rate_c_point%>
<%= curcommlistRec.rate_d_min%>
<%= curcommlistRec.rate_d_max%>
<%= curcommlistRec.rate_d_point%>
<%= curcommlistRec.add_point%>
<%= curcommlistRec.closyn%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 10 10:20:34 KST 2016 */