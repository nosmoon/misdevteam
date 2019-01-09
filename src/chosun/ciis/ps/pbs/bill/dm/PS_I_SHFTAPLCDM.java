/***************************************************************************************************
* 파일명 : PS_I_SHFTAPLC.java
* 기능   : 지로/카드자동이체 등록
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 - 수금 - 지로/카드자동이체 등록
 *
 */

public class PS_I_SHFTAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String incmgpers;
	public String rdrnm;
	public String rdrtel1;
	public String rdrtel2;
	public String rdrtel3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvaddrdtls;
	public String rdrprn;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String shftclsf;
	public String pymtnm;
	public String pymtno_2;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String bankcd;
	public String acctno;
	public String prn;
	public String aplyyymm;
	public String email;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String aplcpathcd;
	public String tmpflag;
	public String remk;
	public String aplcno;
	public String aplcdt;

	public PS_I_SHFTAPLCDM(){}
	public PS_I_SHFTAPLCDM(String accflag, String bocd, String incmgpers, String rdrnm, String rdrtel1, String rdrtel2, String rdrtel3, String dlvzip, String dlvaddr, String dlvaddrdtls, String rdrprn, String cardcmpycd, String cardno, String vdtyprd, String shftclsf, String pymtnm, String pymtno_2, String pymttel1, String pymttel2, String pymttel3, String bankcd, String acctno, String prn, String aplyyymm, String email, String rdr_no, String medicd, String termsubsno, String aplcpathcd, String tmpflag, String remk, String aplcno, String aplcdt){
		this.accflag = accflag;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.rdrnm = rdrnm;
		this.rdrtel1 = rdrtel1;
		this.rdrtel2 = rdrtel2;
		this.rdrtel3 = rdrtel3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvaddrdtls = dlvaddrdtls;
		this.rdrprn = rdrprn;
		this.cardcmpycd = cardcmpycd;
		this.cardno = cardno;
		this.vdtyprd = vdtyprd;
		this.shftclsf = shftclsf;
		this.pymtnm = pymtnm;
		this.pymtno_2 = pymtno_2;
		this.pymttel1 = pymttel1;
		this.pymttel2 = pymttel2;
		this.pymttel3 = pymttel3;
		this.bankcd = bankcd;
		this.acctno = acctno;
		this.prn = prn;
		this.aplyyymm = aplyyymm;
		this.email = email;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.aplcpathcd = aplcpathcd;
		this.tmpflag = tmpflag;
		this.remk = remk;
		this.aplcno = aplcno;
		this.aplcdt = aplcdt;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel1(String rdrtel1){
		this.rdrtel1 = rdrtel1;
	}

	public void setRdrtel2(String rdrtel2){
		this.rdrtel2 = rdrtel2;
	}

	public void setRdrtel3(String rdrtel3){
		this.rdrtel3 = rdrtel3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvaddrdtls(String dlvaddrdtls){
		this.dlvaddrdtls = dlvaddrdtls;
	}

	public void setRdrprn(String rdrprn){
		this.rdrprn = rdrprn;
	}

	public void setCardcmpycd(String cardcmpycd){
		this.cardcmpycd = cardcmpycd;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setVdtyprd(String vdtyprd){
		this.vdtyprd = vdtyprd;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setPymtno_2(String pymtno_2){
		this.pymtno_2 = pymtno_2;
	}

	public void setPymttel1(String pymttel1){
		this.pymttel1 = pymttel1;
	}

	public void setPymttel2(String pymttel2){
		this.pymttel2 = pymttel2;
	}

	public void setPymttel3(String pymttel3){
		this.pymttel3 = pymttel3;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setTmpflag(String tmpflag){
		this.tmpflag = tmpflag;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel1(){
		return this.rdrtel1;
	}

	public String getRdrtel2(){
		return this.rdrtel2;
	}

	public String getRdrtel3(){
		return this.rdrtel3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvaddrdtls(){
		return this.dlvaddrdtls;
	}

	public String getRdrprn(){
		return this.rdrprn;
	}

	public String getCardcmpycd(){
		return this.cardcmpycd;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getVdtyprd(){
		return this.vdtyprd;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getPymtno_2(){
		return this.pymtno_2;
	}

	public String getPymttel1(){
		return this.pymttel1;
	}

	public String getPymttel2(){
		return this.pymttel2;
	}

	public String getPymttel3(){
		return this.pymttel3;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getTmpflag(){
		return this.tmpflag;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_SHFTAPLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_SHFTAPLCDM dm = (PS_I_SHFTAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.rdrnm);
		cstmt.setString(7, dm.rdrtel1);
		cstmt.setString(8, dm.rdrtel2);
		cstmt.setString(9, dm.rdrtel3);
		cstmt.setString(10, dm.dlvzip);
		cstmt.setString(11, dm.dlvaddr);
		cstmt.setString(12, dm.dlvaddrdtls);
		cstmt.setString(13, dm.rdrprn);
		cstmt.setString(14, dm.cardcmpycd);
		cstmt.setString(15, dm.cardno);
		cstmt.setString(16, dm.vdtyprd);
		cstmt.setString(17, dm.shftclsf);
		cstmt.setString(18, dm.pymtnm);
		cstmt.setString(19, dm.pymtno_2);
		cstmt.setString(20, dm.pymttel1);
		cstmt.setString(21, dm.pymttel2);
		cstmt.setString(22, dm.pymttel3);
		cstmt.setString(23, dm.bankcd);
		cstmt.setString(24, dm.acctno);
		cstmt.setString(25, dm.prn);
		cstmt.setString(26, dm.aplyyymm);
		cstmt.setString(27, dm.email);
		cstmt.setString(28, dm.rdr_no);
		cstmt.setString(29, dm.medicd);
		cstmt.setString(30, dm.termsubsno);
		cstmt.setString(31, dm.aplcpathcd);
		cstmt.setString(32, dm.tmpflag);
		cstmt.setString(33, dm.remk);
		cstmt.setString(34, dm.aplcno);
		cstmt.setString(35, dm.aplcdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_I_SHFTAPLCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
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
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel1 = req.getParameter("rdrtel1");
if( rdrtel1 == null){
	System.out.println(this.toString+" : rdrtel1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel1 is "+rdrtel1 );
}
String rdrtel2 = req.getParameter("rdrtel2");
if( rdrtel2 == null){
	System.out.println(this.toString+" : rdrtel2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel2 is "+rdrtel2 );
}
String rdrtel3 = req.getParameter("rdrtel3");
if( rdrtel3 == null){
	System.out.println(this.toString+" : rdrtel3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel3 is "+rdrtel3 );
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
String dlvaddrdtls = req.getParameter("dlvaddrdtls");
if( dlvaddrdtls == null){
	System.out.println(this.toString+" : dlvaddrdtls is null" );
}else{
	System.out.println(this.toString+" : dlvaddrdtls is "+dlvaddrdtls );
}
String rdrprn = req.getParameter("rdrprn");
if( rdrprn == null){
	System.out.println(this.toString+" : rdrprn is null" );
}else{
	System.out.println(this.toString+" : rdrprn is "+rdrprn );
}
String cardcmpycd = req.getParameter("cardcmpycd");
if( cardcmpycd == null){
	System.out.println(this.toString+" : cardcmpycd is null" );
}else{
	System.out.println(this.toString+" : cardcmpycd is "+cardcmpycd );
}
String cardno = req.getParameter("cardno");
if( cardno == null){
	System.out.println(this.toString+" : cardno is null" );
}else{
	System.out.println(this.toString+" : cardno is "+cardno );
}
String vdtyprd = req.getParameter("vdtyprd");
if( vdtyprd == null){
	System.out.println(this.toString+" : vdtyprd is null" );
}else{
	System.out.println(this.toString+" : vdtyprd is "+vdtyprd );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String pymtnm = req.getParameter("pymtnm");
if( pymtnm == null){
	System.out.println(this.toString+" : pymtnm is null" );
}else{
	System.out.println(this.toString+" : pymtnm is "+pymtnm );
}
String pymtno_2 = req.getParameter("pymtno_2");
if( pymtno_2 == null){
	System.out.println(this.toString+" : pymtno_2 is null" );
}else{
	System.out.println(this.toString+" : pymtno_2 is "+pymtno_2 );
}
String pymttel1 = req.getParameter("pymttel1");
if( pymttel1 == null){
	System.out.println(this.toString+" : pymttel1 is null" );
}else{
	System.out.println(this.toString+" : pymttel1 is "+pymttel1 );
}
String pymttel2 = req.getParameter("pymttel2");
if( pymttel2 == null){
	System.out.println(this.toString+" : pymttel2 is null" );
}else{
	System.out.println(this.toString+" : pymttel2 is "+pymttel2 );
}
String pymttel3 = req.getParameter("pymttel3");
if( pymttel3 == null){
	System.out.println(this.toString+" : pymttel3 is null" );
}else{
	System.out.println(this.toString+" : pymttel3 is "+pymttel3 );
}
String bankcd = req.getParameter("bankcd");
if( bankcd == null){
	System.out.println(this.toString+" : bankcd is null" );
}else{
	System.out.println(this.toString+" : bankcd is "+bankcd );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String aplyyymm = req.getParameter("aplyyymm");
if( aplyyymm == null){
	System.out.println(this.toString+" : aplyyymm is null" );
}else{
	System.out.println(this.toString+" : aplyyymm is "+aplyyymm );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String tmpflag = req.getParameter("tmpflag");
if( tmpflag == null){
	System.out.println(this.toString+" : tmpflag is null" );
}else{
	System.out.println(this.toString+" : tmpflag is "+tmpflag );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel1 = Util.checkString(req.getParameter("rdrtel1"));
String rdrtel2 = Util.checkString(req.getParameter("rdrtel2"));
String rdrtel3 = Util.checkString(req.getParameter("rdrtel3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvaddrdtls = Util.checkString(req.getParameter("dlvaddrdtls"));
String rdrprn = Util.checkString(req.getParameter("rdrprn"));
String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
String cardno = Util.checkString(req.getParameter("cardno"));
String vdtyprd = Util.checkString(req.getParameter("vdtyprd"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String pymtnm = Util.checkString(req.getParameter("pymtnm"));
String pymtno_2 = Util.checkString(req.getParameter("pymtno_2"));
String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String acctno = Util.checkString(req.getParameter("acctno"));
String prn = Util.checkString(req.getParameter("prn"));
String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
String email = Util.checkString(req.getParameter("email"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String tmpflag = Util.checkString(req.getParameter("tmpflag"));
String remk = Util.checkString(req.getParameter("remk"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel1")));
String rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel2")));
String rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddrdtls")));
String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));
String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
String vdtyprd = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyprd")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
String pymtno_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno_2")));
String pymttel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel1")));
String pymttel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel2")));
String pymttel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel3")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String aplyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplyyymm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String tmpflag = Util.Uni2Ksc(Util.checkString(req.getParameter("tmpflag")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRdrnm(rdrnm);
dm.setRdrtel1(rdrtel1);
dm.setRdrtel2(rdrtel2);
dm.setRdrtel3(rdrtel3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvaddrdtls(dlvaddrdtls);
dm.setRdrprn(rdrprn);
dm.setCardcmpycd(cardcmpycd);
dm.setCardno(cardno);
dm.setVdtyprd(vdtyprd);
dm.setShftclsf(shftclsf);
dm.setPymtnm(pymtnm);
dm.setPymtno_2(pymtno_2);
dm.setPymttel1(pymttel1);
dm.setPymttel2(pymttel2);
dm.setPymttel3(pymttel3);
dm.setBankcd(bankcd);
dm.setAcctno(acctno);
dm.setPrn(prn);
dm.setAplyyymm(aplyyymm);
dm.setEmail(email);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setAplcpathcd(aplcpathcd);
dm.setTmpflag(tmpflag);
dm.setRemk(remk);
dm.setAplcno(aplcno);
dm.setAplcdt(aplcdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 29 11:29:40 KST 2006 */