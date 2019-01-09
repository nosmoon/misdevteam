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


public class SS_SLS_BRMGR_2220_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yymm;
	public String bocd;
	public String clsf1;
	public String clsf2;
	public String clsf3;
	public String incmgpers;

	public SS_SLS_BRMGR_2220_UDM(){}
	public SS_SLS_BRMGR_2220_UDM(String yymm, String bocd, String clsf1, String clsf2, String clsf3, String incmgpers){
		this.yymm = yymm;
		this.bocd = bocd;
		this.clsf1 = clsf1;
		this.clsf2 = clsf2;
		this.clsf3 = clsf3;
		this.incmgpers = incmgpers;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
	}

	public void setClsf3(String clsf3){
		this.clsf3 = clsf3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
	}

	public String getClsf3(){
		return this.clsf3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2220_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2220_UDM dm = (SS_SLS_BRMGR_2220_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yymm);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.clsf1);
		cstmt.setString(6, dm.clsf2);
		cstmt.setString(7, dm.clsf3);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2220_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("clsf1 = [" + getClsf1() + "]");
		System.out.println("clsf2 = [" + getClsf2() + "]");
		System.out.println("clsf3 = [" + getClsf3() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String clsf1 = req.getParameter("clsf1");
if( clsf1 == null){
	System.out.println(this.toString+" : clsf1 is null" );
}else{
	System.out.println(this.toString+" : clsf1 is "+clsf1 );
}
String clsf2 = req.getParameter("clsf2");
if( clsf2 == null){
	System.out.println(this.toString+" : clsf2 is null" );
}else{
	System.out.println(this.toString+" : clsf2 is "+clsf2 );
}
String clsf3 = req.getParameter("clsf3");
if( clsf3 == null){
	System.out.println(this.toString+" : clsf3 is null" );
}else{
	System.out.println(this.toString+" : clsf3 is "+clsf3 );
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

String yymm = Util.checkString(req.getParameter("yymm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String clsf1 = Util.checkString(req.getParameter("clsf1"));
String clsf2 = Util.checkString(req.getParameter("clsf2"));
String clsf3 = Util.checkString(req.getParameter("clsf3"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf1")));
String clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf2")));
String clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf3")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setYymm(yymm);
dm.setBocd(bocd);
dm.setClsf1(clsf1);
dm.setClsf2(clsf2);
dm.setClsf3(clsf3);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 30 14:00:47 KST 2016 */