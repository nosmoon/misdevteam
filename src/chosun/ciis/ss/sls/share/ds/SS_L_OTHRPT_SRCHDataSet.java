/***************************************************************************************************
* 파일명 : SS_L_OTHRPT_SRCHDataSet.java
* 기능 : 정보공유-일지및보고서-타사동향보고-목록을 위한 DataSet
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
 * 정보공유-일지및보고서-타사동향보고-목록을 위한 DataSet
 */


public class SS_L_OTHRPT_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList othrptlist = new ArrayList();
	public ArrayList buseolist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_OTHRPT_SRCHDataSet(){}
	public SS_L_OTHRPT_SRCHDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(19);
		while(rset2.next()){
			SS_L_OTHRPT_SRCHOTHRPTLISTRecord rec = new SS_L_OTHRPT_SRCHOTHRPTLISTRecord();
			rec.seq = rset2.getInt("seq");
			rec.makedt = Util.checkString(rset2.getString("makedt"));
			rec.makepersid = Util.checkString(rset2.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset2.getString("makepersnm"));
			rec.brwscnt = rset2.getInt("brwscnt");
			rec.dwloadcnt = rset2.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			rec.filenm = Util.checkString(rset2.getString("filenm"));
			rec.filesize = Util.checkString(rset2.getString("filesize"));
			this.othrptlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(20);
		while(rset3.next()){
			SS_L_OTHRPT_SRCHBUSEOLISTRecord rec = new SS_L_OTHRPT_SRCHBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.boksnm = Util.checkString(rset3.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_SRCHBUSEOLISTRecord rec = (SS_L_OTHRPT_SRCHBUSEOLISTRecord)buseolist.get(i);


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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_SRCHBUSEOLISTRecord rec = (SS_L_OTHRPT_SRCHBUSEOLISTRecord)buseolist.get(i);


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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_SRCHBUSEOLISTRecord rec = (SS_L_OTHRPT_SRCHBUSEOLISTRecord)buseolist.get(i);


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
	SS_L_OTHRPT_SRCHDataSet ds = (SS_L_OTHRPT_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.othrptlist.size(); i++){
		SS_L_OTHRPT_SRCHOTHRPTLISTRecord othrptlistRec = (SS_L_OTHRPT_SRCHOTHRPTLISTRecord)ds.othrptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_OTHRPT_SRCHBUSEOLISTRecord buseolistRec = (SS_L_OTHRPT_SRCHBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getOthrptlist()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= othrptlistRec.seq%>
<%= othrptlistRec.makedt%>
<%= othrptlistRec.makepersid%>
<%= othrptlistRec.makepersnm%>
<%= othrptlistRec.brwscnt%>
<%= othrptlistRec.dwloadcnt%>
<%= othrptlistRec.deptcd%>
<%= othrptlistRec.deptnm%>
<%= othrptlistRec.filenm%>
<%= othrptlistRec.filesize%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 11 20:16:17 KST 2004 */