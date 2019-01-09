/***************************************************************************************************
* 파일명 : .java
* 기능 : *사이버센터-사이버수당청구-조회
* 작성일자 : 2009-04-27
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 사이버센터-사이버수당청구-조회
 */

public class SS_L_CYBALON_BOCLAMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList boalonclamlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_CYBALON_BOCLAMDataSet(){}
	public SS_L_CYBALON_BOCLAMDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord rec = new SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord();
			rec.closyymm = Util.checkString(rset0.getString("closyymm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.adjmnoit = rset0.getInt("adjmnoit");
			rec.adjmamt = rset0.getInt("adjmamt");
			rec.clamamt = rset0.getInt("clamamt");
			rec.prvmmacmlun_recp = rset0.getInt("prvmmacmlun_recp");
			rec.clamt = rset0.getInt("clamt");
			rec.acmlun_recp = rset0.getInt("acmlun_recp");
			rec.hdqtcnfmyn = Util.checkString(rset0.getString("hdqtcnfmyn"));
			rec.hdqtcnfmdt = Util.checkString(rset0.getString("hdqtcnfmdt"));
			rec.rnum = rset0.getInt("rnum");
			this.boalonclamlist.add(rec);
		}
	}

	public String boalonclamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = boalonclamlist.size();
		for(int i=0; i<size; i++){
			SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord rec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)boalonclamlist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.deptcd;
			
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

	public String boalonclamlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = boalonclamlist.size();
		for(int i=0; i<size; i++){
			SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord rec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)boalonclamlist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("closyymm");
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

	public String boalonclamlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = boalonclamlist.size();
		for(int i=0; i<size; i++){
			SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord rec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)boalonclamlist.get(i);
			
			
			String code = rec.closyymm;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("closyymm");
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
	SS_L_CYBALON_BOCLAMDataSet ds = (SS_L_CYBALON_BOCLAMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.boalonclamlist.size(); i++){
		SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord boalonclamlistRec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)ds.boalonclamlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getBoalonclamlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= boalonclamlistRec.closyymm%>
<%= boalonclamlistRec.deptcd%>
<%= boalonclamlistRec.deptnm%>
<%= boalonclamlistRec.areacd%>
<%= boalonclamlistRec.areanm%>
<%= boalonclamlistRec.bocd%>
<%= boalonclamlistRec.bonm%>
<%= boalonclamlistRec.rdrcnt%>
<%= boalonclamlistRec.adjmnoit%>
<%= boalonclamlistRec.adjmamt%>
<%= boalonclamlistRec.clamamt%>
<%= boalonclamlistRec.prvmmacmlun_recp%>
<%= boalonclamlistRec.clamt%>
<%= boalonclamlistRec.acmlun_recp%>
<%= boalonclamlistRec.hdqtcnfmyn%>
<%= boalonclamlistRec.hdqtcnfmdt%>
<%= boalonclamlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 20:31:26 KST 2009 */