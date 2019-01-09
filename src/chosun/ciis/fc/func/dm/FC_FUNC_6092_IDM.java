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


public class FC_FUNC_6092_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String recp_dt;
	public String int_rate;
	public String tot_int_amt;
	public String corp_tax_amt;
	public String aft_tax_int_amt;
	public String unrcp_precpt_bal;
	public String int_gain_amt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String deps_isav_stat_cd;
	public String cctr_dt;
	public String impt_amt;
	public String rmks2;
	public String patr_budg_cd;
	public String deps_clsf_cd;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String use_dept_cd;
	public String comp_dt;
	public String mtry_dt;

	public FC_FUNC_6092_IDM(){}
	public FC_FUNC_6092_IDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String recp_dt, String int_rate, String tot_int_amt, String corp_tax_amt, String aft_tax_int_amt, String unrcp_precpt_bal, String int_gain_amt, String rmks, String incmg_pers, String incmg_pers_ipadd, String dlco_clsf_cd, String dlco_cd, String compnm, String deps_isav_stat_cd, String cctr_dt, String impt_amt, String rmks2, String patr_budg_cd, String deps_clsf_cd, String cost_gain_stot, String rcpay_amt_stot, String use_dept_cd, String comp_dt, String mtry_dt){
		this.cmpy_cd = cmpy_cd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.deps_isav_no = deps_isav_no;
		this.recp_dt = recp_dt;
		this.int_rate = int_rate;
		this.tot_int_amt = tot_int_amt;
		this.corp_tax_amt = corp_tax_amt;
		this.aft_tax_int_amt = aft_tax_int_amt;
		this.unrcp_precpt_bal = unrcp_precpt_bal;
		this.int_gain_amt = int_gain_amt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.compnm = compnm;
		this.deps_isav_stat_cd = deps_isav_stat_cd;
		this.cctr_dt = cctr_dt;
		this.impt_amt = impt_amt;
		this.rmks2 = rmks2;
		this.patr_budg_cd = patr_budg_cd;
		this.deps_clsf_cd = deps_clsf_cd;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.use_dept_cd = use_dept_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
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

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setTot_int_amt(String tot_int_amt){
		this.tot_int_amt = tot_int_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setAft_tax_int_amt(String aft_tax_int_amt){
		this.aft_tax_int_amt = aft_tax_int_amt;
	}

	public void setUnrcp_precpt_bal(String unrcp_precpt_bal){
		this.unrcp_precpt_bal = unrcp_precpt_bal;
	}

	public void setInt_gain_amt(String int_gain_amt){
		this.int_gain_amt = int_gain_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public void setDeps_isav_stat_cd(String deps_isav_stat_cd){
		this.deps_isav_stat_cd = deps_isav_stat_cd;
	}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setImpt_amt(String impt_amt){
		this.impt_amt = impt_amt;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
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

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getTot_int_amt(){
		return this.tot_int_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getAft_tax_int_amt(){
		return this.aft_tax_int_amt;
	}

	public String getUnrcp_precpt_bal(){
		return this.unrcp_precpt_bal;
	}

	public String getInt_gain_amt(){
		return this.int_gain_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
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

	public String getDeps_isav_stat_cd(){
		return this.deps_isav_stat_cd;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getImpt_amt(){
		return this.impt_amt;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6092_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6092_IDM dm = (FC_FUNC_6092_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deps_isav_clsf_cd);
		cstmt.setString(5, dm.deps_isav_no);
		cstmt.setString(6, dm.recp_dt);
		cstmt.setString(7, dm.int_rate);
		cstmt.setString(8, dm.tot_int_amt);
		cstmt.setString(9, dm.corp_tax_amt);
		cstmt.setString(10, dm.aft_tax_int_amt);
		cstmt.setString(11, dm.unrcp_precpt_bal);
		cstmt.setString(12, dm.int_gain_amt);
		cstmt.setString(13, dm.rmks);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.dlco_clsf_cd);
		cstmt.setString(17, dm.dlco_cd);
		cstmt.setString(18, dm.compnm);
		cstmt.setString(19, dm.deps_isav_stat_cd);
		cstmt.setString(20, dm.cctr_dt);
		cstmt.setString(21, dm.impt_amt);
		cstmt.setString(22, dm.rmks2);
		cstmt.setString(23, dm.patr_budg_cd);
		cstmt.setString(24, dm.deps_clsf_cd);
		cstmt.setString(25, dm.cost_gain_stot);
		cstmt.setString(26, dm.rcpay_amt_stot);
		cstmt.setString(27, dm.use_dept_cd);
		cstmt.setString(28, dm.comp_dt);
		cstmt.setString(29, dm.mtry_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6092_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("deps_isav_clsf_cd = " + getDeps_isav_clsf_cd());
        System.out.println("deps_isav_no = " + getDeps_isav_no());
        System.out.println("recp_dt = " + getRecp_dt());
        System.out.println("int_rate = " + getInt_rate());
        System.out.println("tot_int_amt = " + getTot_int_amt());
        System.out.println("corp_tax_amt = " + getCorp_tax_amt());
        System.out.println("aft_tax_int_amt = " + getAft_tax_int_amt());
        System.out.println("unrcp_precpt_bal = " + getUnrcp_precpt_bal());
        System.out.println("int_gain_amt = " + getInt_gain_amt());
        System.out.println("rmks = " + getRmks());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("compnm = " + getCompnm());
        System.out.println("deps_isav_stat_cd = " + getDeps_isav_stat_cd());
        System.out.println("cctr_dt = " + getCctr_dt());
        System.out.println("impt_amt = " + getImpt_amt());
        System.out.println("rmks2 = " + getRmks2());
        System.out.println("patr_budg_cd = " + getPatr_budg_cd());
        System.out.println("deps_clsf_cd = " + getDeps_clsf_cd());
        System.out.println("cost_gain_stot = " + getCost_gain_stot());
        System.out.println("rcpay_amt_stot = " + getRcpay_amt_stot());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
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
String recp_dt = req.getParameter("recp_dt");
if( recp_dt == null){
	System.out.println(this.toString+" : recp_dt is null" );
}else{
	System.out.println(this.toString+" : recp_dt is "+recp_dt );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String tot_int_amt = req.getParameter("tot_int_amt");
if( tot_int_amt == null){
	System.out.println(this.toString+" : tot_int_amt is null" );
}else{
	System.out.println(this.toString+" : tot_int_amt is "+tot_int_amt );
}
String corp_tax_amt = req.getParameter("corp_tax_amt");
if( corp_tax_amt == null){
	System.out.println(this.toString+" : corp_tax_amt is null" );
}else{
	System.out.println(this.toString+" : corp_tax_amt is "+corp_tax_amt );
}
String aft_tax_int_amt = req.getParameter("aft_tax_int_amt");
if( aft_tax_int_amt == null){
	System.out.println(this.toString+" : aft_tax_int_amt is null" );
}else{
	System.out.println(this.toString+" : aft_tax_int_amt is "+aft_tax_int_amt );
}
String unrcp_precpt_bal = req.getParameter("unrcp_precpt_bal");
if( unrcp_precpt_bal == null){
	System.out.println(this.toString+" : unrcp_precpt_bal is null" );
}else{
	System.out.println(this.toString+" : unrcp_precpt_bal is "+unrcp_precpt_bal );
}
String int_gain_amt = req.getParameter("int_gain_amt");
if( int_gain_amt == null){
	System.out.println(this.toString+" : int_gain_amt is null" );
}else{
	System.out.println(this.toString+" : int_gain_amt is "+int_gain_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
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
String deps_isav_stat_cd = req.getParameter("deps_isav_stat_cd");
if( deps_isav_stat_cd == null){
	System.out.println(this.toString+" : deps_isav_stat_cd is null" );
}else{
	System.out.println(this.toString+" : deps_isav_stat_cd is "+deps_isav_stat_cd );
}
String cctr_dt = req.getParameter("cctr_dt");
if( cctr_dt == null){
	System.out.println(this.toString+" : cctr_dt is null" );
}else{
	System.out.println(this.toString+" : cctr_dt is "+cctr_dt );
}
String impt_amt = req.getParameter("impt_amt");
if( impt_amt == null){
	System.out.println(this.toString+" : impt_amt is null" );
}else{
	System.out.println(this.toString+" : impt_amt is "+impt_amt );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String patr_budg_cd = req.getParameter("patr_budg_cd");
if( patr_budg_cd == null){
	System.out.println(this.toString+" : patr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : patr_budg_cd is "+patr_budg_cd );
}
String deps_clsf_cd = req.getParameter("deps_clsf_cd");
if( deps_clsf_cd == null){
	System.out.println(this.toString+" : deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_clsf_cd is "+deps_clsf_cd );
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
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
String deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
String recp_dt = Util.checkString(req.getParameter("recp_dt"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String tot_int_amt = Util.checkString(req.getParameter("tot_int_amt"));
String corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
String aft_tax_int_amt = Util.checkString(req.getParameter("aft_tax_int_amt"));
String unrcp_precpt_bal = Util.checkString(req.getParameter("unrcp_precpt_bal"));
String int_gain_amt = Util.checkString(req.getParameter("int_gain_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String compnm = Util.checkString(req.getParameter("compnm"));
String deps_isav_stat_cd = Util.checkString(req.getParameter("deps_isav_stat_cd"));
String cctr_dt = Util.checkString(req.getParameter("cctr_dt"));
String impt_amt = Util.checkString(req.getParameter("impt_amt"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String deps_isav_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_no")));
String recp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_dt")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String tot_int_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_int_amt")));
String corp_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_tax_amt")));
String aft_tax_int_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("aft_tax_int_amt")));
String unrcp_precpt_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_precpt_bal")));
String int_gain_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("int_gain_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("compnm")));
String deps_isav_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_stat_cd")));
String cctr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cctr_dt")));
String impt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_amt")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_budg_cd")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDeps_isav_no(deps_isav_no);
dm.setRecp_dt(recp_dt);
dm.setInt_rate(int_rate);
dm.setTot_int_amt(tot_int_amt);
dm.setCorp_tax_amt(corp_tax_amt);
dm.setAft_tax_int_amt(aft_tax_int_amt);
dm.setUnrcp_precpt_bal(unrcp_precpt_bal);
dm.setInt_gain_amt(int_gain_amt);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setCompnm(compnm);
dm.setDeps_isav_stat_cd(deps_isav_stat_cd);
dm.setCctr_dt(cctr_dt);
dm.setImpt_amt(impt_amt);
dm.setRmks2(rmks2);
dm.setPatr_budg_cd(patr_budg_cd);
dm.setDeps_clsf_cd(deps_clsf_cd);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setUse_dept_cd(use_dept_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 16:38:03 KST 2009 */