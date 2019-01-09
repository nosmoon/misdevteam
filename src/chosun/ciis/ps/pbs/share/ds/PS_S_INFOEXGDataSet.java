/***************************************************************************************************
* 파일명 : PS_S_INFOEXGDataSet.java
* 기능 : 출판 공지사항 상세
* 작성일자 : 2004-02-23
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
 * 출판국 공지사항 상세
 *
 */


public class PS_S_INFOEXGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long seq;
	public String clsf;
	public long answergrp;
	public long answerseq;
	public long answerlevl;
	public String notifrdt;
	public String notitodt;
	public String incmgdt;
	public String email;
	public String hmpg;
	public String titl;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;
	public String cont5;
	public long brwscnt;
	public long recomcnt;
	public long dwloadcnt;
	public String filenm;
	public String incmgpersnm;
	public String rmsgexttcd;

	public PS_S_INFOEXGDataSet(){}
	public PS_S_INFOEXGDataSet(String errcode, String errmsg, long seq, String clsf, long answergrp, long answerseq, long answerlevl, String notifrdt, String notitodt, String incmgdt, String email, String hmpg, String titl, String cont1, String cont2, String cont3, String cont4, String cont5, long brwscnt, long recomcnt, long dwloadcnt, String filenm, String incmgpersnm, String rmsgexttcd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.clsf = clsf;
		this.answergrp = answergrp;
		this.answerseq = answerseq;
		this.answerlevl = answerlevl;
		this.notifrdt = notifrdt;
		this.notitodt = notitodt;
		this.incmgdt = incmgdt;
		this.email = email;
		this.hmpg = hmpg;
		this.titl = titl;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.brwscnt = brwscnt;
		this.recomcnt = recomcnt;
		this.dwloadcnt = dwloadcnt;
		this.filenm = filenm;
		this.incmgpersnm = incmgpersnm;
		this.rmsgexttcd = rmsgexttcd;
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

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
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

	public void setBrwscnt(long brwscnt){
		this.brwscnt = brwscnt;
	}

	public void setRecomcnt(long recomcnt){
		this.recomcnt = recomcnt;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setIncmgpersnm(String incmgpersnm){
		this.incmgpersnm = incmgpersnm;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
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

	public String getIncmgdt(){
		return this.incmgdt;
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

	public long getBrwscnt(){
		return this.brwscnt;
	}

	public long getRecomcnt(){
		return this.recomcnt;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getIncmgpersnm(){
		return this.incmgpersnm;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(5);
		this.clsf = Util.checkString(cstmt.getString(6));
		this.answergrp = cstmt.getLong(7);
		this.answerseq = cstmt.getLong(8);
		this.answerlevl = cstmt.getLong(9);
		this.notifrdt = Util.checkString(cstmt.getString(10));
		this.notitodt = Util.checkString(cstmt.getString(11));
		this.incmgdt = Util.checkString(cstmt.getString(12));
		this.email = Util.checkString(cstmt.getString(13));
		this.hmpg = Util.checkString(cstmt.getString(14));
		this.titl = Util.checkString(cstmt.getString(15));
		
		// 보라에디터 적용시 내용표현에 ""가 필요함. 20090410		
		//this.cont1 = Util.checkString(cstmt.getString(16));
		//this.cont2 = Util.checkString(cstmt.getString(17));
		//this.cont3 = Util.checkString(cstmt.getString(18));
		//this.cont4 = Util.checkString(cstmt.getString(19));
		//this.cont5 = Util.checkString(cstmt.getString(20));
		
		this.cont1 = cstmt.getString(16);
		this.cont2 = cstmt.getString(17);
		this.cont3 = cstmt.getString(18);
		this.cont4 = cstmt.getString(19);
		this.cont5 = cstmt.getString(20);
		
		this.brwscnt = cstmt.getLong(21);
		this.recomcnt = cstmt.getLong(22);
		this.dwloadcnt = cstmt.getLong(23);
		this.filenm = Util.checkString(cstmt.getString(24));
		this.incmgpersnm = Util.checkString(cstmt.getString(25));
		this.rmsgexttcd = Util.checkString(cstmt.getString(26));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_INFOEXGDataSet ds = (PS_S_INFOEXGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

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
<%= ds.getIncmgdt()%>
<%= ds.getEmail()%>
<%= ds.getHmpg()%>
<%= ds.getTitl()%>
<%= ds.getCont1()%>
<%= ds.getCont2()%>
<%= ds.getCont3()%>
<%= ds.getCont4()%>
<%= ds.getCont5()%>
<%= ds.getBrwscnt()%>
<%= ds.getRecomcnt()%>
<%= ds.getDwloadcnt()%>
<%= ds.getFilenm()%>
<%= ds.getIncmgpersnm()%>
<%= ds.getRmsgexttcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 20:52:10 KST 2004 */