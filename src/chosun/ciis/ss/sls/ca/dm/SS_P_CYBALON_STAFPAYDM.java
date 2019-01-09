/***************************************************************************************************
 * 파일명   : SS_P_CYBALON_STAFPAYDM.java
 * 기능     : 사이버센터-사이버수당지급 인쇄
 * 작성일자 : 2005-07-15
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 사이버센터-사이버수당지급 인쇄
 */

public class SS_P_CYBALON_STAFPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closyymm;
	public String selcd;
	public String selnm;
	public String incmgpers;

	public SS_P_CYBALON_STAFPAYDM(){}
	public SS_P_CYBALON_STAFPAYDM(String closyymm, String selcd, String selnm, String incmgpers){
		this.closyymm = closyymm;
		this.selcd = selcd;
		this.selnm = selnm;
		this.incmgpers = incmgpers;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setSelcd(String selcd){
		this.selcd = selcd;
	}

	public void setSelnm(String selnm){
		this.selnm = selnm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getSelcd(){
		return this.selcd;
	}

	public String getSelnm(){
		return this.selnm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_P_CYBALON_STAFPAY( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_P_CYBALON_STAFPAYDM dm = (SS_P_CYBALON_STAFPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closyymm);
		cstmt.setString(4, dm.selcd);
		cstmt.setString(5, dm.selnm);
		cstmt.setString(6, dm.incmgpers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_P_CYBALON_STAFPAYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
String selcd = req.getParameter("selcd");
if( selcd == null){
	System.out.println(this.toString+" : selcd is null" );
}else{
	System.out.println(this.toString+" : selcd is "+selcd );
}
String selnm = req.getParameter("selnm");
if( selnm == null){
	System.out.println(this.toString+" : selnm is null" );
}else{
	System.out.println(this.toString+" : selnm is "+selnm );
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

String closyymm = Util.checkString(req.getParameter("closyymm"));
String selcd = Util.checkString(req.getParameter("selcd"));
String selnm = Util.checkString(req.getParameter("selnm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
String selcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selcd")));
String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosyymm(closyymm);
dm.setSelcd(selcd);
dm.setSelnm(selnm);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 18:38:23 KST 2005 */