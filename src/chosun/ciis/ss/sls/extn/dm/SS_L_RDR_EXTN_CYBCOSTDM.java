/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_CYBCOSTDM.java
* 기능 : 확장현황-사이버확장-비용관리-목록
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-비용관리-목록
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String basidt;
	public String busnchrgclamtyn;
	public String splychrgclamtyn;

	public SS_L_RDR_EXTN_CYBCOSTDM(){}
	public SS_L_RDR_EXTN_CYBCOSTDM(String accflag, String deptcd, String areacd, String bocd, String basidt, String busnchrgclamtyn, String splychrgclamtyn){
		this.accflag = accflag;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.basidt = basidt;
		this.busnchrgclamtyn = busnchrgclamtyn;
		this.splychrgclamtyn = splychrgclamtyn;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
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

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBusnchrgclamtyn(String busnchrgclamtyn){
		this.busnchrgclamtyn = busnchrgclamtyn;
	}

	public void setSplychrgclamtyn(String splychrgclamtyn){
		this.splychrgclamtyn = splychrgclamtyn;
	}

	public String getAccflag(){
		return this.accflag;
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

	public String getBasidt(){
		return this.basidt;
	}

	public String getBusnchrgclamtyn(){
		return this.busnchrgclamtyn;
	}

	public String getSplychrgclamtyn(){
		return this.splychrgclamtyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_CYBCOST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_CYBCOSTDM dm = (SS_L_RDR_EXTN_CYBCOSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.basidt);
		cstmt.setString(8, dm.busnchrgclamtyn);
		cstmt.setString(9, dm.splychrgclamtyn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_CYBCOSTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String busnchrgclamtyn = req.getParameter("busnchrgclamtyn");
if( busnchrgclamtyn == null){
	System.out.println(this.toString+" : busnchrgclamtyn is null" );
}else{
	System.out.println(this.toString+" : busnchrgclamtyn is "+busnchrgclamtyn );
}
String splychrgclamtyn = req.getParameter("splychrgclamtyn");
if( splychrgclamtyn == null){
	System.out.println(this.toString+" : splychrgclamtyn is null" );
}else{
	System.out.println(this.toString+" : splychrgclamtyn is "+splychrgclamtyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String basidt = Util.checkString(req.getParameter("basidt"));
String busnchrgclamtyn = Util.checkString(req.getParameter("busnchrgclamtyn"));
String splychrgclamtyn = Util.checkString(req.getParameter("splychrgclamtyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String busnchrgclamtyn = Util.Uni2Ksc(Util.checkString(req.getParameter("busnchrgclamtyn")));
String splychrgclamtyn = Util.Uni2Ksc(Util.checkString(req.getParameter("splychrgclamtyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBasidt(basidt);
dm.setBusnchrgclamtyn(busnchrgclamtyn);
dm.setSplychrgclamtyn(splychrgclamtyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 16:10:52 KST 2004 */