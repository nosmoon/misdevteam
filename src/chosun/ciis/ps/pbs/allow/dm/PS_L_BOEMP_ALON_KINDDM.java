/***************************************************************************************************
 * 파일명   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * 기능     : 수당-사원별수당관리 초기
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 *   수당-사원별수당관리 초기
 *
 **/

public class PS_L_BOEMP_ALON_KINDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String boemp_no1;
	public String boemp_no2;
	public String deptcd;

	public PS_L_BOEMP_ALON_KINDDM(){}
	public PS_L_BOEMP_ALON_KINDDM(String cmpycd, String incmgpers, String bocd, String boemp_no1, String boemp_no2, String deptcd){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.boemp_no1 = boemp_no1;
		this.boemp_no2 = boemp_no2;
		this.deptcd = deptcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no1(String boemp_no1){
		this.boemp_no1 = boemp_no1;
	}

	public void setBoemp_no2(String boemp_no2){
		this.boemp_no2 = boemp_no2;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no1(){
		return this.boemp_no1;
	}

	public String getBoemp_no2(){
		return this.boemp_no2;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BOEMP_ALON_KIND( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BOEMP_ALON_KINDDM dm = (PS_L_BOEMP_ALON_KINDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.boemp_no1);
		cstmt.setString(7, dm.boemp_no2);
		cstmt.setString(8, dm.deptcd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_L_BOEMP_ALON_KINDDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String boemp_no1 = req.getParameter("boemp_no1");
if( boemp_no1 == null){
	System.out.println(this.toString+" : boemp_no1 is null" );
}else{
	System.out.println(this.toString+" : boemp_no1 is "+boemp_no1 );
}
String boemp_no2 = req.getParameter("boemp_no2");
if( boemp_no2 == null){
	System.out.println(this.toString+" : boemp_no2 is null" );
}else{
	System.out.println(this.toString+" : boemp_no2 is "+boemp_no2 );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String boemp_no1 = Util.checkString(req.getParameter("boemp_no1"));
String boemp_no2 = Util.checkString(req.getParameter("boemp_no2"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String boemp_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no1")));
String boemp_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no2")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setBoemp_no1(boemp_no1);
dm.setBoemp_no2(boemp_no2);
dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 21 18:40:03 KST 2007 */