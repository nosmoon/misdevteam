/***************************************************************************************************
* 파일명 : SS_MO_L_BSNSDM.java
* 기능 :  판매-발송관리-마감관리-발송노선 조회_모바일용
* 작성일자 : 2016-12-28
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 발송처코드로 조회할 수 있게 추가
* 수정자 : 장선희
* 수정일자 : 2017-08-28
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


public class SS_MO_S_BSNSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String areacd;
	public String route_clsf;
	public String fromdate;
	public String todate;
	public String bocd;
	public String send_plac_seq;

	public SS_MO_S_BSNSDM(){}
	public SS_MO_S_BSNSDM(String areacd, String route_clsf, String fromdate, String todate, String bocd, String send_plac_seq){
		this.areacd = areacd;
		this.route_clsf = route_clsf;
		this.fromdate = fromdate;
		this.todate = todate;
		this.bocd = bocd;
		this.send_plac_seq = send_plac_seq;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setFromdate(String fromdate){
		this.fromdate = fromdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getFromdate(){
		return this.fromdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_MO_S_BSNS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_S_BSNSDM dm = (SS_MO_S_BSNSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.areacd);
		cstmt.setString(4, dm.route_clsf);
		cstmt.setString(5, dm.fromdate);
		cstmt.setString(6, dm.todate);
		cstmt.setString(7, dm.bocd);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.send_plac_seq);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_MO_S_BSNSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("fromdate = [" + getFromdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("send_plac_seq = [" + getSend_plac_seq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String areacd = Util.checkString(req.getParameter("areacd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String fromdate = Util.checkString(req.getParameter("fromdate"));
String todate = Util.checkString(req.getParameter("todate"));
String bocd = Util.checkString(req.getParameter("bocd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String fromdate = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAreacd(areacd);
dm.setRoute_clsf(route_clsf);
dm.setFromdate(fromdate);
dm.setTodate(todate);
dm.setBocd(bocd);
dm.setSend_plac_seq(send_plac_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 28 09:51:30 KST 2017 */