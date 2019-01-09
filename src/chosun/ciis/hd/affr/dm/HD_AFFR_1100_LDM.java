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


public class HD_AFFR_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String srch_code;
	public String dept_cd;
	public String srch_emp_no;
	public String use_fr_aplc_dt;
	public String use_to_aplc_dt;
	public String emp_clsf;
	public String actu_slip_no;
	public String proc_stat;
	public String ss_emp_no;

	public HD_AFFR_1100_LDM(){}
	public HD_AFFR_1100_LDM(String cmpy_cd, String emp_no, String srch_code, String dept_cd, String srch_emp_no, String use_fr_aplc_dt, String use_to_aplc_dt, String emp_clsf, String actu_slip_no, String proc_stat, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.srch_code = srch_code;
		this.dept_cd = dept_cd;
		this.srch_emp_no = srch_emp_no;
		this.use_fr_aplc_dt = use_fr_aplc_dt;
		this.use_to_aplc_dt = use_to_aplc_dt;
		this.emp_clsf = emp_clsf;
		this.actu_slip_no = actu_slip_no;
		this.proc_stat = proc_stat;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSrch_code(String srch_code){
		this.srch_code = srch_code;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSrch_emp_no(String srch_emp_no){
		this.srch_emp_no = srch_emp_no;
	}

	public void setUse_fr_aplc_dt(String use_fr_aplc_dt){
		this.use_fr_aplc_dt = use_fr_aplc_dt;
	}

	public void setUse_to_aplc_dt(String use_to_aplc_dt){
		this.use_to_aplc_dt = use_to_aplc_dt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setActu_slip_no(String actu_slip_no){     
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSrch_code(){
		return this.srch_code;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSrch_emp_no(){
		return this.srch_emp_no;
	}

	public String getUse_fr_aplc_dt(){
		return this.use_fr_aplc_dt;
	}

	public String getUse_to_aplc_dt(){
		return this.use_to_aplc_dt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1100_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1100_LDM dm = (HD_AFFR_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.srch_code);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.srch_emp_no);
		cstmt.setString(8, dm.use_fr_aplc_dt);
		cstmt.setString(9, dm.use_to_aplc_dt);
		cstmt.setString(10, dm.emp_clsf);
		cstmt.setString(11, dm.actu_slip_no);
		cstmt.setString(12, dm.proc_stat);
		cstmt.setString(13, dm.ss_emp_no);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("srch_code = [" + getSrch_code() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("srch_emp_no = [" + getSrch_emp_no() + "]");
		System.out.println("use_fr_aplc_dt = [" + getUse_fr_aplc_dt() + "]");
		System.out.println("use_to_aplc_dt = [" + getUse_to_aplc_dt() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String srch_code = req.getParameter("srch_code");
if( srch_code == null){
	System.out.println(this.toString+" : srch_code is null" );
}else{
	System.out.println(this.toString+" : srch_code is "+srch_code );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String srch_emp_no = req.getParameter("srch_emp_no");
if( srch_emp_no == null){
	System.out.println(this.toString+" : srch_emp_no is null" );
}else{
	System.out.println(this.toString+" : srch_emp_no is "+srch_emp_no );
}
String use_fr_aplc_dt = req.getParameter("use_fr_aplc_dt");
if( use_fr_aplc_dt == null){
	System.out.println(this.toString+" : use_fr_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : use_fr_aplc_dt is "+use_fr_aplc_dt );
}
String use_to_aplc_dt = req.getParameter("use_to_aplc_dt");
if( use_to_aplc_dt == null){
	System.out.println(this.toString+" : use_to_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : use_to_aplc_dt is "+use_to_aplc_dt );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String srch_code = Util.checkString(req.getParameter("srch_code"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
String use_fr_aplc_dt = Util.checkString(req.getParameter("use_fr_aplc_dt"));
String use_to_aplc_dt = Util.checkString(req.getParameter("use_to_aplc_dt"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String srch_code = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_code")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String srch_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_emp_no")));
String use_fr_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_fr_aplc_dt")));
String use_to_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_to_aplc_dt")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSrch_code(srch_code);
dm.setDept_cd(dept_cd);
dm.setSrch_emp_no(srch_emp_no);
dm.setUse_fr_aplc_dt(use_fr_aplc_dt);
dm.setUse_to_aplc_dt(use_to_aplc_dt);
dm.setEmp_clsf(emp_clsf);
dm.setActu_slip_no(actu_slip_no);
dm.setProc_stat(proc_stat);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 08 17:20:18 KST 2013 */