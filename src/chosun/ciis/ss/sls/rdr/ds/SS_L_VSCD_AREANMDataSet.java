/***************************************************************************************************
* 파일명 : SS_L_VSCD_AREANMDataSet.java
* 기능 : 독자현황 VacationStop 비용 휴가지코드, 코드명 조회
* 작성일자 : 2004-01-16
* 작성자 : 고윤홍
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
 * 독자현황 VacationStop 비용 휴가지코드, 코드명 조회
 *
 */


public class SS_L_VSCD_AREANMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_VSCD_AREANMDataSet(){}
	public SS_L_VSCD_AREANMDataSet(String errcode, String errmsg){
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
			SS_L_VSCD_AREANMCURCOMMLISTRecord rec = new SS_L_VSCD_AREANMCURCOMMLISTRecord();
			rec.vaca_areacd = Util.checkString(rset0.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset0.getString("vaca_areanm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VSCD_AREANMCURCOMMLISTRecord rec = (SS_L_VSCD_AREANMCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_VSCD_AREANMCURCOMMLISTRecord rec = (SS_L_VSCD_AREANMCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_VSCD_AREANMCURCOMMLISTRecord rec = (SS_L_VSCD_AREANMCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_VSCD_AREANMDataSet ds = (SS_L_VSCD_AREANMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_VSCD_AREANMCURCOMMLISTRecord curcommlistRec = (SS_L_VSCD_AREANMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 17 19:13:37 KST 2004 */