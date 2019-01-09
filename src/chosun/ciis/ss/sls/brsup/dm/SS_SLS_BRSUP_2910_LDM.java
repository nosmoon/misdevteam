/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2910_LDM.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리
* 작성일자 : 2016-05-02
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *
 */


public class SS_SLS_BRSUP_2910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String stafclsfcd;
	public String cntrstatcd;
	public String stafno;
	public String stafnm;
	public String prn;
	public String ernno;
	public String stmm;
	public String edmm;
	public String flag;

	public SS_SLS_BRSUP_2910_LDM(){}
	public SS_SLS_BRSUP_2910_LDM(String deptcd, String partcd, String areacd, String bocd, String stafclsfcd, String cntrstatcd, String stafno, String stafnm, String prn, String ernno, String stmm, String edmm, String flag){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.stafclsfcd = stafclsfcd;
		this.cntrstatcd = cntrstatcd;
		this.stafno = stafno;
		this.stafnm = stafnm;
		this.prn = prn;
		this.ernno = ernno;
		this.stmm = stmm;
		this.edmm = edmm;
		this.flag = flag;
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

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setStmm(String stmm){
		this.stmm = stmm;
	}

	public void setEdmm(String edmm){
		this.edmm = edmm;
	}

	public void setFlag(String flag){
		this.flag = flag;
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

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getStmm(){
		return this.stmm;
	}

	public String getEdmm(){
		return this.edmm;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_BRSUP_2910_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRSUP_2910_LDM dm = (SS_SLS_BRSUP_2910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.stafclsfcd);
		cstmt.setString(8, dm.cntrstatcd);
		cstmt.setString(9, dm.stafno);
		cstmt.setString(10, dm.stafnm);
		cstmt.setString(11, dm.prn);
		cstmt.setString(12, dm.ernno);
		cstmt.setString(13, dm.stmm);
		cstmt.setString(14, dm.edmm);
		cstmt.setString(15, dm.flag);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_SLS_BRSUP_2910_LDataSet();
	}



    public void print(){
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("partcd = " + getPartcd());
        System.out.println("areacd = " + getAreacd());
        System.out.println("bocd = " + getBocd());
        System.out.println("stafclsfcd = " + getStafclsfcd());
        System.out.println("cntrstatcd = " + getCntrstatcd());
        System.out.println("stafno = " + getStafno());
        System.out.println("stafnm = " + getStafnm());
        System.out.println("prn = " + getPrn());
        System.out.println("ernno = " + getErnno());
        System.out.println("stmm = " + getStmm());
        System.out.println("edmm = " + getEdmm());
        System.out.println("flag = " + getFlag());
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
String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String cntrstatcd = req.getParameter("cntrstatcd");
if( cntrstatcd == null){
	System.out.println(this.toString+" : cntrstatcd is null" );
}else{
	System.out.println(this.toString+" : cntrstatcd is "+cntrstatcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ernno = req.getParameter("ernno");
if( ernno == null){
	System.out.println(this.toString+" : ernno is null" );
}else{
	System.out.println(this.toString+" : ernno is "+ernno );
}
String stmm = req.getParameter("stmm");
if( stmm == null){
	System.out.println(this.toString+" : stmm is null" );
}else{
	System.out.println(this.toString+" : stmm is "+stmm );
}
String edmm = req.getParameter("edmm");
if( edmm == null){
	System.out.println(this.toString+" : edmm is null" );
}else{
	System.out.println(this.toString+" : edmm is "+edmm );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String stmm = Util.checkString(req.getParameter("stmm"));
String edmm = Util.checkString(req.getParameter("edmm"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String cntrstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrstatcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String stmm = Util.Uni2Ksc(Util.checkString(req.getParameter("stmm")));
String edmm = Util.Uni2Ksc(Util.checkString(req.getParameter("edmm")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setStafclsfcd(stafclsfcd);
dm.setCntrstatcd(cntrstatcd);
dm.setStafno(stafno);
dm.setStafnm(stafnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setStmm(stmm);
dm.setEdmm(edmm);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 18:09:37 KST 2016 */