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


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_L_BSNSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String sendplacnm;
	public String fromdate;
	public String todate;

	public SS_L_BSNSDM(){}
	public SS_L_BSNSDM(String deptcd, String partcd, String areacd, String bocd, String sendplacnm, String fromdate, String todate){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.sendplacnm = sendplacnm;
		this.fromdate = fromdate;
		this.todate = todate;
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

	public void setSendplacnm(String sendplacnm){
		this.sendplacnm = sendplacnm;
	}

	public void setFromdate(String fromdate){
		this.fromdate = fromdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
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

	public String getSendplacnm(){
		return this.sendplacnm;
	}

	public String getFromdate(){
		return this.fromdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_BSNS(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BSNSDM dm = (SS_L_BSNSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.sendplacnm);
		cstmt.setString(8, dm.fromdate);
		cstmt.setString(9, dm.todate);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_L_BSNSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("sendplacnm = [" + getSendplacnm() + "]");
		System.out.println("fromdate = [" + getFromdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
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
String sendplacnm = req.getParameter("sendplacnm");
if( sendplacnm == null){
	System.out.println(this.toString+" : sendplacnm is null" );
}else{
	System.out.println(this.toString+" : sendplacnm is "+sendplacnm );
}
String fromdate = req.getParameter("fromdate");
if( fromdate == null){
	System.out.println(this.toString+" : fromdate is null" );
}else{
	System.out.println(this.toString+" : fromdate is "+fromdate );
}
String todate = req.getParameter("todate");
if( todate == null){
	System.out.println(this.toString+" : todate is null" );
}else{
	System.out.println(this.toString+" : todate is "+todate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String sendplacnm = Util.checkString(req.getParameter("sendplacnm"));
String fromdate = Util.checkString(req.getParameter("fromdate"));
String todate = Util.checkString(req.getParameter("todate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String sendplacnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sendplacnm")));
String fromdate = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setSendplacnm(sendplacnm);
dm.setFromdate(fromdate);
dm.setTodate(todate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 08 15:46:56 KST 2010 */