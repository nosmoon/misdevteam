/***************************************************************************************************
* 파일명 : SL_L_RDR_EXTN_OUTERDM.java
* 기능 : 외부확장등록관리(목록)
* 작성일자 : 2004-01-19
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 외부확장등록관리(목록)
 *
 */


public class SL_L_RDR_EXTN_OUTERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String sech_medicd;
	public String sech_extnblngcd;
	public String sech_subscnfmstatcd;
	public String sech_extnflnm;
	public String sech_rdrnm;
	public long pageno;
	public long pagesize;

	public SL_L_RDR_EXTN_OUTERDM(){}
	public SL_L_RDR_EXTN_OUTERDM(String bocd, String sech_medicd, String sech_extnblngcd, String sech_subscnfmstatcd, String sech_extnflnm, String sech_rdrnm, long pageno, long pagesize){
		this.bocd = bocd;
		this.sech_medicd = sech_medicd;
		this.sech_extnblngcd = sech_extnblngcd;
		this.sech_subscnfmstatcd = sech_subscnfmstatcd;
		this.sech_extnflnm = sech_extnflnm;
		this.sech_rdrnm = sech_rdrnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSech_medicd(String sech_medicd){
		this.sech_medicd = sech_medicd;
	}

	public void setSech_extnblngcd(String sech_extnblngcd){
		this.sech_extnblngcd = sech_extnblngcd;
	}

	public void setSech_subscnfmstatcd(String sech_subscnfmstatcd){
		this.sech_subscnfmstatcd = sech_subscnfmstatcd;
	}

	public void setSech_extnflnm(String sech_extnflnm){
		this.sech_extnflnm = sech_extnflnm;
	}

	public void setSech_rdrnm(String sech_rdrnm){
		this.sech_rdrnm = sech_rdrnm;
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

	public String getSech_medicd(){
		return this.sech_medicd;
	}

	public String getSech_extnblngcd(){
		return this.sech_extnblngcd;
	}

	public String getSech_subscnfmstatcd(){
		return this.sech_subscnfmstatcd;
	}

	public String getSech_extnflnm(){
		return this.sech_extnflnm;
	}

	public String getSech_rdrnm(){
		return this.sech_rdrnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_RDR_EXTN_OUTER( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_EXTN_OUTERDM dm = (SL_L_RDR_EXTN_OUTERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.sech_medicd);
		cstmt.setString(5, dm.sech_extnblngcd);
		cstmt.setString(6, dm.sech_subscnfmstatcd);
		cstmt.setString(7, dm.sech_extnflnm);
		cstmt.setString(8, dm.sech_rdrnm);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_EXTN_OUTERDataSet();
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
String sech_medicd = req.getParameter("sech_medicd");
if( sech_medicd == null){
	System.out.println(this.toString+" : sech_medicd is null" );
}else{
	System.out.println(this.toString+" : sech_medicd is "+sech_medicd );
}
String sech_extnblngcd = req.getParameter("sech_extnblngcd");
if( sech_extnblngcd == null){
	System.out.println(this.toString+" : sech_extnblngcd is null" );
}else{
	System.out.println(this.toString+" : sech_extnblngcd is "+sech_extnblngcd );
}
String sech_subscnfmstatcd = req.getParameter("sech_subscnfmstatcd");
if( sech_subscnfmstatcd == null){
	System.out.println(this.toString+" : sech_subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : sech_subscnfmstatcd is "+sech_subscnfmstatcd );
}
String sech_extnflnm = req.getParameter("sech_extnflnm");
if( sech_extnflnm == null){
	System.out.println(this.toString+" : sech_extnflnm is null" );
}else{
	System.out.println(this.toString+" : sech_extnflnm is "+sech_extnflnm );
}
String sech_rdrnm = req.getParameter("sech_rdrnm");
if( sech_rdrnm == null){
	System.out.println(this.toString+" : sech_rdrnm is null" );
}else{
	System.out.println(this.toString+" : sech_rdrnm is "+sech_rdrnm );
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
String sech_medicd = Util.checkString(req.getParameter("sech_medicd"));
String sech_extnblngcd = Util.checkString(req.getParameter("sech_extnblngcd"));
String sech_subscnfmstatcd = Util.checkString(req.getParameter("sech_subscnfmstatcd"));
String sech_extnflnm = Util.checkString(req.getParameter("sech_extnflnm"));
String sech_rdrnm = Util.checkString(req.getParameter("sech_rdrnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String sech_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_medicd")));
String sech_extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_extnblngcd")));
String sech_subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_subscnfmstatcd")));
String sech_extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_extnflnm")));
String sech_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sech_rdrnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setSech_medicd(sech_medicd);
dm.setSech_extnblngcd(sech_extnblngcd);
dm.setSech_subscnfmstatcd(sech_subscnfmstatcd);
dm.setSech_extnflnm(sech_extnflnm);
dm.setSech_rdrnm(sech_rdrnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 09 16:40:29 KST 2004 */