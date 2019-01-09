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


public class SS_SLS_EXTN_4620_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromdt;
	public String todt;
	public String extnnm;
	public String rdrnm;
	public String dncomp;
	public String extn_gb;

	public SS_SLS_EXTN_4620_LDM(){}
	public SS_SLS_EXTN_4620_LDM(String deptcd, String partcd, String areacd, String bocd, String fromdt, String todt, String extnnm, String rdrnm, String dncomp, String extn_gb){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromdt = fromdt;
		this.todt = todt;
		this.extnnm = extnnm;
		this.rdrnm = rdrnm;
		this.dncomp = dncomp;
		this.extn_gb = extn_gb;
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

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setExtn_gb(String extn_gb){
		this.extn_gb = extn_gb;
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

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getExtn_gb(){
		return this.extn_gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4620_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4620_LDM dm = (SS_SLS_EXTN_4620_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.extnnm);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setString(11, dm.dncomp);
		cstmt.setString(12, dm.extn_gb);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4620_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fromdt = [" + getFromdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("extnnm = [" + getExtnnm() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("dncomp = [" + getDncomp() + "]");
		System.out.println("extn_gb = [" + getExtn_gb() + "]");
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
String extnnm = req.getParameter("extnnm");
if( extnnm == null){
	System.out.println(this.toString+" : extnnm is null" );
}else{
	System.out.println(this.toString+" : extnnm is "+extnnm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String dncomp = req.getParameter("dncomp");
if( dncomp == null){
	System.out.println(this.toString+" : dncomp is null" );
}else{
	System.out.println(this.toString+" : dncomp is "+dncomp );
}
String extn_gb = req.getParameter("extn_gb");
if( extn_gb == null){
	System.out.println(this.toString+" : extn_gb is null" );
}else{
	System.out.println(this.toString+" : extn_gb is "+extn_gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String extnnm = Util.checkString(req.getParameter("extnnm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String dncomp = Util.checkString(req.getParameter("dncomp"));
String extn_gb = Util.checkString(req.getParameter("extn_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
String extn_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setExtnnm(extnnm);
dm.setRdrnm(rdrnm);
dm.setDncomp(dncomp);
dm.setExtn_gb(extn_gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 10 11:34:17 KST 2017 */