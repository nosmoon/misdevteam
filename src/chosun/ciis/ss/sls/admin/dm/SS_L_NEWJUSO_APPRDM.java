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


public class SS_L_NEWJUSO_APPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String zipcode;
	public String areagubun;
	public String areaname;
	public String rdnm;
	public String bldgnm;
	public String bocd;
	public String dealdeptcd;
	public String appryn;

	public SS_L_NEWJUSO_APPRDM(){}
	public SS_L_NEWJUSO_APPRDM(String zipcode, String areagubun, String areaname, String rdnm, String bldgnm, String bocd, String dealdeptcd, String appryn){
		this.zipcode = zipcode;
		this.areagubun = areagubun;
		this.areaname = areaname;
		this.rdnm = rdnm;
		this.bldgnm = bldgnm;
		this.bocd = bocd;
		this.dealdeptcd = dealdeptcd;
		this.appryn = appryn;
	}

	public String getDealdeptcd() {
		return dealdeptcd;
	}
	
	public void setDealdeptcd(String dealdeptcd) {
		this.dealdeptcd = dealdeptcd;
	}
	
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAreagubun(String areagubun){
		this.areagubun = areagubun;
	}

	public void setAreaname(String areaname){
		this.areaname = areaname;
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

	public void setAppryn(String appryn){
		this.appryn = appryn;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAreagubun(){
		return this.areagubun;
	}

	public String getAreaname(){
		return this.areaname;
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

	public String getAppryn(){
		return this.appryn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_NEWJUSO_APPR(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NEWJUSO_APPRDM dm = (SS_L_NEWJUSO_APPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.zipcode);
		cstmt.setString(4, dm.areagubun);
		cstmt.setString(5, dm.areaname);
		cstmt.setString(6, dm.rdnm);
		cstmt.setString(7, dm.bldgnm);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.dealdeptcd);
		cstmt.setString(10, dm.appryn);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_NEWJUSO_APPRDataSet();
	}

	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("areagubun = [" + getAreagubun() + "]");
		System.out.println("areaname = [" + getAreaname() + "]");
		System.out.println("rdnm = [" + getRdnm() + "]");
		System.out.println("bldgnm = [" + getBldgnm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("useyn = [" + getDealdeptcd() + "]");
		System.out.println("appryn = [" + getAppryn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String areagubun = req.getParameter("areagubun");
if( areagubun == null){
	System.out.println(this.toString+" : areagubun is null" );
}else{
	System.out.println(this.toString+" : areagubun is "+areagubun );
}
String areaname = req.getParameter("areaname");
if( areaname == null){
	System.out.println(this.toString+" : areaname is null" );
}else{
	System.out.println(this.toString+" : areaname is "+areaname );
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
String useyn = req.getParameter("useyn");
if( useyn == null){
	System.out.println(this.toString+" : useyn is null" );
}else{
	System.out.println(this.toString+" : useyn is "+useyn );
}
String appryn = req.getParameter("appryn");
if( appryn == null){
	System.out.println(this.toString+" : appryn is null" );
}else{
	System.out.println(this.toString+" : appryn is "+appryn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String zipcode = Util.checkString(req.getParameter("zipcode"));
String areagubun = Util.checkString(req.getParameter("areagubun"));
String areaname = Util.checkString(req.getParameter("areaname"));
String rdnm = Util.checkString(req.getParameter("rdnm"));
String bldgnm = Util.checkString(req.getParameter("bldgnm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String useyn = Util.checkString(req.getParameter("useyn"));
String appryn = Util.checkString(req.getParameter("appryn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String areagubun = Util.Uni2Ksc(Util.checkString(req.getParameter("areagubun")));
String areaname = Util.Uni2Ksc(Util.checkString(req.getParameter("areaname")));
String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm")));
String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String useyn = Util.Uni2Ksc(Util.checkString(req.getParameter("useyn")));
String appryn = Util.Uni2Ksc(Util.checkString(req.getParameter("appryn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setZipcode(zipcode);
dm.setAreagubun(areagubun);
dm.setAreaname(areaname);
dm.setRdnm(rdnm);
dm.setBldgnm(bldgnm);
dm.setBocd(bocd);
dm.setUseyn(useyn);
dm.setAppryn(appryn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 22 04:51:55 GMT 2013 */