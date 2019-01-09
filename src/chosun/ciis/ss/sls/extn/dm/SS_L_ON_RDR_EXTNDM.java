/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-온라인확장-신청현황 목록
* 작성일자 : 2009-04-03
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-온라인확장-신청현황 목록
 */

public class SS_L_ON_RDR_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String corrbocd;
	public String fromtogb;
	public String fromdt;
	public String todt;
	public String extnflnm;
	public String aplcpersnm;
	public String rdrnm;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public long pageno;
	public long pagesize;
	public String incmgdt;

	public SS_L_ON_RDR_EXTNDM(){}
	public SS_L_ON_RDR_EXTNDM(String deptcd, String partcd, String areacd, String corrbocd, String fromtogb, String fromdt, String todt, String extnflnm, String aplcpersnm, String rdrnm, String bo_headcnfmyn, String subscnfmstatcd, long pageno, long pagesize, String incmgdt){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.corrbocd = corrbocd;
		this.fromtogb = fromtogb;
		this.fromdt = fromdt;
		this.todt = todt;
		this.extnflnm = extnflnm;
		this.aplcpersnm = aplcpersnm;
		this.rdrnm = rdrnm;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.subscnfmstatcd = subscnfmstatcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.incmgdt = incmgdt;
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

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
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

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_ON_RDR_EXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ON_RDR_EXTNDM dm = (SS_L_ON_RDR_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.corrbocd);
		cstmt.setString(7, dm.fromtogb);
		cstmt.setString(8, dm.fromdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.extnflnm);
		cstmt.setString(11, dm.aplcpersnm);
		cstmt.setString(12, dm.rdrnm);
		cstmt.setString(13, dm.bo_headcnfmyn);
		cstmt.setString(14, dm.subscnfmstatcd);
		cstmt.setLong(15, dm.pageno);
		cstmt.setLong(16, dm.pagesize);
		cstmt.setString(17, dm.incmgdt);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_ON_RDR_EXTNDataSet();
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
String corrbocd = req.getParameter("corrbocd");
if( corrbocd == null){
	System.out.println(this.toString+" : corrbocd is null" );
}else{
	System.out.println(this.toString+" : corrbocd is "+corrbocd );
}
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
}
String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String aplcpersnm = req.getParameter("aplcpersnm");
if( aplcpersnm == null){
	System.out.println(this.toString+" : aplcpersnm is null" );
}else{
	System.out.println(this.toString+" : aplcpersnm is "+aplcpersnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String bo_headcnfmyn = req.getParameter("bo_headcnfmyn");
if( bo_headcnfmyn == null){
	System.out.println(this.toString+" : bo_headcnfmyn is null" );
}else{
	System.out.println(this.toString+" : bo_headcnfmyn is "+bo_headcnfmyn );
}
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
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
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
	System.out.println(this.toString+" : incmgdt is null" );
}else{
	System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String corrbocd = Util.checkString(req.getParameter("corrbocd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setCorrbocd(corrbocd);
dm.setFromtogb(fromtogb);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setExtnflnm(extnflnm);
dm.setAplcpersnm(aplcpersnm);
dm.setRdrnm(rdrnm);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setIncmgdt(incmgdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 16:56:15 KST 2009 */