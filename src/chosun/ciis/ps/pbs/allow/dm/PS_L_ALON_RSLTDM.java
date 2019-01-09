/***************************************************************************************************
* 파일명 : SP_PS_L_ALON_RSLT.java
* 수당-수당관리 수당처리 사원조회
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
 * 수당-수당관리 수당처리 사원조회
 *
 */ 

 

public class PS_L_ALON_RSLTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String aloncd;
	public String boemp_no_from;
	public String boemp_no_to;
	public String deptcd;
	public String dutycd;
	public long pageno;
	public long pagesize;

	public PS_L_ALON_RSLTDM(){}
	public PS_L_ALON_RSLTDM(String cmpycd, String bocd, String aloncd, String boemp_no_from, String boemp_no_to, String deptcd, String dutycd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.aloncd = aloncd;
		this.boemp_no_from = boemp_no_from;
		this.boemp_no_to = boemp_no_to;
		this.deptcd = deptcd;
		this.dutycd = dutycd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAloncd(String aloncd){
		this.aloncd = aloncd;
	}

	public void setBoemp_no_from(String boemp_no_from){
		this.boemp_no_from = boemp_no_from;
	}

	public void setBoemp_no_to(String boemp_no_to){
		this.boemp_no_to = boemp_no_to;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
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

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAloncd(){
		return this.aloncd;
	}

	public String getBoemp_no_from(){
		return this.boemp_no_from;
	}

	public String getBoemp_no_to(){
		return this.boemp_no_to;
	}

	public String getDeptcd(){
		return this.deptcd;
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
		 return "{ call SP_PS_L_ALON_RSLT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_ALON_RSLTDM dm = (PS_L_ALON_RSLTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.aloncd);
		cstmt.setString(6, dm.boemp_no_from);
		cstmt.setString(7, dm.boemp_no_to);
		cstmt.setString(8, dm.deptcd);
		cstmt.setString(9, dm.dutycd);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_L_ALON_RSLTDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String aloncd = req.getParameter("aloncd");
if( aloncd == null){
	System.out.println(this.toString+" : aloncd is null" );
}else{
	System.out.println(this.toString+" : aloncd is "+aloncd );
}
String boemp_no_from = req.getParameter("boemp_no_from");
if( boemp_no_from == null){
	System.out.println(this.toString+" : boemp_no_from is null" );
}else{
	System.out.println(this.toString+" : boemp_no_from is "+boemp_no_from );
}
String boemp_no_to = req.getParameter("boemp_no_to");
if( boemp_no_to == null){
	System.out.println(this.toString+" : boemp_no_to is null" );
}else{
	System.out.println(this.toString+" : boemp_no_to is "+boemp_no_to );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String aloncd = Util.checkString(req.getParameter("aloncd"));
String boemp_no_from = Util.checkString(req.getParameter("boemp_no_from"));
String boemp_no_to = Util.checkString(req.getParameter("boemp_no_to"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String dutycd = Util.checkString(req.getParameter("dutycd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("aloncd")));
String boemp_no_from = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no_from")));
String boemp_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no_to")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String dutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("dutycd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setAloncd(aloncd);
dm.setBoemp_no_from(boemp_no_from);
dm.setBoemp_no_to(boemp_no_to);
dm.setDeptcd(deptcd);
dm.setDutycd(dutycd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 12:42:11 KST 2004 */