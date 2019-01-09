/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-빌링-지로 수납현황-목록엑셀저장
* 작성일자 : 2009-04-16
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
 * 지국지원-빌링-지로 수납현황-목록엑셀저장
 */

public class SS_L_GIRORECP_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String selclsf;
	public String fromdt;
	public String todt;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String recpclsf;
	public String recpbankcd;

	public SS_L_GIRORECP_PRINTDM(){}
	public SS_L_GIRORECP_PRINTDM(String selclsf, String fromdt, String todt, String deptcd, String partcd, String areacd, String bocd, String recpclsf, String recpbankcd){
		this.selclsf = selclsf;
		this.fromdt = fromdt;
		this.todt = todt;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.recpclsf = recpclsf;
		this.recpbankcd = recpbankcd;
	}

	public void setSelclsf(String selclsf){
		this.selclsf = selclsf;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
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

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setRecpbankcd(String recpbankcd){
		this.recpbankcd = recpbankcd;
	}

	public String getSelclsf(){
		return this.selclsf;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
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

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getRecpbankcd(){
		return this.recpbankcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_GIRORECP_PRINT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_GIRORECP_PRINTDM dm = (SS_L_GIRORECP_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.selclsf);
		cstmt.setString(4, dm.fromdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.partcd);
		cstmt.setString(8, dm.areacd);
		cstmt.setString(9, dm.bocd);
		cstmt.setString(10, dm.recpclsf);
		cstmt.setString(11, dm.recpbankcd);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_GIRORECP_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String selclsf = req.getParameter("selclsf");
if( selclsf == null){
	System.out.println(this.toString+" : selclsf is null" );
}else{
	System.out.println(this.toString+" : selclsf is "+selclsf );
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
String recpclsf = req.getParameter("recpclsf");
if( recpclsf == null){
	System.out.println(this.toString+" : recpclsf is null" );
}else{
	System.out.println(this.toString+" : recpclsf is "+recpclsf );
}
String recpbankcd = req.getParameter("recpbankcd");
if( recpbankcd == null){
	System.out.println(this.toString+" : recpbankcd is null" );
}else{
	System.out.println(this.toString+" : recpbankcd is "+recpbankcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String selclsf = Util.checkString(req.getParameter("selclsf"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String recpclsf = Util.checkString(req.getParameter("recpclsf"));
String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String selclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("selclsf")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String recpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recpclsf")));
String recpbankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpbankcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSelclsf(selclsf);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setRecpclsf(recpclsf);
dm.setRecpbankcd(recpbankcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 17:18:32 KST 2009 */