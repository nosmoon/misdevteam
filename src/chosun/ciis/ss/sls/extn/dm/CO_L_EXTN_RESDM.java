/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장제한-목록
* 작성일자 : 2009-04-06
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
 * 확장현황-확장제한-목록
 */

public class CO_L_EXTN_RESDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String viewflag;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String cns_empcnfmstatcd;
	public String cns_empcnfmocomcd;
	public String chrg_cnfmstatcd;
	public String chrg_cnfmocomcd;
	public long pageno;
	public long pagesize;

	public CO_L_EXTN_RESDM(){}
	public CO_L_EXTN_RESDM(String viewflag, String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String cns_empcnfmstatcd, String cns_empcnfmocomcd, String chrg_cnfmstatcd, String chrg_cnfmocomcd, long pageno, long pagesize){
		this.viewflag = viewflag;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.cns_empcnfmstatcd = cns_empcnfmstatcd;
		this.cns_empcnfmocomcd = cns_empcnfmocomcd;
		this.chrg_cnfmstatcd = chrg_cnfmstatcd;
		this.chrg_cnfmocomcd = chrg_cnfmocomcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setViewflag(String viewflag){
		this.viewflag = viewflag;
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

	public void setCns_empcnfmstatcd(String cns_empcnfmstatcd){
		this.cns_empcnfmstatcd = cns_empcnfmstatcd;
	}

	public void setCns_empcnfmocomcd(String cns_empcnfmocomcd){
		this.cns_empcnfmocomcd = cns_empcnfmocomcd;
	}

	public void setChrg_cnfmstatcd(String chrg_cnfmstatcd){
		this.chrg_cnfmstatcd = chrg_cnfmstatcd;
	}

	public void setChrg_cnfmocomcd(String chrg_cnfmocomcd){
		this.chrg_cnfmocomcd = chrg_cnfmocomcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getViewflag(){
		return this.viewflag;
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

	public String getCns_empcnfmstatcd(){
		return this.cns_empcnfmstatcd;
	}

	public String getCns_empcnfmocomcd(){
		return this.cns_empcnfmocomcd;
	}

	public String getChrg_cnfmstatcd(){
		return this.chrg_cnfmstatcd;
	}

	public String getChrg_cnfmocomcd(){
		return this.chrg_cnfmocomcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_EXTN_RES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_EXTN_RESDM dm = (CO_L_EXTN_RESDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.viewflag);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.partcd);
		cstmt.setString(6, dm.areacd);
		cstmt.setString(7, dm.bocd);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.cns_empcnfmstatcd);
		cstmt.setString(11, dm.cns_empcnfmocomcd);
		cstmt.setString(12, dm.chrg_cnfmstatcd);
		cstmt.setString(13, dm.chrg_cnfmocomcd);
		cstmt.setLong(14, dm.pageno);
		cstmt.setLong(15, dm.pagesize);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.CO_L_EXTN_RESDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String viewflag = req.getParameter("viewflag");
if( viewflag == null){
	System.out.println(this.toString+" : viewflag is null" );
}else{
	System.out.println(this.toString+" : viewflag is "+viewflag );
}
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
String cns_empcnfmstatcd = req.getParameter("cns_empcnfmstatcd");
if( cns_empcnfmstatcd == null){
	System.out.println(this.toString+" : cns_empcnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmstatcd is "+cns_empcnfmstatcd );
}
String cns_empcnfmocomcd = req.getParameter("cns_empcnfmocomcd");
if( cns_empcnfmocomcd == null){
	System.out.println(this.toString+" : cns_empcnfmocomcd is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmocomcd is "+cns_empcnfmocomcd );
}
String chrg_cnfmstatcd = req.getParameter("chrg_cnfmstatcd");
if( chrg_cnfmstatcd == null){
	System.out.println(this.toString+" : chrg_cnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : chrg_cnfmstatcd is "+chrg_cnfmstatcd );
}
String chrg_cnfmocomcd = req.getParameter("chrg_cnfmocomcd");
if( chrg_cnfmocomcd == null){
	System.out.println(this.toString+" : chrg_cnfmocomcd is null" );
}else{
	System.out.println(this.toString+" : chrg_cnfmocomcd is "+chrg_cnfmocomcd );
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

String viewflag = Util.checkString(req.getParameter("viewflag"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String cns_empcnfmstatcd = Util.checkString(req.getParameter("cns_empcnfmstatcd"));
String cns_empcnfmocomcd = Util.checkString(req.getParameter("cns_empcnfmocomcd"));
String chrg_cnfmstatcd = Util.checkString(req.getParameter("chrg_cnfmstatcd"));
String chrg_cnfmocomcd = Util.checkString(req.getParameter("chrg_cnfmocomcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String viewflag = Util.Uni2Ksc(Util.checkString(req.getParameter("viewflag")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String cns_empcnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmstatcd")));
String cns_empcnfmocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmocomcd")));
String chrg_cnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_cnfmstatcd")));
String chrg_cnfmocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_cnfmocomcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setViewflag(viewflag);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setCns_empcnfmstatcd(cns_empcnfmstatcd);
dm.setCns_empcnfmocomcd(cns_empcnfmocomcd);
dm.setChrg_cnfmstatcd(chrg_cnfmstatcd);
dm.setChrg_cnfmocomcd(chrg_cnfmocomcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 21:27:50 KST 2009 */