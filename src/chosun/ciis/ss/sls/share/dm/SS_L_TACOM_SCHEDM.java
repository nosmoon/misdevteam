/***************************************************************************************************
* 파일명 : SS_L_TACOM_SCHEDM.java
* 기능 :
* 작성일자 : 2003-
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_L_TACOM_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String use_persemp_no;
	public String schemangitemcd;
	public String schemangunitcd;
	public String use_persclsf;
	public String fr_dt;
	public String to_dt;
	public String remk;
	public String endyn;
	public String deptcd;
	public String deptnm;
	public String incmgpers;
	public String incmgdt;
	public String chgpers;
	public String chgdt;
	public long pageno;
	public long pagesize;

	public SS_L_TACOM_SCHEDM(){}
	public SS_L_TACOM_SCHEDM(String use_persemp_no, String schemangitemcd, String schemangunitcd, String use_persclsf, String fr_dt, String to_dt, String remk, String endyn, String deptcd, String deptnm, String incmgpers, String incmgdt, String chgpers, String chgdt, long pageno, long pagesize){
		this.use_persemp_no = use_persemp_no;
		this.schemangitemcd = schemangitemcd;
		this.schemangunitcd = schemangunitcd;
		this.use_persclsf = use_persclsf;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.remk = remk;
		this.endyn = endyn;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.incmgpers = incmgpers;
		this.incmgdt = incmgdt;
		this.chgpers = chgpers;
		this.chgdt = chgdt;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setUse_persemp_no(String use_persemp_no){
		this.use_persemp_no = use_persemp_no;
	}

	public void setSchemangitemcd(String schemangitemcd){
		this.schemangitemcd = schemangitemcd;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setUse_persclsf(String use_persclsf){
		this.use_persclsf = use_persclsf;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEndyn(String endyn){
		this.endyn = endyn;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getUse_persemp_no(){
		return this.use_persemp_no;
	}

	public String getSchemangitemcd(){
		return this.schemangitemcd;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getUse_persclsf(){
		return this.use_persclsf;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEndyn(){
		return this.endyn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_TACOM_SCHE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_TACOM_SCHEDM dm = (SS_L_TACOM_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.use_persemp_no);
		cstmt.setString(4, dm.schemangitemcd);
		cstmt.setString(5, dm.schemangunitcd);
		cstmt.setString(6, dm.use_persclsf);
		cstmt.setString(7, dm.fr_dt);
		cstmt.setString(8, dm.to_dt);
		cstmt.setString(9, dm.remk);
		cstmt.setString(10, dm.endyn);
		cstmt.setString(11, dm.deptcd);
		cstmt.setString(12, dm.deptnm);
		cstmt.setString(13, dm.incmgpers);
		cstmt.setString(14, dm.incmgdt);
		cstmt.setString(15, dm.chgpers);
		cstmt.setString(16, dm.chgdt);
		cstmt.setLong(17, dm.pageno);
		cstmt.setLong(18, dm.pagesize);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
		cstmt.registerOutParameter(20, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.CO_L_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String use_persemp_no = req.getParameter("use_persemp_no");
if( use_persemp_no == null){
	System.out.println(this.toString+" : use_persemp_no is null" );
}else{
	System.out.println(this.toString+" : use_persemp_no is "+use_persemp_no );
}
String schemangitemcd = req.getParameter("schemangitemcd");
if( schemangitemcd == null){
	System.out.println(this.toString+" : schemangitemcd is null" );
}else{
	System.out.println(this.toString+" : schemangitemcd is "+schemangitemcd );
}
String schemangunitcd = req.getParameter("schemangunitcd");
if( schemangunitcd == null){
	System.out.println(this.toString+" : schemangunitcd is null" );
}else{
	System.out.println(this.toString+" : schemangunitcd is "+schemangunitcd );
}
String use_persclsf = req.getParameter("use_persclsf");
if( use_persclsf == null){
	System.out.println(this.toString+" : use_persclsf is null" );
}else{
	System.out.println(this.toString+" : use_persclsf is "+use_persclsf );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String endyn = req.getParameter("endyn");
if( endyn == null){
	System.out.println(this.toString+" : endyn is null" );
}else{
	System.out.println(this.toString+" : endyn is "+endyn );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
	System.out.println(this.toString+" : deptnm is null" );
}else{
	System.out.println(this.toString+" : deptnm is "+deptnm );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
	System.out.println(this.toString+" : incmgdt is null" );
}else{
	System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
String chgdt = req.getParameter("chgdt");
if( chgdt == null){
	System.out.println(this.toString+" : chgdt is null" );
}else{
	System.out.println(this.toString+" : chgdt is "+chgdt );
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

String use_persemp_no = Util.checkString(req.getParameter("use_persemp_no"));
String schemangitemcd = Util.checkString(req.getParameter("schemangitemcd"));
String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));
String use_persclsf = Util.checkString(req.getParameter("use_persclsf"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String endyn = Util.checkString(req.getParameter("endyn"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String chgdt = Util.checkString(req.getParameter("chgdt"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUse_persemp_no(use_persemp_no);
dm.setSchemangitemcd(schemangitemcd);
dm.setSchemangunitcd(schemangunitcd);
dm.setUse_persclsf(use_persclsf);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setRemk(remk);
dm.setEndyn(endyn);
dm.setDeptcd(deptcd);
dm.setDeptnm(deptnm);
dm.setIncmgpers(incmgpers);
dm.setIncmgdt(incmgdt);
dm.setChgpers(chgpers);
dm.setChgdt(chgdt);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 21 13:51:34 KST 2003 */