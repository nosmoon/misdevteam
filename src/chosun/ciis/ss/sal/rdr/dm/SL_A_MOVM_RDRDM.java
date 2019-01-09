/***************************************************************************************************
* 파일명 : SL_A_MOVM_RDRDM.java
* 기능 : 독자-이사독자관리(인계)-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-01-15
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자-이사독자관리-등록,수정,삭제를 위한 DM
 */

public class SL_A_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String userflag;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public String aplcpathcd;
	public String trsfbocd;
	public String acptbocd;
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
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String movmresiclsf;
	public String movmresitype;
	public String remk;
	public String dlvhopedt;
	public String trsfbocnfmyn;
	public String trsfbocnfmstat;
	public String acptbocnfmyn;
	public String acptbocnfmstat;
	public String acptboremk;
	public String trsfboremk;
	public String cns_empid;
	public String cns_empnm;
	public String cns_empcnfmyn;
	public String cns_empremk;
	public String post_dlvyn;

	public SL_A_MOVM_RDRDM(){}
	public SL_A_MOVM_RDRDM(String incmgpers, String accflag, String userflag, String regdt, String regno, String rdr_no, String rdrnm, String aplcpathcd, String trsfbocd, String acptbocd, String movmdt, String zip, String addr, String dtlsaddr, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String movmzip, String movmaddr, String movmdtlsaddr, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String movmtel_no1, String movmtel_no2, String movmtel_no3, String movmresiclsf, String movmresitype, String remk, String dlvhopedt, String trsfbocnfmyn, String trsfbocnfmstat, String acptbocnfmyn, String acptbocnfmstat, String acptboremk, String trsfboremk, String cns_empid, String cns_empnm, String cns_empcnfmyn, String cns_empremk, String post_dlvyn){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.userflag = userflag;
		this.regdt = regdt;
		this.regno = regno;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.aplcpathcd = aplcpathcd;
		this.trsfbocd = trsfbocd;
		this.acptbocd = acptbocd;
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
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.movmtel_no1 = movmtel_no1;
		this.movmtel_no2 = movmtel_no2;
		this.movmtel_no3 = movmtel_no3;
		this.movmresiclsf = movmresiclsf;
		this.movmresitype = movmresitype;
		this.remk = remk;
		this.dlvhopedt = dlvhopedt;
		this.trsfbocnfmyn = trsfbocnfmyn;
		this.trsfbocnfmstat = trsfbocnfmstat;
		this.acptbocnfmyn = acptbocnfmyn;
		this.acptbocnfmstat = acptbocnfmstat;
		this.acptboremk = acptboremk;
		this.trsfboremk = trsfboremk;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empremk = cns_empremk;
		this.post_dlvyn = post_dlvyn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setUserflag(String userflag){
		this.userflag = userflag;
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

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
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

	public void setMovmresiclsf(String movmresiclsf){
		this.movmresiclsf = movmresiclsf;
	}

	public void setMovmresitype(String movmresitype){
		this.movmresitype = movmresitype;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setTrsfbocnfmyn(String trsfbocnfmyn){
		this.trsfbocnfmyn = trsfbocnfmyn;
	}

	public void setTrsfbocnfmstat(String trsfbocnfmstat){
		this.trsfbocnfmstat = trsfbocnfmstat;
	}

	public void setAcptbocnfmyn(String acptbocnfmyn){
		this.acptbocnfmyn = acptbocnfmyn;
	}

	public void setAcptbocnfmstat(String acptbocnfmstat){
		this.acptbocnfmstat = acptbocnfmstat;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
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

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getUserflag(){
		return this.userflag;
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

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getAcptbocd(){
		return this.acptbocd;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
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

	public String getMovmresiclsf(){
		return this.movmresiclsf;
	}

	public String getMovmresitype(){
		return this.movmresitype;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getTrsfbocnfmyn(){
		return this.trsfbocnfmyn;
	}

	public String getTrsfbocnfmstat(){
		return this.trsfbocnfmstat;
	}

	public String getAcptbocnfmyn(){
		return this.acptbocnfmyn;
	}

	public String getAcptbocnfmstat(){
		return this.acptbocnfmstat;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
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

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_MOVM_RDRDM dm = (SL_A_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.userflag);
		cstmt.setString(6, dm.regdt);
		cstmt.setString(7, dm.regno);
		cstmt.setString(8, dm.rdr_no);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.aplcpathcd);
		cstmt.setString(11, dm.trsfbocd);
		cstmt.setString(12, dm.acptbocd);
		cstmt.setString(13, dm.movmdt);
		cstmt.setString(14, dm.zip);
		cstmt.setString(15, dm.addr);
		cstmt.setString(16, dm.dtlsaddr);
		cstmt.setString(17, dm.rdrtel_no1);
		cstmt.setString(18, dm.rdrtel_no2);
		cstmt.setString(19, dm.rdrtel_no3);
		cstmt.setString(20, dm.movmzip);
		cstmt.setString(21, dm.movmaddr);
		cstmt.setString(22, dm.movmdtlsaddr);
		cstmt.setString(23, dm.rdrptph_no1);
		cstmt.setString(24, dm.rdrptph_no2);
		cstmt.setString(25, dm.rdrptph_no3);
		cstmt.setString(26, dm.movmtel_no1);
		cstmt.setString(27, dm.movmtel_no2);
		cstmt.setString(28, dm.movmtel_no3);
		cstmt.setString(29, dm.movmresiclsf);
		cstmt.setString(30, dm.movmresitype);
		cstmt.setString(31, dm.remk);
		cstmt.setString(32, dm.dlvhopedt);
		cstmt.setString(33, dm.trsfbocnfmyn);
		cstmt.setString(34, dm.trsfbocnfmstat);
		cstmt.setString(35, dm.acptbocnfmyn);
		cstmt.setString(36, dm.acptbocnfmstat);
		cstmt.setString(37, dm.acptboremk);
		cstmt.setString(38, dm.trsfboremk);
		cstmt.setString(39, dm.cns_empid);
		cstmt.setString(40, dm.cns_empnm);
		cstmt.setString(41, dm.cns_empcnfmyn);
		cstmt.setString(42, dm.cns_empremk);
		cstmt.setString(43, dm.post_dlvyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_MOVM_RDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String userflag = req.getParameter("userflag");
if( userflag == null){
	System.out.println(this.toString+" : userflag is null" );
}else{
	System.out.println(this.toString+" : userflag is "+userflag );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String trsfbocd = req.getParameter("trsfbocd");
if( trsfbocd == null){
	System.out.println(this.toString+" : trsfbocd is null" );
}else{
	System.out.println(this.toString+" : trsfbocd is "+trsfbocd );
}
String acptbocd = req.getParameter("acptbocd");
if( acptbocd == null){
	System.out.println(this.toString+" : acptbocd is null" );
}else{
	System.out.println(this.toString+" : acptbocd is "+acptbocd );
}
String movmdt = req.getParameter("movmdt");
if( movmdt == null){
	System.out.println(this.toString+" : movmdt is null" );
}else{
	System.out.println(this.toString+" : movmdt is "+movmdt );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtlsaddr = req.getParameter("dtlsaddr");
if( dtlsaddr == null){
	System.out.println(this.toString+" : dtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dtlsaddr is "+dtlsaddr );
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
String movmzip = req.getParameter("movmzip");
if( movmzip == null){
	System.out.println(this.toString+" : movmzip is null" );
}else{
	System.out.println(this.toString+" : movmzip is "+movmzip );
}
String movmaddr = req.getParameter("movmaddr");
if( movmaddr == null){
	System.out.println(this.toString+" : movmaddr is null" );
}else{
	System.out.println(this.toString+" : movmaddr is "+movmaddr );
}
String movmdtlsaddr = req.getParameter("movmdtlsaddr");
if( movmdtlsaddr == null){
	System.out.println(this.toString+" : movmdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : movmdtlsaddr is "+movmdtlsaddr );
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
String movmtel_no1 = req.getParameter("movmtel_no1");
if( movmtel_no1 == null){
	System.out.println(this.toString+" : movmtel_no1 is null" );
}else{
	System.out.println(this.toString+" : movmtel_no1 is "+movmtel_no1 );
}
String movmtel_no2 = req.getParameter("movmtel_no2");
if( movmtel_no2 == null){
	System.out.println(this.toString+" : movmtel_no2 is null" );
}else{
	System.out.println(this.toString+" : movmtel_no2 is "+movmtel_no2 );
}
String movmtel_no3 = req.getParameter("movmtel_no3");
if( movmtel_no3 == null){
	System.out.println(this.toString+" : movmtel_no3 is null" );
}else{
	System.out.println(this.toString+" : movmtel_no3 is "+movmtel_no3 );
}
String movmresiclsf = req.getParameter("movmresiclsf");
if( movmresiclsf == null){
	System.out.println(this.toString+" : movmresiclsf is null" );
}else{
	System.out.println(this.toString+" : movmresiclsf is "+movmresiclsf );
}
String movmresitype = req.getParameter("movmresitype");
if( movmresitype == null){
	System.out.println(this.toString+" : movmresitype is null" );
}else{
	System.out.println(this.toString+" : movmresitype is "+movmresitype );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String dlvhopedt = req.getParameter("dlvhopedt");
if( dlvhopedt == null){
	System.out.println(this.toString+" : dlvhopedt is null" );
}else{
	System.out.println(this.toString+" : dlvhopedt is "+dlvhopedt );
}
String trsfbocnfmyn = req.getParameter("trsfbocnfmyn");
if( trsfbocnfmyn == null){
	System.out.println(this.toString+" : trsfbocnfmyn is null" );
}else{
	System.out.println(this.toString+" : trsfbocnfmyn is "+trsfbocnfmyn );
}
String trsfbocnfmstat = req.getParameter("trsfbocnfmstat");
if( trsfbocnfmstat == null){
	System.out.println(this.toString+" : trsfbocnfmstat is null" );
}else{
	System.out.println(this.toString+" : trsfbocnfmstat is "+trsfbocnfmstat );
}
String acptbocnfmyn = req.getParameter("acptbocnfmyn");
if( acptbocnfmyn == null){
	System.out.println(this.toString+" : acptbocnfmyn is null" );
}else{
	System.out.println(this.toString+" : acptbocnfmyn is "+acptbocnfmyn );
}
String acptbocnfmstat = req.getParameter("acptbocnfmstat");
if( acptbocnfmstat == null){
	System.out.println(this.toString+" : acptbocnfmstat is null" );
}else{
	System.out.println(this.toString+" : acptbocnfmstat is "+acptbocnfmstat );
}
String acptboremk = req.getParameter("acptboremk");
if( acptboremk == null){
	System.out.println(this.toString+" : acptboremk is null" );
}else{
	System.out.println(this.toString+" : acptboremk is "+acptboremk );
}
String trsfboremk = req.getParameter("trsfboremk");
if( trsfboremk == null){
	System.out.println(this.toString+" : trsfboremk is null" );
}else{
	System.out.println(this.toString+" : trsfboremk is "+trsfboremk );
}
String cns_empid = req.getParameter("cns_empid");
if( cns_empid == null){
	System.out.println(this.toString+" : cns_empid is null" );
}else{
	System.out.println(this.toString+" : cns_empid is "+cns_empid );
}
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
}
String cns_empcnfmyn = req.getParameter("cns_empcnfmyn");
if( cns_empcnfmyn == null){
	System.out.println(this.toString+" : cns_empcnfmyn is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmyn is "+cns_empcnfmyn );
}
String cns_empremk = req.getParameter("cns_empremk");
if( cns_empremk == null){
	System.out.println(this.toString+" : cns_empremk is null" );
}else{
	System.out.println(this.toString+" : cns_empremk is "+cns_empremk );
}
String post_dlvyn = req.getParameter("post_dlvyn");
if( post_dlvyn == null){
	System.out.println(this.toString+" : post_dlvyn is null" );
}else{
	System.out.println(this.toString+" : post_dlvyn is "+post_dlvyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String userflag = Util.checkString(req.getParameter("userflag"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String trsfbocd = Util.checkString(req.getParameter("trsfbocd"));
String acptbocd = Util.checkString(req.getParameter("acptbocd"));
String movmdt = Util.checkString(req.getParameter("movmdt"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String movmzip = Util.checkString(req.getParameter("movmzip"));
String movmaddr = Util.checkString(req.getParameter("movmaddr"));
String movmdtlsaddr = Util.checkString(req.getParameter("movmdtlsaddr"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String movmtel_no1 = Util.checkString(req.getParameter("movmtel_no1"));
String movmtel_no2 = Util.checkString(req.getParameter("movmtel_no2"));
String movmtel_no3 = Util.checkString(req.getParameter("movmtel_no3"));
String movmresiclsf = Util.checkString(req.getParameter("movmresiclsf"));
String movmresitype = Util.checkString(req.getParameter("movmresitype"));
String remk = Util.checkString(req.getParameter("remk"));
String dlvhopedt = Util.checkString(req.getParameter("dlvhopedt"));
String trsfbocnfmyn = Util.checkString(req.getParameter("trsfbocnfmyn"));
String trsfbocnfmstat = Util.checkString(req.getParameter("trsfbocnfmstat"));
String acptbocnfmyn = Util.checkString(req.getParameter("acptbocnfmyn"));
String acptbocnfmstat = Util.checkString(req.getParameter("acptbocnfmstat"));
String acptboremk = Util.checkString(req.getParameter("acptboremk"));
String trsfboremk = Util.checkString(req.getParameter("trsfboremk"));
String cns_empid = Util.checkString(req.getParameter("cns_empid"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String cns_empcnfmyn = Util.checkString(req.getParameter("cns_empcnfmyn"));
String cns_empremk = Util.checkString(req.getParameter("cns_empremk"));
String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String userflag = Util.Uni2Ksc(Util.checkString(req.getParameter("userflag")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String trsfbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfbocd")));
String acptbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocd")));
String movmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdt")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String movmzip = Util.Uni2Ksc(Util.checkString(req.getParameter("movmzip")));
String movmaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("movmaddr")));
String movmdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdtlsaddr")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String movmtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("movmtel_no1")));
String movmtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("movmtel_no2")));
String movmtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("movmtel_no3")));
String movmresiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresiclsf")));
String movmresitype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmresitype")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
String trsfbocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfbocnfmyn")));
String trsfbocnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfbocnfmstat")));
String acptbocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocnfmyn")));
String acptbocnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocnfmstat")));
String acptboremk = Util.Uni2Ksc(Util.checkString(req.getParameter("acptboremk")));
String trsfboremk = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfboremk")));
String cns_empid = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empid")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String cns_empcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmyn")));
String cns_empremk = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empremk")));
String post_dlvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setUserflag(userflag);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setAplcpathcd(aplcpathcd);
dm.setTrsfbocd(trsfbocd);
dm.setAcptbocd(acptbocd);
dm.setMovmdt(movmdt);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setMovmzip(movmzip);
dm.setMovmaddr(movmaddr);
dm.setMovmdtlsaddr(movmdtlsaddr);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setMovmtel_no1(movmtel_no1);
dm.setMovmtel_no2(movmtel_no2);
dm.setMovmtel_no3(movmtel_no3);
dm.setMovmresiclsf(movmresiclsf);
dm.setMovmresitype(movmresitype);
dm.setRemk(remk);
dm.setDlvhopedt(dlvhopedt);
dm.setTrsfbocnfmyn(trsfbocnfmyn);
dm.setTrsfbocnfmstat(trsfbocnfmstat);
dm.setAcptbocnfmyn(acptbocnfmyn);
dm.setAcptbocnfmstat(acptbocnfmstat);
dm.setAcptboremk(acptboremk);
dm.setTrsfboremk(trsfboremk);
dm.setCns_empid(cns_empid);
dm.setCns_empnm(cns_empnm);
dm.setCns_empcnfmyn(cns_empcnfmyn);
dm.setCns_empremk(cns_empremk);
dm.setPost_dlvyn(post_dlvyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 17 20:28:54 KST 2004 */