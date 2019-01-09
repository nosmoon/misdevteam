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


package chosun.ciis.hd.dwnwrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.ds.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 * 
 */


public class HD_DWNWRK_1302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String duty_dt;
	public String alon_amt;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String s_mode;
	public String s_duty_dds;
	public String s_emp_no;
	public String s_total_alon_amt;
	public String s_pay_dt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_DWNWRK_1302_ADM(){}
	public HD_DWNWRK_1302_ADM(String mode, String cmpy_cd, String emp_no, String dept_cd, String duty_dt, String alon_amt, String slip_proc_mang_dt, String slip_proc_mang_seq, String s_mode, String s_duty_dds, String s_emp_no, String s_total_alon_amt, String s_pay_dt, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.duty_dt = duty_dt;
		this.alon_amt = alon_amt;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.s_mode = s_mode;
		this.s_duty_dds = s_duty_dds;
		this.s_emp_no = s_emp_no;
		this.s_total_alon_amt = s_total_alon_amt;
		this.s_pay_dt = s_pay_dt;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setAlon_amt(String alon_amt){
		this.alon_amt = alon_amt;
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

	public void setS_duty_dds(String s_duty_dds){
		this.s_duty_dds = s_duty_dds;
	}

	public void setS_emp_no(String s_emp_no){
		this.s_emp_no = s_emp_no;
	}

	public void setS_total_alon_amt(String s_total_alon_amt){
		this.s_total_alon_amt = s_total_alon_amt;
	}

	public void setS_pay_dt(String s_pay_dt){
		this.s_pay_dt = s_pay_dt;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getAlon_amt(){
		return this.alon_amt;
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

	public String getS_duty_dds(){
		return this.s_duty_dds;
	}

	public String getS_emp_no(){
		return this.s_emp_no;
	}

	public String getS_total_alon_amt(){
		return this.s_total_alon_amt;
	}

	public String getS_pay_dt(){
		return this.s_pay_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DWNWRK_1302_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DWNWRK_1302_ADM dm = (HD_DWNWRK_1302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.duty_dt);
		cstmt.setString(8, dm.alon_amt);
		cstmt.setString(9, dm.slip_proc_mang_dt);
		cstmt.setString(10, dm.slip_proc_mang_seq);
		cstmt.setString(11, dm.s_mode);
		cstmt.setString(12, dm.s_duty_dds);
		cstmt.setString(13, dm.s_emp_no);
		cstmt.setString(14, dm.s_total_alon_amt);
		cstmt.setString(15, dm.s_pay_dt);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dwnwrk.ds.HD_DWNWRK_1302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("alon_amt = [" + getAlon_amt() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("s_mode = [" + getS_mode() + "]");
		System.out.println("s_duty_dds = [" + getS_duty_dds() + "]");
		System.out.println("s_emp_no = [" + getS_emp_no() + "]");
		System.out.println("s_total_alon_amt = [" + getS_total_alon_amt() + "]");
		System.out.println("s_pay_dt = [" + getS_pay_dt() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String alon_amt = req.getParameter("alon_amt");
if( alon_amt == null){
	System.out.println(this.toString+" : alon_amt is null" );
}else{
	System.out.println(this.toString+" : alon_amt is "+alon_amt );
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
String s_duty_dds = req.getParameter("s_duty_dds");
if( s_duty_dds == null){
	System.out.println(this.toString+" : s_duty_dds is null" );
}else{
	System.out.println(this.toString+" : s_duty_dds is "+s_duty_dds );
}
String s_emp_no = req.getParameter("s_emp_no");
if( s_emp_no == null){
	System.out.println(this.toString+" : s_emp_no is null" );
}else{
	System.out.println(this.toString+" : s_emp_no is "+s_emp_no );
}
String s_total_alon_amt = req.getParameter("s_total_alon_amt");
if( s_total_alon_amt == null){
	System.out.println(this.toString+" : s_total_alon_amt is null" );
}else{
	System.out.println(this.toString+" : s_total_alon_amt is "+s_total_alon_amt );
}
String s_pay_dt = req.getParameter("s_pay_dt");
if( s_pay_dt == null){
	System.out.println(this.toString+" : s_pay_dt is null" );
}else{
	System.out.println(this.toString+" : s_pay_dt is "+s_pay_dt );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String alon_amt = Util.checkString(req.getParameter("alon_amt"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String s_mode = Util.checkString(req.getParameter("s_mode"));
String s_duty_dds = Util.checkString(req.getParameter("s_duty_dds"));
String s_emp_no = Util.checkString(req.getParameter("s_emp_no"));
String s_total_alon_amt = Util.checkString(req.getParameter("s_total_alon_amt"));
String s_pay_dt = Util.checkString(req.getParameter("s_pay_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String alon_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_amt")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String s_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("s_mode")));
String s_duty_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("s_duty_dds")));
String s_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("s_emp_no")));
String s_total_alon_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("s_total_alon_amt")));
String s_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("s_pay_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setDuty_dt(duty_dt);
dm.setAlon_amt(alon_amt);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setS_mode(s_mode);
dm.setS_duty_dds(s_duty_dds);
dm.setS_emp_no(s_emp_no);
dm.setS_total_alon_amt(s_total_alon_amt);
dm.setS_pay_dt(s_pay_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Sep 06 15:48:22 KST 2009 */