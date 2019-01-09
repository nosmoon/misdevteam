/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원 신문지원물품 신청의 출고등록  
* 작성일자 :2009/07/03  
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
 * 지국지원-신문지원물품-신청-출고등록 
 */

public class SS_I_NWSPITEMSEND_BNSOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String chgpers;
	public String bns_itemcd;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String inoutdt;
	public String valqunt;
	public String uprc;
	public String aplcdt;
	public String aplcno;

	public SS_I_NWSPITEMSEND_BNSOUTDM(){}
	public SS_I_NWSPITEMSEND_BNSOUTDM(String cmpycd, String incmgpers, String chgpers, String bns_itemcd, String deptcd, String partcd, String areacd, String bocd, String inoutdt, String valqunt, String uprc, String aplcdt, String aplcno){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.chgpers = chgpers;
		this.bns_itemcd = bns_itemcd;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.inoutdt = inoutdt;
		this.valqunt = valqunt;
		this.uprc = uprc;
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
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

	public void setInoutdt(String inoutdt){
		this.inoutdt = inoutdt;
	}

	public void setValqunt(String valqunt){
		this.valqunt = valqunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
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

	public String getInoutdt(){
		return this.inoutdt;
	}

	public String getValqunt(){
		return this.valqunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_NWSPITEMSEND_BNSOUT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_NWSPITEMSEND_BNSOUTDM dm = (SS_I_NWSPITEMSEND_BNSOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.chgpers);
		cstmt.setString(6, dm.bns_itemcd);
		cstmt.setString(7, dm.deptcd);
		cstmt.setString(8, dm.partcd);
		cstmt.setString(9, dm.areacd);
		cstmt.setString(10, dm.bocd);
		cstmt.setString(11, dm.inoutdt);
		cstmt.setString(12, dm.valqunt);
		cstmt.setString(13, dm.uprc);
		cstmt.setString(14, dm.aplcdt);
		cstmt.setString(15, dm.aplcno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_NWSPITEMSEND_BNSOUTDataSet();
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
String inoutdt = req.getParameter("inoutdt");
if( inoutdt == null){
	System.out.println(this.toString+" : inoutdt is null" );
}else{
	System.out.println(this.toString+" : inoutdt is "+inoutdt );
}
String valqunt = req.getParameter("valqunt");
if( valqunt == null){
	System.out.println(this.toString+" : valqunt is null" );
}else{
	System.out.println(this.toString+" : valqunt is "+valqunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String inoutdt = Util.checkString(req.getParameter("inoutdt"));
String valqunt = Util.checkString(req.getParameter("valqunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setChgpers(chgpers);
dm.setBns_itemcd(bns_itemcd);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setInoutdt(inoutdt);
dm.setValqunt(valqunt);
dm.setUprc(uprc);
dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 16:43:29 PDT 2009 */