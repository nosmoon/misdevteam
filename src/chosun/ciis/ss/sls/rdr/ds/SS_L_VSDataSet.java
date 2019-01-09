/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-신청 조회(리스트)
* 작성일자 : 2009-03-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-신청 조회(리스트)
 */

public class SS_L_VSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_VSDataSet(){}
	public SS_L_VSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(17);
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_VSCURCOMMLISTRecord rec = new SS_L_VSCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.qty = rset0.getInt("qty");
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.clsfcd = rset0.getInt("clsfcd");
			rec.clsfnm = Util.checkString(rset0.getString("clsfnm"));
			rec.suspfrdt = Util.checkString(rset0.getString("suspfrdt"));
			rec.susptodt = Util.checkString(rset0.getString("susptodt"));
			rec.spcfdlvdt = Util.checkString(rset0.getString("spcfdlvdt"));
			rec.vaca_areadlvfrdt = Util.checkString(rset0.getString("vaca_areadlvfrdt"));
			rec.vaca_areadlvtodt = Util.checkString(rset0.getString("vaca_areadlvtodt"));
			rec.vaca_areazip = Util.checkString(rset0.getString("vaca_areazip"));
			rec.vaca_areaaddr = Util.checkString(rset0.getString("vaca_areaaddr"));
			rec.vaca_areadtlsaddr = Util.checkString(rset0.getString("vaca_areadtlsaddr"));
			rec.vaca_areaareanm = Util.checkString(rset0.getString("vaca_areaareanm"));
			rec.vaca_areabonm = Util.checkString(rset0.getString("vaca_areabonm"));
			rec.bocnfmyn = Util.checkString(rset0.getString("bocnfmyn"));
			rec.vaca_areadlvofficnfmyn = Util.checkString(rset0.getString("vaca_areadlvofficnfmyn"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_VSCURCOMMLISTRecord rec = (SS_L_VSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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
			SS_L_VSCURCOMMLISTRecord rec = (SS_L_VSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
			SS_L_VSCURCOMMLISTRecord rec = (SS_L_VSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	SS_L_VSDataSet ds = (SS_L_VSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_VSCURCOMMLISTRecord curcommlistRec = (SS_L_VSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
<%= curcommlistRec.qty%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.clsfcd%>
<%= curcommlistRec.clsfnm%>
<%= curcommlistRec.suspfrdt%>
<%= curcommlistRec.susptodt%>
<%= curcommlistRec.spcfdlvdt%>
<%= curcommlistRec.vaca_areadlvfrdt%>
<%= curcommlistRec.vaca_areadlvtodt%>
<%= curcommlistRec.vaca_areazip%>
<%= curcommlistRec.vaca_areaaddr%>
<%= curcommlistRec.vaca_areadtlsaddr%>
<%= curcommlistRec.vaca_areaareanm%>
<%= curcommlistRec.vaca_areabonm%>
<%= curcommlistRec.bocnfmyn%>
<%= curcommlistRec.vaca_areadlvofficnfmyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 10:37:01 KST 2009 */