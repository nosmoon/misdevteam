/***************************************************************************************************
 * 파일명   : SL_L_BOEMPDM.java
 * 기능     : 지국경영-아파트투입율-직원검색 직원목록조회
 * 작성일자 : 2005/10/14
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
**  지국경영-아파트투입율-직원검색 직원목록조회
**/

public class SL_L_BOEMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String empcode;
	public String empname;
	public String dutycd;
	public long pageno;
	public long pagesize;

	public SL_L_BOEMPDM(){}
	public SL_L_BOEMPDM(String bocd, String empcode, String empname, String dutycd, long pageno, long pagesize){
		this.bocd = bocd;
		this.empcode = empcode;
		this.empname = empname;
		this.dutycd = dutycd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setEmpcode(String empcode){
		this.empcode = empcode;
	}

	public void setEmpname(String empname){
		this.empname = empname;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getEmpcode(){
		return this.empcode;
	}

	public String getEmpname(){
		return this.empname;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_BOEMP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_BOEMPDM dm = (SL_L_BOEMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.empcode);
		cstmt.setString(5, dm.empname);
		cstmt.setString(6, dm.dutycd);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_BOEMPDataSet();
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
String empcode = req.getParameter("empcode");
if( empcode == null){
	System.out.println(this.toString+" : empcode is null" );
}else{
	System.out.println(this.toString+" : empcode is "+empcode );
}
String empname = req.getParameter("empname");
if( empname == null){
	System.out.println(this.toString+" : empname is null" );
}else{
	System.out.println(this.toString+" : empname is "+empname );
}
String dutycd = req.getParameter("dutycd");
if( dutycd == null){
	System.out.println(this.toString+" : dutycd is null" );
}else{
	System.out.println(this.toString+" : dutycd is "+dutycd );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String empcode = Util.checkString(req.getParameter("empcode"));
String empname = Util.checkString(req.getParameter("empname"));
String dutycd = Util.checkString(req.getParameter("dutycd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String empcode = Util.Uni2Ksc(Util.checkString(req.getParameter("empcode")));
String empname = Util.Uni2Ksc(Util.checkString(req.getParameter("empname")));
String dutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("dutycd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setEmpcode(empcode);
dm.setEmpname(empname);
dm.setDutycd(dutycd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 14 15:23:20 KST 2005 */