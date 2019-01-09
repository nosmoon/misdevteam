/***************************************************************************************************
* 파일명 : SS_L_CLAM_SSUMDM.java
* 기능 : 지국업무지원-Billing자동이체-청구결과관리-지국별청구결과요약
* 작성일자 : 2004-04-15
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-청구결과관리-지국별청구결과요약
 *
 */


public class SS_L_CLAM_SSUMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String f_basidt;
	public String t_basidt;
	public String areacd;
	public String bocd;
	public String erryn;
	public long pageno;
	public long pagesize;

	public SS_L_CLAM_SSUMDM(){}
	public SS_L_CLAM_SSUMDM(String f_basidt, String t_basidt, String areacd, String bocd, String erryn, long pageno, long pagesize){
		this.f_basidt = f_basidt;
		this.t_basidt = t_basidt;
		this.areacd = areacd;
		this.bocd = bocd;
		this.erryn = erryn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setF_basidt(String f_basidt){
		this.f_basidt = f_basidt;
	}

	public void setT_basidt(String t_basidt){
		this.t_basidt = t_basidt;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getF_basidt(){
		return this.f_basidt;
	}

	public String getT_basidt(){
		return this.t_basidt;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getErryn(){
		return this.erryn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CLAM_SSUM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CLAM_SSUMDM dm = (SS_L_CLAM_SSUMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.f_basidt);
		cstmt.setString(4, dm.t_basidt);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.erryn);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_CLAM_SSUMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String f_basidt = req.getParameter("f_basidt");
if( f_basidt == null){
	System.out.println(this.toString+" : f_basidt is null" );
}else{
	System.out.println(this.toString+" : f_basidt is "+f_basidt );
}
String t_basidt = req.getParameter("t_basidt");
if( t_basidt == null){
	System.out.println(this.toString+" : t_basidt is null" );
}else{
	System.out.println(this.toString+" : t_basidt is "+t_basidt );
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
String erryn = req.getParameter("erryn");
if( erryn == null){
	System.out.println(this.toString+" : erryn is null" );
}else{
	System.out.println(this.toString+" : erryn is "+erryn );
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

String f_basidt = Util.checkString(req.getParameter("f_basidt"));
String t_basidt = Util.checkString(req.getParameter("t_basidt"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String erryn = Util.checkString(req.getParameter("erryn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String f_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("f_basidt")));
String t_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("t_basidt")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String erryn = Util.Uni2Ksc(Util.checkString(req.getParameter("erryn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setF_basidt(f_basidt);
dm.setT_basidt(t_basidt);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setErryn(erryn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 15 15:37:28 KST 2004 */