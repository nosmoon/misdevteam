/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-독자등급관리-조회
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급관리-조회
 */

public class SS_L_RDRCRTSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String medicd;
	public String rdr_no;
	public String rdrnm;
	public String membnm;
	public String prn1;
	public String prn2;
	public String telno1;
	public String telno2;
	public String telno3;
	public String dtlsprocstatcd;
	public String errresncd;
	public String recstat;
	public String mblestat;
	public String mblenonrsmgcd;
	public String ireader_stat;
	public long pageno;
	public long pagesize;

	public SS_L_RDRCRTSDM(){}
	public SS_L_RDRCRTSDM(String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String medicd, String rdr_no, String rdrnm, String membnm, String prn1, String prn2, String telno1, String telno2, String telno3, String dtlsprocstatcd, String errresncd, String recstat, String mblestat, String mblenonrsmgcd, String ireader_stat, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.medicd = medicd;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.membnm = membnm;
		this.prn1 = prn1;
		this.prn2 = prn2;
		this.telno1 = telno1;
		this.telno2 = telno2;
		this.telno3 = telno3;
		this.dtlsprocstatcd = dtlsprocstatcd;
		this.errresncd = errresncd;
		this.recstat = recstat;
		this.mblestat = mblestat;
		this.mblenonrsmgcd = mblenonrsmgcd;
		this.ireader_stat = ireader_stat;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
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

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMembnm(String membnm){
		this.membnm = membnm;
	}

	public void setPrn1(String prn1){
		this.prn1 = prn1;
	}

	public void setPrn2(String prn2){
		this.prn2 = prn2;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setTelno3(String telno3){
		this.telno3 = telno3;
	}

	public void setDtlsprocstatcd(String dtlsprocstatcd){
		this.dtlsprocstatcd = dtlsprocstatcd;
	}

	public void setErrresncd(String errresncd){
		this.errresncd = errresncd;
	}

	public void setRecstat(String recstat){
		this.recstat = recstat;
	}

	public void setMblestat(String mblestat){
		this.mblestat = mblestat;
	}

	public void setMblenonrsmgcd(String mblenonrsmgcd){
		this.mblenonrsmgcd = mblenonrsmgcd;
	}

	public void setIreader_stat(String ireader_stat){
		this.ireader_stat = ireader_stat;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMembnm(){
		return this.membnm;
	}

	public String getPrn1(){
		return this.prn1;
	}

	public String getPrn2(){
		return this.prn2;
	}

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public String getTelno3(){
		return this.telno3;
	}

	public String getDtlsprocstatcd(){
		return this.dtlsprocstatcd;
	}

	public String getErrresncd(){
		return this.errresncd;
	}

	public String getRecstat(){
		return this.recstat;
	}

	public String getMblestat(){
		return this.mblestat;
	}

	public String getMblenonrsmgcd(){
		return this.mblenonrsmgcd;
	}

	public String getIreader_stat(){
		return this.ireader_stat;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDRCRTS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDRCRTSDM dm = (SS_L_RDRCRTSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.rdr_no);
		cstmt.setString(11, dm.rdrnm);
		cstmt.setString(12, dm.membnm);
		cstmt.setString(13, dm.prn1);
		cstmt.setString(14, dm.prn2);
		cstmt.setString(15, dm.telno1);
		cstmt.setString(16, dm.telno2);
		cstmt.setString(17, dm.telno3);
		cstmt.setString(18, dm.dtlsprocstatcd);
		cstmt.setString(19, dm.errresncd);
		cstmt.setString(20, dm.recstat);
		cstmt.setString(21, dm.mblestat);
		cstmt.setString(22, dm.mblenonrsmgcd);
		cstmt.setString(23, dm.ireader_stat);
		cstmt.setLong(24, dm.pageno);
		cstmt.setLong(25, dm.pagesize);
		cstmt.registerOutParameter(26, Types.INTEGER);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_RDRCRTSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
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
String membnm = req.getParameter("membnm");
if( membnm == null){
	System.out.println(this.toString+" : membnm is null" );
}else{
	System.out.println(this.toString+" : membnm is "+membnm );
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
String telno1 = req.getParameter("telno1");
if( telno1 == null){
	System.out.println(this.toString+" : telno1 is null" );
}else{
	System.out.println(this.toString+" : telno1 is "+telno1 );
}
String telno2 = req.getParameter("telno2");
if( telno2 == null){
	System.out.println(this.toString+" : telno2 is null" );
}else{
	System.out.println(this.toString+" : telno2 is "+telno2 );
}
String telno3 = req.getParameter("telno3");
if( telno3 == null){
	System.out.println(this.toString+" : telno3 is null" );
}else{
	System.out.println(this.toString+" : telno3 is "+telno3 );
}
String dtlsprocstatcd = req.getParameter("dtlsprocstatcd");
if( dtlsprocstatcd == null){
	System.out.println(this.toString+" : dtlsprocstatcd is null" );
}else{
	System.out.println(this.toString+" : dtlsprocstatcd is "+dtlsprocstatcd );
}
String errresncd = req.getParameter("errresncd");
if( errresncd == null){
	System.out.println(this.toString+" : errresncd is null" );
}else{
	System.out.println(this.toString+" : errresncd is "+errresncd );
}
String recstat = req.getParameter("recstat");
if( recstat == null){
	System.out.println(this.toString+" : recstat is null" );
}else{
	System.out.println(this.toString+" : recstat is "+recstat );
}
String mblestat = req.getParameter("mblestat");
if( mblestat == null){
	System.out.println(this.toString+" : mblestat is null" );
}else{
	System.out.println(this.toString+" : mblestat is "+mblestat );
}
String mblenonrsmgcd = req.getParameter("mblenonrsmgcd");
if( mblenonrsmgcd == null){
	System.out.println(this.toString+" : mblenonrsmgcd is null" );
}else{
	System.out.println(this.toString+" : mblenonrsmgcd is "+mblenonrsmgcd );
}
String ireader_stat = req.getParameter("ireader_stat");
if( ireader_stat == null){
	System.out.println(this.toString+" : ireader_stat is null" );
}else{
	System.out.println(this.toString+" : ireader_stat is "+ireader_stat );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String membnm = Util.checkString(req.getParameter("membnm"));
String prn1 = Util.checkString(req.getParameter("prn1"));
String prn2 = Util.checkString(req.getParameter("prn2"));
String telno1 = Util.checkString(req.getParameter("telno1"));
String telno2 = Util.checkString(req.getParameter("telno2"));
String telno3 = Util.checkString(req.getParameter("telno3"));
String dtlsprocstatcd = Util.checkString(req.getParameter("dtlsprocstatcd"));
String errresncd = Util.checkString(req.getParameter("errresncd"));
String recstat = Util.checkString(req.getParameter("recstat"));
String mblestat = Util.checkString(req.getParameter("mblestat"));
String mblenonrsmgcd = Util.checkString(req.getParameter("mblenonrsmgcd"));
String ireader_stat = Util.checkString(req.getParameter("ireader_stat"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String membnm = Util.Uni2Ksc(Util.checkString(req.getParameter("membnm")));
String prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn1")));
String prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn2")));
String telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno1")));
String telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno2")));
String telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno3")));
String dtlsprocstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsprocstatcd")));
String errresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("errresncd")));
String recstat = Util.Uni2Ksc(Util.checkString(req.getParameter("recstat")));
String mblestat = Util.Uni2Ksc(Util.checkString(req.getParameter("mblestat")));
String mblenonrsmgcd = Util.Uni2Ksc(Util.checkString(req.getParameter("mblenonrsmgcd")));
String ireader_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("ireader_stat")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMedicd(medicd);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setMembnm(membnm);
dm.setPrn1(prn1);
dm.setPrn2(prn2);
dm.setTelno1(telno1);
dm.setTelno2(telno2);
dm.setTelno3(telno3);
dm.setDtlsprocstatcd(dtlsprocstatcd);
dm.setErrresncd(errresncd);
dm.setRecstat(recstat);
dm.setMblestat(mblestat);
dm.setMblenonrsmgcd(mblenonrsmgcd);
dm.setIreader_stat(ireader_stat);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 13:17:02 KST 2009 */