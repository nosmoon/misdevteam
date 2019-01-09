/***************************************************************************************************
 * 파일명   : SL_L_GIRORECPDM.java
 * 기능     : 지국지원-빌링-지로EDI
 * 작성일자 : 2007/02/22
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SL_L_GIRORECP
**/

public class SL_L_GIRORECPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String ordcond;
	public String medicd;
	public String erryn;
	public String acqdt;
	public long pageno;
	public long pagesize;
	public String recpclsf;

	public SL_L_GIRORECPDM(){}
	public SL_L_GIRORECPDM(String bocd, String ordcond, String medicd, String erryn, String acqdt, long pageno, long pagesize, String recpclsf){
		this.bocd = bocd;
		this.ordcond = ordcond;
		this.medicd = medicd;
		this.erryn = erryn;
		this.acqdt = acqdt;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.recpclsf = recpclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setOrdcond(String ordcond){
		this.ordcond = ordcond;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getOrdcond(){
		return this.ordcond;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_GIRORECP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_GIRORECPDM dm = (SL_L_GIRORECPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.ordcond);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.erryn);
		cstmt.setString(7, dm.acqdt);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.setString(10, dm.recpclsf);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, Types.INTEGER);
		cstmt.registerOutParameter(25, Types.INTEGER);
		cstmt.registerOutParameter(26, Types.INTEGER);
		cstmt.registerOutParameter(27, Types.INTEGER);
		cstmt.registerOutParameter(28, Types.INTEGER);
		cstmt.registerOutParameter(29, Types.INTEGER);
		cstmt.registerOutParameter(30, Types.INTEGER);
		cstmt.registerOutParameter(31, Types.INTEGER);
		cstmt.registerOutParameter(32, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SL_L_GIRORECPDataSet();
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
String ordcond = req.getParameter("ordcond");
if( ordcond == null){
	System.out.println(this.toString+" : ordcond is null" );
}else{
	System.out.println(this.toString+" : ordcond is "+ordcond );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String erryn = req.getParameter("erryn");
if( erryn == null){
	System.out.println(this.toString+" : erryn is null" );
}else{
	System.out.println(this.toString+" : erryn is "+erryn );
}
String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
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
String recpclsf = req.getParameter("recpclsf");
if( recpclsf == null){
	System.out.println(this.toString+" : recpclsf is null" );
}else{
	System.out.println(this.toString+" : recpclsf is "+recpclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String ordcond = Util.checkString(req.getParameter("ordcond"));
String medicd = Util.checkString(req.getParameter("medicd"));
String erryn = Util.checkString(req.getParameter("erryn"));
String acqdt = Util.checkString(req.getParameter("acqdt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String recpclsf = Util.checkString(req.getParameter("recpclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String ordcond = Util.Uni2Ksc(Util.checkString(req.getParameter("ordcond")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String erryn = Util.Uni2Ksc(Util.checkString(req.getParameter("erryn")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String recpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recpclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setOrdcond(ordcond);
dm.setMedicd(medicd);
dm.setErryn(erryn);
dm.setAcqdt(acqdt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setRecpclsf(recpclsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 22 16:48:15 KST 2007 */