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


public class SS_SLS_BRSUP_2800_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curstafclsfcd = new ArrayList();
	public ArrayList curcntrstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRSUP_2800_ADataSet(){}
	public SS_SLS_BRSUP_2800_ADataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_SLS_BRSUP_2800_ACURSTAFCLSFCDRecord rec = new SS_SLS_BRSUP_2800_ACURSTAFCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curstafclsfcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_SLS_BRSUP_2800_ACURCNTRSTATCDRecord rec = new SS_SLS_BRSUP_2800_ACURCNTRSTATCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curcntrstatcd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRSUP_2800_ADataSet ds = (SS_SLS_BRSUP_2800_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curstafclsfcd.size(); i++){
		SS_SLS_BRSUP_2800_ACURSTAFCLSFCDRecord curstafclsfcdRec = (SS_SLS_BRSUP_2800_ACURSTAFCLSFCDRecord)ds.curstafclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcntrstatcd.size(); i++){
		SS_SLS_BRSUP_2800_ACURCNTRSTATCDRecord curcntrstatcdRec = (SS_SLS_BRSUP_2800_ACURCNTRSTATCDRecord)ds.curcntrstatcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurstafclsfcd()%>
<%= ds.getCurcntrstatcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curstafclsfcdRec.cicodeval%>
<%= curstafclsfcdRec.cicdnm%>
<%= curstafclsfcdRec.ciymgbcd%>
<%= curstafclsfcdRec.cicdgb%>
<%= curstafclsfcdRec.cicdynm%>
<%= curcntrstatcdRec.cicodeval%>
<%= curcntrstatcdRec.cicdnm%>
<%= curcntrstatcdRec.ciymgbcd%>
<%= curcntrstatcdRec.cicdgb%>
<%= curcntrstatcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 17:29:22 KST 2016 */