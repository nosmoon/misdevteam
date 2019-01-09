/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_INIT.java
* 기능 : 정보공유 게시판 - 공지사항
* 작성일자 : 2004-03-29
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판지사- 정보공유 게시판 - 공지사항-
 *
 */


public class PS_L_INFOEXG_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList infoexglist = new ArrayList();
	public ArrayList exttlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_INFOEXG_SRCHDataSet(){}
	public PS_L_INFOEXG_SRCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = new PS_L_INFOEXG_SRCHINFOEXGLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.answergrp = rset0.getInt("answergrp");
			rec.answerseq = rset0.getInt("answerseq");
			rec.answerlevl = rset0.getInt("answerlevl");
			rec.notifrdt = Util.checkString(rset0.getString("notifrdt"));
			rec.notitodt = Util.checkString(rset0.getString("notitodt"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.recomcnt = rset0.getInt("recomcnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgpersnm = Util.checkString(rset0.getString("incmgpersnm"));
			rec.incmgdt = rset0.getTimestamp("incmgdt");
			rec.rmsgexttcd = Util.checkString(rset0.getString("rmsgexttcd"));
			rec.rmsgexttnm = Util.checkString(rset0.getString("rmsgexttnm"));
			rec.rnum = rset0.getInt("rnum");
			this.infoexglist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			PS_L_INFOEXG_SRCHEXTTLISTRecord rec = new PS_L_INFOEXG_SRCHEXTTLISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.exttlist.add(rec);
		}
	}
/*
	public String infoexglistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = infoexglist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)infoexglist.get(i);


			String code = rec.seq;
			String name = rec.clsf;

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
*/
	public String exttlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exttlist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHEXTTLISTRecord rec = (PS_L_INFOEXG_SRCHEXTTLISTRecord)exttlist.get(i);


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
/*
	public String infoexglistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = infoexglist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)infoexglist.get(i);


			String code = rec.seq;
			String name = rec.clsf;

			sb.append("<input name=\"");
			sb.append("seq");
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
*/
	public String exttlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exttlist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHEXTTLISTRecord rec = (PS_L_INFOEXG_SRCHEXTTLISTRecord)exttlist.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
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
/*
	public String infoexglistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = infoexglist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)infoexglist.get(i);


			String code = rec.seq;
			String name = rec.clsf;

			sb.append("<input name=\"");
			sb.append("seq");
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
*/
	public String exttlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exttlist.size();
		for(int i=0; i<size; i++){
			PS_L_INFOEXG_SRCHEXTTLISTRecord rec = (PS_L_INFOEXG_SRCHEXTTLISTRecord)exttlist.get(i);


			String code = rec.cicodeval;
			String name = rec.cicdnm;

			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	PS_L_INFOEXG_SRCHDataSet ds = (PS_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.infoexglist.size(); i++){
		PS_L_INFOEXG_SRCHINFOEXGLISTRecord infoexglistRec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.exttlist.size(); i++){
		PS_L_INFOEXG_SRCHEXTTLISTRecord exttlistRec = (PS_L_INFOEXG_SRCHEXTTLISTRecord)ds.exttlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getInfoexglist()%>
<%= ds.getExttlist()%>
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
<%= infoexglistRec.titl%>
<%= infoexglistRec.brwscnt%>
<%= infoexglistRec.recomcnt%>
<%= infoexglistRec.dwloadcnt%>
<%= infoexglistRec.deptcd%>
<%= infoexglistRec.deptnm%>
<%= infoexglistRec.filenm%>
<%= infoexglistRec.filesize%>
<%= infoexglistRec.incmgpers%>
<%= infoexglistRec.incmgpersnm%>
<%= infoexglistRec.incmgdt%>
<%= infoexglistRec.rmsgexttcd%>
<%= infoexglistRec.rmsgexttnm%>
<%= infoexglistRec.rnum%>
<%= exttlistRec.cicodeval%>
<%= exttlistRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 17 21:20:50 KST 2004 */