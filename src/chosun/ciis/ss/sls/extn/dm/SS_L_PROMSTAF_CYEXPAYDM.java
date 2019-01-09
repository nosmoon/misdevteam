/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAYDM.java
* 기능 : 확장현황-사이버확장-수당-목록을 위한 DM
* 작성일자 : 2004-09-13
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-수당-목록을 위한 DM
 */


public class SS_L_PROMSTAF_CYEXPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String medicd;
	public String stafnm;
	public String rdrnm;
	public String fromtogb;
	public String frdt;
	public String todt;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public String alonadjmyn;

	public SS_L_PROMSTAF_CYEXPAYDM(){}
	public SS_L_PROMSTAF_CYEXPAYDM(String cmpycd, String deptcd, String areacd, String bocd, String medicd, String stafnm, String rdrnm, String fromtogb, String frdt, String todt, String bo_headcnfmyn, String subscnfmstatcd, String alonadjmyn){
		this.cmpycd = cmpycd;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.medicd = medicd;
		this.stafnm = stafnm;
		this.rdrnm = rdrnm;
		this.fromtogb = fromtogb;
		this.frdt = frdt;
		this.todt = todt;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.subscnfmstatcd = subscnfmstatcd;
		this.alonadjmyn = alonadjmyn;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
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

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setAlonadjmyn(String alonadjmyn){
		this.alonadjmyn = alonadjmyn;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getDeptcd(){
		return this.deptcd;
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

	public String getStafnm(){
		return this.stafnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getAlonadjmyn(){
		return this.alonadjmyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PROMSTAF_CYEXPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_CYEXPAYDM dm = (SS_L_PROMSTAF_CYEXPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.stafnm);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.fromtogb);
		cstmt.setString(11, dm.frdt);
		cstmt.setString(12, dm.todt);
		cstmt.setString(13, dm.bo_headcnfmyn);
		cstmt.setString(14, dm.subscnfmstatcd);
		cstmt.setString(15, dm.alonadjmyn);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_PROMSTAF_CYEXPAYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
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
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
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
String alonadjmyn = req.getParameter("alonadjmyn");
if( alonadjmyn == null){
	System.out.println(this.toString+" : alonadjmyn is null" );
}else{
	System.out.println(this.toString+" : alonadjmyn is "+alonadjmyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String alonadjmyn = Util.checkString(req.getParameter("alonadjmyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String alonadjmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("alonadjmyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setStafnm(stafnm);
dm.setRdrnm(rdrnm);
dm.setFromtogb(fromtogb);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setAlonadjmyn(alonadjmyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 15 13:59:10 KST 2004 */