/***************************************************************************************************
* 파일명 : SL_L_RDR_RDRAREADM.java
* 기능 : 독자-지역독자관리(목록조회)
* 작성일자 : 2004-05-20
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
 * 독자-지역독자관리(목록조회)
 *
 */

public class SL_L_RDR_RDRAREADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public long pageno;
	public long pagesize;
	public String rdr_regdt1;
	public String rdr_regdt2;
	public String search_flg;
	public String search_nm;
	public String medicd;

	public SL_L_RDR_RDRAREADM(){}
	public SL_L_RDR_RDRAREADM(String bocd, long pageno, long pagesize, String rdr_regdt1, String rdr_regdt2, String search_flg, String search_nm, String medicd){
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.rdr_regdt1 = rdr_regdt1;
		this.rdr_regdt2 = rdr_regdt2;
		this.search_flg = search_flg;
		this.search_nm = search_nm;
		this.medicd = medicd;
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

	public void setRdr_regdt1(String rdr_regdt1){
		this.rdr_regdt1 = rdr_regdt1;
	}

	public void setRdr_regdt2(String rdr_regdt2){
		this.rdr_regdt2 = rdr_regdt2;
	}

	public void setSearch_flg(String search_flg){
		this.search_flg = search_flg;
	}

	public void setSearch_nm(String search_nm){
		this.search_nm = search_nm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
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

	public String getRdr_regdt1(){
		return this.rdr_regdt1;
	}

	public String getRdr_regdt2(){
		return this.rdr_regdt2;
	}

	public String getSearch_flg(){
		return this.search_flg;
	}

	public String getSearch_nm(){
		return this.search_nm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_RDR_RDRAREA( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_RDRAREADM dm = (SL_L_RDR_RDRAREADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.setString(6, dm.rdr_regdt1);
		cstmt.setString(7, dm.rdr_regdt2);
		cstmt.setString(8, dm.search_flg);
		cstmt.setString(9, dm.search_nm);
		cstmt.setString(10, dm.medicd);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_RDRAREADataSet();
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
String rdr_regdt1 = req.getParameter("rdr_regdt1");
if( rdr_regdt1 == null){
	System.out.println(this.toString+" : rdr_regdt1 is null" );
}else{
	System.out.println(this.toString+" : rdr_regdt1 is "+rdr_regdt1 );
}
String rdr_regdt2 = req.getParameter("rdr_regdt2");
if( rdr_regdt2 == null){
	System.out.println(this.toString+" : rdr_regdt2 is null" );
}else{
	System.out.println(this.toString+" : rdr_regdt2 is "+rdr_regdt2 );
}
String search_flg = req.getParameter("search_flg");
if( search_flg == null){
	System.out.println(this.toString+" : search_flg is null" );
}else{
	System.out.println(this.toString+" : search_flg is "+search_flg );
}
String search_nm = req.getParameter("search_nm");
if( search_nm == null){
	System.out.println(this.toString+" : search_nm is null" );
}else{
	System.out.println(this.toString+" : search_nm is "+search_nm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String rdr_regdt1 = Util.checkString(req.getParameter("rdr_regdt1"));
String rdr_regdt2 = Util.checkString(req.getParameter("rdr_regdt2"));
String search_flg = Util.checkString(req.getParameter("search_flg"));
String search_nm = Util.checkString(req.getParameter("search_nm"));
String medicd = Util.checkString(req.getParameter("medicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String rdr_regdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_regdt1")));
String rdr_regdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_regdt2")));
String search_flg = Util.Uni2Ksc(Util.checkString(req.getParameter("search_flg")));
String search_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_nm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setRdr_regdt1(rdr_regdt1);
dm.setRdr_regdt2(rdr_regdt2);
dm.setSearch_flg(search_flg);
dm.setSearch_nm(search_nm);
dm.setMedicd(medicd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 24 15:30:08 KST 2004 */