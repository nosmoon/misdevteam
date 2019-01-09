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


public class SS_S_VSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curvaca_areacd = new ArrayList();
	public ArrayList curclsfcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String regdt;
	public String regno;
	public String medicd;
	public String medicdnm;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String bonm;
	public String botel;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String qty;
	public String aplcdt;
	public String aplcpathcd;
	public String aplcpathnm;
	public String clsfcd;
	public String clsfnm;
	public String suspfrdt;
	public String susptodt;
	public String spcfdlvdt;
	public String remk;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String vaca_areadlvfrdt;
	public String vaca_areadlvtodt;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String vaca_areaareacd;
	public String vaca_areabocd;
	public String vaca_areabonm;
	public String vaca_areabotel;
	public String vaca_arearegncd;
	public String vaca_areacd;
	public String bocnfmyn;
	public Timestamp bocnfmdt;
	public String boremk;
	public String vaca_areadlvofficnfmyn;
	public String vaca_areadlvofficnfmdt;
	public String vaca_areadlvoffiremk;
	public String cns_empid;
	public String cns_empnm;
	public String cns_empcnfmyn;
	public Timestamp cns_empcnfmdt;
	public String cns_empremk;
	public String bldmngnn;

	public SS_S_VSDataSet(){}
	public SS_S_VSDataSet(String errcode, String errmsg, String regdt, String regno, String medicd, String medicdnm, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String deptcd, String areacd, String bocd, String bonm, String botel, String dlvzip, String dlvaddr, String dlvdtlsaddr, String qty, String aplcdt, String aplcpathcd, String aplcpathnm, String clsfcd, String clsfnm, String suspfrdt, String susptodt, String spcfdlvdt, String remk, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String vaca_areadlvfrdt, String vaca_areadlvtodt, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr, String vaca_areaareacd, String vaca_areabocd, String vaca_areabonm, String vaca_areabotel, String vaca_arearegncd, String vaca_areacd, String bocnfmyn, Timestamp bocnfmdt, String boremk, String vaca_areadlvofficnfmyn, String vaca_areadlvofficnfmdt, String vaca_areadlvoffiremk, String cns_empid, String cns_empnm, String cns_empcnfmyn, Timestamp cns_empcnfmdt, String cns_empremk, String bldmngnn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.regdt = regdt;
		this.regno = regno;
		this.medicd = medicd;
		this.medicdnm = medicdnm;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.bonm = bonm;
		this.botel = botel;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.qty = qty;
		this.aplcdt = aplcdt;
		this.aplcpathcd = aplcpathcd;
		this.aplcpathnm = aplcpathnm;
		this.clsfcd = clsfcd;
		this.clsfnm = clsfnm;
		this.suspfrdt = suspfrdt;
		this.susptodt = susptodt;
		this.spcfdlvdt = spcfdlvdt;
		this.remk = remk;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
		this.vaca_areadlvtodt = vaca_areadlvtodt;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
		this.vaca_areaareacd = vaca_areaareacd;
		this.vaca_areabocd = vaca_areabocd;
		this.vaca_areabonm = vaca_areabonm;
		this.vaca_areabotel = vaca_areabotel;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
		this.bocnfmyn = bocnfmyn;
		this.bocnfmdt = bocnfmdt;
		this.boremk = boremk;
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
		this.vaca_areadlvofficnfmdt = vaca_areadlvofficnfmdt;
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empcnfmdt = cns_empcnfmdt;
		this.cns_empremk = cns_empremk;
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

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setSpcfdlvdt(String spcfdlvdt){
		this.spcfdlvdt = spcfdlvdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setVaca_areadlvfrdt(String vaca_areadlvfrdt){
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
	}

	public void setVaca_areadlvtodt(String vaca_areadlvtodt){
		this.vaca_areadlvtodt = vaca_areadlvtodt;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setVaca_areaareacd(String vaca_areaareacd){
		this.vaca_areaareacd = vaca_areaareacd;
	}

	public void setVaca_areabocd(String vaca_areabocd){
		this.vaca_areabocd = vaca_areabocd;
	}

	public void setVaca_areabonm(String vaca_areabonm){
		this.vaca_areabonm = vaca_areabonm;
	}

	public void setVaca_areabotel(String vaca_areabotel){
		this.vaca_areabotel = vaca_areabotel;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBocnfmdt(Timestamp bocnfmdt){
		this.bocnfmdt = bocnfmdt;
	}

	public void setBoremk(String boremk){
		this.boremk = boremk;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
	}

	public void setVaca_areadlvofficnfmdt(String vaca_areadlvofficnfmdt){
		this.vaca_areadlvofficnfmdt = vaca_areadlvofficnfmdt;
	}

	public void setVaca_areadlvoffiremk(String vaca_areadlvoffiremk){
		this.vaca_areadlvoffiremk = vaca_areadlvoffiremk;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getSpcfdlvdt(){
		return this.spcfdlvdt;
	}

	public String getRemk(){
		return this.remk;
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

	public String getVaca_areadlvfrdt(){
		return this.vaca_areadlvfrdt;
	}

	public String getVaca_areadlvtodt(){
		return this.vaca_areadlvtodt;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getVaca_areaareacd(){
		return this.vaca_areaareacd;
	}

	public String getVaca_areabocd(){
		return this.vaca_areabocd;
	}

	public String getVaca_areabonm(){
		return this.vaca_areabonm;
	}

	public String getVaca_areabotel(){
		return this.vaca_areabotel;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public Timestamp getBocnfmdt(){
		return this.bocnfmdt;
	}

	public String getBoremk(){
		return this.boremk;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}

	public String getVaca_areadlvofficnfmdt(){
		return this.vaca_areadlvofficnfmdt;
	}

	public String getVaca_areadlvoffiremk(){
		return this.vaca_areadlvoffiremk;
	}

	public String getCns_empid(){
		return this.cns_empid;
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

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.regdt = Util.checkString(cstmt.getString(5));
		this.regno = Util.checkString(cstmt.getString(6));
		this.medicd = Util.checkString(cstmt.getString(7));
		this.medicdnm = Util.checkString(cstmt.getString(8));
		this.rdrnm = Util.checkString(cstmt.getString(9));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(10));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(11));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(12));
		this.deptcd = Util.checkString(cstmt.getString(13));
		this.areacd = Util.checkString(cstmt.getString(14));
		this.bocd = Util.checkString(cstmt.getString(15));
		this.bonm = Util.checkString(cstmt.getString(16));
		this.botel = Util.checkString(cstmt.getString(17));
		this.dlvzip = Util.checkString(cstmt.getString(18));
		this.dlvaddr = Util.checkString(cstmt.getString(19));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(20));
		this.qty = Util.checkString(cstmt.getString(21));
		this.aplcdt = Util.checkString(cstmt.getString(22));
		this.aplcpathcd = Util.checkString(cstmt.getString(23));
		this.aplcpathnm = Util.checkString(cstmt.getString(24));
		this.clsfcd = Util.checkString(cstmt.getString(25));
		this.clsfnm = Util.checkString(cstmt.getString(26));
		this.suspfrdt = Util.checkString(cstmt.getString(27));
		this.susptodt = Util.checkString(cstmt.getString(28));
		this.spcfdlvdt = Util.checkString(cstmt.getString(29));
		this.remk = Util.checkString(cstmt.getString(30));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(31));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(32));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(33));
		this.vaca_areadlvfrdt = Util.checkString(cstmt.getString(34));
		this.vaca_areadlvtodt = Util.checkString(cstmt.getString(35));
		this.vaca_areazip = Util.checkString(cstmt.getString(36));
		this.vaca_areaaddr = Util.checkString(cstmt.getString(37));
		this.vaca_areadtlsaddr = Util.checkString(cstmt.getString(38));
		this.vaca_areaareacd = Util.checkString(cstmt.getString(39));
		this.vaca_areabocd = Util.checkString(cstmt.getString(40));
		this.vaca_areabonm = Util.checkString(cstmt.getString(41));
		this.vaca_areabotel = Util.checkString(cstmt.getString(42));
		this.vaca_arearegncd = Util.checkString(cstmt.getString(43));
		this.vaca_areacd = Util.checkString(cstmt.getString(44));
		this.bocnfmyn = Util.checkString(cstmt.getString(45));
		this.bocnfmdt = cstmt.getTimestamp(46);
		this.boremk = Util.checkString(cstmt.getString(47));
		this.vaca_areadlvofficnfmyn = Util.checkString(cstmt.getString(48));
		this.vaca_areadlvofficnfmdt = Util.checkString(cstmt.getString(49));
		this.vaca_areadlvoffiremk = Util.checkString(cstmt.getString(50));
		this.cns_empid = Util.checkString(cstmt.getString(51));
		this.cns_empnm = Util.checkString(cstmt.getString(52));
		this.cns_empcnfmyn = Util.checkString(cstmt.getString(53));
		this.cns_empcnfmdt = cstmt.getTimestamp(54);
		this.cns_empremk = Util.checkString(cstmt.getString(55));
		ResultSet rset0 = (ResultSet) cstmt.getObject(56);
		while(rset0.next()){
			SS_S_VSCURVACA_AREACDRecord rec = new SS_S_VSCURVACA_AREACDRecord();
			rec.vaca_areacd = Util.checkString(rset0.getString("vaca_areacd"));
			rec.vaca_areanm = Util.checkString(rset0.getString("vaca_areanm"));
			this.curvaca_areacd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(57);
		while(rset1.next()){
			SS_S_VSCURCLSFCDRecord rec = new SS_S_VSCURCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curclsfcd.add(rec);
		}
		this.bldmngnn = Util.checkString(cstmt.getString(58));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_VSDataSet ds = (SS_S_VSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curvaca_areacd.size(); i++){
		SS_S_VSCURVACA_AREACDRecord curvaca_areacdRec = (SS_S_VSCURVACA_AREACDRecord)ds.curvaca_areacd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curclsfcd.size(); i++){
		SS_S_VSCURCLSFCDRecord curclsfcdRec = (SS_S_VSCURCLSFCDRecord)ds.curclsfcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getMedicd()%>
<%= ds.getMedicdnm()%>
<%= ds.getRdrnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getDeptcd()%>
<%= ds.getAreacd()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getBotel()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getQty()%>
<%= ds.getAplcdt()%>
<%= ds.getAplcpathcd()%>
<%= ds.getAplcpathnm()%>
<%= ds.getClsfcd()%>
<%= ds.getClsfnm()%>
<%= ds.getSuspfrdt()%>
<%= ds.getSusptodt()%>
<%= ds.getSpcfdlvdt()%>
<%= ds.getRemk()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getVaca_areadlvfrdt()%>
<%= ds.getVaca_areadlvtodt()%>
<%= ds.getVaca_areazip()%>
<%= ds.getVaca_areaaddr()%>
<%= ds.getVaca_areadtlsaddr()%>
<%= ds.getVaca_areaareacd()%>
<%= ds.getVaca_areabocd()%>
<%= ds.getVaca_areabonm()%>
<%= ds.getVaca_areabotel()%>
<%= ds.getVaca_arearegncd()%>
<%= ds.getVaca_areacd()%>
<%= ds.getBocnfmyn()%>
<%= ds.getBocnfmdt()%>
<%= ds.getBoremk()%>
<%= ds.getVaca_areadlvofficnfmyn()%>
<%= ds.getVaca_areadlvofficnfmdt()%>
<%= ds.getVaca_areadlvoffiremk()%>
<%= ds.getCns_empid()%>
<%= ds.getCns_empnm()%>
<%= ds.getCns_empcnfmyn()%>
<%= ds.getCns_empcnfmdt()%>
<%= ds.getCns_empremk()%>
<%= ds.getCurvaca_areacd()%>
<%= ds.getCurclsfcd()%>
<%= ds.getBldmngnn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curvaca_areacdRec.vaca_areacd%>
<%= curvaca_areacdRec.vaca_areanm%>
<%= curclsfcdRec.cicodeval%>
<%= curclsfcdRec.cicdnm%>
<%= curclsfcdRec.ciymgbcd%>
<%= curclsfcdRec.cicdgb%>
<%= curclsfcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 18:44:36 KST 2015 */