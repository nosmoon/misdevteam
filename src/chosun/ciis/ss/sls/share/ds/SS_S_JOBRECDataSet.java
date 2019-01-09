/***************************************************************************************************
* 파일명 : SS_S_JOBRECDataSet.java
* 기능 : 정보공유 일일업무일지 상세보기
* 작성일자 : 2003-12-23
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


public class SS_S_JOBRECDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String makedt;
	public String makepersid;
	public String makepersnm;
	public String deptnm;
	public String curddplan;
	public String prvddproc;
	public String etc;
	public long brwscnt;
	public long dwloadcnt;
	public String filenm;
	public String filesize;

	public SS_S_JOBRECDataSet(){}
	public SS_S_JOBRECDataSet(String errcode, String errmsg, String makedt, String makepersid, String makepersnm, String deptnm, String curddplan, String prvddproc, String etc, long brwscnt, long dwloadcnt, String filenm, String filesize){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.deptnm = deptnm;
		this.curddplan = curddplan;
		this.prvddproc = prvddproc;
		this.etc = etc;
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

	public void setCurddplan(String curddplan){
		this.curddplan = curddplan;
	}

	public void setPrvddproc(String prvddproc){
		this.prvddproc = prvddproc;
	}

	public void setEtc(String etc){
		this.etc = etc;
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

	public String getCurddplan(){
		return this.curddplan;
	}

	public String getPrvddproc(){
		return this.prvddproc;
	}

	public String getEtc(){
		return this.etc;
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
		this.makedt = Util.checkString(cstmt.getString(6));
		this.makepersid = Util.checkString(cstmt.getString(7));
		this.makepersnm = Util.checkString(cstmt.getString(8));
		this.deptnm = Util.checkString(cstmt.getString(9));
		this.curddplan = Util.checkString(cstmt.getString(10));
		this.prvddproc = Util.checkString(cstmt.getString(11));
		this.etc = Util.checkString(cstmt.getString(12));
		this.brwscnt = cstmt.getLong(13);
		this.dwloadcnt = cstmt.getLong(14);
		this.filenm = Util.checkString(cstmt.getString(15));
		this.filesize = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_JOBRECDataSet ds = (SS_S_JOBRECDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMakedt()%>
<%= ds.getMakepersid()%>
<%= ds.getMakepersnm()%>
<%= ds.getDeptnm()%>
<%= ds.getCurddplan()%>
<%= ds.getPrvddproc()%>
<%= ds.getEtc()%>
<%= ds.getBrwscnt()%>
<%= ds.getDwloadcnt()%>
<%= ds.getFilenm()%>
<%= ds.getFilesize()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 23 12:34:24 KST 2003 */