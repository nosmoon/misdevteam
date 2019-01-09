/***************************************************************************************************
* 파일명 : SL_L_VSPTCRDataSet.java
* 기능 : 독자정보관리(구독내역팝업-휴독내역목록)
* 작성일자 : 2003-12-27
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
 * 독자정보관리(구독내역팝업-휴독내역목록)
 *
 */


public class SL_L_VSPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList vsptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_VSPTCRDataSet(){}
	public SL_L_VSPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_L_VSPTCRVSPTCRCURRecord rec = new SL_L_VSPTCRVSPTCRCURRecord();
			rec.suspfrdt = Util.checkString(rset0.getString("suspfrdt"));
			rec.susptodt = Util.checkString(rset0.getString("susptodt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.clsfnm = Util.checkString(rset0.getString("clsfnm"));
			this.vsptcrcur.add(rec);
		}
	}

	public String vsptcrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_L_VSPTCRVSPTCRCURRecord rec = (SL_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

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

	public String vsptcrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_L_VSPTCRVSPTCRCURRecord rec = (SL_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

			sb.append("<input name=\"");
			sb.append("suspfrdt");
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

	public String vsptcrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = vsptcrcur.size();
		for(int i=0; i<size; i++){
			SL_L_VSPTCRVSPTCRCURRecord rec = (SL_L_VSPTCRVSPTCRCURRecord)vsptcrcur.get(i);


			String code = rec.suspfrdt;
			String name = rec.susptodt;

			sb.append("<input name=\"");
			sb.append("suspfrdt");
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
	SL_L_VSPTCRDataSet ds = (SL_L_VSPTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.vsptcrcur.size(); i++){
		SL_L_VSPTCRVSPTCRCURRecord vsptcrcurRec = (SL_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getVsptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= vsptcrcurRec.suspfrdt%>
<%= vsptcrcurRec.susptodt%>
<%= vsptcrcurRec.medinm%>
<%= vsptcrcurRec.bonm%>
<%= vsptcrcurRec.clsfnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 11:39:03 KST 2003 */