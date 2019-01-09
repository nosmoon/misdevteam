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


public class MC_COST_1031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_1031_LDataSet(){}
	public MC_COST_1031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MC_COST_1031_LCURLISTRecord rec = new MC_COST_1031_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.dept_cdnm = Util.checkString(rset0.getString("dept_cdnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.excp_dstb_cd = Util.checkString(rset0.getString("excp_dstb_cd"));
			rec.excp_dstb_cdnm = Util.checkString(rset0.getString("excp_dstb_cdnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_1031_LDataSet ds = (MC_COST_1031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1031_LCURLISTRecord curlistRec = (MC_COST_1031_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.dept_cdnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.excp_dstb_cd%>
<%= curlistRec.excp_dstb_cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 09:51:09 KST 2009 */