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


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_L_PROMSTAF_IS_EXCELDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_PROMSTAF_IS_EXCELDataSet(){}
	public SS_L_PROMSTAF_IS_EXCELDataSet(String errcode, String errmsg){
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
			SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord rec = new SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord();
			rec.jursareanm = Util.checkString(rset0.getString("jursareanm"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.stafclsfnm = Util.checkString(rset0.getString("stafclsfnm"));
			rec.kdcntrdt = Util.checkString(rset0.getString("kdcntrdt"));
			rec.kdexpdt = Util.checkString(rset0.getString("kdexpdt"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_PROMSTAF_IS_EXCELDataSet ds = (SS_L_PROMSTAF_IS_EXCELDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.jursareanm%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ptphno%>
<%= curcommlistRec.stafclsfnm%>
<%= curcommlistRec.kdcntrdt%>
<%= curcommlistRec.kdexpdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 19 15:59:47 KST 2016 */