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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6543_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String int_rate;
	public String hy_tot_int_amt;
	public String hy_corp_tax_amt;
	public String hy_def_tax_amt;
	public String hy_unrcp_precpt_bal;
	public String hy_rmks;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String hy_cctr_dt;
	public String hy_impt_amt;
	public String rmks;
	public String hy_patr_budg_cd;
	public String hy_deps_clsf_cd;
	public String tot_pymt_amt;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String comp_dt;
	public String mtry_dt;
	public String hy_frex_cd;
	public String hy_exrate;
	public String hy_frex_amt;
	public String use_dept_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_6543_IDM(){}
	public FC_FUNC_6543_IDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String int_rate, String hy_tot_int_amt, String hy_corp_tax_amt, String hy_def_tax_amt, String hy_unrcp_precpt_bal, String hy_rmks, String dlco_clsf_cd, String dlco_cd, String compnm, String hy_cctr_dt, String hy_impt_amt, String rmks, String hy_patr_budg_cd, String hy_deps_clsf_cd, String tot_pymt_amt, String cost_gain_stot, String rcpay_amt_stot, String comp_dt, String mtry_dt, String hy_frex_cd, String hy_exrate, String hy_frex_amt, String use_dept_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.deps_isav_no = deps_isav_no;
		this.int_rate = int_rate;
		this.hy_tot_int_amt = hy_tot_int_amt;
		this.hy_corp_tax_amt = hy_corp_tax_amt;
		this.hy_def_tax_amt = hy_def_tax_amt;
		this.hy_unrcp_precpt_bal = hy_unrcp_precpt_bal;
		this.hy_rmks = hy_rmks;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.compnm = compnm;
		this.hy_cctr_dt = hy_cctr_dt;
		this.hy_impt_amt = hy_impt_amt;
		this.rmks = rmks;
		this.hy_patr_budg_cd = hy_patr_budg_cd;
		this.hy_deps_clsf_cd = hy_deps_clsf_cd;
		this.tot_pymt_amt = tot_pymt_amt;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.hy_frex_cd = hy_frex_cd;
		this.hy_exrate = hy_exrate;
		this.hy_frex_amt = hy_frex_amt;
		this.use_dept_cd = use_dept_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setHy_tot_int_amt(String hy_tot_int_amt){
		this.hy_tot_int_amt = hy_tot_int_amt;
	}

	public void setHy_corp_tax_amt(String hy_corp_tax_amt){
		this.hy_corp_tax_amt = hy_corp_tax_amt;
	}

	public void setHy_def_tax_amt(String hy_def_tax_amt){
		this.hy_def_tax_amt = hy_def_tax_amt;
	}

	public void setHy_unrcp_precpt_bal(String hy_unrcp_precpt_bal){
		this.hy_unrcp_precpt_bal = hy_unrcp_precpt_bal;
	}

	public void setHy_rmks(String hy_rmks){
		this.hy_rmks = hy_rmks;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setHy_cctr_dt(String hy_cctr_dt){
		this.hy_cctr_dt = hy_cctr_dt;
	}

	public void setHy_impt_amt(String hy_impt_amt){
		this.hy_impt_amt = hy_impt_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setHy_patr_budg_cd(String hy_patr_budg_cd){
		this.hy_patr_budg_cd = hy_patr_budg_cd;
	}

	public void setHy_deps_clsf_cd(String hy_deps_clsf_cd){
		this.hy_deps_clsf_cd = hy_deps_clsf_cd;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setHy_frex_cd(String hy_frex_cd){
		this.hy_frex_cd = hy_frex_cd;
	}

	public void setHy_exrate(String hy_exrate){
		this.hy_exrate = hy_exrate;
	}

	public void setHy_frex_amt(String hy_frex_amt){
		this.hy_frex_amt = hy_frex_amt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getHy_tot_int_amt(){
		return this.hy_tot_int_amt;
	}

	public String getHy_corp_tax_amt(){
		return this.hy_corp_tax_amt;
	}

	public String getHy_def_tax_amt(){
		return this.hy_def_tax_amt;
	}

	public String getHy_unrcp_precpt_bal(){
		return this.hy_unrcp_precpt_bal;
	}

	public String getHy_rmks(){
		return this.hy_rmks;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getHy_cctr_dt(){
		return this.hy_cctr_dt;
	}

	public String getHy_impt_amt(){
		return this.hy_impt_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getHy_patr_budg_cd(){
		return this.hy_patr_budg_cd;
	}

	public String getHy_deps_clsf_cd(){
		return this.hy_deps_clsf_cd;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getHy_frex_cd(){
		return this.hy_frex_cd;
	}

	public String getHy_exrate(){
		return this.hy_exrate;
	}

	public String getHy_frex_amt(){
		return this.hy_frex_amt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6543_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6543_IDM dm = (FC_FUNC_6543_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deps_isav_clsf_cd);
		cstmt.setString(5, dm.deps_isav_no);
		cstmt.setString(6, dm.int_rate);
		cstmt.setString(7, dm.hy_tot_int_amt);
		cstmt.setString(8, dm.hy_corp_tax_amt);
		cstmt.setString(9, dm.hy_def_tax_amt);
		cstmt.setString(10, dm.hy_unrcp_precpt_bal);
		cstmt.setString(11, dm.hy_rmks);
		cstmt.setString(12, dm.dlco_clsf_cd);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.compnm);
		cstmt.setString(15, dm.hy_cctr_dt);
		cstmt.setString(16, dm.hy_impt_amt);
		cstmt.setString(17, dm.rmks);
		cstmt.setString(18, dm.hy_patr_budg_cd);
		cstmt.setString(19, dm.hy_deps_clsf_cd);
		cstmt.setString(20, dm.tot_pymt_amt);
		cstmt.setString(21, dm.cost_gain_stot);
		cstmt.setString(22, dm.rcpay_amt_stot);
		cstmt.setString(23, dm.comp_dt);
		cstmt.setString(24, dm.mtry_dt);
		cstmt.setString(25, dm.hy_frex_cd);
		cstmt.setString(26, dm.hy_exrate);
		cstmt.setString(27, dm.hy_frex_amt);
		cstmt.setString(28, dm.use_dept_cd);
		cstmt.setString(29, dm.incmg_pers);
		cstmt.setString(30, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6543_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("deps_isav_clsf_cd = [" + getDeps_isav_clsf_cd() + "]");
		System.out.println("deps_isav_no = [" + getDeps_isav_no() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("hy_tot_int_amt = [" + getHy_tot_int_amt() + "]");
		System.out.println("hy_corp_tax_amt = [" + getHy_corp_tax_amt() + "]");
		System.out.println("hy_def_tax_amt = [" + getHy_def_tax_amt() + "]");
		System.out.println("hy_unrcp_precpt_bal = [" + getHy_unrcp_precpt_bal() + "]");
		System.out.println("hy_rmks = [" + getHy_rmks() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("compnm = [" + getCompnm() + "]");
		System.out.println("hy_cctr_dt = [" + getHy_cctr_dt() + "]");
		System.out.println("hy_impt_amt = [" + getHy_impt_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("hy_patr_budg_cd = [" + getHy_patr_budg_cd() + "]");
		System.out.println("hy_deps_clsf_cd = [" + getHy_deps_clsf_cd() + "]");
		System.out.println("tot_pymt_amt = [" + getTot_pymt_amt() + "]");
		System.out.println("cost_gain_stot = [" + getCost_gain_stot() + "]");
		System.out.println("rcpay_amt_stot = [" + getRcpay_amt_stot() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("hy_frex_cd = [" + getHy_frex_cd() + "]");
		System.out.println("hy_exrate = [" + getHy_exrate() + "]");
		System.out.println("hy_frex_amt = [" + getHy_frex_amt() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String deps_isav_clsf_cd = req.getParameter("deps_isav_clsf_cd");
if( deps_isav_clsf_cd == null){
	System.out.println(this.toString+" : deps_isav_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_isav_clsf_cd is "+deps_isav_clsf_cd );
}
String deps_isav_no = req.getParameter("deps_isav_no");
if( deps_isav_no == null){
	System.out.println(this.toString+" : deps_isav_no is null" );
}else{
	System.out.println(this.toString+" : deps_isav_no is "+deps_isav_no );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String hy_tot_int_amt = req.getParameter("hy_tot_int_amt");
if( hy_tot_int_amt == null){
	System.out.println(this.toString+" : hy_tot_int_amt is null" );
}else{
	System.out.println(this.toString+" : hy_tot_int_amt is "+hy_tot_int_amt );
}
String hy_corp_tax_amt = req.getParameter("hy_corp_tax_amt");
if( hy_corp_tax_amt == null){
	System.out.println(this.toString+" : hy_corp_tax_amt is null" );
}else{
	System.out.println(this.toString+" : hy_corp_tax_amt is "+hy_corp_tax_amt );
}
String hy_def_tax_amt = req.getParameter("hy_def_tax_amt");
if( hy_def_tax_amt == null){
	System.out.println(this.toString+" : hy_def_tax_amt is null" );
}else{
	System.out.println(this.toString+" : hy_def_tax_amt is "+hy_def_tax_amt );
}
String hy_unrcp_precpt_bal = req.getParameter("hy_unrcp_precpt_bal");
if( hy_unrcp_precpt_bal == null){
	System.out.println(this.toString+" : hy_unrcp_precpt_bal is null" );
}else{
	System.out.println(this.toString+" : hy_unrcp_precpt_bal is "+hy_unrcp_precpt_bal );
}
String hy_rmks = req.getParameter("hy_rmks");
if( hy_rmks == null){
	System.out.println(this.toString+" : hy_rmks is null" );
}else{
	System.out.println(this.toString+" : hy_rmks is "+hy_rmks );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String compnm = req.getParameter("compnm");
if( compnm == null){
	System.out.println(this.toString+" : compnm is null" );
}else{
	System.out.println(this.toString+" : compnm is "+compnm );
}
String hy_cctr_dt = req.getParameter("hy_cctr_dt");
if( hy_cctr_dt == null){
	System.out.println(this.toString+" : hy_cctr_dt is null" );
}else{
	System.out.println(this.toString+" : hy_cctr_dt is "+hy_cctr_dt );
}
String hy_impt_amt = req.getParameter("hy_impt_amt");
if( hy_impt_amt == null){
	System.out.println(this.toString+" : hy_impt_amt is null" );
}else{
	System.out.println(this.toString+" : hy_impt_amt is "+hy_impt_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String hy_patr_budg_cd = req.getParameter("hy_patr_budg_cd");
if( hy_patr_budg_cd == null){
	System.out.println(this.toString+" : hy_patr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : hy_patr_budg_cd is "+hy_patr_budg_cd );
}
String hy_deps_clsf_cd = req.getParameter("hy_deps_clsf_cd");
if( hy_deps_clsf_cd == null){
	System.out.println(this.toString+" : hy_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : hy_deps_clsf_cd is "+hy_deps_clsf_cd );
}
String tot_pymt_amt = req.getParameter("tot_pymt_amt");
if( tot_pymt_amt == null){
	System.out.println(this.toString+" : tot_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : tot_pymt_amt is "+tot_pymt_amt );
}
String cost_gain_stot = req.getParameter("cost_gain_stot");
if( cost_gain_stot == null){
	System.out.println(this.toString+" : cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : cost_gain_stot is "+cost_gain_stot );
}
String rcpay_amt_stot = req.getParameter("rcpay_amt_stot");
if( rcpay_amt_stot == null){
	System.out.println(this.toString+" : rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt_stot is "+rcpay_amt_stot );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String hy_frex_cd = req.getParameter("hy_frex_cd");
if( hy_frex_cd == null){
	System.out.println(this.toString+" : hy_frex_cd is null" );
}else{
	System.out.println(this.toString+" : hy_frex_cd is "+hy_frex_cd );
}
String hy_exrate = req.getParameter("hy_exrate");
if( hy_exrate == null){
	System.out.println(this.toString+" : hy_exrate is null" );
}else{
	System.out.println(this.toString+" : hy_exrate is "+hy_exrate );
}
String hy_frex_amt = req.getParameter("hy_frex_amt");
if( hy_frex_amt == null){
	System.out.println(this.toString+" : hy_frex_amt is null" );
}else{
	System.out.println(this.toString+" : hy_frex_amt is "+hy_frex_amt );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
String deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String hy_tot_int_amt = Util.checkString(req.getParameter("hy_tot_int_amt"));
String hy_corp_tax_amt = Util.checkString(req.getParameter("hy_corp_tax_amt"));
String hy_def_tax_amt = Util.checkString(req.getParameter("hy_def_tax_amt"));
String hy_unrcp_precpt_bal = Util.checkString(req.getParameter("hy_unrcp_precpt_bal"));
String hy_rmks = Util.checkString(req.getParameter("hy_rmks"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String compnm = Util.checkString(req.getParameter("compnm"));
String hy_cctr_dt = Util.checkString(req.getParameter("hy_cctr_dt"));
String hy_impt_amt = Util.checkString(req.getParameter("hy_impt_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String hy_patr_budg_cd = Util.checkString(req.getParameter("hy_patr_budg_cd"));
String hy_deps_clsf_cd = Util.checkString(req.getParameter("hy_deps_clsf_cd"));
String tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String hy_frex_cd = Util.checkString(req.getParameter("hy_frex_cd"));
String hy_exrate = Util.checkString(req.getParameter("hy_exrate"));
String hy_frex_amt = Util.checkString(req.getParameter("hy_frex_amt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String deps_isav_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_no")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String hy_tot_int_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_tot_int_amt")));
String hy_corp_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_corp_tax_amt")));
String hy_def_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_def_tax_amt")));
String hy_unrcp_precpt_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_unrcp_precpt_bal")));
String hy_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_rmks")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("compnm")));
String hy_cctr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_cctr_dt")));
String hy_impt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_impt_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String hy_patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_patr_budg_cd")));
String hy_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_deps_clsf_cd")));
String tot_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pymt_amt")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String hy_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_frex_cd")));
String hy_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_exrate")));
String hy_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hy_frex_amt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDeps_isav_no(deps_isav_no);
dm.setInt_rate(int_rate);
dm.setHy_tot_int_amt(hy_tot_int_amt);
dm.setHy_corp_tax_amt(hy_corp_tax_amt);
dm.setHy_def_tax_amt(hy_def_tax_amt);
dm.setHy_unrcp_precpt_bal(hy_unrcp_precpt_bal);
dm.setHy_rmks(hy_rmks);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setCompnm(compnm);
dm.setHy_cctr_dt(hy_cctr_dt);
dm.setHy_impt_amt(hy_impt_amt);
dm.setRmks(rmks);
dm.setHy_patr_budg_cd(hy_patr_budg_cd);
dm.setHy_deps_clsf_cd(hy_deps_clsf_cd);
dm.setTot_pymt_amt(tot_pymt_amt);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setHy_frex_cd(hy_frex_cd);
dm.setHy_exrate(hy_exrate);
dm.setHy_frex_amt(hy_frex_amt);
dm.setUse_dept_cd(use_dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 29 14:52:57 KST 2016 */