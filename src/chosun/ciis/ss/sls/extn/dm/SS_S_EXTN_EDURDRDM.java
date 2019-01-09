/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 상세 조회  
* 작성일자 : 2009-05-28
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
 * 에듀/제휴 확장 상세 조회  
 */

public class SS_S_EXTN_EDURDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String insttcd;
	public String type;
	public String edutype;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String medicd;
	public String fromtogb;
	public String fromdt;
	public String todt;
	public String rdr_extntypecd;
	public String rdrnm;
	public String instnm;
	public String subscnfmstatcd;
	public String valmm;

	public SS_S_EXTN_EDURDRDM(){}
	public SS_S_EXTN_EDURDRDM(String insttcd, String type, String edutype, String deptcd, String partcd, String areacd, String bocd, String medicd, String fromtogb, String fromdt, String todt, String rdr_extntypecd, String rdrnm, String instnm, String subscnfmstatcd, String valmm){
		this.insttcd = insttcd;
		this.type = type;
		this.edutype = edutype;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.medicd = medicd;
		this.fromtogb = fromtogb;
		this.fromdt = fromdt;
		this.todt = todt;
		this.rdr_extntypecd = rdr_extntypecd;
		this.rdrnm = rdrnm;
		this.instnm = instnm;
		this.subscnfmstatcd = subscnfmstatcd;
		this.valmm = valmm;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setEdutype(String edutype){
		this.edutype = edutype;
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

	public void setMedicd(String medicd){
		this.medicd = medicd;
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

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setInstnm(String instnm){
		this.instnm = instnm;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getType(){
		return this.type;
	}

	public String getEdutype(){
		return this.edutype;
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

	public String getMedicd(){
		return this.medicd;
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

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getInstnm(){
		return this.instnm;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_EXTN_EDURDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_EXTN_EDURDRDM dm = (SS_S_EXTN_EDURDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.insttcd);
		cstmt.setString(4, dm.type);
		cstmt.setString(5, dm.edutype);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.partcd);
		cstmt.setString(8, dm.areacd);
		cstmt.setString(9, dm.bocd);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.fromtogb);
		cstmt.setString(12, dm.fromdt);
		cstmt.setString(13, dm.todt);
		cstmt.setString(14, dm.rdr_extntypecd);
		cstmt.setString(15, dm.rdrnm);
		cstmt.setString(16, dm.instnm);
		cstmt.setString(17, dm.subscnfmstatcd);
		cstmt.setString(18, dm.valmm);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_EXTN_EDURDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String insttcd = req.getParameter("insttcd");
if( insttcd == null){
	System.out.println(this.toString+" : insttcd is null" );
}else{
	System.out.println(this.toString+" : insttcd is "+insttcd );
}
String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
}
String edutype = req.getParameter("edutype");
if( edutype == null){
	System.out.println(this.toString+" : edutype is null" );
}else{
	System.out.println(this.toString+" : edutype is "+edutype );
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String instnm = req.getParameter("instnm");
if( instnm == null){
	System.out.println(this.toString+" : instnm is null" );
}else{
	System.out.println(this.toString+" : instnm is "+instnm );
}
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String insttcd = Util.checkString(req.getParameter("insttcd"));
String type = Util.checkString(req.getParameter("type"));
String edutype = Util.checkString(req.getParameter("edutype"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String instnm = Util.checkString(req.getParameter("instnm"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String edutype = Util.Uni2Ksc(Util.checkString(req.getParameter("edutype")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String instnm = Util.Uni2Ksc(Util.checkString(req.getParameter("instnm")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setInsttcd(insttcd);
dm.setType(type);
dm.setEdutype(edutype);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setFromtogb(fromtogb);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setRdrnm(rdrnm);
dm.setInstnm(instnm);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 12:24:24 KST 2009 */