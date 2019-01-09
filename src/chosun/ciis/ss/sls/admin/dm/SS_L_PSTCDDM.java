/***************************************************************************************************
* 파일명 : SS_L_PSTCDDM.java
* 기능 : 관리자-우편번호-목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-우편번호-목록을 위한 DM
 */


public class SS_L_PSTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String zip1;
	public String zip2;
	public String addr3;
	public long pageno;
	public long pagesize;

	public SS_L_PSTCDDM(){}
	public SS_L_PSTCDDM(String flag, String deptcd, String areacd, String bocd, String zip1, String zip2, String addr3, long pageno, long pagesize){
		this.flag = flag;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.addr3 = addr3;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFlag(String flag){
		this.flag = flag;
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

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFlag(){
		return this.flag;
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

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PSTCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PSTCDDM dm = (SS_L_PSTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.zip1);
		cstmt.setString(8, dm.zip2);
		cstmt.setString(9, dm.addr3);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_PSTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
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
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
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

String flag = Util.checkString(req.getParameter("flag"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String addr3 = Util.checkString(req.getParameter("addr3"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setAddr3(addr3);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 07 14:13:26 KST 2004 */