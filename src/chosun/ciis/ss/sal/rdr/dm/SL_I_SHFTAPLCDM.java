/***************************************************************************************************
* 파일명 : SL_I_SHFTAPLCDM.java
* 기능 : 독자정보관리-자동이체신청-이체신청
* 작성일자 : 2004-06-07
* 작성자 : 김상열
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
 * 독자정보관리-자동이체신청-이체신청
 *
 */


public class SL_I_SHFTAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String incmgpers;
	public String shftclsf;
	public String pymtnm;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String bankcd;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String prn;
	public String aplcdt;
	public String aplyyymm;
	public String email;
	public String rdr_no;
	public String medicd;
	public String tmpflag;

	public SL_I_SHFTAPLCDM(){}
	public SL_I_SHFTAPLCDM(String accflag, String bocd, String incmgpers, String shftclsf, String pymtnm, String pymttel1, String pymttel2, String pymttel3, String bankcd, String acctno, String cardcmpycd, String cardno, String vdtyprd, String prn, String aplcdt, String aplyyymm, String email, String rdr_no, String medicd, String tmpflag){
		this.accflag = accflag;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.shftclsf = shftclsf;
		this.pymtnm = pymtnm;
		this.pymttel1 = pymttel1;
		this.pymttel2 = pymttel2;
		this.pymttel3 = pymttel3;
		this.bankcd = bankcd;
		this.acctno = acctno;
		this.cardcmpycd = cardcmpycd;
		this.cardno = cardno;
		this.vdtyprd = vdtyprd;
		this.prn = prn;
		this.aplcdt = aplcdt;
		this.aplyyymm = aplyyymm;
		this.email = email;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.tmpflag = tmpflag;
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

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
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

	public void setTmpflag(String tmpflag){
		this.tmpflag = tmpflag;
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

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getPymtnm(){
		return this.pymtnm;
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

	public String getTmpflag(){
		return this.tmpflag;
	}

	public String getSQL(){
		 return "{ call SP_SL_I_SHFTAPLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_I_SHFTAPLCDM dm = (SL_I_SHFTAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.shftclsf);
		cstmt.setString(7, dm.pymtnm);
		cstmt.setString(8, dm.pymttel1);
		cstmt.setString(9, dm.pymttel2);
		cstmt.setString(10, dm.pymttel3);
		cstmt.setString(11, dm.bankcd);
		cstmt.setString(12, dm.acctno);
		cstmt.setString(13, dm.cardcmpycd);
		cstmt.setString(14, dm.cardno);
		cstmt.setString(15, dm.vdtyprd);
		cstmt.setString(16, dm.prn);
		cstmt.setString(17, dm.aplcdt);
		cstmt.setString(18, dm.aplyyymm);
		cstmt.setString(19, dm.email);
		cstmt.setString(20, dm.rdr_no);
		cstmt.setString(21, dm.medicd);
		cstmt.setString(22, dm.tmpflag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_I_SHFTAPLCDataSet();
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
String tmpflag = req.getParameter("tmpflag");
if( tmpflag == null){
	System.out.println(this.toString+" : tmpflag is null" );
}else{
	System.out.println(this.toString+" : tmpflag is "+tmpflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String pymtnm = Util.checkString(req.getParameter("pymtnm"));
String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String acctno = Util.checkString(req.getParameter("acctno"));
String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
String cardno = Util.checkString(req.getParameter("cardno"));
String vdtyprd = Util.checkString(req.getParameter("vdtyprd"));
String prn = Util.checkString(req.getParameter("prn"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
String email = Util.checkString(req.getParameter("email"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String tmpflag = Util.checkString(req.getParameter("tmpflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
String pymttel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel1")));
String pymttel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel2")));
String pymttel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel3")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
String vdtyprd = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyprd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplyyymm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String tmpflag = Util.Uni2Ksc(Util.checkString(req.getParameter("tmpflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setShftclsf(shftclsf);
dm.setPymtnm(pymtnm);
dm.setPymttel1(pymttel1);
dm.setPymttel2(pymttel2);
dm.setPymttel3(pymttel3);
dm.setBankcd(bankcd);
dm.setAcctno(acctno);
dm.setCardcmpycd(cardcmpycd);
dm.setCardno(cardno);
dm.setVdtyprd(vdtyprd);
dm.setPrn(prn);
dm.setAplcdt(aplcdt);
dm.setAplyyymm(aplyyymm);
dm.setEmail(email);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTmpflag(tmpflag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 17:44:35 KST 2004 */