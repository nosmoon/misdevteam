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


public class FC_FUNC_7002_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_mang_no;
	public String loan_no;
	public String loan_nm;
	public String loan_amt;
	public String comp_dt;
	public String mtry_dt;
	public String loan_repay_clsf_cd;
	public String int_clsf_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String loan_patr_budg_cd;
	public String loan_deps_clsf_cd;
	public String colt_note_no;
	public String loan_rmks;
	public String prelae_pay_clsf_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String misfnc_dlco_nm;
	public String int_rate;
	public String use_dept_cd;
	public String igamt;
	public String sgiamt;

	public FC_FUNC_7002_IDM(){}
	public FC_FUNC_7002_IDM(String cmpy_cd, String fund_mang_no, String loan_no, String loan_nm, String loan_amt, String comp_dt, String mtry_dt, String loan_repay_clsf_cd, String int_clsf_cd, String dlco_clsf_cd, String dlco_cd, String loan_patr_budg_cd, String loan_deps_clsf_cd, String colt_note_no, String loan_rmks, String prelae_pay_clsf_cd, String incmg_pers, String incmg_pers_ipadd, String misfnc_dlco_nm, String int_rate, String use_dept_cd, String igamt, String sgiamt){
		this.cmpy_cd = cmpy_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_no = loan_no;
		this.loan_nm = loan_nm;
		this.loan_amt = loan_amt;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
		this.int_clsf_cd = int_clsf_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.loan_patr_budg_cd = loan_patr_budg_cd;
		this.loan_deps_clsf_cd = loan_deps_clsf_cd;
		this.colt_note_no = colt_note_no;
		this.loan_rmks = loan_rmks;
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.misfnc_dlco_nm = misfnc_dlco_nm;
		this.int_rate = int_rate;
		this.use_dept_cd = use_dept_cd;
		this.igamt = igamt;
		this.sgiamt = sgiamt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
	}

	public void setLoan_nm(String loan_nm){
		this.loan_nm = loan_nm;
	}

	public void setLoan_amt(String loan_amt){
		this.loan_amt = loan_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setLoan_repay_clsf_cd(String loan_repay_clsf_cd){
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
	}

	public void setInt_clsf_cd(String int_clsf_cd){
		this.int_clsf_cd = int_clsf_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setLoan_patr_budg_cd(String loan_patr_budg_cd){
		this.loan_patr_budg_cd = loan_patr_budg_cd;
	}

	public void setLoan_deps_clsf_cd(String loan_deps_clsf_cd){
		this.loan_deps_clsf_cd = loan_deps_clsf_cd;
	}

	public void setColt_note_no(String colt_note_no){
		this.colt_note_no = colt_note_no;
	}

	public void setLoan_rmks(String loan_rmks){
		this.loan_rmks = loan_rmks;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMisfnc_dlco_nm(String misfnc_dlco_nm){
		this.misfnc_dlco_nm = misfnc_dlco_nm;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIgamt(String igamt){
		this.igamt = igamt;
	}

	public void setSgiamt(String sgiamt){
		this.sgiamt = sgiamt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
	}

	public String getLoan_nm(){
		return this.loan_nm;
	}

	public String getLoan_amt(){
		return this.loan_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getLoan_repay_clsf_cd(){
		return this.loan_repay_clsf_cd;
	}

	public String getInt_clsf_cd(){
		return this.int_clsf_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getLoan_patr_budg_cd(){
		return this.loan_patr_budg_cd;
	}

	public String getLoan_deps_clsf_cd(){
		return this.loan_deps_clsf_cd;
	}

	public String getColt_note_no(){
		return this.colt_note_no;
	}

	public String getLoan_rmks(){
		return this.loan_rmks;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getMisfnc_dlco_nm(){
		return this.misfnc_dlco_nm;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIgamt(){
		return this.igamt;
	}

	public String getSgiamt(){
		return this.sgiamt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7002_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7002_IDM dm = (FC_FUNC_7002_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_mang_no);
		cstmt.setString(5, dm.loan_no);
		cstmt.setString(6, dm.loan_nm);
		cstmt.setString(7, dm.loan_amt);
		cstmt.setString(8, dm.comp_dt);
		cstmt.setString(9, dm.mtry_dt);
		cstmt.setString(10, dm.loan_repay_clsf_cd);
		cstmt.setString(11, dm.int_clsf_cd);
		cstmt.setString(12, dm.dlco_clsf_cd);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.loan_patr_budg_cd);
		cstmt.setString(15, dm.loan_deps_clsf_cd);
		cstmt.setString(16, dm.colt_note_no);
		cstmt.setString(17, dm.loan_rmks);
		cstmt.setString(18, dm.prelae_pay_clsf_cd);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.misfnc_dlco_nm);
		cstmt.setString(22, dm.int_rate);
		cstmt.setString(23, dm.use_dept_cd);
		cstmt.setString(24, dm.igamt);
		cstmt.setString(25, dm.sgiamt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7002_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_no = [" + getLoan_no() + "]");
		System.out.println("loan_nm = [" + getLoan_nm() + "]");
		System.out.println("loan_amt = [" + getLoan_amt() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("loan_repay_clsf_cd = [" + getLoan_repay_clsf_cd() + "]");
		System.out.println("int_clsf_cd = [" + getInt_clsf_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("loan_patr_budg_cd = [" + getLoan_patr_budg_cd() + "]");
		System.out.println("loan_deps_clsf_cd = [" + getLoan_deps_clsf_cd() + "]");
		System.out.println("colt_note_no = [" + getColt_note_no() + "]");
		System.out.println("loan_rmks = [" + getLoan_rmks() + "]");
		System.out.println("prelae_pay_clsf_cd = [" + getPrelae_pay_clsf_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("misfnc_dlco_nm = [" + getMisfnc_dlco_nm() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("igamt = [" + getIgamt() + "]");
		System.out.println("sgiamt = [" + getSgiamt() + "]");
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
String fund_mang_no = req.getParameter("fund_mang_no");
if( fund_mang_no == null){
	System.out.println(this.toString+" : fund_mang_no is null" );
}else{
	System.out.println(this.toString+" : fund_mang_no is "+fund_mang_no );
}
String loan_no = req.getParameter("loan_no");
if( loan_no == null){
	System.out.println(this.toString+" : loan_no is null" );
}else{
	System.out.println(this.toString+" : loan_no is "+loan_no );
}
String loan_nm = req.getParameter("loan_nm");
if( loan_nm == null){
	System.out.println(this.toString+" : loan_nm is null" );
}else{
	System.out.println(this.toString+" : loan_nm is "+loan_nm );
}
String loan_amt = req.getParameter("loan_amt");
if( loan_amt == null){
	System.out.println(this.toString+" : loan_amt is null" );
}else{
	System.out.println(this.toString+" : loan_amt is "+loan_amt );
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
String loan_repay_clsf_cd = req.getParameter("loan_repay_clsf_cd");
if( loan_repay_clsf_cd == null){
	System.out.println(this.toString+" : loan_repay_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : loan_repay_clsf_cd is "+loan_repay_clsf_cd );
}
String int_clsf_cd = req.getParameter("int_clsf_cd");
if( int_clsf_cd == null){
	System.out.println(this.toString+" : int_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : int_clsf_cd is "+int_clsf_cd );
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
String loan_patr_budg_cd = req.getParameter("loan_patr_budg_cd");
if( loan_patr_budg_cd == null){
	System.out.println(this.toString+" : loan_patr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : loan_patr_budg_cd is "+loan_patr_budg_cd );
}
String loan_deps_clsf_cd = req.getParameter("loan_deps_clsf_cd");
if( loan_deps_clsf_cd == null){
	System.out.println(this.toString+" : loan_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : loan_deps_clsf_cd is "+loan_deps_clsf_cd );
}
String colt_note_no = req.getParameter("colt_note_no");
if( colt_note_no == null){
	System.out.println(this.toString+" : colt_note_no is null" );
}else{
	System.out.println(this.toString+" : colt_note_no is "+colt_note_no );
}
String loan_rmks = req.getParameter("loan_rmks");
if( loan_rmks == null){
	System.out.println(this.toString+" : loan_rmks is null" );
}else{
	System.out.println(this.toString+" : loan_rmks is "+loan_rmks );
}
String prelae_pay_clsf_cd = req.getParameter("prelae_pay_clsf_cd");
if( prelae_pay_clsf_cd == null){
	System.out.println(this.toString+" : prelae_pay_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : prelae_pay_clsf_cd is "+prelae_pay_clsf_cd );
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
String misfnc_dlco_nm = req.getParameter("misfnc_dlco_nm");
if( misfnc_dlco_nm == null){
	System.out.println(this.toString+" : misfnc_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : misfnc_dlco_nm is "+misfnc_dlco_nm );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String igamt = req.getParameter("igamt");
if( igamt == null){
	System.out.println(this.toString+" : igamt is null" );
}else{
	System.out.println(this.toString+" : igamt is "+igamt );
}
String sgiamt = req.getParameter("sgiamt");
if( sgiamt == null){
	System.out.println(this.toString+" : sgiamt is null" );
}else{
	System.out.println(this.toString+" : sgiamt is "+sgiamt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_no = Util.checkString(req.getParameter("loan_no"));
String loan_nm = Util.checkString(req.getParameter("loan_nm"));
String loan_amt = Util.checkString(req.getParameter("loan_amt"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String loan_repay_clsf_cd = Util.checkString(req.getParameter("loan_repay_clsf_cd"));
String int_clsf_cd = Util.checkString(req.getParameter("int_clsf_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String loan_patr_budg_cd = Util.checkString(req.getParameter("loan_patr_budg_cd"));
String loan_deps_clsf_cd = Util.checkString(req.getParameter("loan_deps_clsf_cd"));
String colt_note_no = Util.checkString(req.getParameter("colt_note_no"));
String loan_rmks = Util.checkString(req.getParameter("loan_rmks"));
String prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String misfnc_dlco_nm = Util.checkString(req.getParameter("misfnc_dlco_nm"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String igamt = Util.checkString(req.getParameter("igamt"));
String sgiamt = Util.checkString(req.getParameter("sgiamt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_no = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_no")));
String loan_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_nm")));
String loan_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_amt")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String loan_repay_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_repay_clsf_cd")));
String int_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("int_clsf_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String loan_patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_patr_budg_cd")));
String loan_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_deps_clsf_cd")));
String colt_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_note_no")));
String loan_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_rmks")));
String prelae_pay_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prelae_pay_clsf_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String misfnc_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("misfnc_dlco_nm")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String igamt = Util.Uni2Ksc(Util.checkString(req.getParameter("igamt")));
String sgiamt = Util.Uni2Ksc(Util.checkString(req.getParameter("sgiamt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_no(loan_no);
dm.setLoan_nm(loan_nm);
dm.setLoan_amt(loan_amt);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setLoan_repay_clsf_cd(loan_repay_clsf_cd);
dm.setInt_clsf_cd(int_clsf_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setLoan_patr_budg_cd(loan_patr_budg_cd);
dm.setLoan_deps_clsf_cd(loan_deps_clsf_cd);
dm.setColt_note_no(colt_note_no);
dm.setLoan_rmks(loan_rmks);
dm.setPrelae_pay_clsf_cd(prelae_pay_clsf_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setMisfnc_dlco_nm(misfnc_dlco_nm);
dm.setInt_rate(int_rate);
dm.setUse_dept_cd(use_dept_cd);
dm.setIgamt(igamt);
dm.setSgiamt(sgiamt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 12:09:04 KST 2009 */