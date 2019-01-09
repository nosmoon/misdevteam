/***************************************************************************************************
* 파일명 : .java
* 기능 : *공통-지국검색 목록
* 작성일자 : 2009-05-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 공통-지국검색 목록
 */

public class SS_L_BO_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curbolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BO_SRCHDataSet(){}
	public SS_L_BO_SRCHDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_BO_SRCHCURBOLISTRecord rec = new SS_L_BO_SRCHCURBOLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.tel_no11 = Util.checkString(rset0.getString("tel_no11"));
			rec.tel_no12 = Util.checkString(rset0.getString("tel_no12"));
			rec.tel_no13 = Util.checkString(rset0.getString("tel_no13"));
			rec.fax1 = Util.checkString(rset0.getString("fax1"));
			rec.fax2 = Util.checkString(rset0.getString("fax2"));
			rec.fax3 = Util.checkString(rset0.getString("fax3"));
			rec.bo_headnm = Util.checkString(rset0.getString("bo_headnm"));
			rec.htel_no1 = Util.checkString(rset0.getString("htel_no1"));
			rec.htel_no2 = Util.checkString(rset0.getString("htel_no2"));
			rec.htel_no3 = Util.checkString(rset0.getString("htel_no3"));
			rec.hptph_no1 = Util.checkString(rset0.getString("hptph_no1"));
			rec.hptph_no2 = Util.checkString(rset0.getString("hptph_no2"));
			rec.hptph_no3 = Util.checkString(rset0.getString("hptph_no3"));
			rec.hemail = Util.checkString(rset0.getString("hemail"));
			rec.boaddr = Util.checkString(rset0.getString("boaddr"));
			rec.bodtlsaddr = Util.checkString(rset0.getString("bodtlsaddr"));
			rec.hboaddr = Util.checkString(rset0.getString("hboaddr"));
			rec.hbodtlsaddr = Util.checkString(rset0.getString("hbodtlsaddr"));
			this.curbolist.add(rec);
		}
	}

	public String curbolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbolist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_SRCHCURBOLISTRecord rec = (SS_L_BO_SRCHCURBOLISTRecord)curbolist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String curbolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbolist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_SRCHCURBOLISTRecord rec = (SS_L_BO_SRCHCURBOLISTRecord)curbolist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String curbolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbolist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_SRCHCURBOLISTRecord rec = (SS_L_BO_SRCHCURBOLISTRecord)curbolist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	SS_L_BO_SRCHDataSet ds = (SS_L_BO_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curbolist.size(); i++){
		SS_L_BO_SRCHCURBOLISTRecord curbolistRec = (SS_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurbolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curbolistRec.bocd%>
<%= curbolistRec.bonm%>
<%= curbolistRec.deptcd%>
<%= curbolistRec.deptnm%>
<%= curbolistRec.partnm%>
<%= curbolistRec.partcd%>
<%= curbolistRec.areacd%>
<%= curbolistRec.areanm%>
<%= curbolistRec.tel_no11%>
<%= curbolistRec.tel_no12%>
<%= curbolistRec.tel_no13%>
<%= curbolistRec.fax1%>
<%= curbolistRec.fax2%>
<%= curbolistRec.fax3%>
<%= curbolistRec.bo_headnm%>
<%= curbolistRec.htel_no1%>
<%= curbolistRec.htel_no2%>
<%= curbolistRec.htel_no3%>
<%= curbolistRec.hptph_no1%>
<%= curbolistRec.hptph_no2%>
<%= curbolistRec.hptph_no3%>
<%= curbolistRec.hemail%>
<%= curbolistRec.boaddr%>
<%= curbolistRec.bodtlsaddr%>
<%= curbolistRec.hboaddr%>
<%= curbolistRec.hbodtlsaddr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 11:38:11 KST 2009 */