/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업저장
* 작성일자 : 2009-05-07
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
 * 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업저장
 */

public class SS_I_POPINBNSITEMINOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bns_itemcd;
	public String whcd;
	public String inoutdt;
	public String uprc;
	public String unit;
	public String qunt;
	public String remk;
	public String incmgpers;
	public String chgpers;

	public SS_I_POPINBNSITEMINOUTDM(){}
	public SS_I_POPINBNSITEMINOUTDM(String cmpycd, String bns_itemcd, String whcd, String inoutdt, String uprc, String unit, String qunt, String remk, String incmgpers, String chgpers){
		this.cmpycd = cmpycd;
		this.bns_itemcd = bns_itemcd;
		this.whcd = whcd;
		this.inoutdt = inoutdt;
		this.uprc = uprc;
		this.unit = unit;
		this.qunt = qunt;
		this.remk = remk;
		this.incmgpers = incmgpers;
		this.chgpers = chgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setWhcd(String whcd){
		this.whcd = whcd;
	}

	public void setInoutdt(String inoutdt){
		this.inoutdt = inoutdt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getWhcd(){
		return this.whcd;
	}

	public String getInoutdt(){
		return this.inoutdt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_POPINBNSITEMINOUT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_POPINBNSITEMINOUTDM dm = (SS_I_POPINBNSITEMINOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bns_itemcd);
		cstmt.setString(5, dm.whcd);
		cstmt.setString(6, dm.inoutdt);
		cstmt.setString(7, dm.uprc);
		cstmt.setString(8, dm.unit);
		cstmt.setString(9, dm.qunt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.incmgpers);
		cstmt.setString(12, dm.chgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_POPINBNSITEMINOUTDataSet();
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
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String whcd = req.getParameter("whcd");
if( whcd == null){
	System.out.println(this.toString+" : whcd is null" );
}else{
	System.out.println(this.toString+" : whcd is "+whcd );
}
String inoutdt = req.getParameter("inoutdt");
if( inoutdt == null){
	System.out.println(this.toString+" : inoutdt is null" );
}else{
	System.out.println(this.toString+" : inoutdt is "+inoutdt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String whcd = Util.checkString(req.getParameter("whcd"));
String inoutdt = Util.checkString(req.getParameter("inoutdt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String unit = Util.checkString(req.getParameter("unit"));
String qunt = Util.checkString(req.getParameter("qunt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBns_itemcd(bns_itemcd);
dm.setWhcd(whcd);
dm.setInoutdt(inoutdt);
dm.setUprc(uprc);
dm.setUnit(unit);
dm.setQunt(qunt);
dm.setRemk(remk);
dm.setIncmgpers(incmgpers);
dm.setChgpers(chgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 13:26:01 PDT 2009 */