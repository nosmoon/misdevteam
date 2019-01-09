/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3023_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt;
	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String stdmonth;
	public long rcvamt;
	public String vatcode;
	public String agentcode;
	public long agentfee;
	public String salecode;
	public String saleemp;
	public String deptcode;
	public String deptname;
	public String zpcode;
	public String zpname;
	public long stdamt;
	public long divamt;
	public long divvatamt;
	public long agentstdamt;
	public long agentdivamt;
	public long agentdivvatamt;
	public String pubc_occr_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_3023_ADM(){}
	public AD_PUB_3023_ADM(String cmpy_cd, String clos_dt, String chcode, String cuscode, String blndcode, String orgcode, String frdate, String todate, String rcvgrp, String chgcode, String stdmonth, long rcvamt, String vatcode, String agentcode, long agentfee, String salecode, String saleemp, String deptcode, String deptname, String zpcode, String zpname, long stdamt, long divamt, long divvatamt, long agentstdamt, long agentdivamt, long agentdivvatamt, String pubc_occr_dt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt = clos_dt;
		this.chcode = chcode;
		this.cuscode = cuscode;
		this.blndcode = blndcode;
		this.orgcode = orgcode;
		this.frdate = frdate;
		this.todate = todate;
		this.rcvgrp = rcvgrp;
		this.chgcode = chgcode;
		this.stdmonth = stdmonth;
		this.rcvamt = rcvamt;
		this.vatcode = vatcode;
		this.agentcode = agentcode;
		this.agentfee = agentfee;
		this.salecode = salecode;
		this.saleemp = saleemp;
		this.deptcode = deptcode;
		this.deptname = deptname;
		this.zpcode = zpcode;
		this.zpname = zpname;
		this.stdamt = stdamt;
		this.divamt = divamt;
		this.divvatamt = divvatamt;
		this.agentstdamt = agentstdamt;
		this.agentdivamt = agentdivamt;
		this.agentdivvatamt = agentdivvatamt;
		this.pubc_occr_dt = pubc_occr_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setBlndcode(String blndcode){
		this.blndcode = blndcode;
	}

	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}

	public void setFrdate(String frdate){
		this.frdate = frdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setRcvgrp(String rcvgrp){
		this.rcvgrp = rcvgrp;
	}

	public void setChgcode(String chgcode){
		this.chgcode = chgcode;
	}

	public void setStdmonth(String stdmonth){
		this.stdmonth = stdmonth;
	}

	public void setRcvamt(long rcvamt){
		this.rcvamt = rcvamt;
	}

	public void setVatcode(String vatcode){
		this.vatcode = vatcode;
	}

	public void setAgentcode(String agentcode){
		this.agentcode = agentcode;
	}

	public void setAgentfee(long agentfee){
		this.agentfee = agentfee;
	}

	public void setSalecode(String salecode){
		this.salecode = salecode;
	}

	public void setSaleemp(String saleemp){
		this.saleemp = saleemp;
	}

	public void setDeptcode(String deptcode){
		this.deptcode = deptcode;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setZpcode(String zpcode){
		this.zpcode = zpcode;
	}

	public void setZpname(String zpname){
		this.zpname = zpname;
	}

	public void setStdamt(long stdamt){
		this.stdamt = stdamt;
	}

	public void setDivamt(long divamt){
		this.divamt = divamt;
	}

	public void setDivvatamt(long divvatamt){
		this.divvatamt = divvatamt;
	}

	public void setAgentstdamt(long agentstdamt){
		this.agentstdamt = agentstdamt;
	}

	public void setAgentdivamt(long agentdivamt){
		this.agentdivamt = agentdivamt;
	}

	public void setAgentdivvatamt(long agentdivvatamt){
		this.agentdivvatamt = agentdivvatamt;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getBlndcode(){
		return this.blndcode;
	}

	public String getOrgcode(){
		return this.orgcode;
	}

	public String getFrdate(){
		return this.frdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getRcvgrp(){
		return this.rcvgrp;
	}

	public String getChgcode(){
		return this.chgcode;
	}

	public String getStdmonth(){
		return this.stdmonth;
	}

	public long getRcvamt(){
		return this.rcvamt;
	}

	public String getVatcode(){
		return this.vatcode;
	}

	public String getAgentcode(){
		return this.agentcode;
	}

	public long getAgentfee(){
		return this.agentfee;
	}

	public String getSalecode(){
		return this.salecode;
	}

	public String getSaleemp(){
		return this.saleemp;
	}

	public String getDeptcode(){
		return this.deptcode;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getZpcode(){
		return this.zpcode;
	}

	public String getZpname(){
		return this.zpname;
	}

	public long getStdamt(){
		return this.stdamt;
	}

	public long getDivamt(){
		return this.divamt;
	}

	public long getDivvatamt(){
		return this.divvatamt;
	}

	public long getAgentstdamt(){
		return this.agentstdamt;
	}

	public long getAgentdivamt(){
		return this.agentdivamt;
	}

	public long getAgentdivvatamt(){
		return this.agentdivvatamt;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3023_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3023_ADM dm = (AD_PUB_3023_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt);
		cstmt.setString(5, dm.chcode);
		cstmt.setString(6, dm.cuscode);
		cstmt.setString(7, dm.blndcode);
		cstmt.setString(8, dm.orgcode);
		cstmt.setString(9, dm.frdate);
		cstmt.setString(10, dm.todate);
		cstmt.setString(11, dm.rcvgrp);
		cstmt.setString(12, dm.chgcode);
		cstmt.setString(13, dm.stdmonth);
		cstmt.setLong(14, dm.rcvamt);
		cstmt.setString(15, dm.vatcode);
		cstmt.setString(16, dm.agentcode);
		cstmt.setLong(17, dm.agentfee);
		cstmt.setString(18, dm.salecode);
		cstmt.setString(19, dm.saleemp);
		cstmt.setString(20, dm.deptcode);
		cstmt.setString(21, dm.deptname);
		cstmt.setString(22, dm.zpcode);
		cstmt.setString(23, dm.zpname);
		cstmt.setLong(24, dm.stdamt);
		cstmt.setLong(25, dm.divamt);
		cstmt.setLong(26, dm.divvatamt);
		cstmt.setLong(27, dm.agentstdamt);
		cstmt.setLong(28, dm.agentdivamt);
		cstmt.setLong(29, dm.agentdivvatamt);
		cstmt.setString(30, dm.pubc_occr_dt);
		cstmt.setString(31, dm.incmg_pers_ip);
		cstmt.setString(32, dm.incmg_pers);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3023_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
		System.out.println("cuscode = [" + getCuscode() + "]");
		System.out.println("blndcode = [" + getBlndcode() + "]");
		System.out.println("orgcode = [" + getOrgcode() + "]");
		System.out.println("frdate = [" + getFrdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
		System.out.println("rcvgrp = [" + getRcvgrp() + "]");
		System.out.println("chgcode = [" + getChgcode() + "]");
		System.out.println("stdmonth = [" + getStdmonth() + "]");
		System.out.println("rcvamt = [" + getRcvamt() + "]");
		System.out.println("vatcode = [" + getVatcode() + "]");
		System.out.println("agentcode = [" + getAgentcode() + "]");
		System.out.println("agentfee = [" + getAgentfee() + "]");
		System.out.println("salecode = [" + getSalecode() + "]");
		System.out.println("saleemp = [" + getSaleemp() + "]");
		System.out.println("deptcode = [" + getDeptcode() + "]");
		System.out.println("deptname = [" + getDeptname() + "]");
		System.out.println("zpcode = [" + getZpcode() + "]");
		System.out.println("zpname = [" + getZpname() + "]");
		System.out.println("stdamt = [" + getStdamt() + "]");
		System.out.println("divamt = [" + getDivamt() + "]");
		System.out.println("divvatamt = [" + getDivvatamt() + "]");
		System.out.println("agentstdamt = [" + getAgentstdamt() + "]");
		System.out.println("agentdivamt = [" + getAgentdivamt() + "]");
		System.out.println("agentdivvatamt = [" + getAgentdivvatamt() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
String cuscode = req.getParameter("cuscode");
if( cuscode == null){
	System.out.println(this.toString+" : cuscode is null" );
}else{
	System.out.println(this.toString+" : cuscode is "+cuscode );
}
String blndcode = req.getParameter("blndcode");
if( blndcode == null){
	System.out.println(this.toString+" : blndcode is null" );
}else{
	System.out.println(this.toString+" : blndcode is "+blndcode );
}
String orgcode = req.getParameter("orgcode");
if( orgcode == null){
	System.out.println(this.toString+" : orgcode is null" );
}else{
	System.out.println(this.toString+" : orgcode is "+orgcode );
}
String frdate = req.getParameter("frdate");
if( frdate == null){
	System.out.println(this.toString+" : frdate is null" );
}else{
	System.out.println(this.toString+" : frdate is "+frdate );
}
String todate = req.getParameter("todate");
if( todate == null){
	System.out.println(this.toString+" : todate is null" );
}else{
	System.out.println(this.toString+" : todate is "+todate );
}
String rcvgrp = req.getParameter("rcvgrp");
if( rcvgrp == null){
	System.out.println(this.toString+" : rcvgrp is null" );
}else{
	System.out.println(this.toString+" : rcvgrp is "+rcvgrp );
}
String chgcode = req.getParameter("chgcode");
if( chgcode == null){
	System.out.println(this.toString+" : chgcode is null" );
}else{
	System.out.println(this.toString+" : chgcode is "+chgcode );
}
String stdmonth = req.getParameter("stdmonth");
if( stdmonth == null){
	System.out.println(this.toString+" : stdmonth is null" );
}else{
	System.out.println(this.toString+" : stdmonth is "+stdmonth );
}
String rcvamt = req.getParameter("rcvamt");
if( rcvamt == null){
	System.out.println(this.toString+" : rcvamt is null" );
}else{
	System.out.println(this.toString+" : rcvamt is "+rcvamt );
}
String vatcode = req.getParameter("vatcode");
if( vatcode == null){
	System.out.println(this.toString+" : vatcode is null" );
}else{
	System.out.println(this.toString+" : vatcode is "+vatcode );
}
String agentcode = req.getParameter("agentcode");
if( agentcode == null){
	System.out.println(this.toString+" : agentcode is null" );
}else{
	System.out.println(this.toString+" : agentcode is "+agentcode );
}
String agentfee = req.getParameter("agentfee");
if( agentfee == null){
	System.out.println(this.toString+" : agentfee is null" );
}else{
	System.out.println(this.toString+" : agentfee is "+agentfee );
}
String salecode = req.getParameter("salecode");
if( salecode == null){
	System.out.println(this.toString+" : salecode is null" );
}else{
	System.out.println(this.toString+" : salecode is "+salecode );
}
String saleemp = req.getParameter("saleemp");
if( saleemp == null){
	System.out.println(this.toString+" : saleemp is null" );
}else{
	System.out.println(this.toString+" : saleemp is "+saleemp );
}
String deptcode = req.getParameter("deptcode");
if( deptcode == null){
	System.out.println(this.toString+" : deptcode is null" );
}else{
	System.out.println(this.toString+" : deptcode is "+deptcode );
}
String deptname = req.getParameter("deptname");
if( deptname == null){
	System.out.println(this.toString+" : deptname is null" );
}else{
	System.out.println(this.toString+" : deptname is "+deptname );
}
String zpcode = req.getParameter("zpcode");
if( zpcode == null){
	System.out.println(this.toString+" : zpcode is null" );
}else{
	System.out.println(this.toString+" : zpcode is "+zpcode );
}
String zpname = req.getParameter("zpname");
if( zpname == null){
	System.out.println(this.toString+" : zpname is null" );
}else{
	System.out.println(this.toString+" : zpname is "+zpname );
}
String stdamt = req.getParameter("stdamt");
if( stdamt == null){
	System.out.println(this.toString+" : stdamt is null" );
}else{
	System.out.println(this.toString+" : stdamt is "+stdamt );
}
String divamt = req.getParameter("divamt");
if( divamt == null){
	System.out.println(this.toString+" : divamt is null" );
}else{
	System.out.println(this.toString+" : divamt is "+divamt );
}
String divvatamt = req.getParameter("divvatamt");
if( divvatamt == null){
	System.out.println(this.toString+" : divvatamt is null" );
}else{
	System.out.println(this.toString+" : divvatamt is "+divvatamt );
}
String agentstdamt = req.getParameter("agentstdamt");
if( agentstdamt == null){
	System.out.println(this.toString+" : agentstdamt is null" );
}else{
	System.out.println(this.toString+" : agentstdamt is "+agentstdamt );
}
String agentdivamt = req.getParameter("agentdivamt");
if( agentdivamt == null){
	System.out.println(this.toString+" : agentdivamt is null" );
}else{
	System.out.println(this.toString+" : agentdivamt is "+agentdivamt );
}
String agentdivvatamt = req.getParameter("agentdivvatamt");
if( agentdivvatamt == null){
	System.out.println(this.toString+" : agentdivvatamt is null" );
}else{
	System.out.println(this.toString+" : agentdivvatamt is "+agentdivvatamt );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String chcode = Util.checkString(req.getParameter("chcode"));
String cuscode = Util.checkString(req.getParameter("cuscode"));
String blndcode = Util.checkString(req.getParameter("blndcode"));
String orgcode = Util.checkString(req.getParameter("orgcode"));
String frdate = Util.checkString(req.getParameter("frdate"));
String todate = Util.checkString(req.getParameter("todate"));
String rcvgrp = Util.checkString(req.getParameter("rcvgrp"));
String chgcode = Util.checkString(req.getParameter("chgcode"));
String stdmonth = Util.checkString(req.getParameter("stdmonth"));
String rcvamt = Util.checkString(req.getParameter("rcvamt"));
String vatcode = Util.checkString(req.getParameter("vatcode"));
String agentcode = Util.checkString(req.getParameter("agentcode"));
String agentfee = Util.checkString(req.getParameter("agentfee"));
String salecode = Util.checkString(req.getParameter("salecode"));
String saleemp = Util.checkString(req.getParameter("saleemp"));
String deptcode = Util.checkString(req.getParameter("deptcode"));
String deptname = Util.checkString(req.getParameter("deptname"));
String zpcode = Util.checkString(req.getParameter("zpcode"));
String zpname = Util.checkString(req.getParameter("zpname"));
String stdamt = Util.checkString(req.getParameter("stdamt"));
String divamt = Util.checkString(req.getParameter("divamt"));
String divvatamt = Util.checkString(req.getParameter("divvatamt"));
String agentstdamt = Util.checkString(req.getParameter("agentstdamt"));
String agentdivamt = Util.checkString(req.getParameter("agentdivamt"));
String agentdivvatamt = Util.checkString(req.getParameter("agentdivvatamt"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
String cuscode = Util.Uni2Ksc(Util.checkString(req.getParameter("cuscode")));
String blndcode = Util.Uni2Ksc(Util.checkString(req.getParameter("blndcode")));
String orgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("orgcode")));
String frdate = Util.Uni2Ksc(Util.checkString(req.getParameter("frdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
String rcvgrp = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvgrp")));
String chgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chgcode")));
String stdmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("stdmonth")));
String rcvamt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvamt")));
String vatcode = Util.Uni2Ksc(Util.checkString(req.getParameter("vatcode")));
String agentcode = Util.Uni2Ksc(Util.checkString(req.getParameter("agentcode")));
String agentfee = Util.Uni2Ksc(Util.checkString(req.getParameter("agentfee")));
String salecode = Util.Uni2Ksc(Util.checkString(req.getParameter("salecode")));
String saleemp = Util.Uni2Ksc(Util.checkString(req.getParameter("saleemp")));
String deptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcode")));
String deptname = Util.Uni2Ksc(Util.checkString(req.getParameter("deptname")));
String zpcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zpcode")));
String zpname = Util.Uni2Ksc(Util.checkString(req.getParameter("zpname")));
String stdamt = Util.Uni2Ksc(Util.checkString(req.getParameter("stdamt")));
String divamt = Util.Uni2Ksc(Util.checkString(req.getParameter("divamt")));
String divvatamt = Util.Uni2Ksc(Util.checkString(req.getParameter("divvatamt")));
String agentstdamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentstdamt")));
String agentdivamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivamt")));
String agentdivvatamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivvatamt")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt(clos_dt);
dm.setChcode(chcode);
dm.setCuscode(cuscode);
dm.setBlndcode(blndcode);
dm.setOrgcode(orgcode);
dm.setFrdate(frdate);
dm.setTodate(todate);
dm.setRcvgrp(rcvgrp);
dm.setChgcode(chgcode);
dm.setStdmonth(stdmonth);
dm.setRcvamt(rcvamt);
dm.setVatcode(vatcode);
dm.setAgentcode(agentcode);
dm.setAgentfee(agentfee);
dm.setSalecode(salecode);
dm.setSaleemp(saleemp);
dm.setDeptcode(deptcode);
dm.setDeptname(deptname);
dm.setZpcode(zpcode);
dm.setZpname(zpname);
dm.setStdamt(stdamt);
dm.setDivamt(divamt);
dm.setDivvatamt(divvatamt);
dm.setAgentstdamt(agentstdamt);
dm.setAgentdivamt(agentdivamt);
dm.setAgentdivvatamt(agentdivvatamt);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 31 15:45:30 KST 2012 */