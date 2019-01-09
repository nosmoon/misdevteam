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


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1503_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String seq;
	public String occr_dt;
	public String aply_yy;
	public String qq_clsf;
	public String appm_vaca_plan_dt;
	public String wkdy;
	public String dept_cd;
	public String proc_stat;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_VACA_1503_ADM(){}
	public HD_VACA_1503_ADM(String mode, String cmpy_cd, String emp_no, String seq, String occr_dt, String aply_yy, String qq_clsf, String appm_vaca_plan_dt, String wkdy, String dept_cd, String proc_stat, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.aply_yy = aply_yy;
		this.qq_clsf = qq_clsf;
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
		this.wkdy = wkdy;
		this.dept_cd = dept_cd;
		this.proc_stat = proc_stat;
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

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public void setAppm_vaca_plan_dt(String appm_vaca_plan_dt){
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
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

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getAppm_vaca_plan_dt(){
		return this.appm_vaca_plan_dt;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1503_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1503_ADM dm = (HD_VACA_1503_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.aply_yy);
		cstmt.setString(9, dm.qq_clsf);
		cstmt.setString(10, dm.appm_vaca_plan_dt);
		cstmt.setString(11, dm.wkdy);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.proc_stat);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1503_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("aply_yy = [" + getAply_yy() + "]");
		System.out.println("qq_clsf = [" + getQq_clsf() + "]");
		System.out.println("appm_vaca_plan_dt = [" + getAppm_vaca_plan_dt() + "]");
		System.out.println("wkdy = [" + getWkdy() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String aply_yy = req.getParameter("aply_yy");
if( aply_yy == null){
	System.out.println(this.toString+" : aply_yy is null" );
}else{
	System.out.println(this.toString+" : aply_yy is "+aply_yy );
}
String qq_clsf = req.getParameter("qq_clsf");
if( qq_clsf == null){
	System.out.println(this.toString+" : qq_clsf is null" );
}else{
	System.out.println(this.toString+" : qq_clsf is "+qq_clsf );
}
String appm_vaca_plan_dt = req.getParameter("appm_vaca_plan_dt");
if( appm_vaca_plan_dt == null){
	System.out.println(this.toString+" : appm_vaca_plan_dt is null" );
}else{
	System.out.println(this.toString+" : appm_vaca_plan_dt is "+appm_vaca_plan_dt );
}
String wkdy = req.getParameter("wkdy");
if( wkdy == null){
	System.out.println(this.toString+" : wkdy is null" );
}else{
	System.out.println(this.toString+" : wkdy is "+wkdy );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String aply_yy = Util.checkString(req.getParameter("aply_yy"));
String qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
String appm_vaca_plan_dt = Util.checkString(req.getParameter("appm_vaca_plan_dt"));
String wkdy = Util.checkString(req.getParameter("wkdy"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yy")));
String qq_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qq_clsf")));
String appm_vaca_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_vaca_plan_dt")));
String wkdy = Util.Uni2Ksc(Util.checkString(req.getParameter("wkdy")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setAply_yy(aply_yy);
dm.setQq_clsf(qq_clsf);
dm.setAppm_vaca_plan_dt(appm_vaca_plan_dt);
dm.setWkdy(wkdy);
dm.setDept_cd(dept_cd);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 11:47:19 KST 2009 */