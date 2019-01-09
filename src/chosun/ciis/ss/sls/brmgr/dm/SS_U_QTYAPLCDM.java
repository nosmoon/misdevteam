/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감-신청(영업)-저장
* 작성일자 : 2009-07-21
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감-신청(영업)-저장
 */

public class SS_U_QTYAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String aplcdt;
	public String issudt;
	public String mediinfo;
	public String chrgcnfmyn;
	public String incmgpers;

	public SS_U_QTYAPLCDM(){}
	public SS_U_QTYAPLCDM(String bocd, String aplcdt, String issudt, String mediinfo, String chrgcnfmyn, String incmgpers){
		this.bocd = bocd;
		this.aplcdt = aplcdt;
		this.issudt = issudt;
		this.mediinfo = mediinfo;
		this.chrgcnfmyn = chrgcnfmyn;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setMediinfo(String mediinfo){
		this.mediinfo = mediinfo;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getMediinfo(){
		return this.mediinfo;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_QTYAPLC( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_QTYAPLCDM dm = (SS_U_QTYAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.aplcdt);
		cstmt.setString(5, dm.issudt);
		cstmt.setString(6, dm.mediinfo);
		cstmt.setString(7, dm.chrgcnfmyn);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_U_QTYAPLCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String issudt = req.getParameter("issudt");
if( issudt == null){
	System.out.println(this.toString+" : issudt is null" );
}else{
	System.out.println(this.toString+" : issudt is "+issudt );
}
String mediinfo = req.getParameter("mediinfo");
if( mediinfo == null){
	System.out.println(this.toString+" : mediinfo is null" );
}else{
	System.out.println(this.toString+" : mediinfo is "+mediinfo );
}
String chrgcnfmyn = req.getParameter("chrgcnfmyn");
if( chrgcnfmyn == null){
	System.out.println(this.toString+" : chrgcnfmyn is null" );
}else{
	System.out.println(this.toString+" : chrgcnfmyn is "+chrgcnfmyn );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String issudt = Util.checkString(req.getParameter("issudt"));
String mediinfo = Util.checkString(req.getParameter("mediinfo"));
String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String mediinfo = Util.Uni2Ksc(Util.checkString(req.getParameter("mediinfo")));
String chrgcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("chrgcnfmyn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setIssudt(issudt);
dm.setMediinfo(mediinfo);
dm.setChrgcnfmyn(chrgcnfmyn);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 21:01:48 KST 2009 */