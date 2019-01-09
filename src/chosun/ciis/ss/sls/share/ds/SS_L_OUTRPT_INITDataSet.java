/***************************************************************************************************
* 파일명 : SS_L_OUTRPT_INITDataSet.java
* 기능 : 정보공유-일지및보고서-출장보고서-초기화면-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일지및보고서-출장보고서-초기화면-목록을 위한 DataSet
 */

public class SS_L_OUTRPT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList outrptlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_OUTRPT_INITDataSet(){}
	public SS_L_OUTRPT_INITDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			SS_L_OUTRPT_INITOUTRPTLISTRecord rec = new SS_L_OUTRPT_INITOUTRPTLISTRecord();
			rec.makedt = Util.checkString(rset2.getString("makedt"));
			rec.makepersid = Util.checkString(rset2.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset2.getString("makepersnm"));
			rec.brwscnt = rset2.getInt("brwscnt");
			rec.dwloadcnt = rset2.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			rec.filenm = Util.checkString(rset2.getString("filenm"));
			rec.filesize = Util.checkString(rset2.getString("filesize"));
			this.outrptlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(15);
		while(rset3.next()){
			SS_L_OUTRPT_INITBUSEOLISTRecord rec = new SS_L_OUTRPT_INITBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.boksnm = Util.checkString(rset3.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String outrptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = outrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITOUTRPTLISTRecord rec = (SS_L_OUTRPT_INITOUTRPTLISTRecord)outrptlist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
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

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITBUSEOLISTRecord rec = (SS_L_OUTRPT_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String outrptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = outrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITOUTRPTLISTRecord rec = (SS_L_OUTRPT_INITOUTRPTLISTRecord)outrptlist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("makedt");
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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITBUSEOLISTRecord rec = (SS_L_OUTRPT_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String outrptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = outrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITOUTRPTLISTRecord rec = (SS_L_OUTRPT_INITOUTRPTLISTRecord)outrptlist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("makedt");
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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OUTRPT_INITBUSEOLISTRecord rec = (SS_L_OUTRPT_INITBUSEOLISTRecord)buseolist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	SS_L_OUTRPT_INITDataSet ds = (SS_L_OUTRPT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.outrptlist.size(); i++){
		SS_L_OUTRPT_INITOUTRPTLISTRecord outrptlistRec = (SS_L_OUTRPT_INITOUTRPTLISTRecord)ds.outrptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_OUTRPT_INITBUSEOLISTRecord buseolistRec = (SS_L_OUTRPT_INITBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getOutrptlist()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= outrptlistRec.makedt%>
<%= outrptlistRec.makepersid%>
<%= outrptlistRec.makepersnm%>
<%= outrptlistRec.brwscnt%>
<%= outrptlistRec.dwloadcnt%>
<%= outrptlistRec.deptcd%>
<%= outrptlistRec.deptnm%>
<%= outrptlistRec.filenm%>
<%= outrptlistRec.filesize%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 11 01:31:21 KST 2004 */