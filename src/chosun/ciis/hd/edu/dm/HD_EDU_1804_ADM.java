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


public class HD_EDU_1804_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String chrg_job;
	public String edu_nm;
	public String edu_instt;
	public String edu_frdt;
	public String edu_todt;
	public String edu_tm_clsf;
	public String edu_fr_tm;
	public String edu_to_tm;
	public String edu_tm;
	public String edu_cost;
	public String edu_sply_cost;
	public String remk;
	public String aprv_yn;
	public String complt_yn;
	public String occr_dt;
	public String occr_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String lang_cd;
	public String course_cd;
	public String sply_fee_pay;

	public HD_EDU_1804_ADM(){}
	public HD_EDU_1804_ADM(String mode, String cmpy_cd, String emp_no, String flnm, String dept_cd, String dept_nm, String dty_cd, String dty_nm, String posi_cd, String posi_nm, String chrg_job, String edu_nm, String edu_instt, String edu_frdt, String edu_todt, String edu_tm_clsf, String edu_fr_tm, String edu_to_tm, String edu_tm, String edu_cost, String edu_sply_cost, String remk, String aprv_yn, String complt_yn, String occr_dt, String occr_seq, String incmg_pers_ipadd, String incmg_pers, String lang_cd, String course_cd, String sply_fee_pay){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.dty_cd = dty_cd;
		this.dty_nm = dty_nm;
		this.posi_cd = posi_cd;
		this.posi_nm = posi_nm;
		this.chrg_job = chrg_job;
		this.edu_nm = edu_nm;
		this.edu_instt = edu_instt;
		this.edu_frdt = edu_frdt;
		this.edu_todt = edu_todt;
		this.edu_tm_clsf = edu_tm_clsf;
		this.edu_fr_tm = edu_fr_tm;
		this.edu_to_tm = edu_to_tm;
		this.edu_tm = edu_tm;
		this.edu_cost = edu_cost;
		this.edu_sply_cost = edu_sply_cost;
		this.remk = remk;
		this.aprv_yn = aprv_yn;
		this.complt_yn = complt_yn;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.lang_cd = lang_cd;
		this.course_cd = course_cd;
		this.sply_fee_pay = sply_fee_pay;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setEdu_nm(String edu_nm){
		this.edu_nm = edu_nm;
	}

	public void setEdu_instt(String edu_instt){
		this.edu_instt = edu_instt;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setEdu_tm_clsf(String edu_tm_clsf){
		this.edu_tm_clsf = edu_tm_clsf;
	}

	public void setEdu_fr_tm(String edu_fr_tm){
		this.edu_fr_tm = edu_fr_tm;
	}

	public void setEdu_to_tm(String edu_to_tm){
		this.edu_to_tm = edu_to_tm;
	}

	public void setEdu_tm(String edu_tm){
		this.edu_tm = edu_tm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setEdu_sply_cost(String edu_sply_cost){
		this.edu_sply_cost = edu_sply_cost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAprv_yn(String aprv_yn){
		this.aprv_yn = aprv_yn;
	}

	public void setComplt_yn(String complt_yn){
		this.complt_yn = complt_yn;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setLang_cd(String lang_cd){
		this.lang_cd = lang_cd;
	}

	public void setCourse_cd(String course_cd){
		this.course_cd = course_cd;
	}

	public void setSply_fee_pay(String sply_fee_pay){
		this.sply_fee_pay = sply_fee_pay;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getEdu_nm(){
		return this.edu_nm;
	}

	public String getEdu_instt(){
		return this.edu_instt;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getEdu_tm_clsf(){
		return this.edu_tm_clsf;
	}

	public String getEdu_fr_tm(){
		return this.edu_fr_tm;
	}

	public String getEdu_to_tm(){
		return this.edu_to_tm;
	}

	public String getEdu_tm(){
		return this.edu_tm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getEdu_sply_cost(){
		return this.edu_sply_cost;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAprv_yn(){
		return this.aprv_yn;
	}

	public String getComplt_yn(){
		return this.complt_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getLang_cd(){
		return this.lang_cd;
	}

	public String getCourse_cd(){
		return this.course_cd;
	}

	public String getSply_fee_pay(){
		return this.sply_fee_pay;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_1804_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_1804_ADM dm = (HD_EDU_1804_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.dept_nm);
		cstmt.setString(9, dm.dty_cd);
		cstmt.setString(10, dm.dty_nm);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.posi_nm);
		cstmt.setString(13, dm.chrg_job);
		cstmt.setString(14, dm.edu_nm);
		cstmt.setString(15, dm.edu_instt);
		cstmt.setString(16, dm.edu_frdt);
		cstmt.setString(17, dm.edu_todt);
		cstmt.setString(18, dm.edu_tm_clsf);
		cstmt.setString(19, dm.edu_fr_tm);
		cstmt.setString(20, dm.edu_to_tm);
		cstmt.setString(21, dm.edu_tm);
		cstmt.setString(22, dm.edu_cost);
		cstmt.setString(23, dm.edu_sply_cost);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.aprv_yn);
		cstmt.setString(26, dm.complt_yn);
		cstmt.setString(27, dm.occr_dt);
		cstmt.setString(28, dm.occr_seq);
		cstmt.setString(29, dm.incmg_pers_ipadd);
		cstmt.setString(30, dm.incmg_pers);
		cstmt.setString(31, dm.lang_cd);
		cstmt.setString(32, dm.course_cd);
		cstmt.setString(33, dm.sply_fee_pay);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_1804_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("dty_nm = [" + getDty_nm() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("posi_nm = [" + getPosi_nm() + "]");
		System.out.println("chrg_job = [" + getChrg_job() + "]");
		System.out.println("edu_nm = [" + getEdu_nm() + "]");
		System.out.println("edu_instt = [" + getEdu_instt() + "]");
		System.out.println("edu_frdt = [" + getEdu_frdt() + "]");
		System.out.println("edu_todt = [" + getEdu_todt() + "]");
		System.out.println("edu_tm_clsf = [" + getEdu_tm_clsf() + "]");
		System.out.println("edu_fr_tm = [" + getEdu_fr_tm() + "]");
		System.out.println("edu_to_tm = [" + getEdu_to_tm() + "]");
		System.out.println("edu_tm = [" + getEdu_tm() + "]");
		System.out.println("edu_cost = [" + getEdu_cost() + "]");
		System.out.println("edu_sply_cost = [" + getEdu_sply_cost() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("aprv_yn = [" + getAprv_yn() + "]");
		System.out.println("complt_yn = [" + getComplt_yn() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("lang_cd = [" + getLang_cd() + "]");
		System.out.println("course_cd = [" + getCourse_cd() + "]");
		System.out.println("sply_fee_pay = [" + getSply_fee_pay() + "]");
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
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String dty_nm = req.getParameter("dty_nm");
if( dty_nm == null){
	System.out.println(this.toString+" : dty_nm is null" );
}else{
	System.out.println(this.toString+" : dty_nm is "+dty_nm );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String posi_nm = req.getParameter("posi_nm");
if( posi_nm == null){
	System.out.println(this.toString+" : posi_nm is null" );
}else{
	System.out.println(this.toString+" : posi_nm is "+posi_nm );
}
String chrg_job = req.getParameter("chrg_job");
if( chrg_job == null){
	System.out.println(this.toString+" : chrg_job is null" );
}else{
	System.out.println(this.toString+" : chrg_job is "+chrg_job );
}
String edu_nm = req.getParameter("edu_nm");
if( edu_nm == null){
	System.out.println(this.toString+" : edu_nm is null" );
}else{
	System.out.println(this.toString+" : edu_nm is "+edu_nm );
}
String edu_instt = req.getParameter("edu_instt");
if( edu_instt == null){
	System.out.println(this.toString+" : edu_instt is null" );
}else{
	System.out.println(this.toString+" : edu_instt is "+edu_instt );
}
String edu_frdt = req.getParameter("edu_frdt");
if( edu_frdt == null){
	System.out.println(this.toString+" : edu_frdt is null" );
}else{
	System.out.println(this.toString+" : edu_frdt is "+edu_frdt );
}
String edu_todt = req.getParameter("edu_todt");
if( edu_todt == null){
	System.out.println(this.toString+" : edu_todt is null" );
}else{
	System.out.println(this.toString+" : edu_todt is "+edu_todt );
}
String edu_tm_clsf = req.getParameter("edu_tm_clsf");
if( edu_tm_clsf == null){
	System.out.println(this.toString+" : edu_tm_clsf is null" );
}else{
	System.out.println(this.toString+" : edu_tm_clsf is "+edu_tm_clsf );
}
String edu_fr_tm = req.getParameter("edu_fr_tm");
if( edu_fr_tm == null){
	System.out.println(this.toString+" : edu_fr_tm is null" );
}else{
	System.out.println(this.toString+" : edu_fr_tm is "+edu_fr_tm );
}
String edu_to_tm = req.getParameter("edu_to_tm");
if( edu_to_tm == null){
	System.out.println(this.toString+" : edu_to_tm is null" );
}else{
	System.out.println(this.toString+" : edu_to_tm is "+edu_to_tm );
}
String edu_tm = req.getParameter("edu_tm");
if( edu_tm == null){
	System.out.println(this.toString+" : edu_tm is null" );
}else{
	System.out.println(this.toString+" : edu_tm is "+edu_tm );
}
String edu_cost = req.getParameter("edu_cost");
if( edu_cost == null){
	System.out.println(this.toString+" : edu_cost is null" );
}else{
	System.out.println(this.toString+" : edu_cost is "+edu_cost );
}
String edu_sply_cost = req.getParameter("edu_sply_cost");
if( edu_sply_cost == null){
	System.out.println(this.toString+" : edu_sply_cost is null" );
}else{
	System.out.println(this.toString+" : edu_sply_cost is "+edu_sply_cost );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String aprv_yn = req.getParameter("aprv_yn");
if( aprv_yn == null){
	System.out.println(this.toString+" : aprv_yn is null" );
}else{
	System.out.println(this.toString+" : aprv_yn is "+aprv_yn );
}
String complt_yn = req.getParameter("complt_yn");
if( complt_yn == null){
	System.out.println(this.toString+" : complt_yn is null" );
}else{
	System.out.println(this.toString+" : complt_yn is "+complt_yn );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
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
String lang_cd = req.getParameter("lang_cd");
if( lang_cd == null){
	System.out.println(this.toString+" : lang_cd is null" );
}else{
	System.out.println(this.toString+" : lang_cd is "+lang_cd );
}
String course_cd = req.getParameter("course_cd");
if( course_cd == null){
	System.out.println(this.toString+" : course_cd is null" );
}else{
	System.out.println(this.toString+" : course_cd is "+course_cd );
}
String sply_fee_pay = req.getParameter("sply_fee_pay");
if( sply_fee_pay == null){
	System.out.println(this.toString+" : sply_fee_pay is null" );
}else{
	System.out.println(this.toString+" : sply_fee_pay is "+sply_fee_pay );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String dty_nm = Util.checkString(req.getParameter("dty_nm"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String posi_nm = Util.checkString(req.getParameter("posi_nm"));
String chrg_job = Util.checkString(req.getParameter("chrg_job"));
String edu_nm = Util.checkString(req.getParameter("edu_nm"));
String edu_instt = Util.checkString(req.getParameter("edu_instt"));
String edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
String edu_todt = Util.checkString(req.getParameter("edu_todt"));
String edu_tm_clsf = Util.checkString(req.getParameter("edu_tm_clsf"));
String edu_fr_tm = Util.checkString(req.getParameter("edu_fr_tm"));
String edu_to_tm = Util.checkString(req.getParameter("edu_to_tm"));
String edu_tm = Util.checkString(req.getParameter("edu_tm"));
String edu_cost = Util.checkString(req.getParameter("edu_cost"));
String edu_sply_cost = Util.checkString(req.getParameter("edu_sply_cost"));
String remk = Util.checkString(req.getParameter("remk"));
String aprv_yn = Util.checkString(req.getParameter("aprv_yn"));
String complt_yn = Util.checkString(req.getParameter("complt_yn"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String lang_cd = Util.checkString(req.getParameter("lang_cd"));
String course_cd = Util.checkString(req.getParameter("course_cd"));
String sply_fee_pay = Util.checkString(req.getParameter("sply_fee_pay"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String dty_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_nm")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String posi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_nm")));
String chrg_job = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_job")));
String edu_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_nm")));
String edu_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_instt")));
String edu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_frdt")));
String edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_todt")));
String edu_tm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_tm_clsf")));
String edu_fr_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_fr_tm")));
String edu_to_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_to_tm")));
String edu_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_tm")));
String edu_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost")));
String edu_sply_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_sply_cost")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_yn")));
String complt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("complt_yn")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String lang_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lang_cd")));
String course_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("course_cd")));
String sply_fee_pay = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_fee_pay")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setDty_cd(dty_cd);
dm.setDty_nm(dty_nm);
dm.setPosi_cd(posi_cd);
dm.setPosi_nm(posi_nm);
dm.setChrg_job(chrg_job);
dm.setEdu_nm(edu_nm);
dm.setEdu_instt(edu_instt);
dm.setEdu_frdt(edu_frdt);
dm.setEdu_todt(edu_todt);
dm.setEdu_tm_clsf(edu_tm_clsf);
dm.setEdu_fr_tm(edu_fr_tm);
dm.setEdu_to_tm(edu_to_tm);
dm.setEdu_tm(edu_tm);
dm.setEdu_cost(edu_cost);
dm.setEdu_sply_cost(edu_sply_cost);
dm.setRemk(remk);
dm.setAprv_yn(aprv_yn);
dm.setComplt_yn(complt_yn);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setLang_cd(lang_cd);
dm.setCourse_cd(course_cd);
dm.setSply_fee_pay(sply_fee_pay);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 22 17:12:49 KST 2018 */