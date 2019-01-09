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


public class SS_L_EMP_NWSPRDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curempnwsplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EMP_NWSPRDRDataSet(){}
	public SS_L_EMP_NWSPRDRDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord rec = new SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.officd = Util.checkString(rset0.getString("officd"));
			rec.offinm = Util.checkString(rset0.getString("offinm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			rec.teamnm = Util.checkString(rset0.getString("teamnm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.subsyn = Util.checkString(rset0.getString("subsyn"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvtelno = Util.checkString(rset0.getString("dlvtelno"));
			rec.dlvptphno = Util.checkString(rset0.getString("dlvptphno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.modcheck = Util.checkString(rset0.getString("modcheck"));
			this.curempnwsplist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EMP_NWSPRDRDataSet ds = (SS_L_EMP_NWSPRDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curempnwsplist.size(); i++){
		SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord curempnwsplistRec = (SS_L_EMP_NWSPRDRCUREMPNWSPLISTRecord)ds.curempnwsplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurempnwsplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curempnwsplistRec.cmpycd%>
<%= curempnwsplistRec.cmpynm%>
<%= curempnwsplistRec.officd%>
<%= curempnwsplistRec.offinm%>
<%= curempnwsplistRec.teamcd%>
<%= curempnwsplistRec.teamnm%>
<%= curempnwsplistRec.empseq%>
<%= curempnwsplistRec.empnm%>
<%= curempnwsplistRec.zip%>
<%= curempnwsplistRec.addr%>
<%= curempnwsplistRec.telno%>
<%= curempnwsplistRec.ptphno%>
<%= curempnwsplistRec.subsyn%>
<%= curempnwsplistRec.rdr_no%>
<%= curempnwsplistRec.rdrnm%>
<%= curempnwsplistRec.rdr_extndt%>
<%= curempnwsplistRec.subsfr_dt%>
<%= curempnwsplistRec.valmm%>
<%= curempnwsplistRec.qty%>
<%= curempnwsplistRec.freeyn%>
<%= curempnwsplistRec.suspdt%>
<%= curempnwsplistRec.suspresncd%>
<%= curempnwsplistRec.dlvaddr%>
<%= curempnwsplistRec.bocd%>
<%= curempnwsplistRec.bonm%>
<%= curempnwsplistRec.rdr_extnno%>
<%= curempnwsplistRec.dlvzip%>
<%= curempnwsplistRec.dlvtelno%>
<%= curempnwsplistRec.dlvptphno%>
<%= curempnwsplistRec.medicd%>
<%= curempnwsplistRec.modcheck%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 11 05:55:55 GMT 2013 */