/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-중지현황-목록(중지건별)
* 작성일자 : 2010-01-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *  확장현황-중지현황-목록(중지건별)
 */

public class SS_L_EXTN_SUSP_PERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList susplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_SUSP_PERDataSet(){}
	public SS_L_EXTN_SUSP_PERDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_EXTN_SUSP_PERSUSPLISTRecord rec = new SS_L_EXTN_SUSP_PERSUSPLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.clantmonth = Util.checkString(rset0.getString("clantmonth"));
			rec.totsubmonth = Util.checkString(rset0.getString("totsubmonth"));
			rec.oprenvclsfcd = Util.checkString(rset0.getString("oprenvclsfcd"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspnm = Util.checkString(rset0.getString("suspnm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.susplist.add(rec);
		}
	}

	public String susplistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susplist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_SUSP_PERSUSPLISTRecord rec = (SS_L_EXTN_SUSP_PERSUSPLISTRecord)susplist.get(i);
			
			
			String code = rec.dept_nm;
			String name = rec.part_nm;
			
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

	public String susplistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susplist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_SUSP_PERSUSPLISTRecord rec = (SS_L_EXTN_SUSP_PERSUSPLISTRecord)susplist.get(i);
			
			
			String code = rec.dept_nm;
			String name = rec.part_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_nm");
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

	public String susplistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susplist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_SUSP_PERSUSPLISTRecord rec = (SS_L_EXTN_SUSP_PERSUSPLISTRecord)susplist.get(i);
			
			
			String code = rec.dept_nm;
			String name = rec.part_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_nm");
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
	SS_L_EXTN_SUSP_PERDataSet ds = (SS_L_EXTN_SUSP_PERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.susplist.size(); i++){
		SS_L_EXTN_SUSP_PERSUSPLISTRecord susplistRec = (SS_L_EXTN_SUSP_PERSUSPLISTRecord)ds.susplist.get(i);%>
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

<%= susplistRec.dept_nm%>
<%= susplistRec.part_nm%>
<%= susplistRec.area_nm%>
<%= susplistRec.bonm%>
<%= susplistRec.medinm%>
<%= susplistRec.rdr_no%>
<%= susplistRec.rdrnm%>
<%= susplistRec.rdrtel_no%>
<%= susplistRec.rdrptph_no%>
<%= susplistRec.subsfr_dt%>
<%= susplistRec.valmm%>
<%= susplistRec.subsqty%>
<%= susplistRec.clantmonth%>
<%= susplistRec.totsubmonth%>
<%= susplistRec.oprenvclsfcd%>
<%= susplistRec.suspdt%>
<%= susplistRec.suspnm%>
<%= susplistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 06 14:45:44 KST 2010 */