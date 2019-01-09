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


public class FC_ACCT_3256_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip_sub_seq;
	public String fisc_dt_fr;
	public String fisc_dt_to;
	public String incmg_dt_fr;
	public String incmg_dt_to;
	public String slip_clsf_cd;
	public String incmg_emp_no;
	public String clam_dept_cd;
	public String slip_aprv_yn;

	public FC_ACCT_3256_LDM(){}
	public FC_ACCT_3256_LDM(String cmpy_cd, String slip_occr_dt, String slip_seq, String slip_sub_seq, String fisc_dt_fr, String fisc_dt_to, String incmg_dt_fr, String incmg_dt_to, String slip_clsf_cd, String incmg_emp_no, String clam_dept_cd, String slip_aprv_yn){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.fisc_dt_fr = fisc_dt_fr;
		this.fisc_dt_to = fisc_dt_to;
		this.incmg_dt_fr = incmg_dt_fr;
		this.incmg_dt_to = incmg_dt_to;
		this.slip_clsf_cd = slip_clsf_cd;
		this.incmg_emp_no = incmg_emp_no;
		this.clam_dept_cd = clam_dept_cd;
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setFisc_dt_fr(String fisc_dt_fr){
		this.fisc_dt_fr = fisc_dt_fr;
	}

	public void setFisc_dt_to(String fisc_dt_to){
		this.fisc_dt_to = fisc_dt_to;
	}

	public void setIncmg_dt_fr(String incmg_dt_fr){
		this.incmg_dt_fr = incmg_dt_fr;
	}

	public void setIncmg_dt_to(String incmg_dt_to){
		this.incmg_dt_to = incmg_dt_to;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getFisc_dt_fr(){
		return this.fisc_dt_fr;
	}

	public String getFisc_dt_to(){
		return this.fisc_dt_to;
	}

	public String getIncmg_dt_fr(){
		return this.incmg_dt_fr;
	}

	public String getIncmg_dt_to(){
		return this.incmg_dt_to;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_3256_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_3256_LDM dm = (FC_ACCT_3256_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_seq);
		cstmt.setString(6, dm.slip_sub_seq);
		cstmt.setString(7, dm.fisc_dt_fr);
		cstmt.setString(8, dm.fisc_dt_to);
		cstmt.setString(9, dm.incmg_dt_fr);
		cstmt.setString(10, dm.incmg_dt_to);
		cstmt.setString(11, dm.slip_clsf_cd);
		cstmt.setString(12, dm.incmg_emp_no);
		cstmt.setString(13, dm.clam_dept_cd);
		cstmt.setString(14, dm.slip_aprv_yn);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_3256_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("fisc_dt_fr = [" + getFisc_dt_fr() + "]");
		System.out.println("fisc_dt_to = [" + getFisc_dt_to() + "]");
		System.out.println("incmg_dt_fr = [" + getIncmg_dt_fr() + "]");
		System.out.println("incmg_dt_to = [" + getIncmg_dt_to() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("slip_aprv_yn = [" + getSlip_aprv_yn() + "]");
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
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String fisc_dt_fr = req.getParameter("fisc_dt_fr");
if( fisc_dt_fr == null){
	System.out.println(this.toString+" : fisc_dt_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_fr is "+fisc_dt_fr );
}
String fisc_dt_to = req.getParameter("fisc_dt_to");
if( fisc_dt_to == null){
	System.out.println(this.toString+" : fisc_dt_to is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_to is "+fisc_dt_to );
}
String incmg_dt_fr = req.getParameter("incmg_dt_fr");
if( incmg_dt_fr == null){
	System.out.println(this.toString+" : incmg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_fr is "+incmg_dt_fr );
}
String incmg_dt_to = req.getParameter("incmg_dt_to");
if( incmg_dt_to == null){
	System.out.println(this.toString+" : incmg_dt_to is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_to is "+incmg_dt_to );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String slip_aprv_yn = req.getParameter("slip_aprv_yn");
if( slip_aprv_yn == null){
	System.out.println(this.toString+" : slip_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : slip_aprv_yn is "+slip_aprv_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
String fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
String incmg_dt_fr = Util.checkString(req.getParameter("incmg_dt_fr"));
String incmg_dt_to = Util.checkString(req.getParameter("incmg_dt_to"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String fisc_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_fr")));
String fisc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_to")));
String incmg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_fr")));
String incmg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_to")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String slip_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_aprv_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setFisc_dt_fr(fisc_dt_fr);
dm.setFisc_dt_to(fisc_dt_to);
dm.setIncmg_dt_fr(incmg_dt_fr);
dm.setIncmg_dt_to(incmg_dt_to);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setClam_dept_cd(clam_dept_cd);
dm.setSlip_aprv_yn(slip_aprv_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 21 16:44:53 KST 2014 */