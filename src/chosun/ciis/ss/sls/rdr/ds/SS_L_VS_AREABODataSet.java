/***************************************************************************************************
* 파일명 : SS_L_VS_AREABODataSet.java
* 기능 : 독자현황-VacationStop-휴가지코드및 지국정보 목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-휴가지코드및 지국정보 목록을 위한 DataSet
 */


public class SS_L_VS_AREABODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_VS_AREABODataSet(){}
	public SS_L_VS_AREABODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_VS_AREABOCURCOMMLISTRecord rec = new SS_L_VS_AREABOCURCOMMLISTRecord();
			rec.vaca_areacd = Util.checkString(rset0.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset0.getString("vaca_areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.telno1 = Util.checkString(rset0.getString("telno1"));
			rec.telno2 = Util.checkString(rset0.getString("telno2"));
			rec.telno3 = Util.checkString(rset0.getString("telno3"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_AREABOCURCOMMLISTRecord rec = (SS_L_VS_AREABOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_AREABOCURCOMMLISTRecord rec = (SS_L_VS_AREABOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VS_AREABOCURCOMMLISTRecord rec = (SS_L_VS_AREABOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_areacd;
			String name = rec.vaca_areanm;
			
			sb.append("<input name=\"");
			sb.append("vaca_areacd");
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
	SS_L_VS_AREABODataSet ds = (SS_L_VS_AREABODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_VS_AREABOCURCOMMLISTRecord curcommlistRec = (SS_L_VS_AREABOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.vaca_areacd%>
<%= curcommlistRec.vaca_areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.telno1%>
<%= curcommlistRec.telno2%>
<%= curcommlistRec.telno3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 16 10:55:48 KST 2004 */