/***************************************************************************************************
* 파일명 : SP_PS_L_EMPCAMP_SEARCH.java
* 수당-캠페인관리 캠페인수당 내역조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-캠페인관리 캠페인수당내역 조회
 *
 */

  

public class PS_L_EMPCAMP_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String campseq;
	public String sh_boemp_no1;
	public String sh_boemp_no2;
	public String sh_deptcd;
	public long pageno;
	public long pagesize;

	public PS_L_EMPCAMP_SEARCHDM(){}
	public PS_L_EMPCAMP_SEARCHDM(String cmpycd, String incmgpers, String bocd, String campseq, String sh_boemp_no1, String sh_boemp_no2, String sh_deptcd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.campseq = campseq;
		this.sh_boemp_no1 = sh_boemp_no1;
		this.sh_boemp_no2 = sh_boemp_no2;
		this.sh_deptcd = sh_deptcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCampseq(String campseq){
		this.campseq = campseq;
	}

	public void setSh_boemp_no1(String sh_boemp_no1){
		this.sh_boemp_no1 = sh_boemp_no1;
	}

	public void setSh_boemp_no2(String sh_boemp_no2){
		this.sh_boemp_no2 = sh_boemp_no2;
	}

	public void setSh_deptcd(String sh_deptcd){
		this.sh_deptcd = sh_deptcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCampseq(){
		return this.campseq;
	}

	public String getSh_boemp_no1(){
		return this.sh_boemp_no1;
	}

	public String getSh_boemp_no2(){
		return this.sh_boemp_no2;
	}

	public String getSh_deptcd(){
		return this.sh_deptcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_EMPCAMP_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_EMPCAMP_SEARCHDM dm = (PS_L_EMPCAMP_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.campseq);
		cstmt.setString(7, dm.sh_boemp_no1);
		cstmt.setString(8, dm.sh_boemp_no2);
		cstmt.setString(9, dm.sh_deptcd);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_L_EMPCAMP_SEARCHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String campseq = req.getParameter("campseq");
if( campseq == null){
	System.out.println(this.toString+" : campseq is null" );
}else{
	System.out.println(this.toString+" : campseq is "+campseq );
}
String sh_boemp_no1 = req.getParameter("sh_boemp_no1");
if( sh_boemp_no1 == null){
	System.out.println(this.toString+" : sh_boemp_no1 is null" );
}else{
	System.out.println(this.toString+" : sh_boemp_no1 is "+sh_boemp_no1 );
}
String sh_boemp_no2 = req.getParameter("sh_boemp_no2");
if( sh_boemp_no2 == null){
	System.out.println(this.toString+" : sh_boemp_no2 is null" );
}else{
	System.out.println(this.toString+" : sh_boemp_no2 is "+sh_boemp_no2 );
}
String sh_deptcd = req.getParameter("sh_deptcd");
if( sh_deptcd == null){
	System.out.println(this.toString+" : sh_deptcd is null" );
}else{
	System.out.println(this.toString+" : sh_deptcd is "+sh_deptcd );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String campseq = Util.checkString(req.getParameter("campseq"));
String sh_boemp_no1 = Util.checkString(req.getParameter("sh_boemp_no1"));
String sh_boemp_no2 = Util.checkString(req.getParameter("sh_boemp_no2"));
String sh_deptcd = Util.checkString(req.getParameter("sh_deptcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));
String sh_boemp_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no1")));
String sh_boemp_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no2")));
String sh_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_deptcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setCampseq(campseq);
dm.setSh_boemp_no1(sh_boemp_no1);
dm.setSh_boemp_no2(sh_boemp_no2);
dm.setSh_deptcd(sh_deptcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 11 17:51:23 KST 2004 */