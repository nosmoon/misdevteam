/***************************************************************************************************
* 파일명 : SS_L_MIGRWORKINFODM.java
* 기능 : 관리자-작업-마이그레이션 현황-목록을 위한 DM
* 작성일자 : 2004-03-12
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
 * 관리자-작업-마이그레이션 현황-목록을 위한 DM
 */

public class SS_L_MIGRWORKINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String endcnfmyn;
	public String deptcd;
	public String areacd;
	public String bocd;

	public SS_L_MIGRWORKINFODM(){}
	public SS_L_MIGRWORKINFODM(String endcnfmyn, String deptcd, String areacd, String bocd){
		this.endcnfmyn = endcnfmyn;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
	}

	public void setEndcnfmyn(String endcnfmyn){
		this.endcnfmyn = endcnfmyn;
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

	public String getEndcnfmyn(){
		return this.endcnfmyn;
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

	public String getSQL(){
		 return "{ call SP_SS_L_MIGRWORKINFO( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MIGRWORKINFODM dm = (SS_L_MIGRWORKINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.endcnfmyn);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_MIGRWORKINFODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String endcnfmyn = req.getParameter("endcnfmyn");
if( endcnfmyn == null){
	System.out.println(this.toString+" : endcnfmyn is null" );
}else{
	System.out.println(this.toString+" : endcnfmyn is "+endcnfmyn );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String endcnfmyn = Util.checkString(req.getParameter("endcnfmyn"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String endcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("endcnfmyn")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEndcnfmyn(endcnfmyn);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 13 19:48:55 KST 2004 */