/***************************************************************************************************
 * 파일명   : SP_SS_L_CVSRECP_LIST
 * 기능     : 지국지원-빌링-편의점수납현황
 * 작성일자 : 2007/04/20
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_CVSRECP_LIST
**/

public class SS_L_CVSRECP_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fromdt;
	public String todt;
	public String bocd;
	public String girono;
	public String recpbankcd;
	public long pageno;
	public long pagesize;

	public SS_L_CVSRECP_LISTDM(){}
	public SS_L_CVSRECP_LISTDM(String fromdt, String todt, String bocd, String girono, String recpbankcd, long pageno, long pagesize){
		this.fromdt = fromdt;
		this.todt = todt;
		this.bocd = bocd;
		this.girono = girono;
		this.recpbankcd = recpbankcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setRecpbankcd(String recpbankcd){
		this.recpbankcd = recpbankcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getRecpbankcd(){
		return this.recpbankcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CVSRECP_LIST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CVSRECP_LISTDM dm = (SS_L_CVSRECP_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fromdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.girono);
		cstmt.setString(7, dm.recpbankcd);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_CVSRECP_LISTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
String recpbankcd = req.getParameter("recpbankcd");
if( recpbankcd == null){
	System.out.println(this.toString+" : recpbankcd is null" );
}else{
	System.out.println(this.toString+" : recpbankcd is "+recpbankcd );
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

String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String girono = Util.checkString(req.getParameter("girono"));
String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String recpbankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpbankcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setBocd(bocd);
dm.setGirono(girono);
dm.setRecpbankcd(recpbankcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 20 16:48:01 KST 2007 */