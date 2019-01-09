/***************************************************************************************************
* 파일명 : SP_PS_L_CAMP_SEARCH.java
* 수당-캠페인관리 캠페인조회 
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-캠페인관리 캠페인조회          
 *
 */

  

public class PS_L_CAMP_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bocd;
	public String sh_bgncampdt;
	public String sh_endcampdt;
	public String sh_campnm;
	public long pageno;
	public long pagesize;

	public PS_L_CAMP_SEARCHDM(){}
	public PS_L_CAMP_SEARCHDM(String cmpycd, String incmgpers, String bocd, String sh_bgncampdt, String sh_endcampdt, String sh_campnm, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.sh_bgncampdt = sh_bgncampdt;
		this.sh_endcampdt = sh_endcampdt;
		this.sh_campnm = sh_campnm;
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

	public void setSh_bgncampdt(String sh_bgncampdt){
		this.sh_bgncampdt = sh_bgncampdt;
	}

	public void setSh_endcampdt(String sh_endcampdt){
		this.sh_endcampdt = sh_endcampdt;
	}

	public void setSh_campnm(String sh_campnm){
		this.sh_campnm = sh_campnm;
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

	public String getSh_bgncampdt(){
		return this.sh_bgncampdt;
	}

	public String getSh_endcampdt(){
		return this.sh_endcampdt;
	}

	public String getSh_campnm(){
		return this.sh_campnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_CAMP_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_CAMP_SEARCHDM dm = (PS_L_CAMP_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.sh_bgncampdt);
		cstmt.setString(7, dm.sh_endcampdt);
		cstmt.setString(8, dm.sh_campnm);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_L_CAMP_SEARCHDataSet();
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
String sh_bgncampdt = req.getParameter("sh_bgncampdt");
if( sh_bgncampdt == null){
	System.out.println(this.toString+" : sh_bgncampdt is null" );
}else{
	System.out.println(this.toString+" : sh_bgncampdt is "+sh_bgncampdt );
}
String sh_endcampdt = req.getParameter("sh_endcampdt");
if( sh_endcampdt == null){
	System.out.println(this.toString+" : sh_endcampdt is null" );
}else{
	System.out.println(this.toString+" : sh_endcampdt is "+sh_endcampdt );
}
String sh_campnm = req.getParameter("sh_campnm");
if( sh_campnm == null){
	System.out.println(this.toString+" : sh_campnm is null" );
}else{
	System.out.println(this.toString+" : sh_campnm is "+sh_campnm );
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
String sh_bgncampdt = Util.checkString(req.getParameter("sh_bgncampdt"));
String sh_endcampdt = Util.checkString(req.getParameter("sh_endcampdt"));
String sh_campnm = Util.checkString(req.getParameter("sh_campnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String sh_bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bgncampdt")));
String sh_endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_endcampdt")));
String sh_campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_campnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setSh_bgncampdt(sh_bgncampdt);
dm.setSh_endcampdt(sh_endcampdt);
dm.setSh_campnm(sh_campnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 15 10:13:40 KST 2004 */