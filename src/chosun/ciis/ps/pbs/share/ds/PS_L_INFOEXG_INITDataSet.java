/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_INIT.java
* 기능 : 정보공유 게시판 - 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
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
 * 출판국- 정보공유 게시판 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
 *
 */

public class PS_L_INFOEXG_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList infoexglist = new ArrayList();
	public ArrayList exttlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long unconfcnt;
	public long unreg_aprv;
	public long unreg_aprvreq;
	public long unreg_unaprv;
	public long undsct;
	public long unmove;
	public String chrgptph;

	public PS_L_INFOEXG_INITDataSet(){}
	public PS_L_INFOEXG_INITDataSet(String errcode, String errmsg, long totalcnt, long unconfcnt, long unreg_aprv, long unreg_aprvreq, long unreg_unaprv, long undsct, long unmove, String chrgptph){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.unconfcnt = unconfcnt;
		this.unreg_aprv = unreg_aprv;
		this.unreg_aprvreq = unreg_aprvreq;
		this.unreg_unaprv = unreg_unaprv;
		this.undsct = undsct;
		this.unmove = unmove;
		this.chrgptph = chrgptph;
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

	public void setUnconfcnt(long unconfcnt){
		this.unconfcnt = unconfcnt;
	}

	public void setUnreg_aprv(long unreg_aprv){
		this.unreg_aprv = unreg_aprv;
	}

	public void setUnreg_aprvreq(long unreg_aprvreq){
		this.unreg_aprvreq = unreg_aprvreq;
	}

	public void setUnreg_unaprv(long unreg_unaprv){
		this.unreg_unaprv = unreg_unaprv;
	}

	public void setUndsct(long undsct){
		this.undsct = undsct;
	}

	public void setUnmove(long unmove){
		this.unmove = unmove;
	}

	public void setChrgptph(String chrgptph){
		this.chrgptph = chrgptph;
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

	public long getUnconfcnt(){
		return this.unconfcnt;
	}

	public long getUnreg_aprv(){
		return this.unreg_aprv;
	}

	public long getUnreg_aprvreq(){
		return this.unreg_aprvreq;
	}

	public long getUnreg_unaprv(){
		return this.unreg_unaprv;
	}

	public long getUndsct(){
		return this.undsct;
	}

	public long getUnmove(){
		return this.unmove;
	}

	public String getChrgptph(){
		return this.chrgptph;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(9);
		this.unconfcnt = cstmt.getLong(10);
		this.unreg_aprv = cstmt.getLong(11);
		this.unreg_aprvreq = cstmt.getLong(12);
		this.unreg_unaprv = cstmt.getLong(13);
		this.undsct = cstmt.getLong(14);
		this.unmove = cstmt.getLong(15);
		this.chrgptph = Util.checkString(cstmt.getString(16));
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			PS_L_INFOEXG_INITINFOEXGLISTRecord rec = new PS_L_INFOEXG_INITINFOEXGLISTRecord();
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(18);
		while(rset1.next()){
			PS_L_INFOEXG_INITEXTTLISTRecord rec = new PS_L_INFOEXG_INITEXTTLISTRecord();
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
			PS_L_INFOEXG_INITINFOEXGLISTRecord rec = (PS_L_INFOEXG_INITINFOEXGLISTRecord)infoexglist.get(i);


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
			PS_L_INFOEXG_INITEXTTLISTRecord rec = (PS_L_INFOEXG_INITEXTTLISTRecord)exttlist.get(i);


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
			PS_L_INFOEXG_INITINFOEXGLISTRecord rec = (PS_L_INFOEXG_INITINFOEXGLISTRecord)infoexglist.get(i);


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
			PS_L_INFOEXG_INITEXTTLISTRecord rec = (PS_L_INFOEXG_INITEXTTLISTRecord)exttlist.get(i);


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
			PS_L_INFOEXG_INITINFOEXGLISTRecord rec = (PS_L_INFOEXG_INITINFOEXGLISTRecord)infoexglist.get(i);


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
			PS_L_INFOEXG_INITEXTTLISTRecord rec = (PS_L_INFOEXG_INITEXTTLISTRecord)exttlist.get(i);


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
	PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.infoexglist.size(); i++){
		PS_L_INFOEXG_INITINFOEXGLISTRecord infoexglistRec = (PS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.exttlist.size(); i++){
		PS_L_INFOEXG_INITEXTTLISTRecord exttlistRec = (PS_L_INFOEXG_INITEXTTLISTRecord)ds.exttlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getUnconfcnt()%>
<%= ds.getUnreg_aprv()%>
<%= ds.getUnreg_aprvreq()%>
<%= ds.getUnreg_unaprv()%>
<%= ds.getUndsct()%>
<%= ds.getUnmove()%>
<%= ds.getChrgptph()%>
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


/* 작성시간 : Tue Jul 25 16:28:24 KST 2006 */
