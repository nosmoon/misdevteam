/***************************************************************************************************
* 파일명 : SS_L_RCPCMSBSDataSet.java
* 기능 : 지국지원-빌링-수납수수료-기준-목록
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
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
 * 지국지원-빌링-수납수수료-기준-목록
 *
 */


public class SS_L_RCPCMSBSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RCPCMSBSDataSet(){}
	public SS_L_RCPCMSBSDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_RCPCMSBSCURCOMMLISTRecord rec = new SS_L_RCPCMSBSCURCOMMLISTRecord();
			rec.comscd = Util.checkString(rset0.getString("comscd"));
			rec.comsnm = Util.checkString(rset0.getString("comsnm"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.calcbasiclsf = Util.checkString(rset0.getString("calcbasiclsf"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.comsrate = Util.checkString(rset0.getString("comsrate"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.etc1 = Util.checkString(rset0.getString("etc1"));
			rec.etc2 = Util.checkString(rset0.getString("etc2"));
			rec.etc3 = Util.checkString(rset0.getString("etc3"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBSCURCOMMLISTRecord rec = (SS_L_RCPCMSBSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.comscd;
			String name = rec.comsnm;

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
			SS_L_RCPCMSBSCURCOMMLISTRecord rec = (SS_L_RCPCMSBSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.comscd;
			String name = rec.comsnm;

			sb.append("<input name=\"");
			sb.append("comscd");
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
			SS_L_RCPCMSBSCURCOMMLISTRecord rec = (SS_L_RCPCMSBSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.comscd;
			String name = rec.comsnm;

			sb.append("<input name=\"");
			sb.append("comscd");
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
	SS_L_RCPCMSBSDataSet ds = (SS_L_RCPCMSBSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RCPCMSBSCURCOMMLISTRecord curcommlistRec = (SS_L_RCPCMSBSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.comscd%>
<%= curcommlistRec.comsnm%>
<%= curcommlistRec.clamtmthdcd%>
<%= curcommlistRec.calcbasiclsf%>
<%= curcommlistRec.coms%>
<%= curcommlistRec.comsrate%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.etc1%>
<%= curcommlistRec.etc2%>
<%= curcommlistRec.etc3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 10:45:34 KST 2004 */