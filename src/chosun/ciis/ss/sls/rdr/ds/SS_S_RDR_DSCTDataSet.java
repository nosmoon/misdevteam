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



public class SS_S_RDR_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String regdt;
	public String regno;
	public String rdrnm;
	public String rdr_no;
	public String medicd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String email;
	public String bocd;
	public String botel;
	public String bonm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public Timestamp acpndt;
	public String dscttypecdnm;
	public String dscttypecd;
	public String acpnpathcdnm;
	public String titl;
	public String cont;
	public String bocnfmyn;
	public Timestamp boprocdt;
	public String boproccont;
	public String cns_empnm;
	public String cns_empcnfmyn;
	public Timestamp cns_empcnfmdt;
	public String cns_empremk;
	public String bo_procreqitm;
	public String bo_cnfmtel;
	public String cns_procreqitm;
	public String cns_cnfmtel;
	public String bldmngnn;

	public SS_S_RDR_DSCTDataSet(){}
	public SS_S_RDR_DSCTDataSet(String errcode, String errmsg, String regdt, String regno, String rdrnm, String rdr_no, String medicd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String email, String bocd, String botel, String bonm, String dlvzip, String dlvaddr, String dlvdtlsaddr, Timestamp acpndt, String dscttypecdnm, String dscttypecd, String acpnpathcdnm, String titl, String cont, String bocnfmyn, Timestamp boprocdt, String boproccont, String cns_empnm, String cns_empcnfmyn, Timestamp cns_empcnfmdt, String cns_empremk, String bo_procreqitm, String bo_cnfmtel, String cns_procreqitm, String cns_cnfmtel, String bldmngnn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.regdt = regdt;
		this.regno = regno;
		this.rdrnm = rdrnm;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.email = email;
		this.bocd = bocd;
		this.botel = botel;
		this.bonm = bonm;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.acpndt = acpndt;
		this.dscttypecdnm = dscttypecdnm;
		this.dscttypecd = dscttypecd;
		this.acpnpathcdnm = acpnpathcdnm;
		this.titl = titl;
		this.cont = cont;
		this.bocnfmyn = bocnfmyn;
		this.boprocdt = boprocdt;
		this.boproccont = boproccont;
		this.cns_empnm = cns_empnm;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empcnfmdt = cns_empcnfmdt;
		this.cns_empremk = cns_empremk;
		this.bo_procreqitm = bo_procreqitm;
		this.bo_cnfmtel = bo_cnfmtel;
		this.cns_procreqitm = cns_procreqitm;
		this.cns_cnfmtel = cns_cnfmtel;
		this.bldmngnn = bldmngnn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBotel(String botel){
		this.botel = botel;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public void setAcpndt(Timestamp acpndt){
		this.acpndt = acpndt;
	}

	public void setDscttypecdnm(String dscttypecdnm){
		this.dscttypecdnm = dscttypecdnm;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setAcpnpathcdnm(String acpnpathcdnm){
		this.acpnpathcdnm = acpnpathcdnm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoprocdt(Timestamp boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empcnfmyn(String cns_empcnfmyn){
		this.cns_empcnfmyn = cns_empcnfmyn;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public void setBo_procreqitm(String bo_procreqitm){
		this.bo_procreqitm = bo_procreqitm;
	}

	public void setBo_cnfmtel(String bo_cnfmtel){
		this.bo_cnfmtel = bo_cnfmtel;
	}

	public void setCns_procreqitm(String cns_procreqitm){
		this.cns_procreqitm = cns_procreqitm;
	}

	public void setCns_cnfmtel(String cns_cnfmtel){
		this.cns_cnfmtel = cns_cnfmtel;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBotel(){
		return this.botel;
	}

	public String getBonm(){
		return this.bonm;
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

	public Timestamp getAcpndt(){
		return this.acpndt;
	}

	public String getDscttypecdnm(){
		return this.dscttypecdnm;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getAcpnpathcdnm(){
		return this.acpnpathcdnm;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public Timestamp getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empcnfmyn(){
		return this.cns_empcnfmyn;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getBo_procreqitm(){
		return this.bo_procreqitm;
	}

	public String getBo_cnfmtel(){
		return this.bo_cnfmtel;
	}

	public String getCns_procreqitm(){
		return this.cns_procreqitm;
	}

	public String getCns_cnfmtel(){
		return this.cns_cnfmtel;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.regdt = Util.checkString(cstmt.getString(5));
		this.regno = Util.checkString(cstmt.getString(6));
		this.rdrnm = Util.checkString(cstmt.getString(7));
		this.rdr_no = Util.checkString(cstmt.getString(8));
		this.medicd = Util.checkString(cstmt.getString(9));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(10));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(11));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(12));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(13));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(14));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(15));
		this.email = Util.checkString(cstmt.getString(16));
		this.bocd = Util.checkString(cstmt.getString(17));
		this.botel = Util.checkString(cstmt.getString(18));
		this.bonm = Util.checkString(cstmt.getString(19));
		this.dlvzip = Util.checkString(cstmt.getString(20));
		this.dlvaddr = Util.checkString(cstmt.getString(21));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(22));
		this.acpndt = cstmt.getTimestamp(23);
		this.dscttypecdnm = Util.checkString(cstmt.getString(24));
		this.dscttypecd = Util.checkString(cstmt.getString(25));
		this.acpnpathcdnm = Util.checkString(cstmt.getString(26));
		this.titl = Util.checkString(cstmt.getString(27));
		this.cont = Util.checkString(cstmt.getString(28));
		this.bocnfmyn = Util.checkString(cstmt.getString(29));
		this.boprocdt = cstmt.getTimestamp(30);
		this.boproccont = Util.checkString(cstmt.getString(31));
		this.cns_empnm = Util.checkString(cstmt.getString(32));
		this.cns_empcnfmyn = Util.checkString(cstmt.getString(33));
		this.cns_empcnfmdt = cstmt.getTimestamp(34);
		this.cns_empremk = Util.checkString(cstmt.getString(35));
		this.bo_procreqitm = Util.checkString(cstmt.getString(36));
		this.bo_cnfmtel = Util.checkString(cstmt.getString(37));
		this.cns_procreqitm = Util.checkString(cstmt.getString(38));
		this.cns_cnfmtel = Util.checkString(cstmt.getString(39));
		this.bldmngnn = Util.checkString(cstmt.getString(40));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getRdrnm()%>
<%= ds.getRdr_no()%>
<%= ds.getMedicd()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getEmail()%>
<%= ds.getBocd()%>
<%= ds.getBotel()%>
<%= ds.getBonm()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getAcpndt()%>
<%= ds.getDscttypecdnm()%>
<%= ds.getDscttypecd()%>
<%= ds.getAcpnpathcdnm()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
<%= ds.getBocnfmyn()%>
<%= ds.getBoprocdt()%>
<%= ds.getBoproccont()%>
<%= ds.getCns_empnm()%>
<%= ds.getCns_empcnfmyn()%>
<%= ds.getCns_empcnfmdt()%>
<%= ds.getCns_empremk()%>
<%= ds.getBo_procreqitm()%>
<%= ds.getBo_cnfmtel()%>
<%= ds.getCns_procreqitm()%>
<%= ds.getCns_cnfmtel()%>
<%= ds.getBldmngnn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 21 17:45:25 KST 2016 */