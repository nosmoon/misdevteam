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


public class SS_SLS_BRMGR_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2810_LDataSet(){}
	public SS_SLS_BRMGR_2810_LDataSet(String errcode, String errmsg){
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
			SS_SLS_BRMGR_2810_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_2810_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.avg_send_qty = Util.checkString(rset0.getString("avg_send_qty"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.auth_qty = Util.checkString(rset0.getString("auth_qty"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.oth_qty = Util.checkString(rset0.getString("oth_qty"));
			rec.hv_adj_qty = Util.checkString(rset0.getString("hv_adj_qty"));
			rec.mn_adj_qty = Util.checkString(rset0.getString("mn_adj_qty"));
			rec.stet_adj_qty = Util.checkString(rset0.getString("stet_adj_qty"));
			rec.lv_adj_qty = Util.checkString(rset0.getString("lv_adj_qty"));
			rec.area_adj_qty = Util.checkString(rset0.getString("area_adj_qty"));
			rec.adj_qty = Util.checkString(rset0.getString("adj_qty"));
			rec.adj_rate = Util.checkString(rset0.getString("adj_rate"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2810_LDataSet ds = (SS_SLS_BRMGR_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_2810_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_2810_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.dept_nm%>
<%= curcommlistRec.part_nm%>
<%= curcommlistRec.area_nm%>
<%= curcommlistRec.bo_nm%>
<%= curcommlistRec.bo_cd%>
<%= curcommlistRec.avg_send_qty%>
<%= curcommlistRec.rdr_qty%>
<%= curcommlistRec.auth_qty%>
<%= curcommlistRec.susp_qty%>
<%= curcommlistRec.oth_qty%>
<%= curcommlistRec.hv_adj_qty%>
<%= curcommlistRec.mn_adj_qty%>
<%= curcommlistRec.stet_adj_qty%>
<%= curcommlistRec.lv_adj_qty%>
<%= curcommlistRec.area_adj_qty%>
<%= curcommlistRec.adj_qty%>
<%= curcommlistRec.adj_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 06 15:24:41 KST 2017 */