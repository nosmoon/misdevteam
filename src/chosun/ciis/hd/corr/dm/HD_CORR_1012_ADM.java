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


package chosun.ciis.hd.corr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.corr.ds.*;
import chosun.ciis.hd.corr.rec.*;

/**
 * 
 */


public class HD_CORR_1012_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String pay_yymm;
	public String istt_cost_cd;
	public String istt_cost_ptcr;
	public String frex_clsf;
	public String aplc_frex;
	public String aplc_won;
	public String adjm_frex;
	public String adjm_won;
	public String dept_cd;
	public String flnm;
	public String dty_cd;
	public String posi_cd;
	public String natn_cd;
	public String duty_area;
	public String remk;
	public String proc_stat;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_CORR_1012_ADM(){}
	public HD_CORR_1012_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String sub_seq, String pay_yymm, String istt_cost_cd, String istt_cost_ptcr, String frex_clsf, String aplc_frex, String aplc_won, String adjm_frex, String adjm_won, String dept_cd, String flnm, String dty_cd, String posi_cd, String natn_cd, String duty_area, String remk, String proc_stat, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.pay_yymm = pay_yymm;
		this.istt_cost_cd = istt_cost_cd;
		this.istt_cost_ptcr = istt_cost_ptcr;
		this.frex_clsf = frex_clsf;
		this.aplc_frex = aplc_frex;
		this.aplc_won = aplc_won;
		this.adjm_frex = adjm_frex;
		this.adjm_won = adjm_won;
		this.dept_cd = dept_cd;
		this.flnm = flnm;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.natn_cd = natn_cd;
		this.duty_area = duty_area;
		this.remk = remk;
		this.proc_stat = proc_stat;
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

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}

	public void setIstt_cost_cd(String istt_cost_cd){
		this.istt_cost_cd = istt_cost_cd;
	}

	public void setIstt_cost_ptcr(String istt_cost_ptcr){
		this.istt_cost_ptcr = istt_cost_ptcr;
	}

	public void setFrex_clsf(String frex_clsf){
		this.frex_clsf = frex_clsf;
	}

	public void setAplc_frex(String aplc_frex){
		this.aplc_frex = aplc_frex;
	}

	public void setAplc_won(String aplc_won){
		this.aplc_won = aplc_won;
	}

	public void setAdjm_frex(String adjm_frex){
		this.adjm_frex = adjm_frex;
	}

	public void setAdjm_won(String adjm_won){
		this.adjm_won = adjm_won;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
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

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}

	public String getIstt_cost_cd(){
		return this.istt_cost_cd;
	}

	public String getIstt_cost_ptcr(){
		return this.istt_cost_ptcr;
	}

	public String getFrex_clsf(){
		return this.frex_clsf;
	}

	public String getAplc_frex(){
		return this.aplc_frex;
	}

	public String getAplc_won(){
		return this.aplc_won;
	}

	public String getAdjm_frex(){
		return this.adjm_frex;
	}

	public String getAdjm_won(){
		return this.adjm_won;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
	
	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CORR_1012_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CORR_1012_ADM dm = (HD_CORR_1012_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.sub_seq);
		cstmt.setString(9, dm.pay_yymm);
		cstmt.setString(10, dm.istt_cost_cd);
		cstmt.setString(11, dm.istt_cost_ptcr);
		cstmt.setString(12, dm.frex_clsf);
		cstmt.setString(13, dm.aplc_frex);
		cstmt.setString(14, dm.aplc_won);
		cstmt.setString(15, dm.adjm_frex);
		cstmt.setString(16, dm.adjm_won);
		cstmt.setString(17, dm.dept_cd);
		cstmt.setString(18, dm.flnm);
		cstmt.setString(19, dm.dty_cd);
		cstmt.setString(20, dm.posi_cd);
		cstmt.setString(21, dm.natn_cd);
		cstmt.setString(22, dm.duty_area);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.proc_stat);
		cstmt.setString(25, dm.incmg_pers_ipadd);
		cstmt.setString(26, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.corr.ds.HD_CORR_1012_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("pay_yymm = [" + getPay_yymm() + "]");
		System.out.println("istt_cost_cd = [" + getIstt_cost_cd() + "]");
		System.out.println("istt_cost_ptcr = [" + getIstt_cost_ptcr() + "]");
		System.out.println("frex_clsf = [" + getFrex_clsf() + "]");
		System.out.println("aplc_frex = [" + getAplc_frex() + "]");
		System.out.println("aplc_won = [" + getAplc_won() + "]");
		System.out.println("adjm_frex = [" + getAdjm_frex() + "]");
		System.out.println("adjm_won = [" + getAdjm_won() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("duty_area = [" + getDuty_area() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String pay_yymm = req.getParameter("pay_yymm");
if( pay_yymm == null){
	System.out.println(this.toString+" : pay_yymm is null" );
}else{
	System.out.println(this.toString+" : pay_yymm is "+pay_yymm );
}
String istt_cost_cd = req.getParameter("istt_cost_cd");
if( istt_cost_cd == null){
	System.out.println(this.toString+" : istt_cost_cd is null" );
}else{
	System.out.println(this.toString+" : istt_cost_cd is "+istt_cost_cd );
}
String istt_cost_ptcr = req.getParameter("istt_cost_ptcr");
if( istt_cost_ptcr == null){
	System.out.println(this.toString+" : istt_cost_ptcr is null" );
}else{
	System.out.println(this.toString+" : istt_cost_ptcr is "+istt_cost_ptcr );
}
String frex_clsf = req.getParameter("frex_clsf");
if( frex_clsf == null){
	System.out.println(this.toString+" : frex_clsf is null" );
}else{
	System.out.println(this.toString+" : frex_clsf is "+frex_clsf );
}
String aplc_frex = req.getParameter("aplc_frex");
if( aplc_frex == null){
	System.out.println(this.toString+" : aplc_frex is null" );
}else{
	System.out.println(this.toString+" : aplc_frex is "+aplc_frex );
}
String aplc_won = req.getParameter("aplc_won");
if( aplc_won == null){
	System.out.println(this.toString+" : aplc_won is null" );
}else{
	System.out.println(this.toString+" : aplc_won is "+aplc_won );
}
String adjm_frex = req.getParameter("adjm_frex");
if( adjm_frex == null){
	System.out.println(this.toString+" : adjm_frex is null" );
}else{
	System.out.println(this.toString+" : adjm_frex is "+adjm_frex );
}
String adjm_won = req.getParameter("adjm_won");
if( adjm_won == null){
	System.out.println(this.toString+" : adjm_won is null" );
}else{
	System.out.println(this.toString+" : adjm_won is "+adjm_won );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
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
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String duty_area = req.getParameter("duty_area");
if( duty_area == null){
	System.out.println(this.toString+" : duty_area is null" );
}else{
	System.out.println(this.toString+" : duty_area is "+duty_area );
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
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String pay_yymm = Util.checkString(req.getParameter("pay_yymm"));
String istt_cost_cd = Util.checkString(req.getParameter("istt_cost_cd"));
String istt_cost_ptcr = Util.checkString(req.getParameter("istt_cost_ptcr"));
String frex_clsf = Util.checkString(req.getParameter("frex_clsf"));
String aplc_frex = Util.checkString(req.getParameter("aplc_frex"));
String aplc_won = Util.checkString(req.getParameter("aplc_won"));
String adjm_frex = Util.checkString(req.getParameter("adjm_frex"));
String adjm_won = Util.checkString(req.getParameter("adjm_won"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String duty_area = Util.checkString(req.getParameter("duty_area"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String pay_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_yymm")));
String istt_cost_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("istt_cost_cd")));
String istt_cost_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("istt_cost_ptcr")));
String frex_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_clsf")));
String aplc_frex = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_frex")));
String aplc_won = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_won")));
String adjm_frex = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_frex")));
String adjm_won = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_won")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String duty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_area")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
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
dm.setSub_seq(sub_seq);
dm.setPay_yymm(pay_yymm);
dm.setIstt_cost_cd(istt_cost_cd);
dm.setIstt_cost_ptcr(istt_cost_ptcr);
dm.setFrex_clsf(frex_clsf);
dm.setAplc_frex(aplc_frex);
dm.setAplc_won(aplc_won);
dm.setAdjm_frex(adjm_frex);
dm.setAdjm_won(adjm_won);
dm.setDept_cd(dept_cd);
dm.setFlnm(flnm);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setNatn_cd(natn_cd);
dm.setDuty_area(duty_area);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 15:03:54 KST 2009 */