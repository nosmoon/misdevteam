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


public class FC_ACCT_2143_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tax_slip_no;
	public String sg_budg_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String slip_rcpm_dt;
	public String slip_sub_seq;
	public String budg_cd;
	public String rcpm_amt;
	public String coms;
	public String incmg_pers;
	public String jdw_fg;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String rmks;

	public FC_ACCT_2143_IDM(){}
	public FC_ACCT_2143_IDM(String cmpy_cd, String tax_slip_no, String sg_budg_cd, String ask_emp_no, String ask_dept_cd, String slip_rcpm_dt, String slip_sub_seq, String budg_cd, String rcpm_amt, String coms, String incmg_pers, String jdw_fg, String incmg_pers_ipadd, String use_dept_cd, String rmks){
		this.cmpy_cd = cmpy_cd;
		this.tax_slip_no = tax_slip_no;
		this.sg_budg_cd = sg_budg_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.slip_sub_seq = slip_sub_seq;
		this.budg_cd = budg_cd;
		this.rcpm_amt = rcpm_amt;
		this.coms = coms;
		this.incmg_pers = incmg_pers;
		this.jdw_fg = jdw_fg;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.rmks = rmks;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTax_slip_no(String tax_slip_no){
		this.tax_slip_no = tax_slip_no;
	}

	public void setSg_budg_cd(String sg_budg_cd){
		this.sg_budg_cd = sg_budg_cd;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJdw_fg(String jdw_fg){
		this.jdw_fg = jdw_fg;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTax_slip_no(){
		return this.tax_slip_no;
	}

	public String getSg_budg_cd(){
		return this.sg_budg_cd;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJdw_fg(){
		return this.jdw_fg;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2143_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2143_IDM dm = (FC_ACCT_2143_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tax_slip_no);
		cstmt.setString(5, dm.sg_budg_cd);
		cstmt.setString(6, dm.ask_emp_no);
		cstmt.setString(7, dm.ask_dept_cd);
		cstmt.setString(8, dm.slip_rcpm_dt);
		cstmt.setString(9, dm.slip_sub_seq);
		cstmt.setString(10, dm.budg_cd);
		cstmt.setString(11, dm.rcpm_amt);
		cstmt.setString(12, dm.coms);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.jdw_fg);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.use_dept_cd);
		cstmt.setString(17, dm.rmks);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2143_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tax_slip_no = [" + getTax_slip_no() + "]");
		System.out.println("sg_budg_cd = [" + getSg_budg_cd() + "]");
		System.out.println("ask_emp_no = [" + getAsk_emp_no() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("jdw_fg = [" + getJdw_fg() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
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
String tax_slip_no = req.getParameter("tax_slip_no");
if( tax_slip_no == null){
	System.out.println(this.toString+" : tax_slip_no is null" );
}else{
	System.out.println(this.toString+" : tax_slip_no is "+tax_slip_no );
}
String sg_budg_cd = req.getParameter("sg_budg_cd");
if( sg_budg_cd == null){
	System.out.println(this.toString+" : sg_budg_cd is null" );
}else{
	System.out.println(this.toString+" : sg_budg_cd is "+sg_budg_cd );
}
String ask_emp_no = req.getParameter("ask_emp_no");
if( ask_emp_no == null){
	System.out.println(this.toString+" : ask_emp_no is null" );
}else{
	System.out.println(this.toString+" : ask_emp_no is "+ask_emp_no );
}
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String slip_rcpm_dt = req.getParameter("slip_rcpm_dt");
if( slip_rcpm_dt == null){
	System.out.println(this.toString+" : slip_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : slip_rcpm_dt is "+slip_rcpm_dt );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String jdw_fg = req.getParameter("jdw_fg");
if( jdw_fg == null){
	System.out.println(this.toString+" : jdw_fg is null" );
}else{
	System.out.println(this.toString+" : jdw_fg is "+jdw_fg );
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
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tax_slip_no = Util.checkString(req.getParameter("tax_slip_no"));
String sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String coms = Util.checkString(req.getParameter("coms"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String jdw_fg = Util.checkString(req.getParameter("jdw_fg"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tax_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_slip_no")));
String sg_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sg_budg_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String jdw_fg = Util.Uni2Ksc(Util.checkString(req.getParameter("jdw_fg")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTax_slip_no(tax_slip_no);
dm.setSg_budg_cd(sg_budg_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setBudg_cd(budg_cd);
dm.setRcpm_amt(rcpm_amt);
dm.setComs(coms);
dm.setIncmg_pers(incmg_pers);
dm.setJdw_fg(jdw_fg);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setRmks(rmks);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 17:57:03 KST 2009 */