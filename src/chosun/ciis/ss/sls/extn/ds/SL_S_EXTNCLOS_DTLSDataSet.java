/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장점검-점검대상 상세조회
* 작성일자 : 2011-12-16
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SL_S_EXTNCLOS_DTLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String rdrnm;
	public String rdr_no;
	public String qty;
	public String addrs;
	public String rdrtel_no;
	public String rdrptph_no;
	public String rdr_extndt;
	public String valmm;
	public String rdr_extntype1;
	public String rdr_extntype2;
	public String extnnm;
	public String aplcpath;
	public String resitype;
	public String reconfyn;
	public String suspdt;
	public String suspresn;
	public String connstat;
	public String readstat;
	public String prereadstat;
	public String resiststat;
	public String agcontext;
	public String boremk;
	public String ddremk;
	public String stat1;
	public String stat2;
	public String stat3;
	public String issup;
	public String issupdt;
	public String bocfmdt;
	public String bocfmid;
	public String ddcfmdt;
	public String ddcfmid;
	public String seq;

	public SL_S_EXTNCLOS_DTLSDataSet(){}
	public SL_S_EXTNCLOS_DTLSDataSet(String errcode, String errmsg, String deptcd, String deptnm, String partcd, String partnm, String areacd, String areanm, String bocd, String bonm, String rdrnm, String rdr_no, String qty, String addrs, String rdrtel_no, String rdrptph_no, String rdr_extndt, String valmm, String rdr_extntype1, String rdr_extntype2, String extnnm, String aplcpath, String resitype, String reconfyn, String suspdt, String suspresn, String connstat, String readstat, String prereadstat, String resiststat, String agcontext, String boremk, String ddremk, String stat1, String stat2, String stat3, String issup, String issupdt, String bocfmdt, String bocfmid, String ddcfmdt, String ddcfmid, String seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.partcd = partcd;
		this.partnm = partnm;
		this.areacd = areacd;
		this.areanm = areanm;
		this.bocd = bocd;
		this.bonm = bonm;
		this.rdrnm = rdrnm;
		this.rdr_no = rdr_no;
		this.qty = qty;
		this.addrs = addrs;
		this.rdrtel_no = rdrtel_no;
		this.rdrptph_no = rdrptph_no;
		this.rdr_extndt = rdr_extndt;
		this.valmm = valmm;
		this.rdr_extntype1 = rdr_extntype1;
		this.rdr_extntype2 = rdr_extntype2;
		this.extnnm = extnnm;
		this.aplcpath = aplcpath;
		this.resitype = resitype;
		this.reconfyn = reconfyn;
		this.suspdt = suspdt;
		this.suspresn = suspresn;
		this.connstat = connstat;
		this.readstat = readstat;
		this.prereadstat = prereadstat;
		this.resiststat = resiststat;
		this.agcontext = agcontext;
		this.boremk = boremk;
		this.ddremk = ddremk;
		this.stat1 = stat1;
		this.stat2 = stat2;
		this.stat3 = stat3;
		this.issup = issup;
		this.issupdt = issupdt;
		this.bocfmdt = bocfmdt;
		this.bocfmid = bocfmid;
		this.ddcfmdt = ddcfmdt;
		this.ddcfmid = ddcfmid;
		this.seq = seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAddrs(String addrs){
		this.addrs = addrs;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setRdr_extntype1(String rdr_extntype1){
		this.rdr_extntype1 = rdr_extntype1;
	}

	public void setRdr_extntype2(String rdr_extntype2){
		this.rdr_extntype2 = rdr_extntype2;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setReconfyn(String reconfyn){
		this.reconfyn = reconfyn;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresn(String suspresn){
		this.suspresn = suspresn;
	}

	public void setConnstat(String connstat){
		this.connstat = connstat;
	}

	public void setReadstat(String readstat){
		this.readstat = readstat;
	}

	public void setPrereadstat(String prereadstat){
		this.prereadstat = prereadstat;
	}

	public void setResiststat(String resiststat){
		this.resiststat = resiststat;
	}

	public void setAgcontext(String agcontext){
		this.agcontext = agcontext;
	}

	public void setBoremk(String boremk){
		this.boremk = boremk;
	}

	public void setDdremk(String ddremk){
		this.ddremk = ddremk;
	}

	public void setStat1(String stat1){
		this.stat1 = stat1;
	}

	public void setStat2(String stat2){
		this.stat2 = stat2;
	}

	public void setStat3(String stat3){
		this.stat3 = stat3;
	}

	public void setIssup(String issup){
		this.issup = issup;
	}

	public void setIssupdt(String issupdt){
		this.issupdt = issupdt;
	}

	public void setBocfmdt(String bocfmdt){
		this.bocfmdt = bocfmdt;
	}

	public void setBocfmid(String bocfmid){
		this.bocfmid = bocfmid;
	}

	public void setDdcfmdt(String ddcfmdt){
		this.ddcfmdt = ddcfmdt;
	}

	public void setDdcfmid(String ddcfmid){
		this.ddcfmid = ddcfmid;
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

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAddrs(){
		return this.addrs;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getRdr_extntype1(){
		return this.rdr_extntype1;
	}

	public String getRdr_extntype2(){
		return this.rdr_extntype2;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getReconfyn(){
		return this.reconfyn;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresn(){
		return this.suspresn;
	}

	public String getConnstat(){
		return this.connstat;
	}

	public String getReadstat(){
		return this.readstat;
	}

	public String getPrereadstat(){
		return this.prereadstat;
	}

	public String getResiststat(){
		return this.resiststat;
	}

	public String getAgcontext(){
		return this.agcontext;
	}

	public String getBoremk(){
		return this.boremk;
	}

	public String getDdremk(){
		return this.ddremk;
	}

	public String getStat1(){
		return this.stat1;
	}

	public String getStat2(){
		return this.stat2;
	}

	public String getStat3(){
		return this.stat3;
	}

	public String getIssup(){
		return this.issup;
	}

	public String getIssupdt(){
		return this.issupdt;
	}

	public String getBocfmdt(){
		return this.bocfmdt;
	}

	public String getBocfmid(){
		return this.bocfmid;
	}

	public String getDdcfmdt(){
		return this.ddcfmdt;
	}

	public String getDdcfmid(){
		return this.ddcfmid;
	}

	public String getSeq(){
		return this.seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.deptcd = Util.checkString(cstmt.getString(9));
		this.deptnm = Util.checkString(cstmt.getString(10));
		this.partcd = Util.checkString(cstmt.getString(11));
		this.partnm = Util.checkString(cstmt.getString(12));
		this.areacd = Util.checkString(cstmt.getString(13));
		this.areanm = Util.checkString(cstmt.getString(14));
		this.bocd = Util.checkString(cstmt.getString(15));
		this.bonm = Util.checkString(cstmt.getString(16));
		this.rdrnm = Util.checkString(cstmt.getString(17));
		this.rdr_no = Util.checkString(cstmt.getString(18));
		this.qty = Util.checkString(cstmt.getString(19));
		this.addrs = Util.checkString(cstmt.getString(20));
		this.rdrtel_no = Util.checkString(cstmt.getString(21));
		this.rdrptph_no = Util.checkString(cstmt.getString(22));
		this.rdr_extndt = Util.checkString(cstmt.getString(23));
		this.valmm = Util.checkString(cstmt.getString(24));
		this.rdr_extntype1 = Util.checkString(cstmt.getString(25));
		this.rdr_extntype2 = Util.checkString(cstmt.getString(26));
		this.extnnm = Util.checkString(cstmt.getString(27));
		this.aplcpath = Util.checkString(cstmt.getString(28));
		this.resitype = Util.checkString(cstmt.getString(29));
		this.reconfyn = Util.checkString(cstmt.getString(30));
		this.suspdt = Util.checkString(cstmt.getString(31));
		this.suspresn = Util.checkString(cstmt.getString(32));
		this.connstat = Util.checkString(cstmt.getString(33));
		this.readstat = Util.checkString(cstmt.getString(34));
		this.prereadstat = Util.checkString(cstmt.getString(35));
		this.resiststat = Util.checkString(cstmt.getString(36));
		this.agcontext = Util.checkString(cstmt.getString(37));
		this.boremk = Util.checkString(cstmt.getString(38));
		this.ddremk = Util.checkString(cstmt.getString(39));
		this.stat1 = Util.checkString(cstmt.getString(40));
		this.stat2 = Util.checkString(cstmt.getString(41));
		this.stat3 = Util.checkString(cstmt.getString(42));
		this.issup = Util.checkString(cstmt.getString(43));
		this.issupdt = Util.checkString(cstmt.getString(44));
		this.bocfmdt = Util.checkString(cstmt.getString(45));
		this.bocfmid = Util.checkString(cstmt.getString(46));
		this.ddcfmdt = Util.checkString(cstmt.getString(47));
		this.ddcfmid = Util.checkString(cstmt.getString(48));
		this.seq = Util.checkString(cstmt.getString(49));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_EXTNCLOS_DTLSDataSet ds = (SL_S_EXTNCLOS_DTLSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptcd()%>
<%= ds.getDeptnm()%>
<%= ds.getPartcd()%>
<%= ds.getPartnm()%>
<%= ds.getAreacd()%>
<%= ds.getAreanm()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getRdrnm()%>
<%= ds.getRdr_no()%>
<%= ds.getQty()%>
<%= ds.getAddrs()%>
<%= ds.getRdrtel_no()%>
<%= ds.getRdrptph_no()%>
<%= ds.getRdr_extndt()%>
<%= ds.getValmm()%>
<%= ds.getRdr_extntype1()%>
<%= ds.getRdr_extntype2()%>
<%= ds.getExtnnm()%>
<%= ds.getAplcpath()%>
<%= ds.getResitype()%>
<%= ds.getReconfyn()%>
<%= ds.getSuspdt()%>
<%= ds.getSuspresn()%>
<%= ds.getConnstat()%>
<%= ds.getReadstat()%>
<%= ds.getPrereadstat()%>
<%= ds.getResiststat()%>
<%= ds.getAgcontext()%>
<%= ds.getBoremk()%>
<%= ds.getDdremk()%>
<%= ds.getStat1()%>
<%= ds.getStat2()%>
<%= ds.getStat3()%>
<%= ds.getIssup()%>
<%= ds.getIssupdt()%>
<%= ds.getBocfmdt()%>
<%= ds.getBocfmid()%>
<%= ds.getDdcfmdt()%>
<%= ds.getDdcfmid()%>
<%= ds.getSeq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 16 17:44:11 KST 2011 */