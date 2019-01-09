/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class SS_SLS_EXTN_4210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String yymm;
	public String rdr_extntype1;
	public String resitype;
	public String bns_itemnm;
	public String svcmm;
	public String clamtmthd;

	public SS_SLS_EXTN_4210_LDM(){}
	public SS_SLS_EXTN_4210_LDM(String deptcd, String partcd, String areacd, String bocd, String yymm, String rdr_extntype1, String resitype, String bns_itemnm, String svcmm, String clamtmthd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.yymm = yymm;
		this.rdr_extntype1 = rdr_extntype1;
		this.resitype = resitype;
		this.bns_itemnm = bns_itemnm;
		this.svcmm = svcmm;
		this.clamtmthd = clamtmthd;
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

	public void setRdr_extntype1(String rdr_extntype1){
		this.rdr_extntype1 = rdr_extntype1;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setSvcmm(String svcmm){
		this.svcmm = svcmm;
	}

	public void setClamtmthd(String clamtmthd){
		this.clamtmthd = clamtmthd;
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

	public String getRdr_extntype1(){
		return this.rdr_extntype1;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getSvcmm(){
		return this.svcmm;
	}

	public String getClamtmthd(){
		return this.clamtmthd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4210_LDM dm = (SS_SLS_EXTN_4210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.yymm);
		cstmt.setString(8, dm.rdr_extntype1);
		cstmt.setString(9, dm.resitype);
		cstmt.setString(10, dm.bns_itemnm);
		cstmt.setString(11, dm.svcmm);
		cstmt.setString(12, dm.clamtmthd);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("rdr_extntype1 = [" + getRdr_extntype1() + "]");
		System.out.println("resitype = [" + getResitype() + "]");
		System.out.println("bns_itemnm = [" + getBns_itemnm() + "]");
		System.out.println("svcmm = [" + getSvcmm() + "]");
		System.out.println("clamtmthd = [" + getClamtmthd() + "]");
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
String rdr_extntype1 = req.getParameter("rdr_extntype1");
if( rdr_extntype1 == null){
	System.out.println(this.toString+" : rdr_extntype1 is null" );
}else{
	System.out.println(this.toString+" : rdr_extntype1 is "+rdr_extntype1 );
}
String resitype = req.getParameter("resitype");
if( resitype == null){
	System.out.println(this.toString+" : resitype is null" );
}else{
	System.out.println(this.toString+" : resitype is "+resitype );
}
String bns_itemnm = req.getParameter("bns_itemnm");
if( bns_itemnm == null){
	System.out.println(this.toString+" : bns_itemnm is null" );
}else{
	System.out.println(this.toString+" : bns_itemnm is "+bns_itemnm );
}
String svcmm = req.getParameter("svcmm");
if( svcmm == null){
	System.out.println(this.toString+" : svcmm is null" );
}else{
	System.out.println(this.toString+" : svcmm is "+svcmm );
}
String clamtmthd = req.getParameter("clamtmthd");
if( clamtmthd == null){
	System.out.println(this.toString+" : clamtmthd is null" );
}else{
	System.out.println(this.toString+" : clamtmthd is "+clamtmthd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String rdr_extntype1 = Util.checkString(req.getParameter("rdr_extntype1"));
String resitype = Util.checkString(req.getParameter("resitype"));
String bns_itemnm = Util.checkString(req.getParameter("bns_itemnm"));
String svcmm = Util.checkString(req.getParameter("svcmm"));
String clamtmthd = Util.checkString(req.getParameter("clamtmthd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String rdr_extntype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntype1")));
String resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("resitype")));
String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm")));
String svcmm = Util.Uni2Ksc(Util.checkString(req.getParameter("svcmm")));
String clamtmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setYymm(yymm);
dm.setRdr_extntype1(rdr_extntype1);
dm.setResitype(resitype);
dm.setBns_itemnm(bns_itemnm);
dm.setSvcmm(svcmm);
dm.setClamtmthd(clamtmthd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 14 18:16:28 KST 2017 */