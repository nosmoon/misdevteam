/***************************************************************************************************
 * 파일명   : SP_SS_L_COMM_APT_THRW.java
 * 기능     : 판매국-지국경영 아파트 투입현황 조사및 등록(조사내역조회)
 * 작성일자 : 2006/07/13
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_L_COMM_APT_THRW
**/

public class SS_L_COMM_APT_THRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public long pageno;
	public long pagesize;
	public String invsgdt1;
	public String invsgdt2;
	public String addrcd;
	public String jobcdset;

	public SS_L_COMM_APT_THRWDM(){}
	public SS_L_COMM_APT_THRWDM(String bocd, long pageno, long pagesize, String invsgdt1, String invsgdt2, String addrcd, String jobcdset){
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.invsgdt1 = invsgdt1;
		this.invsgdt2 = invsgdt2;
		this.addrcd = addrcd;
		this.jobcdset = jobcdset;
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

	public void setInvsgdt1(String invsgdt1){
		this.invsgdt1 = invsgdt1;
	}

	public void setInvsgdt2(String invsgdt2){
		this.invsgdt2 = invsgdt2;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setJobcdset(String jobcdset){
		this.jobcdset = jobcdset;
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

	public String getInvsgdt1(){
		return this.invsgdt1;
	}

	public String getInvsgdt2(){
		return this.invsgdt2;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getJobcdset(){
		return this.jobcdset;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_COMM_APT_THRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_COMM_APT_THRWDM dm = (SS_L_COMM_APT_THRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.setString(6, dm.invsgdt1);
		cstmt.setString(7, dm.invsgdt2);
		cstmt.setString(8, dm.addrcd);
		cstmt.setString(9, dm.jobcdset);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_COMM_APT_THRWDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String invsgdt1 = req.getParameter("invsgdt1");
if( invsgdt1 == null){
	System.out.println(this.toString+" : invsgdt1 is null" );
}else{
	System.out.println(this.toString+" : invsgdt1 is "+invsgdt1 );
}
String invsgdt2 = req.getParameter("invsgdt2");
if( invsgdt2 == null){
	System.out.println(this.toString+" : invsgdt2 is null" );
}else{
	System.out.println(this.toString+" : invsgdt2 is "+invsgdt2 );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String jobcdset = req.getParameter("jobcdset");
if( jobcdset == null){
	System.out.println(this.toString+" : jobcdset is null" );
}else{
	System.out.println(this.toString+" : jobcdset is "+jobcdset );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String jobcdset = Util.checkString(req.getParameter("jobcdset"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String invsgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt1")));
String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String jobcdset = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcdset")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setInvsgdt1(invsgdt1);
dm.setInvsgdt2(invsgdt2);
dm.setAddrcd(addrcd);
dm.setJobcdset(jobcdset);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 12 14:49:50 KST 2006 */