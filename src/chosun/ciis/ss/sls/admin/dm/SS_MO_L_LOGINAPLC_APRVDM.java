/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINAPLC_APRVDM.java
* 기능 : 관리자-모바일관리-로그인승인신청리스트를 위한 DM
* 작성일자 : 2016-09-22
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 컬럼명변경으로인한 수정 및 센터명으로 조회할 수 있도록 추가
* 수정자 : 장선희
* 수정일자 : 2017-01-20 마감 42분전!!
* 백업 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 현임여부, ciis휴대번호(센터대표일때만) 추가
* 수정자 : 장선희
* 수정일자 : 2017-07-05
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 */


public class SS_MO_L_LOGINAPLC_APRVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String bonm;
	public String maprvstatcd;
	public String flnm;
	public String boemp_id;
	public String ptph;
	public String dutycd;
	public String mblockyn;
	public long pageno;
	public long pagesize;

	public SS_MO_L_LOGINAPLC_APRVDM(){}
	public SS_MO_L_LOGINAPLC_APRVDM(String deptcd, String partcd, String areacd, String bocd, String bonm, String maprvstatcd, String flnm, String boemp_id, String ptph, String dutycd, String mblockyn, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.bonm = bonm;
		this.maprvstatcd = maprvstatcd;
		this.flnm = flnm;
		this.boemp_id = boemp_id;
		this.ptph = ptph;
		this.dutycd = dutycd;
		this.mblockyn = mblockyn;
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

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMaprvstatcd(String maprvstatcd){
		this.maprvstatcd = maprvstatcd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setPtph(String ptph){
		this.ptph = ptph;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setMblockyn(String mblockyn){
		this.mblockyn = mblockyn;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getMaprvstatcd(){
		return this.maprvstatcd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getPtph(){
		return this.ptph;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public String getMblockyn(){
		return this.mblockyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_MO_L_LOGINAPLC_APRV(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_L_LOGINAPLC_APRVDM dm = (SS_MO_L_LOGINAPLC_APRVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.bonm);
		cstmt.setString(8, dm.maprvstatcd);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.boemp_id);
		cstmt.setString(11, dm.ptph);
		cstmt.setString(12, dm.dutycd);
		cstmt.setString(13, dm.mblockyn);
		cstmt.setLong(14, dm.pageno);
		cstmt.setLong(15, dm.pagesize);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_MO_L_LOGINAPLC_APRVDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("bonm = [" + getBonm() + "]");
		System.out.println("maprvstatcd = [" + getMaprvstatcd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("boemp_id = [" + getBoemp_id() + "]");
		System.out.println("ptph = [" + getPtph() + "]");
		System.out.println("dutycd = [" + getDutycd() + "]");
		System.out.println("mblockyn = [" + getMblockyn() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
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
String bonm = req.getParameter("bonm");
if( bonm == null){
	System.out.println(this.toString+" : bonm is null" );
}else{
	System.out.println(this.toString+" : bonm is "+bonm );
}
String maprvstatcd = req.getParameter("maprvstatcd");
if( maprvstatcd == null){
	System.out.println(this.toString+" : maprvstatcd is null" );
}else{
	System.out.println(this.toString+" : maprvstatcd is "+maprvstatcd );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String boemp_id = req.getParameter("boemp_id");
if( boemp_id == null){
	System.out.println(this.toString+" : boemp_id is null" );
}else{
	System.out.println(this.toString+" : boemp_id is "+boemp_id );
}
String ptph = req.getParameter("ptph");
if( ptph == null){
	System.out.println(this.toString+" : ptph is null" );
}else{
	System.out.println(this.toString+" : ptph is "+ptph );
}
String dutycd = req.getParameter("dutycd");
if( dutycd == null){
	System.out.println(this.toString+" : dutycd is null" );
}else{
	System.out.println(this.toString+" : dutycd is "+dutycd );
}
String mblockyn = req.getParameter("mblockyn");
if( mblockyn == null){
	System.out.println(this.toString+" : mblockyn is null" );
}else{
	System.out.println(this.toString+" : mblockyn is "+mblockyn );
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
String bonm = Util.checkString(req.getParameter("bonm"));
String maprvstatcd = Util.checkString(req.getParameter("maprvstatcd"));
String flnm = Util.checkString(req.getParameter("flnm"));
String boemp_id = Util.checkString(req.getParameter("boemp_id"));
String ptph = Util.checkString(req.getParameter("ptph"));
String dutycd = Util.checkString(req.getParameter("dutycd"));
String mblockyn = Util.checkString(req.getParameter("mblockyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
String maprvstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("maprvstatcd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String boemp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_id")));
String ptph = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph")));
String dutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("dutycd")));
String mblockyn = Util.Uni2Ksc(Util.checkString(req.getParameter("mblockyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBonm(bonm);
dm.setMaprvstatcd(maprvstatcd);
dm.setFlnm(flnm);
dm.setBoemp_id(boemp_id);
dm.setPtph(ptph);
dm.setDutycd(dutycd);
dm.setMblockyn(mblockyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 13 11:08:57 KST 2017 */