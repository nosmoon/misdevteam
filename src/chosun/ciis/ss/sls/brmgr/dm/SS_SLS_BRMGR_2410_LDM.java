/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fr_yymm;
	public String to_yymm;
	public String schlevel;
	public String boclsf;
	public String boclsf_ar;
	public String schflag;
	public String incmgpers;
	public String cmpycd;

	public SS_SLS_BRMGR_2410_LDM(){}
	public SS_SLS_BRMGR_2410_LDM(String deptcd, String partcd, String areacd, String bocd, String fr_yymm, String to_yymm, String schlevel, String boclsf, String boclsf_ar, String schflag, String incmgpers, String cmpycd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.schlevel = schlevel;
		this.boclsf = boclsf;
		this.boclsf_ar = boclsf_ar;
		this.schflag = schflag;
		this.incmgpers = incmgpers;
		this.cmpycd = cmpycd;
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

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setBoclsf_ar(String boclsf_ar){
		this.boclsf_ar = boclsf_ar;
	}

	public void setSchflag(String schflag){
		this.schflag = schflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
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

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getBoclsf_ar(){
		return this.boclsf_ar;
	}

	public String getSchflag(){
		return this.schflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2410_LDM dm = (SS_SLS_BRMGR_2410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fr_yymm);
		cstmt.setString(8, dm.to_yymm);
		cstmt.setString(9, dm.schlevel);
		cstmt.setString(10, dm.boclsf);
		cstmt.setString(11, dm.boclsf_ar);
		cstmt.setString(12, dm.schflag);
		cstmt.setString(13, dm.incmgpers);
		cstmt.setString(14, dm.cmpycd);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("schlevel = [" + getSchlevel() + "]");
		System.out.println("boclsf = [" + getBoclsf() + "]");
		System.out.println("boclsf_ar = [" + getBoclsf_ar() + "]");
		System.out.println("schflag = [" + getSchflag() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
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
String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
String boclsf = req.getParameter("boclsf");
if( boclsf == null){
	System.out.println(this.toString+" : boclsf is null" );
}else{
	System.out.println(this.toString+" : boclsf is "+boclsf );
}
String boclsf_ar = req.getParameter("boclsf_ar");
if( boclsf_ar == null){
	System.out.println(this.toString+" : boclsf_ar is null" );
}else{
	System.out.println(this.toString+" : boclsf_ar is "+boclsf_ar );
}
String schflag = req.getParameter("schflag");
if( schflag == null){
	System.out.println(this.toString+" : schflag is null" );
}else{
	System.out.println(this.toString+" : schflag is "+schflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
String boclsf = Util.checkString(req.getParameter("boclsf"));
String boclsf_ar = Util.checkString(req.getParameter("boclsf_ar"));
String schflag = Util.checkString(req.getParameter("schflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
String boclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("boclsf")));
String boclsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("boclsf_ar")));
String schflag = Util.Uni2Ksc(Util.checkString(req.getParameter("schflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setSchlevel(schlevel);
dm.setBoclsf(boclsf);
dm.setBoclsf_ar(boclsf_ar);
dm.setSchflag(schflag);
dm.setIncmgpers(incmgpers);
dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 12 18:35:28 KST 2016 */