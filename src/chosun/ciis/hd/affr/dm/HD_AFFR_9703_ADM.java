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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9703_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String seq;
	public String proc_mang_dt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_9703_ADM(){}
	public HD_AFFR_9703_ADM(String cmpy_cd, String mang_no, String seq, String proc_mang_dt, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.seq = seq;
		this.proc_mang_dt = proc_mang_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}
	
	public void setProc_mang_dt(String proc_mang_dt){
		this.proc_mang_dt = proc_mang_dt;
	}
	
	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getSeq(){
		return this.seq;
	}
	
	public String getProc_mang_dt(){
		return this.proc_mang_dt;
	}
	
	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9703_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9703_ADM dm = (HD_AFFR_9703_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_no);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.proc_mang_dt);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.ss_emp_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9703_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("proc_mang_dt = [" + getProc_mang_dt() + "]");
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
String s_mode = req.getParameter("s_mode");
if( s_mode == null){
	System.out.println(this.toString+" : s_mode is null" );
}else{
	System.out.println(this.toString+" : s_mode is "+s_mode );
}
String tmp_dr_amt = req.getParameter("tmp_dr_amt");
if( tmp_dr_amt == null){
	System.out.println(this.toString+" : tmp_dr_amt is null" );
}else{
	System.out.println(this.toString+" : tmp_dr_amt is "+tmp_dr_amt );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String titl2 = req.getParameter("titl2");
if( titl2 == null){
	System.out.println(this.toString+" : titl2 is null" );
}else{
	System.out.println(this.toString+" : titl2 is "+titl2 );
}
String cmpy_welf_fund_clsf = req.getParameter("cmpy_welf_fund_clsf");
if( cmpy_welf_fund_clsf == null){
	System.out.println(this.toString+" : cmpy_welf_fund_clsf is null" );
}else{
	System.out.println(this.toString+" : cmpy_welf_fund_clsf is "+cmpy_welf_fund_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String tmp_crdt_amt = req.getParameter("tmp_crdt_amt");
if( tmp_crdt_amt == null){
	System.out.println(this.toString+" : tmp_crdt_amt is null" );
}else{
	System.out.println(this.toString+" : tmp_crdt_amt is "+tmp_crdt_amt );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcpt_clsf = req.getParameter("rcpt_clsf");
if( rcpt_clsf == null){
	System.out.println(this.toString+" : rcpt_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_clsf is "+rcpt_clsf );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String s_mode = Util.checkString(req.getParameter("s_mode"));
String tmp_dr_amt = Util.checkString(req.getParameter("tmp_dr_amt"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String titl2 = Util.checkString(req.getParameter("titl2"));
String cmpy_welf_fund_clsf = Util.checkString(req.getParameter("cmpy_welf_fund_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String rcpt_clsf = Util.checkString(req.getParameter("rcpt_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String tmp_dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_dr_amt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String titl2 = Util.Uni2Ksc(Util.checkString(req.getParameter("titl2")));
String cmpy_welf_fund_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_welf_fund_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String tmp_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_crdt_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcpt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setS_mode(s_mode);
dm.setTmp_dr_amt(tmp_dr_amt);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setTitl2(titl2);
dm.setCmpy_welf_fund_clsf(cmpy_welf_fund_clsf);
dm.setEmp_no(emp_no);
dm.setTmp_crdt_amt(tmp_crdt_amt);
dm.setTitl(titl);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setRcpt_clsf(rcpt_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 13 19:13:02 KST 2012 */