/***************************************************************************************************
* 파일명 : SP_PS_L_WEEKSND_CLOSPTCR.java  
* 기능 :   출판업무지원시스템 정산마감 조회화면
* 작성일자 : 2007-11-02
* 작성자 : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 *  출판업무지원시스템 정산마감 조회화면
 *
 **/

public class PS_L_WEEKSND_CLOSPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList closptcrcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_WEEKSND_CLOSPTCRDataSet(){}
	public PS_L_WEEKSND_CLOSPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord rec = new PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord rec = new PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord();
			rec.clsfcd = Util.checkString(rset1.getString("clsfcd"));
			rec.closseq = Util.checkString(rset1.getString("closseq"));
			rec.closyymm = Util.checkString(rset1.getString("closyymm"));
			rec.frsubscd = Util.checkString(rset1.getString("frsubscd"));
			rec.tosubscd = Util.checkString(rset1.getString("tosubscd"));
			rec.closdt = Util.checkString(rset1.getString("closdt"));
			rec.closyn = Util.checkString(rset1.getString("closyn"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.lumpcnt = rset1.getInt("lumpcnt");
			rec.addcnt = rset1.getInt("addcnt");
			rec.totcnt = rset1.getInt("totcnt");
			rec.lumpamt = rset1.getInt("lumpamt");
			rec.addamt = rset1.getInt("addamt");
			rec.totamt = rset1.getInt("totamt");
			rec.etc1 = Util.checkString(rset1.getString("etc1"));
			rec.etc2 = Util.checkString(rset1.getString("etc2"));
			rec.etc3 = Util.checkString(rset1.getString("etc3"));
			rec.rnum = rset1.getInt("rnum");
			this.closptcrcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord rec = (PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String closptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord rec = (PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord rec = (PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String closptcrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord rec = (PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord rec = (PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String closptcrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = closptcrcur.size();
		for(int i=0; i<size; i++){
			PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord rec = (PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord)closptcrcur.get(i);
			
			
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
	PS_L_WEEKSND_CLOSPTCRDataSet ds = (PS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord medicdcurRec = (PS_L_WEEKSND_CLOSPTCRMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.closptcrcur.size(); i++){
		PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord closptcrcurRec = (PS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord)ds.closptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMedicdcur()%>
<%= ds.getClosptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= closptcrcurRec.clsfcd%>
<%= closptcrcurRec.closseq%>
<%= closptcrcurRec.closyymm%>
<%= closptcrcurRec.frsubscd%>
<%= closptcrcurRec.tosubscd%>
<%= closptcrcurRec.closdt%>
<%= closptcrcurRec.closyn%>
<%= closptcrcurRec.medicd%>
<%= closptcrcurRec.medinm%>
<%= closptcrcurRec.lumpcnt%>
<%= closptcrcurRec.addcnt%>
<%= closptcrcurRec.totcnt%>
<%= closptcrcurRec.lumpamt%>
<%= closptcrcurRec.addamt%>
<%= closptcrcurRec.totamt%>
<%= closptcrcurRec.etc1%>
<%= closptcrcurRec.etc2%>
<%= closptcrcurRec.etc3%>
<%= closptcrcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 02 11:18:09 KST 2007 */