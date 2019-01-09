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


public class SS_SLS_BRMGR_3030_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String resv_qty;
	public String icdc_qty;
	public String issu_dt;
	public String incmgpers;

	public SS_SLS_BRMGR_3030_UDM(){}
	public SS_SLS_BRMGR_3030_UDM(String bocd, String medicd, String resv_qty, String icdc_qty, String issu_dt, String incmgpers){
		this.bocd = bocd;
		this.medicd = medicd;
		this.resv_qty = resv_qty;
		this.icdc_qty = icdc_qty;
		this.issu_dt = issu_dt;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setResv_qty(String resv_qty){
		this.resv_qty = resv_qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getResv_qty(){
		return this.resv_qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_3030_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_3030_UDM dm = (SS_SLS_BRMGR_3030_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.resv_qty);
		cstmt.setString(6, dm.icdc_qty);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_3030_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("resv_qty = [" + getResv_qty() + "]");
		System.out.println("icdc_qty = [" + getIcdc_qty() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String resv_qty = req.getParameter("resv_qty");
if( resv_qty == null){
	System.out.println(this.toString+" : resv_qty is null" );
}else{
	System.out.println(this.toString+" : resv_qty is "+resv_qty );
}
String icdc_qty = req.getParameter("icdc_qty");
if( icdc_qty == null){
	System.out.println(this.toString+" : icdc_qty is null" );
}else{
	System.out.println(this.toString+" : icdc_qty is "+icdc_qty );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
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
String medicd = Util.checkString(req.getParameter("medicd"));
String resv_qty = Util.checkString(req.getParameter("resv_qty"));
String icdc_qty = Util.checkString(req.getParameter("icdc_qty"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String resv_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("resv_qty")));
String icdc_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_qty")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setResv_qty(resv_qty);
dm.setIcdc_qty(icdc_qty);
dm.setIssu_dt(issu_dt);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 27 10:26:37 KST 2017 */