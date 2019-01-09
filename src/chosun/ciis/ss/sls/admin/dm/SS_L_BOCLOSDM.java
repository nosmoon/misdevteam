/***************************************************************************************************
* 파일명 : .java
* 기능 : *관리자-지국월마감-목록
* 작성일자 : 2009-04-27
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-지국월마감-목록
 */

public class SS_L_BOCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String yymm;
	public String closyn;
	public long pageno;
	public long pagesize;
	public String ext1;
	public String ext2;
	public String ext3;
	public String ext4;

	public SS_L_BOCLOSDM(){}
	public SS_L_BOCLOSDM(String deptcd, String partcd, String areacd, String bocd, String yymm, String closyn, long pageno, long pagesize, String ext1, String ext2, String ext3, String ext4){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.yymm = yymm;
		this.closyn = closyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.ext1 = ext1;
		this.ext2 = ext2;
		this.ext3 = ext3;
		this.ext4 = ext4;
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

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setExt1(String ext1){
		this.ext1 = ext1;
	}

	public void setExt2(String ext2){
		this.ext2 = ext2;
	}

	public void setExt3(String ext3){
		this.ext3 = ext3;
	}

	public void setExt4(String ext4){
		this.ext4 = ext4;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getExt1(){
		return this.ext1;
	}

	public String getExt2(){
		return this.ext2;
	}

	public String getExt3(){
		return this.ext3;
	}

	public String getExt4(){
		return this.ext4;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BOCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BOCLOSDM dm = (SS_L_BOCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.yymm);
		cstmt.setString(8, dm.closyn);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.setString(11, dm.ext1);
		cstmt.setString(12, dm.ext2);
		cstmt.setString(13, dm.ext3);
		cstmt.setString(14, dm.ext4);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_BOCLOSDataSet();
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
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
String ext1 = req.getParameter("ext1");
if( ext1 == null){
	System.out.println(this.toString+" : ext1 is null" );
}else{
	System.out.println(this.toString+" : ext1 is "+ext1 );
}
String ext2 = req.getParameter("ext2");
if( ext2 == null){
	System.out.println(this.toString+" : ext2 is null" );
}else{
	System.out.println(this.toString+" : ext2 is "+ext2 );
}
String ext3 = req.getParameter("ext3");
if( ext3 == null){
	System.out.println(this.toString+" : ext3 is null" );
}else{
	System.out.println(this.toString+" : ext3 is "+ext3 );
}
String ext4 = req.getParameter("ext4");
if( ext4 == null){
	System.out.println(this.toString+" : ext4 is null" );
}else{
	System.out.println(this.toString+" : ext4 is "+ext4 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String closyn = Util.checkString(req.getParameter("closyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String ext1 = Util.checkString(req.getParameter("ext1"));
String ext2 = Util.checkString(req.getParameter("ext2"));
String ext3 = Util.checkString(req.getParameter("ext3"));
String ext4 = Util.checkString(req.getParameter("ext4"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String ext1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext1")));
String ext2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext2")));
String ext3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext3")));
String ext4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext4")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setYymm(yymm);
dm.setClosyn(closyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setExt1(ext1);
dm.setExt2(ext2);
dm.setExt3(ext3);
dm.setExt4(ext4);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 19:49:27 KST 2009 */