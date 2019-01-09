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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmodlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5520_LDataSet(){}
	public SS_SLS_EXTN_5520_LDataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_5520_LCURMODLISTRecord rec = new SS_SLS_EXTN_5520_LCURMODLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.extnaloncd = Util.checkString(rset0.getString("extnaloncd"));
			rec.extnalonnm = Util.checkString(rset0.getString("extnalonnm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curmodlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5520_LDataSet ds = (SS_SLS_EXTN_5520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmodlist.size(); i++){
		SS_SLS_EXTN_5520_LCURMODLISTRecord curmodlistRec = (SS_SLS_EXTN_5520_LCURMODLISTRecord)ds.curmodlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmodlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmodlistRec.deptnm%>
<%= curmodlistRec.partnm%>
<%= curmodlistRec.areanm%>
<%= curmodlistRec.bonm%>
<%= curmodlistRec.bocd%>
<%= curmodlistRec.extnaloncd%>
<%= curmodlistRec.extnalonnm%>
<%= curmodlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 31 15:44:28 KST 2017 */