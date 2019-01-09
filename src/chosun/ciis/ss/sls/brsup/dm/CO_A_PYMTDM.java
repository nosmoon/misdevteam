/***************************************************************************************************
* 파일명 : CO_A_PYMTDM.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자정보수정
* 작성일자 : 2004-06-07
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
 * 지국업무지원-Billing자동이체-납부자관리-납부자정보수정
 *
 */


public class CO_A_PYMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String uptflag;
	public String pymtseq;
	public String shftclsf;
	public String prn;
	public String pymtnm;
	public String email;
	public String tel1;
	public String tel2;
	public String tel3;
	public String zip;
	public String addr;
	public String addrdtls;
	public String bankcd;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String aplcpathcd;

	public CO_A_PYMTDM(){}
	public CO_A_PYMTDM(String incmgpers, String accflag, String uptflag, String pymtseq, String shftclsf, String prn, String pymtnm, String email, String tel1, String tel2, String tel3, String zip, String addr, String addrdtls, String bankcd, String acctno, String cardcmpycd, String cardno, String vdtyprd, String aplcpathcd){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.uptflag = uptflag;
		this.pymtseq = pymtseq;
		this.shftclsf = shftclsf;
		this.prn = prn;
		this.pymtnm = pymtnm;
		this.email = email;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.zip = zip;
		this.addr = addr;
		this.addrdtls = addrdtls;
		this.bankcd = bankcd;
		this.acctno = acctno;
		this.cardcmpycd = cardcmpycd;
		this.cardno = cardno;
		this.vdtyprd = vdtyprd;
		this.aplcpathcd = aplcpathcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setUptflag(String uptflag){
		this.uptflag = uptflag;
	}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAddrdtls(String addrdtls){
		this.addrdtls = addrdtls;
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

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getUptflag(){
		return this.uptflag;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAddrdtls(){
		return this.addrdtls;
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

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_PYMT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_PYMTDM dm = (CO_A_PYMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.uptflag);
		cstmt.setString(6, dm.pymtseq);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.shftclsf);
		cstmt.setString(8, dm.prn);
		cstmt.setString(9, dm.pymtnm);
		cstmt.setString(10, dm.email);
		cstmt.setString(11, dm.tel1);
		cstmt.setString(12, dm.tel2);
		cstmt.setString(13, dm.tel3);
		cstmt.setString(14, dm.zip);
		cstmt.setString(15, dm.addr);
		cstmt.setString(16, dm.addrdtls);
		cstmt.setString(17, dm.bankcd);
		cstmt.setString(18, dm.acctno);
		cstmt.setString(19, dm.cardcmpycd);
		cstmt.setString(20, dm.cardno);
		cstmt.setString(21, dm.vdtyprd);
		cstmt.setString(22, dm.aplcpathcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.CO_A_PYMTDataSet();
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
String uptflag = req.getParameter("uptflag");
if( uptflag == null){
	System.out.println(this.toString+" : uptflag is null" );
}else{
	System.out.println(this.toString+" : uptflag is "+uptflag );
}
String pymtseq = req.getParameter("pymtseq");
if( pymtseq == null){
	System.out.println(this.toString+" : pymtseq is null" );
}else{
	System.out.println(this.toString+" : pymtseq is "+pymtseq );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String pymtnm = req.getParameter("pymtnm");
if( pymtnm == null){
	System.out.println(this.toString+" : pymtnm is null" );
}else{
	System.out.println(this.toString+" : pymtnm is "+pymtnm );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String tel1 = req.getParameter("tel1");
if( tel1 == null){
	System.out.println(this.toString+" : tel1 is null" );
}else{
	System.out.println(this.toString+" : tel1 is "+tel1 );
}
String tel2 = req.getParameter("tel2");
if( tel2 == null){
	System.out.println(this.toString+" : tel2 is null" );
}else{
	System.out.println(this.toString+" : tel2 is "+tel2 );
}
String tel3 = req.getParameter("tel3");
if( tel3 == null){
	System.out.println(this.toString+" : tel3 is null" );
}else{
	System.out.println(this.toString+" : tel3 is "+tel3 );
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
String addrdtls = req.getParameter("addrdtls");
if( addrdtls == null){
	System.out.println(this.toString+" : addrdtls is null" );
}else{
	System.out.println(this.toString+" : addrdtls is "+addrdtls );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String uptflag = Util.checkString(req.getParameter("uptflag"));
String pymtseq = Util.checkString(req.getParameter("pymtseq"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String prn = Util.checkString(req.getParameter("prn"));
String pymtnm = Util.checkString(req.getParameter("pymtnm"));
String email = Util.checkString(req.getParameter("email"));
String tel1 = Util.checkString(req.getParameter("tel1"));
String tel2 = Util.checkString(req.getParameter("tel2"));
String tel3 = Util.checkString(req.getParameter("tel3"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String addrdtls = Util.checkString(req.getParameter("addrdtls"));
String bankcd = Util.checkString(req.getParameter("bankcd"));
String acctno = Util.checkString(req.getParameter("acctno"));
String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
String cardno = Util.checkString(req.getParameter("cardno"));
String vdtyprd = Util.checkString(req.getParameter("vdtyprd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String uptflag = Util.Uni2Ksc(Util.checkString(req.getParameter("uptflag")));
String pymtseq = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtseq")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String tel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel1")));
String tel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel2")));
String tel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel3")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String addrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("addrdtls")));
String bankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcd")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String cardcmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpycd")));
String cardno = Util.Uni2Ksc(Util.checkString(req.getParameter("cardno")));
String vdtyprd = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyprd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setUptflag(uptflag);
dm.setPymtseq(pymtseq);
dm.setShftclsf(shftclsf);
dm.setPrn(prn);
dm.setPymtnm(pymtnm);
dm.setEmail(email);
dm.setTel1(tel1);
dm.setTel2(tel2);
dm.setTel3(tel3);
dm.setZip(zip);
dm.setAddr(addr);
dm.setAddrdtls(addrdtls);
dm.setBankcd(bankcd);
dm.setAcctno(acctno);
dm.setCardcmpycd(cardcmpycd);
dm.setCardno(cardno);
dm.setVdtyprd(vdtyprd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 17:58:55 KST 2004 */