/***************************************************************************************************
 * 파일명   : PS_S_MOVM_RDR.java
 * 기능     : 이사신청 상세
 * 작성일자 : 2005-02-15
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 이사신청 상세
 */

public class PS_S_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String acptbocd;
	public String acptbonm;
	public String trsfbocd;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medinm;
	public Timestamp aplcdt;
	public String movmdt;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmzip;
	public String movmaddr;
	public String movmdtlsaddr;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String acptbocnfmyn;
	public String trsfboremk;
	public String acptboremk;
	public String aplcpathcd;
	public Timestamp cns_empcnfmdt;

	public PS_S_MOVM_RDRDataSet(){}
	public PS_S_MOVM_RDRDataSet(String errcode, String errmsg, String acptbocd, String acptbonm, String trsfbocd, String regdt, String regno, String rdr_no, String rdrnm, String medicd, String medinm, Timestamp aplcdt, String movmdt, String zip, String addr, String dtlsaddr, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String movmzip, String movmaddr, String movmdtlsaddr, String movmtel_no1, String movmtel_no2, String movmtel_no3, String acptbocnfmyn, String trsfboremk, String acptboremk, String aplcpathcd, Timestamp cns_empcnfmdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.acptbocd = acptbocd;
		this.acptbonm = acptbonm;
		this.trsfbocd = trsfbocd;
		this.regdt = regdt;
		this.regno = regno;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.medicd = medicd;
		this.medinm = medinm;
		this.aplcdt = aplcdt;
		this.movmdt = movmdt;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.movmzip = movmzip;
		this.movmaddr = movmaddr;
		this.movmdtlsaddr = movmdtlsaddr;
		this.movmtel_no1 = movmtel_no1;
		this.movmtel_no2 = movmtel_no2;
		this.movmtel_no3 = movmtel_no3;
		this.acptbocnfmyn = acptbocnfmyn;
		this.trsfboremk = trsfboremk;
		this.acptboremk = acptboremk;
		this.aplcpathcd = aplcpathcd;
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcdt(Timestamp aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setMovmzip(String movmzip){
		this.movmzip = movmzip;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
	}

	public void setMovmtel_no1(String movmtel_no1){
		this.movmtel_no1 = movmtel_no1;
	}

	public void setMovmtel_no2(String movmtel_no2){
		this.movmtel_no2 = movmtel_no2;
	}

	public void setMovmtel_no3(String movmtel_no3){
		this.movmtel_no3 = movmtel_no3;
	}

	public void setAcptbocnfmyn(String acptbocnfmyn){
		this.acptbocnfmyn = acptbocnfmyn;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public Timestamp getAplcdt(){
		return this.aplcdt;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getMovmzip(){
		return this.movmzip;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
	}

	public String getMovmtel_no1(){
		return this.movmtel_no1;
	}

	public String getMovmtel_no2(){
		return this.movmtel_no2;
	}

	public String getMovmtel_no3(){
		return this.movmtel_no3;
	}

	public String getAcptbocnfmyn(){
		return this.acptbocnfmyn;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.acptbocd = Util.checkString(cstmt.getString(5));
		this.acptbonm = Util.checkString(cstmt.getString(6));
		this.trsfbocd = Util.checkString(cstmt.getString(7));
		this.regdt = Util.checkString(cstmt.getString(8));
		this.regno = Util.checkString(cstmt.getString(9));
		this.rdr_no = Util.checkString(cstmt.getString(10));
		this.rdrnm = Util.checkString(cstmt.getString(11));
		this.medicd = Util.checkString(cstmt.getString(12));
		this.medinm = Util.checkString(cstmt.getString(13));
		this.aplcdt = cstmt.getTimestamp(14);
		this.movmdt = Util.checkString(cstmt.getString(15));
		this.zip = Util.checkString(cstmt.getString(16));
		this.addr = Util.checkString(cstmt.getString(17));
		this.dtlsaddr = Util.checkString(cstmt.getString(18));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(19));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(20));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(21));
		this.movmzip = Util.checkString(cstmt.getString(22));
		this.movmaddr = Util.checkString(cstmt.getString(23));
		this.movmdtlsaddr = Util.checkString(cstmt.getString(24));
		this.movmtel_no1 = Util.checkString(cstmt.getString(25));
		this.movmtel_no2 = Util.checkString(cstmt.getString(26));
		this.movmtel_no3 = Util.checkString(cstmt.getString(27));
		this.acptbocnfmyn = Util.checkString(cstmt.getString(28));
		this.trsfboremk = Util.checkString(cstmt.getString(29));
		this.acptboremk = Util.checkString(cstmt.getString(30));
		this.aplcpathcd = Util.checkString(cstmt.getString(31));
		this.cns_empcnfmdt = cstmt.getTimestamp(32);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_MOVM_RDRDataSet ds = (PS_S_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcptbocd()%>
<%= ds.getAcptbonm()%>
<%= ds.getTrsfbocd()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getAplcdt()%>
<%= ds.getMovmdt()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtlsaddr()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getMovmzip()%>
<%= ds.getMovmaddr()%>
<%= ds.getMovmdtlsaddr()%>
<%= ds.getMovmtel_no1()%>
<%= ds.getMovmtel_no2()%>
<%= ds.getMovmtel_no3()%>
<%= ds.getAcptbocnfmyn()%>
<%= ds.getTrsfboremk()%>
<%= ds.getAcptboremk()%>
<%= ds.getAplcpathcd()%>
<%= ds.getCns_empcnfmdt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 15 14:13:47 KST 2005 */