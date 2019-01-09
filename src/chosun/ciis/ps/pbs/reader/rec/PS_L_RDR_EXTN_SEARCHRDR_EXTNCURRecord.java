/***************************************************************************************************
 * 파일명   : PS_L_RDR_EXTN_SEARCH.java
 * 기능     : 독자-확장독자내역 조회
 * 작성일자 : 2007-05-28
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 *   독자-확장독자내역 조회
 *
 **/

public class PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String medicd;
	public String medinm;
	public String aplcdt;
	public int qty;
	public String aplcpathcd;
	public String aplcpathnm;
	public String rdr_extntypecd;
	public String rdr_extntypenm;
	public String extnblngcd;
	public String empdeptcd;
	public String empdeptnm;
	public String empseq;
	public String extnid;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String aplcpersnm;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String rdrnm;
	public String phone;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdrprn;
	public String rdremail;
	public String rdrmembseq;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String acqclsf;
	public String pymtflnm;
	public String pymttel_no1;
	public String pymttel_no2;
	public String pymttel_no3;
	public String pymtptph_no1;
	public String pymtptph_no2;
	public String pymtptph_no3;
	public String pymtzip;
	public String pymtaddr;
	public String pymtdtlsaddr;
	public String rcpmmthd;
	public String asinbocd;
	public String asinbonm;
	public String bouseyn;
	public String deliproccd;
	public String prcmsg;
	public String rnum;
	public String rdr_extn_info;
	public String rdr_extnclsfnm;
	public String prvsubsmedinm;

	public PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setEmpdeptcd(String empdeptcd){
		this.empdeptcd = empdeptcd;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setExtnid(String extnid){
		this.extnid = extnid;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcperstel_no1(String aplcperstel_no1){
		this.aplcperstel_no1 = aplcperstel_no1;
	}

	public void setAplcperstel_no2(String aplcperstel_no2){
		this.aplcperstel_no2 = aplcperstel_no2;
	}

	public void setAplcperstel_no3(String aplcperstel_no3){
		this.aplcperstel_no3 = aplcperstel_no3;
	}

	public void setAplcpersptph_no1(String aplcpersptph_no1){
		this.aplcpersptph_no1 = aplcpersptph_no1;
	}

	public void setAplcpersptph_no2(String aplcpersptph_no2){
		this.aplcpersptph_no2 = aplcpersptph_no2;
	}

	public void setAplcpersptph_no3(String aplcpersptph_no3){
		this.aplcpersptph_no3 = aplcpersptph_no3;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPhone(String phone){
		this.phone = phone;
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

	public void setRdrprn(String rdrprn){
		this.rdrprn = rdrprn;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setRdrmembseq(String rdrmembseq){
		this.rdrmembseq = rdrmembseq;
	}

	public void setRdroffitel_no1(String rdroffitel_no1){
		this.rdroffitel_no1 = rdroffitel_no1;
	}

	public void setRdroffitel_no2(String rdroffitel_no2){
		this.rdroffitel_no2 = rdroffitel_no2;
	}

	public void setRdroffitel_no3(String rdroffitel_no3){
		this.rdroffitel_no3 = rdroffitel_no3;
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

	public void setAcqclsf(String acqclsf){
		this.acqclsf = acqclsf;
	}

	public void setPymtflnm(String pymtflnm){
		this.pymtflnm = pymtflnm;
	}

	public void setPymttel_no1(String pymttel_no1){
		this.pymttel_no1 = pymttel_no1;
	}

	public void setPymttel_no2(String pymttel_no2){
		this.pymttel_no2 = pymttel_no2;
	}

	public void setPymttel_no3(String pymttel_no3){
		this.pymttel_no3 = pymttel_no3;
	}

	public void setPymtptph_no1(String pymtptph_no1){
		this.pymtptph_no1 = pymtptph_no1;
	}

	public void setPymtptph_no2(String pymtptph_no2){
		this.pymtptph_no2 = pymtptph_no2;
	}

	public void setPymtptph_no3(String pymtptph_no3){
		this.pymtptph_no3 = pymtptph_no3;
	}

	public void setPymtzip(String pymtzip){
		this.pymtzip = pymtzip;
	}

	public void setPymtaddr(String pymtaddr){
		this.pymtaddr = pymtaddr;
	}

	public void setPymtdtlsaddr(String pymtdtlsaddr){
		this.pymtdtlsaddr = pymtdtlsaddr;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
	}

	public void setAsinbonm(String asinbonm){
		this.asinbonm = asinbonm;
	}

	public void setBouseyn(String bouseyn){
		this.bouseyn = bouseyn;
	}

	public void setDeliproccd(String deliproccd){
		this.deliproccd = deliproccd;
	}

	public void setPrcmsg(String prcmsg){
		this.prcmsg = prcmsg;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setRdr_extn_info(String rdr_extn_info){
		this.rdr_extn_info = rdr_extn_info;
	}

	public void setRdr_extnclsfnm(String rdr_extnclsfnm){
		this.rdr_extnclsfnm = rdr_extnclsfnm;
	}

	public void setPrvsubsmedinm(String prvsubsmedinm){
		this.prvsubsmedinm = prvsubsmedinm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getEmpdeptcd(){
		return this.empdeptcd;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getExtnid(){
		return this.extnid;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcperstel_no1(){
		return this.aplcperstel_no1;
	}

	public String getAplcperstel_no2(){
		return this.aplcperstel_no2;
	}

	public String getAplcperstel_no3(){
		return this.aplcperstel_no3;
	}

	public String getAplcpersptph_no1(){
		return this.aplcpersptph_no1;
	}

	public String getAplcpersptph_no2(){
		return this.aplcpersptph_no2;
	}

	public String getAplcpersptph_no3(){
		return this.aplcpersptph_no3;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPhone(){
		return this.phone;
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

	public String getRdrprn(){
		return this.rdrprn;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getRdrmembseq(){
		return this.rdrmembseq;
	}

	public String getRdroffitel_no1(){
		return this.rdroffitel_no1;
	}

	public String getRdroffitel_no2(){
		return this.rdroffitel_no2;
	}

	public String getRdroffitel_no3(){
		return this.rdroffitel_no3;
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

	public String getAcqclsf(){
		return this.acqclsf;
	}

	public String getPymtflnm(){
		return this.pymtflnm;
	}

	public String getPymttel_no1(){
		return this.pymttel_no1;
	}

	public String getPymttel_no2(){
		return this.pymttel_no2;
	}

	public String getPymttel_no3(){
		return this.pymttel_no3;
	}

	public String getPymtptph_no1(){
		return this.pymtptph_no1;
	}

	public String getPymtptph_no2(){
		return this.pymtptph_no2;
	}

	public String getPymtptph_no3(){
		return this.pymtptph_no3;
	}

	public String getPymtzip(){
		return this.pymtzip;
	}

	public String getPymtaddr(){
		return this.pymtaddr;
	}

	public String getPymtdtlsaddr(){
		return this.pymtdtlsaddr;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public String getAsinbonm(){
		return this.asinbonm;
	}

	public String getBouseyn(){
		return this.bouseyn;
	}

	public String getDeliproccd(){
		return this.deliproccd;
	}

	public String getPrcmsg(){
		return this.prcmsg;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getRdr_extn_info(){
		return this.rdr_extn_info;
	}

	public String getRdr_extnclsfnm(){
		return this.rdr_extnclsfnm;
	}

	public String getPrvsubsmedinm(){
		return this.prvsubsmedinm;
	}
}

/* 작성시간 : Mon May 28 11:38:49 KST 2007 */