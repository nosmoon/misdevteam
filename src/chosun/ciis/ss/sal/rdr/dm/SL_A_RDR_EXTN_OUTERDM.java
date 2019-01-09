/***************************************************************************************************
* 파일명 : SL_A_RDR_EXTN_OUTERDM.java
* 기능 : 외부확장등록관리(등록,수정,삭제)
* 작성일자 : 2004-05-20
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
 * 외부확장등록관리(등록,수정,삭제)
 *
 */

public class SL_A_RDR_EXTN_OUTERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String accflag;
	public String rdr_extndt;
	public String rdr_extnno;
	public String medicd;
	public String aplcdt;
	public long qty;
	public String rdr_extntypecd;
	public String extnblngcd;
	public String bodutycd;
	public String boposicd;
	public String stafclsfcd;
	public String stafno;
	public String boemp_no;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String extnemail;
	public String aplcpersremk;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdremail;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvhopedt;
	public String corrbocd;
	public String resiclsfcd;
	public String resitypecd;
	public String valmm;
	public long rdr_extncost;

	public SL_A_RDR_EXTN_OUTERDM(){}
	public SL_A_RDR_EXTN_OUTERDM(String bocd, String incmgpers, String accflag, String rdr_extndt, String rdr_extnno, String medicd, String aplcdt, long qty, String rdr_extntypecd, String extnblngcd, String bodutycd, String boposicd, String stafclsfcd, String stafno, String boemp_no, String extnflnm, String extntel1, String extntel2, String extntel3, String extnptph_no1, String extnptph_no2, String extnptph_no3, String extnprn, String extnemail, String aplcpersremk, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String rdremail, String dlvzip, String dlvaddr, String dlvdtlsaddr, String dlvhopedt, String corrbocd, String resiclsfcd, String resitypecd, String valmm, long rdr_extncost){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.medicd = medicd;
		this.aplcdt = aplcdt;
		this.qty = qty;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnblngcd = extnblngcd;
		this.bodutycd = bodutycd;
		this.boposicd = boposicd;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.boemp_no = boemp_no;
		this.extnflnm = extnflnm;
		this.extntel1 = extntel1;
		this.extntel2 = extntel2;
		this.extntel3 = extntel3;
		this.extnptph_no1 = extnptph_no1;
		this.extnptph_no2 = extnptph_no2;
		this.extnptph_no3 = extnptph_no3;
		this.extnprn = extnprn;
		this.extnemail = extnemail;
		this.aplcpersremk = aplcpersremk;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.rdremail = rdremail;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.dlvhopedt = dlvhopedt;
		this.corrbocd = corrbocd;
		this.resiclsfcd = resiclsfcd;
		this.resitypecd = resitypecd;
		this.valmm = valmm;
		this.rdr_extncost = rdr_extncost;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
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

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setBodutycd(String bodutycd){
		this.bodutycd = bodutycd;
	}

	public void setBoposicd(String boposicd){
		this.boposicd = boposicd;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
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

	public void setExtnemail(String extnemail){
		this.extnemail = extnemail;
	}

	public void setAplcpersremk(String aplcpersremk){
		this.aplcpersremk = aplcpersremk;
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

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
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

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setRdr_extncost(long rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
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

	public String getAplcdt(){
		return this.aplcdt;
	}

	public long getQty(){
		return this.qty;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getBodutycd(){
		return this.bodutycd;
	}

	public String getBoposicd(){
		return this.boposicd;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getBoemp_no(){
		return this.boemp_no;
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

	public String getExtnemail(){
		return this.extnemail;
	}

	public String getAplcpersremk(){
		return this.aplcpersremk;
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

	public String getRdremail(){
		return this.rdremail;
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

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public long getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_RDR_EXTN_OUTER( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDR_EXTN_OUTERDM dm = (SL_A_RDR_EXTN_OUTERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.rdr_extndt);
		cstmt.setString(7, dm.rdr_extnno);
		cstmt.setString(8, dm.medicd);
		cstmt.setString(9, dm.aplcdt);
		cstmt.setLong(10, dm.qty);
		cstmt.setString(11, dm.rdr_extntypecd);
		cstmt.setString(12, dm.extnblngcd);
		cstmt.setString(13, dm.bodutycd);
		cstmt.setString(14, dm.boposicd);
		cstmt.setString(15, dm.stafclsfcd);
		cstmt.setString(16, dm.stafno);
		cstmt.setString(17, dm.boemp_no);
		cstmt.setString(18, dm.extnflnm);
		cstmt.setString(19, dm.extntel1);
		cstmt.setString(20, dm.extntel2);
		cstmt.setString(21, dm.extntel3);
		cstmt.setString(22, dm.extnptph_no1);
		cstmt.setString(23, dm.extnptph_no2);
		cstmt.setString(24, dm.extnptph_no3);
		cstmt.setString(25, dm.extnprn);
		cstmt.setString(26, dm.extnemail);
		cstmt.setString(27, dm.aplcpersremk);
		cstmt.setString(28, dm.rdrnm);
		cstmt.setString(29, dm.rdrtel_no1);
		cstmt.setString(30, dm.rdrtel_no2);
		cstmt.setString(31, dm.rdrtel_no3);
		cstmt.setString(32, dm.rdrptph_no1);
		cstmt.setString(33, dm.rdrptph_no2);
		cstmt.setString(34, dm.rdrptph_no3);
		cstmt.setString(35, dm.rdremail);
		cstmt.setString(36, dm.dlvzip);
		cstmt.setString(37, dm.dlvaddr);
		cstmt.setString(38, dm.dlvdtlsaddr);
		cstmt.setString(39, dm.dlvhopedt);
		cstmt.setString(40, dm.corrbocd);
		cstmt.setString(41, dm.resiclsfcd);
		cstmt.setString(42, dm.resitypecd);
		cstmt.setString(43, dm.valmm);
		cstmt.setLong(44, dm.rdr_extncost);
		cstmt.registerOutParameter(45, Types.INTEGER);
		cstmt.registerOutParameter(46, Types.INTEGER);
		cstmt.registerOutParameter(47, Types.INTEGER);
		cstmt.registerOutParameter(48, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDR_EXTN_OUTERDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
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
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
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
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String extnblngcd = req.getParameter("extnblngcd");
if( extnblngcd == null){
	System.out.println(this.toString+" : extnblngcd is null" );
}else{
	System.out.println(this.toString+" : extnblngcd is "+extnblngcd );
}
String bodutycd = req.getParameter("bodutycd");
if( bodutycd == null){
	System.out.println(this.toString+" : bodutycd is null" );
}else{
	System.out.println(this.toString+" : bodutycd is "+bodutycd );
}
String boposicd = req.getParameter("boposicd");
if( boposicd == null){
	System.out.println(this.toString+" : boposicd is null" );
}else{
	System.out.println(this.toString+" : boposicd is "+boposicd );
}
String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String extntel1 = req.getParameter("extntel1");
if( extntel1 == null){
	System.out.println(this.toString+" : extntel1 is null" );
}else{
	System.out.println(this.toString+" : extntel1 is "+extntel1 );
}
String extntel2 = req.getParameter("extntel2");
if( extntel2 == null){
	System.out.println(this.toString+" : extntel2 is null" );
}else{
	System.out.println(this.toString+" : extntel2 is "+extntel2 );
}
String extntel3 = req.getParameter("extntel3");
if( extntel3 == null){
	System.out.println(this.toString+" : extntel3 is null" );
}else{
	System.out.println(this.toString+" : extntel3 is "+extntel3 );
}
String extnptph_no1 = req.getParameter("extnptph_no1");
if( extnptph_no1 == null){
	System.out.println(this.toString+" : extnptph_no1 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no1 is "+extnptph_no1 );
}
String extnptph_no2 = req.getParameter("extnptph_no2");
if( extnptph_no2 == null){
	System.out.println(this.toString+" : extnptph_no2 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no2 is "+extnptph_no2 );
}
String extnptph_no3 = req.getParameter("extnptph_no3");
if( extnptph_no3 == null){
	System.out.println(this.toString+" : extnptph_no3 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no3 is "+extnptph_no3 );
}
String extnprn = req.getParameter("extnprn");
if( extnprn == null){
	System.out.println(this.toString+" : extnprn is null" );
}else{
	System.out.println(this.toString+" : extnprn is "+extnprn );
}
String extnemail = req.getParameter("extnemail");
if( extnemail == null){
	System.out.println(this.toString+" : extnemail is null" );
}else{
	System.out.println(this.toString+" : extnemail is "+extnemail );
}
String aplcpersremk = req.getParameter("aplcpersremk");
if( aplcpersremk == null){
	System.out.println(this.toString+" : aplcpersremk is null" );
}else{
	System.out.println(this.toString+" : aplcpersremk is "+aplcpersremk );
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
String rdremail = req.getParameter("rdremail");
if( rdremail == null){
	System.out.println(this.toString+" : rdremail is null" );
}else{
	System.out.println(this.toString+" : rdremail is "+rdremail );
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
String dlvhopedt = req.getParameter("dlvhopedt");
if( dlvhopedt == null){
	System.out.println(this.toString+" : dlvhopedt is null" );
}else{
	System.out.println(this.toString+" : dlvhopedt is "+dlvhopedt );
}
String corrbocd = req.getParameter("corrbocd");
if( corrbocd == null){
	System.out.println(this.toString+" : corrbocd is null" );
}else{
	System.out.println(this.toString+" : corrbocd is "+corrbocd );
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
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String rdr_extncost = req.getParameter("rdr_extncost");
if( rdr_extncost == null){
	System.out.println(this.toString+" : rdr_extncost is null" );
}else{
	System.out.println(this.toString+" : rdr_extncost is "+rdr_extncost );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String qty = Util.checkString(req.getParameter("qty"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String bodutycd = Util.checkString(req.getParameter("bodutycd"));
String boposicd = Util.checkString(req.getParameter("boposicd"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String extntel1 = Util.checkString(req.getParameter("extntel1"));
String extntel2 = Util.checkString(req.getParameter("extntel2"));
String extntel3 = Util.checkString(req.getParameter("extntel3"));
String extnptph_no1 = Util.checkString(req.getParameter("extnptph_no1"));
String extnptph_no2 = Util.checkString(req.getParameter("extnptph_no2"));
String extnptph_no3 = Util.checkString(req.getParameter("extnptph_no3"));
String extnprn = Util.checkString(req.getParameter("extnprn"));
String extnemail = Util.checkString(req.getParameter("extnemail"));
String aplcpersremk = Util.checkString(req.getParameter("aplcpersremk"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String rdremail = Util.checkString(req.getParameter("rdremail"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String dlvhopedt = Util.checkString(req.getParameter("dlvhopedt"));
String corrbocd = Util.checkString(req.getParameter("corrbocd"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String valmm = Util.checkString(req.getParameter("valmm"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String bodutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("bodutycd")));
String boposicd = Util.Uni2Ksc(Util.checkString(req.getParameter("boposicd")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String extntel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel1")));
String extntel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel2")));
String extntel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel3")));
String extnptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no1")));
String extnptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no2")));
String extnptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no3")));
String extnprn = Util.Uni2Ksc(Util.checkString(req.getParameter("extnprn")));
String extnemail = Util.Uni2Ksc(Util.checkString(req.getParameter("extnemail")));
String aplcpersremk = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersremk")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setMedicd(medicd);
dm.setAplcdt(aplcdt);
dm.setQty(qty);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setExtnblngcd(extnblngcd);
dm.setBodutycd(bodutycd);
dm.setBoposicd(boposicd);
dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
dm.setBoemp_no(boemp_no);
dm.setExtnflnm(extnflnm);
dm.setExtntel1(extntel1);
dm.setExtntel2(extntel2);
dm.setExtntel3(extntel3);
dm.setExtnptph_no1(extnptph_no1);
dm.setExtnptph_no2(extnptph_no2);
dm.setExtnptph_no3(extnptph_no3);
dm.setExtnprn(extnprn);
dm.setExtnemail(extnemail);
dm.setAplcpersremk(aplcpersremk);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setRdremail(rdremail);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setDlvhopedt(dlvhopedt);
dm.setCorrbocd(corrbocd);
dm.setResiclsfcd(resiclsfcd);
dm.setResitypecd(resitypecd);
dm.setValmm(valmm);
dm.setRdr_extncost(rdr_extncost);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 03 10:16:06 KST 2004 */