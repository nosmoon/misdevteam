/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_RDR_DSCTSTATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromtogb;
	public String frdt;
	public String todt;
	public String dscttypecd;
	public String bocnfmyn;
	public String boprocyn;
	public String acpnpathcd;
	public String schflag;
	public String medicd;
	public String schlevel;
	public String stflev;

	public SS_L_RDR_DSCTSTATDM(){}
	public SS_L_RDR_DSCTSTATDM(String deptcd, String partcd, String areacd, String bocd, String fromtogb, String frdt, String todt, String dscttypecd, String bocnfmyn, String boprocyn, String acpnpathcd, String schflag, String medicd, String schlevel, String stflev){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromtogb = fromtogb;
		this.frdt = frdt;
		this.todt = todt;
		this.dscttypecd = dscttypecd;
		this.bocnfmyn = bocnfmyn;
		this.boprocyn = boprocyn;
		this.acpnpathcd = acpnpathcd;
		this.schflag = schflag;
		this.medicd = medicd;
		this.schlevel = schlevel;
		this.stflev = stflev;
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

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setSchflag(String schflag){
		this.schflag = schflag;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public void setStflev(String stflev){
		this.stflev = stflev;
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

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public String getSchflag(){
		return this.schflag;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getStflev(){
		return this.stflev;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_RDR_DSCTSTAT(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_DSCTSTATDM dm = (SS_L_RDR_DSCTSTATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromtogb);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.dscttypecd);
		cstmt.setString(11, dm.bocnfmyn);
		cstmt.setString(12, dm.boprocyn);
		cstmt.setString(13, dm.acpnpathcd);
		cstmt.setString(14, dm.schflag);
		cstmt.setString(15, dm.medicd);
		cstmt.setString(16, dm.schlevel);
		cstmt.setString(17, dm.stflev);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTSTATDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fromtogb = [" + getFromtogb() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dscttypecd = [" + getDscttypecd() + "]");
		System.out.println("bocnfmyn = [" + getBocnfmyn() + "]");
		System.out.println("boprocyn = [" + getBoprocyn() + "]");
		System.out.println("acpnpathcd = [" + getAcpnpathcd() + "]");
		System.out.println("schflag = [" + getSchflag() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("schlevel = [" + getSchlevel() + "]");
		System.out.println("stflev = [" + getStflev() + "]");
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
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String bocnfmyn = req.getParameter("bocnfmyn");
if( bocnfmyn == null){
	System.out.println(this.toString+" : bocnfmyn is null" );
}else{
	System.out.println(this.toString+" : bocnfmyn is "+bocnfmyn );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String acpnpathcd = req.getParameter("acpnpathcd");
if( acpnpathcd == null){
	System.out.println(this.toString+" : acpnpathcd is null" );
}else{
	System.out.println(this.toString+" : acpnpathcd is "+acpnpathcd );
}
String schflag = req.getParameter("schflag");
if( schflag == null){
	System.out.println(this.toString+" : schflag is null" );
}else{
	System.out.println(this.toString+" : schflag is "+schflag );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
String stflev = req.getParameter("stflev");
if( stflev == null){
	System.out.println(this.toString+" : stflev is null" );
}else{
	System.out.println(this.toString+" : stflev is "+stflev );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));
String schflag = Util.checkString(req.getParameter("schflag"));
String medicd = Util.checkString(req.getParameter("medicd"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
String stflev = Util.checkString(req.getParameter("stflev"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String acpnpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnpathcd")));
String schflag = Util.Uni2Ksc(Util.checkString(req.getParameter("schflag")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
String stflev = Util.Uni2Ksc(Util.checkString(req.getParameter("stflev")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromtogb(fromtogb);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDscttypecd(dscttypecd);
dm.setBocnfmyn(bocnfmyn);
dm.setBoprocyn(boprocyn);
dm.setAcpnpathcd(acpnpathcd);
dm.setSchflag(schflag);
dm.setMedicd(medicd);
dm.setSchlevel(schlevel);
dm.setStflev(stflev);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 13 11:21:51 KST 2015 */