/***************************************************************************************************
* 파일명 : PS_I_DSCTDM
* 기능 :  불편접수처리
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편접수-불편접수처리
 *
 */

public class PS_I_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String regdt;
	public String rdr_no;
	public String rdrnm;
	public String rdrbocd;
	public String dscttypecd;
	public String prn;
	public String medicd;
	public String termsubsno;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel1;
	public String tel2;
	public String tel3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String titl;
	public String cont;

	public PS_I_DSCTDM(){}
	public PS_I_DSCTDM(String bocd, String incmgpers, String regdt, String rdr_no, String rdrnm, String rdrbocd, String dscttypecd, String prn, String medicd, String termsubsno, String zip, String addr, String dtlsaddr, String tel1, String tel2, String tel3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String titl, String cont){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.rdrbocd = rdrbocd;
		this.dscttypecd = dscttypecd;
		this.prn = prn;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.titl = titl;
		this.cont = cont;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrbocd(String rdrbocd){
		this.rdrbocd = rdrbocd;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
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

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
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

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrbocd(){
		return this.rdrbocd;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
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

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
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

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_DSCTDM dm = (PS_I_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.regdt);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.rdrnm);
		cstmt.setString(8, dm.rdrbocd);
		cstmt.setString(9, dm.dscttypecd);
		cstmt.setString(10, dm.prn);
		cstmt.setString(11, dm.medicd);
		cstmt.setString(12, dm.termsubsno);
		cstmt.setString(13, dm.zip);
		cstmt.setString(14, dm.addr);
		cstmt.setString(15, dm.dtlsaddr);
		cstmt.setString(16, dm.tel1);
		cstmt.setString(17, dm.tel2);
		cstmt.setString(18, dm.tel3);
		cstmt.setString(19, dm.rdrptph_no1);
		cstmt.setString(20, dm.rdrptph_no2);
		cstmt.setString(21, dm.rdrptph_no3);
		cstmt.setString(22, dm.titl);
		cstmt.setString(23, dm.cont);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_I_DSCTDataSet();
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
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
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
String rdrbocd = req.getParameter("rdrbocd");
if( rdrbocd == null){
	System.out.println(this.toString+" : rdrbocd is null" );
}else{
	System.out.println(this.toString+" : rdrbocd is "+rdrbocd );
}
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
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
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String prn = Util.checkString(req.getParameter("prn"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String tel1 = Util.checkString(req.getParameter("tel1"));
String tel2 = Util.checkString(req.getParameter("tel2"));
String tel3 = Util.checkString(req.getParameter("tel3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrbocd")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String tel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel1")));
String tel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel2")));
String tel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setRdrbocd(rdrbocd);
dm.setDscttypecd(dscttypecd);
dm.setPrn(prn);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setTel1(tel1);
dm.setTel2(tel2);
dm.setTel3(tel3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setTitl(titl);
dm.setCont(cont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 08 16:57:43 KST 2004 */