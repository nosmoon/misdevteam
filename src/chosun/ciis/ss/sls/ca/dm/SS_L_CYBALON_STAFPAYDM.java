/***************************************************************************************************
 * 파일명   : SS_L_CYBALON_STAFPAYDM.java
 * 기능     : 사이버센터-사이버수당지급 조회
 * 작성일자 : 2005-06-22
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
 * 사이버센터-사이버수당지급 조회
 */

public class SS_L_CYBALON_STAFPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closyymm;
	public String selcd;
	public String selnm;
	public String incmgpers;
	public long pageno;
	public long pagesize;

	public SS_L_CYBALON_STAFPAYDM(){}
	public SS_L_CYBALON_STAFPAYDM(String closyymm, String selcd, String selnm, String incmgpers, long pageno, long pagesize){
		this.closyymm = closyymm;
		this.selcd = selcd;
		this.selnm = selnm;
		this.incmgpers = incmgpers;
		this.pageno = pageno;
		this.pagesize = pagesize;
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

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CYBALON_STAFPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CYBALON_STAFPAYDM dm = (SS_L_CYBALON_STAFPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closyymm);
		cstmt.setString(4, dm.selcd);
		cstmt.setString(5, dm.selnm);
		cstmt.setString(6, dm.incmgpers);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_L_CYBALON_STAFPAYDataSet();
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
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closyymm = Util.checkString(req.getParameter("closyymm"));
String selcd = Util.checkString(req.getParameter("selcd"));
String selnm = Util.checkString(req.getParameter("selnm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
String selcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selcd")));
String selnm = Util.Uni2Ksc(Util.checkString(req.getParameter("selnm")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosyymm(closyymm);
dm.setSelcd(selcd);
dm.setSelnm(selnm);
dm.setIncmgpers(incmgpers);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 22 19:25:05 KST 2005 */