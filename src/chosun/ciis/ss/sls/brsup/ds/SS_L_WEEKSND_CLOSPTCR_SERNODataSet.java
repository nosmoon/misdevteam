/***************************************************************************************************
 * 파일명   : SP_SS_L_WEEKSND_CLOSPTCR_SERNO
 * 기능     : 지국지원-빌링-주간조선관리-정산마감-호수별마감내역
 * 작성일자 : 2007/08/29
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_WEEKSND_CLOSPTCR_SERNO
**/

public class SS_L_WEEKSND_CLOSPTCR_SERNODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList closptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_WEEKSND_CLOSPTCR_SERNODataSet(){}
	public SS_L_WEEKSND_CLOSPTCR_SERNODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord rec = new SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord();
			rec.clsfcd = Util.checkString(rset0.getString("clsfcd"));
			rec.closseq = Util.checkString(rset0.getString("closseq"));
			rec.closyymm = Util.checkString(rset0.getString("closyymm"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.lumpcnt = rset0.getInt("lumpcnt");
			rec.retncnt = rset0.getInt("retncnt");
			rec.closcnt = rset0.getInt("closcnt");
			rec.lumpamt = rset0.getInt("lumpamt");
			rec.retnamt = rset0.getInt("retnamt");
			rec.closamt = rset0.getInt("closamt");
			this.closptcrcur.add(rec);
		}
	}

	public String closptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord rec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.clsfcd;
			String name = rec.closseq;
			
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

	public String closptcrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord rec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.clsfcd;
			String name = rec.closseq;
			
			sb.append("<input name=\"");
			sb.append("clsfcd");
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

	public String closptcrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord rec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.clsfcd;
			String name = rec.closseq;
			
			sb.append("<input name=\"");
			sb.append("clsfcd");
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
	SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (SS_L_WEEKSND_CLOSPTCR_SERNODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.closptcrcur.size(); i++){
		SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord closptcrcurRec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)ds.closptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= closptcrcurRec.clsfcd%>
<%= closptcrcurRec.closseq%>
<%= closptcrcurRec.closyymm%>
<%= closptcrcurRec.closdt%>
<%= closptcrcurRec.mediser_no%>
<%= closptcrcurRec.lumpcnt%>
<%= closptcrcurRec.retncnt%>
<%= closptcrcurRec.closcnt%>
<%= closptcrcurRec.lumpamt%>
<%= closptcrcurRec.retnamt%>
<%= closptcrcurRec.closamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 29 14:53:54 KST 2007 */