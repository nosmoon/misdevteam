/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국확장마감 조회 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황 - 지국확장마감 조회 
 */

public class SS_L_TASLM_RDREXTNCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrextnclos = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TASLM_RDREXTNCLOSDataSet(){}
	public SS_L_TASLM_RDREXTNCLOSDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rec = new SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.vexcyn = Util.checkString(rset0.getString("vexcyn"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.qty = rset0.getInt("qty");
			rec.addrcdnm = Util.checkString(rset0.getString("addrcdnm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.rdr_extntype1 = Util.checkString(rset0.getString("rdr_extntype1"));
			rec.rdr_extntype2 = Util.checkString(rset0.getString("rdr_extntype2"));
			rec.camptype = Util.checkString(rset0.getString("camptype"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.aplcpath = Util.checkString(rset0.getString("aplcpath"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			rec.mvindt = Util.checkString(rset0.getString("mvindt"));
			rec.mvintodt = Util.checkString(rset0.getString("mvintodt"));
			rec.reconfyn = Util.checkString(rset0.getString("reconfyn"));
			rec.mormembid = Util.checkString(rset0.getString("mormembid"));
			rec.rdr_extnprvlastsuspdt = Util.checkString(rset0.getString("rdr_extnprvlastsuspdt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspresn = Util.checkString(rset0.getString("suspresn"));
			rec.bns_itemclsf = Util.checkString(rset0.getString("bns_itemclsf"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.rdr_extnexclyn = Util.checkString(rset0.getString("rdr_extnexclyn"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.clsf1 = Util.checkString(rset0.getString("clsf1"));
			rec.clsf2 = Util.checkString(rset0.getString("clsf2"));
			rec.clsf3 = Util.checkString(rset0.getString("clsf3"));
			rec.clsf4 = Util.checkString(rset0.getString("clsf4"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			this.rdrextnclos.add(rec);
		}
	}

	public String rdrextnclosOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextnclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rec = (SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord)rdrextnclos.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.closmm;
			
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

	public String rdrextnclosChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextnclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rec = (SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord)rdrextnclos.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.closmm;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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

	public String rdrextnclosRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrextnclos.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rec = (SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord)rdrextnclos.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.closmm;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
	SS_L_TASLM_RDREXTNCLOSDataSet ds = (SS_L_TASLM_RDREXTNCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrextnclos.size(); i++){
		SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rdrextnclosRec = (SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord)ds.rdrextnclos.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrextnclos()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdrextnclosRec.cmpycd%>
<%= rdrextnclosRec.closmm%>
<%= rdrextnclosRec.seq%>
<%= rdrextnclosRec.deptcd%>
<%= rdrextnclosRec.deptnm%>
<%= rdrextnclosRec.partcd%>
<%= rdrextnclosRec.partnm%>
<%= rdrextnclosRec.areacd%>
<%= rdrextnclosRec.areanm%>
<%= rdrextnclosRec.bocd%>
<%= rdrextnclosRec.bonm%>
<%= rdrextnclosRec.vexcyn%>
<%= rdrextnclosRec.rdrnm%>
<%= rdrextnclosRec.rdr_no%>
<%= rdrextnclosRec.qty%>
<%= rdrextnclosRec.addrcdnm%>
<%= rdrextnclosRec.addr%>
<%= rdrextnclosRec.dtlsaddr%>
<%= rdrextnclosRec.rdrtel_no1%>
<%= rdrextnclosRec.rdrtel_no2%>
<%= rdrextnclosRec.rdrtel_no3%>
<%= rdrextnclosRec.rdrptph_no1%>
<%= rdrextnclosRec.rdrptph_no2%>
<%= rdrextnclosRec.rdrptph_no3%>
<%= rdrextnclosRec.rdr_extndt%>
<%= rdrextnclosRec.incmgdt%>
<%= rdrextnclosRec.valmm%>
<%= rdrextnclosRec.dscnamt%>
<%= rdrextnclosRec.clamtmthd%>
<%= rdrextnclosRec.rdr_extntype1%>
<%= rdrextnclosRec.rdr_extntype2%>
<%= rdrextnclosRec.camptype%>
<%= rdrextnclosRec.extnnm%>
<%= rdrextnclosRec.aplcpath%>
<%= rdrextnclosRec.resitype%>
<%= rdrextnclosRec.mvindt%>
<%= rdrextnclosRec.mvintodt%>
<%= rdrextnclosRec.reconfyn%>
<%= rdrextnclosRec.mormembid%>
<%= rdrextnclosRec.rdr_extnprvlastsuspdt%>
<%= rdrextnclosRec.remk%>
<%= rdrextnclosRec.suspdt%>
<%= rdrextnclosRec.suspresn%>
<%= rdrextnclosRec.bns_itemclsf%>
<%= rdrextnclosRec.bns_itemnm%>
<%= rdrextnclosRec.rdr_extnexclyn%>
<%= rdrextnclosRec.clsf%>
<%= rdrextnclosRec.clsf1%>
<%= rdrextnclosRec.clsf2%>
<%= rdrextnclosRec.clsf3%>
<%= rdrextnclosRec.clsf4%>
<%= rdrextnclosRec.cntrno%>
<%= rdrextnclosRec.medicd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 12:20:12 KST 2009 */