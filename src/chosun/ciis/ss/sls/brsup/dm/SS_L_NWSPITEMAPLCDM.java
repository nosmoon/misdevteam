/***************************************************************************************************
* 파일명 : .java
* 기능 : 검색조건에 따라 신문지원물품 신청목록을 리턴한다.
* 작성일자 :2009/07/03  
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-신청-목록
 */

public class SS_L_NWSPITEMAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String itemcd;
	public String itemclsf;
	public String closyn;

	public SS_L_NWSPITEMAPLCDM(){}
	public SS_L_NWSPITEMAPLCDM(String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String itemcd, String itemclsf, String closyn){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.itemcd = itemcd;
		this.itemclsf = itemclsf;
		this.closyn = closyn;
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

	public void setClosyn(String closyn){
		this.closyn = closyn;
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

	public String getClosyn(){
		return this.closyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NWSPITEMAPLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWSPITEMAPLCDM dm = (SS_L_NWSPITEMAPLCDM)bdm;
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
		cstmt.setString(11, dm.closyn);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_NWSPITEMAPLCDataSet();
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
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
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
String closyn = Util.checkString(req.getParameter("closyn"));
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
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
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
dm.setClosyn(closyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 15:43:38 PDT 2009 */