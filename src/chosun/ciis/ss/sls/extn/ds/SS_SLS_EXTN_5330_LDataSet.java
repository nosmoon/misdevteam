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


public class SS_SLS_EXTN_5330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmodlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5330_LDataSet(){}
	public SS_SLS_EXTN_5330_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_SLS_EXTN_5330_LCURMODLISTRecord rec = new SS_SLS_EXTN_5330_LCURMODLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.subsuprc = Util.checkString(rset0.getString("subsuprc"));
			rec.cnfm_amt = Util.checkString(rset0.getString("cnfm_amt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			this.curmodlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5330_LDataSet ds = (SS_SLS_EXTN_5330_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmodlist.size(); i++){
		SS_SLS_EXTN_5330_LCURMODLISTRecord curmodlistRec = (SS_SLS_EXTN_5330_LCURMODLISTRecord)ds.curmodlist.get(i);%>
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

<%= curmodlistRec.gubun%>
<%= curmodlistRec.dncomp%>
<%= curmodlistRec.dncompnm%>
<%= curmodlistRec.valmm%>
<%= curmodlistRec.bonm%>
<%= curmodlistRec.rdr_no%>
<%= curmodlistRec.rdrnm%>
<%= curmodlistRec.qty%>
<%= curmodlistRec.subsuprc%>
<%= curmodlistRec.cnfm_amt%>
<%= curmodlistRec.bocd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 15:31:10 KST 2017 */