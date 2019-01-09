/***************************************************************************************************
* 파일명 : SL_S_DSCTDataSet.java
* 기능 : 불편관리(상세)
* 작성일자 : 2004-01-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 불편관리(상세)
 *
 */


public class SL_S_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dscttypecd;
	public Timestamp acpndt;
	public String acpnpathcd;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String rdr_no;
	public String dsno;
	public String termsubsno;
	public String medicd;
	public String rdrnm;
	public String prn;
	public String rdremail;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String titl;
	public String cont;
	public Timestamp bocnfmdt;
	public String bocnfmyn;
	public Timestamp boprocdt;
	public String boprocyn;
	public String boproccont;
	public String cns_empnm;
	public String cns_empid;
	public String proccont;
	public String procpers;

	public SL_S_DSCTDataSet(){}
	public SL_S_DSCTDataSet(String errcode, String errmsg, String dscttypecd, Timestamp acpndt, String acpnpathcd, String deptcd, String areacd, String bocd, String rdr_no, String dsno, String termsubsno, String medicd, String rdrnm, String prn, String rdremail, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String titl, String cont, Timestamp bocnfmdt, String bocnfmyn, Timestamp boprocdt, String boprocyn, String boproccont, String cns_empnm, String cns_empid, String proccont, String procpers){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dscttypecd = dscttypecd;
		this.acpndt = acpndt;
		this.acpnpathcd = acpnpathcd;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.dsno = dsno;
		this.termsubsno = termsubsno;
		this.medicd = medicd;
		this.rdrnm = rdrnm;
		this.prn = prn;
		this.rdremail = rdremail;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.titl = titl;
		this.cont = cont;
		this.bocnfmdt = bocnfmdt;
		this.bocnfmyn = bocnfmyn;
		this.boprocdt = boprocdt;
		this.boprocyn = boprocyn;
		this.boproccont = boproccont;
		this.cns_empnm = cns_empnm;
		this.cns_empid = cns_empid;
		this.proccont = proccont;
		this.procpers = procpers;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setAcpndt(Timestamp acpndt){
		this.acpndt = acpndt;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
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

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setDsno(String dsno){
		this.dsno = dsno;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setBocnfmdt(Timestamp bocnfmdt){
		this.bocnfmdt = bocnfmdt;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoprocdt(Timestamp boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setProccont(String proccont){
		this.proccont = proccont;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public Timestamp getAcpndt(){
		return this.acpndt;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
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

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getDsno(){
		return this.dsno;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRdremail(){
		return this.rdremail;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public Timestamp getBocnfmdt(){
		return this.bocnfmdt;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public Timestamp getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getProccont(){
		return this.proccont;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.dscttypecd = Util.checkString(cstmt.getString(5));
		this.acpndt = cstmt.getTimestamp(6);
		this.acpnpathcd = Util.checkString(cstmt.getString(7));
		this.deptcd = Util.checkString(cstmt.getString(8));
		this.areacd = Util.checkString(cstmt.getString(9));
		this.bocd = Util.checkString(cstmt.getString(10));
		this.rdr_no = Util.checkString(cstmt.getString(11));
		this.dsno = Util.checkString(cstmt.getString(12));
		this.termsubsno = Util.checkString(cstmt.getString(13));
		this.medicd = Util.checkString(cstmt.getString(14));
		this.rdrnm = Util.checkString(cstmt.getString(15));
		this.prn = Util.checkString(cstmt.getString(16));
		this.rdremail = Util.checkString(cstmt.getString(17));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(18));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(19));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(20));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(21));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(22));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(23));
		this.dlvzip = Util.checkString(cstmt.getString(24));
		this.dlvaddr = Util.checkString(cstmt.getString(25));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(26));
		this.titl = Util.checkString(cstmt.getString(27));
		this.cont = Util.checkString(cstmt.getString(28));
		this.bocnfmdt = cstmt.getTimestamp(29);
		this.bocnfmyn = Util.checkString(cstmt.getString(30));
		this.boprocdt = cstmt.getTimestamp(31);
		this.boprocyn = Util.checkString(cstmt.getString(32));
		this.boproccont = Util.checkString(cstmt.getString(33));
		this.cns_empnm = Util.checkString(cstmt.getString(34));
		this.cns_empid = Util.checkString(cstmt.getString(35));
		this.proccont = Util.checkString(cstmt.getString(36));
		this.procpers = Util.checkString(cstmt.getString(37));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_DSCTDataSet ds = (SL_S_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDscttypecd()%>
<%= ds.getAcpndt()%>
<%= ds.getAcpnpathcd()%>
<%= ds.getDeptcd()%>
<%= ds.getAreacd()%>
<%= ds.getBocd()%>
<%= ds.getRdr_no()%>
<%= ds.getDsno()%>
<%= ds.getTermsubsno()%>
<%= ds.getMedicd()%>
<%= ds.getRdrnm()%>
<%= ds.getPrn()%>
<%= ds.getRdremail()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
<%= ds.getBocnfmdt()%>
<%= ds.getBocnfmyn()%>
<%= ds.getBoprocdt()%>
<%= ds.getBoprocyn()%>
<%= ds.getBoproccont()%>
<%= ds.getCns_empnm()%>
<%= ds.getCns_empid()%>
<%= ds.getProccont()%>
<%= ds.getProcpers()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 17:58:26 KST 2004 */