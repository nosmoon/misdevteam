/***************************************************************************************************
* 파일명 : SS_L_APLCDM.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-신청목록
* 작성일자 : 2004-03-26
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
 * 지국업무지원-Billing자동이체-신청관리-신청목록
 *
 */


public class SS_L_APLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public long pageno;
	public long pagesize;
	public String aplcdt;
	public String aplcclsf;
	public String aplcprocstat;
	public String shftclsf;
	public String sechcond;
	public String sechcont;

	public SS_L_APLCDM(){}
	public SS_L_APLCDM(String bocd, long pageno, long pagesize, String aplcdt, String aplcclsf, String aplcprocstat, String shftclsf, String sechcond, String sechcont){
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.aplcdt = aplcdt;
		this.aplcclsf = aplcclsf;
		this.aplcprocstat = aplcprocstat;
		this.shftclsf = shftclsf;
		this.sechcond = sechcond;
		this.sechcont = sechcont;
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

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setAplcprocstat(String aplcprocstat){
		this.aplcprocstat = aplcprocstat;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setSechcond(String sechcond){
		this.sechcond = sechcond;
	}

	public void setSechcont(String sechcont){
		this.sechcont = sechcont;
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

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getAplcprocstat(){
		return this.aplcprocstat;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getSechcond(){
		return this.sechcond;
	}

	public String getSechcont(){
		return this.sechcont;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_APLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_APLCDM dm = (SS_L_APLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.setString(6, dm.aplcdt);
		cstmt.setString(7, dm.aplcclsf);
		cstmt.setString(8, dm.aplcprocstat);
		cstmt.setString(9, dm.shftclsf);
		cstmt.setString(10, dm.sechcond);
		cstmt.setString(11, dm.sechcont);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_APLCDataSet();
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcclsf = req.getParameter("aplcclsf");
if( aplcclsf == null){
	System.out.println(this.toString+" : aplcclsf is null" );
}else{
	System.out.println(this.toString+" : aplcclsf is "+aplcclsf );
}
String aplcprocstat = req.getParameter("aplcprocstat");
if( aplcprocstat == null){
	System.out.println(this.toString+" : aplcprocstat is null" );
}else{
	System.out.println(this.toString+" : aplcprocstat is "+aplcprocstat );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String sechcond = req.getParameter("sechcond");
if( sechcond == null){
	System.out.println(this.toString+" : sechcond is null" );
}else{
	System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
	System.out.println(this.toString+" : sechcont is null" );
}else{
	System.out.println(this.toString+" : sechcont is "+sechcont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
String aplcprocstat = Util.checkString(req.getParameter("aplcprocstat"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
String aplcprocstat = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcprocstat")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setAplcdt(aplcdt);
dm.setAplcclsf(aplcclsf);
dm.setAplcprocstat(aplcprocstat);
dm.setShftclsf(shftclsf);
dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 26 15:54:29 KST 2004 */