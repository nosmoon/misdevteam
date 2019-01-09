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


public class HD_AFFR_1413_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String faml_seq;
	public String child_flnm;
	public String faml_rshp_cd;
	public String treat_edu_frdt;
	public String treat_edu_todt;
	public String treat_edu_cont;
	public String treat_edu_instt;
	public String treat_edu_instt_tel_no;
	public String clam_amt;
	public String cmpy_sply_amt;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_1413_ADM(){}
	public HD_AFFR_1413_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String faml_seq, String child_flnm, String faml_rshp_cd, String treat_edu_frdt, String treat_edu_todt, String treat_edu_cont, String treat_edu_instt, String treat_edu_instt_tel_no, String clam_amt, String cmpy_sply_amt, String slip_proc_mang_dt, String slip_proc_mang_seq, String pay_plac_clsf, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.faml_seq = faml_seq;
		this.child_flnm = child_flnm;
		this.faml_rshp_cd = faml_rshp_cd;
		this.treat_edu_frdt = treat_edu_frdt;
		this.treat_edu_todt = treat_edu_todt;
		this.treat_edu_cont = treat_edu_cont;
		this.treat_edu_instt = treat_edu_instt;
		this.treat_edu_instt_tel_no = treat_edu_instt_tel_no;
		this.clam_amt = clam_amt;
		this.cmpy_sply_amt = cmpy_sply_amt;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.pay_plac_clsf = pay_plac_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
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

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setTreat_edu_frdt(String treat_edu_frdt){
		this.treat_edu_frdt = treat_edu_frdt;
	}

	public void setTreat_edu_todt(String treat_edu_todt){
		this.treat_edu_todt = treat_edu_todt;
	}

	public void setTreat_edu_cont(String treat_edu_cont){
		this.treat_edu_cont = treat_edu_cont;
	}

	public void setTreat_edu_instt(String treat_edu_instt){
		this.treat_edu_instt = treat_edu_instt;
	}

	public void setTreat_edu_instt_tel_no(String treat_edu_instt_tel_no){
		this.treat_edu_instt_tel_no = treat_edu_instt_tel_no;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setCmpy_sply_amt(String cmpy_sply_amt){
		this.cmpy_sply_amt = cmpy_sply_amt;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
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

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getTreat_edu_frdt(){
		return this.treat_edu_frdt;
	}

	public String getTreat_edu_todt(){
		return this.treat_edu_todt;
	}

	public String getTreat_edu_cont(){
		return this.treat_edu_cont;
	}

	public String getTreat_edu_instt(){
		return this.treat_edu_instt;
	}

	public String getTreat_edu_instt_tel_no(){
		return this.treat_edu_instt_tel_no;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getCmpy_sply_amt(){
		return this.cmpy_sply_amt;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1413_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1413_ADM dm = (HD_AFFR_1413_ADM)bdm;
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
		cstmt.setString(12, dm.faml_seq);
		cstmt.setString(13, dm.child_flnm);
		cstmt.setString(14, dm.faml_rshp_cd);
		cstmt.setString(15, dm.treat_edu_frdt);
		cstmt.setString(16, dm.treat_edu_todt);
		cstmt.setString(17, dm.treat_edu_cont);
		cstmt.setString(18, dm.treat_edu_instt);
		cstmt.setString(19, dm.treat_edu_instt_tel_no);
		cstmt.setString(20, dm.clam_amt);
		cstmt.setString(21, dm.cmpy_sply_amt);
		cstmt.setString(22, dm.slip_proc_mang_dt);
		cstmt.setString(23, dm.slip_proc_mang_seq);
		cstmt.setString(24, dm.pay_plac_clsf);
		cstmt.setString(25, dm.incmg_pers_ipadd);
		cstmt.setString(26, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1413_ADataSet();
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
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("child_flnm = [" + getChild_flnm() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("treat_edu_frdt = [" + getTreat_edu_frdt() + "]");
		System.out.println("treat_edu_todt = [" + getTreat_edu_todt() + "]");
		System.out.println("treat_edu_cont = [" + getTreat_edu_cont() + "]");
		System.out.println("treat_edu_instt = [" + getTreat_edu_instt() + "]");
		System.out.println("treat_edu_instt_tel_no = [" + getTreat_edu_instt_tel_no() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("cmpy_sply_amt = [" + getCmpy_sply_amt() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String child_flnm = req.getParameter("child_flnm");
if( child_flnm == null){
	System.out.println(this.toString+" : child_flnm is null" );
}else{
	System.out.println(this.toString+" : child_flnm is "+child_flnm );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
String treat_edu_frdt = req.getParameter("treat_edu_frdt");
if( treat_edu_frdt == null){
	System.out.println(this.toString+" : treat_edu_frdt is null" );
}else{
	System.out.println(this.toString+" : treat_edu_frdt is "+treat_edu_frdt );
}
String treat_edu_todt = req.getParameter("treat_edu_todt");
if( treat_edu_todt == null){
	System.out.println(this.toString+" : treat_edu_todt is null" );
}else{
	System.out.println(this.toString+" : treat_edu_todt is "+treat_edu_todt );
}
String treat_edu_cont = req.getParameter("treat_edu_cont");
if( treat_edu_cont == null){
	System.out.println(this.toString+" : treat_edu_cont is null" );
}else{
	System.out.println(this.toString+" : treat_edu_cont is "+treat_edu_cont );
}
String treat_edu_instt = req.getParameter("treat_edu_instt");
if( treat_edu_instt == null){
	System.out.println(this.toString+" : treat_edu_instt is null" );
}else{
	System.out.println(this.toString+" : treat_edu_instt is "+treat_edu_instt );
}
String treat_edu_instt_tel_no = req.getParameter("treat_edu_instt_tel_no");
if( treat_edu_instt_tel_no == null){
	System.out.println(this.toString+" : treat_edu_instt_tel_no is null" );
}else{
	System.out.println(this.toString+" : treat_edu_instt_tel_no is "+treat_edu_instt_tel_no );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String cmpy_sply_amt = req.getParameter("cmpy_sply_amt");
if( cmpy_sply_amt == null){
	System.out.println(this.toString+" : cmpy_sply_amt is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_amt is "+cmpy_sply_amt );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String pay_plac_clsf = req.getParameter("pay_plac_clsf");
if( pay_plac_clsf == null){
	System.out.println(this.toString+" : pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_plac_clsf is "+pay_plac_clsf );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
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
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String child_flnm = Util.checkString(req.getParameter("child_flnm"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String treat_edu_frdt = Util.checkString(req.getParameter("treat_edu_frdt"));
String treat_edu_todt = Util.checkString(req.getParameter("treat_edu_todt"));
String treat_edu_cont = Util.checkString(req.getParameter("treat_edu_cont"));
String treat_edu_instt = Util.checkString(req.getParameter("treat_edu_instt"));
String treat_edu_instt_tel_no = Util.checkString(req.getParameter("treat_edu_instt_tel_no"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String cmpy_sply_amt = Util.checkString(req.getParameter("cmpy_sply_amt"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
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
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String child_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("child_flnm")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String treat_edu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_frdt")));
String treat_edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_todt")));
String treat_edu_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_cont")));
String treat_edu_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_instt")));
String treat_edu_instt_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_instt_tel_no")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String cmpy_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_amt")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
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
dm.setFaml_seq(faml_seq);
dm.setChild_flnm(child_flnm);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setTreat_edu_frdt(treat_edu_frdt);
dm.setTreat_edu_todt(treat_edu_todt);
dm.setTreat_edu_cont(treat_edu_cont);
dm.setTreat_edu_instt(treat_edu_instt);
dm.setTreat_edu_instt_tel_no(treat_edu_instt_tel_no);
dm.setClam_amt(clam_amt);
dm.setCmpy_sply_amt(cmpy_sply_amt);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 17:09:24 KST 2009 */