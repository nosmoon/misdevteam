/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 상세 조회  
* 작성일자 : 2009-05-28
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
 * 에듀/제휴 확장 상세 조회  
 */

public class SS_S_EXTN_EDURDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_EXTN_EDURDRDataSet(){}
	public SS_S_EXTN_EDURDRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			SS_S_EXTN_EDURDRRDRLISTRecord rec = new SS_S_EXTN_EDURDRRDRLISTRecord();
			rec.type1 = Util.checkString(rset0.getString("type1"));
			rec.type2 = Util.checkString(rset0.getString("type2"));
			rec.insttnm = Util.checkString(rset0.getString("insttnm"));
			rec.nm = Util.checkString(rset0.getString("nm"));
			rec.protpersnm = Util.checkString(rset0.getString("protpersnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.subsyn = Util.checkString(rset0.getString("subsyn"));
			rec.dlvhopedd = Util.checkString(rset0.getString("dlvhopedd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdrcnfm = Util.checkString(rset0.getString("rdrcnfm"));
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.resn = Util.checkString(rset0.getString("resn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.insttcd = Util.checkString(rset0.getString("insttcd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			this.rdrlist.add(rec);
		}
	}

	public String rdrlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrlist.size();
		for(int i=0; i<size; i++){
			SS_S_EXTN_EDURDRRDRLISTRecord rec = (SS_S_EXTN_EDURDRRDRLISTRecord)rdrlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
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
			SS_S_EXTN_EDURDRRDRLISTRecord rec = (SS_S_EXTN_EDURDRRDRLISTRecord)rdrlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
			sb.append("<input name=\"");
			sb.append("type1");
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
			SS_S_EXTN_EDURDRRDRLISTRecord rec = (SS_S_EXTN_EDURDRRDRLISTRecord)rdrlist.get(i);
			
			
			String code = rec.type1;
			String name = rec.type2;
			
			sb.append("<input name=\"");
			sb.append("type1");
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
	SS_S_EXTN_EDURDRDataSet ds = (SS_S_EXTN_EDURDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrlist.size(); i++){
		SS_S_EXTN_EDURDRRDRLISTRecord rdrlistRec = (SS_S_EXTN_EDURDRRDRLISTRecord)ds.rdrlist.get(i);%>
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

<%= rdrlistRec.type1%>
<%= rdrlistRec.type2%>
<%= rdrlistRec.insttnm%>
<%= rdrlistRec.nm%>
<%= rdrlistRec.protpersnm%>
<%= rdrlistRec.deptnm%>
<%= rdrlistRec.partnm%>
<%= rdrlistRec.areanm%>
<%= rdrlistRec.bonm%>
<%= rdrlistRec.tel_no%>
<%= rdrlistRec.zip%>
<%= rdrlistRec.addr%>
<%= rdrlistRec.dtlsaddr%>
<%= rdrlistRec.subsyn%>
<%= rdrlistRec.dlvhopedd%>
<%= rdrlistRec.bocd%>
<%= rdrlistRec.rdrcnfm%>
<%= rdrlistRec.procstat%>
<%= rdrlistRec.resn%>
<%= rdrlistRec.remk%>
<%= rdrlistRec.dept_cd%>
<%= rdrlistRec.part_cd%>
<%= rdrlistRec.area_cd%>
<%= rdrlistRec.cmpycd%>
<%= rdrlistRec.insttcd%>
<%= rdrlistRec.seq%>
<%= rdrlistRec.rdr_extndt%>
<%= rdrlistRec.rdr_extnno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 12:24:25 KST 2009 */