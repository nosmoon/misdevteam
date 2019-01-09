/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.health.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.rec.*;

/**
 * 
 */


public class SS_S_WORKBOOK_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medinm;
	public String aplcpath;
	public String aplcpage;
	public String subsqty;
	public String aplcname;
	public String aplctel;
	public String aplcmtel;
	public String recvname;
	public String recvtel;
	public String recvmtel;
	public String recvaddr;
	public String bonm;
	public String botel;
	public String incmgpers;
	public String clsdt;
	public String status;
	public String banknm;
	public String memo;

	public SS_S_WORKBOOK_APLCDataSet(){}
	public SS_S_WORKBOOK_APLCDataSet(String errcode, String errmsg, String medinm, String aplcpath, String aplcpage, String subsqty, String aplcname, String aplctel, String aplcmtel, String recvname, String recvtel, String recvmtel, String recvaddr, String bonm, String botel, String incmgpers, String clsdt, String status, String banknm, String memo){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medinm = medinm;
		this.aplcpath = aplcpath;
		this.aplcpage = aplcpage;
		this.subsqty = subsqty;
		this.aplcname = aplcname;
		this.aplctel = aplctel;
		this.aplcmtel = aplcmtel;
		this.recvname = recvname;
		this.recvtel = recvtel;
		this.recvmtel = recvmtel;
		this.recvaddr = recvaddr;
		this.bonm = bonm;
		this.botel = botel;
		this.incmgpers = incmgpers;
		this.clsdt = clsdt;
		this.status = status;
		this.banknm = banknm;
		this.memo = memo;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setAplcpage(String aplcpage){
		this.aplcpage = aplcpage;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setAplcname(String aplcname){
		this.aplcname = aplcname;
	}

	public void setAplctel(String aplctel){
		this.aplctel = aplctel;
	}

	public void setAplcmtel(String aplcmtel){
		this.aplcmtel = aplcmtel;
	}

	public void setRecvname(String recvname){
		this.recvname = recvname;
	}

	public void setRecvtel(String recvtel){
		this.recvtel = recvtel;
	}

	public void setRecvmtel(String recvmtel){
		this.recvmtel = recvmtel;
	}

	public void setRecvaddr(String recvaddr){
		this.recvaddr = recvaddr;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotel(String botel){
		this.botel = botel;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setClsdt(String clsdt){
		this.clsdt = clsdt;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getAplcpage(){
		return this.aplcpage;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getAplcname(){
		return this.aplcname;
	}

	public String getAplctel(){
		return this.aplctel;
	}

	public String getAplcmtel(){
		return this.aplcmtel;
	}

	public String getRecvname(){
		return this.recvname;
	}

	public String getRecvtel(){
		return this.recvtel;
	}

	public String getRecvmtel(){
		return this.recvmtel;
	}

	public String getRecvaddr(){
		return this.recvaddr;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotel(){
		return this.botel;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getClsdt(){
		return this.clsdt;
	}

	public String getStatus(){
		return this.status;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getMemo(){
		return this.memo;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medinm = Util.checkString(cstmt.getString(5));
		this.aplcpath = Util.checkString(cstmt.getString(6));
		this.aplcpage = Util.checkString(cstmt.getString(7));
		this.subsqty = Util.checkString(cstmt.getString(8));
		this.aplcname = Util.checkString(cstmt.getString(9));
		this.aplctel = Util.checkString(cstmt.getString(10));
		this.aplcmtel = Util.checkString(cstmt.getString(11));
		this.recvname = Util.checkString(cstmt.getString(12));
		this.recvtel = Util.checkString(cstmt.getString(13));
		this.recvmtel = Util.checkString(cstmt.getString(14));
		this.recvaddr = Util.checkString(cstmt.getString(15));
		this.bonm = Util.checkString(cstmt.getString(16));
		this.botel = Util.checkString(cstmt.getString(17));
		this.incmgpers = Util.checkString(cstmt.getString(18));
		this.clsdt = Util.checkString(cstmt.getString(19));
		this.status = Util.checkString(cstmt.getString(20));
		this.banknm = Util.checkString(cstmt.getString(21));
		this.memo = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_WORKBOOK_APLCDataSet ds = (SS_S_WORKBOOK_APLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedinm()%>
<%= ds.getAplcpath()%>
<%= ds.getAplcpage()%>
<%= ds.getSubsqty()%>
<%= ds.getAplcname()%>
<%= ds.getAplctel()%>
<%= ds.getAplcmtel()%>
<%= ds.getRecvname()%>
<%= ds.getRecvtel()%>
<%= ds.getRecvmtel()%>
<%= ds.getRecvaddr()%>
<%= ds.getBonm()%>
<%= ds.getBotel()%>
<%= ds.getIncmgpers()%>
<%= ds.getClsdt()%>
<%= ds.getStatus()%>
<%= ds.getBanknm()%>
<%= ds.getMemo()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 26 11:41:01 KST 2014 */