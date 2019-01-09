/***************************************************************************************************
* 파일명 : SL_L_EXTNPERSDM.java
* 기능 : 공통-확장자검색팝업(목록조회)
* 작성일자 : 2004-04-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통-확장자검색팝업(목록조회)
 *
 */

public class SL_L_EXTNPERSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String extntypecd;
	public String extnblngcd;
	public String stafno;
	public String name;
	public String prn;
	public long pageno;
	public long pagesize;

	public SL_L_EXTNPERSDM(){}
	public SL_L_EXTNPERSDM(String bocd, String extntypecd, String extnblngcd, String stafno, String name, String prn, long pageno, long pagesize){
		this.bocd = bocd;
		this.extntypecd = extntypecd;
		this.extnblngcd = extnblngcd;
		this.stafno = stafno;
		this.name = name;
		this.prn = prn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setExtntypecd(String extntypecd){
		this.extntypecd = extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPrn(String prn){
		this.prn = prn;
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

	public String getExtntypecd(){
		return this.extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getName(){
		return this.name;
	}

	public String getPrn(){
		return this.prn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_EXTNPERS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_EXTNPERSDM dm = (SL_L_EXTNPERSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.extntypecd);
		cstmt.setString(5, dm.extnblngcd);
		cstmt.setString(6, dm.stafno);
		cstmt.setString(7, dm.name);
		cstmt.setString(8, dm.prn);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.SL_L_EXTNPERSDataSet();
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
String extntypecd = req.getParameter("extntypecd");
if( extntypecd == null){
	System.out.println(this.toString+" : extntypecd is null" );
}else{
	System.out.println(this.toString+" : extntypecd is "+extntypecd );
}
String extnblngcd = req.getParameter("extnblngcd");
if( extnblngcd == null){
	System.out.println(this.toString+" : extnblngcd is null" );
}else{
	System.out.println(this.toString+" : extnblngcd is "+extnblngcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
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
String extntypecd = Util.checkString(req.getParameter("extntypecd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String name = Util.checkString(req.getParameter("name"));
String prn = Util.checkString(req.getParameter("prn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("extntypecd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setExtntypecd(extntypecd);
dm.setExtnblngcd(extnblngcd);
dm.setStafno(stafno);
dm.setName(name);
dm.setPrn(prn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 08 18:59:50 KST 2004 */