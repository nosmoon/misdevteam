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


public class SS_L_SUSP_DEFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspdefcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SUSP_DEFDataSet(){}
	public SS_L_SUSP_DEFDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_SUSP_DEFSUSPDEFCURRecord rec = new SS_L_SUSP_DEFSUSPDEFCURRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.def_type = Util.checkString(rset0.getString("def_type"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.agentnm = Util.checkString(rset0.getString("agentnm"));
			rec.cns_stat = Util.checkString(rset0.getString("cns_stat"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			this.suspdefcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_SUSP_DEFDataSet ds = (SS_L_SUSP_DEFDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.suspdefcur.size(); i++){
		SS_L_SUSP_DEFSUSPDEFCURRecord suspdefcurRec = (SS_L_SUSP_DEFSUSPDEFCURRecord)ds.suspdefcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSuspdefcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= suspdefcurRec.deptnm%>
<%= suspdefcurRec.partnm%>
<%= suspdefcurRec.areanm%>
<%= suspdefcurRec.areacd%>
<%= suspdefcurRec.bonm%>
<%= suspdefcurRec.bocd%>
<%= suspdefcurRec.rdrnm%>
<%= suspdefcurRec.medinm%>
<%= suspdefcurRec.aplcpathnm%>
<%= suspdefcurRec.rdr_extndt%>
<%= suspdefcurRec.subsfr_dt%>
<%= suspdefcurRec.agentnm%>
<%= suspdefcurRec.cns_stat%>
<%= suspdefcurRec.aplcdt%>
<%= suspdefcurRec.aplcno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 18:14:58 KST 2015 */