/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-판촉현황-판촉물재고현황 통합출고등록 물품신규등록 저장  
* 작성일자 :2009/06/19
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
 * 지국지원-판촉현황-판촉물재고현황 통합출고등록 물품신규등록 저장  
 */

public class SS_I_BNSITEMTOTALOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String chgpers;
	public String bns_itemcd;
	public String inoutdt;
	public String no_valqunt;
	public String valqunt;
	public String remk;
	public String uprc;

	public SS_I_BNSITEMTOTALOUTDM(){}
	public SS_I_BNSITEMTOTALOUTDM(String cmpycd, String incmgpers, String chgpers, String bns_itemcd, String inoutdt, String no_valqunt, String valqunt, String remk, String uprc){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.chgpers = chgpers;
		this.bns_itemcd = bns_itemcd;
		this.inoutdt = inoutdt;
		this.no_valqunt = no_valqunt;
		this.valqunt = valqunt;
		this.remk = remk;
		this.uprc = uprc;
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

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setInoutdt(String inoutdt){
		this.inoutdt = inoutdt;
	}

	public void setNo_valqunt(String no_valqunt){
		this.no_valqunt = no_valqunt;
	}

	public void setValqunt(String valqunt){
		this.valqunt = valqunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
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

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getInoutdt(){
		return this.inoutdt;
	}

	public String getNo_valqunt(){
		return this.no_valqunt;
	}

	public String getValqunt(){
		return this.valqunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_BNSITEMTOTALOUT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_BNSITEMTOTALOUTDM dm = (SS_I_BNSITEMTOTALOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.chgpers);
		cstmt.setString(6, dm.bns_itemcd);
		cstmt.setString(7, dm.inoutdt);
		cstmt.setString(8, dm.no_valqunt);
		cstmt.setString(9, dm.valqunt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.uprc);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_BNSITEMTOTALOUTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String inoutdt = req.getParameter("inoutdt");
if( inoutdt == null){
	System.out.println(this.toString+" : inoutdt is null" );
}else{
	System.out.println(this.toString+" : inoutdt is "+inoutdt );
}
String no_valqunt = req.getParameter("no_valqunt");
if( no_valqunt == null){
	System.out.println(this.toString+" : no_valqunt is null" );
}else{
	System.out.println(this.toString+" : no_valqunt is "+no_valqunt );
}
String valqunt = req.getParameter("valqunt");
if( valqunt == null){
	System.out.println(this.toString+" : valqunt is null" );
}else{
	System.out.println(this.toString+" : valqunt is "+valqunt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String inoutdt = Util.checkString(req.getParameter("inoutdt"));
String no_valqunt = Util.checkString(req.getParameter("no_valqunt"));
String valqunt = Util.checkString(req.getParameter("valqunt"));
String remk = Util.checkString(req.getParameter("remk"));
String uprc = Util.checkString(req.getParameter("uprc"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
String no_valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqunt")));
String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setChgpers(chgpers);
dm.setBns_itemcd(bns_itemcd);
dm.setInoutdt(inoutdt);
dm.setNo_valqunt(no_valqunt);
dm.setValqunt(valqunt);
dm.setRemk(remk);
dm.setUprc(uprc);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 19 22:15:12 PDT 2009 */