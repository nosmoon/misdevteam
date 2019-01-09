/***************************************************************************************************
* 파일명 : SS_U_SHFTAPLCDM.java
* 기능 : 지국업무지원-Billing자동이체-납부자-정보변경(이체신청 미확인건)
* 작성일자 : 2004-07-18
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부자-정보변경(이체신청 미확인건)
 *
 */


public class SS_U_SHFTAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String pymtnm;
	public String rdrnm;
	public String pymtno;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String rdrtel1;
	public String rdrtel2;
	public String rdrtel3;
	public String zip;
	public String dlvaddr;
	public String dlvaddrdtls;
	public String recpinstt;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String prn;
	public String aplcdt;
	public String aplcno;
	public String aplyyymm;
	public String email;
	public String ext1;
	public String ext2;
	public String ext3;
	public String ext4;
	public String ext5;

	public SS_U_SHFTAPLCDM(){}
	public SS_U_SHFTAPLCDM(String bocd, String incmgpers, String pymtnm, String rdrnm, String pymtno, String pymttel1, String pymttel2, String pymttel3, String rdrtel1, String rdrtel2, String rdrtel3, String zip, String dlvaddr, String dlvaddrdtls, String recpinstt, String acctno, String cardcmpycd, String cardno, String vdtyprd, String prn, String aplcdt, String aplcno, String aplyyymm, String email, String ext1, String ext2, String ext3, String ext4, String ext5){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.pymtnm = pymtnm;
		this.rdrnm = rdrnm;
		this.pymtno = pymtno;
		this.pymttel1 = pymttel1;
		this.pymttel2 = pymttel2;
		this.pymttel3 = pymttel3;
		this.rdrtel1 = rdrtel1;
		this.rdrtel2 = rdrtel2;
		this.rdrtel3 = rdrtel3;
		this.zip = zip;
		this.dlvaddr = dlvaddr;
		this.dlvaddrdtls = dlvaddrdtls;
		this.recpinstt = recpinstt;
		this.acctno = acctno;
		this.cardcmpycd = cardcmpycd;
		this.cardno = cardno;
		this.vdtyprd = vdtyprd;
		this.prn = prn;
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
		this.aplyyymm = aplyyymm;
		this.email = email;
		this.ext1 = ext1;
		this.ext2 = ext2;
		this.ext3 = ext3;
		this.ext4 = ext4;
		this.ext5 = ext5;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPymtno(String pymtno){
		this.pymtno = pymtno;
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

	public void setRdrtel1(String rdrtel1){
		this.rdrtel1 = rdrtel1;
	}

	public void setRdrtel2(String rdrtel2){
		this.rdrtel2 = rdrtel2;
	}

	public void setRdrtel3(String rdrtel3){
		this.rdrtel3 = rdrtel3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvaddrdtls(String dlvaddrdtls){
		this.dlvaddrdtls = dlvaddrdtls;
	}

	public void setRecpinstt(String recpinstt){
		this.recpinstt = recpinstt;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
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

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setExt1(String ext1){
		this.ext1 = ext1;
	}

	public void setExt2(String ext2){
		this.ext2 = ext2;
	}

	public void setExt3(String ext3){
		this.ext3 = ext3;
	}

	public void setExt4(String ext4){
		this.ext4 = ext4;
	}

	public void setExt5(String ext5){
		this.ext5 = ext5;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPymtno(){
		return this.pymtno;
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

	public String getRdrtel1(){
		return this.rdrtel1;
	}

	public String getRdrtel2(){
		return this.rdrtel2;
	}

	public String getRdrtel3(){
		return this.rdrtel3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvaddrdtls(){
		return this.dlvaddrdtls;
	}

	public String getRecpinstt(){
		return this.recpinstt;
	}

	public String getAcctno(){
		return this.acctno;
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

	public String getPrn(){
		return this.prn;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getExt1(){
		return this.ext1;
	}

	public String getExt2(){
		return this.ext2;
	}

	public String getExt3(){
		return this.ext3;
	}

	public String getExt4(){
		return this.ext4;
	}

	public String getExt5(){
		return this.ext5;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_SHFTAPLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_SHFTAPLCDM dm = (SS_U_SHFTAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.pymtnm);
		cstmt.setString(6, dm.rdrnm);
		cstmt.setString(7, dm.pymtno);
		cstmt.setString(8, dm.pymttel1);
		cstmt.setString(9, dm.pymttel2);
		cstmt.setString(10, dm.pymttel3);
		cstmt.setString(11, dm.rdrtel1);
		cstmt.setString(12, dm.rdrtel2);
		cstmt.setString(13, dm.rdrtel3);
		cstmt.setString(14, dm.zip);
		cstmt.setString(15, dm.dlvaddr);
		cstmt.setString(16, dm.dlvaddrdtls);
		cstmt.setString(17, dm.recpinstt);
		cstmt.setString(18, dm.acctno);
		cstmt.setString(19, dm.cardcmpycd);
		cstmt.setString(20, dm.cardno);
		cstmt.setString(21, dm.vdtyprd);
		cstmt.setString(22, dm.prn);
		cstmt.setString(23, dm.aplcdt);
		cstmt.setString(24, dm.aplcno);
		cstmt.setString(25, dm.aplyyymm);
		cstmt.setString(26, dm.email);
		cstmt.setString(27, dm.ext1);
		cstmt.setString(28, dm.ext2);
		cstmt.setString(29, dm.ext3);
		cstmt.setString(30, dm.ext4);
		cstmt.setString(31, dm.ext5);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_SHFTAPLCDataSet();
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
String pymtnm = req.getParameter("pymtnm");
if( pymtnm == null){
	System.out.println(this.toString+" : pymtnm is null" );
}else{
	System.out.println(this.toString+" : pymtnm is "+pymtnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String pymtno = req.getParameter("pymtno");
if( pymtno == null){
	System.out.println(this.toString+" : pymtno is null" );
}else{
	System.out.println(this.toString+" : pymtno is "+pymtno );
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
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
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
String recpinstt = req.getParameter("recpinstt");
if( recpinstt == null){
	System.out.println(this.toString+" : recpinstt is null" );
}else{
	System.out.println(this.toString+" : recpinstt is "+recpinstt );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
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
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
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
String ext1 = req.getParameter("ext1");
if( ext1 == null){
	System.out.println(this.toString+" : ext1 is null" );
}else{
	System.out.println(this.toString+" : ext1 is "+ext1 );
}
String ext2 = req.getParameter("ext2");
if( ext2 == null){
	System.out.println(this.toString+" : ext2 is null" );
}else{
	System.out.println(this.toString+" : ext2 is "+ext2 );
}
String ext3 = req.getParameter("ext3");
if( ext3 == null){
	System.out.println(this.toString+" : ext3 is null" );
}else{
	System.out.println(this.toString+" : ext3 is "+ext3 );
}
String ext4 = req.getParameter("ext4");
if( ext4 == null){
	System.out.println(this.toString+" : ext4 is null" );
}else{
	System.out.println(this.toString+" : ext4 is "+ext4 );
}
String ext5 = req.getParameter("ext5");
if( ext5 == null){
	System.out.println(this.toString+" : ext5 is null" );
}else{
	System.out.println(this.toString+" : ext5 is "+ext5 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String pymtnm = Util.checkString(req.getParameter("pymtnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String pymtno = Util.checkString(req.getParameter("pymtno"));
String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
String rdrtel1 = Util.checkString(req.getParameter("rdrtel1"));
String rdrtel2 = Util.checkString(req.getParameter("rdrtel2"));
String rdrtel3 = Util.checkString(req.getParameter("rdrtel3"));
String zip = Util.checkString(req.getParameter("zip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvaddrdtls = Util.checkString(req.getParameter("dlvaddrdtls"));
String recpinstt = Util.checkString(req.getParameter("recpinstt"));
String acctno = Util.checkString(req.getParameter("acctno"));
String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
String cardno = Util.checkString(req.getParameter("cardno"));
String vdtyprd = Util.checkString(req.getParameter("vdtyprd"));
String prn = Util.checkString(req.getParameter("prn"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
String email = Util.checkString(req.getParameter("email"));
String ext1 = Util.checkString(req.getParameter("ext1"));
String ext2 = Util.checkString(req.getParameter("ext2"));
String ext3 = Util.checkString(req.getParameter("ext3"));
String ext4 = Util.checkString(req.getParameter("ext4"));
String ext5 = Util.checkString(req.getParameter("ext5"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String pymtno = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno")));
String pymttel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel1")));
String pymttel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel2")));
String pymttel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel3")));
String rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel1")));
String rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel2")));
String rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel3")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddrdtls")));
String recpinstt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpinstt")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
String vdtyprd = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyprd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String aplyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplyyymm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String ext1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext1")));
String ext2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext2")));
String ext3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext3")));
String ext4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext4")));
String ext5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext5")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setPymtnm(pymtnm);
dm.setRdrnm(rdrnm);
dm.setPymtno(pymtno);
dm.setPymttel1(pymttel1);
dm.setPymttel2(pymttel2);
dm.setPymttel3(pymttel3);
dm.setRdrtel1(rdrtel1);
dm.setRdrtel2(rdrtel2);
dm.setRdrtel3(rdrtel3);
dm.setZip(zip);
dm.setDlvaddr(dlvaddr);
dm.setDlvaddrdtls(dlvaddrdtls);
dm.setRecpinstt(recpinstt);
dm.setAcctno(acctno);
dm.setCardcmpycd(cardcmpycd);
dm.setCardno(cardno);
dm.setVdtyprd(vdtyprd);
dm.setPrn(prn);
dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
dm.setAplyyymm(aplyyymm);
dm.setEmail(email);
dm.setExt1(ext1);
dm.setExt2(ext2);
dm.setExt3(ext3);
dm.setExt4(ext4);
dm.setExt5(ext5);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 27 23:48:10 KST 2004 */