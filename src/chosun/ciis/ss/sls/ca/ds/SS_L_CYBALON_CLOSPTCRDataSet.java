/***************************************************************************************************
 * 파일명   : SP_SS_L_CYBALON_CLOSPTCR.java
 * 기능     : 사이버센터
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
**  사이버센터
**/

public class SS_L_CYBALON_CLOSPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList closptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_CYBALON_CLOSPTCRDataSet(){}
	public SS_L_CYBALON_CLOSPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord rec = new SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord();
			rec.closseq = Util.checkString(rset0.getString("closseq"));
			rec.closyymm = Util.checkString(rset0.getString("closyymm"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			rec.adjmnoit = rset0.getInt("adjmnoit");
			rec.adjmamt = rset0.getInt("adjmamt");
			rec.clamamt = rset0.getInt("clamamt");
			rec.prvmmacmlun_recp = rset0.getInt("prvmmacmlun_recp");
			rec.clamt = rset0.getInt("clamt");
			rec.acmlun_recp = rset0.getInt("acmlun_recp");
			rec.etc1 = Util.checkString(rset0.getString("etc1"));
			rec.etc2 = Util.checkString(rset0.getString("etc2"));
			rec.etc3 = Util.checkString(rset0.getString("etc3"));
			rec.etc4 = Util.checkString(rset0.getString("etc4"));
			rec.etc5 = Util.checkString(rset0.getString("etc5"));
			rec.rnum = rset0.getInt("rnum");
			this.closptcrcur.add(rec);
		}
	}

	public String closptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord rec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.closseq;
			String name = rec.closyymm;
			
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
			SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord rec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.closseq;
			String name = rec.closyymm;
			
			sb.append("<input name=\"");
			sb.append("closseq");
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
			SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord rec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
			String code = rec.closseq;
			String name = rec.closyymm;
			
			sb.append("<input name=\"");
			sb.append("closseq");
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
	SS_L_CYBALON_CLOSPTCRDataSet ds = (SS_L_CYBALON_CLOSPTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.closptcrcur.size(); i++){
		SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord closptcrcurRec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)ds.closptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getClosptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= closptcrcurRec.closseq%>
<%= closptcrcurRec.closyymm%>
<%= closptcrcurRec.closdt%>
<%= closptcrcurRec.closyn%>
<%= closptcrcurRec.adjmnoit%>
<%= closptcrcurRec.adjmamt%>
<%= closptcrcurRec.clamamt%>
<%= closptcrcurRec.prvmmacmlun_recp%>
<%= closptcrcurRec.clamt%>
<%= closptcrcurRec.acmlun_recp%>
<%= closptcrcurRec.etc1%>
<%= closptcrcurRec.etc2%>
<%= closptcrcurRec.etc3%>
<%= closptcrcurRec.etc4%>
<%= closptcrcurRec.etc5%>
<%= closptcrcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 22 11:33:09 KST 2006 */