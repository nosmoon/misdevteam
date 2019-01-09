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


public class SS_L_EXTN_SUSPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList susplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_SUSPDataSet(){}
	public SS_L_EXTN_SUSPDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_EXTN_SUSPSUSPLISTRecord rec = new SS_L_EXTN_SUSPSUSPLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.movm10 = Util.checkString(rset0.getString("movm10"));
			rec.movm20 = Util.checkString(rset0.getString("movm20"));
			rec.movm100 = Util.checkString(rset0.getString("movm100"));
			rec.movm110 = Util.checkString(rset0.getString("movm110"));
			rec.movm50 = Util.checkString(rset0.getString("movm50"));
			rec.movm60 = Util.checkString(rset0.getString("movm60"));
			rec.movm200 = Util.checkString(rset0.getString("movm200"));
			rec.movm105 = Util.checkString(rset0.getString("movm105"));
			rec.movm999 = Util.checkString(rset0.getString("movm999"));
			rec.total_count = Util.checkString(rset0.getString("total_count"));
			this.susplist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EXTN_SUSPDataSet ds = (SS_L_EXTN_SUSPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.susplist.size(); i++){
		SS_L_EXTN_SUSPSUSPLISTRecord susplistRec = (SS_L_EXTN_SUSPSUSPLISTRecord)ds.susplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSusplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= susplistRec.deptnm%>
<%= susplistRec.partnm%>
<%= susplistRec.areanm%>
<%= susplistRec.bocd%>
<%= susplistRec.bonm%>
<%= susplistRec.movm10%>
<%= susplistRec.movm20%>
<%= susplistRec.movm100%>
<%= susplistRec.movm110%>
<%= susplistRec.movm50%>
<%= susplistRec.movm60%>
<%= susplistRec.movm200%>
<%= susplistRec.movm105%>
<%= susplistRec.movm999%>
<%= susplistRec.total_count%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 11 15:34:29 KST 2016 */