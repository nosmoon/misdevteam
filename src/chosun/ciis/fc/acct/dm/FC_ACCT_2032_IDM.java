/***************************************************************************************************
* 파일명 : .java
* 기능 : 회계관리-시내교통비등록
* 작성일자 : 2009-03-30
* 작성자 : 노상현
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
 * 회계관리-시내교통비등록
 */


public class FC_ACCT_2032_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_arow_no;
	public String budg_yymm;
	public String emp_no;
	public String clam_dept_cd;
	public String clam_amt;
	public String rmks;
	public String chrg_emp_no;
	public String dest;
	public String amt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String emp_nm;
	public String use_dept_cd;

	public FC_ACCT_2032_IDM(){}
	public FC_ACCT_2032_IDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_arow_no, String budg_yymm, String emp_no, String clam_dept_cd, String clam_amt, String rmks, String chrg_emp_no, String dest, String amt, String incmg_pers_ipadd, String incmg_pers, String emp_nm, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_arow_no = slip_arow_no;
		this.budg_yymm = budg_yymm;
		this.emp_no = emp_no;
		this.clam_dept_cd = clam_dept_cd;
		this.clam_amt = clam_amt;
		this.rmks = rmks;
		this.chrg_emp_no = chrg_emp_no;
		this.dest = dest;
		this.amt = amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.emp_nm = emp_nm;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setDest(String dest){
		this.dest = dest;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getDest(){
		return this.dest;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2032_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2032_IDM dm = (FC_ACCT_2032_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_arow_no);
		cstmt.setString(8, dm.budg_yymm);
		cstmt.setString(9, dm.emp_no);
		cstmt.setString(10, dm.clam_dept_cd);
		cstmt.setString(11, dm.clam_amt);
		cstmt.setString(12, dm.rmks);
		cstmt.setString(13, dm.chrg_emp_no);
		cstmt.setString(14, dm.dest);
		cstmt.setString(15, dm.amt);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.emp_nm);
		cstmt.setString(19, dm.use_dept_cd);
		cstmt.registerOutParameter(20, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2032_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("chrg_emp_no = [" + getChrg_emp_no() + "]");
		System.out.println("dest = [" + getDest() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("emp_nm = [" + getEmp_nm() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String chrg_emp_no = req.getParameter("chrg_emp_no");
if( chrg_emp_no == null){
	System.out.println(this.toString+" : chrg_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_emp_no is "+chrg_emp_no );
}
String dest = req.getParameter("dest");
if( dest == null){
	System.out.println(this.toString+" : dest is null" );
}else{
	System.out.println(this.toString+" : dest is "+dest );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
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
String emp_nm = req.getParameter("emp_nm");
if( emp_nm == null){
	System.out.println(this.toString+" : emp_nm is null" );
}else{
	System.out.println(this.toString+" : emp_nm is "+emp_nm );
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
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String dest = Util.checkString(req.getParameter("dest"));
String amt = Util.checkString(req.getParameter("amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String emp_nm = Util.checkString(req.getParameter("emp_nm"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String dest = Util.Uni2Ksc(Util.checkString(req.getParameter("dest")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String emp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_nm")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_arow_no(slip_arow_no);
dm.setBudg_yymm(budg_yymm);
dm.setEmp_no(emp_no);
dm.setClam_dept_cd(clam_dept_cd);
dm.setClam_amt(clam_amt);
dm.setRmks(rmks);
dm.setChrg_emp_no(chrg_emp_no);
dm.setDest(dest);
dm.setAmt(amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setEmp_nm(emp_nm);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 20:57:27 KST 2009 */