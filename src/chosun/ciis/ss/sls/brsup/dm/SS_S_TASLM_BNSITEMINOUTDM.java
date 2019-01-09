/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템 판촉물재고현황 상세조회
* 작성일자 :2009/05/01
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템 판촉물재고현황 상세조회
 */

public class SS_S_TASLM_BNSITEMINOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemclsf;
	public String itemcd;
	public String bns_itemcd;
	public String itemnm;
	public String unit;
	public String mainware;
	public String pyungware;
	public String sungware;
	public String remk;
	public String cmpycd;
	public String incmgpers;
	public String chgpers;

	public SS_S_TASLM_BNSITEMINOUTDM(){}
	public SS_S_TASLM_BNSITEMINOUTDM(String itemclsf, String itemcd, String bns_itemcd, String itemnm, String unit, String mainware, String pyungware, String sungware, String remk, String cmpycd, String incmgpers, String chgpers){
		this.itemclsf = itemclsf;
		this.itemcd = itemcd;
		this.bns_itemcd = bns_itemcd;
		this.itemnm = itemnm;
		this.unit = unit;
		this.mainware = mainware;
		this.pyungware = pyungware;
		this.sungware = sungware;
		this.remk = remk;
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.chgpers = chgpers;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setMainware(String mainware){
		this.mainware = mainware;
	}

	public void setPyungware(String pyungware){
		this.pyungware = pyungware;
	}

	public void setSungware(String sungware){
		this.sungware = sungware;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getMainware(){
		return this.mainware;
	}

	public String getPyungware(){
		return this.pyungware;
	}

	public String getSungware(){
		return this.sungware;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_TASLM_BNSITEMINOUT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_TASLM_BNSITEMINOUTDM dm = (SS_S_TASLM_BNSITEMINOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemclsf);
		cstmt.setString(4, dm.itemcd);
		cstmt.setString(5, dm.bns_itemcd);
		cstmt.setString(6, dm.itemnm);
		cstmt.setString(7, dm.unit);
		cstmt.setString(8, dm.mainware);
		cstmt.setString(9, dm.pyungware);
		cstmt.setString(10, dm.sungware);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.cmpycd);
		cstmt.setString(13, dm.incmgpers);
		cstmt.setString(14, dm.chgpers);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_TASLM_BNSITEMINOUTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String itemnm = req.getParameter("itemnm");
if( itemnm == null){
	System.out.println(this.toString+" : itemnm is null" );
}else{
	System.out.println(this.toString+" : itemnm is "+itemnm );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String mainware = req.getParameter("mainware");
if( mainware == null){
	System.out.println(this.toString+" : mainware is null" );
}else{
	System.out.println(this.toString+" : mainware is "+mainware );
}
String pyungware = req.getParameter("pyungware");
if( pyungware == null){
	System.out.println(this.toString+" : pyungware is null" );
}else{
	System.out.println(this.toString+" : pyungware is "+pyungware );
}
String sungware = req.getParameter("sungware");
if( sungware == null){
	System.out.println(this.toString+" : sungware is null" );
}else{
	System.out.println(this.toString+" : sungware is "+sungware );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String itemnm = Util.checkString(req.getParameter("itemnm"));
String unit = Util.checkString(req.getParameter("unit"));
String mainware = Util.checkString(req.getParameter("mainware"));
String pyungware = Util.checkString(req.getParameter("pyungware"));
String sungware = Util.checkString(req.getParameter("sungware"));
String remk = Util.checkString(req.getParameter("remk"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("itemnm")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String mainware = Util.Uni2Ksc(Util.checkString(req.getParameter("mainware")));
String pyungware = Util.Uni2Ksc(Util.checkString(req.getParameter("pyungware")));
String sungware = Util.Uni2Ksc(Util.checkString(req.getParameter("sungware")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setItemclsf(itemclsf);
dm.setItemcd(itemcd);
dm.setBns_itemcd(bns_itemcd);
dm.setItemnm(itemnm);
dm.setUnit(unit);
dm.setMainware(mainware);
dm.setPyungware(pyungware);
dm.setSungware(sungware);
dm.setRemk(remk);
dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setChgpers(chgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 09:53:09 PDT 2009 */