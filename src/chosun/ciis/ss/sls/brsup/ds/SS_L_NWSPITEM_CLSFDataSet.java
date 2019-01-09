/***************************************************************************************************
* 파일명 : SS_L_NWSPITEM_CLSFDataSet.java
* 기능 : 지국지원-신문지원물품-물품목록을 위한 DataSet
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-물품목록을 위한 DataSet
 */

public class SS_L_NWSPITEM_CLSFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NWSPITEM_CLSFDataSet(){}
	public SS_L_NWSPITEM_CLSFDataSet(String errcode, String errmsg){
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
		ResultSet rset6 = (ResultSet) cstmt.getObject(4);
		while(rset6.next()){
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = new SS_L_NWSPITEM_CLSFCURCOMMLISTRecord();
			rec.itemcd = Util.checkString(rset6.getString("itemcd"));
			rec.itemnm = Util.checkString(rset6.getString("itemnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

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
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
	SS_L_NWSPITEM_CLSFDataSet ds = (SS_L_NWSPITEM_CLSFDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEM_CLSFCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 20:45:07 KST 2004 */