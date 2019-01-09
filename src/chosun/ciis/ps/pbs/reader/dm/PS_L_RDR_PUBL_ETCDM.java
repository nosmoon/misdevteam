/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_PUBL_ETC.java
* 기능 :   독자-독자조회 조회화면(출판마케팅제외)
* 작성일자 : 2006-01-23
* 작성자 : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-독자조회 조회화면
 *
 */

public class PS_L_RDR_PUBL_ETCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String aplcdtfr;
	public String aplcdtto;
	public String medicd;
	public String rdr_no;
	public String rdrnm;
	public String asinbocd;
	public String prn1;
	public String prn2;
	public String tel_kubun;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String addr;
	public String email;
	public long pageno;
	public long pagesize;
	public String flnm_yn;

	public PS_L_RDR_PUBL_ETCDM(){}
	public PS_L_RDR_PUBL_ETCDM(String cmpycd, String incmgpers, String aplcdtfr, String aplcdtto, String medicd, String rdr_no, String rdrnm, String asinbocd, String prn1, String prn2, String tel_kubun, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String addr, String email, long pageno, long pagesize, String flnm_yn){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.aplcdtfr = aplcdtfr;
		this.aplcdtto = aplcdtto;
		this.medicd = medicd;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.asinbocd = asinbocd;
		this.prn1 = prn1;
		this.prn2 = prn2;
		this.tel_kubun = tel_kubun;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.addr = addr;
		this.email = email;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.flnm_yn = flnm_yn;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcdtfr(String aplcdtfr){
		this.aplcdtfr = aplcdtfr;
	}

	public void setAplcdtto(String aplcdtto){
		this.aplcdtto = aplcdtto;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
	}

	public void setPrn1(String prn1){
		this.prn1 = prn1;
	}

	public void setPrn2(String prn2){
		this.prn2 = prn2;
	}

	public void setTel_kubun(String tel_kubun){
		this.tel_kubun = tel_kubun;
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

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setFlnm_yn(String flnm_yn){
		this.flnm_yn = flnm_yn;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcdtfr(){
		return this.aplcdtfr;
	}

	public String getAplcdtto(){
		return this.aplcdtto;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public String getPrn1(){
		return this.prn1;
	}

	public String getPrn2(){
		return this.prn2;
	}

	public String getTel_kubun(){
		return this.tel_kubun;
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

	public String getAddr(){
		return this.addr;
	}

	public String getEmail(){
		return this.email;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getFlnm_yn(){
		return this.flnm_yn;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_RDR_PUBL_ETC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_RDR_PUBL_ETCDM dm = (PS_L_RDR_PUBL_ETCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.aplcdtfr);
		cstmt.setString(6, dm.aplcdtto);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.rdr_no);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.asinbocd);
		cstmt.setString(11, dm.prn1);
		cstmt.setString(12, dm.prn2);
		cstmt.setString(13, dm.tel_kubun);
		cstmt.setString(14, dm.rdrtel_no1);
		cstmt.setString(15, dm.rdrtel_no2);
		cstmt.setString(16, dm.rdrtel_no3);
		cstmt.setString(17, dm.addr);
		cstmt.setString(18, dm.email);
		cstmt.setLong(19, dm.pageno);
		cstmt.setLong(20, dm.pagesize);
		cstmt.setString(21, dm.flnm_yn);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_RDR_PUBL_ETCDataSet();
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
String aplcdtfr = req.getParameter("aplcdtfr");
if( aplcdtfr == null){
	System.out.println(this.toString+" : aplcdtfr is null" );
}else{
	System.out.println(this.toString+" : aplcdtfr is "+aplcdtfr );
}
String aplcdtto = req.getParameter("aplcdtto");
if( aplcdtto == null){
	System.out.println(this.toString+" : aplcdtto is null" );
}else{
	System.out.println(this.toString+" : aplcdtto is "+aplcdtto );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
}
String prn1 = req.getParameter("prn1");
if( prn1 == null){
	System.out.println(this.toString+" : prn1 is null" );
}else{
	System.out.println(this.toString+" : prn1 is "+prn1 );
}
String prn2 = req.getParameter("prn2");
if( prn2 == null){
	System.out.println(this.toString+" : prn2 is null" );
}else{
	System.out.println(this.toString+" : prn2 is "+prn2 );
}
String tel_kubun = req.getParameter("tel_kubun");
if( tel_kubun == null){
	System.out.println(this.toString+" : tel_kubun is null" );
}else{
	System.out.println(this.toString+" : tel_kubun is "+tel_kubun );
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
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
String flnm_yn = req.getParameter("flnm_yn");
if( flnm_yn == null){
	System.out.println(this.toString+" : flnm_yn is null" );
}else{
	System.out.println(this.toString+" : flnm_yn is "+flnm_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcdtfr = Util.checkString(req.getParameter("aplcdtfr"));
String aplcdtto = Util.checkString(req.getParameter("aplcdtto"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String prn1 = Util.checkString(req.getParameter("prn1"));
String prn2 = Util.checkString(req.getParameter("prn2"));
String tel_kubun = Util.checkString(req.getParameter("tel_kubun"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String addr = Util.checkString(req.getParameter("addr"));
String email = Util.checkString(req.getParameter("email"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String flnm_yn = Util.checkString(req.getParameter("flnm_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcdtfr = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdtfr")));
String aplcdtto = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdtto")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn1")));
String prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn2")));
String tel_kubun = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_kubun")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String flnm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setAplcdtfr(aplcdtfr);
dm.setAplcdtto(aplcdtto);
dm.setMedicd(medicd);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setAsinbocd(asinbocd);
dm.setPrn1(prn1);
dm.setPrn2(prn2);
dm.setTel_kubun(tel_kubun);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setAddr(addr);
dm.setEmail(email);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setFlnm_yn(flnm_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 23 11:46:33 KST 2006 */