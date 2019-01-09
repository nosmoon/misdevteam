/***************************************************************************************************
* 파일명 : SS_S_OTHRPTDataSet.java
* 기능 : 정보공유 타사동향보고
* 작성일자 : 2003-12-26
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
 * class definition
 *
 */


public class SS_S_OTHRPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long seq;
	public String makedt;
	public String makepersid;
	public String makepersnm;
	public String deptnm;
	public String jungpoly;
	public String jungmovmt;
	public String jungetc;
	public String dongpoly;
	public String dongmovmt;
	public String dongetc;
	public String etcpoly;
	public String etcmovmt;
	public String etcetc;
	public long brwscnt;
	public long dwloadcnt;
	public String filenm;
	public String filesize;

	public SS_S_OTHRPTDataSet(){}
	public SS_S_OTHRPTDataSet(String errcode, String errmsg, long seq, String makedt, String makepersid, String makepersnm, String deptnm, String jungpoly, String jungmovmt, String jungetc, String dongpoly, String dongmovmt, String dongetc, String etcpoly, String etcmovmt, String etcetc, long brwscnt, long dwloadcnt, String filenm, String filesize){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.deptnm = deptnm;
		this.jungpoly = jungpoly;
		this.jungmovmt = jungmovmt;
		this.jungetc = jungetc;
		this.dongpoly = dongpoly;
		this.dongmovmt = dongmovmt;
		this.dongetc = dongetc;
		this.etcpoly = etcpoly;
		this.etcmovmt = etcmovmt;
		this.etcetc = etcetc;
		this.brwscnt = brwscnt;
		this.dwloadcnt = dwloadcnt;
		this.filenm = filenm;
		this.filesize = filesize;
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

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setJungpoly(String jungpoly){
		this.jungpoly = jungpoly;
	}

	public void setJungmovmt(String jungmovmt){
		this.jungmovmt = jungmovmt;
	}

	public void setJungetc(String jungetc){
		this.jungetc = jungetc;
	}

	public void setDongpoly(String dongpoly){
		this.dongpoly = dongpoly;
	}

	public void setDongmovmt(String dongmovmt){
		this.dongmovmt = dongmovmt;
	}

	public void setDongetc(String dongetc){
		this.dongetc = dongetc;
	}

	public void setEtcpoly(String etcpoly){
		this.etcpoly = etcpoly;
	}

	public void setEtcmovmt(String etcmovmt){
		this.etcmovmt = etcmovmt;
	}

	public void setEtcetc(String etcetc){
		this.etcetc = etcetc;
	}

	public void setBrwscnt(long brwscnt){
		this.brwscnt = brwscnt;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
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

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getJungpoly(){
		return this.jungpoly;
	}

	public String getJungmovmt(){
		return this.jungmovmt;
	}

	public String getJungetc(){
		return this.jungetc;
	}

	public String getDongpoly(){
		return this.dongpoly;
	}

	public String getDongmovmt(){
		return this.dongmovmt;
	}

	public String getDongetc(){
		return this.dongetc;
	}

	public String getEtcpoly(){
		return this.etcpoly;
	}

	public String getEtcmovmt(){
		return this.etcmovmt;
	}

	public String getEtcetc(){
		return this.etcetc;
	}

	public long getBrwscnt(){
		return this.brwscnt;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(5);
		this.makedt = Util.checkString(cstmt.getString(6));
		this.makepersid = Util.checkString(cstmt.getString(7));
		this.makepersnm = Util.checkString(cstmt.getString(8));
		this.deptnm = Util.checkString(cstmt.getString(9));
		this.jungpoly = Util.checkString(cstmt.getString(10));
		this.jungmovmt = Util.checkString(cstmt.getString(11));
		this.jungetc = Util.checkString(cstmt.getString(12));
		this.dongpoly = Util.checkString(cstmt.getString(13));
		this.dongmovmt = Util.checkString(cstmt.getString(14));
		this.dongetc = Util.checkString(cstmt.getString(15));
		this.etcpoly = Util.checkString(cstmt.getString(16));
		this.etcmovmt = Util.checkString(cstmt.getString(17));
		this.etcetc = Util.checkString(cstmt.getString(18));
		this.brwscnt = cstmt.getLong(19);
		this.dwloadcnt = cstmt.getLong(20);
		this.filenm = Util.checkString(cstmt.getString(21));
		this.filesize = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_OTHRPTDataSet ds = (SS_S_OTHRPTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getMakedt()%>
<%= ds.getMakepersid()%>
<%= ds.getMakepersnm()%>
<%= ds.getDeptnm()%>
<%= ds.getJungpoly()%>
<%= ds.getJungmovmt()%>
<%= ds.getJungetc()%>
<%= ds.getDongpoly()%>
<%= ds.getDongmovmt()%>
<%= ds.getDongetc()%>
<%= ds.getEtcpoly()%>
<%= ds.getEtcmovmt()%>
<%= ds.getEtcetc()%>
<%= ds.getBrwscnt()%>
<%= ds.getDwloadcnt()%>
<%= ds.getFilenm()%>
<%= ds.getFilesize()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 26 23:04:22 KST 2003 */