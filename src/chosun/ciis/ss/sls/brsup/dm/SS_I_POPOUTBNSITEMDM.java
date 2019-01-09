/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-판촉현황-판촉물재고현황 출고추가 물품신규등록   
* 작성일자 :2009/05/11 
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
 * 지국지원-판촉현황-판촉물재고현황 출고추가 물품신규등록   
 */

public class SS_I_POPOUTBNSITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String chgpers;
	public String bns_itemcd;
	public String whcd;
	public String team;
	public String part;
	public String area;
	public String bo;
	public String aftdivnclsf;
	public String inoutdt;
	public String no_valqunt;
	public String valqunt;
	public String remk;
	public String uprc;

	public SS_I_POPOUTBNSITEMDM(){}
	public SS_I_POPOUTBNSITEMDM(String cmpycd, String incmgpers, String chgpers, String bns_itemcd, String whcd, String team, String part, String area, String bo, String aftdivnclsf, String inoutdt, String no_valqunt, String valqunt, String remk, String uprc){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.chgpers = chgpers;
		this.bns_itemcd = bns_itemcd;
		this.whcd = whcd;
		this.team = team;
		this.part = part;
		this.area = area;
		this.bo = bo;
		this.aftdivnclsf = aftdivnclsf;
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

	public void setWhcd(String whcd){
		this.whcd = whcd;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBo(String bo){
		this.bo = bo;
	}

	public void setAftdivnclsf(String aftdivnclsf){
		this.aftdivnclsf = aftdivnclsf;
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

	public String getWhcd(){
		return this.whcd;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getBo(){
		return this.bo;
	}

	public String getAftdivnclsf(){
		return this.aftdivnclsf;
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
		 return "{ call SP_SS_I_POPOUTBNSITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_POPOUTBNSITEMDM dm = (SS_I_POPOUTBNSITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.chgpers);
		cstmt.setString(6, dm.bns_itemcd);
		cstmt.setString(7, dm.whcd);
		cstmt.setString(8, dm.team);
		cstmt.setString(9, dm.part);
		cstmt.setString(10, dm.area);
		cstmt.setString(11, dm.bo);
		cstmt.setString(12, dm.aftdivnclsf);
		cstmt.setString(13, dm.inoutdt);
		cstmt.setString(14, dm.no_valqunt);
		cstmt.setString(15, dm.valqunt);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.uprc);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_POPOUTBNSITEMDataSet();
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
String whcd = req.getParameter("whcd");
if( whcd == null){
	System.out.println(this.toString+" : whcd is null" );
}else{
	System.out.println(this.toString+" : whcd is "+whcd );
}
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String part = req.getParameter("part");
if( part == null){
	System.out.println(this.toString+" : part is null" );
}else{
	System.out.println(this.toString+" : part is "+part );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String bo = req.getParameter("bo");
if( bo == null){
	System.out.println(this.toString+" : bo is null" );
}else{
	System.out.println(this.toString+" : bo is "+bo );
}
String aftdivnclsf = req.getParameter("aftdivnclsf");
if( aftdivnclsf == null){
	System.out.println(this.toString+" : aftdivnclsf is null" );
}else{
	System.out.println(this.toString+" : aftdivnclsf is "+aftdivnclsf );
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
String whcd = Util.checkString(req.getParameter("whcd"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bo = Util.checkString(req.getParameter("bo"));
String aftdivnclsf = Util.checkString(req.getParameter("aftdivnclsf"));
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
String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bo = Util.Uni2Ksc(Util.checkString(req.getParameter("bo")));
String aftdivnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aftdivnclsf")));
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
dm.setWhcd(whcd);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBo(bo);
dm.setAftdivnclsf(aftdivnclsf);
dm.setInoutdt(inoutdt);
dm.setNo_valqunt(no_valqunt);
dm.setValqunt(valqunt);
dm.setRemk(remk);
dm.setUprc(uprc);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 19:06:49 PDT 2009 */