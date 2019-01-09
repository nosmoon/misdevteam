/***************************************************************************************************
* 파일명 : SP_PS_L_EMPCAMP_SEARCH.java
* 수당-캠페인관리 캠페인수당 내역조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-캠페인관리 캠페인수당내역 조회
 *
 */

  

public class PS_L_EMPCAMP_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList empcampcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_EMPCAMP_SEARCHDataSet(){}
	public PS_L_EMPCAMP_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = new PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.boemp_nm = Util.checkString(rset0.getString("boemp_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.aloncd = Util.checkString(rset0.getString("aloncd"));
			rec.campseq = Util.checkString(rset0.getString("campseq"));
			rec.amt = rset0.getInt("amt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.rnum = rset0.getInt("rnum");
			this.empcampcur.add(rec);
		}
	}

	public String empcampcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
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

	public String empcampcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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

	public String empcampcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
	PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.empcampcur.size(); i++){
		PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord empcampcurRec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)ds.empcampcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getEmpcampcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= empcampcurRec.cmpycd%>
<%= empcampcurRec.bocd%>
<%= empcampcurRec.bonm%>
<%= empcampcurRec.boemp_no%>
<%= empcampcurRec.boemp_nm%>
<%= empcampcurRec.dept_nm%>
<%= empcampcurRec.aloncd%>
<%= empcampcurRec.campseq%>
<%= empcampcurRec.amt%>
<%= empcampcurRec.deptcd%>
<%= empcampcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 11 17:51:23 KST 2004 */