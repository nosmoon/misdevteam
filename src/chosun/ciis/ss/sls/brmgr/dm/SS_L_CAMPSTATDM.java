/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-구독유지-상세
* 작성일자 : 2009-04-25
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
 * 지국경영-구독유지-상세
 */

public class SS_L_CAMPSTATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long pageno;
	public long pagesize;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String chregcd;
	public String campid;

	public SS_L_CAMPSTATDM(){}
	public SS_L_CAMPSTATDM(long pageno, long pagesize, String deptcd, String partcd, String areacd, String bocd, String chregcd, String campid){
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.chregcd = chregcd;
		this.campid = campid;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public void setChregcd(String chregcd){
		this.chregcd = chregcd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
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

	public String getChregcd(){
		return this.chregcd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CAMPSTAT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CAMPSTATDM dm = (SS_L_CAMPSTATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.pageno);
		cstmt.setLong(4, dm.pagesize);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.partcd);
		cstmt.setString(7, dm.areacd);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.chregcd);
		cstmt.setString(10, dm.campid);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_CAMPSTATDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String chregcd = req.getParameter("chregcd");
if( chregcd == null){
	System.out.println(this.toString+" : chregcd is null" );
}else{
	System.out.println(this.toString+" : chregcd is "+chregcd );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String chregcd = Util.checkString(req.getParameter("chregcd"));
String campid = Util.checkString(req.getParameter("campid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String chregcd = Util.Uni2Ksc(Util.checkString(req.getParameter("chregcd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setChregcd(chregcd);
dm.setCampid(campid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 25 14:09:02 KST 2009 */