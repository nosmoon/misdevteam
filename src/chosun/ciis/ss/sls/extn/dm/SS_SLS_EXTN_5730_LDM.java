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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5730_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromtogb;
	public String fromdt;
	public String todt;
	public String rdrnm;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public String subsyn;
	public String dn_fr_yymm1;
	public String dn_fr_yymm2;
	public String dn_to_yymm1;
	public String dn_to_yymm2;
	public String subscrpt_cd;
	public String subscrpt_gb;

	public SS_SLS_EXTN_5730_LDM(){}
	public SS_SLS_EXTN_5730_LDM(String deptcd, String partcd, String areacd, String bocd, String fromtogb, String fromdt, String todt, String rdrnm, String bo_headcnfmyn, String subscnfmstatcd, String subsyn, String dn_fr_yymm1, String dn_fr_yymm2, String dn_to_yymm1, String dn_to_yymm2, String subscrpt_cd, String subscrpt_gb){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromtogb = fromtogb;
		this.fromdt = fromdt;
		this.todt = todt;
		this.rdrnm = rdrnm;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.subscnfmstatcd = subscnfmstatcd;
		this.subsyn = subsyn;
		this.dn_fr_yymm1 = dn_fr_yymm1;
		this.dn_fr_yymm2 = dn_fr_yymm2;
		this.dn_to_yymm1 = dn_to_yymm1;
		this.dn_to_yymm2 = dn_to_yymm2;
		this.subscrpt_cd = subscrpt_cd;
		this.subscrpt_gb = subscrpt_gb;
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

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setSubsyn(String subsyn){
		this.subsyn = subsyn;
	}

	public void setDn_fr_yymm1(String dn_fr_yymm1){
		this.dn_fr_yymm1 = dn_fr_yymm1;
	}

	public void setDn_fr_yymm2(String dn_fr_yymm2){
		this.dn_fr_yymm2 = dn_fr_yymm2;
	}

	public void setDn_to_yymm1(String dn_to_yymm1){
		this.dn_to_yymm1 = dn_to_yymm1;
	}

	public void setDn_to_yymm2(String dn_to_yymm2){
		this.dn_to_yymm2 = dn_to_yymm2;
	}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setSubscrpt_gb(String subscrpt_gb){
		this.subscrpt_gb = subscrpt_gb;
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

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getSubsyn(){
		return this.subsyn;
	}

	public String getDn_fr_yymm1(){
		return this.dn_fr_yymm1;
	}

	public String getDn_fr_yymm2(){
		return this.dn_fr_yymm2;
	}

	public String getDn_to_yymm1(){
		return this.dn_to_yymm1;
	}

	public String getDn_to_yymm2(){
		return this.dn_to_yymm2;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getSubscrpt_gb(){
		return this.subscrpt_gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5730_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5730_LDM dm = (SS_SLS_EXTN_5730_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromtogb);
		cstmt.setString(8, dm.fromdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setString(11, dm.bo_headcnfmyn);
		cstmt.setString(12, dm.subscnfmstatcd);
		cstmt.setString(13, dm.subsyn);
		cstmt.setString(14, dm.dn_fr_yymm1);
		cstmt.setString(15, dm.dn_fr_yymm2);
		cstmt.setString(16, dm.dn_to_yymm1);
		cstmt.setString(17, dm.dn_to_yymm2);
		cstmt.setString(18, dm.subscrpt_cd);
		cstmt.setString(19, dm.subscrpt_gb);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5730_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fromtogb = [" + getFromtogb() + "]");
		System.out.println("fromdt = [" + getFromdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("bo_headcnfmyn = [" + getBo_headcnfmyn() + "]");
		System.out.println("subscnfmstatcd = [" + getSubscnfmstatcd() + "]");
		System.out.println("subsyn = [" + getSubsyn() + "]");
		System.out.println("dn_fr_yymm1 = [" + getDn_fr_yymm1() + "]");
		System.out.println("dn_fr_yymm2 = [" + getDn_fr_yymm2() + "]");
		System.out.println("dn_to_yymm1 = [" + getDn_to_yymm1() + "]");
		System.out.println("dn_to_yymm2 = [" + getDn_to_yymm2() + "]");
		System.out.println("subscrpt_cd = [" + getSubscrpt_cd() + "]");
		System.out.println("subscrpt_gb = [" + getSubscrpt_gb() + "]");
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
String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String bo_headcnfmyn = req.getParameter("bo_headcnfmyn");
if( bo_headcnfmyn == null){
	System.out.println(this.toString+" : bo_headcnfmyn is null" );
}else{
	System.out.println(this.toString+" : bo_headcnfmyn is "+bo_headcnfmyn );
}
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
}
String subsyn = req.getParameter("subsyn");
if( subsyn == null){
	System.out.println(this.toString+" : subsyn is null" );
}else{
	System.out.println(this.toString+" : subsyn is "+subsyn );
}
String dn_fr_yymm1 = req.getParameter("dn_fr_yymm1");
if( dn_fr_yymm1 == null){
	System.out.println(this.toString+" : dn_fr_yymm1 is null" );
}else{
	System.out.println(this.toString+" : dn_fr_yymm1 is "+dn_fr_yymm1 );
}
String dn_fr_yymm2 = req.getParameter("dn_fr_yymm2");
if( dn_fr_yymm2 == null){
	System.out.println(this.toString+" : dn_fr_yymm2 is null" );
}else{
	System.out.println(this.toString+" : dn_fr_yymm2 is "+dn_fr_yymm2 );
}
String dn_to_yymm1 = req.getParameter("dn_to_yymm1");
if( dn_to_yymm1 == null){
	System.out.println(this.toString+" : dn_to_yymm1 is null" );
}else{
	System.out.println(this.toString+" : dn_to_yymm1 is "+dn_to_yymm1 );
}
String dn_to_yymm2 = req.getParameter("dn_to_yymm2");
if( dn_to_yymm2 == null){
	System.out.println(this.toString+" : dn_to_yymm2 is null" );
}else{
	System.out.println(this.toString+" : dn_to_yymm2 is "+dn_to_yymm2 );
}
String subscrpt_cd = req.getParameter("subscrpt_cd");
if( subscrpt_cd == null){
	System.out.println(this.toString+" : subscrpt_cd is null" );
}else{
	System.out.println(this.toString+" : subscrpt_cd is "+subscrpt_cd );
}
String subscrpt_gb = req.getParameter("subscrpt_gb");
if( subscrpt_gb == null){
	System.out.println(this.toString+" : subscrpt_gb is null" );
}else{
	System.out.println(this.toString+" : subscrpt_gb is "+subscrpt_gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String subsyn = Util.checkString(req.getParameter("subsyn"));
String dn_fr_yymm1 = Util.checkString(req.getParameter("dn_fr_yymm1"));
String dn_fr_yymm2 = Util.checkString(req.getParameter("dn_fr_yymm2"));
String dn_to_yymm1 = Util.checkString(req.getParameter("dn_to_yymm1"));
String dn_to_yymm2 = Util.checkString(req.getParameter("dn_to_yymm2"));
String subscrpt_cd = Util.checkString(req.getParameter("subscrpt_cd"));
String subscrpt_gb = Util.checkString(req.getParameter("subscrpt_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
String dn_fr_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm1")));
String dn_fr_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm2")));
String dn_to_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm1")));
String dn_to_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm2")));
String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
String subscrpt_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromtogb(fromtogb);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setRdrnm(rdrnm);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setSubsyn(subsyn);
dm.setDn_fr_yymm1(dn_fr_yymm1);
dm.setDn_fr_yymm2(dn_fr_yymm2);
dm.setDn_to_yymm1(dn_to_yymm1);
dm.setDn_to_yymm2(dn_to_yymm2);
dm.setSubscrpt_cd(subscrpt_cd);
dm.setSubscrpt_gb(subscrpt_gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 10 17:10:34 KST 2018 */