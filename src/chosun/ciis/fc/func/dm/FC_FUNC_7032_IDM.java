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


public class FC_FUNC_7032_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_mang_no;
	public String loan_no;
	public String pay_dt;
	public String comp_dt;
	public String mtry_dt;
	public String int_rate;
	public String int_amt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String patr_budg_cd;
	public String deps_clsf_cd;

	public FC_FUNC_7032_IDM(){}
	public FC_FUNC_7032_IDM(String cmpy_cd, String fund_mang_no, String loan_no, String pay_dt, String comp_dt, String mtry_dt, String int_rate, String int_amt, String rmks, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd, String patr_budg_cd, String deps_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_no = loan_no;
		this.pay_dt = pay_dt;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.int_rate = int_rate;
		this.int_amt = int_amt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.patr_budg_cd = patr_budg_cd;
		this.deps_clsf_cd = deps_clsf_cd;
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

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setInt_amt(String int_amt){
		this.int_amt = int_amt;
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

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
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

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getInt_amt(){
		return this.int_amt;
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

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7032_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7032_IDM dm = (FC_FUNC_7032_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_mang_no);
		cstmt.setString(5, dm.loan_no);
		cstmt.setString(6, dm.pay_dt);
		cstmt.setString(7, dm.comp_dt);
		cstmt.setString(8, dm.mtry_dt);
		cstmt.setString(9, dm.int_rate);
		cstmt.setString(10, dm.int_amt);
		cstmt.setString(11, dm.rmks);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.use_dept_cd);
		cstmt.setString(15, dm.patr_budg_cd);
		cstmt.setString(16, dm.deps_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7032_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_no = [" + getLoan_no() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("int_amt = [" + getInt_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("patr_budg_cd = [" + getPatr_budg_cd() + "]");
		System.out.println("deps_clsf_cd = [" + getDeps_clsf_cd() + "]");
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
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
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
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String int_amt = req.getParameter("int_amt");
if( int_amt == null){
	System.out.println(this.toString+" : int_amt is null" );
}else{
	System.out.println(this.toString+" : int_amt is "+int_amt );
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
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_no = Util.checkString(req.getParameter("loan_no"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String int_amt = Util.checkString(req.getParameter("int_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_no = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_no")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String int_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("int_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_budg_cd")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_no(loan_no);
dm.setPay_dt(pay_dt);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setInt_rate(int_rate);
dm.setInt_amt(int_amt);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setPatr_budg_cd(patr_budg_cd);
dm.setDeps_clsf_cd(deps_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 17:00:36 KST 2009 */