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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String frlc_no;
	public String flnm;
	public String mang_no;
	public String dept_cd;
	public String pay_mm;
	public String duty_dds;
	public String duty_tms;
	public String pay_cycl;
	public String servcost;
	public String pay_amt;
	public String etc_pay_cond;
	public String base_amt;
	public String etc_amt;
	public String tot_amt;
	//public String incm_clsf_cd;
	public String incm_tax;
	public String res_tax;
	public String chrg_posk_cd;
	public String medi_cd;
	public String thrw_pgm;
	public String cntr_dt;
	public String cntr_expr_dt;
	public String lvcmpy_dt;
	public String draft_no;
	public String remk;
	public String budg_cd;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_7201_ADM(){}
	public HD_INFO_7201_ADM(String cmpy_cd, String mode, String frlc_no, String flnm, String mang_no, String dept_cd, String pay_mm, String duty_dds, String duty_tms, String pay_cycl, String servcost, String pay_amt, String etc_pay_cond, String base_amt, String etc_amt, String tot_amt, String incm_tax, String res_tax, String chrg_posk_cd, String medi_cd, String thrw_pgm, String cntr_dt, String cntr_expr_dt, String lvcmpy_dt, String draft_no, String remk, String budg_cd, String seq, String occr_dt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.frlc_no = frlc_no;
		this.flnm = flnm;
		this.mang_no = mang_no;
		this.dept_cd = dept_cd;
		this.pay_mm = pay_mm;
		this.duty_dds = duty_dds;
		this.duty_tms = duty_tms;
		this.pay_cycl = pay_cycl;
		this.servcost = servcost;
		this.pay_amt = pay_amt;
		this.etc_pay_cond = etc_pay_cond;
		this.base_amt = base_amt;
		this.etc_amt = etc_amt;
		this.tot_amt = tot_amt;
//		this.incm_clsf_cd = incm_clsf_cd;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.chrg_posk_cd = chrg_posk_cd;
		this.medi_cd = medi_cd;
		this.thrw_pgm = thrw_pgm;
		this.cntr_dt = cntr_dt;
		this.cntr_expr_dt = cntr_expr_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.draft_no = draft_no;
		this.remk = remk;
		this.budg_cd = budg_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPay_mm(String pay_mm){
		this.pay_mm = pay_mm;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setDuty_tms(String duty_tms){
		this.duty_tms = duty_tms;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setEtc_pay_cond(String etc_pay_cond){
		this.etc_pay_cond = etc_pay_cond;
	}

	public void setBase_amt(String base_amt){
		this.base_amt = base_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

//	public void setIncm_clsf_cd(String incm_clsf_cd){
//		this.incm_clsf_cd = incm_clsf_cd;
//	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPay_mm(){
		return this.pay_mm;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getDuty_tms(){
		return this.duty_tms;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getEtc_pay_cond(){
		return this.etc_pay_cond;
	}

	public String getBase_amt(){
		return this.base_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

//	public String getIncm_clsf_cd(){
//		return this.incm_clsf_cd;
//	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7201_ADM dm = (HD_INFO_7201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.frlc_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.mang_no);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.pay_mm);
		cstmt.setString(10, dm.duty_dds);
		cstmt.setString(11, dm.duty_tms);
		cstmt.setString(12, dm.pay_cycl);
		cstmt.setString(13, dm.servcost);
		cstmt.setString(14, dm.pay_amt);
		cstmt.setString(15, dm.etc_pay_cond);
		cstmt.setString(16, dm.base_amt);
		cstmt.setString(17, dm.etc_amt);
		cstmt.setString(18, dm.tot_amt);
	//	cstmt.setString(19, dm.incm_clsf_cd);
		cstmt.setString(19, dm.incm_tax);
		cstmt.setString(20, dm.res_tax);
		cstmt.setString(21, dm.chrg_posk_cd);
		cstmt.setString(22, dm.medi_cd);
		cstmt.setString(23, dm.thrw_pgm);
		cstmt.setString(24, dm.cntr_dt);
		cstmt.setString(25, dm.cntr_expr_dt);
		cstmt.setString(26, dm.lvcmpy_dt);
		cstmt.setString(27, dm.draft_no);
		cstmt.setString(28, dm.remk);
		cstmt.setString(29, dm.budg_cd);
		cstmt.setString(30, dm.seq);
		cstmt.setString(31, dm.occr_dt);
		cstmt.setString(32, dm.incmg_pers_ipadd);
		cstmt.setString(33, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("frlc_no = [" + getFrlc_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("pay_mm = [" + getPay_mm() + "]");
		System.out.println("duty_dds = [" + getDuty_dds() + "]");
		System.out.println("duty_tms = [" + getDuty_tms() + "]");
		System.out.println("pay_cycl = [" + getPay_cycl() + "]");
		System.out.println("servcost = [" + getServcost() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("etc_pay_cond = [" + getEtc_pay_cond() + "]");
		System.out.println("base_amt = [" + getBase_amt() + "]");
		System.out.println("etc_amt = [" + getEtc_amt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
//		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("chrg_posk_cd = [" + getChrg_posk_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("thrw_pgm = [" + getThrw_pgm() + "]");
		System.out.println("cntr_dt = [" + getCntr_dt() + "]");
		System.out.println("cntr_expr_dt = [" + getCntr_expr_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("draft_no = [" + getDraft_no() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String frlc_no = req.getParameter("frlc_no");
if( frlc_no == null){
	System.out.println(this.toString+" : frlc_no is null" );
}else{
	System.out.println(this.toString+" : frlc_no is "+frlc_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String pay_mm = req.getParameter("pay_mm");
if( pay_mm == null){
	System.out.println(this.toString+" : pay_mm is null" );
}else{
	System.out.println(this.toString+" : pay_mm is "+pay_mm );
}
String duty_dds = req.getParameter("duty_dds");
if( duty_dds == null){
	System.out.println(this.toString+" : duty_dds is null" );
}else{
	System.out.println(this.toString+" : duty_dds is "+duty_dds );
}
String duty_tms = req.getParameter("duty_tms");
if( duty_tms == null){
	System.out.println(this.toString+" : duty_tms is null" );
}else{
	System.out.println(this.toString+" : duty_tms is "+duty_tms );
}
String pay_cycl = req.getParameter("pay_cycl");
if( pay_cycl == null){
	System.out.println(this.toString+" : pay_cycl is null" );
}else{
	System.out.println(this.toString+" : pay_cycl is "+pay_cycl );
}
String servcost = req.getParameter("servcost");
if( servcost == null){
	System.out.println(this.toString+" : servcost is null" );
}else{
	System.out.println(this.toString+" : servcost is "+servcost );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String etc_pay_cond = req.getParameter("etc_pay_cond");
if( etc_pay_cond == null){
	System.out.println(this.toString+" : etc_pay_cond is null" );
}else{
	System.out.println(this.toString+" : etc_pay_cond is "+etc_pay_cond );
}
String base_amt = req.getParameter("base_amt");
if( base_amt == null){
	System.out.println(this.toString+" : base_amt is null" );
}else{
	System.out.println(this.toString+" : base_amt is "+base_amt );
}
String etc_amt = req.getParameter("etc_amt");
if( etc_amt == null){
	System.out.println(this.toString+" : etc_amt is null" );
}else{
	System.out.println(this.toString+" : etc_amt is "+etc_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
}
String chrg_posk_cd = req.getParameter("chrg_posk_cd");
if( chrg_posk_cd == null){
	System.out.println(this.toString+" : chrg_posk_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_cd is "+chrg_posk_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String thrw_pgm = req.getParameter("thrw_pgm");
if( thrw_pgm == null){
	System.out.println(this.toString+" : thrw_pgm is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm is "+thrw_pgm );
}
String cntr_dt = req.getParameter("cntr_dt");
if( cntr_dt == null){
	System.out.println(this.toString+" : cntr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_dt is "+cntr_dt );
}
String cntr_expr_dt = req.getParameter("cntr_expr_dt");
if( cntr_expr_dt == null){
	System.out.println(this.toString+" : cntr_expr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_expr_dt is "+cntr_expr_dt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String draft_no = req.getParameter("draft_no");
if( draft_no == null){
	System.out.println(this.toString+" : draft_no is null" );
}else{
	System.out.println(this.toString+" : draft_no is "+draft_no );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String frlc_no = Util.checkString(req.getParameter("frlc_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String pay_mm = Util.checkString(req.getParameter("pay_mm"));
String duty_dds = Util.checkString(req.getParameter("duty_dds"));
String duty_tms = Util.checkString(req.getParameter("duty_tms"));
String pay_cycl = Util.checkString(req.getParameter("pay_cycl"));
String servcost = Util.checkString(req.getParameter("servcost"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String etc_pay_cond = Util.checkString(req.getParameter("etc_pay_cond"));
String base_amt = Util.checkString(req.getParameter("base_amt"));
String etc_amt = Util.checkString(req.getParameter("etc_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
String cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
String cntr_expr_dt = Util.checkString(req.getParameter("cntr_expr_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String draft_no = Util.checkString(req.getParameter("draft_no"));
String remk = Util.checkString(req.getParameter("remk"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String frlc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("frlc_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String pay_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mm")));
String duty_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dds")));
String duty_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_tms")));
String pay_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl")));
String servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String etc_pay_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_pay_cond")));
String base_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_amt")));
String etc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String chrg_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String thrw_pgm = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm")));
String cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt")));
String cntr_expr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_expr_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setFrlc_no(frlc_no);
dm.setFlnm(flnm);
dm.setMang_no(mang_no);
dm.setDept_cd(dept_cd);
dm.setPay_mm(pay_mm);
dm.setDuty_dds(duty_dds);
dm.setDuty_tms(duty_tms);
dm.setPay_cycl(pay_cycl);
dm.setServcost(servcost);
dm.setPay_amt(pay_amt);
dm.setEtc_pay_cond(etc_pay_cond);
dm.setBase_amt(base_amt);
dm.setEtc_amt(etc_amt);
dm.setTot_amt(tot_amt);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setChrg_posk_cd(chrg_posk_cd);
dm.setMedi_cd(medi_cd);
dm.setThrw_pgm(thrw_pgm);
dm.setCntr_dt(cntr_dt);
dm.setCntr_expr_dt(cntr_expr_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setDraft_no(draft_no);
dm.setRemk(remk);
dm.setBudg_cd(budg_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 29 14:17:33 KST 2013 */