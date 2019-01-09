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


public class HD_VACA_1500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_appm_vaca_plan_dt;
	public String to_appm_vaca_plan_dt;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String emp_nm;
	public String proc_stat;
	public String aply_yy;
	public String qq_clsf;

	public HD_VACA_1500_LDM(){}
	public HD_VACA_1500_LDM(String cmpy_cd, String fr_appm_vaca_plan_dt, String to_appm_vaca_plan_dt, String dept_cd, String dept_nm, String emp_no, String emp_nm, String proc_stat, String aply_yy, String qq_clsf){
		this.cmpy_cd = cmpy_cd;
		this.fr_appm_vaca_plan_dt = fr_appm_vaca_plan_dt;
		this.to_appm_vaca_plan_dt = to_appm_vaca_plan_dt;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.emp_no = emp_no;
		this.emp_nm = emp_nm;
		this.proc_stat = proc_stat;
		this.aply_yy = aply_yy;
		this.qq_clsf = qq_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_appm_vaca_plan_dt(String fr_appm_vaca_plan_dt){
		this.fr_appm_vaca_plan_dt = fr_appm_vaca_plan_dt;
	}

	public void setTo_appm_vaca_plan_dt(String to_appm_vaca_plan_dt){
		this.to_appm_vaca_plan_dt = to_appm_vaca_plan_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_appm_vaca_plan_dt(){
		return this.fr_appm_vaca_plan_dt;
	}

	public String getTo_appm_vaca_plan_dt(){
		return this.to_appm_vaca_plan_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1500_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1500_LDM dm = (HD_VACA_1500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_appm_vaca_plan_dt);
		cstmt.setString(5, dm.to_appm_vaca_plan_dt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.dept_nm);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.emp_nm);
		cstmt.setString(10, dm.proc_stat);
		cstmt.setString(11, dm.aply_yy);
		cstmt.setString(12, dm.qq_clsf);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_appm_vaca_plan_dt = [" + getFr_appm_vaca_plan_dt() + "]");
		System.out.println("to_appm_vaca_plan_dt = [" + getTo_appm_vaca_plan_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("emp_nm = [" + getEmp_nm() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("aply_yy = [" + getAply_yy() + "]");
		System.out.println("qq_clsf = [" + getQq_clsf() + "]");
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
String fr_appm_vaca_plan_dt = req.getParameter("fr_appm_vaca_plan_dt");
if( fr_appm_vaca_plan_dt == null){
	System.out.println(this.toString+" : fr_appm_vaca_plan_dt is null" );
}else{
	System.out.println(this.toString+" : fr_appm_vaca_plan_dt is "+fr_appm_vaca_plan_dt );
}
String to_appm_vaca_plan_dt = req.getParameter("to_appm_vaca_plan_dt");
if( to_appm_vaca_plan_dt == null){
	System.out.println(this.toString+" : to_appm_vaca_plan_dt is null" );
}else{
	System.out.println(this.toString+" : to_appm_vaca_plan_dt is "+to_appm_vaca_plan_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String emp_nm = req.getParameter("emp_nm");
if( emp_nm == null){
	System.out.println(this.toString+" : emp_nm is null" );
}else{
	System.out.println(this.toString+" : emp_nm is "+emp_nm );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_appm_vaca_plan_dt = Util.checkString(req.getParameter("fr_appm_vaca_plan_dt"));
String to_appm_vaca_plan_dt = Util.checkString(req.getParameter("to_appm_vaca_plan_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String emp_nm = Util.checkString(req.getParameter("emp_nm"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String aply_yy = Util.checkString(req.getParameter("aply_yy"));
String qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_appm_vaca_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_appm_vaca_plan_dt")));
String to_appm_vaca_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_appm_vaca_plan_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String emp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_nm")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yy")));
String qq_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qq_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_appm_vaca_plan_dt(fr_appm_vaca_plan_dt);
dm.setTo_appm_vaca_plan_dt(to_appm_vaca_plan_dt);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setEmp_no(emp_no);
dm.setEmp_nm(emp_nm);
dm.setProc_stat(proc_stat);
dm.setAply_yy(aply_yy);
dm.setQq_clsf(qq_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 22:25:54 KST 2009 */