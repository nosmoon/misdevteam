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


public class FC_FUNC_6533_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

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
	public String compgbcd;
	public String compcd;
	public String compnm;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String use_dept_cd;

	public FC_FUNC_6533_IDM(){}
	public FC_FUNC_6533_IDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String recp_dt, String int_rate, String tot_int_amt, String corp_tax_amt, String aft_tax_int_amt, String unrcp_precpt_bal, String int_gain_amt, String rmks, String incmg_pers, String incmg_pers_ipadd, String compgbcd, String compcd, String compnm, String cost_gain_stot, String rcpay_amt_stot, String use_dept_cd){
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
		this.compgbcd = compgbcd;
		this.compcd = compcd;
		this.compnm = compnm;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.use_dept_cd = use_dept_cd;
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

	public void setCompgbcd(String compgbcd){
		this.compgbcd = compgbcd;
	}

	public void setCompcd(String compcd){
		this.compcd = compcd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
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

	public String getCompgbcd(){
		return this.compgbcd;
	}

	public String getCompcd(){
		return this.compcd;
	}

	public String getCompnm(){
		return this.compnm;
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

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6533_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6533_IDM dm = (FC_FUNC_6533_IDM)bdm;
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
		cstmt.setString(16, dm.compgbcd);
		cstmt.setString(17, dm.compcd);
		cstmt.setString(18, dm.compnm);
		cstmt.setString(19, dm.cost_gain_stot);
		cstmt.setString(20, dm.rcpay_amt_stot);
		cstmt.setString(21, dm.use_dept_cd);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6533_IDataSet();
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
        System.out.println("compgbcd = " + getCompgbcd());
        System.out.println("compcd = " + getCompcd());
        System.out.println("compnm = " + getCompnm());
        System.out.println("cost_gain_stot = " + getCost_gain_stot());
        System.out.println("rcpay_amt_stot = " + getRcpay_amt_stot());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
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
String compgbcd = req.getParameter("compgbcd");
if( compgbcd == null){
	System.out.println(this.toString+" : compgbcd is null" );
}else{
	System.out.println(this.toString+" : compgbcd is "+compgbcd );
}
String compcd = req.getParameter("compcd");
if( compcd == null){
	System.out.println(this.toString+" : compcd is null" );
}else{
	System.out.println(this.toString+" : compcd is "+compcd );
}
String compnm = req.getParameter("compnm");
if( compnm == null){
	System.out.println(this.toString+" : compnm is null" );
}else{
	System.out.println(this.toString+" : compnm is "+compnm );
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
String compgbcd = Util.checkString(req.getParameter("compgbcd"));
String compcd = Util.checkString(req.getParameter("compcd"));
String compnm = Util.checkString(req.getParameter("compnm"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
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
String compgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("compgbcd")));
String compcd = Util.Uni2Ksc(Util.checkString(req.getParameter("compcd")));
String compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("compnm")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
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
dm.setCompgbcd(compgbcd);
dm.setCompcd(compcd);
dm.setCompnm(compnm);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 17:42:51 KST 2009 */