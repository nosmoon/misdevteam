/***************************************************************************************************
* 파일명 : SS_L_INFOEXG_INITDataSet.java
* 기능 : 정보공유-공지사항,게시판-초기화면을 위한 DataSet
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
 * 정보공유-공지사항,게시판-초기화면을 위한 DataSet
 */


public class SS_L_INFOEXG_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList infoexglist = new ArrayList();
	public ArrayList rmsgexttcd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_INFOEXG_INITDataSet(){}
	public SS_L_INFOEXG_INITDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset3 = (ResultSet) cstmt.getObject(15);
		while(rset3.next()){
			SS_L_INFOEXG_INITINFOEXGLISTRecord rec = new SS_L_INFOEXG_INITINFOEXGLISTRecord();
			rec.seq = rset3.getInt("seq");
			rec.clsf = Util.checkString(rset3.getString("clsf"));
			rec.answergrp = rset3.getInt("answergrp");
			rec.answerseq = rset3.getInt("answerseq");
			rec.answerlevl = rset3.getInt("answerlevl");
			rec.notifrdt = Util.checkString(rset3.getString("notifrdt"));
			rec.notitodt = Util.checkString(rset3.getString("notitodt"));
			rec.regdt = rset3.getTimestamp("regdt");
			rec.upddt = rset3.getTimestamp("upddt");
			rec.makepersid = Util.checkString(rset3.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset3.getString("makepersnm"));
			rec.titl = Util.checkString(rset3.getString("titl"));
			rec.brwscnt = rset3.getInt("brwscnt");
			rec.recomcnt = rset3.getInt("recomcnt");
			rec.dwloadcnt = rset3.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.deptnm = Util.checkString(rset3.getString("deptnm"));
			rec.rmsgdept = Util.checkString(rset3.getString("rmsgdept"));
			rec.rmsgarea = Util.checkString(rset3.getString("rmsgarea"));
			rec.rmsgexttcd = Util.checkString(rset3.getString("rmsgexttcd"));
			rec.filenm = Util.checkString(rset3.getString("filenm"));
			rec.filesize = Util.checkString(rset3.getString("filesize"));
			this.infoexglist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(16);
		while(rset4.next()){
			SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord rec = new SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			this.rmsgexttcd_list.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(17);
		while(rset5.next()){
			SS_L_INFOEXG_INITBUSEOLISTRecord rec = new SS_L_INFOEXG_INITBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset5.getString("deptcd"));
			rec.boksnm = Util.checkString(rset5.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String rmsgexttcd_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord rec = (SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);


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

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_INITBUSEOLISTRecord)buseolist.get(i);


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
			SS_L_INFOEXG_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_INITBUSEOLISTRecord)buseolist.get(i);


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
			SS_L_INFOEXG_INITBUSEOLISTRecord rec = (SS_L_INFOEXG_INITBUSEOLISTRecord)buseolist.get(i);


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
	SS_L_INFOEXG_INITDataSet ds = (SS_L_INFOEXG_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.infoexglist.size(); i++){
		SS_L_INFOEXG_INITINFOEXGLISTRecord infoexglistRec = (SS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rmsgexttcd_list.size(); i++){
		SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord rmsgexttcd_listRec = (SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord)ds.rmsgexttcd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_INFOEXG_INITBUSEOLISTRecord buseolistRec = (SS_L_INFOEXG_INITBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getInfoexglist()%>
<%= ds.getRmsgexttcd_list()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= infoexglistRec.seq%>
<%= infoexglistRec.clsf%>
<%= infoexglistRec.answergrp%>
<%= infoexglistRec.answerseq%>
<%= infoexglistRec.answerlevl%>
<%= infoexglistRec.notifrdt%>
<%= infoexglistRec.notitodt%>
<%= infoexglistRec.regdt%>
<%= infoexglistRec.upddt%>
<%= infoexglistRec.makepersid%>
<%= infoexglistRec.makepersnm%>
<%= infoexglistRec.titl%>
<%= infoexglistRec.brwscnt%>
<%= infoexglistRec.recomcnt%>
<%= infoexglistRec.dwloadcnt%>
<%= infoexglistRec.deptcd%>
<%= infoexglistRec.deptnm%>
<%= infoexglistRec.rmsgdept%>
<%= infoexglistRec.rmsgarea%>
<%= infoexglistRec.rmsgexttcd%>
<%= infoexglistRec.filenm%>
<%= infoexglistRec.filesize%>
<%= rmsgexttcd_listRec.cicodeval%>
<%= rmsgexttcd_listRec.cicdnm%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 19:32:15 KST 2004 */