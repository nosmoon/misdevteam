/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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


public class ABC_L_AUTHRATIODTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curauthratiodtl = new ArrayList();
	public String errcode;
	public String errmsg;

	public ABC_L_AUTHRATIODTLDataSet(){}
	public ABC_L_AUTHRATIODTLDataSet(String errcode, String errmsg){
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
			ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord rec = new ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord();
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.abcclsf = Util.checkString(rset0.getString("abcclsf"));
			rec.abc = Util.checkString(rset0.getString("abc"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.clamlist = Util.checkString(rset0.getString("clamlist"));
			this.curauthratiodtl.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	ABC_L_AUTHRATIODTLDataSet ds = (ABC_L_AUTHRATIODTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curauthratiodtl.size(); i++){
		ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord curauthratiodtlRec = (ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord)ds.curauthratiodtl.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurauthratiodtl()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curauthratiodtlRec.subsmappli%>
<%= curauthratiodtlRec.bocd%>
<%= curauthratiodtlRec.abcclsf%>
<%= curauthratiodtlRec.abc%>
<%= curauthratiodtlRec.rdr_no%>
<%= curauthratiodtlRec.valmm%>
<%= curauthratiodtlRec.clamlist%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 03 08:16:01 GMT 2013 */