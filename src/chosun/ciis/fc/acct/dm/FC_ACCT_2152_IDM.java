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


public class FC_ACCT_2152_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String budg_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String slip_rcpm_dt;
	public String budg_cd2;
	public String rcpm_amt;
	public String incmg_pers;
	public String jdw_fg;
	public String incmg_pers_ipadd;
	public String pch_buseocd;
	public String rmks;

	public FC_ACCT_2152_IDM(){}
	public FC_ACCT_2152_IDM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String budg_cd, String ask_emp_no, String ask_dept_cd, String slip_rcpm_dt, String budg_cd2, String rcpm_amt, String incmg_pers, String jdw_fg, String incmg_pers_ipadd, String pch_buseocd, String rmks){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.budg_cd = budg_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.budg_cd2 = budg_cd2;
		this.rcpm_amt = rcpm_amt;
		this.incmg_pers = incmg_pers;
		this.jdw_fg = jdw_fg;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.pch_buseocd = pch_buseocd;
		this.rmks = rmks;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
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

	public void setBudg_cd2(String budg_cd2){
		this.budg_cd2 = budg_cd2;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
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

	public void setPch_buseocd(String pch_buseocd){
		this.pch_buseocd = pch_buseocd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
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

	public String getBudg_cd2(){
		return this.budg_cd2;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
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

	public String getPch_buseocd(){
		return this.pch_buseocd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2152_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2152_IDM dm = (FC_ACCT_2152_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.ask_emp_no);
		cstmt.setString(9, dm.ask_dept_cd);
		cstmt.setString(10, dm.slip_rcpm_dt);
		cstmt.setString(11, dm.budg_cd2);
		cstmt.setString(12, dm.rcpm_amt);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.jdw_fg);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.pch_buseocd);
		cstmt.setString(17, dm.rmks);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2152_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("ask_emp_no = [" + getAsk_emp_no() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("budg_cd2 = [" + getBudg_cd2() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("jdw_fg = [" + getJdw_fg() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("pch_buseocd = [" + getPch_buseocd() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
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
String budg_cd2 = req.getParameter("budg_cd2");
if( budg_cd2 == null){
	System.out.println(this.toString+" : budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : budg_cd2 is "+budg_cd2 );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
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
String pch_buseocd = req.getParameter("pch_buseocd");
if( pch_buseocd == null){
	System.out.println(this.toString+" : pch_buseocd is null" );
}else{
	System.out.println(this.toString+" : pch_buseocd is "+pch_buseocd );
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
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String jdw_fg = Util.checkString(req.getParameter("jdw_fg"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String pch_buseocd = Util.checkString(req.getParameter("pch_buseocd"));
String rmks = Util.checkString(req.getParameter("rmks"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd2")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String jdw_fg = Util.Uni2Ksc(Util.checkString(req.getParameter("jdw_fg")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String pch_buseocd = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_buseocd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setBudg_cd(budg_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setBudg_cd2(budg_cd2);
dm.setRcpm_amt(rcpm_amt);
dm.setIncmg_pers(incmg_pers);
dm.setJdw_fg(jdw_fg);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setPch_buseocd(pch_buseocd);
dm.setRmks(rmks);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 19:27:21 KST 2009 */