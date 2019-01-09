/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-판촉현황-판촉물재고현황 추후배분 건에 대한 사후 정산
* 작성일자 : 2009/05/15
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
 * 지국지원-판촉현황-판촉물재고현황 추후배분 건에 대한 사후 정산
 */

public class SS_I_POPAFTERBNSITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String bns_itemcd;
	public String whcd;
	public String seq;
	public String chgpers;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String no_valqunt;
	public String valqunt;
	public String inoutdt;
	public String uprc;
	public String nosumqunt;
	public String sumqunt;
	public String remk;

	public SS_I_POPAFTERBNSITEMDM(){}
	public SS_I_POPAFTERBNSITEMDM(String cmpycd, String incmgpers, String bns_itemcd, String whcd, String seq, String chgpers, String deptcd, String partcd, String areacd, String bocd, String no_valqunt, String valqunt, String inoutdt, String uprc, String nosumqunt, String sumqunt, String remk){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.bns_itemcd = bns_itemcd;
		this.whcd = whcd;
		this.seq = seq;
		this.chgpers = chgpers;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.no_valqunt = no_valqunt;
		this.valqunt = valqunt;
		this.inoutdt = inoutdt;
		this.uprc = uprc;
		this.nosumqunt = nosumqunt;
		this.sumqunt = sumqunt;
		this.remk = remk;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setWhcd(String whcd){
		this.whcd = whcd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
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

	public void setNo_valqunt(String no_valqunt){
		this.no_valqunt = no_valqunt;
	}

	public void setValqunt(String valqunt){
		this.valqunt = valqunt;
	}

	public void setInoutdt(String inoutdt){
		this.inoutdt = inoutdt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setNosumqunt(String nosumqunt){
		this.nosumqunt = nosumqunt;
	}

	public void setSumqunt(String sumqunt){
		this.sumqunt = sumqunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getWhcd(){
		return this.whcd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChgpers(){
		return this.chgpers;
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

	public String getNo_valqunt(){
		return this.no_valqunt;
	}

	public String getValqunt(){
		return this.valqunt;
	}

	public String getInoutdt(){
		return this.inoutdt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getNosumqunt(){
		return this.nosumqunt;
	}

	public String getSumqunt(){
		return this.sumqunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_POPAFTERBNSITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_POPAFTERBNSITEMDM dm = (SS_I_POPAFTERBNSITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bns_itemcd);
		cstmt.setString(6, dm.whcd);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.chgpers);
		cstmt.setString(9, dm.deptcd);
		cstmt.setString(10, dm.partcd);
		cstmt.setString(11, dm.areacd);
		cstmt.setString(12, dm.bocd);
		cstmt.setString(13, dm.no_valqunt);
		cstmt.setString(14, dm.valqunt);
		cstmt.setString(15, dm.inoutdt);
		cstmt.setString(16, dm.uprc);
		cstmt.setString(17, dm.nosumqunt);
		cstmt.setString(18, dm.sumqunt);
		cstmt.setString(19, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_POPAFTERBNSITEMDataSet();
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
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
String nosumqunt = req.getParameter("nosumqunt");
if( nosumqunt == null){
	System.out.println(this.toString+" : nosumqunt is null" );
}else{
	System.out.println(this.toString+" : nosumqunt is "+nosumqunt );
}
String sumqunt = req.getParameter("sumqunt");
if( sumqunt == null){
	System.out.println(this.toString+" : sumqunt is null" );
}else{
	System.out.println(this.toString+" : sumqunt is "+sumqunt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String whcd = Util.checkString(req.getParameter("whcd"));
String seq = Util.checkString(req.getParameter("seq"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String no_valqunt = Util.checkString(req.getParameter("no_valqunt"));
String valqunt = Util.checkString(req.getParameter("valqunt"));
String inoutdt = Util.checkString(req.getParameter("inoutdt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String nosumqunt = Util.checkString(req.getParameter("nosumqunt"));
String sumqunt = Util.checkString(req.getParameter("sumqunt"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String no_valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqunt")));
String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String nosumqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("nosumqunt")));
String sumqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("sumqunt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setBns_itemcd(bns_itemcd);
dm.setWhcd(whcd);
dm.setSeq(seq);
dm.setChgpers(chgpers);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setNo_valqunt(no_valqunt);
dm.setValqunt(valqunt);
dm.setInoutdt(inoutdt);
dm.setUprc(uprc);
dm.setNosumqunt(nosumqunt);
dm.setSumqunt(sumqunt);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 17:30:17 PDT 2009 */