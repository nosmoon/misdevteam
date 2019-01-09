/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-Billing자동이체-신청확인통계-목록조회
* 작성일자 : 2009-04-13
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
 * 지국업무지원-Billing자동이체-신청확인통계-목록조회
 */

public class SS_L_SHFTAPLC_CNFM_STCSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String base_mon;
	public String resv1;
	public String resv2;
	public String resv3;
	public String resv4;
	public long pageno;
	public long pagesize;

	public SS_L_SHFTAPLC_CNFM_STCSDM(){}
	public SS_L_SHFTAPLC_CNFM_STCSDM(String deptcd, String partcd, String areacd, String bocd, String base_mon, String resv1, String resv2, String resv3, String resv4, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.base_mon = base_mon;
		this.resv1 = resv1;
		this.resv2 = resv2;
		this.resv3 = resv3;
		this.resv4 = resv4;
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

	public void setBase_mon(String base_mon){
		this.base_mon = base_mon;
	}

	public void setResv1(String resv1){
		this.resv1 = resv1;
	}

	public void setResv2(String resv2){
		this.resv2 = resv2;
	}

	public void setResv3(String resv3){
		this.resv3 = resv3;
	}

	public void setResv4(String resv4){
		this.resv4 = resv4;
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

	public String getBase_mon(){
		return this.base_mon;
	}

	public String getResv1(){
		return this.resv1;
	}

	public String getResv2(){
		return this.resv2;
	}

	public String getResv3(){
		return this.resv3;
	}

	public String getResv4(){
		return this.resv4;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTAPLC_CNFM_STCS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTAPLC_CNFM_STCSDM dm = (SS_L_SHFTAPLC_CNFM_STCSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.base_mon);
		cstmt.setString(8, dm.resv1);
		cstmt.setString(9, dm.resv2);
		cstmt.setString(10, dm.resv3);
		cstmt.setString(11, dm.resv4);
		cstmt.setLong(12, dm.pageno);
		cstmt.setLong(13, dm.pagesize);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFTAPLC_CNFM_STCSDataSet();
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
String base_mon = req.getParameter("base_mon");
if( base_mon == null){
	System.out.println(this.toString+" : base_mon is null" );
}else{
	System.out.println(this.toString+" : base_mon is "+base_mon );
}
String resv1 = req.getParameter("resv1");
if( resv1 == null){
	System.out.println(this.toString+" : resv1 is null" );
}else{
	System.out.println(this.toString+" : resv1 is "+resv1 );
}
String resv2 = req.getParameter("resv2");
if( resv2 == null){
	System.out.println(this.toString+" : resv2 is null" );
}else{
	System.out.println(this.toString+" : resv2 is "+resv2 );
}
String resv3 = req.getParameter("resv3");
if( resv3 == null){
	System.out.println(this.toString+" : resv3 is null" );
}else{
	System.out.println(this.toString+" : resv3 is "+resv3 );
}
String resv4 = req.getParameter("resv4");
if( resv4 == null){
	System.out.println(this.toString+" : resv4 is null" );
}else{
	System.out.println(this.toString+" : resv4 is "+resv4 );
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
String base_mon = Util.checkString(req.getParameter("base_mon"));
String resv1 = Util.checkString(req.getParameter("resv1"));
String resv2 = Util.checkString(req.getParameter("resv2"));
String resv3 = Util.checkString(req.getParameter("resv3"));
String resv4 = Util.checkString(req.getParameter("resv4"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String base_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("base_mon")));
String resv1 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv1")));
String resv2 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv2")));
String resv3 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv3")));
String resv4 = Util.Uni2Ksc(Util.checkString(req.getParameter("resv4")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBase_mon(base_mon);
dm.setResv1(resv1);
dm.setResv2(resv2);
dm.setResv3(resv3);
dm.setResv4(resv4);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 21:53:44 KST 2009 */