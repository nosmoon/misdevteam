/***************************************************************************************************
* 파일명 : SS_L_VSCDDataSet.java
* 기능 : 독자-VacationStop-코드-목록을 위한 DataSet
* 작성일자 : 2004-03-20
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
 * 독자-VacationStop-코드-목록을 위한 DataSet
 */

public class SS_L_VSCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_VSCDDataSet(){}
	public SS_L_VSCDDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_VSCDCURCOMMLISTRecord rec = new SS_L_VSCDCURCOMMLISTRecord();
			rec.vaca_arearegncd = Util.checkString(rset0.getString("vaca_arearegncd"));
			rec.vaca_arearegnnm = Util.checkString(rset0.getString("vaca_arearegnnm"));
			rec.vaca_areacd = Util.checkString(rset0.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset0.getString("vaca_areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(7);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VSCDCURCOMMLISTRecord rec = (SS_L_VSCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
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
			SS_L_VSCDCURCOMMLISTRecord rec = (SS_L_VSCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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
			SS_L_VSCDCURCOMMLISTRecord rec = (SS_L_VSCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.vaca_arearegncd;
			String name = rec.vaca_arearegnnm;
			
			sb.append("<input name=\"");
			sb.append("vaca_arearegncd");
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
	SS_L_VSCDDataSet ds = (SS_L_VSCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_VSCDCURCOMMLISTRecord curcommlistRec = (SS_L_VSCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.vaca_arearegncd%>
<%= curcommlistRec.vaca_arearegnnm%>
<%= curcommlistRec.vaca_areacd%>
<%= curcommlistRec.vaca_areanm%>
<%= curcommlistRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 17:03:07 KST 2004 */