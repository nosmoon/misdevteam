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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2907_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String fisc_dt;
	public String incmg_emp_no;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String budg_cd;
	public String dr_amt;
	public String clam_dept_cd;
	public String mang_clsf_cd;
	public String boks_dlco_nm;
	public String rmks2;
	public String budg_cd1;
	public String mang_clsf_cd1;

	public FC_ACCT_2907_IDM(){}
	public FC_ACCT_2907_IDM(String cmpy_cd, String incmg_dt, String fisc_dt, String incmg_emp_no, String chg_pers, String incmg_pers_ipadd, String use_dept_cd, String budg_cd, String dr_amt, String clam_dept_cd, String mang_clsf_cd, String boks_dlco_nm, String rmks2, String budg_cd1, String mang_clsf_cd1){
		this.cmpy_cd = cmpy_cd;
		this.incmg_dt = incmg_dt;
		this.fisc_dt = fisc_dt;
		this.incmg_emp_no = incmg_emp_no;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.budg_cd = budg_cd;
		this.dr_amt = dr_amt;
		this.clam_dept_cd = clam_dept_cd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.boks_dlco_nm = boks_dlco_nm;
		this.rmks2 = rmks2;
		this.budg_cd1 = budg_cd1;
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setBudg_cd1(String budg_cd1){
		this.budg_cd1 = budg_cd1;
	}

	public void setMang_clsf_cd1(String mang_clsf_cd1){
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getBudg_cd1(){
		return this.budg_cd1;
	}

	public String getMang_clsf_cd1(){
		return this.mang_clsf_cd1;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2907_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2907_IDM dm = (FC_ACCT_2907_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_dt);
		cstmt.setString(5, dm.fisc_dt);
		cstmt.setString(6, dm.incmg_emp_no);
		cstmt.setString(7, dm.chg_pers);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.use_dept_cd);
		cstmt.setString(10, dm.budg_cd);
		cstmt.setString(11, dm.dr_amt);
		cstmt.setString(12, dm.clam_dept_cd);
		cstmt.setString(13, dm.mang_clsf_cd);
		cstmt.setString(14, dm.boks_dlco_nm);
		cstmt.setString(15, dm.rmks2);
		cstmt.setString(16, dm.budg_cd1);
		cstmt.setString(17, dm.mang_clsf_cd1);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2907_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("boks_dlco_nm = [" + getBoks_dlco_nm() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("budg_cd1 = [" + getBudg_cd1() + "]");
		System.out.println("mang_clsf_cd1 = [" + getMang_clsf_cd1() + "]");
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
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String budg_cd1 = req.getParameter("budg_cd1");
if( budg_cd1 == null){
	System.out.println(this.toString+" : budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : budg_cd1 is "+budg_cd1 );
}
String mang_clsf_cd1 = req.getParameter("mang_clsf_cd1");
if( mang_clsf_cd1 == null){
	System.out.println(this.toString+" : mang_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd1 is "+mang_clsf_cd1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
String mang_clsf_cd1 = Util.checkString(req.getParameter("mang_clsf_cd1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd1")));
String mang_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_dt(incmg_dt);
dm.setFisc_dt(fisc_dt);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setBudg_cd(budg_cd);
dm.setDr_amt(dr_amt);
dm.setClam_dept_cd(clam_dept_cd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setRmks2(rmks2);
dm.setBudg_cd1(budg_cd1);
dm.setMang_clsf_cd1(mang_clsf_cd1);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 19 13:40:41 KST 2009 */