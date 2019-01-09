/***************************************************************************************************
 * 파일명   : SP_SS_L_CYBALON_CLOSPTCR.java
 * 기능     : 사이버센터
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
**  사이버센터
**/

public class SS_L_CYBALON_CLOSPTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String etc1;
	public String etc2;
	public String etc3;
	public long pageno;
	public long pagesize;

	public SS_L_CYBALON_CLOSPTCRDM(){}
	public SS_L_CYBALON_CLOSPTCRDM(String etc1, String etc2, String etc3, long pageno, long pagesize){
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CYBALON_CLOSPTCR( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CYBALON_CLOSPTCRDM dm = (SS_L_CYBALON_CLOSPTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.etc1);
		cstmt.setString(4, dm.etc2);
		cstmt.setString(5, dm.etc3);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_L_CYBALON_CLOSPTCRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
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

String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 22 11:33:09 KST 2006 */