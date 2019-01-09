/***************************************************************************************************
* 파일명 : SS_L_MO_SVY_RDRDataSet.java
* 기능 :
* 작성일자 : 2015.12.03
* 작성자 : 장선희
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


public class SS_L_MO_SVY_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MO_SVY_RDRDataSet(){}
	public SS_L_MO_SVY_RDRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			SS_L_MO_SVY_RDRRDRLISTRecord rec = new SS_L_MO_SVY_RDRRDRLISTRecord();
			rec.respyn = Util.checkString(rset0.getString("respyn"));
			rec.sendyn = Util.checkString(rset0.getString("sendyn"));
			rec.svynm = Util.checkString(rset0.getString("svynm"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.addrs = Util.checkString(rset0.getString("addrs"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.svyid = Util.checkString(rset0.getString("svyid"));
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.camptype = Util.checkString(rset0.getString("camptype"));
			rec.qstbsyn = Util.checkString(rset0.getString("qstbsyn"));
			rec.resp_bsstat = Util.checkString(rset0.getString("resp_bsstat"));
			rec.stat = Util.checkString(rset0.getString("stat"));
			rec.ddremk = Util.checkString(rset0.getString("ddremk"));
			rec.issup = Util.checkString(rset0.getString("issup"));
			this.rdrlist.add(rec);
		}
	}

	public String rdrlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RDRRDRLISTRecord rec = (SS_L_MO_SVY_RDRRDRLISTRecord)rdrlist.get(i);


			String code = rec.respyn;
			String name = rec.sendyn;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String rdrlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RDRRDRLISTRecord rec = (SS_L_MO_SVY_RDRRDRLISTRecord)rdrlist.get(i);


			String code = rec.respyn;
			String name = rec.sendyn;

			sb.append("<input name=\"");
			sb.append("respyn");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String rdrlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RDRRDRLISTRecord rec = (SS_L_MO_SVY_RDRRDRLISTRecord)rdrlist.get(i);


			String code = rec.respyn;
			String name = rec.sendyn;

			sb.append("<input name=\"");
			sb.append("respyn");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_MO_SVY_RDRDataSet ds = (SS_L_MO_SVY_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrlist.size(); i++){
		SS_L_MO_SVY_RDRRDRLISTRecord rdrlistRec = (SS_L_MO_SVY_RDRRDRLISTRecord)ds.rdrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdrlistRec.respyn%>
<%= rdrlistRec.sendyn%>
<%= rdrlistRec.svynm%>
<%= rdrlistRec.closmm%>
<%= rdrlistRec.deptcd%>
<%= rdrlistRec.deptnm%>
<%= rdrlistRec.partcd%>
<%= rdrlistRec.partnm%>
<%= rdrlistRec.areacd%>
<%= rdrlistRec.areanm%>
<%= rdrlistRec.bocd%>
<%= rdrlistRec.bonm%>
<%= rdrlistRec.rdr_no%>
<%= rdrlistRec.rdrnm%>
<%= rdrlistRec.qty%>
<%= rdrlistRec.addrs%>
<%= rdrlistRec.rdr_extndt%>
<%= rdrlistRec.extnnm%>
<%= rdrlistRec.seq%>
<%= rdrlistRec.suspdt%>
<%= rdrlistRec.svyid%>
<%= rdrlistRec.campid%>
<%= rdrlistRec.camptype%>
<%= rdrlistRec.qstbsyn%>
<%= rdrlistRec.resp_bsstat%>
<%= rdrlistRec.stat%>
<%= rdrlistRec.ddremk%>
<%= rdrlistRec.issup%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 02 10:20:22 KST 2016 */