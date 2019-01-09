/***************************************************************************************************
 * 파일명   : SP_SS_L_SEND_PBLMEDISENDBO
 * 기능     : 지국경영-주간조선발송관리
 * 작성일자 : 2007/04/24
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_L_SEND_PBLMEDISENDBO
**/

public class SS_L_SEND_PBLMEDISENDBODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medinm;
	public long totalcnt;

	public SS_L_SEND_PBLMEDISENDBODataSet(){}
	public SS_L_SEND_PBLMEDISENDBODataSet(String errcode, String errmsg, String medinm, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medinm = medinm;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
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

	public String getMedinm(){
		return this.medinm;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medinm = Util.checkString(cstmt.getString(13));
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord rec = new SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord();
			rec.hbiscnm = Util.checkString(rset0.getString("hbiscnm"));
			rec.bhnscd = Util.checkString(rset0.getString("bhnscd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.sendqty = rset0.getInt("sendqty");
			rec.sendresvqty = rset0.getInt("sendresvqty");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord rec = (SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
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
			SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord rec = (SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
			sb.append("<input name=\"");
			sb.append("hbiscnm");
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
			SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord rec = (SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbiscnm;
			String name = rec.bhnscd;
			
			sb.append("<input name=\"");
			sb.append("hbiscnm");
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
	SS_L_SEND_PBLMEDISENDBODataSet ds = (SS_L_SEND_PBLMEDISENDBODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord curcommlistRec = (SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedinm()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.hbiscnm%>
<%= curcommlistRec.bhnscd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.sendqty%>
<%= curcommlistRec.sendresvqty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 15:26:13 KST 2007 */