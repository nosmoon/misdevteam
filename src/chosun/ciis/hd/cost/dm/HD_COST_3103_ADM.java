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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_3103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String pay_cost;
	public String duty_dt;
	public String flnm;
	public String dept_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String s_mode;
	public String tmp_crdt_amt;
	public String titl;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_COST_3103_ADM(){}
	public HD_COST_3103_ADM(String mode, String cmpy_cd, String emp_no, String pay_cost, String duty_dt, String flnm, String dept_cd, String medi_cd, String dtls_medi_cd, String slip_proc_mang_dt, String slip_proc_mang_seq, String s_mode, String tmp_crdt_amt, String titl, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.pay_cost = pay_cost;
		this.duty_dt = duty_dt;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.s_mode = s_mode;
		this.tmp_crdt_amt = tmp_crdt_amt;
		this.titl = titl;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPay_cost(String pay_cost){
		this.pay_cost = pay_cost;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setS_mode(String s_mode){
		this.s_mode = s_mode;
	}

	public void setTmp_crdt_amt(String tmp_crdt_amt){
		this.tmp_crdt_amt = tmp_crdt_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPay_cost(){
		return this.pay_cost;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getS_mode(){
		return this.s_mode;
	}

	public String getTmp_crdt_amt(){
		return this.tmp_crdt_amt;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_3103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_3103_ADM dm = (HD_COST_3103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.pay_cost);
		cstmt.setString(7, dm.duty_dt);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.dtls_medi_cd);
		cstmt.setString(12, dm.slip_proc_mang_dt);
		cstmt.setString(13, dm.slip_proc_mang_seq);
		cstmt.setString(14, dm.s_mode);
		cstmt.setString(15, dm.tmp_crdt_amt);
		cstmt.setString(16, dm.titl);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.ss_emp_no);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_3103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pay_cost = [" + getPay_cost() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("s_mode = [" + getS_mode() + "]");
		System.out.println("tmp_crdt_amt = [" + getTmp_crdt_amt() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String pay_cost = req.getParameter("pay_cost");
if( pay_cost == null){
	System.out.println(this.toString+" : pay_cost is null" );
}else{
	System.out.println(this.toString+" : pay_cost is "+pay_cost );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
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
String s_mode = req.getParameter("s_mode");
if( s_mode == null){
	System.out.println(this.toString+" : s_mode is null" );
}else{
	System.out.println(this.toString+" : s_mode is "+s_mode );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pay_cost = Util.checkString(req.getParameter("pay_cost"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String s_mode = Util.checkString(req.getParameter("s_mode"));
String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pay_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cost")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String tmp_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmp_crdt_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPay_cost(pay_cost);
dm.setDuty_dt(duty_dt);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setS_mode(s_mode);
dm.setTmp_crdt_amt(tmp_crdt_amt);
dm.setTitl(titl);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 13 14:35:08 KST 2012 */