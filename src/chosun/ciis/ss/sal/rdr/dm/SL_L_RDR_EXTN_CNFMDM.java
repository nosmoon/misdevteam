/***************************************************************************************************
* 파일명 : SL_L_RDR_EXTN_CNFMDM.java
* 기능 : 외부확장확인관리(목록조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
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
 * 외부확장확인관리(목록조회)
 *
 */

public class SL_L_RDR_EXTN_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String frdt;
	public String todt;
	public String sech_extntypecd;
	public String aplcpathcd;
	public String sech_medicd;
	public String sech_extnflnm;
	public String sech_subscnfmstatcd;
	public String sech_extnbonm;
	public String sech_rdrnm;
	public long pageno;
	public long pagesize;

	public SL_L_RDR_EXTN_CNFMDM(){}
	public SL_L_RDR_EXTN_CNFMDM(String bocd, String frdt, String todt, String sech_extntypecd, String aplcpathcd, String sech_medicd, String sech_extnflnm, String sech_subscnfmstatcd, String sech_extnbonm, String sech_rdrnm, long pageno, long pagesize){
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.sech_extntypecd = sech_extntypecd;
		this.aplcpathcd = aplcpathcd;
		this.sech_medicd = sech_medicd;
		this.sech_extnflnm = sech_extnflnm;
		this.sech_subscnfmstatcd = sech_subscnfmstatcd;
		this.sech_extnbonm = sech_extnbonm;
		this.sech_rdrnm = sech_rdrnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSech_extntypecd(String sech_extntypecd){
		this.sech_extntypecd = sech_extntypecd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setSech_medicd(String sech_medicd){
		this.sech_medicd = sech_medicd;
	}

	public void setSech_extnflnm(String sech_extnflnm){
		this.sech_extnflnm = sech_extnflnm;
	}

	public void setSech_subscnfmstatcd(String sech_subscnfmstatcd){
		this.sech_subscnfmstatcd = sech_subscnfmstatcd;
	}

	public void setSech_extnbonm(String sech_extnbonm){
		this.sech_extnbonm = sech_extnbonm;
	}

	public void setSech_rdrnm(String sech_rdrnm){
		this.sech_rdrnm = sech_rdrnm;
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

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSech_extntypecd(){
		return this.sech_extntypecd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getSech_medicd(){
		return this.sech_medicd;
	}

	public String getSech_extnflnm(){
		return this.sech_extnflnm;
	}

	public String getSech_subscnfmstatcd(){
		return this.sech_subscnfmstatcd;
	}

	public String getSech_extnbonm(){
		return this.sech_extnbonm;
	}

	public String getSech_rdrnm(){
		return this.sech_rdrnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_RDR_EXTN_CNFM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_EXTN_CNFMDM dm = (SL_L_RDR_EXTN_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.sech_extntypecd);
		cstmt.setString(7, dm.aplcpathcd);
		cstmt.setString(8, dm.sech_medicd);
		cstmt.setString(9, dm.sech_extnflnm);
		cstmt.setString(10, dm.sech_subscnfmstatcd);
		cstmt.setString(11, dm.sech_extnbonm);
		cstmt.setString(12, dm.sech_rdrnm);
		cstmt.setLong(13, dm.pageno);
		cstmt.setLong(14, dm.pagesize);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_EXTN_CNFMDataSet();
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String sech_extntypecd = req.getParameter("sech_extntypecd");
if( sech_extntypecd == null){
	System.out.println(this.toString+" : sech_extntypecd is null" );
}else{
	System.out.println(this.toString+" : sech_extntypecd is "+sech_extntypecd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String sech_medicd = req.getParameter("sech_medicd");
if( sech_medicd == null){
	System.out.println(this.toString+" : sech_medicd is null" );
}else{
	System.out.println(this.toString+" : sech_medicd is "+sech_medicd );
}
String sech_extnflnm = req.getParameter("sech_extnflnm");
if( sech_extnflnm == null){
	System.out.println(this.toString+" : sech_extnflnm is null" );
}else{
	System.out.println(this.toString+" : sech_extnflnm is "+sech_extnflnm );
}
String sech_subscnfmstatcd = req.getParameter("sech_subscnfmstatcd");
if( sech_subscnfmstatcd == null){
	System.out.println(this.toString+" : sech_subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : sech_subscnfmstatcd is "+sech_subscnfmstatcd );
}
String sech_extnbonm = req.getParameter("sech_extnbonm");
if( sech_extnbonm == null){
	System.out.println(this.toString+" : sech_extnbonm is null" );
}else{
	System.out.println(this.toString+" : sech_extnbonm is "+sech_extnbonm );
}
String sech_rdrnm = req.getParameter("sech_rdrnm");
if( sech_rdrnm == null){
	System.out.println(this.toString+" : sech_rdrnm is null" );
}else{
	System.out.println(this.toString+" : sech_rdrnm is "+sech_rdrnm );
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
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String sech_extntypecd = Util.checkString(req.getParameter("sech_extntypecd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String sech_medicd = Util.checkString(req.getParameter("sech_medicd"));
String sech_extnflnm = Util.checkString(req.getParameter("sech_extnflnm"));
String sech_subscnfmstatcd = Util.checkString(req.getParameter("sech_subscnfmstatcd"));
String sech_extnbonm = Util.checkString(req.getParameter("sech_extnbonm"));
String sech_rdrnm = Util.checkString(req.getParameter("sech_rdrnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String sech_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_extntypecd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String sech_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_medicd")));
String sech_extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_extnflnm")));
String sech_subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_subscnfmstatcd")));
String sech_extnbonm = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_extnbonm")));
String sech_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_rdrnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSech_extntypecd(sech_extntypecd);
dm.setAplcpathcd(aplcpathcd);
dm.setSech_medicd(sech_medicd);
dm.setSech_extnflnm(sech_extnflnm);
dm.setSech_subscnfmstatcd(sech_subscnfmstatcd);
dm.setSech_extnbonm(sech_extnbonm);
dm.setSech_rdrnm(sech_rdrnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 10:41:35 KST 2004 */