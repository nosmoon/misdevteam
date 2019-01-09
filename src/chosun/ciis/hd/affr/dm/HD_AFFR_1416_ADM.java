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


public class HD_AFFR_1416_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String s_mode;
	public String tmp_dr_amt;
	public String flnm;
	public String dept_cd;
	public String cmpy_welf_fund_clsf;
	public String emp_no;
	public String tmp_crdt_amt;
	public String titl;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String occr_dt;
	public String seq;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_1416_ADM(){}
	public HD_AFFR_1416_ADM(String cmpy_cd, String s_mode, String tmp_dr_amt, String flnm, String dept_cd, String cmpy_welf_fund_clsf, String emp_no, String tmp_crdt_amt, String titl, String slip_proc_mang_dt, String slip_proc_mang_seq, String occr_dt, String seq, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.s_mode = s_mode;
		this.tmp_dr_amt = tmp_dr_amt;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.cmpy_welf_fund_clsf = cmpy_welf_fund_clsf;
		this.emp_no = emp_no;
		this.tmp_crdt_amt = tmp_crdt_amt;
		this.titl = titl;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setS_mode(String s_mode){
		this.s_mode = s_mode;
	}

	public void setTmp_dr_amt(String tmp_dr_amt){
		this.tmp_dr_amt = tmp_dr_amt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCmpy_welf_fund_clsf(String cmpy_welf_fund_clsf){
		this.cmpy_welf_fund_clsf = cmpy_welf_fund_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setTmp_crdt_amt(String tmp_crdt_amt){
		this.tmp_crdt_amt = tmp_crdt_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getS_mode(){
		return this.s_mode;
	}

	public String getTmp_dr_amt(){
		return this.tmp_dr_amt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCmpy_welf_fund_clsf(){
		return this.cmpy_welf_fund_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getTmp_crdt_amt(){
		return this.tmp_crdt_amt;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1416_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1416_ADM dm = (HD_AFFR_1416_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.s_mode);
		cstmt.setString(5, dm.tmp_dr_amt);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.cmpy_welf_fund_clsf);
		cstmt.setString(9, dm.emp_no);
		cstmt.setString(10, dm.tmp_crdt_amt);
		cstmt.setString(11, dm.titl);
		cstmt.setString(12, dm.slip_proc_mang_dt);
		cstmt.setString(13, dm.slip_proc_mang_seq);
		cstmt.setString(14, dm.occr_dt);
		cstmt.setString(15, dm.seq);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.ss_emp_no);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1416_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("s_mode = [" + getS_mode() + "]");
		System.out.println("tmp_dr_amt = [" + getTmp_dr_amt() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("cmpy_welf_fund_clsf = [" + getCmpy_welf_fund_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("tmp_crdt_amt = [" + getTmp_crdt_amt() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String cmpy_welf_fund_clsf = Util.checkString(req.getParameter("cmpy_welf_fund_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String tmp_dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_dr_amt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String cmpy_welf_fund_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_welf_fund_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String tmp_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_crdt_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
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
dm.setCmpy_welf_fund_clsf(cmpy_welf_fund_clsf);
dm.setEmp_no(emp_no);
dm.setTmp_crdt_amt(tmp_crdt_amt);
dm.setTitl(titl);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 14:56:20 KST 2009 */