/***************************************************************************************************
 * 파일명 : SS_S_RDR_RDRAREADataSet.java
 * 기능 : 확장현황-센터비독자관리(상세조회)
 * 작성일자 : 2013.06.27
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
 * 확장현황-센터비독자관리(상세조회)
 * 
 */

public class SS_S_RDR_RDRAREADataSet extends somo.framework.db.BaseDataSet
		implements java.io.Serializable {
	public String errcode;
	public String errmsg;
	public String areardr_no;
	public String areardrnm;
	public String prn;
	public String ernno;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String subsmedicd;
	public String rdr_extnposbcd;
	public String rdr_extnyn;
	public String area_rdrregdt;
	public String subsfrdt;
	public String substodt;
	public String remk;
	public String subsexpdt;
	public String extnyn;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public long qty;

	public SS_S_RDR_RDRAREADataSet() {
	}

	public SS_S_RDR_RDRAREADataSet(String errcode, String errmsg,
			String areardr_no, String areardrnm, String prn, String ernno,
			String zip, String addr, String dtlsaddr, String tel_no1,
			String tel_no2, String tel_no3, String ptph_no1, String ptph_no2,
			String ptph_no3, String subsmedicd, String rdr_extnposbcd,
			String rdr_extnyn, String area_rdrregdt, String subsfrdt,
			String substodt, String remk, String subsexpdt, String extnyn,
			String deptnm, String partnm, String areanm, String bonm, long qty) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.areardr_no = areardr_no;
		this.areardrnm = areardrnm;
		this.prn = prn;
		this.ernno = ernno;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.subsmedicd = subsmedicd;
		this.rdr_extnposbcd = rdr_extnposbcd;
		this.rdr_extnyn = rdr_extnyn;
		this.area_rdrregdt = area_rdrregdt;
		this.subsfrdt = subsfrdt;
		this.substodt = substodt;
		this.remk = remk;
		this.subsexpdt = subsexpdt;
		this.extnyn = extnyn;
		this.deptnm = deptnm;
		this.partnm = partnm;
		this.areanm = areanm;
		this.bonm = bonm;
		this.qty = qty;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public void setAreardr_no(String areardr_no) {
		this.areardr_no = areardr_no;
	}

	public void setAreardrnm(String areardrnm) {
		this.areardrnm = areardrnm;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public void setErnno(String ernno) {
		this.ernno = ernno;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr) {
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1) {
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2) {
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3) {
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1) {
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2) {
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3) {
		this.ptph_no3 = ptph_no3;
	}

	public void setSubsmedicd(String subsmedicd) {
		this.subsmedicd = subsmedicd;
	}

	public void setRdr_extnposbcd(String rdr_extnposbcd) {
		this.rdr_extnposbcd = rdr_extnposbcd;
	}

	public void setRdr_extnyn(String rdr_extnyn) {
		this.rdr_extnyn = rdr_extnyn;
	}

	public void setArea_rdrregdt(String area_rdrregdt) {
		this.area_rdrregdt = area_rdrregdt;
	}

	public void setSubsfrdt(String subsfrdt) {
		this.subsfrdt = subsfrdt;
	}

	public void setSubstodt(String substodt) {
		this.substodt = substodt;
	}

	public void setRemk(String remk) {
		this.remk = remk;
	}
	
	public void setSubsexpdt(String subsexpdt) {
		this.subsexpdt = subsexpdt;
	}
	
	public void setExtnyn(String extnyn) {
		this.extnyn = extnyn;
	}

	public void setDeptnm(String deptnm) {
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm) {
		this.partnm = partnm;
	}

	public void setAreanm(String areanm) {
		this.areanm = areanm;
	}

	public void setBonm(String bonm) {
		this.bonm = bonm;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	
	public String getErrcode() {
		return this.errcode;
	}

	public String getErrmsg() {
		return this.errmsg;
	}

	public String getAreardr_no() {
		return this.areardr_no;
	}

	public String getAreardrnm() {
		return this.areardrnm;
	}

	public String getPrn() {
		return this.prn;
	}

	public String getErnno() {
		return this.ernno;
	}

	public String getZip() {
		return this.zip;
	}

	public String getAddr() {
		return this.addr;
	}

	public String getDtlsaddr() {
		return this.dtlsaddr;
	}

	public String getTel_no1() {
		return this.tel_no1;
	}

	public String getTel_no2() {
		return this.tel_no2;
	}

	public String getTel_no3() {
		return this.tel_no3;
	}

	public String getPtph_no1() {
		return this.ptph_no1;
	}

	public String getPtph_no2() {
		return this.ptph_no2;
	}

	public String getPtph_no3() {
		return this.ptph_no3;
	}

	public String getSubsmedicd() {
		return this.subsmedicd;
	}

	public String getRdr_extnposbcd() {
		return this.rdr_extnposbcd;
	}

	public String getRdr_extnyn() {
		return this.rdr_extnyn;
	}

	public String getArea_rdrregdt() {
		return this.area_rdrregdt;
	}

	public String getSubsfrdt() {
		return this.subsfrdt;
	}

	public String getSubstodt() {
		return this.substodt;
	}

	public String getSubsexpdt() {
		return this.subsexpdt;
	}
	
	public String getExtnyn() {
		return this.extnyn;
	}
	
	public String getDeptnm() {
		return this.deptnm;
	}

	public String getPartnm() {
		return this.partnm;
	}
	
	public String getAreanm() {
		return this.areanm;
	}
	
	public String getBonm() {
		return this.bonm;
	}
	
	public long getQty() {
		return this.qty;
	}
	
	public String getRemk() {
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException {
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if (!"".equals(this.errcode)) {
			return;
		}
		this.areardr_no = Util.checkString(cstmt.getString(5));
		this.areardrnm = Util.checkString(cstmt.getString(6));
		this.prn = Util.checkString(cstmt.getString(7));
		this.ernno = Util.checkString(cstmt.getString(8));
		this.zip = Util.checkString(cstmt.getString(9));
		this.addr = Util.checkString(cstmt.getString(10));
		this.dtlsaddr = Util.checkString(cstmt.getString(11));
		this.tel_no1 = Util.checkString(cstmt.getString(12));
		this.tel_no2 = Util.checkString(cstmt.getString(13));
		this.tel_no3 = Util.checkString(cstmt.getString(14));
		this.ptph_no1 = Util.checkString(cstmt.getString(15));
		this.ptph_no2 = Util.checkString(cstmt.getString(16));
		this.ptph_no3 = Util.checkString(cstmt.getString(17));
		this.subsmedicd = Util.checkString(cstmt.getString(18));
		this.rdr_extnposbcd = Util.checkString(cstmt.getString(19));
		this.rdr_extnyn = Util.checkString(cstmt.getString(20));
		this.area_rdrregdt = Util.checkString(cstmt.getString(21));
		this.subsfrdt = Util.checkString(cstmt.getString(22));
		this.substodt = Util.checkString(cstmt.getString(23));
		this.remk = Util.checkString(cstmt.getString(24));
		this.subsexpdt = Util.checkString(cstmt.getString(25));
		this.extnyn = Util.checkString(cstmt.getString(26));
		this.deptnm = Util.checkString(cstmt.getString(27));
		this.partnm = Util.checkString(cstmt.getString(28));
		this.areanm = Util.checkString(cstmt.getString(29));
		this.bonm = Util.checkString(cstmt.getString(30));
		this.qty = cstmt.getLong(31);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_RDR_RDRAREADataSet ds = (SS_S_RDR_RDRAREADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

 <%= ds.getErrcode()%>
 <%= ds.getErrmsg()%>
 <%= ds.getAreardr_no()%>
 <%= ds.getAreardrnm()%>
 <%= ds.getPrn()%>
 <%= ds.getErnno()%>
 <%= ds.getZip()%>
 <%= ds.getAddr()%>
 <%= ds.getDtlsaddr()%>
 <%= ds.getTel_no1()%>
 <%= ds.getTel_no2()%>
 <%= ds.getTel_no3()%>
 <%= ds.getPtph_no1()%>
 <%= ds.getPtph_no2()%>
 <%= ds.getPtph_no3()%>
 <%= ds.getSubsmedicd()%>
 <%= ds.getRdr_extnposbcd()%>
 <%= ds.getRdr_extnyn()%>
 <%= ds.getArea_rdrregdt()%>
 <%= ds.getSubsfrdt()%>
 <%= ds.getSubstodt()%>
 <%= ds.getRemk()%>
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Mon May 24 15:33:30 KST 2004 */