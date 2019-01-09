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


public class HD_CORR_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
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
	public String remk;
	public String aplc_frex_stot;
	public String aplc_won_stot;
	public String adjm_frex_stot;
	public String adjm_won_stot;
	public String aplc_exrate;
	public String adjm_exrate;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_CORR_1103_ADM(){}
	public HD_CORR_1103_ADM(String cmpy_cd, String mode, String emp_no, String occr_dt, String seq, String sub_seq, String pay_yymm, String istt_cost_cd, String istt_cost_ptcr, String frex_clsf, String aplc_frex, String aplc_won, String adjm_frex, String adjm_won, String remk, String aplc_frex_stot, String aplc_won_stot, String adjm_frex_stot, String adjm_won_stot, String aplc_exrate, String adjm_exrate, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
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
		this.remk = remk;
		this.aplc_frex_stot = aplc_frex_stot;
		this.aplc_won_stot = aplc_won_stot;
		this.adjm_frex_stot = adjm_frex_stot;
		this.adjm_won_stot = adjm_won_stot;
		this.aplc_exrate = aplc_exrate;
		this.adjm_exrate = adjm_exrate;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplc_frex_stot(String aplc_frex_stot){
		this.aplc_frex_stot = aplc_frex_stot;
	}

	public void setAplc_won_stot(String aplc_won_stot){
		this.aplc_won_stot = aplc_won_stot;
	}

	public void setAdjm_frex_stot(String adjm_frex_stot){
		this.adjm_frex_stot = adjm_frex_stot;
	}

	public void setAdjm_won_stot(String adjm_won_stot){
		this.adjm_won_stot = adjm_won_stot;
	}

	public void setAplc_exrate(String aplc_exrate){
		this.aplc_exrate = aplc_exrate;
	}

	public void setAdjm_exrate(String adjm_exrate){
		this.adjm_exrate = adjm_exrate;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
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

	public String getRemk(){
		return this.remk;
	}

	public String getAplc_frex_stot(){
		return this.aplc_frex_stot;
	}

	public String getAplc_won_stot(){
		return this.aplc_won_stot;
	}

	public String getAdjm_frex_stot(){
		return this.adjm_frex_stot;
	}

	public String getAdjm_won_stot(){
		return this.adjm_won_stot;
	}

	public String getAplc_exrate(){
		return this.aplc_exrate;
	}

	public String getAdjm_exrate(){
		return this.adjm_exrate;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CORR_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CORR_1103_ADM dm = (HD_CORR_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
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
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.aplc_frex_stot);
		cstmt.setString(19, dm.aplc_won_stot);
		cstmt.setString(20, dm.adjm_frex_stot);
		cstmt.setString(21, dm.adjm_won_stot);
		cstmt.setString(22, dm.aplc_exrate);
		cstmt.setString(23, dm.adjm_exrate);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.corr.ds.HD_CORR_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("aplc_frex_stot = [" + getAplc_frex_stot() + "]");
		System.out.println("aplc_won_stot = [" + getAplc_won_stot() + "]");
		System.out.println("adjm_frex_stot = [" + getAdjm_frex_stot() + "]");
		System.out.println("adjm_won_stot = [" + getAdjm_won_stot() + "]");
		System.out.println("aplc_exrate = [" + getAplc_exrate() + "]");
		System.out.println("adjm_exrate = [" + getAdjm_exrate() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String aplc_frex_stot = req.getParameter("aplc_frex_stot");
if( aplc_frex_stot == null){
	System.out.println(this.toString+" : aplc_frex_stot is null" );
}else{
	System.out.println(this.toString+" : aplc_frex_stot is "+aplc_frex_stot );
}
String aplc_won_stot = req.getParameter("aplc_won_stot");
if( aplc_won_stot == null){
	System.out.println(this.toString+" : aplc_won_stot is null" );
}else{
	System.out.println(this.toString+" : aplc_won_stot is "+aplc_won_stot );
}
String adjm_frex_stot = req.getParameter("adjm_frex_stot");
if( adjm_frex_stot == null){
	System.out.println(this.toString+" : adjm_frex_stot is null" );
}else{
	System.out.println(this.toString+" : adjm_frex_stot is "+adjm_frex_stot );
}
String adjm_won_stot = req.getParameter("adjm_won_stot");
if( adjm_won_stot == null){
	System.out.println(this.toString+" : adjm_won_stot is null" );
}else{
	System.out.println(this.toString+" : adjm_won_stot is "+adjm_won_stot );
}
String aplc_exrate = req.getParameter("aplc_exrate");
if( aplc_exrate == null){
	System.out.println(this.toString+" : aplc_exrate is null" );
}else{
	System.out.println(this.toString+" : aplc_exrate is "+aplc_exrate );
}
String adjm_exrate = req.getParameter("adjm_exrate");
if( adjm_exrate == null){
	System.out.println(this.toString+" : adjm_exrate is null" );
}else{
	System.out.println(this.toString+" : adjm_exrate is "+adjm_exrate );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
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
String remk = Util.checkString(req.getParameter("remk"));
String aplc_frex_stot = Util.checkString(req.getParameter("aplc_frex_stot"));
String aplc_won_stot = Util.checkString(req.getParameter("aplc_won_stot"));
String adjm_frex_stot = Util.checkString(req.getParameter("adjm_frex_stot"));
String adjm_won_stot = Util.checkString(req.getParameter("adjm_won_stot"));
String aplc_exrate = Util.checkString(req.getParameter("aplc_exrate"));
String adjm_exrate = Util.checkString(req.getParameter("adjm_exrate"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
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
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aplc_frex_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_frex_stot")));
String aplc_won_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_won_stot")));
String adjm_frex_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_frex_stot")));
String adjm_won_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_won_stot")));
String aplc_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_exrate")));
String adjm_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_exrate")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
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
dm.setRemk(remk);
dm.setAplc_frex_stot(aplc_frex_stot);
dm.setAplc_won_stot(aplc_won_stot);
dm.setAdjm_frex_stot(adjm_frex_stot);
dm.setAdjm_won_stot(adjm_won_stot);
dm.setAplc_exrate(aplc_exrate);
dm.setAdjm_exrate(adjm_exrate);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 15:37:58 KST 2009 */