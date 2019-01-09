/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국확장마감 조회 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황 - 지국확장마감 조회 
 */

public class SS_L_TASLM_RDREXTNCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String type1;
	public String type2;
	public String resitype;
	public String aplcpath;
	public String frdt;
	public String flag;
	public String frqty;
	public String toqty;

	public SS_L_TASLM_RDREXTNCLOSDM(){}
	public SS_L_TASLM_RDREXTNCLOSDM(String deptcd, String partcd, String areacd, String bocd, String type1, String type2, String resitype, String aplcpath, String frdt, String flag, String frqty, String toqty){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.type1 = type1;
		this.type2 = type2;
		this.resitype = resitype;
		this.aplcpath = aplcpath;
		this.frdt = frdt;
		this.flag = flag;
		this.frqty = frqty;
		this.toqty = toqty;
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

	public void setType1(String type1){
		this.type1 = type1;
	}

	public void setType2(String type2){
		this.type2 = type2;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setFrqty(String frqty){
		this.frqty = frqty;
	}

	public void setToqty(String toqty){
		this.toqty = toqty;
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

	public String getType1(){
		return this.type1;
	}

	public String getType2(){
		return this.type2;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getFrqty(){
		return this.frqty;
	}

	public String getToqty(){
		return this.toqty;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_TASLM_RDREXTNCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_TASLM_RDREXTNCLOSDM dm = (SS_L_TASLM_RDREXTNCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.type1);
		cstmt.setString(8, dm.type2);
		cstmt.setString(9, dm.resitype);
		cstmt.setString(10, dm.aplcpath);
		cstmt.setString(11, dm.frdt);
		cstmt.setString(12, dm.flag);
		cstmt.setString(13, dm.frqty);
		cstmt.setString(14, dm.toqty);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_TASLM_RDREXTNCLOSDataSet();
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
String type1 = req.getParameter("type1");
if( type1 == null){
	System.out.println(this.toString+" : type1 is null" );
}else{
	System.out.println(this.toString+" : type1 is "+type1 );
}
String type2 = req.getParameter("type2");
if( type2 == null){
	System.out.println(this.toString+" : type2 is null" );
}else{
	System.out.println(this.toString+" : type2 is "+type2 );
}
String resitype = req.getParameter("resitype");
if( resitype == null){
	System.out.println(this.toString+" : resitype is null" );
}else{
	System.out.println(this.toString+" : resitype is "+resitype );
}
String aplcpath = req.getParameter("aplcpath");
if( aplcpath == null){
	System.out.println(this.toString+" : aplcpath is null" );
}else{
	System.out.println(this.toString+" : aplcpath is "+aplcpath );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String frqty = req.getParameter("frqty");
if( frqty == null){
	System.out.println(this.toString+" : frqty is null" );
}else{
	System.out.println(this.toString+" : frqty is "+frqty );
}
String toqty = req.getParameter("toqty");
if( toqty == null){
	System.out.println(this.toString+" : toqty is null" );
}else{
	System.out.println(this.toString+" : toqty is "+toqty );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String type1 = Util.checkString(req.getParameter("type1"));
String type2 = Util.checkString(req.getParameter("type2"));
String resitype = Util.checkString(req.getParameter("resitype"));
String aplcpath = Util.checkString(req.getParameter("aplcpath"));
String frdt = Util.checkString(req.getParameter("frdt"));
String flag = Util.checkString(req.getParameter("flag"));
String frqty = Util.checkString(req.getParameter("frqty"));
String toqty = Util.checkString(req.getParameter("toqty"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String type1 = Util.Uni2Ksc(Util.checkString(req.getParameter("type1")));
String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
String resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("resitype")));
String aplcpath = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpath")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String frqty = Util.Uni2Ksc(Util.checkString(req.getParameter("frqty")));
String toqty = Util.Uni2Ksc(Util.checkString(req.getParameter("toqty")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setType1(type1);
dm.setType2(type2);
dm.setResitype(resitype);
dm.setAplcpath(aplcpath);
dm.setFrdt(frdt);
dm.setFlag(flag);
dm.setFrqty(frqty);
dm.setToqty(toqty);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 12:20:11 KST 2009 */