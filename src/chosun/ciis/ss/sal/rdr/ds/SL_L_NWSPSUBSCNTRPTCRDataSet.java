/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBSCNTRPTCRDataSet.java
* 기능 : 독자정보관리(구독내역팝업-구독내역목록조회)
* 작성일자 : 2004-07-04
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(구독내역팝업-구독내역목록조회)
 *
 */

public class SL_L_NWSPSUBSCNTRPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList nwspsubscntrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_NWSPSUBSCNTRPTCRDataSet(){}
	public SL_L_NWSPSUBSCNTRPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = new SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.nwspsubscntrcur.add(rec);
		}
	}

	public String nwspsubscntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.medinm;
			
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

	public String nwspsubscntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String nwspsubscntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
	SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
		SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getNwspsubscntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= nwspsubscntrcurRec.rdr_extndt%>
<%= nwspsubscntrcurRec.medinm%>
<%= nwspsubscntrcurRec.suspdt%>
<%= nwspsubscntrcurRec.bonm%>
<%= nwspsubscntrcurRec.rdr_extntypenm%>
<%= nwspsubscntrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 04 20:08:21 KST 2004 */