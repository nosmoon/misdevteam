/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-가입현황-목록
* 작성일자 : 2009-04-09
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-상해보험-가입현황-목록
 */

public class SS_L_INSR_STCSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String cntryy;
	public long pageno;
	public long pagesize;

	public SS_L_INSR_STCSDM(){}
	public SS_L_INSR_STCSDM(String deptcd, String partcd, String areacd, String bocd, String cntryy, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.cntryy = cntryy;
		this.pageno = pageno;
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

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public String getCntryy(){
		return this.cntryy;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_INSR_STCS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_INSR_STCSDM dm = (SS_L_INSR_STCSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.cntryy);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_INSR_STCSDataSet();
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
String cntryy = req.getParameter("cntryy");
if( cntryy == null){
	System.out.println(this.toString+" : cntryy is null" );
}else{
	System.out.println(this.toString+" : cntryy is "+cntryy );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String cntryy = Util.checkString(req.getParameter("cntryy"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cntryy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryy")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setCntryy(cntryy);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 20:44:33 KST 2009 */