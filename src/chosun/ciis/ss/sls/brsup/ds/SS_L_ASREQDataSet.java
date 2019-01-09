/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매국-지국지원-컴퓨터AS
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *
 */

public class SS_L_ASREQDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curasreqlist = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curcomplist = new ArrayList();
	public ArrayList curasstat = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_ASREQDataSet(){}
	public SS_L_ASREQDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_ASREQCURDEPTCDRecord rec = new SS_L_ASREQCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SS_L_ASREQCURASREQLISTRecord rec = new SS_L_ASREQCURASREQLISTRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.eqpno = Util.checkString(rset1.getString("eqpno"));
			rec.regdt = Util.checkString(rset1.getString("regdt"));
			rec.regno = Util.checkString(rset1.getString("regno"));
			rec.as_stat = Util.checkString(rset1.getString("as_stat"));
			rec.acpndt = Util.checkString(rset1.getString("acpndt"));
			rec.nddt = Util.checkString(rset1.getString("nddt"));
			rec.req_rmk = Util.checkString(rset1.getString("req_rmk"));
			this.curasreqlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			SS_L_ASREQCURASSTATRecord rec = new SS_L_ASREQCURASSTATRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curasstat.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(16);
		while(rset3.next()){
			SS_L_ASREQCURCOMPLISTRecord rec = new SS_L_ASREQCURCOMPLISTRecord();
			rec.eqpno = Util.checkString(rset3.getString("eqpno"));
			rec.computernm = Util.checkString(rset3.getString("computernm"));
			this.curcomplist.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURDEPTCDRecord rec = (SS_L_ASREQCURDEPTCDRecord)curdeptcd.get(i);


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

	public String curasreqlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasreqlist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASREQLISTRecord rec = (SS_L_ASREQCURASREQLISTRecord)curasreqlist.get(i);


			String code = rec.bocd;
			String name = rec.eqpno;

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

	public String curasstatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasstat.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASSTATRecord rec = (SS_L_ASREQCURASSTATRecord)curasstat.get(i);


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

	public String curcomplistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcomplist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURCOMPLISTRecord rec = (SS_L_ASREQCURCOMPLISTRecord)curcomplist.get(i);


			String code = rec.eqpno;
			String name = rec.computernm;

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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURDEPTCDRecord rec = (SS_L_ASREQCURDEPTCDRecord)curdeptcd.get(i);


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

	public String curasreqlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasreqlist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASREQLISTRecord rec = (SS_L_ASREQCURASREQLISTRecord)curasreqlist.get(i);


			String code = rec.bocd;
			String name = rec.eqpno;

			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String curasstatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasstat.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASSTATRecord rec = (SS_L_ASREQCURASSTATRecord)curasstat.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String curcomplistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcomplist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURCOMPLISTRecord rec = (SS_L_ASREQCURCOMPLISTRecord)curcomplist.get(i);


			String code = rec.eqpno;
			String name = rec.computernm;

			sb.append("<input name=\"");
			sb.append("eqpno");
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURDEPTCDRecord rec = (SS_L_ASREQCURDEPTCDRecord)curdeptcd.get(i);


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

	public String curasreqlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasreqlist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASREQLISTRecord rec = (SS_L_ASREQCURASREQLISTRecord)curasreqlist.get(i);


			String code = rec.bocd;
			String name = rec.eqpno;

			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String curasstatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curasstat.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURASSTATRecord rec = (SS_L_ASREQCURASSTATRecord)curasstat.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String curcomplistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcomplist.size();
		for(int i=0; i<size; i++){
			SS_L_ASREQCURCOMPLISTRecord rec = (SS_L_ASREQCURCOMPLISTRecord)curcomplist.get(i);


			String code = rec.eqpno;
			String name = rec.computernm;

			sb.append("<input name=\"");
			sb.append("eqpno");
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
	SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_ASREQCURDEPTCDRecord curdeptcdRec = (SS_L_ASREQCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curasreqlist.size(); i++){
		SS_L_ASREQCURASREQLISTRecord curasreqlistRec = (SS_L_ASREQCURASREQLISTRecord)ds.curasreqlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curasstat.size(); i++){
		SS_L_ASREQCURASSTATRecord curasstatRec = (SS_L_ASREQCURASSTATRecord)ds.curasstat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcomplist.size(); i++){
		SS_L_ASREQCURCOMPLISTRecord curcomplistRec = (SS_L_ASREQCURCOMPLISTRecord)ds.curcomplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurasreqlist()%>
<%= ds.getCurasstat()%>
<%= ds.getCurcomplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curasreqlistRec.bocd%>
<%= curasreqlistRec.eqpno%>
<%= curasreqlistRec.regdt%>
<%= curasreqlistRec.regno%>
<%= curasreqlistRec.as_stat%>
<%= curasreqlistRec.acpndt%>
<%= curasreqlistRec.nddt%>
<%= curasreqlistRec.req_rmk%>
<%= curasstatRec.ciymgbcd%>
<%= curasstatRec.cicdgb%>
<%= curasstatRec.cicodeval%>
<%= curasstatRec.cicdnm%>
<%= curasstatRec.cicdynm%>
<%= curcomplistRec.eqpno%>
<%= curcomplistRec.computernm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 12 16:24:16 KST 2004 */