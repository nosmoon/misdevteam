/***************************************************************************************************
 * 파일명   : PB_L_EXST_RDR_SEARCHDM.java
 * 기능     : 공통-출판 기존독자 검색
 * 작성일자 : 2004-02-16
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * 공통-출판 기존독자 검색
 */

public class PB_L_EXST_RDR_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String sh_rdr_no;
	public String sh_rdrtel1;
	public String sh_rdrtel2;
	public String sh_rdrtel3;
	public String sh_rdrpho1;
	public String sh_rdrpho2;
	public String sh_rdrpho3;
	public String sh_dlvzip;
	public String sh_dlvaddr;
	public String sh_dlvdtlsaddr;
	public String sh_prn;
	public String sh_email;
	public long pageno;
	public long pagesize;

	public PB_L_EXST_RDR_SEARCHDM(){}
	public PB_L_EXST_RDR_SEARCHDM(String bocd, String incmgpers, String sh_rdr_no, String sh_rdrtel1, String sh_rdrtel2, String sh_rdrtel3, String sh_rdrpho1, String sh_rdrpho2, String sh_rdrpho3, String sh_dlvzip, String sh_dlvaddr, String sh_dlvdtlsaddr, String sh_prn, String sh_email, long pageno, long pagesize){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.sh_rdr_no = sh_rdr_no;
		this.sh_rdrtel1 = sh_rdrtel1;
		this.sh_rdrtel2 = sh_rdrtel2;
		this.sh_rdrtel3 = sh_rdrtel3;
		this.sh_rdrpho1 = sh_rdrpho1;
		this.sh_rdrpho2 = sh_rdrpho2;
		this.sh_rdrpho3 = sh_rdrpho3;
		this.sh_dlvzip = sh_dlvzip;
		this.sh_dlvaddr = sh_dlvaddr;
		this.sh_dlvdtlsaddr = sh_dlvdtlsaddr;
		this.sh_prn = sh_prn;
		this.sh_email = sh_email;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSh_rdr_no(String sh_rdr_no){
		this.sh_rdr_no = sh_rdr_no;
	}

	public void setSh_rdrtel1(String sh_rdrtel1){
		this.sh_rdrtel1 = sh_rdrtel1;
	}

	public void setSh_rdrtel2(String sh_rdrtel2){
		this.sh_rdrtel2 = sh_rdrtel2;
	}

	public void setSh_rdrtel3(String sh_rdrtel3){
		this.sh_rdrtel3 = sh_rdrtel3;
	}

	public void setSh_rdrpho1(String sh_rdrpho1){
		this.sh_rdrpho1 = sh_rdrpho1;
	}

	public void setSh_rdrpho2(String sh_rdrpho2){
		this.sh_rdrpho2 = sh_rdrpho2;
	}

	public void setSh_rdrpho3(String sh_rdrpho3){
		this.sh_rdrpho3 = sh_rdrpho3;
	}

	public void setSh_dlvzip(String sh_dlvzip){
		this.sh_dlvzip = sh_dlvzip;
	}

	public void setSh_dlvaddr(String sh_dlvaddr){
		this.sh_dlvaddr = sh_dlvaddr;
	}

	public void setSh_dlvdtlsaddr(String sh_dlvdtlsaddr){
		this.sh_dlvdtlsaddr = sh_dlvdtlsaddr;
	}

	public void setSh_prn(String sh_prn){
		this.sh_prn = sh_prn;
	}

	public void setSh_email(String sh_email){
		this.sh_email = sh_email;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSh_rdr_no(){
		return this.sh_rdr_no;
	}

	public String getSh_rdrtel1(){
		return this.sh_rdrtel1;
	}

	public String getSh_rdrtel2(){
		return this.sh_rdrtel2;
	}

	public String getSh_rdrtel3(){
		return this.sh_rdrtel3;
	}

	public String getSh_rdrpho1(){
		return this.sh_rdrpho1;
	}

	public String getSh_rdrpho2(){
		return this.sh_rdrpho2;
	}

	public String getSh_rdrpho3(){
		return this.sh_rdrpho3;
	}

	public String getSh_dlvzip(){
		return this.sh_dlvzip;
	}

	public String getSh_dlvaddr(){
		return this.sh_dlvaddr;
	}

	public String getSh_dlvdtlsaddr(){
		return this.sh_dlvdtlsaddr;
	}

	public String getSh_prn(){
		return this.sh_prn;
	}

	public String getSh_email(){
		return this.sh_email;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PB_L_EXST_RDR_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_L_EXST_RDR_SEARCHDM dm = (PB_L_EXST_RDR_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.sh_rdr_no);
		cstmt.setString(6, dm.sh_rdrtel1);
		cstmt.setString(7, dm.sh_rdrtel2);
		cstmt.setString(8, dm.sh_rdrtel3);
		cstmt.setString(9, dm.sh_rdrpho1);
		cstmt.setString(10, dm.sh_rdrpho2);
		cstmt.setString(11, dm.sh_rdrpho3);
		cstmt.setString(12, dm.sh_dlvzip);
		cstmt.setString(13, dm.sh_dlvaddr);
		cstmt.setString(14, dm.sh_dlvdtlsaddr);
		cstmt.setString(15, dm.sh_prn);
		cstmt.setString(16, dm.sh_email);
		cstmt.setLong(17, dm.pageno);
		cstmt.setLong(18, dm.pagesize);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.common.ds.PB_L_EXST_RDR_SEARCHDataSet();
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
String sh_rdr_no = req.getParameter("sh_rdr_no");
if( sh_rdr_no == null){
	System.out.println(this.toString+" : sh_rdr_no is null" );
}else{
	System.out.println(this.toString+" : sh_rdr_no is "+sh_rdr_no );
}
String sh_rdrtel1 = req.getParameter("sh_rdrtel1");
if( sh_rdrtel1 == null){
	System.out.println(this.toString+" : sh_rdrtel1 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrtel1 is "+sh_rdrtel1 );
}
String sh_rdrtel2 = req.getParameter("sh_rdrtel2");
if( sh_rdrtel2 == null){
	System.out.println(this.toString+" : sh_rdrtel2 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrtel2 is "+sh_rdrtel2 );
}
String sh_rdrtel3 = req.getParameter("sh_rdrtel3");
if( sh_rdrtel3 == null){
	System.out.println(this.toString+" : sh_rdrtel3 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrtel3 is "+sh_rdrtel3 );
}
String sh_rdrpho1 = req.getParameter("sh_rdrpho1");
if( sh_rdrpho1 == null){
	System.out.println(this.toString+" : sh_rdrpho1 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrpho1 is "+sh_rdrpho1 );
}
String sh_rdrpho2 = req.getParameter("sh_rdrpho2");
if( sh_rdrpho2 == null){
	System.out.println(this.toString+" : sh_rdrpho2 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrpho2 is "+sh_rdrpho2 );
}
String sh_rdrpho3 = req.getParameter("sh_rdrpho3");
if( sh_rdrpho3 == null){
	System.out.println(this.toString+" : sh_rdrpho3 is null" );
}else{
	System.out.println(this.toString+" : sh_rdrpho3 is "+sh_rdrpho3 );
}
String sh_dlvzip = req.getParameter("sh_dlvzip");
if( sh_dlvzip == null){
	System.out.println(this.toString+" : sh_dlvzip is null" );
}else{
	System.out.println(this.toString+" : sh_dlvzip is "+sh_dlvzip );
}
String sh_dlvaddr = req.getParameter("sh_dlvaddr");
if( sh_dlvaddr == null){
	System.out.println(this.toString+" : sh_dlvaddr is null" );
}else{
	System.out.println(this.toString+" : sh_dlvaddr is "+sh_dlvaddr );
}
String sh_dlvdtlsaddr = req.getParameter("sh_dlvdtlsaddr");
if( sh_dlvdtlsaddr == null){
	System.out.println(this.toString+" : sh_dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : sh_dlvdtlsaddr is "+sh_dlvdtlsaddr );
}
String sh_prn = req.getParameter("sh_prn");
if( sh_prn == null){
	System.out.println(this.toString+" : sh_prn is null" );
}else{
	System.out.println(this.toString+" : sh_prn is "+sh_prn );
}
String sh_email = req.getParameter("sh_email");
if( sh_email == null){
	System.out.println(this.toString+" : sh_email is null" );
}else{
	System.out.println(this.toString+" : sh_email is "+sh_email );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String sh_rdr_no = Util.checkString(req.getParameter("sh_rdr_no"));
String sh_rdrtel1 = Util.checkString(req.getParameter("sh_rdrtel1"));
String sh_rdrtel2 = Util.checkString(req.getParameter("sh_rdrtel2"));
String sh_rdrtel3 = Util.checkString(req.getParameter("sh_rdrtel3"));
String sh_rdrpho1 = Util.checkString(req.getParameter("sh_rdrpho1"));
String sh_rdrpho2 = Util.checkString(req.getParameter("sh_rdrpho2"));
String sh_rdrpho3 = Util.checkString(req.getParameter("sh_rdrpho3"));
String sh_dlvzip = Util.checkString(req.getParameter("sh_dlvzip"));
String sh_dlvaddr = Util.checkString(req.getParameter("sh_dlvaddr"));
String sh_dlvdtlsaddr = Util.checkString(req.getParameter("sh_dlvdtlsaddr"));
String sh_prn = Util.checkString(req.getParameter("sh_prn"));
String sh_email = Util.checkString(req.getParameter("sh_email"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));
String sh_rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel1")));
String sh_rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel2")));
String sh_rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel3")));
String sh_rdrpho1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho1")));
String sh_rdrpho2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho2")));
String sh_rdrpho3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho3")));
String sh_dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvzip")));
String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));
String sh_dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvdtlsaddr")));
String sh_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn")));
String sh_email = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_email")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setSh_rdr_no(sh_rdr_no);
dm.setSh_rdrtel1(sh_rdrtel1);
dm.setSh_rdrtel2(sh_rdrtel2);
dm.setSh_rdrtel3(sh_rdrtel3);
dm.setSh_rdrpho1(sh_rdrpho1);
dm.setSh_rdrpho2(sh_rdrpho2);
dm.setSh_rdrpho3(sh_rdrpho3);
dm.setSh_dlvzip(sh_dlvzip);
dm.setSh_dlvaddr(sh_dlvaddr);
dm.setSh_dlvdtlsaddr(sh_dlvdtlsaddr);
dm.setSh_prn(sh_prn);
dm.setSh_email(sh_email);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 16:28:41 KST 2004 */