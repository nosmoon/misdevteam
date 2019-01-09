/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 유형별 조회 
* 작성일자 : 2009/05/22
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
 * 본사확장 유형별 조회 
 */

public class SS_L_EXTN_HDQTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String type;
	public String type2;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String medicd;
	public String fromtogb;
	public String fromdt;
	public String todt;
	public String aplcpathcd;
	public String rdr_extntypecd;
	public String rdrnm;
	public String extnflnm;
	public String aplcpersnm;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public String valmm;

	public SS_L_EXTN_HDQTDM(){}
	public SS_L_EXTN_HDQTDM(String type, String type2, String deptcd, String partcd, String areacd, String bocd, String medicd, String fromtogb, String fromdt, String todt, String aplcpathcd, String rdr_extntypecd, String rdrnm, String extnflnm, String aplcpersnm, String bo_headcnfmyn, String subscnfmstatcd, String valmm){
		this.type = type;
		this.type2 = type2;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.medicd = medicd;
		this.fromtogb = fromtogb;
		this.fromdt = fromdt;
		this.todt = todt;
		this.aplcpathcd = aplcpathcd;
		this.rdr_extntypecd = rdr_extntypecd;
		this.rdrnm = rdrnm;
		this.extnflnm = extnflnm;
		this.aplcpersnm = aplcpersnm;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.subscnfmstatcd = subscnfmstatcd;
		this.valmm = valmm;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setType2(String type2){
		this.type2 = type2;
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

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getType(){
		return this.type;
	}

	public String getType2(){
		return this.type2;
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

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_HDQT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_HDQTDM dm = (SS_L_EXTN_HDQTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.type);
		cstmt.setString(4, dm.type2);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.partcd);
		cstmt.setString(7, dm.areacd);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.fromtogb);
		cstmt.setString(11, dm.fromdt);
		cstmt.setString(12, dm.todt);
		cstmt.setString(13, dm.aplcpathcd);
		cstmt.setString(14, dm.rdr_extntypecd);
		cstmt.setString(15, dm.rdrnm);
		cstmt.setString(16, dm.extnflnm);
		cstmt.setString(17, dm.aplcpersnm);
		cstmt.setString(18, dm.bo_headcnfmyn);
		cstmt.setString(19, dm.subscnfmstatcd);
		cstmt.setString(20, dm.valmm);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_HDQTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
}
String type2 = req.getParameter("type2");
if( type2 == null){
	System.out.println(this.toString+" : type2 is null" );
}else{
	System.out.println(this.toString+" : type2 is "+type2 );
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
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
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
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String type = Util.checkString(req.getParameter("type"));
String type2 = Util.checkString(req.getParameter("type2"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String aplcpersnm = Util.checkString(req.getParameter("aplcpersnm"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setType(type);
dm.setType2(type2);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setFromtogb(fromtogb);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setAplcpathcd(aplcpathcd);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setRdrnm(rdrnm);
dm.setExtnflnm(extnflnm);
dm.setAplcpersnm(aplcpersnm);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 31 15:30:24 KST 2009 */