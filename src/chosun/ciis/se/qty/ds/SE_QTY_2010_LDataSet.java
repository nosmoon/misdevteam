/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2010_LDataSet(){}
	public SE_QTY_2010_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_QTY_2010_LCURLISTRecord rec = new SE_QTY_2010_LCURLISTRecord();
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.prvdt_qty = rset0.getInt("prvdt_qty");
			rec.curdt_qty = rset0.getInt("curdt_qty");
			rec.diff_qty = rset0.getInt("diff_qty");
			rec.gnr_qty = rset0.getInt("gnr_qty");
			rec.spsl_qty = rset0.getInt("spsl_qty");
			rec.qty_tot = rset0.getInt("qty_tot");
			rec.gnr_addm_qty = rset0.getInt("gnr_addm_qty");
			rec.spsl_addm_qty = rset0.getInt("spsl_addm_qty");
			rec.addm_qty_tot = rset0.getInt("addm_qty_tot");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2010_LDataSet ds = (SE_QTY_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2010_LCURLISTRecord curlistRec = (SE_QTY_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.team_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.prvdt_qty%>
<%= curlistRec.curdt_qty%>
<%= curlistRec.diff_qty%>
<%= curlistRec.gnr_qty%>
<%= curlistRec.spsl_qty%>
<%= curlistRec.qty_tot%>
<%= curlistRec.gnr_addm_qty%>
<%= curlistRec.spsl_addm_qty%>
<%= curlistRec.addm_qty_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 17:23:25 KST 2009 */