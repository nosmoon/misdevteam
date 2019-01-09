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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3860_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String prof_type_cd;
	public String slip_seq;
	public String make_dt;
	public String email_id;
	public String elec_tax_comp_cd;
	public String biz_plc_cd;
	public String remk;
	public String incmg_dept_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_3860_ADM(){}
	public SP_SAL_3860_ADM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String prof_type_cd, String slip_seq, String make_dt, String email_id, String elec_tax_comp_cd, String biz_plc_cd, String remk, String incmg_dept_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.prof_type_cd = prof_type_cd;
		this.slip_seq = slip_seq;
		this.make_dt = make_dt;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.biz_plc_cd = biz_plc_cd;
		this.remk = remk;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setBiz_plc_cd(String biz_plc_cd){
		this.biz_plc_cd = biz_plc_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
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

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getBiz_plc_cd(){
		return this.biz_plc_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3860_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3860_ADM dm = (SP_SAL_3860_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.prof_type_cd);
		cstmt.setString(7, dm.slip_seq);
		cstmt.setString(8, dm.make_dt);
		cstmt.setString(9, dm.email_id);
		cstmt.setString(10, dm.elec_tax_comp_cd);
		cstmt.setString(11, dm.biz_plc_cd);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.incmg_dept_cd);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3860_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("biz_plc_cd = [" + getBiz_plc_cd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String biz_plc_cd = req.getParameter("biz_plc_cd");
if( biz_plc_cd == null){
	System.out.println(this.toString+" : biz_plc_cd is null" );
}else{
	System.out.println(this.toString+" : biz_plc_cd is "+biz_plc_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
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
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String email_id = Util.checkString(req.getParameter("email_id"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String biz_plc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_plc_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_seq(slip_seq);
dm.setMake_dt(make_dt);
dm.setEmail_id(email_id);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setBiz_plc_cd(biz_plc_cd);
dm.setRemk(remk);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 02 19:12:19 KST 2012 */