/***************************************************************************************************
* 파일명 : SS_L_BO_HEADDM.java
* 기능 : 지국Info-지국장-목록을 위한 DM
* 작성일자 : 2004-04-24
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
 * 지국Info-지국장-목록을 위한 DM
 */

public class SS_L_BO_HEADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String jmgystgb;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String bo_headnm;
	public String bjnm;
	public long pageno;
	public long pagesize;

	public SS_L_BO_HEADDM(){}
	public SS_L_BO_HEADDM(String jmgystgb, String deptcd, String areacd, String bocd, String bo_headnm, String bjnm, long pageno, long pagesize){
		this.jmgystgb = jmgystgb;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.bo_headnm = bo_headnm;
		this.bjnm = bjnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setJmgystgb(String jmgystgb){
		this.jmgystgb = jmgystgb;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBo_headnm(String bo_headnm){
		this.bo_headnm = bo_headnm;
	}

	public void setBjnm(String bjnm){
		this.bjnm = bjnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getJmgystgb(){
		return this.jmgystgb;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBo_headnm(){
		return this.bo_headnm;
	}

	public String getBjnm(){
		return this.bjnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BO_HEAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BO_HEADDM dm = (SS_L_BO_HEADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.jmgystgb);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.bo_headnm);
		cstmt.setString(8, dm.bjnm);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_L_BO_HEADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String jmgystgb = req.getParameter("jmgystgb");
if( jmgystgb == null){
	System.out.println(this.toString+" : jmgystgb is null" );
}else{
	System.out.println(this.toString+" : jmgystgb is "+jmgystgb );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
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
String bo_headnm = req.getParameter("bo_headnm");
if( bo_headnm == null){
	System.out.println(this.toString+" : bo_headnm is null" );
}else{
	System.out.println(this.toString+" : bo_headnm is "+bo_headnm );
}
String bjnm = req.getParameter("bjnm");
if( bjnm == null){
	System.out.println(this.toString+" : bjnm is null" );
}else{
	System.out.println(this.toString+" : bjnm is "+bjnm );
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

String jmgystgb = Util.checkString(req.getParameter("jmgystgb"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bo_headnm = Util.checkString(req.getParameter("bo_headnm"));
String bjnm = Util.checkString(req.getParameter("bjnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String jmgystgb = Util.Uni2Ksc(Util.checkString(req.getParameter("jmgystgb")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bo_headnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headnm")));
String bjnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bjnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setJmgystgb(jmgystgb);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBo_headnm(bo_headnm);
dm.setBjnm(bjnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 20 22:08:13 KST 2004 */