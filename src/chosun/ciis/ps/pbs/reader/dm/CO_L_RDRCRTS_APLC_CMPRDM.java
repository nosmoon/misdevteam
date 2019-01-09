/***************************************************************************************************
 * 파일명   : CO_L_RDRCRTS_APLC_CMPRDM.java
 * 기능     : 독자-독자등급관리 구독자비교대상검색
 * 작성일자 : 2004-04-22
 * 작성자   : 김상옥
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
 * 독자-독자등급관리 구독자비교대상검색
 */

public class CO_L_RDRCRTS_APLC_CMPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String incmgpers;
	public String callpgclsf;
	public String sh_searcd;
	public String sh_searnm;
	public String sh_medicd;
	public String sh_phone1;
	public String sh_phone2;
	public String sh_phone3;
	public long pageno;
	public long pagesize;

	public CO_L_RDRCRTS_APLC_CMPRDM(){}
	public CO_L_RDRCRTS_APLC_CMPRDM(String cmpycd, String bocd, String incmgpers, String callpgclsf, String sh_searcd, String sh_searnm, String sh_medicd, String sh_phone1, String sh_phone2, String sh_phone3, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.callpgclsf = callpgclsf;
		this.sh_searcd = sh_searcd;
		this.sh_searnm = sh_searnm;
		this.sh_medicd = sh_medicd;
		this.sh_phone1 = sh_phone1;
		this.sh_phone2 = sh_phone2;
		this.sh_phone3 = sh_phone3;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCallpgclsf(String callpgclsf){
		this.callpgclsf = callpgclsf;
	}

	public void setSh_searcd(String sh_searcd){
		this.sh_searcd = sh_searcd;
	}

	public void setSh_searnm(String sh_searnm){
		this.sh_searnm = sh_searnm;
	}

	public void setSh_medicd(String sh_medicd){
		this.sh_medicd = sh_medicd;
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

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCallpgclsf(){
		return this.callpgclsf;
	}

	public String getSh_searcd(){
		return this.sh_searcd;
	}

	public String getSh_searnm(){
		return this.sh_searnm;
	}

	public String getSh_medicd(){
		return this.sh_medicd;
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

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_RDRCRTS_APLC_CMPR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_RDRCRTS_APLC_CMPRDM dm = (CO_L_RDRCRTS_APLC_CMPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.callpgclsf);
		cstmt.setString(7, dm.sh_searcd);
		cstmt.setString(8, dm.sh_searnm);
		cstmt.setString(9, dm.sh_medicd);
		cstmt.setString(10, dm.sh_phone1);
		cstmt.setString(11, dm.sh_phone2);
		cstmt.setString(12, dm.sh_phone3);
		cstmt.setLong(13, dm.pageno);
		cstmt.setLong(14, dm.pagesize);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.CO_L_RDRCRTS_APLC_CMPRDataSet();
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
String callpgclsf = req.getParameter("callpgclsf");
if( callpgclsf == null){
	System.out.println(this.toString+" : callpgclsf is null" );
}else{
	System.out.println(this.toString+" : callpgclsf is "+callpgclsf );
}
String sh_searcd = req.getParameter("sh_searcd");
if( sh_searcd == null){
	System.out.println(this.toString+" : sh_searcd is null" );
}else{
	System.out.println(this.toString+" : sh_searcd is "+sh_searcd );
}
String sh_searnm = req.getParameter("sh_searnm");
if( sh_searnm == null){
	System.out.println(this.toString+" : sh_searnm is null" );
}else{
	System.out.println(this.toString+" : sh_searnm is "+sh_searnm );
}
String sh_medicd = req.getParameter("sh_medicd");
if( sh_medicd == null){
	System.out.println(this.toString+" : sh_medicd is null" );
}else{
	System.out.println(this.toString+" : sh_medicd is "+sh_medicd );
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
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String callpgclsf = Util.checkString(req.getParameter("callpgclsf"));
String sh_searcd = Util.checkString(req.getParameter("sh_searcd"));
String sh_searnm = Util.checkString(req.getParameter("sh_searnm"));
String sh_medicd = Util.checkString(req.getParameter("sh_medicd"));
String sh_phone1 = Util.checkString(req.getParameter("sh_phone1"));
String sh_phone2 = Util.checkString(req.getParameter("sh_phone2"));
String sh_phone3 = Util.checkString(req.getParameter("sh_phone3"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String callpgclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("callpgclsf")));
String sh_searcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searcd")));
String sh_searnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searnm")));
String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));
String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));
String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));
String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setCallpgclsf(callpgclsf);
dm.setSh_searcd(sh_searcd);
dm.setSh_searnm(sh_searnm);
dm.setSh_medicd(sh_medicd);
dm.setSh_phone1(sh_phone1);
dm.setSh_phone2(sh_phone2);
dm.setSh_phone3(sh_phone3);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 23 16:36:20 KST 2004 */