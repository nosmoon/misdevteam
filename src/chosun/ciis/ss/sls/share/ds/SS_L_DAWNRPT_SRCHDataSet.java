/***************************************************************************************************
* 파일명 : SS_L_DAWNRPT_SRCHDataSet.java
* 기능 : 정보공유-일지및보고서-새벽근무보고서-검색목록을 위한 DataSet
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
 * 정보공유-일지및보고서-새벽근무보고서-검색목록을 위한 DataSet
 */

public class SS_L_DAWNRPT_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dawnrptlist = new ArrayList();
	public ArrayList buseolist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_DAWNRPT_SRCHDataSet(){}
	public SS_L_DAWNRPT_SRCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord rec = new SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord();
			rec.makedt = Util.checkString(rset0.getString("makedt"));
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			this.dawnrptlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(20);
		while(rset1.next()){
			SS_L_DAWNRPT_SRCHBUSEOLISTRecord rec = new SS_L_DAWNRPT_SRCHBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String dawnrptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dawnrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord rec = (SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord)dawnrptlist.get(i);
			
			
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
			SS_L_DAWNRPT_SRCHBUSEOLISTRecord rec = (SS_L_DAWNRPT_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String dawnrptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dawnrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord rec = (SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord)dawnrptlist.get(i);
			
			
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
			SS_L_DAWNRPT_SRCHBUSEOLISTRecord rec = (SS_L_DAWNRPT_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String dawnrptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dawnrptlist.size();
		for(int i=0; i<size; i++){
			SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord rec = (SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord)dawnrptlist.get(i);
			
			
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
			SS_L_DAWNRPT_SRCHBUSEOLISTRecord rec = (SS_L_DAWNRPT_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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
	SS_L_DAWNRPT_SRCHDataSet ds = (SS_L_DAWNRPT_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dawnrptlist.size(); i++){
		SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord dawnrptlistRec = (SS_L_DAWNRPT_SRCHDAWNRPTLISTRecord)ds.dawnrptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_DAWNRPT_SRCHBUSEOLISTRecord buseolistRec = (SS_L_DAWNRPT_SRCHBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getDawnrptlist()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dawnrptlistRec.makedt%>
<%= dawnrptlistRec.makepersid%>
<%= dawnrptlistRec.makepersnm%>
<%= dawnrptlistRec.brwscnt%>
<%= dawnrptlistRec.dwloadcnt%>
<%= dawnrptlistRec.deptcd%>
<%= dawnrptlistRec.deptnm%>
<%= dawnrptlistRec.filenm%>
<%= dawnrptlistRec.filesize%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 11 15:12:25 KST 2004 */