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


public class HD_EDU_1000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String aplc_dt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String chrg_job;
	public String edu_nm;
	public String edu_instt;
	public String edu_frdt;
	public String edu_todt;
	public String edu_dds;
	public String edu_tm;
	public String edu_cost;
	public String remk;
	public String misno;
	public String rfnd_yn;
	public String rfnd_cost;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_EDU_1000_ADM(){}
	public HD_EDU_1000_ADM(String mode, String cmpy_cd, String aplc_dt, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String chrg_job, String edu_nm, String edu_instt, String edu_frdt, String edu_todt, String edu_dds, String edu_tm, String edu_cost, String remk, String misno, String rfnd_yn, String rfnd_cost, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aplc_dt = aplc_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.chrg_job = chrg_job;
		this.edu_nm = edu_nm;
		this.edu_instt = edu_instt;
		this.edu_frdt = edu_frdt;
		this.edu_todt = edu_todt;
		this.edu_dds = edu_dds;
		this.edu_tm = edu_tm;
		this.edu_cost = edu_cost;
		this.remk = remk;
		this.misno = misno;
		this.rfnd_yn = rfnd_yn;
		this.rfnd_cost = rfnd_cost;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
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

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
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

	public void setEdu_dds(String edu_dds){
		this.edu_dds = edu_dds;
	}

	public void setEdu_tm(String edu_tm){
		this.edu_tm = edu_tm;
	}

	public void setEdu_cost(String edu_cost){
		this.edu_cost = edu_cost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMisno(String misno){
		this.misno = misno;
	}

	public void setRfnd_yn(String rfnd_yn){
		this.rfnd_yn = rfnd_yn;
	}

	public void setRfnd_cost(String rfnd_cost){
		this.rfnd_cost = rfnd_cost;
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

	public String getAplc_dt(){
		return this.aplc_dt;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
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

	public String getEdu_dds(){
		return this.edu_dds;
	}

	public String getEdu_tm(){
		return this.edu_tm;
	}

	public String getEdu_cost(){
		return this.edu_cost;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMisno(){
		return this.misno;
	}

	public String getRfnd_yn(){
		return this.rfnd_yn;
	}

	public String getRfnd_cost(){
		return this.rfnd_cost;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_1000_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_1000_ADM dm = (HD_EDU_1000_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.aplc_dt);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.chrg_job);
		cstmt.setString(13, dm.edu_nm);
		cstmt.setString(14, dm.edu_instt);
		cstmt.setString(15, dm.edu_frdt);
		cstmt.setString(16, dm.edu_todt);
		cstmt.setString(17, dm.edu_dds);
		cstmt.setString(18, dm.edu_tm);
		cstmt.setString(19, dm.edu_cost);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.misno);
		cstmt.setString(22, dm.rfnd_yn);
		cstmt.setString(23, dm.rfnd_cost);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_1000_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("chrg_job = [" + getChrg_job() + "]");
		System.out.println("edu_nm = [" + getEdu_nm() + "]");
		System.out.println("edu_instt = [" + getEdu_instt() + "]");
		System.out.println("edu_frdt = [" + getEdu_frdt() + "]");
		System.out.println("edu_todt = [" + getEdu_todt() + "]");
		System.out.println("edu_dds = [" + getEdu_dds() + "]");
		System.out.println("edu_tm = [" + getEdu_tm() + "]");
		System.out.println("edu_cost = [" + getEdu_cost() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("misno = [" + getMisno() + "]");
		System.out.println("rfnd_yn = [" + getRfnd_yn() + "]");
		System.out.println("rfnd_cost = [" + getRfnd_cost() + "]");
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
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
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
String edu_dds = req.getParameter("edu_dds");
if( edu_dds == null){
	System.out.println(this.toString+" : edu_dds is null" );
}else{
	System.out.println(this.toString+" : edu_dds is "+edu_dds );
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
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String misno = req.getParameter("misno");
if( misno == null){
	System.out.println(this.toString+" : misno is null" );
}else{
	System.out.println(this.toString+" : misno is "+misno );
}
String rfnd_yn = req.getParameter("rfnd_yn");
if( rfnd_yn == null){
	System.out.println(this.toString+" : rfnd_yn is null" );
}else{
	System.out.println(this.toString+" : rfnd_yn is "+rfnd_yn );
}
String rfnd_cost = req.getParameter("rfnd_cost");
if( rfnd_cost == null){
	System.out.println(this.toString+" : rfnd_cost is null" );
}else{
	System.out.println(this.toString+" : rfnd_cost is "+rfnd_cost );
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
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String chrg_job = Util.checkString(req.getParameter("chrg_job"));
String edu_nm = Util.checkString(req.getParameter("edu_nm"));
String edu_instt = Util.checkString(req.getParameter("edu_instt"));
String edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
String edu_todt = Util.checkString(req.getParameter("edu_todt"));
String edu_dds = Util.checkString(req.getParameter("edu_dds"));
String edu_tm = Util.checkString(req.getParameter("edu_tm"));
String edu_cost = Util.checkString(req.getParameter("edu_cost"));
String remk = Util.checkString(req.getParameter("remk"));
String misno = Util.checkString(req.getParameter("misno"));
String rfnd_yn = Util.checkString(req.getParameter("rfnd_yn"));
String rfnd_cost = Util.checkString(req.getParameter("rfnd_cost"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String chrg_job = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_job")));
String edu_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_nm")));
String edu_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_instt")));
String edu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_frdt")));
String edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_todt")));
String edu_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_dds")));
String edu_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_tm")));
String edu_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String misno = Util.Uni2Ksc(Util.checkString(req.getParameter("misno")));
String rfnd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rfnd_yn")));
String rfnd_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("rfnd_cost")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAplc_dt(aplc_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setChrg_job(chrg_job);
dm.setEdu_nm(edu_nm);
dm.setEdu_instt(edu_instt);
dm.setEdu_frdt(edu_frdt);
dm.setEdu_todt(edu_todt);
dm.setEdu_dds(edu_dds);
dm.setEdu_tm(edu_tm);
dm.setEdu_cost(edu_cost);
dm.setRemk(remk);
dm.setMisno(misno);
dm.setRfnd_yn(rfnd_yn);
dm.setRfnd_cost(rfnd_cost);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 06 19:02:21 KST 2013 */