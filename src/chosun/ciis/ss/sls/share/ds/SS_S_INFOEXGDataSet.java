/***************************************************************************************************
* 파일명 : SS_S_INFOEXGDataSet.java
* 기능 : 정보공유 게시판 상세
* 작성일자 : 2004-05-20
* 작성자 : 고윤홍
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
 * 정보공유 게시판 상세
 *
 */

public class SS_S_INFOEXGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList rmsgexttcd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public long seq;
	public String clsf;
	public long answergrp;
	public long answerseq;
	public long answerlevl;
	public String notifrdt;
	public String notitodt;
	public String regdt;
	public String makepersnm;
	public String makepersid;
	public String email;
	public String hmpg;
	public String titl;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;
	public String cont5;
	public String rmsgdept;
	public String rmsgarea;
	public String rmsgareanm;
	public String rmsgexttcd;
	public long brwscnt;
	public long recomcnt;
	public long dwloadcnt;
	public String deptnm;
	public String filenm;

	public SS_S_INFOEXGDataSet(){}
	public SS_S_INFOEXGDataSet(String errcode, String errmsg, long seq, String clsf, long answergrp, long answerseq, long answerlevl, String notifrdt, String notitodt, String regdt, String makepersnm, String makepersid, String email, String hmpg, String titl, String cont1, String cont2, String cont3, String cont4, String cont5, String rmsgdept, String rmsgarea, String rmsgareanm, String rmsgexttcd, long brwscnt, long recomcnt, long dwloadcnt, String deptnm, String filenm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.clsf = clsf;
		this.answergrp = answergrp;
		this.answerseq = answerseq;
		this.answerlevl = answerlevl;
		this.notifrdt = notifrdt;
		this.notitodt = notitodt;
		this.regdt = regdt;
		this.makepersnm = makepersnm;
		this.makepersid = makepersid;
		this.email = email;
		this.hmpg = hmpg;
		this.titl = titl;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.rmsgdept = rmsgdept;
		this.rmsgarea = rmsgarea;
		this.rmsgareanm = rmsgareanm;
		this.rmsgexttcd = rmsgexttcd;
		this.brwscnt = brwscnt;
		this.recomcnt = recomcnt;
		this.dwloadcnt = dwloadcnt;
		this.deptnm = deptnm;
		this.filenm = filenm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setAnswergrp(long answergrp){
		this.answergrp = answergrp;
	}

	public void setAnswerseq(long answerseq){
		this.answerseq = answerseq;
	}

	public void setAnswerlevl(long answerlevl){
		this.answerlevl = answerlevl;
	}

	public void setNotifrdt(String notifrdt){
		this.notifrdt = notifrdt;
	}

	public void setNotitodt(String notitodt){
		this.notitodt = notitodt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setHmpg(String hmpg){
		this.hmpg = hmpg;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont1(String cont1){
		this.cont1 = cont1;
	}

	public void setCont2(String cont2){
		this.cont2 = cont2;
	}

	public void setCont3(String cont3){
		this.cont3 = cont3;
	}

	public void setCont4(String cont4){
		this.cont4 = cont4;
	}

	public void setCont5(String cont5){
		this.cont5 = cont5;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgareanm(String rmsgareanm){
		this.rmsgareanm = rmsgareanm;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
	}

	public void setBrwscnt(long brwscnt){
		this.brwscnt = brwscnt;
	}

	public void setRecomcnt(long recomcnt){
		this.recomcnt = recomcnt;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getClsf(){
		return this.clsf;
	}

	public long getAnswergrp(){
		return this.answergrp;
	}

	public long getAnswerseq(){
		return this.answerseq;
	}

	public long getAnswerlevl(){
		return this.answerlevl;
	}

	public String getNotifrdt(){
		return this.notifrdt;
	}

	public String getNotitodt(){
		return this.notitodt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getEmail(){
		return this.email;
	}

	public String getHmpg(){
		return this.hmpg;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont1(){
		return this.cont1;
	}

	public String getCont2(){
		return this.cont2;
	}

	public String getCont3(){
		return this.cont3;
	}

	public String getCont4(){
		return this.cont4;
	}

	public String getCont5(){
		return this.cont5;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgareanm(){
		return this.rmsgareanm;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public long getBrwscnt(){
		return this.brwscnt;
	}

	public long getRecomcnt(){
		return this.recomcnt;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(8);
		this.clsf = Util.checkString(cstmt.getString(9));
		this.answergrp = cstmt.getLong(10);
		this.answerseq = cstmt.getLong(11);
		this.answerlevl = cstmt.getLong(12);
		this.notifrdt = Util.checkString(cstmt.getString(13));
		this.notitodt = Util.checkString(cstmt.getString(14));
		this.regdt = Util.checkString(cstmt.getString(15));
		this.makepersnm = Util.checkString(cstmt.getString(16));
		this.makepersid = Util.checkString(cstmt.getString(17));
		this.email = Util.checkString(cstmt.getString(18));
		this.hmpg = Util.checkString(cstmt.getString(19));
		this.titl = Util.checkString(cstmt.getString(20));

		// 보라에디터 적용시 내용표현에 ""가 필요함. 20090410
		//this.cont1 = Util.checkString(cstmt.getString(21));
		//this.cont2 = Util.checkString(cstmt.getString(22));
		//this.cont3 = Util.checkString(cstmt.getString(23));
		//this.cont4 = Util.checkString(cstmt.getString(24));
		//this.cont5 = Util.checkString(cstmt.getString(25));
		this.cont1 = cstmt.getString(21);
		this.cont2 = cstmt.getString(22);
		this.cont3 = cstmt.getString(23);
		this.cont4 = cstmt.getString(24);
		this.cont5 = cstmt.getString(25);
		
		this.rmsgdept = Util.checkString(cstmt.getString(26));
		this.rmsgarea = Util.checkString(cstmt.getString(27));
		this.rmsgareanm = Util.checkString(cstmt.getString(28));
		this.rmsgexttcd = Util.checkString(cstmt.getString(29));
		this.brwscnt = cstmt.getLong(30);
		this.recomcnt = cstmt.getLong(31);
		this.dwloadcnt = cstmt.getLong(32);
		this.deptnm = Util.checkString(cstmt.getString(33));
		this.filenm = Util.checkString(cstmt.getString(34));
		ResultSet rset0 = (ResultSet) cstmt.getObject(35);
		while(rset0.next()){
			SS_S_INFOEXGRMSGEXTTCD_LISTRecord rec = new SS_S_INFOEXGRMSGEXTTCD_LISTRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.rmsgexttcd_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(36);
		while(rset1.next()){
			SS_S_INFOEXGBUSEOLISTRecord rec = new SS_S_INFOEXGBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String rmsgexttcd_listOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_S_INFOEXGRMSGEXTTCD_LISTRecord rec = (SS_S_INFOEXGRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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
			SS_S_INFOEXGBUSEOLISTRecord rec = (SS_S_INFOEXGBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String rmsgexttcd_listChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_S_INFOEXGRMSGEXTTCD_LISTRecord rec = (SS_S_INFOEXGRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_S_INFOEXGBUSEOLISTRecord rec = (SS_S_INFOEXGBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String rmsgexttcd_listRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rmsgexttcd_list.size();
		for(int i=0; i<size; i++){
			SS_S_INFOEXGRMSGEXTTCD_LISTRecord rec = (SS_S_INFOEXGRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);
			
			
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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_S_INFOEXGBUSEOLISTRecord rec = (SS_S_INFOEXGBUSEOLISTRecord)buseolist.get(i);
			
			
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
	SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rmsgexttcd_list.size(); i++){
		SS_S_INFOEXGRMSGEXTTCD_LISTRecord rmsgexttcd_listRec = (SS_S_INFOEXGRMSGEXTTCD_LISTRecord)ds.rmsgexttcd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_S_INFOEXGBUSEOLISTRecord buseolistRec = (SS_S_INFOEXGBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getClsf()%>
<%= ds.getAnswergrp()%>
<%= ds.getAnswerseq()%>
<%= ds.getAnswerlevl()%>
<%= ds.getNotifrdt()%>
<%= ds.getNotitodt()%>
<%= ds.getRegdt()%>
<%= ds.getMakepersnm()%>
<%= ds.getMakepersid()%>
<%= ds.getEmail()%>
<%= ds.getHmpg()%>
<%= ds.getTitl()%>
<%= ds.getCont1()%>
<%= ds.getCont2()%>
<%= ds.getCont3()%>
<%= ds.getCont4()%>
<%= ds.getCont5()%>
<%= ds.getRmsgdept()%>
<%= ds.getRmsgarea()%>
<%= ds.getRmsgareanm()%>
<%= ds.getRmsgexttcd()%>
<%= ds.getBrwscnt()%>
<%= ds.getRecomcnt()%>
<%= ds.getDwloadcnt()%>
<%= ds.getDeptnm()%>
<%= ds.getFilenm()%>
<%= ds.getRmsgexttcd_list()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rmsgexttcd_listRec.cicodeval%>
<%= rmsgexttcd_listRec.cicdnm%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 10:52:21 KST 2004 */