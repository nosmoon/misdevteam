/***************************************************************************************************
* 파일명 : SS_S_POSTDLVRDRDataSet.java
* 기능 : 독자관리 우송독자관리 상세
* 작성일자 : 2016/06/26
* 작성자 : 장선희
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_S_POSTDLVRDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String rdrnm;
	public String bonm;
	public String bo_tel;
	public String rdrtel;
	public String rdrptph;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String addrnm;
	public String dlvdong;
	public String dlvserno;
	public String newdlvzip;
	public String newdlvaddr;
	public String newdlvdtlsaddr;
	public String newbldmngnn;

	public SS_S_POSTDLVRDRDataSet(){}
	public SS_S_POSTDLVRDRDataSet(String errcode, String errmsg, String rdr_no, String rdrnm, String bonm, String bo_tel, String rdrtel, String rdrptph, String dlvzip, String dlvaddr, String dlvdtlsaddr, String addrnm, String dlvdong, String dlvserno, String newdlvzip, String newdlvaddr, String newdlvdtlsaddr, String newbldmngnn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.bonm = bonm;
		this.bo_tel = bo_tel;
		this.rdrtel = rdrtel;
		this.rdrptph = rdrptph;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.addrnm = addrnm;
		this.dlvdong = dlvdong;
		this.dlvserno = dlvserno;
		this.newdlvzip = newdlvzip;
		this.newdlvaddr = newdlvaddr;
		this.newdlvdtlsaddr = newdlvdtlsaddr;
		this.newbldmngnn = newbldmngnn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_tel(String bo_tel){
		this.bo_tel = bo_tel;
	}

	public void setRdrtel(String rdrtel){
		this.rdrtel = rdrtel;
	}

	public void setRdrptph(String rdrptph){
		this.rdrptph = rdrptph;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvserno(String dlvserno){
		this.dlvserno = dlvserno;
	}

	public void setNewdlvzip(String newdlvzip){
		this.newdlvzip = newdlvzip;
	}

	public void setNewdlvaddr(String newdlvaddr){
		this.newdlvaddr = newdlvaddr;
	}

	public void setNewdlvdtlsaddr(String newdlvdtlsaddr){
		this.newdlvdtlsaddr = newdlvdtlsaddr;
	}

	public void setNewbldmngnn(String newbldmngnn){
		this.newbldmngnn = newbldmngnn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_tel(){
		return this.bo_tel;
	}

	public String getRdrtel(){
		return this.rdrtel;
	}

	public String getRdrptph(){
		return this.rdrptph;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvserno(){
		return this.dlvserno;
	}

	public String getNewdlvzip(){
		return this.newdlvzip;
	}

	public String getNewdlvaddr(){
		return this.newdlvaddr;
	}

	public String getNewdlvdtlsaddr(){
		return this.newdlvdtlsaddr;
	}

	public String getNewbldmngnn(){
		return this.newbldmngnn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(4));
		this.rdrnm = Util.checkString(cstmt.getString(5));
		this.bonm = Util.checkString(cstmt.getString(6));
		this.bo_tel = Util.checkString(cstmt.getString(7));
		this.rdrtel = Util.checkString(cstmt.getString(8));
		this.rdrptph = Util.checkString(cstmt.getString(9));
		this.dlvzip = Util.checkString(cstmt.getString(10));
		this.dlvaddr = Util.checkString(cstmt.getString(11));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(12));
		this.addrnm = Util.checkString(cstmt.getString(13));
		this.dlvdong = Util.checkString(cstmt.getString(14));
		this.dlvserno = Util.checkString(cstmt.getString(15));
		this.newdlvzip = Util.checkString(cstmt.getString(16));
		this.newdlvaddr = Util.checkString(cstmt.getString(17));
		this.newdlvdtlsaddr = Util.checkString(cstmt.getString(18));
		this.newbldmngnn = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_POSTDLVRDRDataSet ds = (SS_S_POSTDLVRDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getBonm()%>
<%= ds.getBo_tel()%>
<%= ds.getRdrtel()%>
<%= ds.getRdrptph()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getAddrnm()%>
<%= ds.getDlvdong()%>
<%= ds.getDlvserno()%>
<%= ds.getNewdlvzip()%>
<%= ds.getNewdlvaddr()%>
<%= ds.getNewdlvdtlsaddr()%>
<%= ds.getNewbldmngnn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 19:58:54 KST 2015 */