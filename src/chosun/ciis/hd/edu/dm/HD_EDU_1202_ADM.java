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


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String stdy_yy;
	public String ictry_excep_clsf;
	public String stdy_clsf;
	public String invit_instt;
	public String stdy_frdt;
	public String stdy_todt;
	public String stdy_natn_cd;
	public String stdy_instt;
	public String aviat_cost;
	public String stay_cost;
	public String scl_exps;
	public String etc_cost;
	public String stdy_cost_stot;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_EDU_1202_ADM(){}
	public HD_EDU_1202_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String stdy_yy, String ictry_excep_clsf, String stdy_clsf, String invit_instt, String stdy_frdt, String stdy_todt, String stdy_natn_cd, String stdy_instt, String aviat_cost, String stay_cost, String scl_exps, String etc_cost, String stdy_cost_stot, String remk, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.stdy_yy = stdy_yy;
		this.ictry_excep_clsf = ictry_excep_clsf;
		this.stdy_clsf = stdy_clsf;
		this.invit_instt = invit_instt;
		this.stdy_frdt = stdy_frdt;
		this.stdy_todt = stdy_todt;
		this.stdy_natn_cd = stdy_natn_cd;
		this.stdy_instt = stdy_instt;
		this.aviat_cost = aviat_cost;
		this.stay_cost = stay_cost;
		this.scl_exps = scl_exps;
		this.etc_cost = etc_cost;
		this.stdy_cost_stot = stdy_cost_stot;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setStdy_yy(String stdy_yy){
		this.stdy_yy = stdy_yy;
	}

	public void setIctry_excep_clsf(String ictry_excep_clsf){
		this.ictry_excep_clsf = ictry_excep_clsf;
	}

	public void setStdy_clsf(String stdy_clsf){
		this.stdy_clsf = stdy_clsf;
	}

	public void setInvit_instt(String invit_instt){
		this.invit_instt = invit_instt;
	}

	public void setStdy_frdt(String stdy_frdt){
		this.stdy_frdt = stdy_frdt;
	}

	public void setStdy_todt(String stdy_todt){
		this.stdy_todt = stdy_todt;
	}

	public void setStdy_natn_cd(String stdy_natn_cd){
		this.stdy_natn_cd = stdy_natn_cd;
	}

	public void setStdy_instt(String stdy_instt){
		this.stdy_instt = stdy_instt;
	}

	public void setAviat_cost(String aviat_cost){
		this.aviat_cost = aviat_cost;
	}

	public void setStay_cost(String stay_cost){
		this.stay_cost = stay_cost;
	}

	public void setScl_exps(String scl_exps){
		this.scl_exps = scl_exps;
	}

	public void setEtc_cost(String etc_cost){
		this.etc_cost = etc_cost;
	}

	public void setStdy_cost_stot(String stdy_cost_stot){
		this.stdy_cost_stot = stdy_cost_stot;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getStdy_yy(){
		return this.stdy_yy;
	}

	public String getIctry_excep_clsf(){
		return this.ictry_excep_clsf;
	}

	public String getStdy_clsf(){
		return this.stdy_clsf;
	}

	public String getInvit_instt(){
		return this.invit_instt;
	}

	public String getStdy_frdt(){
		return this.stdy_frdt;
	}

	public String getStdy_todt(){
		return this.stdy_todt;
	}

	public String getStdy_natn_cd(){
		return this.stdy_natn_cd;
	}

	public String getStdy_instt(){
		return this.stdy_instt;
	}

	public String getAviat_cost(){
		return this.aviat_cost;
	}

	public String getStay_cost(){
		return this.stay_cost;
	}

	public String getScl_exps(){
		return this.scl_exps;
	}

	public String getEtc_cost(){
		return this.etc_cost;
	}

	public String getStdy_cost_stot(){
		return this.stdy_cost_stot;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_1202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_1202_ADM dm = (HD_EDU_1202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.stdy_yy);
		cstmt.setString(13, dm.ictry_excep_clsf);
		cstmt.setString(14, dm.stdy_clsf);
		cstmt.setString(15, dm.invit_instt);
		cstmt.setString(16, dm.stdy_frdt);
		cstmt.setString(17, dm.stdy_todt);
		cstmt.setString(18, dm.stdy_natn_cd);
		cstmt.setString(19, dm.stdy_instt);
		cstmt.setString(20, dm.aviat_cost);
		cstmt.setString(21, dm.stay_cost);
		cstmt.setString(22, dm.scl_exps);
		cstmt.setString(23, dm.etc_cost);
		cstmt.setString(24, dm.stdy_cost_stot);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.incmg_pers_ipadd);
		cstmt.setString(27, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EDU_1202_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("stdy_yy = [" + getStdy_yy() + "]");
		System.out.println("ictry_excep_clsf = [" + getIctry_excep_clsf() + "]");
		System.out.println("stdy_clsf = [" + getStdy_clsf() + "]");
		System.out.println("invit_instt = [" + getInvit_instt() + "]");
		System.out.println("stdy_frdt = [" + getStdy_frdt() + "]");
		System.out.println("stdy_todt = [" + getStdy_todt() + "]");
		System.out.println("stdy_natn_cd = [" + getStdy_natn_cd() + "]");
		System.out.println("stdy_instt = [" + getStdy_instt() + "]");
		System.out.println("aviat_cost = [" + getAviat_cost() + "]");
		System.out.println("stay_cost = [" + getStay_cost() + "]");
		System.out.println("scl_exps = [" + getScl_exps() + "]");
		System.out.println("etc_cost = [" + getEtc_cost() + "]");
		System.out.println("stdy_cost_stot = [" + getStdy_cost_stot() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String stdy_yy = req.getParameter("stdy_yy");
if( stdy_yy == null){
	System.out.println(this.toString+" : stdy_yy is null" );
}else{
	System.out.println(this.toString+" : stdy_yy is "+stdy_yy );
}
String ictry_excep_clsf = req.getParameter("ictry_excep_clsf");
if( ictry_excep_clsf == null){
	System.out.println(this.toString+" : ictry_excep_clsf is null" );
}else{
	System.out.println(this.toString+" : ictry_excep_clsf is "+ictry_excep_clsf );
}
String stdy_clsf = req.getParameter("stdy_clsf");
if( stdy_clsf == null){
	System.out.println(this.toString+" : stdy_clsf is null" );
}else{
	System.out.println(this.toString+" : stdy_clsf is "+stdy_clsf );
}
String invit_instt = req.getParameter("invit_instt");
if( invit_instt == null){
	System.out.println(this.toString+" : invit_instt is null" );
}else{
	System.out.println(this.toString+" : invit_instt is "+invit_instt );
}
String stdy_frdt = req.getParameter("stdy_frdt");
if( stdy_frdt == null){
	System.out.println(this.toString+" : stdy_frdt is null" );
}else{
	System.out.println(this.toString+" : stdy_frdt is "+stdy_frdt );
}
String stdy_todt = req.getParameter("stdy_todt");
if( stdy_todt == null){
	System.out.println(this.toString+" : stdy_todt is null" );
}else{
	System.out.println(this.toString+" : stdy_todt is "+stdy_todt );
}
String stdy_natn_cd = req.getParameter("stdy_natn_cd");
if( stdy_natn_cd == null){
	System.out.println(this.toString+" : stdy_natn_cd is null" );
}else{
	System.out.println(this.toString+" : stdy_natn_cd is "+stdy_natn_cd );
}
String stdy_instt = req.getParameter("stdy_instt");
if( stdy_instt == null){
	System.out.println(this.toString+" : stdy_instt is null" );
}else{
	System.out.println(this.toString+" : stdy_instt is "+stdy_instt );
}
String aviat_cost = req.getParameter("aviat_cost");
if( aviat_cost == null){
	System.out.println(this.toString+" : aviat_cost is null" );
}else{
	System.out.println(this.toString+" : aviat_cost is "+aviat_cost );
}
String stay_cost = req.getParameter("stay_cost");
if( stay_cost == null){
	System.out.println(this.toString+" : stay_cost is null" );
}else{
	System.out.println(this.toString+" : stay_cost is "+stay_cost );
}
String scl_exps = req.getParameter("scl_exps");
if( scl_exps == null){
	System.out.println(this.toString+" : scl_exps is null" );
}else{
	System.out.println(this.toString+" : scl_exps is "+scl_exps );
}
String etc_cost = req.getParameter("etc_cost");
if( etc_cost == null){
	System.out.println(this.toString+" : etc_cost is null" );
}else{
	System.out.println(this.toString+" : etc_cost is "+etc_cost );
}
String stdy_cost_stot = req.getParameter("stdy_cost_stot");
if( stdy_cost_stot == null){
	System.out.println(this.toString+" : stdy_cost_stot is null" );
}else{
	System.out.println(this.toString+" : stdy_cost_stot is "+stdy_cost_stot );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String stdy_yy = Util.checkString(req.getParameter("stdy_yy"));
String ictry_excep_clsf = Util.checkString(req.getParameter("ictry_excep_clsf"));
String stdy_clsf = Util.checkString(req.getParameter("stdy_clsf"));
String invit_instt = Util.checkString(req.getParameter("invit_instt"));
String stdy_frdt = Util.checkString(req.getParameter("stdy_frdt"));
String stdy_todt = Util.checkString(req.getParameter("stdy_todt"));
String stdy_natn_cd = Util.checkString(req.getParameter("stdy_natn_cd"));
String stdy_instt = Util.checkString(req.getParameter("stdy_instt"));
String aviat_cost = Util.checkString(req.getParameter("aviat_cost"));
String stay_cost = Util.checkString(req.getParameter("stay_cost"));
String scl_exps = Util.checkString(req.getParameter("scl_exps"));
String etc_cost = Util.checkString(req.getParameter("etc_cost"));
String stdy_cost_stot = Util.checkString(req.getParameter("stdy_cost_stot"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String stdy_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_yy")));
String ictry_excep_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ictry_excep_clsf")));
String stdy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_clsf")));
String invit_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("invit_instt")));
String stdy_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_frdt")));
String stdy_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_todt")));
String stdy_natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_natn_cd")));
String stdy_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_instt")));
String aviat_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("aviat_cost")));
String stay_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_cost")));
String scl_exps = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps")));
String etc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_cost")));
String stdy_cost_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("stdy_cost_stot")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setStdy_yy(stdy_yy);
dm.setIctry_excep_clsf(ictry_excep_clsf);
dm.setStdy_clsf(stdy_clsf);
dm.setInvit_instt(invit_instt);
dm.setStdy_frdt(stdy_frdt);
dm.setStdy_todt(stdy_todt);
dm.setStdy_natn_cd(stdy_natn_cd);
dm.setStdy_instt(stdy_instt);
dm.setAviat_cost(aviat_cost);
dm.setStay_cost(stay_cost);
dm.setScl_exps(scl_exps);
dm.setEtc_cost(etc_cost);
dm.setStdy_cost_stot(stdy_cost_stot);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 10:31:14 KST 2009 */