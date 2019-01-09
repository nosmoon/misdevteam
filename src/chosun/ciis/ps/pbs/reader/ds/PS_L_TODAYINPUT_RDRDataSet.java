/***************************************************************************************************
* 파일명 : SP_PS_L_TODAYINPUT_RDR.java
* 기능 :   독자-입력일자별 독자 조회화면
* 작성일자 : 2004-11-30
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-입력일자별 독자 조회화면
 *
 */

public class PS_L_TODAYINPUT_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList todayinputcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_TODAYINPUT_RDRDataSet(){}
	public PS_L_TODAYINPUT_RDRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rec = new PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.acpntypenm = Util.checkString(rset0.getString("acpntypenm"));
			rec.sendyncdflag = Util.checkString(rset0.getString("sendyncdflag"));
			this.todayinputcur.add(rec);
		}
	}

	public String todayinputcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = todayinputcur.size();
		for(int i=0; i<size; i++){
			PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)todayinputcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String todayinputcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = todayinputcur.size();
		for(int i=0; i<size; i++){
			PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)todayinputcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String todayinputcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = todayinputcur.size();
		for(int i=0; i<size; i++){
			PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)todayinputcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	PS_L_TODAYINPUT_RDRDataSet ds = (PS_L_TODAYINPUT_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.todayinputcur.size(); i++){
		PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord todayinputcurRec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)ds.todayinputcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getTodayinputcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= todayinputcurRec.rdr_no%>
<%= todayinputcurRec.medicd%>
<%= todayinputcurRec.termsubsno%>
<%= todayinputcurRec.bonm%>
<%= todayinputcurRec.rdrnm%>
<%= todayinputcurRec.medinm%>
<%= todayinputcurRec.subsfrser_no%>
<%= todayinputcurRec.rdrtel_no%>
<%= todayinputcurRec.dlvzip%>
<%= todayinputcurRec.dlvaddr%>
<%= todayinputcurRec.dlvdtlsaddr%>
<%= todayinputcurRec.email%>
<%= todayinputcurRec.acpntypenm%>
<%= todayinputcurRec.sendyncdflag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 21 16:19:56 KST 2005 */