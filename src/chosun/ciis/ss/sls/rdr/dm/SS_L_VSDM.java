/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-신청 조회(리스트)
* 작성일자 : 2009-03-18
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
 * 독자현황-VacationStop-신청 조회(리스트)
 */

public class SS_L_VSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromtogb;
	public String frdt;
	public String todt;
	public String rdrnm;
	public String clsfcd;
	public String bocnfmyn;
	public String vaca_areadlvofficnfmyn;
	public String aplcpathcd;
	public long pageno;
	public long pagesize;

	public SS_L_VSDM(){}
	public SS_L_VSDM(String deptcd, String partcd, String areacd, String bocd, String fromtogb, String frdt, String todt, String rdrnm, String clsfcd, String bocnfmyn, String vaca_areadlvofficnfmyn, String aplcpathcd, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromtogb = fromtogb;
		this.frdt = frdt;
		this.todt = todt;
		this.rdrnm = rdrnm;
		this.clsfcd = clsfcd;
		this.bocnfmyn = bocnfmyn;
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
		this.aplcpathcd = aplcpathcd;
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

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
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

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_VS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VSDM dm = (SS_L_VSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromtogb);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setString(11, dm.clsfcd);
		cstmt.setString(12, dm.bocnfmyn);
		cstmt.setString(13, dm.vaca_areadlvofficnfmyn);
		cstmt.setString(14, dm.aplcpathcd);
		cstmt.setLong(15, dm.pageno);
		cstmt.setLong(16, dm.pagesize);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_VSDataSet();
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
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
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
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String clsfcd = req.getParameter("clsfcd");
if( clsfcd == null){
	System.out.println(this.toString+" : clsfcd is null" );
}else{
	System.out.println(this.toString+" : clsfcd is "+clsfcd );
}
String bocnfmyn = req.getParameter("bocnfmyn");
if( bocnfmyn == null){
	System.out.println(this.toString+" : bocnfmyn is null" );
}else{
	System.out.println(this.toString+" : bocnfmyn is "+bocnfmyn );
}
String vaca_areadlvofficnfmyn = req.getParameter("vaca_areadlvofficnfmyn");
if( vaca_areadlvofficnfmyn == null){
	System.out.println(this.toString+" : vaca_areadlvofficnfmyn is null" );
}else{
	System.out.println(this.toString+" : vaca_areadlvofficnfmyn is "+vaca_areadlvofficnfmyn );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
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
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String clsfcd = Util.checkString(req.getParameter("clsfcd"));
String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));
String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsfcd")));
String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
String vaca_areadlvofficnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvofficnfmyn")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromtogb(fromtogb);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRdrnm(rdrnm);
dm.setClsfcd(clsfcd);
dm.setBocnfmyn(bocnfmyn);
dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);
dm.setAplcpathcd(aplcpathcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 10:37:01 KST 2009 */