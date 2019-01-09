/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2017-01-05
* 작성자 : 민 기 홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :  
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_3020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String boemp_id;
	public String flnm;
	public String tel;
	public String bocd;
	public String bonm;
	public String botel;
	public String boaddr;
	public String cont;
	public String regdt;
	public String chkyn;
	public String rmk;
	public String chkdate;
	public String seq;
	public String chkpers;
	public String nm;

	public SE_BOI_3020_SDataSet(){}
	public SE_BOI_3020_SDataSet(String errcode, String errmsg, String boemp_id, String flnm, String tel, String bocd, String bonm, String botel, String boaddr, String cont, String regdt, String chkyn, String rmk, String chkdate, String seq, String chkpers, String nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.boemp_id = boemp_id;
		this.flnm = flnm;
		this.tel = tel;
		this.bocd = bocd;
		this.bonm = bonm;
		this.botel = botel;
		this.boaddr = boaddr;
		this.cont = cont;
		this.regdt = regdt;
		this.chkyn = chkyn;
		this.rmk = rmk;
		this.chkdate = chkdate;
		this.seq = seq;
		this.chkpers = chkpers;
		this.nm = nm;
	}

	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getChkpers() {
		return chkpers;
	}
	
	public void setChkpers(String chkpers) {
		this.chkpers = chkpers;
	}
	
	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotel(String botel){
		this.botel = botel;
	}

	public void setBoaddr(String boaddr){
		this.boaddr = boaddr;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setChkyn(String chkyn){
		this.chkyn = chkyn;
	}

	public void setRmk(String rmk){
		this.rmk = rmk;
	}

	public void setChkdate(String chkdate){
		this.chkdate = chkdate;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getTel(){
		return this.tel;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotel(){
		return this.botel;
	}

	public String getBoaddr(){
		return this.boaddr;
	}

	public String getCont(){
		return this.cont;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getChkyn(){
		return this.chkyn;
	}

	public String getRmk(){
		return this.rmk;
	}

	public String getChkdate(){
		return this.chkdate;
	}

	public String getSeq(){
		return this.seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.boemp_id = Util.checkString(cstmt.getString(4));
		this.flnm = Util.checkString(cstmt.getString(5));
		this.tel = Util.checkString(cstmt.getString(6));
		this.bocd = Util.checkString(cstmt.getString(7));
		this.bonm = Util.checkString(cstmt.getString(8));
		this.botel = Util.checkString(cstmt.getString(9));
		this.boaddr = Util.checkString(cstmt.getString(10));
		this.cont = Util.checkString(cstmt.getString(11));
		this.regdt = Util.checkString(cstmt.getString(12));
		this.chkyn = Util.checkString(cstmt.getString(13));
		this.rmk = Util.checkString(cstmt.getString(14));
		this.chkdate = Util.checkString(cstmt.getString(15));
		this.seq = Util.checkString(cstmt.getString(16));
		this.chkpers = Util.checkString(cstmt.getString(17));
		this.nm = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_3020_SDataSet ds = (SE_BOI_3020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoemp_id()%>
<%= ds.getFlnm()%>
<%= ds.getTel()%>
<%= ds.getBoce()%>
<%= ds.getBonm()%>
<%= ds.getBotel()%>
<%= ds.getBoaddr()%>
<%= ds.getCont()%>
<%= ds.getRegdt()%>
<%= ds.getChkyn()%>
<%= ds.getRmk()%>
<%= ds.getChkdate()%>
<%= ds.getSeq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 30 17:56:33 KST 2017 */