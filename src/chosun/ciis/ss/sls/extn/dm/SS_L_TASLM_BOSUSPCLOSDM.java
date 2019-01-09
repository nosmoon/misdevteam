/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-지국중지마감-목록조회
* 작성일자 : 2010-01-06
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
 *  확장현황-지국중지마감-목록조회
 */

public class SS_L_TASLM_BOSUSPCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String type1;
	public String type2;
	public String resitype;
	public String aplcpath;
	public String suspresncd;
	public String frdt;
	public String flag;
	public String frqty;
	public String toqty;
	public String cmpy_cd;
	public String incmg_pers;

	public SS_L_TASLM_BOSUSPCLOSDM(){}
	public SS_L_TASLM_BOSUSPCLOSDM(String deptcd, String partcd, String areacd, String bocd, String type1, String type2, String resitype, String aplcpath, String suspresncd, String frdt, String flag, String frqty, String toqty, String cmpy_cd, String incmg_pers){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.type1 = type1;
		this.type2 = type2;
		this.resitype = resitype;
		this.aplcpath = aplcpath;
		this.suspresncd = suspresncd;
		this.frdt = frdt;
		this.flag = flag;
		this.frqty = frqty;
		this.toqty = toqty;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
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

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
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

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getSuspresncd(){
		return this.suspresncd;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_TASLM_BOSUSPCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_TASLM_BOSUSPCLOSDM dm = (SS_L_TASLM_BOSUSPCLOSDM)bdm;
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
		cstmt.setString(11, dm.suspresncd);
		cstmt.setString(12, dm.frdt);
		cstmt.setString(13, dm.flag);
		cstmt.setString(14, dm.frqty);
		cstmt.setString(15, dm.toqty);
		cstmt.setString(16, dm.cmpy_cd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_TASLM_BOSUSPCLOSDataSet();
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
String suspresncd = req.getParameter("suspresncd");
if( suspresncd == null){
	System.out.println(this.toString+" : suspresncd is null" );
}else{
	System.out.println(this.toString+" : suspresncd is "+suspresncd );
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
String suspresncd = Util.checkString(req.getParameter("suspresncd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String flag = Util.checkString(req.getParameter("flag"));
String frqty = Util.checkString(req.getParameter("frqty"));
String toqty = Util.checkString(req.getParameter("toqty"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
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
String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String frqty = Util.Uni2Ksc(Util.checkString(req.getParameter("frqty")));
String toqty = Util.Uni2Ksc(Util.checkString(req.getParameter("toqty")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
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
dm.setSuspresncd(suspresncd);
dm.setFrdt(frdt);
dm.setFlag(flag);
dm.setFrqty(frqty);
dm.setToqty(toqty);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 06 16:14:22 KST 2010 */