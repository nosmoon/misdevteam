/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매국-지국지원-컴퓨터AS
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */

public class SS_L_ASREQDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String buseo;
	public String jycd;
	public String bocd;
	public long pageno;
	public long pagesize;
	public String dt_kind;
	public String search_dt1;
	public String search_dt2;
	public String as_stat;

	public SS_L_ASREQDM(){}
	public SS_L_ASREQDM(String buseo, String jycd, String bocd, long pageno, long pagesize, String dt_kind, String search_dt1, String search_dt2, String as_stat){
		this.buseo = buseo;
		this.jycd = jycd;
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.dt_kind = dt_kind;
		this.search_dt1 = search_dt1;
		this.search_dt2 = search_dt2;
		this.as_stat = as_stat;
	}

	public void setBuseo(String buseo){
		this.buseo = buseo;
	}

	public void setJycd(String jycd){
		this.jycd = jycd;
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

	public void setDt_kind(String dt_kind){
		this.dt_kind = dt_kind;
	}

	public void setSearch_dt1(String search_dt1){
		this.search_dt1 = search_dt1;
	}

	public void setSearch_dt2(String search_dt2){
		this.search_dt2 = search_dt2;
	}

	public void setAs_stat(String as_stat){
		this.as_stat = as_stat;
	}

	public String getBuseo(){
		return this.buseo;
	}

	public String getJycd(){
		return this.jycd;
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

	public String getDt_kind(){
		return this.dt_kind;
	}

	public String getSearch_dt1(){
		return this.search_dt1;
	}

	public String getSearch_dt2(){
		return this.search_dt2;
	}

	public String getAs_stat(){
		return this.as_stat;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_ASREQ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ASREQDM dm = (SS_L_ASREQDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.buseo);
		cstmt.setString(4, dm.jycd);
		cstmt.setString(5, dm.bocd);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.setString(8, dm.dt_kind);
		cstmt.setString(9, dm.search_dt1);
		cstmt.setString(10, dm.search_dt2);
		cstmt.setString(11, dm.as_stat);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_ASREQDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String buseo = req.getParameter("buseo");
if( buseo == null){
	System.out.println(this.toString+" : buseo is null" );
}else{
	System.out.println(this.toString+" : buseo is "+buseo );
}
String jycd = req.getParameter("jycd");
if( jycd == null){
	System.out.println(this.toString+" : jycd is null" );
}else{
	System.out.println(this.toString+" : jycd is "+jycd );
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
String dt_kind = req.getParameter("dt_kind");
if( dt_kind == null){
	System.out.println(this.toString+" : dt_kind is null" );
}else{
	System.out.println(this.toString+" : dt_kind is "+dt_kind );
}
String search_dt1 = req.getParameter("search_dt1");
if( search_dt1 == null){
	System.out.println(this.toString+" : search_dt1 is null" );
}else{
	System.out.println(this.toString+" : search_dt1 is "+search_dt1 );
}
String search_dt2 = req.getParameter("search_dt2");
if( search_dt2 == null){
	System.out.println(this.toString+" : search_dt2 is null" );
}else{
	System.out.println(this.toString+" : search_dt2 is "+search_dt2 );
}
String as_stat = req.getParameter("as_stat");
if( as_stat == null){
	System.out.println(this.toString+" : as_stat is null" );
}else{
	System.out.println(this.toString+" : as_stat is "+as_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String buseo = Util.checkString(req.getParameter("buseo"));
String jycd = Util.checkString(req.getParameter("jycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String dt_kind = Util.checkString(req.getParameter("dt_kind"));
String search_dt1 = Util.checkString(req.getParameter("search_dt1"));
String search_dt2 = Util.checkString(req.getParameter("search_dt2"));
String as_stat = Util.checkString(req.getParameter("as_stat"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String buseo = Util.Uni2Ksc(Util.checkString(req.getParameter("buseo")));
String jycd = Util.Uni2Ksc(Util.checkString(req.getParameter("jycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String dt_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_kind")));
String search_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt1")));
String search_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt2")));
String as_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("as_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBuseo(buseo);
dm.setJycd(jycd);
dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setDt_kind(dt_kind);
dm.setSearch_dt1(search_dt1);
dm.setSearch_dt2(search_dt2);
dm.setAs_stat(as_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 12 16:24:16 KST 2004 */