/***************************************************************************************************
* 파일명 : CO_L_RDRCRTS_GRAD_APLCDM.java
* 기능 : 독자현황-독자등급부여
* 작성일자 : 2005-02-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급부여
 */


public class CO_L_RDRCRTS_GRAD_APLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String incmgpers;
	public String callpgclsf;
	public String sh_aplcdt_fr;
	public String sh_aplcdt_to;
	public String sh_medicd;
	public String sh_rdr_no;
	public String sh_rdr_nm;
	public String sh_apl_nm;
	public String sh_prn1;
	public String sh_prn2;
	public String sh_phone1;
	public String sh_phone2;
	public String sh_phone3;
	public String sh_dtlsprocstat;
	public String sh_dtlsprocclsf;
	public long pageno;
	public long pagesize;

	public CO_L_RDRCRTS_GRAD_APLCDM(){}
	public CO_L_RDRCRTS_GRAD_APLCDM(String cmpycd, String bocd, String incmgpers, String callpgclsf, String sh_aplcdt_fr, String sh_aplcdt_to, String sh_medicd, String sh_rdr_no, String sh_rdr_nm, String sh_apl_nm, String sh_prn1, String sh_prn2, String sh_phone1, String sh_phone2, String sh_phone3, String sh_dtlsprocstat, String sh_dtlsprocclsf, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.callpgclsf = callpgclsf;
		this.sh_aplcdt_fr = sh_aplcdt_fr;
		this.sh_aplcdt_to = sh_aplcdt_to;
		this.sh_medicd = sh_medicd;
		this.sh_rdr_no = sh_rdr_no;
		this.sh_rdr_nm = sh_rdr_nm;
		this.sh_apl_nm = sh_apl_nm;
		this.sh_prn1 = sh_prn1;
		this.sh_prn2 = sh_prn2;
		this.sh_phone1 = sh_phone1;
		this.sh_phone2 = sh_phone2;
		this.sh_phone3 = sh_phone3;
		this.sh_dtlsprocstat = sh_dtlsprocstat;
		this.sh_dtlsprocclsf = sh_dtlsprocclsf;
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

	public void setSh_aplcdt_fr(String sh_aplcdt_fr){
		this.sh_aplcdt_fr = sh_aplcdt_fr;
	}

	public void setSh_aplcdt_to(String sh_aplcdt_to){
		this.sh_aplcdt_to = sh_aplcdt_to;
	}

	public void setSh_medicd(String sh_medicd){
		this.sh_medicd = sh_medicd;
	}

	public void setSh_rdr_no(String sh_rdr_no){
		this.sh_rdr_no = sh_rdr_no;
	}

	public void setSh_rdr_nm(String sh_rdr_nm){
		this.sh_rdr_nm = sh_rdr_nm;
	}

	public void setSh_apl_nm(String sh_apl_nm){
		this.sh_apl_nm = sh_apl_nm;
	}

	public void setSh_prn1(String sh_prn1){
		this.sh_prn1 = sh_prn1;
	}

	public void setSh_prn2(String sh_prn2){
		this.sh_prn2 = sh_prn2;
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

	public void setSh_dtlsprocstat(String sh_dtlsprocstat){
		this.sh_dtlsprocstat = sh_dtlsprocstat;
	}

	public void setSh_dtlsprocclsf(String sh_dtlsprocclsf){
		this.sh_dtlsprocclsf = sh_dtlsprocclsf;
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

	public String getSh_aplcdt_fr(){
		return this.sh_aplcdt_fr;
	}

	public String getSh_aplcdt_to(){
		return this.sh_aplcdt_to;
	}

	public String getSh_medicd(){
		return this.sh_medicd;
	}

	public String getSh_rdr_no(){
		return this.sh_rdr_no;
	}

	public String getSh_rdr_nm(){
		return this.sh_rdr_nm;
	}

	public String getSh_apl_nm(){
		return this.sh_apl_nm;
	}

	public String getSh_prn1(){
		return this.sh_prn1;
	}

	public String getSh_prn2(){
		return this.sh_prn2;
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

	public String getSh_dtlsprocstat(){
		return this.sh_dtlsprocstat;
	}

	public String getSh_dtlsprocclsf(){
		return this.sh_dtlsprocclsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_RDRCRTS_GRAD_APLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_RDRCRTS_GRAD_APLCDM dm = (CO_L_RDRCRTS_GRAD_APLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.callpgclsf);
		cstmt.setString(7, dm.sh_aplcdt_fr);
		cstmt.setString(8, dm.sh_aplcdt_to);
		cstmt.setString(9, dm.sh_medicd);
		cstmt.setString(10, dm.sh_rdr_no);
		cstmt.setString(11, dm.sh_rdr_nm);
		cstmt.setString(12, dm.sh_apl_nm);
		cstmt.setString(13, dm.sh_prn1);
		cstmt.setString(14, dm.sh_prn2);
		cstmt.setString(15, dm.sh_phone1);
		cstmt.setString(16, dm.sh_phone2);
		cstmt.setString(17, dm.sh_phone3);
		cstmt.setString(18, dm.sh_dtlsprocstat);
		cstmt.setString(19, dm.sh_dtlsprocclsf);
		cstmt.setLong(20, dm.pageno);
		cstmt.setLong(21, dm.pagesize);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.CO_L_RDRCRTS_GRAD_APLCDataSet();
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
String sh_aplcdt_fr = req.getParameter("sh_aplcdt_fr");
if( sh_aplcdt_fr == null){
	System.out.println(this.toString+" : sh_aplcdt_fr is null" );
}else{
	System.out.println(this.toString+" : sh_aplcdt_fr is "+sh_aplcdt_fr );
}
String sh_aplcdt_to = req.getParameter("sh_aplcdt_to");
if( sh_aplcdt_to == null){
	System.out.println(this.toString+" : sh_aplcdt_to is null" );
}else{
	System.out.println(this.toString+" : sh_aplcdt_to is "+sh_aplcdt_to );
}
String sh_medicd = req.getParameter("sh_medicd");
if( sh_medicd == null){
	System.out.println(this.toString+" : sh_medicd is null" );
}else{
	System.out.println(this.toString+" : sh_medicd is "+sh_medicd );
}
String sh_rdr_no = req.getParameter("sh_rdr_no");
if( sh_rdr_no == null){
	System.out.println(this.toString+" : sh_rdr_no is null" );
}else{
	System.out.println(this.toString+" : sh_rdr_no is "+sh_rdr_no );
}
String sh_rdr_nm = req.getParameter("sh_rdr_nm");
if( sh_rdr_nm == null){
	System.out.println(this.toString+" : sh_rdr_nm is null" );
}else{
	System.out.println(this.toString+" : sh_rdr_nm is "+sh_rdr_nm );
}
String sh_apl_nm = req.getParameter("sh_apl_nm");
if( sh_apl_nm == null){
	System.out.println(this.toString+" : sh_apl_nm is null" );
}else{
	System.out.println(this.toString+" : sh_apl_nm is "+sh_apl_nm );
}
String sh_prn1 = req.getParameter("sh_prn1");
if( sh_prn1 == null){
	System.out.println(this.toString+" : sh_prn1 is null" );
}else{
	System.out.println(this.toString+" : sh_prn1 is "+sh_prn1 );
}
String sh_prn2 = req.getParameter("sh_prn2");
if( sh_prn2 == null){
	System.out.println(this.toString+" : sh_prn2 is null" );
}else{
	System.out.println(this.toString+" : sh_prn2 is "+sh_prn2 );
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
String sh_dtlsprocstat = req.getParameter("sh_dtlsprocstat");
if( sh_dtlsprocstat == null){
	System.out.println(this.toString+" : sh_dtlsprocstat is null" );
}else{
	System.out.println(this.toString+" : sh_dtlsprocstat is "+sh_dtlsprocstat );
}
String sh_dtlsprocclsf = req.getParameter("sh_dtlsprocclsf");
if( sh_dtlsprocclsf == null){
	System.out.println(this.toString+" : sh_dtlsprocclsf is null" );
}else{
	System.out.println(this.toString+" : sh_dtlsprocclsf is "+sh_dtlsprocclsf );
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
String sh_aplcdt_fr = Util.checkString(req.getParameter("sh_aplcdt_fr"));
String sh_aplcdt_to = Util.checkString(req.getParameter("sh_aplcdt_to"));
String sh_medicd = Util.checkString(req.getParameter("sh_medicd"));
String sh_rdr_no = Util.checkString(req.getParameter("sh_rdr_no"));
String sh_rdr_nm = Util.checkString(req.getParameter("sh_rdr_nm"));
String sh_apl_nm = Util.checkString(req.getParameter("sh_apl_nm"));
String sh_prn1 = Util.checkString(req.getParameter("sh_prn1"));
String sh_prn2 = Util.checkString(req.getParameter("sh_prn2"));
String sh_phone1 = Util.checkString(req.getParameter("sh_phone1"));
String sh_phone2 = Util.checkString(req.getParameter("sh_phone2"));
String sh_phone3 = Util.checkString(req.getParameter("sh_phone3"));
String sh_dtlsprocstat = Util.checkString(req.getParameter("sh_dtlsprocstat"));
String sh_dtlsprocclsf = Util.checkString(req.getParameter("sh_dtlsprocclsf"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String callpgclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("callpgclsf")));
String sh_aplcdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_fr")));
String sh_aplcdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_to")));
String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));
String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));
String sh_rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_nm")));
String sh_apl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_apl_nm")));
String sh_prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn1")));
String sh_prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn2")));
String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));
String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));
String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));
String sh_dtlsprocstat = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocstat")));
String sh_dtlsprocclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocclsf")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setCallpgclsf(callpgclsf);
dm.setSh_aplcdt_fr(sh_aplcdt_fr);
dm.setSh_aplcdt_to(sh_aplcdt_to);
dm.setSh_medicd(sh_medicd);
dm.setSh_rdr_no(sh_rdr_no);
dm.setSh_rdr_nm(sh_rdr_nm);
dm.setSh_apl_nm(sh_apl_nm);
dm.setSh_prn1(sh_prn1);
dm.setSh_prn2(sh_prn2);
dm.setSh_phone1(sh_phone1);
dm.setSh_phone2(sh_phone2);
dm.setSh_phone3(sh_phone3);
dm.setSh_dtlsprocstat(sh_dtlsprocstat);
dm.setSh_dtlsprocclsf(sh_dtlsprocclsf);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 22 10:22:58 KST 2005 */