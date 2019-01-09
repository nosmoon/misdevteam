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


package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 
 */


public class CO_L_ZIP_AGENCYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String addr3;
	public String zip;
	public String city_val;
	public String village_val;
	public String rdnm;
	public String bldgnm;
	public String bocd;
	public long pageno;
	public long pagesize;

	public CO_L_ZIP_AGENCYDM(){}
	public CO_L_ZIP_AGENCYDM(String addr3, String zip, String city_val, String village_val, String rdnm, String bldgnm, String bocd, long pageno, long pagesize){
		this.addr3 = addr3;
		this.zip = zip;
		this.city_val = city_val;
		this.village_val = village_val;
		this.rdnm = rdnm;
		this.bldgnm = bldgnm;
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setCity_val(String city_val){
		this.city_val = city_val;
	}

	public void setVillage_val(String village_val){
		this.village_val = village_val;
	}

	public void setRdnm(String rdnm){
		this.rdnm = rdnm;
	}

	public void setBldgnm(String bldgnm){
		this.bldgnm = bldgnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getCity_val(){
		return this.city_val;
	}

	public String getVillage_val(){
		return this.village_val;
	}

	public String getRdnm(){
		return this.rdnm;
	}

	public String getBldgnm(){
		return this.bldgnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_CO_L_ZIP_AGENCY(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_ZIP_AGENCYDM dm = (CO_L_ZIP_AGENCYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.addr3);
		cstmt.setString(4, dm.zip);
		cstmt.setString(5, dm.city_val);
		cstmt.setString(6, dm.village_val);
		cstmt.setString(7, dm.rdnm);
		cstmt.setString(8, dm.bldgnm);
		cstmt.setString(9, dm.bocd);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.CO_L_ZIP_AGENCYDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("addr3 = [" + getAddr3() + "]");
		System.out.println("zip = [" + getZip() + "]");
		System.out.println("city_val = [" + getCity_val() + "]");
		System.out.println("village_val = [" + getVillage_val() + "]");
		System.out.println("rdnm = [" + getRdnm() + "]");
		System.out.println("bldgnm = [" + getBldgnm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
String city_val = req.getParameter("city_val");
if( city_val == null){
	System.out.println(this.toString+" : city_val is null" );
}else{
	System.out.println(this.toString+" : city_val is "+city_val );
}
String village_val = req.getParameter("village_val");
if( village_val == null){
	System.out.println(this.toString+" : village_val is null" );
}else{
	System.out.println(this.toString+" : village_val is "+village_val );
}
String rdnm = req.getParameter("rdnm");
if( rdnm == null){
	System.out.println(this.toString+" : rdnm is null" );
}else{
	System.out.println(this.toString+" : rdnm is "+rdnm );
}
String bldgnm = req.getParameter("bldgnm");
if( bldgnm == null){
	System.out.println(this.toString+" : bldgnm is null" );
}else{
	System.out.println(this.toString+" : bldgnm is "+bldgnm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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

String addr3 = Util.checkString(req.getParameter("addr3"));
String zip = Util.checkString(req.getParameter("zip"));
String city_val = Util.checkString(req.getParameter("city_val"));
String village_val = Util.checkString(req.getParameter("village_val"));
String rdnm = Util.checkString(req.getParameter("rdnm"));
String bldgnm = Util.checkString(req.getParameter("bldgnm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String city_val = Util.Uni2Ksc(Util.checkString(req.getParameter("city_val")));
String village_val = Util.Uni2Ksc(Util.checkString(req.getParameter("village_val")));
String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm")));
String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAddr3(addr3);
dm.setZip(zip);
dm.setCity_val(city_val);
dm.setVillage_val(village_val);
dm.setRdnm(rdnm);
dm.setBldgnm(bldgnm);
dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 02 01:17:23 GMT 2013 */