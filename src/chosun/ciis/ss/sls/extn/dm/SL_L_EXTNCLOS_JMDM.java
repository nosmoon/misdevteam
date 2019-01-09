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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SL_L_EXTNCLOS_JMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String closmm;
	public String extntype1;
	public String extntype2;
	public String searchcd;
	public String ddremk;
	public String issuspyn;
	public String bocfmyn;
	public String ddcfmyn;
	public long pageno;
	public long pagesize;
	public String common_deptcd;
	public String common_partcd;
	public String common_areacd;

	public SL_L_EXTNCLOS_JMDM(){}
	public SL_L_EXTNCLOS_JMDM(String deptcd, String partcd, String areacd, String bocd, String closmm, String extntype1, String extntype2, String searchcd, String ddremk, String issuspyn, String bocfmyn, String ddcfmyn, long pageno, long pagesize, String common_deptcd, String common_partcd, String common_areacd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.closmm = closmm;
		this.extntype1 = extntype1;
		this.extntype2 = extntype2;
		this.searchcd = searchcd;
		this.ddremk = ddremk;
		this.issuspyn = issuspyn;
		this.bocfmyn = bocfmyn;
		this.ddcfmyn = ddcfmyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.common_deptcd = common_deptcd;
		this.common_partcd = common_partcd;
		this.common_areacd = common_areacd;
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

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setExtntype1(String extntype1){
		this.extntype1 = extntype1;
	}

	public void setExtntype2(String extntype2){
		this.extntype2 = extntype2;
	}

	public void setSearchcd(String searchcd){
		this.searchcd = searchcd;
	}

	public void setDdremk(String ddremk){
		this.ddremk = ddremk;
	}

	public void setIssuspyn(String issuspyn){
		this.issuspyn = issuspyn;
	}

	public void setBocfmyn(String bocfmyn){
		this.bocfmyn = bocfmyn;
	}

	public void setDdcfmyn(String ddcfmyn){
		this.ddcfmyn = ddcfmyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setCommon_deptcd(String common_deptcd){
		this.common_deptcd = common_deptcd;
	}

	public void setCommon_partcd(String common_partcd){
		this.common_partcd = common_partcd;
	}

	public void setCommon_areacd(String common_areacd){
		this.common_areacd = common_areacd;
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

	public String getClosmm(){
		return this.closmm;
	}

	public String getExtntype1(){
		return this.extntype1;
	}

	public String getExtntype2(){
		return this.extntype2;
	}

	public String getSearchcd(){
		return this.searchcd;
	}

	public String getDdremk(){
		return this.ddremk;
	}

	public String getIssuspyn(){
		return this.issuspyn;
	}

	public String getBocfmyn(){
		return this.bocfmyn;
	}

	public String getDdcfmyn(){
		return this.ddcfmyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getCommon_deptcd(){
		return this.common_deptcd;
	}

	public String getCommon_partcd(){
		return this.common_partcd;
	}

	public String getCommon_areacd(){
		return this.common_areacd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_EXTNCLOS_JM(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_EXTNCLOS_JMDM dm = (SL_L_EXTNCLOS_JMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.closmm);
		cstmt.setString(8, dm.extntype1);
		cstmt.setString(9, dm.extntype2);
		cstmt.setString(10, dm.searchcd);
		cstmt.setString(11, dm.ddremk);
		cstmt.setString(12, dm.issuspyn);
		cstmt.setString(13, dm.bocfmyn);
		cstmt.setString(14, dm.ddcfmyn);
		cstmt.setLong(15, dm.pageno);
		cstmt.setLong(16, dm.pagesize);
		cstmt.setString(17, dm.common_deptcd);
		cstmt.setString(18, dm.common_partcd);
		cstmt.setString(19, dm.common_areacd);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_EXTNCLOS_JMDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("extntype1 = [" + getExtntype1() + "]");
		System.out.println("extntype2 = [" + getExtntype2() + "]");
		System.out.println("searchcd = [" + getSearchcd() + "]");
		System.out.println("ddremk = [" + getDdremk() + "]");
		System.out.println("issuspyn = [" + getIssuspyn() + "]");
		System.out.println("bocfmyn = [" + getBocfmyn() + "]");
		System.out.println("ddcfmyn = [" + getDdcfmyn() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
		System.out.println("common_deptcd = [" + getCommon_deptcd() + "]");
		System.out.println("common_partcd = [" + getCommon_partcd() + "]");
		System.out.println("common_areacd = [" + getCommon_areacd() + "]");
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
String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String extntype1 = req.getParameter("extntype1");
if( extntype1 == null){
	System.out.println(this.toString+" : extntype1 is null" );
}else{
	System.out.println(this.toString+" : extntype1 is "+extntype1 );
}
String extntype2 = req.getParameter("extntype2");
if( extntype2 == null){
	System.out.println(this.toString+" : extntype2 is null" );
}else{
	System.out.println(this.toString+" : extntype2 is "+extntype2 );
}
String searchcd = req.getParameter("searchcd");
if( searchcd == null){
	System.out.println(this.toString+" : searchcd is null" );
}else{
	System.out.println(this.toString+" : searchcd is "+searchcd );
}
String ddremk = req.getParameter("ddremk");
if( ddremk == null){
	System.out.println(this.toString+" : ddremk is null" );
}else{
	System.out.println(this.toString+" : ddremk is "+ddremk );
}
String issuspyn = req.getParameter("issuspyn");
if( issuspyn == null){
	System.out.println(this.toString+" : issuspyn is null" );
}else{
	System.out.println(this.toString+" : issuspyn is "+issuspyn );
}
String bocfmyn = req.getParameter("bocfmyn");
if( bocfmyn == null){
	System.out.println(this.toString+" : bocfmyn is null" );
}else{
	System.out.println(this.toString+" : bocfmyn is "+bocfmyn );
}
String ddcfmyn = req.getParameter("ddcfmyn");
if( ddcfmyn == null){
	System.out.println(this.toString+" : ddcfmyn is null" );
}else{
	System.out.println(this.toString+" : ddcfmyn is "+ddcfmyn );
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
String common_deptcd = req.getParameter("common_deptcd");
if( common_deptcd == null){
	System.out.println(this.toString+" : common_deptcd is null" );
}else{
	System.out.println(this.toString+" : common_deptcd is "+common_deptcd );
}
String common_partcd = req.getParameter("common_partcd");
if( common_partcd == null){
	System.out.println(this.toString+" : common_partcd is null" );
}else{
	System.out.println(this.toString+" : common_partcd is "+common_partcd );
}
String common_areacd = req.getParameter("common_areacd");
if( common_areacd == null){
	System.out.println(this.toString+" : common_areacd is null" );
}else{
	System.out.println(this.toString+" : common_areacd is "+common_areacd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String closmm = Util.checkString(req.getParameter("closmm"));
String extntype1 = Util.checkString(req.getParameter("extntype1"));
String extntype2 = Util.checkString(req.getParameter("extntype2"));
String searchcd = Util.checkString(req.getParameter("searchcd"));
String ddremk = Util.checkString(req.getParameter("ddremk"));
String issuspyn = Util.checkString(req.getParameter("issuspyn"));
String bocfmyn = Util.checkString(req.getParameter("bocfmyn"));
String ddcfmyn = Util.checkString(req.getParameter("ddcfmyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String common_deptcd = Util.checkString(req.getParameter("common_deptcd"));
String common_partcd = Util.checkString(req.getParameter("common_partcd"));
String common_areacd = Util.checkString(req.getParameter("common_areacd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String extntype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntype1")));
String extntype2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntype2")));
String searchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("searchcd")));
String ddremk = Util.Uni2Ksc(Util.checkString(req.getParameter("ddremk")));
String issuspyn = Util.Uni2Ksc(Util.checkString(req.getParameter("issuspyn")));
String bocfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocfmyn")));
String ddcfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("ddcfmyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String common_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_deptcd")));
String common_partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_partcd")));
String common_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_areacd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setClosmm(closmm);
dm.setExtntype1(extntype1);
dm.setExtntype2(extntype2);
dm.setSearchcd(searchcd);
dm.setDdremk(ddremk);
dm.setIssuspyn(issuspyn);
dm.setBocfmyn(bocfmyn);
dm.setDdcfmyn(ddcfmyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setCommon_deptcd(common_deptcd);
dm.setCommon_partcd(common_partcd);
dm.setCommon_areacd(common_areacd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 01 15:19:42 KST 2015 */