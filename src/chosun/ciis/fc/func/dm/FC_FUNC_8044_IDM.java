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


public class FC_FUNC_8044_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String pay_cost_clsf;
	public String hsty_seq;
	public String pymt_dt;
	public String exrate;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String pymt_prcp;
	public String pymt_int;
	public String won_amt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String leimchagbcd;
	public String pch_compnm;
	public String use_dept_cd;
	public String acctcd;
	public String mang_clsf_cd;

	public FC_FUNC_8044_IDM(){}
	public FC_FUNC_8044_IDM(String cmpy_cd, String leas_clsf_cd, String leas_no, String pay_cost_clsf, String hsty_seq, String pymt_dt, String exrate, String libo_int_rate, String dedu_int_rate, String pymt_prcp, String pymt_int, String won_amt, String rmks, String incmg_pers, String incmg_pers_ipadd, String comp_dt, String mtry_dt, String dlco_clsf_cd, String dlco_cd, String leimchagbcd, String pch_compnm, String use_dept_cd, String acctcd, String mang_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.pay_cost_clsf = pay_cost_clsf;
		this.hsty_seq = hsty_seq;
		this.pymt_dt = pymt_dt;
		this.exrate = exrate;
		this.libo_int_rate = libo_int_rate;
		this.dedu_int_rate = dedu_int_rate;
		this.pymt_prcp = pymt_prcp;
		this.pymt_int = pymt_int;
		this.won_amt = won_amt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.leimchagbcd = leimchagbcd;
		this.pch_compnm = pch_compnm;
		this.use_dept_cd = use_dept_cd;
		this.acctcd = acctcd;
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setPay_cost_clsf(String pay_cost_clsf){
		this.pay_cost_clsf = pay_cost_clsf;
	}

	public void setHsty_seq(String hsty_seq){
		this.hsty_seq = hsty_seq;
	}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setPymt_prcp(String pymt_prcp){
		this.pymt_prcp = pymt_prcp;
	}

	public void setPymt_int(String pymt_int){
		this.pymt_int = pymt_int;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
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

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setLeimchagbcd(String leimchagbcd){
		this.leimchagbcd = leimchagbcd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getPay_cost_clsf(){
		return this.pay_cost_clsf;
	}

	public String getHsty_seq(){
		return this.hsty_seq;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getPymt_prcp(){
		return this.pymt_prcp;
	}

	public String getPymt_int(){
		return this.pymt_int;
	}

	public String getWon_amt(){
		return this.won_amt;
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

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getLeimchagbcd(){
		return this.leimchagbcd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8044_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8044_IDM dm = (FC_FUNC_8044_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_clsf_cd);
		cstmt.setString(5, dm.leas_no);
		cstmt.setString(6, dm.pay_cost_clsf);
		cstmt.setString(7, dm.hsty_seq);
		cstmt.setString(8, dm.pymt_dt);
		cstmt.setString(9, dm.exrate);
		cstmt.setString(10, dm.libo_int_rate);
		cstmt.setString(11, dm.dedu_int_rate);
		cstmt.setString(12, dm.pymt_prcp);
		cstmt.setString(13, dm.pymt_int);
		cstmt.setString(14, dm.won_amt);
		cstmt.setString(15, dm.rmks);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.comp_dt);
		cstmt.setString(19, dm.mtry_dt);
		cstmt.setString(20, dm.dlco_clsf_cd);
		cstmt.setString(21, dm.dlco_cd);
		cstmt.setString(22, dm.leimchagbcd);
		cstmt.setString(23, dm.pch_compnm);
		cstmt.setString(24, dm.use_dept_cd);
		cstmt.setString(25, dm.acctcd);
		cstmt.setString(26, dm.mang_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8044_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("pay_cost_clsf = [" + getPay_cost_clsf() + "]");
		System.out.println("hsty_seq = [" + getHsty_seq() + "]");
		System.out.println("pymt_dt = [" + getPymt_dt() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("libo_int_rate = [" + getLibo_int_rate() + "]");
		System.out.println("dedu_int_rate = [" + getDedu_int_rate() + "]");
		System.out.println("pymt_prcp = [" + getPymt_prcp() + "]");
		System.out.println("pymt_int = [" + getPymt_int() + "]");
		System.out.println("won_amt = [" + getWon_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("leimchagbcd = [" + getLeimchagbcd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("acctcd = [" + getAcctcd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
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
String leas_clsf_cd = req.getParameter("leas_clsf_cd");
if( leas_clsf_cd == null){
	System.out.println(this.toString+" : leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_clsf_cd is "+leas_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String pay_cost_clsf = req.getParameter("pay_cost_clsf");
if( pay_cost_clsf == null){
	System.out.println(this.toString+" : pay_cost_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_cost_clsf is "+pay_cost_clsf );
}
String hsty_seq = req.getParameter("hsty_seq");
if( hsty_seq == null){
	System.out.println(this.toString+" : hsty_seq is null" );
}else{
	System.out.println(this.toString+" : hsty_seq is "+hsty_seq );
}
String pymt_dt = req.getParameter("pymt_dt");
if( pymt_dt == null){
	System.out.println(this.toString+" : pymt_dt is null" );
}else{
	System.out.println(this.toString+" : pymt_dt is "+pymt_dt );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String libo_int_rate = req.getParameter("libo_int_rate");
if( libo_int_rate == null){
	System.out.println(this.toString+" : libo_int_rate is null" );
}else{
	System.out.println(this.toString+" : libo_int_rate is "+libo_int_rate );
}
String dedu_int_rate = req.getParameter("dedu_int_rate");
if( dedu_int_rate == null){
	System.out.println(this.toString+" : dedu_int_rate is null" );
}else{
	System.out.println(this.toString+" : dedu_int_rate is "+dedu_int_rate );
}
String pymt_prcp = req.getParameter("pymt_prcp");
if( pymt_prcp == null){
	System.out.println(this.toString+" : pymt_prcp is null" );
}else{
	System.out.println(this.toString+" : pymt_prcp is "+pymt_prcp );
}
String pymt_int = req.getParameter("pymt_int");
if( pymt_int == null){
	System.out.println(this.toString+" : pymt_int is null" );
}else{
	System.out.println(this.toString+" : pymt_int is "+pymt_int );
}
String won_amt = req.getParameter("won_amt");
if( won_amt == null){
	System.out.println(this.toString+" : won_amt is null" );
}else{
	System.out.println(this.toString+" : won_amt is "+won_amt );
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
String leimchagbcd = req.getParameter("leimchagbcd");
if( leimchagbcd == null){
	System.out.println(this.toString+" : leimchagbcd is null" );
}else{
	System.out.println(this.toString+" : leimchagbcd is "+leimchagbcd );
}
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String acctcd = req.getParameter("acctcd");
if( acctcd == null){
	System.out.println(this.toString+" : acctcd is null" );
}else{
	System.out.println(this.toString+" : acctcd is "+acctcd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String pay_cost_clsf = Util.checkString(req.getParameter("pay_cost_clsf"));
String hsty_seq = Util.checkString(req.getParameter("hsty_seq"));
String pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
String exrate = Util.checkString(req.getParameter("exrate"));
String libo_int_rate = Util.checkString(req.getParameter("libo_int_rate"));
String dedu_int_rate = Util.checkString(req.getParameter("dedu_int_rate"));
String pymt_prcp = Util.checkString(req.getParameter("pymt_prcp"));
String pymt_int = Util.checkString(req.getParameter("pymt_int"));
String won_amt = Util.checkString(req.getParameter("won_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String leimchagbcd = Util.checkString(req.getParameter("leimchagbcd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String acctcd = Util.checkString(req.getParameter("acctcd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String pay_cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cost_clsf")));
String hsty_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_seq")));
String pymt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_dt")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String libo_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("libo_int_rate")));
String dedu_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("dedu_int_rate")));
String pymt_prcp = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_prcp")));
String pymt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_int")));
String won_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String leimchagbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("leimchagbcd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String acctcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setPay_cost_clsf(pay_cost_clsf);
dm.setHsty_seq(hsty_seq);
dm.setPymt_dt(pymt_dt);
dm.setExrate(exrate);
dm.setLibo_int_rate(libo_int_rate);
dm.setDedu_int_rate(dedu_int_rate);
dm.setPymt_prcp(pymt_prcp);
dm.setPymt_int(pymt_int);
dm.setWon_amt(won_amt);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setLeimchagbcd(leimchagbcd);
dm.setPch_compnm(pch_compnm);
dm.setUse_dept_cd(use_dept_cd);
dm.setAcctcd(acctcd);
dm.setMang_clsf_cd(mang_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 17:54:36 KST 2009 */