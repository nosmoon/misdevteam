/***************************************************************************************************
 * 파일명   : PS_I_RDR_EXTNDataSet.java
 * 기능     : 독자-확장독자관리 입력
 * 작성일자 : 2004-02-26
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-확장독자관리 입력
 */

public class PS_I_RDR_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String medicd;
	public String aplcdt;
	public long qty;
	public String rshpclsfcd;
	public String aplcpersnm;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String aplcpersoffinm;
	public String aplcpersposi;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdrprn;
	public String rdremail;
	public String rdrmembseq;
	public String rdrposi;
	public String rdroffinm;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String acqclsf;
	public String pymtflnm;
	public String pymtoffinm;
	public String pymtposi;
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
	public String asinresn;
	public String resiclsfcd;
	public String resitypecd;
	public String remk;
	public String rdr_extnclsfcd;

	public PS_I_RDR_EXTNDM(){}
	public PS_I_RDR_EXTNDM(String cmpycd, String incmgpers, String medicd, String aplcdt, long qty, String rshpclsfcd, String aplcpersnm, String aplcperstel_no1, String aplcperstel_no2, String aplcperstel_no3, String aplcpersptph_no1, String aplcpersptph_no2, String aplcpersptph_no3, String aplcpersoffinm, String aplcpersposi, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String rdrprn, String rdremail, String rdrmembseq, String rdrposi, String rdroffinm, String rdroffitel_no1, String rdroffitel_no2, String rdroffitel_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String acqclsf, String pymtflnm, String pymtoffinm, String pymtposi, String pymttel_no1, String pymttel_no2, String pymttel_no3, String pymtptph_no1, String pymtptph_no2, String pymtptph_no3, String pymtzip, String pymtaddr, String pymtdtlsaddr, String rcpmmthd, String asinbocd, String asinresn, String resiclsfcd, String resitypecd, String remk, String rdr_extnclsfcd){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.medicd = medicd;
		this.aplcdt = aplcdt;
		this.qty = qty;
		this.rshpclsfcd = rshpclsfcd;
		this.aplcpersnm = aplcpersnm;
		this.aplcperstel_no1 = aplcperstel_no1;
		this.aplcperstel_no2 = aplcperstel_no2;
		this.aplcperstel_no3 = aplcperstel_no3;
		this.aplcpersptph_no1 = aplcpersptph_no1;
		this.aplcpersptph_no2 = aplcpersptph_no2;
		this.aplcpersptph_no3 = aplcpersptph_no3;
		this.aplcpersoffinm = aplcpersoffinm;
		this.aplcpersposi = aplcpersposi;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.rdrprn = rdrprn;
		this.rdremail = rdremail;
		this.rdrmembseq = rdrmembseq;
		this.rdrposi = rdrposi;
		this.rdroffinm = rdroffinm;
		this.rdroffitel_no1 = rdroffitel_no1;
		this.rdroffitel_no2 = rdroffitel_no2;
		this.rdroffitel_no3 = rdroffitel_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.acqclsf = acqclsf;
		this.pymtflnm = pymtflnm;
		this.pymtoffinm = pymtoffinm;
		this.pymtposi = pymtposi;
		this.pymttel_no1 = pymttel_no1;
		this.pymttel_no2 = pymttel_no2;
		this.pymttel_no3 = pymttel_no3;
		this.pymtptph_no1 = pymtptph_no1;
		this.pymtptph_no2 = pymtptph_no2;
		this.pymtptph_no3 = pymtptph_no3;
		this.pymtzip = pymtzip;
		this.pymtaddr = pymtaddr;
		this.pymtdtlsaddr = pymtdtlsaddr;
		this.rcpmmthd = rcpmmthd;
		this.asinbocd = asinbocd;
		this.asinresn = asinresn;
		this.resiclsfcd = resiclsfcd;
		this.resitypecd = resitypecd;
		this.remk = remk;
		this.rdr_extnclsfcd = rdr_extnclsfcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(long qty){
		this.qty = qty;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
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

	public void setAplcpersoffinm(String aplcpersoffinm){
		this.aplcpersoffinm = aplcpersoffinm;
	}

	public void setAplcpersposi(String aplcpersposi){
		this.aplcpersposi = aplcpersposi;
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

	public void setRdrposi(String rdrposi){
		this.rdrposi = rdrposi;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
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

	public void setPymtoffinm(String pymtoffinm){
		this.pymtoffinm = pymtoffinm;
	}

	public void setPymtposi(String pymtposi){
		this.pymtposi = pymtposi;
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

	public void setAsinresn(String asinresn){
		this.asinresn = asinresn;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRdr_extnclsfcd(String rdr_extnclsfcd){
		this.rdr_extnclsfcd = rdr_extnclsfcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public long getQty(){
		return this.qty;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
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

	public String getAplcpersoffinm(){
		return this.aplcpersoffinm;
	}

	public String getAplcpersposi(){
		return this.aplcpersposi;
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

	public String getRdrposi(){
		return this.rdrposi;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
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

	public String getPymtoffinm(){
		return this.pymtoffinm;
	}

	public String getPymtposi(){
		return this.pymtposi;
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

	public String getAsinresn(){
		return this.asinresn;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRdr_extnclsfcd(){
		return this.rdr_extnclsfcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_RDR_EXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_RDR_EXTNDM dm = (PS_I_RDR_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.aplcdt);
		cstmt.setLong(7, dm.qty);
		cstmt.setString(8, dm.rshpclsfcd);
		cstmt.setString(9, dm.aplcpersnm);
		cstmt.setString(10, dm.aplcperstel_no1);
		cstmt.setString(11, dm.aplcperstel_no2);
		cstmt.setString(12, dm.aplcperstel_no3);
		cstmt.setString(13, dm.aplcpersptph_no1);
		cstmt.setString(14, dm.aplcpersptph_no2);
		cstmt.setString(15, dm.aplcpersptph_no3);
		cstmt.setString(16, dm.aplcpersoffinm);
		cstmt.setString(17, dm.aplcpersposi);
		cstmt.setString(18, dm.rdrnm);
		cstmt.setString(19, dm.rdrtel_no1);
		cstmt.setString(20, dm.rdrtel_no2);
		cstmt.setString(21, dm.rdrtel_no3);
		cstmt.setString(22, dm.rdrptph_no1);
		cstmt.setString(23, dm.rdrptph_no2);
		cstmt.setString(24, dm.rdrptph_no3);
		cstmt.setString(25, dm.rdrprn);
		cstmt.setString(26, dm.rdremail);
		cstmt.setString(27, dm.rdrmembseq);
		cstmt.setString(28, dm.rdrposi);
		cstmt.setString(29, dm.rdroffinm);
		cstmt.setString(30, dm.rdroffitel_no1);
		cstmt.setString(31, dm.rdroffitel_no2);
		cstmt.setString(32, dm.rdroffitel_no3);
		cstmt.setString(33, dm.dlvzip);
		cstmt.setString(34, dm.dlvaddr);
		cstmt.setString(35, dm.dlvdtlsaddr);
		cstmt.setString(36, dm.acqclsf);
		cstmt.setString(37, dm.pymtflnm);
		cstmt.setString(38, dm.pymtoffinm);
		cstmt.setString(39, dm.pymtposi);
		cstmt.setString(40, dm.pymttel_no1);
		cstmt.setString(41, dm.pymttel_no2);
		cstmt.setString(42, dm.pymttel_no3);
		cstmt.setString(43, dm.pymtptph_no1);
		cstmt.setString(44, dm.pymtptph_no2);
		cstmt.setString(45, dm.pymtptph_no3);
		cstmt.setString(46, dm.pymtzip);
		cstmt.setString(47, dm.pymtaddr);
		cstmt.setString(48, dm.pymtdtlsaddr);
		cstmt.setString(49, dm.rcpmmthd);
		cstmt.setString(50, dm.asinbocd);
		cstmt.setString(51, dm.asinresn);
		cstmt.setString(52, dm.resiclsfcd);
		cstmt.setString(53, dm.resitypecd);
		cstmt.setString(54, dm.remk);
		cstmt.setString(55, dm.rdr_extnclsfcd);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_I_RDR_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String rshpclsfcd = req.getParameter("rshpclsfcd");
if( rshpclsfcd == null){
	System.out.println(this.toString+" : rshpclsfcd is null" );
}else{
	System.out.println(this.toString+" : rshpclsfcd is "+rshpclsfcd );
}
String aplcpersnm = req.getParameter("aplcpersnm");
if( aplcpersnm == null){
	System.out.println(this.toString+" : aplcpersnm is null" );
}else{
	System.out.println(this.toString+" : aplcpersnm is "+aplcpersnm );
}
String aplcperstel_no1 = req.getParameter("aplcperstel_no1");
if( aplcperstel_no1 == null){
	System.out.println(this.toString+" : aplcperstel_no1 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no1 is "+aplcperstel_no1 );
}
String aplcperstel_no2 = req.getParameter("aplcperstel_no2");
if( aplcperstel_no2 == null){
	System.out.println(this.toString+" : aplcperstel_no2 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no2 is "+aplcperstel_no2 );
}
String aplcperstel_no3 = req.getParameter("aplcperstel_no3");
if( aplcperstel_no3 == null){
	System.out.println(this.toString+" : aplcperstel_no3 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no3 is "+aplcperstel_no3 );
}
String aplcpersptph_no1 = req.getParameter("aplcpersptph_no1");
if( aplcpersptph_no1 == null){
	System.out.println(this.toString+" : aplcpersptph_no1 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no1 is "+aplcpersptph_no1 );
}
String aplcpersptph_no2 = req.getParameter("aplcpersptph_no2");
if( aplcpersptph_no2 == null){
	System.out.println(this.toString+" : aplcpersptph_no2 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no2 is "+aplcpersptph_no2 );
}
String aplcpersptph_no3 = req.getParameter("aplcpersptph_no3");
if( aplcpersptph_no3 == null){
	System.out.println(this.toString+" : aplcpersptph_no3 is null" );
}else{
	System.out.println(this.toString+" : aplcpersptph_no3 is "+aplcpersptph_no3 );
}
String aplcpersoffinm = req.getParameter("aplcpersoffinm");
if( aplcpersoffinm == null){
	System.out.println(this.toString+" : aplcpersoffinm is null" );
}else{
	System.out.println(this.toString+" : aplcpersoffinm is "+aplcpersoffinm );
}
String aplcpersposi = req.getParameter("aplcpersposi");
if( aplcpersposi == null){
	System.out.println(this.toString+" : aplcpersposi is null" );
}else{
	System.out.println(this.toString+" : aplcpersposi is "+aplcpersposi );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel_no1 = req.getParameter("rdrtel_no1");
if( rdrtel_no1 == null){
	System.out.println(this.toString+" : rdrtel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no1 is "+rdrtel_no1 );
}
String rdrtel_no2 = req.getParameter("rdrtel_no2");
if( rdrtel_no2 == null){
	System.out.println(this.toString+" : rdrtel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no2 is "+rdrtel_no2 );
}
String rdrtel_no3 = req.getParameter("rdrtel_no3");
if( rdrtel_no3 == null){
	System.out.println(this.toString+" : rdrtel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no3 is "+rdrtel_no3 );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String rdrptph_no2 = req.getParameter("rdrptph_no2");
if( rdrptph_no2 == null){
	System.out.println(this.toString+" : rdrptph_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no2 is "+rdrptph_no2 );
}
String rdrptph_no3 = req.getParameter("rdrptph_no3");
if( rdrptph_no3 == null){
	System.out.println(this.toString+" : rdrptph_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no3 is "+rdrptph_no3 );
}
String rdrprn = req.getParameter("rdrprn");
if( rdrprn == null){
	System.out.println(this.toString+" : rdrprn is null" );
}else{
	System.out.println(this.toString+" : rdrprn is "+rdrprn );
}
String rdremail = req.getParameter("rdremail");
if( rdremail == null){
	System.out.println(this.toString+" : rdremail is null" );
}else{
	System.out.println(this.toString+" : rdremail is "+rdremail );
}
String rdrmembseq = req.getParameter("rdrmembseq");
if( rdrmembseq == null){
	System.out.println(this.toString+" : rdrmembseq is null" );
}else{
	System.out.println(this.toString+" : rdrmembseq is "+rdrmembseq );
}
String rdrposi = req.getParameter("rdrposi");
if( rdrposi == null){
	System.out.println(this.toString+" : rdrposi is null" );
}else{
	System.out.println(this.toString+" : rdrposi is "+rdrposi );
}
String rdroffinm = req.getParameter("rdroffinm");
if( rdroffinm == null){
	System.out.println(this.toString+" : rdroffinm is null" );
}else{
	System.out.println(this.toString+" : rdroffinm is "+rdroffinm );
}
String rdroffitel_no1 = req.getParameter("rdroffitel_no1");
if( rdroffitel_no1 == null){
	System.out.println(this.toString+" : rdroffitel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdroffitel_no1 is "+rdroffitel_no1 );
}
String rdroffitel_no2 = req.getParameter("rdroffitel_no2");
if( rdroffitel_no2 == null){
	System.out.println(this.toString+" : rdroffitel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdroffitel_no2 is "+rdroffitel_no2 );
}
String rdroffitel_no3 = req.getParameter("rdroffitel_no3");
if( rdroffitel_no3 == null){
	System.out.println(this.toString+" : rdroffitel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdroffitel_no3 is "+rdroffitel_no3 );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String acqclsf = req.getParameter("acqclsf");
if( acqclsf == null){
	System.out.println(this.toString+" : acqclsf is null" );
}else{
	System.out.println(this.toString+" : acqclsf is "+acqclsf );
}
String pymtflnm = req.getParameter("pymtflnm");
if( pymtflnm == null){
	System.out.println(this.toString+" : pymtflnm is null" );
}else{
	System.out.println(this.toString+" : pymtflnm is "+pymtflnm );
}
String pymtoffinm = req.getParameter("pymtoffinm");
if( pymtoffinm == null){
	System.out.println(this.toString+" : pymtoffinm is null" );
}else{
	System.out.println(this.toString+" : pymtoffinm is "+pymtoffinm );
}
String pymtposi = req.getParameter("pymtposi");
if( pymtposi == null){
	System.out.println(this.toString+" : pymtposi is null" );
}else{
	System.out.println(this.toString+" : pymtposi is "+pymtposi );
}
String pymttel_no1 = req.getParameter("pymttel_no1");
if( pymttel_no1 == null){
	System.out.println(this.toString+" : pymttel_no1 is null" );
}else{
	System.out.println(this.toString+" : pymttel_no1 is "+pymttel_no1 );
}
String pymttel_no2 = req.getParameter("pymttel_no2");
if( pymttel_no2 == null){
	System.out.println(this.toString+" : pymttel_no2 is null" );
}else{
	System.out.println(this.toString+" : pymttel_no2 is "+pymttel_no2 );
}
String pymttel_no3 = req.getParameter("pymttel_no3");
if( pymttel_no3 == null){
	System.out.println(this.toString+" : pymttel_no3 is null" );
}else{
	System.out.println(this.toString+" : pymttel_no3 is "+pymttel_no3 );
}
String pymtptph_no1 = req.getParameter("pymtptph_no1");
if( pymtptph_no1 == null){
	System.out.println(this.toString+" : pymtptph_no1 is null" );
}else{
	System.out.println(this.toString+" : pymtptph_no1 is "+pymtptph_no1 );
}
String pymtptph_no2 = req.getParameter("pymtptph_no2");
if( pymtptph_no2 == null){
	System.out.println(this.toString+" : pymtptph_no2 is null" );
}else{
	System.out.println(this.toString+" : pymtptph_no2 is "+pymtptph_no2 );
}
String pymtptph_no3 = req.getParameter("pymtptph_no3");
if( pymtptph_no3 == null){
	System.out.println(this.toString+" : pymtptph_no3 is null" );
}else{
	System.out.println(this.toString+" : pymtptph_no3 is "+pymtptph_no3 );
}
String pymtzip = req.getParameter("pymtzip");
if( pymtzip == null){
	System.out.println(this.toString+" : pymtzip is null" );
}else{
	System.out.println(this.toString+" : pymtzip is "+pymtzip );
}
String pymtaddr = req.getParameter("pymtaddr");
if( pymtaddr == null){
	System.out.println(this.toString+" : pymtaddr is null" );
}else{
	System.out.println(this.toString+" : pymtaddr is "+pymtaddr );
}
String pymtdtlsaddr = req.getParameter("pymtdtlsaddr");
if( pymtdtlsaddr == null){
	System.out.println(this.toString+" : pymtdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : pymtdtlsaddr is "+pymtdtlsaddr );
}
String rcpmmthd = req.getParameter("rcpmmthd");
if( rcpmmthd == null){
	System.out.println(this.toString+" : rcpmmthd is null" );
}else{
	System.out.println(this.toString+" : rcpmmthd is "+rcpmmthd );
}
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
}
String asinresn = req.getParameter("asinresn");
if( asinresn == null){
	System.out.println(this.toString+" : asinresn is null" );
}else{
	System.out.println(this.toString+" : asinresn is "+asinresn );
}
String resiclsfcd = req.getParameter("resiclsfcd");
if( resiclsfcd == null){
	System.out.println(this.toString+" : resiclsfcd is null" );
}else{
	System.out.println(this.toString+" : resiclsfcd is "+resiclsfcd );
}
String resitypecd = req.getParameter("resitypecd");
if( resitypecd == null){
	System.out.println(this.toString+" : resitypecd is null" );
}else{
	System.out.println(this.toString+" : resitypecd is "+resitypecd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String rdr_extnclsfcd = req.getParameter("rdr_extnclsfcd");
if( rdr_extnclsfcd == null){
	System.out.println(this.toString+" : rdr_extnclsfcd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnclsfcd is "+rdr_extnclsfcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String medicd = Util.checkString(req.getParameter("medicd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String qty = Util.checkString(req.getParameter("qty"));
String rshpclsfcd = Util.checkString(req.getParameter("rshpclsfcd"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String aplcperstel_no1 = Util.checkString(req.getParameter("aplcperstel_no1"));
String aplcperstel_no2 = Util.checkString(req.getParameter("aplcperstel_no2"));
String aplcperstel_no3 = Util.checkString(req.getParameter("aplcperstel_no3"));
String aplcpersptph_no1 = Util.checkString(req.getParameter("aplcpersptph_no1"));
String aplcpersptph_no2 = Util.checkString(req.getParameter("aplcpersptph_no2"));
String aplcpersptph_no3 = Util.checkString(req.getParameter("aplcpersptph_no3"));
String aplcpersoffinm = Util.checkString(req.getParameter("aplcpersoffinm"));
String aplcpersposi = Util.checkString(req.getParameter("aplcpersposi"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String rdrprn = Util.checkString(req.getParameter("rdrprn"));
String rdremail = Util.checkString(req.getParameter("rdremail"));
String rdrmembseq = Util.checkString(req.getParameter("rdrmembseq"));
String rdrposi = Util.checkString(req.getParameter("rdrposi"));
String rdroffinm = Util.checkString(req.getParameter("rdroffinm"));
String rdroffitel_no1 = Util.checkString(req.getParameter("rdroffitel_no1"));
String rdroffitel_no2 = Util.checkString(req.getParameter("rdroffitel_no2"));
String rdroffitel_no3 = Util.checkString(req.getParameter("rdroffitel_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String acqclsf = Util.checkString(req.getParameter("acqclsf"));
String pymtflnm = Util.checkString(req.getParameter("pymtflnm"));
String pymtoffinm = Util.checkString(req.getParameter("pymtoffinm"));
String pymtposi = Util.checkString(req.getParameter("pymtposi"));
String pymttel_no1 = Util.checkString(req.getParameter("pymttel_no1"));
String pymttel_no2 = Util.checkString(req.getParameter("pymttel_no2"));
String pymttel_no3 = Util.checkString(req.getParameter("pymttel_no3"));
String pymtptph_no1 = Util.checkString(req.getParameter("pymtptph_no1"));
String pymtptph_no2 = Util.checkString(req.getParameter("pymtptph_no2"));
String pymtptph_no3 = Util.checkString(req.getParameter("pymtptph_no3"));
String pymtzip = Util.checkString(req.getParameter("pymtzip"));
String pymtaddr = Util.checkString(req.getParameter("pymtaddr"));
String pymtdtlsaddr = Util.checkString(req.getParameter("pymtdtlsaddr"));
String rcpmmthd = Util.checkString(req.getParameter("rcpmmthd"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String asinresn = Util.checkString(req.getParameter("asinresn"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String remk = Util.checkString(req.getParameter("remk"));
String rdr_extnclsfcd = Util.checkString(req.getParameter("rdr_extnclsfcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));
String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));
String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));
String aplcpersoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersoffinm")));
String aplcpersposi = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersposi")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));
String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
String rdrmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrmembseq")));
String rdrposi = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrposi")));
String rdroffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffinm")));
String rdroffitel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no1")));
String rdroffitel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no2")));
String rdroffitel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String acqclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acqclsf")));
String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
String pymtoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtoffinm")));
String pymtposi = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtposi")));
String pymttel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no1")));
String pymttel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no2")));
String pymttel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no3")));
String pymtptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no1")));
String pymtptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no2")));
String pymtptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no3")));
String pymtzip = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtzip")));
String pymtaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtaddr")));
String pymtdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdtlsaddr")));
String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String asinresn = Util.Uni2Ksc(Util.checkString(req.getParameter("asinresn")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String rdr_extnclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnclsfcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setMedicd(medicd);
dm.setAplcdt(aplcdt);
dm.setQty(qty);
dm.setRshpclsfcd(rshpclsfcd);
dm.setAplcpersnm(aplcpersnm);
dm.setAplcperstel_no1(aplcperstel_no1);
dm.setAplcperstel_no2(aplcperstel_no2);
dm.setAplcperstel_no3(aplcperstel_no3);
dm.setAplcpersptph_no1(aplcpersptph_no1);
dm.setAplcpersptph_no2(aplcpersptph_no2);
dm.setAplcpersptph_no3(aplcpersptph_no3);
dm.setAplcpersoffinm(aplcpersoffinm);
dm.setAplcpersposi(aplcpersposi);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setRdrprn(rdrprn);
dm.setRdremail(rdremail);
dm.setRdrmembseq(rdrmembseq);
dm.setRdrposi(rdrposi);
dm.setRdroffinm(rdroffinm);
dm.setRdroffitel_no1(rdroffitel_no1);
dm.setRdroffitel_no2(rdroffitel_no2);
dm.setRdroffitel_no3(rdroffitel_no3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setAcqclsf(acqclsf);
dm.setPymtflnm(pymtflnm);
dm.setPymtoffinm(pymtoffinm);
dm.setPymtposi(pymtposi);
dm.setPymttel_no1(pymttel_no1);
dm.setPymttel_no2(pymttel_no2);
dm.setPymttel_no3(pymttel_no3);
dm.setPymtptph_no1(pymtptph_no1);
dm.setPymtptph_no2(pymtptph_no2);
dm.setPymtptph_no3(pymtptph_no3);
dm.setPymtzip(pymtzip);
dm.setPymtaddr(pymtaddr);
dm.setPymtdtlsaddr(pymtdtlsaddr);
dm.setRcpmmthd(rcpmmthd);
dm.setAsinbocd(asinbocd);
dm.setAsinresn(asinresn);
dm.setResiclsfcd(resiclsfcd);
dm.setResitypecd(resitypecd);
dm.setRemk(remk);
dm.setRdr_extnclsfcd(rdr_extnclsfcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 28 14:29:09 KST 2007 */