/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-발송-목록
* 작성일자 : 2009-09-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-발송-목록
 */

public class SS_L_NWSPITEMSENDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String itemcd;
	public String itemclsf;
	public String sendclsf;
	public String costclsf;
	public String sendplaccd;
	public long pageno;
	public long pagesize;

	public SS_L_NWSPITEMSENDDM(){}
	public SS_L_NWSPITEMSENDDM(String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String itemcd, String itemclsf, String sendclsf, String costclsf, String sendplaccd, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.itemcd = itemcd;
		this.itemclsf = itemclsf;
		this.sendclsf = sendclsf;
		this.costclsf = costclsf;
		this.sendplaccd = sendplaccd;
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

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setCostclsf(String costclsf){
		this.costclsf = costclsf;
	}

	public void setSendplaccd(String sendplaccd){
		this.sendplaccd = sendplaccd;
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

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getCostclsf(){
		return this.costclsf;
	}

	public String getSendplaccd(){
		return this.sendplaccd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NWSPITEMSEND( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWSPITEMSENDDM dm = (SS_L_NWSPITEMSENDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.itemcd);
		cstmt.setString(10, dm.itemclsf);
		cstmt.setString(11, dm.sendclsf);
		cstmt.setString(12, dm.costclsf);
		cstmt.setString(13, dm.sendplaccd);
		cstmt.setLong(14, dm.pageno);
		cstmt.setLong(15, dm.pagesize);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_NWSPITEMSENDDataSet();
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
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String sendclsf = req.getParameter("sendclsf");
if( sendclsf == null){
	System.out.println(this.toString+" : sendclsf is null" );
}else{
	System.out.println(this.toString+" : sendclsf is "+sendclsf );
}
String costclsf = req.getParameter("costclsf");
if( costclsf == null){
	System.out.println(this.toString+" : costclsf is null" );
}else{
	System.out.println(this.toString+" : costclsf is "+costclsf );
}
String sendplaccd = req.getParameter("sendplaccd");
if( sendplaccd == null){
	System.out.println(this.toString+" : sendplaccd is null" );
}else{
	System.out.println(this.toString+" : sendplaccd is "+sendplaccd );
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
String itemcd = Util.checkString(req.getParameter("itemcd"));
String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String costclsf = Util.checkString(req.getParameter("costclsf"));
String sendplaccd = Util.checkString(req.getParameter("sendplaccd"));
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
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String costclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("costclsf")));
String sendplaccd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendplaccd")));
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
dm.setItemcd(itemcd);
dm.setItemclsf(itemclsf);
dm.setSendclsf(sendclsf);
dm.setCostclsf(costclsf);
dm.setSendplaccd(sendplaccd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Sep 06 19:22:10 KST 2009 */