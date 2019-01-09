/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감 신청(담당) 조회(리스트)
* 작성일자 : 2009-07-22
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String dt_clsf;
	public String dt_clsf_chce;
	public String chrgcnfmyn;
	public String closyn;

	public SS_L_QTYAPLCDM(){}
	public SS_L_QTYAPLCDM(String deptcd, String partcd, String areacd, String dt_clsf, String dt_clsf_chce, String chrgcnfmyn, String closyn){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.dt_clsf = dt_clsf;
		this.dt_clsf_chce = dt_clsf_chce;
		this.chrgcnfmyn = chrgcnfmyn;
		this.closyn = closyn;
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

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setDt_clsf_chce(String dt_clsf_chce){
		this.dt_clsf_chce = dt_clsf_chce;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
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

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getDt_clsf_chce(){
		return this.dt_clsf_chce;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_QTYAPLC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_QTYAPLCDM dm = (SS_L_QTYAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.dt_clsf);
		cstmt.setString(7, dm.dt_clsf_chce);
		cstmt.setString(8, dm.chrgcnfmyn);
		cstmt.setString(9, dm.closyn);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLCDataSet();
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
String dt_clsf = req.getParameter("dt_clsf");
if( dt_clsf == null){
	System.out.println(this.toString+" : dt_clsf is null" );
}else{
	System.out.println(this.toString+" : dt_clsf is "+dt_clsf );
}
String dt_clsf_chce = req.getParameter("dt_clsf_chce");
if( dt_clsf_chce == null){
	System.out.println(this.toString+" : dt_clsf_chce is null" );
}else{
	System.out.println(this.toString+" : dt_clsf_chce is "+dt_clsf_chce );
}
String chrgcnfmyn = req.getParameter("chrgcnfmyn");
if( chrgcnfmyn == null){
	System.out.println(this.toString+" : chrgcnfmyn is null" );
}else{
	System.out.println(this.toString+" : chrgcnfmyn is "+chrgcnfmyn );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));
String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));
String closyn = Util.checkString(req.getParameter("closyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String dt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf")));
String dt_clsf_chce = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf_chce")));
String chrgcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("chrgcnfmyn")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setDt_clsf(dt_clsf);
dm.setDt_clsf_chce(dt_clsf_chce);
dm.setChrgcnfmyn(chrgcnfmyn);
dm.setClosyn(closyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 21 12:06:44 KST 2009 */