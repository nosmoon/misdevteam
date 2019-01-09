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


public class FC_FUNC_7073_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String loan_budg_cd;
	public String repay_dt;
	public String repay_rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String fund_mang_no;
	public String loan_no;
	public String repay_amt;
	public String repay_slip_occr_dt;
	public String repay_slip_clsf_cd;
	public String repay_slip_seq;

	public FC_FUNC_7073_IDM(){}
	public FC_FUNC_7073_IDM(String cmpy_cd, String mode, String loan_budg_cd, String repay_dt, String repay_rmks, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd, String fund_mang_no, String loan_no, String repay_amt, String repay_slip_occr_dt, String repay_slip_clsf_cd, String repay_slip_seq){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.loan_budg_cd = loan_budg_cd;
		this.repay_dt = repay_dt;
		this.repay_rmks = repay_rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_no = loan_no;
		this.repay_amt = repay_amt;
		this.repay_slip_occr_dt = repay_slip_occr_dt;
		this.repay_slip_clsf_cd = repay_slip_clsf_cd;
		this.repay_slip_seq = repay_slip_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setLoan_budg_cd(String loan_budg_cd){
		this.loan_budg_cd = loan_budg_cd;
	}

	public void setRepay_dt(String repay_dt){
		this.repay_dt = repay_dt;
	}

	public void setRepay_rmks(String repay_rmks){
		this.repay_rmks = repay_rmks;
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

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
	}

	public void setRepay_amt(String repay_amt){
		this.repay_amt = repay_amt;
	}

	public void setRepay_slip_occr_dt(String repay_slip_occr_dt){
		this.repay_slip_occr_dt = repay_slip_occr_dt;
	}

	public void setRepay_slip_clsf_cd(String repay_slip_clsf_cd){
		this.repay_slip_clsf_cd = repay_slip_clsf_cd;
	}

	public void setRepay_slip_seq(String repay_slip_seq){
		this.repay_slip_seq = repay_slip_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getLoan_budg_cd(){
		return this.loan_budg_cd;
	}

	public String getRepay_dt(){
		return this.repay_dt;
	}

	public String getRepay_rmks(){
		return this.repay_rmks;
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

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
	}

	public String getRepay_amt(){
		return this.repay_amt;
	}

	public String getRepay_slip_occr_dt(){
		return this.repay_slip_occr_dt;
	}

	public String getRepay_slip_clsf_cd(){
		return this.repay_slip_clsf_cd;
	}

	public String getRepay_slip_seq(){
		return this.repay_slip_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7073_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7073_IDM dm = (FC_FUNC_7073_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.loan_budg_cd);
		cstmt.setString(6, dm.repay_dt);
		cstmt.setString(7, dm.repay_rmks);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.use_dept_cd);
		cstmt.setString(11, dm.fund_mang_no);
		cstmt.setString(12, dm.loan_no);
		cstmt.setString(13, dm.repay_amt);
		cstmt.setString(14, dm.repay_slip_occr_dt);
		cstmt.setString(15, dm.repay_slip_clsf_cd);
		cstmt.setString(16, dm.repay_slip_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7073_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("loan_budg_cd = [" + getLoan_budg_cd() + "]");
		System.out.println("repay_dt = [" + getRepay_dt() + "]");
		System.out.println("repay_rmks = [" + getRepay_rmks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_no = [" + getLoan_no() + "]");
		System.out.println("repay_amt = [" + getRepay_amt() + "]");
		System.out.println("repay_slip_occr_dt = [" + getRepay_slip_occr_dt() + "]");
		System.out.println("repay_slip_clsf_cd = [" + getRepay_slip_clsf_cd() + "]");
		System.out.println("repay_slip_seq = [" + getRepay_slip_seq() + "]");
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
String loan_budg_cd = req.getParameter("loan_budg_cd");
if( loan_budg_cd == null){
	System.out.println(this.toString+" : loan_budg_cd is null" );
}else{
	System.out.println(this.toString+" : loan_budg_cd is "+loan_budg_cd );
}
String repay_dt = req.getParameter("repay_dt");
if( repay_dt == null){
	System.out.println(this.toString+" : repay_dt is null" );
}else{
	System.out.println(this.toString+" : repay_dt is "+repay_dt );
}
String repay_rmks = req.getParameter("repay_rmks");
if( repay_rmks == null){
	System.out.println(this.toString+" : repay_rmks is null" );
}else{
	System.out.println(this.toString+" : repay_rmks is "+repay_rmks );
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
String repay_amt = req.getParameter("repay_amt");
if( repay_amt == null){
	System.out.println(this.toString+" : repay_amt is null" );
}else{
	System.out.println(this.toString+" : repay_amt is "+repay_amt );
}
String repay_slip_occr_dt = req.getParameter("repay_slip_occr_dt");
if( repay_slip_occr_dt == null){
	System.out.println(this.toString+" : repay_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : repay_slip_occr_dt is "+repay_slip_occr_dt );
}
String repay_slip_clsf_cd = req.getParameter("repay_slip_clsf_cd");
if( repay_slip_clsf_cd == null){
	System.out.println(this.toString+" : repay_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : repay_slip_clsf_cd is "+repay_slip_clsf_cd );
}
String repay_slip_seq = req.getParameter("repay_slip_seq");
if( repay_slip_seq == null){
	System.out.println(this.toString+" : repay_slip_seq is null" );
}else{
	System.out.println(this.toString+" : repay_slip_seq is "+repay_slip_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String loan_budg_cd = Util.checkString(req.getParameter("loan_budg_cd"));
String repay_dt = Util.checkString(req.getParameter("repay_dt"));
String repay_rmks = Util.checkString(req.getParameter("repay_rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_no = Util.checkString(req.getParameter("loan_no"));
String repay_amt = Util.checkString(req.getParameter("repay_amt"));
String repay_slip_occr_dt = Util.checkString(req.getParameter("repay_slip_occr_dt"));
String repay_slip_clsf_cd = Util.checkString(req.getParameter("repay_slip_clsf_cd"));
String repay_slip_seq = Util.checkString(req.getParameter("repay_slip_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String loan_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_budg_cd")));
String repay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_dt")));
String repay_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_no = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_no")));
String repay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_amt")));
String repay_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_occr_dt")));
String repay_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_clsf_cd")));
String repay_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setLoan_budg_cd(loan_budg_cd);
dm.setRepay_dt(repay_dt);
dm.setRepay_rmks(repay_rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_no(loan_no);
dm.setRepay_amt(repay_amt);
dm.setRepay_slip_occr_dt(repay_slip_occr_dt);
dm.setRepay_slip_clsf_cd(repay_slip_clsf_cd);
dm.setRepay_slip_seq(repay_slip_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 19:14:55 KST 2009 */