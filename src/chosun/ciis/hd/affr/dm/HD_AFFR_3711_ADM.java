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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_3711_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String search_yyyymm;
	public String up_acpn_dt;
	public String up_flnm;
	public String up_prn;
	public String up_cmpy_insr_cd;
	public String up_pay_amt;
	public String up_pay_dt;
	public String up_aplc_dt;
	public String up_pay_cd;
	public String up_org_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_AFFR_3711_ADM(){}
	public HD_AFFR_3711_ADM(String mode, String cmpy_cd, String search_yyyymm, String up_acpn_dt, String up_flnm, String up_prn, String up_cmpy_insr_cd, String up_pay_amt, String up_pay_dt, String up_aplc_dt, String up_pay_cd, String up_org_cd, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.search_yyyymm = search_yyyymm;
		this.up_acpn_dt = up_acpn_dt;
		this.up_flnm = up_flnm;
		this.up_prn = up_prn;
		this.up_cmpy_insr_cd = up_cmpy_insr_cd;
		this.up_pay_amt = up_pay_amt;
		this.up_pay_dt = up_pay_dt;
		this.up_aplc_dt = up_aplc_dt;
		this.up_pay_cd = up_pay_cd;
		this.up_org_cd = up_org_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_yyyymm(String search_yyyymm){
		this.search_yyyymm = search_yyyymm;
	}

	public void setUp_acpn_dt(String up_acpn_dt){
		this.up_acpn_dt = up_acpn_dt;
	}

	public void setUp_flnm(String up_flnm){
		this.up_flnm = up_flnm;
	}

	public void setUp_prn(String up_prn){
		this.up_prn = up_prn;
	}

	public void setUp_cmpy_insr_cd(String up_cmpy_insr_cd){
		this.up_cmpy_insr_cd = up_cmpy_insr_cd;
	}

	public void setUp_pay_amt(String up_pay_amt){
		this.up_pay_amt = up_pay_amt;
	}

	public void setUp_pay_dt(String up_pay_dt){
		this.up_pay_dt = up_pay_dt;
	}

	public void setUp_aplc_dt(String up_aplc_dt){
		this.up_aplc_dt = up_aplc_dt;
	}

	public void setUp_pay_cd(String up_pay_cd){
		this.up_pay_cd = up_pay_cd;
	}

	public void setUp_org_cd(String up_org_cd){
		this.up_org_cd = up_org_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_yyyymm(){
		return this.search_yyyymm;
	}

	public String getUp_acpn_dt(){
		return this.up_acpn_dt;
	}

	public String getUp_flnm(){
		return this.up_flnm;
	}

	public String getUp_prn(){
		return this.up_prn;
	}

	public String getUp_cmpy_insr_cd(){
		return this.up_cmpy_insr_cd;
	}

	public String getUp_pay_amt(){
		return this.up_pay_amt;
	}

	public String getUp_pay_dt(){
		return this.up_pay_dt;
	}

	public String getUp_aplc_dt(){
		return this.up_aplc_dt;
	}

	public String getUp_pay_cd(){
		return this.up_pay_cd;
	}

	public String getUp_org_cd(){
		return this.up_org_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3711_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3711_ADM dm = (HD_AFFR_3711_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.search_yyyymm);
		cstmt.setString(6, dm.up_acpn_dt);
		cstmt.setString(7, dm.up_flnm);
		cstmt.setString(8, dm.up_prn);
		cstmt.setString(9, dm.up_cmpy_insr_cd);
		cstmt.setString(10, dm.up_pay_amt);
		cstmt.setString(11, dm.up_pay_dt);
		cstmt.setString(12, dm.up_aplc_dt);
		cstmt.setString(13, dm.up_pay_cd);
		cstmt.setString(14, dm.up_org_cd);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3711_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_yyyymm = [" + getSearch_yyyymm() + "]");
		System.out.println("up_acpn_dt = [" + getUp_acpn_dt() + "]");
		System.out.println("up_flnm = [" + getUp_flnm() + "]");
		System.out.println("up_prn = [" + getUp_prn() + "]");
		System.out.println("up_cmpy_insr_cd = [" + getUp_cmpy_insr_cd() + "]");
		System.out.println("up_pay_amt = [" + getUp_pay_amt() + "]");
		System.out.println("up_pay_dt = [" + getUp_pay_dt() + "]");
		System.out.println("up_aplc_dt = [" + getUp_aplc_dt() + "]");
		System.out.println("up_pay_cd = [" + getUp_pay_cd() + "]");
		System.out.println("up_org_cd = [" + getUp_org_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String search_yyyymm = req.getParameter("search_yyyymm");
if( search_yyyymm == null){
	System.out.println(this.toString+" : search_yyyymm is null" );
}else{
	System.out.println(this.toString+" : search_yyyymm is "+search_yyyymm );
}
String up_acpn_dt = req.getParameter("up_acpn_dt");
if( up_acpn_dt == null){
	System.out.println(this.toString+" : up_acpn_dt is null" );
}else{
	System.out.println(this.toString+" : up_acpn_dt is "+up_acpn_dt );
}
String up_flnm = req.getParameter("up_flnm");
if( up_flnm == null){
	System.out.println(this.toString+" : up_flnm is null" );
}else{
	System.out.println(this.toString+" : up_flnm is "+up_flnm );
}
String up_prn = req.getParameter("up_prn");
if( up_prn == null){
	System.out.println(this.toString+" : up_prn is null" );
}else{
	System.out.println(this.toString+" : up_prn is "+up_prn );
}
String up_cmpy_insr_cd = req.getParameter("up_cmpy_insr_cd");
if( up_cmpy_insr_cd == null){
	System.out.println(this.toString+" : up_cmpy_insr_cd is null" );
}else{
	System.out.println(this.toString+" : up_cmpy_insr_cd is "+up_cmpy_insr_cd );
}
String up_pay_amt = req.getParameter("up_pay_amt");
if( up_pay_amt == null){
	System.out.println(this.toString+" : up_pay_amt is null" );
}else{
	System.out.println(this.toString+" : up_pay_amt is "+up_pay_amt );
}
String up_pay_dt = req.getParameter("up_pay_dt");
if( up_pay_dt == null){
	System.out.println(this.toString+" : up_pay_dt is null" );
}else{
	System.out.println(this.toString+" : up_pay_dt is "+up_pay_dt );
}
String up_aplc_dt = req.getParameter("up_aplc_dt");
if( up_aplc_dt == null){
	System.out.println(this.toString+" : up_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : up_aplc_dt is "+up_aplc_dt );
}
String up_pay_cd = req.getParameter("up_pay_cd");
if( up_pay_cd == null){
	System.out.println(this.toString+" : up_pay_cd is null" );
}else{
	System.out.println(this.toString+" : up_pay_cd is "+up_pay_cd );
}
String up_org_cd = req.getParameter("up_org_cd");
if( up_org_cd == null){
	System.out.println(this.toString+" : up_org_cd is null" );
}else{
	System.out.println(this.toString+" : up_org_cd is "+up_org_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
String up_acpn_dt = Util.checkString(req.getParameter("up_acpn_dt"));
String up_flnm = Util.checkString(req.getParameter("up_flnm"));
String up_prn = Util.checkString(req.getParameter("up_prn"));
String up_cmpy_insr_cd = Util.checkString(req.getParameter("up_cmpy_insr_cd"));
String up_pay_amt = Util.checkString(req.getParameter("up_pay_amt"));
String up_pay_dt = Util.checkString(req.getParameter("up_pay_dt"));
String up_aplc_dt = Util.checkString(req.getParameter("up_aplc_dt"));
String up_pay_cd = Util.checkString(req.getParameter("up_pay_cd"));
String up_org_cd = Util.checkString(req.getParameter("up_org_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yyyymm")));
String up_acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("up_acpn_dt")));
String up_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("up_flnm")));
String up_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("up_prn")));
String up_cmpy_insr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("up_cmpy_insr_cd")));
String up_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("up_pay_amt")));
String up_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("up_pay_dt")));
String up_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("up_aplc_dt")));
String up_pay_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("up_pay_cd")));
String up_org_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("up_org_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSearch_yyyymm(search_yyyymm);
dm.setUp_acpn_dt(up_acpn_dt);
dm.setUp_flnm(up_flnm);
dm.setUp_prn(up_prn);
dm.setUp_cmpy_insr_cd(up_cmpy_insr_cd);
dm.setUp_pay_amt(up_pay_amt);
dm.setUp_pay_dt(up_pay_dt);
dm.setUp_aplc_dt(up_aplc_dt);
dm.setUp_pay_cd(up_pay_cd);
dm.setUp_org_cd(up_org_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 16:53:27 KST 2015 */