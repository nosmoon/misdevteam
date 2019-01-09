/***************************************************************************************************
* 파일명 : SS_S_FCT_FRFTDM.java
* 기능 : 지국 경영 - 공정위위약금 - 상세
* 작성일자 : 2004-04-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국 경영 - 공정위위약금 - 상세
 *
 */

public class SS_S_FCT_FRFTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String impndt;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String viltresn;

	public SS_S_FCT_FRFTDM(){}
	public SS_S_FCT_FRFTDM(String impndt, String deptcd, String areacd, String bocd, String viltresn){
		this.impndt = impndt;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.viltresn = viltresn;
	}

	public void setImpndt(String impndt){
		this.impndt = impndt;
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

	public void setViltresn(String viltresn){
		this.viltresn = viltresn;
	}

	public String getImpndt(){
		return this.impndt;
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

	public String getViltresn(){
		return this.viltresn;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_FCT_FRFT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_FCT_FRFTDM dm = (SS_S_FCT_FRFTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.impndt);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.viltresn);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_S_FCT_FRFTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String impndt = req.getParameter("impndt");
if( impndt == null){
	System.out.println(this.toString+" : impndt is null" );
}else{
	System.out.println(this.toString+" : impndt is "+impndt );
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
String viltresn = req.getParameter("viltresn");
if( viltresn == null){
	System.out.println(this.toString+" : viltresn is null" );
}else{
	System.out.println(this.toString+" : viltresn is "+viltresn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String impndt = Util.checkString(req.getParameter("impndt"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String viltresn = Util.checkString(req.getParameter("viltresn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String impndt = Util.Uni2Ksc(Util.checkString(req.getParameter("impndt")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String viltresn = Util.Uni2Ksc(Util.checkString(req.getParameter("viltresn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setImpndt(impndt);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setViltresn(viltresn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 19 15:24:37 KST 2004 */