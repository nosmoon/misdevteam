/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 유형별 조회 
* 작성일자 : 2009/05/22
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
 * 본사확장 유형별 조회 
 */

public class SS_L_EXTN_HDQTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList onlinelist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalqty;

	public SS_L_EXTN_HDQTDataSet(){}
	public SS_L_EXTN_HDQTDataSet(String errcode, String errmsg, long totalcnt, long totalqty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalqty = totalqty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setTotalqty(long totalqty){
		this.totalqty = totalqty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getTotalqty(){
		return this.totalqty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			SS_L_EXTN_HDQTONLINELISTRecord rec = new SS_L_EXTN_HDQTONLINELISTRecord();
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.extnflnm = Util.checkString(rset0.getString("extnflnm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.qty = rset0.getInt("qty");
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			rec.bo_headcnfmdt = Util.checkString(rset0.getString("bo_headcnfmdt"));
			rec.subscnfmstatnm = Util.checkString(rset0.getString("subscnfmstatnm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspyn = Util.checkString(rset0.getString("suspyn"));
			rec.suspresnnm = Util.checkString(rset0.getString("suspresnnm"));
			rec.rdr_extncost = Util.checkString(rset0.getString("rdr_extncost"));
			rec.alonadjmyn = Util.checkString(rset0.getString("alonadjmyn"));
			rec.corrbocd = Util.checkString(rset0.getString("corrbocd"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.shftaplcclsfnm = Util.checkString(rset0.getString("shftaplcclsfnm"));
			rec.shftbgnmm = Util.checkString(rset0.getString("shftbgnmm"));
			rec.clamtmm = Util.checkString(rset0.getString("clamtmm"));
			rec.clamtyn = Util.checkString(rset0.getString("clamtyn"));
			rec.clamt_month = Util.checkString(rset0.getString("clamt_month"));
			rec.extn_company = Util.checkString(rset0.getString("extn_company"));
			rec.extn_bonm = Util.checkString(rset0.getString("extn_bonm"));
			rec.empdeptnm = Util.checkString(rset0.getString("empdeptnm"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.depspers = Util.checkString(rset0.getString("depspers"));
			rec.sellnetclsfnm = Util.checkString(rset0.getString("sellnetclsfnm"));
			rec.post_dlvyn = Util.checkString(rset0.getString("post_dlvyn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mangno = Util.checkString(rset0.getString("mangno"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.tel_no11 = Util.checkString(rset0.getString("tel_no11"));
			rec.tel_no12 = Util.checkString(rset0.getString("tel_no12"));
			rec.tel_no13 = Util.checkString(rset0.getString("tel_no13"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.freeday = Util.checkString(rset0.getString("freeday"));
			rec.shftaplcclsf_item = Util.checkString(rset0.getString("shftaplcclsf_item"));
			this.onlinelist.add(rec);
		}
		this.totalcnt = cstmt.getLong(22);
		this.totalqty = cstmt.getLong(23);
	}

	public String onlinelistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = onlinelist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQTONLINELISTRecord rec = (SS_L_EXTN_HDQTONLINELISTRecord)onlinelist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.dept_nm;
			
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

	public String onlinelistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = onlinelist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQTONLINELISTRecord rec = (SS_L_EXTN_HDQTONLINELISTRecord)onlinelist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extntypenm");
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

	public String onlinelistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = onlinelist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQTONLINELISTRecord rec = (SS_L_EXTN_HDQTONLINELISTRecord)onlinelist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extntypenm");
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
	SS_L_EXTN_HDQTDataSet ds = (SS_L_EXTN_HDQTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.onlinelist.size(); i++){
		SS_L_EXTN_HDQTONLINELISTRecord onlinelistRec = (SS_L_EXTN_HDQTONLINELISTRecord)ds.onlinelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOnlinelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= onlinelistRec.rdr_extntypenm%>
<%= onlinelistRec.dept_nm%>
<%= onlinelistRec.part_nm%>
<%= onlinelistRec.area_nm%>
<%= onlinelistRec.bonm%>
<%= onlinelistRec.extnflnm%>
<%= onlinelistRec.rdr_extndt%>
<%= onlinelistRec.rdrnm%>
<%= onlinelistRec.rdr_no%>
<%= onlinelistRec.valmm%>
<%= onlinelistRec.onlmembid%>
<%= onlinelistRec.medinm%>
<%= onlinelistRec.qty%>
<%= onlinelistRec.aplcpathnm%>
<%= onlinelistRec.aplcdt%>
<%= onlinelistRec.bo_headcnfmyn%>
<%= onlinelistRec.bo_headcnfmdt%>
<%= onlinelistRec.subscnfmstatnm%>
<%= onlinelistRec.suspdt%>
<%= onlinelistRec.suspyn%>
<%= onlinelistRec.suspresnnm%>
<%= onlinelistRec.rdr_extncost%>
<%= onlinelistRec.alonadjmyn%>
<%= onlinelistRec.corrbocd%>
<%= onlinelistRec.rdrtel_no1%>
<%= onlinelistRec.rdrtel_no2%>
<%= onlinelistRec.rdrtel_no3%>
<%= onlinelistRec.dlvaddr%>
<%= onlinelistRec.dlvdtlsaddr%>
<%= onlinelistRec.shftaplcclsfnm%>
<%= onlinelistRec.shftbgnmm%>
<%= onlinelistRec.clamtmm%>
<%= onlinelistRec.clamtyn%>
<%= onlinelistRec.clamt_month%>
<%= onlinelistRec.extn_company%>
<%= onlinelistRec.extn_bonm%>
<%= onlinelistRec.empdeptnm%>
<%= onlinelistRec.banknm%>
<%= onlinelistRec.acctno%>
<%= onlinelistRec.depspers%>
<%= onlinelistRec.sellnetclsfnm%>
<%= onlinelistRec.post_dlvyn%>
<%= onlinelistRec.dept_cd%>
<%= onlinelistRec.part_cd%>
<%= onlinelistRec.area_cd%>
<%= onlinelistRec.rdr_extntypecd%>
<%= onlinelistRec.aplcpathcd%>
<%= onlinelistRec.rdr_extnno%>
<%= onlinelistRec.medicd%>
<%= onlinelistRec.mangno%>
<%= onlinelistRec.cntrno%>
<%= onlinelistRec.tel_no11%>
<%= onlinelistRec.tel_no12%>
<%= onlinelistRec.tel_no13%>
<%= onlinelistRec.bns_itemnm%>
<%= onlinelistRec.freeday%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 31 15:30:24 KST 2009 */