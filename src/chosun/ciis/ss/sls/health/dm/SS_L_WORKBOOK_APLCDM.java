/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.health.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.rec.*;

/**
 * 
 */


public class SS_L_WORKBOOK_APLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String search_flag;
	public String frdt;
	public String todt;
	public String recvname;
	public String aplcpath;

	public SS_L_WORKBOOK_APLCDM(){}
	public SS_L_WORKBOOK_APLCDM(String deptcd, String partcd, String areacd, String bocd, String search_flag, String frdt, String todt, String recvname, String aplcpath){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.search_flag = search_flag;
		this.frdt = frdt;
		this.todt = todt;
		this.recvname = recvname;
		this.aplcpath = aplcpath;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSearch_flag(String search_flag){
		this.search_flag = search_flag;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRecvname(String recvname){
		this.recvname = recvname;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSearch_flag(){
		return this.search_flag;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRecvname(){
		return this.recvname;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_WORKBOOK_APLC(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_WORKBOOK_APLCDM dm = (SS_L_WORKBOOK_APLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.search_flag);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.recvname);
		cstmt.setString(11, dm.aplcpath);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.health.ds.SS_L_WORKBOOK_APLCDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("search_flag = [" + getSearch_flag() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("recvname = [" + getRecvname() + "]");
		System.out.println("aplcpath = [" + getAplcpath() + "]");
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
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
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
String search_flag = req.getParameter("search_flag");
if( search_flag == null){
	System.out.println(this.toString+" : search_flag is null" );
}else{
	System.out.println(this.toString+" : search_flag is "+search_flag );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String recvname = req.getParameter("recvname");
if( recvname == null){
	System.out.println(this.toString+" : recvname is null" );
}else{
	System.out.println(this.toString+" : recvname is "+recvname );
}
String aplcpath = req.getParameter("aplcpath");
if( aplcpath == null){
	System.out.println(this.toString+" : aplcpath is null" );
}else{
	System.out.println(this.toString+" : aplcpath is "+aplcpath );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String search_flag = Util.checkString(req.getParameter("search_flag"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String recvname = Util.checkString(req.getParameter("recvname"));
String aplcpath = Util.checkString(req.getParameter("aplcpath"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String search_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("search_flag")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String recvname = Util.Uni2Ksc(Util.checkString(req.getParameter("recvname")));
String aplcpath = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpath")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setSearch_flag(search_flag);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRecvname(recvname);
dm.setAplcpath(aplcpath);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 07 09:42:12 KST 2015 */