/***************************************************************************************************
* 파일명 : SS_L_LEASAMT_LISTDM.java
* 기능 : 지국Info-전세지원금-목록을 위한 DM
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
 * 지국Info-전세지원금-목록을 위한 DM
 */

public class SS_L_LEASAMT_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String presi_nm;
	public String booffi_roomownr;
	public String bondprsvobjvolownr;
	public long pageno;
	public long pagesize;

	public SS_L_LEASAMT_LISTDM(){}
	public SS_L_LEASAMT_LISTDM(String deptcd, String areacd, String bocd, String presi_nm, String booffi_roomownr, String bondprsvobjvolownr, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.presi_nm = presi_nm;
		this.booffi_roomownr = booffi_roomownr;
		this.bondprsvobjvolownr = bondprsvobjvolownr;
		this.pageno = pageno;
		this.pagesize = pagesize;
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

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBooffi_roomownr(String booffi_roomownr){
		this.booffi_roomownr = booffi_roomownr;
	}

	public void setBondprsvobjvolownr(String bondprsvobjvolownr){
		this.bondprsvobjvolownr = bondprsvobjvolownr;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
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

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBooffi_roomownr(){
		return this.booffi_roomownr;
	}

	public String getBondprsvobjvolownr(){
		return this.bondprsvobjvolownr;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_LEASAMT_LIST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_LEASAMT_LISTDM dm = (SS_L_LEASAMT_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.areacd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.presi_nm);
		cstmt.setString(7, dm.booffi_roomownr);
		cstmt.setString(8, dm.bondprsvobjvolownr);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_L_LEASAMT_LISTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String booffi_roomownr = req.getParameter("booffi_roomownr");
if( booffi_roomownr == null){
	System.out.println(this.toString+" : booffi_roomownr is null" );
}else{
	System.out.println(this.toString+" : booffi_roomownr is "+booffi_roomownr );
}
String bondprsvobjvolownr = req.getParameter("bondprsvobjvolownr");
if( bondprsvobjvolownr == null){
	System.out.println(this.toString+" : bondprsvobjvolownr is null" );
}else{
	System.out.println(this.toString+" : bondprsvobjvolownr is "+bondprsvobjvolownr );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String booffi_roomownr = Util.checkString(req.getParameter("booffi_roomownr"));
String bondprsvobjvolownr = Util.checkString(req.getParameter("bondprsvobjvolownr"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String booffi_roomownr = Util.Uni2Ksc(Util.checkString(req.getParameter("booffi_roomownr")));
String bondprsvobjvolownr = Util.Uni2Ksc(Util.checkString(req.getParameter("bondprsvobjvolownr")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setPresi_nm(presi_nm);
dm.setBooffi_roomownr(booffi_roomownr);
dm.setBondprsvobjvolownr(bondprsvobjvolownr);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 17:39:46 KST 2004 */