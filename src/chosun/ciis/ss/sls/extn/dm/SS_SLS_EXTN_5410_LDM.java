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


public class SS_SLS_EXTN_5410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fryymm;
	public String toyymm;
	public String incmgpers;
	public String cmpycd;
	public String extn_gb;

	public SS_SLS_EXTN_5410_LDM(){}
	public SS_SLS_EXTN_5410_LDM(String deptcd, String partcd, String areacd, String bocd, String fryymm, String toyymm, String incmgpers, String cmpycd, String extn_gb){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fryymm = fryymm;
		this.toyymm = toyymm;
		this.incmgpers = incmgpers;
		this.cmpycd = cmpycd;
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

	public void setFryymm(String fryymm){
		this.fryymm = fryymm;
	}

	public void setToyymm(String toyymm){
		this.toyymm = toyymm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
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

	public String getFryymm(){
		return this.fryymm;
	}

	public String getToyymm(){
		return this.toyymm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getExtn_gb(){
		return this.extn_gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5410_LDM dm = (SS_SLS_EXTN_5410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fryymm);
		cstmt.setString(8, dm.toyymm);
		cstmt.setString(9, dm.incmgpers);
		cstmt.setString(10, dm.cmpycd);
		cstmt.setString(11, dm.extn_gb);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fryymm = [" + getFryymm() + "]");
		System.out.println("toyymm = [" + getToyymm() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
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
String fryymm = req.getParameter("fryymm");
if( fryymm == null){
	System.out.println(this.toString+" : fryymm is null" );
}else{
	System.out.println(this.toString+" : fryymm is "+fryymm );
}
String toyymm = req.getParameter("toyymm");
if( toyymm == null){
	System.out.println(this.toString+" : toyymm is null" );
}else{
	System.out.println(this.toString+" : toyymm is "+toyymm );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
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
String fryymm = Util.checkString(req.getParameter("fryymm"));
String toyymm = Util.checkString(req.getParameter("toyymm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String extn_gb = Util.checkString(req.getParameter("extn_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fryymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fryymm")));
String toyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("toyymm")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String extn_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFryymm(fryymm);
dm.setToyymm(toyymm);
dm.setIncmgpers(incmgpers);
dm.setCmpycd(cmpycd);
dm.setExtn_gb(extn_gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 15:31:53 KST 2017 */