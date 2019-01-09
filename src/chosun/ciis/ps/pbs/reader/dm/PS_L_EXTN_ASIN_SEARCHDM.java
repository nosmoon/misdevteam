/***************************************************************************************************
 * 파일명   : PS_L_EXTN_ASIN_SEARCHDataSet.java
 * 기능     : 독자-확장독자 지사배정처리 검색
 * 작성일자 : 2004-08-17
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-확장독자 지사배정처리 검색
 */

public class PS_L_EXTN_ASIN_SEARCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String sh_extndt_fr;
	public String sh_extndt_to;
	public String sh_medicd;
	public String sh_asinbocd;
	public String sh_asinyn;
	public long pageno;
	public long pagesize;

	public PS_L_EXTN_ASIN_SEARCHDM(){}
	public PS_L_EXTN_ASIN_SEARCHDM(String cmpycd, String incmgpers, String sh_extndt_fr, String sh_extndt_to, String sh_medicd, String sh_asinbocd, String sh_asinyn, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.sh_extndt_fr = sh_extndt_fr;
		this.sh_extndt_to = sh_extndt_to;
		this.sh_medicd = sh_medicd;
		this.sh_asinbocd = sh_asinbocd;
		this.sh_asinyn = sh_asinyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSh_extndt_fr(String sh_extndt_fr){
		this.sh_extndt_fr = sh_extndt_fr;
	}

	public void setSh_extndt_to(String sh_extndt_to){
		this.sh_extndt_to = sh_extndt_to;
	}

	public void setSh_medicd(String sh_medicd){
		this.sh_medicd = sh_medicd;
	}

	public void setSh_asinbocd(String sh_asinbocd){
		this.sh_asinbocd = sh_asinbocd;
	}

	public void setSh_asinyn(String sh_asinyn){
		this.sh_asinyn = sh_asinyn;
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

	public String getSh_extndt_fr(){
		return this.sh_extndt_fr;
	}

	public String getSh_extndt_to(){
		return this.sh_extndt_to;
	}

	public String getSh_medicd(){
		return this.sh_medicd;
	}

	public String getSh_asinbocd(){
		return this.sh_asinbocd;
	}

	public String getSh_asinyn(){
		return this.sh_asinyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_EXTN_ASIN_SEARCH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_EXTN_ASIN_SEARCHDM dm = (PS_L_EXTN_ASIN_SEARCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.sh_extndt_fr);
		cstmt.setString(6, dm.sh_extndt_to);
		cstmt.setString(7, dm.sh_medicd);
		cstmt.setString(8, dm.sh_asinbocd);
		cstmt.setString(9, dm.sh_asinyn);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_EXTN_ASIN_SEARCHDataSet();
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
String sh_extndt_fr = req.getParameter("sh_extndt_fr");
if( sh_extndt_fr == null){
	System.out.println(this.toString+" : sh_extndt_fr is null" );
}else{
	System.out.println(this.toString+" : sh_extndt_fr is "+sh_extndt_fr );
}
String sh_extndt_to = req.getParameter("sh_extndt_to");
if( sh_extndt_to == null){
	System.out.println(this.toString+" : sh_extndt_to is null" );
}else{
	System.out.println(this.toString+" : sh_extndt_to is "+sh_extndt_to );
}
String sh_medicd = req.getParameter("sh_medicd");
if( sh_medicd == null){
	System.out.println(this.toString+" : sh_medicd is null" );
}else{
	System.out.println(this.toString+" : sh_medicd is "+sh_medicd );
}
String sh_asinbocd = req.getParameter("sh_asinbocd");
if( sh_asinbocd == null){
	System.out.println(this.toString+" : sh_asinbocd is null" );
}else{
	System.out.println(this.toString+" : sh_asinbocd is "+sh_asinbocd );
}
String sh_asinyn = req.getParameter("sh_asinyn");
if( sh_asinyn == null){
	System.out.println(this.toString+" : sh_asinyn is null" );
}else{
	System.out.println(this.toString+" : sh_asinyn is "+sh_asinyn );
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
String sh_extndt_fr = Util.checkString(req.getParameter("sh_extndt_fr"));
String sh_extndt_to = Util.checkString(req.getParameter("sh_extndt_to"));
String sh_medicd = Util.checkString(req.getParameter("sh_medicd"));
String sh_asinbocd = Util.checkString(req.getParameter("sh_asinbocd"));
String sh_asinyn = Util.checkString(req.getParameter("sh_asinyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));
String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));
String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));
String sh_asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinbocd")));
String sh_asinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setSh_extndt_fr(sh_extndt_fr);
dm.setSh_extndt_to(sh_extndt_to);
dm.setSh_medicd(sh_medicd);
dm.setSh_asinbocd(sh_asinbocd);
dm.setSh_asinyn(sh_asinyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 25 16:06:23 KST 2005 */