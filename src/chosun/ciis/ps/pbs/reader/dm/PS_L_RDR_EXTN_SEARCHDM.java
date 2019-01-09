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


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 *   독자-확장독자내역 조회
 *
 **/

public class PS_L_RDR_EXTN_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String sh_extndt_fr;
	public String sh_extndt_to;
	public String sh_aplcpathcd;
	public String sh_extntypecd;
	public String sh_medicd;
	public String sh_rdrnm;
	public String sh_rdrprn1;
	public String sh_rdrprn2;
	public String sh_phone1;
	public String sh_phone2;
	public String sh_phone3;
	public String sh_dlvaddr;
	public String sh_extnflnm;
	public String sh_deliproccd;
	public String sh_bouseyn;
	public long pageno;
	public long pagesize;

	public PS_L_RDR_EXTN_SEARCHDM(){}
	public PS_L_RDR_EXTN_SEARCHDM(String cmpycd, String incmgpers, String sh_extndt_fr, String sh_extndt_to, String sh_aplcpathcd, String sh_extntypecd, String sh_medicd, String sh_rdrnm, String sh_rdrprn1, String sh_rdrprn2, String sh_phone1, String sh_phone2, String sh_phone3, String sh_dlvaddr, String sh_extnflnm, String sh_deliproccd, String sh_bouseyn, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.sh_extndt_fr = sh_extndt_fr;
		this.sh_extndt_to = sh_extndt_to;
		this.sh_aplcpathcd = sh_aplcpathcd;
		this.sh_extntypecd = sh_extntypecd;
		this.sh_medicd = sh_medicd;
		this.sh_rdrnm = sh_rdrnm;
		this.sh_rdrprn1 = sh_rdrprn1;
		this.sh_rdrprn2 = sh_rdrprn2;
		this.sh_phone1 = sh_phone1;
		this.sh_phone2 = sh_phone2;
		this.sh_phone3 = sh_phone3;
		this.sh_dlvaddr = sh_dlvaddr;
		this.sh_extnflnm = sh_extnflnm;
		this.sh_deliproccd = sh_deliproccd;
		this.sh_bouseyn = sh_bouseyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSh_extndt_fr(String sh_extndt_fr){
		this.sh_extndt_fr = sh_extndt_fr;
	}

	public void setSh_extndt_to(String sh_extndt_to){
		this.sh_extndt_to = sh_extndt_to;
	}

	public void setSh_aplcpathcd(String sh_aplcpathcd){
		this.sh_aplcpathcd = sh_aplcpathcd;
	}

	public void setSh_extntypecd(String sh_extntypecd){
		this.sh_extntypecd = sh_extntypecd;
	}

	public void setSh_medicd(String sh_medicd){
		this.sh_medicd = sh_medicd;
	}

	public void setSh_rdrnm(String sh_rdrnm){
		this.sh_rdrnm = sh_rdrnm;
	}

	public void setSh_rdrprn1(String sh_rdrprn1){
		this.sh_rdrprn1 = sh_rdrprn1;
	}

	public void setSh_rdrprn2(String sh_rdrprn2){
		this.sh_rdrprn2 = sh_rdrprn2;
	}

	public void setSh_phone1(String sh_phone1){
		this.sh_phone1 = sh_phone1;
	}

	public void setSh_phone2(String sh_phone2){
		this.sh_phone2 = sh_phone2;
	}

	public void setSh_phone3(String sh_phone3){
		this.sh_phone3 = sh_phone3;
	}

	public void setSh_dlvaddr(String sh_dlvaddr){
		this.sh_dlvaddr = sh_dlvaddr;
	}

	public void setSh_extnflnm(String sh_extnflnm){
		this.sh_extnflnm = sh_extnflnm;
	}

	public void setSh_deliproccd(String sh_deliproccd){
		this.sh_deliproccd = sh_deliproccd;
	}

	public void setSh_bouseyn(String sh_bouseyn){
		this.sh_bouseyn = sh_bouseyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSh_extndt_fr(){
		return this.sh_extndt_fr;
	}

	public String getSh_extndt_to(){
		return this.sh_extndt_to;
	}

	public String getSh_aplcpathcd(){
		return this.sh_aplcpathcd;
	}

	public String getSh_extntypecd(){
		return this.sh_extntypecd;
	}

	public String getSh_medicd(){
		return this.sh_medicd;
	}

	public String getSh_rdrnm(){
		return this.sh_rdrnm;
	}

	public String getSh_rdrprn1(){
		return this.sh_rdrprn1;
	}

	public String getSh_rdrprn2(){
		return this.sh_rdrprn2;
	}

	public String getSh_phone1(){
		return this.sh_phone1;
	}

	public String getSh_phone2(){
		return this.sh_phone2;
	}

	public String getSh_phone3(){
		return this.sh_phone3;
	}

	public String getSh_dlvaddr(){
		return this.sh_dlvaddr;
	}

	public String getSh_extnflnm(){
		return this.sh_extnflnm;
	}

	public String getSh_deliproccd(){
		return this.sh_deliproccd;
	}

	public String getSh_bouseyn(){
		return this.sh_bouseyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_RDR_EXTN_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_RDR_EXTN_SEARCHDM dm = (PS_L_RDR_EXTN_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.sh_extndt_fr);
		cstmt.setString(6, dm.sh_extndt_to);
		cstmt.setString(7, dm.sh_aplcpathcd);
		cstmt.setString(8, dm.sh_extntypecd);
		cstmt.setString(9, dm.sh_medicd);
		cstmt.setString(10, dm.sh_rdrnm);
		cstmt.setString(11, dm.sh_rdrprn1);
		cstmt.setString(12, dm.sh_rdrprn2);
		cstmt.setString(13, dm.sh_phone1);
		cstmt.setString(14, dm.sh_phone2);
		cstmt.setString(15, dm.sh_phone3);
		cstmt.setString(16, dm.sh_dlvaddr);
		cstmt.setString(17, dm.sh_extnflnm);
		cstmt.setString(18, dm.sh_deliproccd);
		cstmt.setString(19, dm.sh_bouseyn);
		cstmt.setLong(20, dm.pageno);
		cstmt.setLong(21, dm.pagesize);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_RDR_EXTN_SEARCHDataSet();
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
String sh_extndt_fr = req.getParameter("sh_extndt_fr");
if( sh_extndt_fr == null){
	System.out.println(this.toString+" : sh_extndt_fr is null" );
}else{
	System.out.println(this.toString+" : sh_extndt_fr is "+sh_extndt_fr );
}
String sh_extndt_to = req.getParameter("sh_extndt_to");
if( sh_extndt_to == null){
	System.out.println(this.toString+" : sh_extndt_to is null" );
}else{
	System.out.println(this.toString+" : sh_extndt_to is "+sh_extndt_to );
}
String sh_aplcpathcd = req.getParameter("sh_aplcpathcd");
if( sh_aplcpathcd == null){
	System.out.println(this.toString+" : sh_aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : sh_aplcpathcd is "+sh_aplcpathcd );
}
String sh_extntypecd = req.getParameter("sh_extntypecd");
if( sh_extntypecd == null){
	System.out.println(this.toString+" : sh_extntypecd is null" );
}else{
	System.out.println(this.toString+" : sh_extntypecd is "+sh_extntypecd );
}
String sh_medicd = req.getParameter("sh_medicd");
if( sh_medicd == null){
	System.out.println(this.toString+" : sh_medicd is null" );
}else{
	System.out.println(this.toString+" : sh_medicd is "+sh_medicd );
}
String sh_rdrnm = req.getParameter("sh_rdrnm");
if( sh_rdrnm == null){
	System.out.println(this.toString+" : sh_rdrnm is null" );
}else{
	System.out.println(this.toString+" : sh_rdrnm is "+sh_rdrnm );
}
String sh_rdrprn1 = req.getParameter("sh_rdrprn1");
if( sh_rdrprn1 == null){
	System.out.println(this.toString+" : sh_rdrprn1 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrprn1 is "+sh_rdrprn1 );
}
String sh_rdrprn2 = req.getParameter("sh_rdrprn2");
if( sh_rdrprn2 == null){
	System.out.println(this.toString+" : sh_rdrprn2 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrprn2 is "+sh_rdrprn2 );
}
String sh_phone1 = req.getParameter("sh_phone1");
if( sh_phone1 == null){
	System.out.println(this.toString+" : sh_phone1 is null" );
}else{
	System.out.println(this.toString+" : sh_phone1 is "+sh_phone1 );
}
String sh_phone2 = req.getParameter("sh_phone2");
if( sh_phone2 == null){
	System.out.println(this.toString+" : sh_phone2 is null" );
}else{
	System.out.println(this.toString+" : sh_phone2 is "+sh_phone2 );
}
String sh_phone3 = req.getParameter("sh_phone3");
if( sh_phone3 == null){
	System.out.println(this.toString+" : sh_phone3 is null" );
}else{
	System.out.println(this.toString+" : sh_phone3 is "+sh_phone3 );
}
String sh_dlvaddr = req.getParameter("sh_dlvaddr");
if( sh_dlvaddr == null){
	System.out.println(this.toString+" : sh_dlvaddr is null" );
}else{
	System.out.println(this.toString+" : sh_dlvaddr is "+sh_dlvaddr );
}
String sh_extnflnm = req.getParameter("sh_extnflnm");
if( sh_extnflnm == null){
	System.out.println(this.toString+" : sh_extnflnm is null" );
}else{
	System.out.println(this.toString+" : sh_extnflnm is "+sh_extnflnm );
}
String sh_deliproccd = req.getParameter("sh_deliproccd");
if( sh_deliproccd == null){
	System.out.println(this.toString+" : sh_deliproccd is null" );
}else{
	System.out.println(this.toString+" : sh_deliproccd is "+sh_deliproccd );
}
String sh_bouseyn = req.getParameter("sh_bouseyn");
if( sh_bouseyn == null){
	System.out.println(this.toString+" : sh_bouseyn is null" );
}else{
	System.out.println(this.toString+" : sh_bouseyn is "+sh_bouseyn );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String sh_extndt_fr = Util.checkString(req.getParameter("sh_extndt_fr"));
String sh_extndt_to = Util.checkString(req.getParameter("sh_extndt_to"));
String sh_aplcpathcd = Util.checkString(req.getParameter("sh_aplcpathcd"));
String sh_extntypecd = Util.checkString(req.getParameter("sh_extntypecd"));
String sh_medicd = Util.checkString(req.getParameter("sh_medicd"));
String sh_rdrnm = Util.checkString(req.getParameter("sh_rdrnm"));
String sh_rdrprn1 = Util.checkString(req.getParameter("sh_rdrprn1"));
String sh_rdrprn2 = Util.checkString(req.getParameter("sh_rdrprn2"));
String sh_phone1 = Util.checkString(req.getParameter("sh_phone1"));
String sh_phone2 = Util.checkString(req.getParameter("sh_phone2"));
String sh_phone3 = Util.checkString(req.getParameter("sh_phone3"));
String sh_dlvaddr = Util.checkString(req.getParameter("sh_dlvaddr"));
String sh_extnflnm = Util.checkString(req.getParameter("sh_extnflnm"));
String sh_deliproccd = Util.checkString(req.getParameter("sh_deliproccd"));
String sh_bouseyn = Util.checkString(req.getParameter("sh_bouseyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));
String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));
String sh_aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcpathcd")));
String sh_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extntypecd")));
String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));
String sh_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrnm")));
String sh_rdrprn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn1")));
String sh_rdrprn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn2")));
String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));
String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));
String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));
String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));
String sh_extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extnflnm")));
String sh_deliproccd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_deliproccd")));
String sh_bouseyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bouseyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setSh_extndt_fr(sh_extndt_fr);
dm.setSh_extndt_to(sh_extndt_to);
dm.setSh_aplcpathcd(sh_aplcpathcd);
dm.setSh_extntypecd(sh_extntypecd);
dm.setSh_medicd(sh_medicd);
dm.setSh_rdrnm(sh_rdrnm);
dm.setSh_rdrprn1(sh_rdrprn1);
dm.setSh_rdrprn2(sh_rdrprn2);
dm.setSh_phone1(sh_phone1);
dm.setSh_phone2(sh_phone2);
dm.setSh_phone3(sh_phone3);
dm.setSh_dlvaddr(sh_dlvaddr);
dm.setSh_extnflnm(sh_extnflnm);
dm.setSh_deliproccd(sh_deliproccd);
dm.setSh_bouseyn(sh_bouseyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 28 11:38:49 KST 2007 */