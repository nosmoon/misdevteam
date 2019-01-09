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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String emp_no;
	public String alon_pay_mm;
	public String st_duty_dt;
	public String et_duty_dt;
	public String proc_stat;
	public String hody_clsf;
	public String duty_dt_ck;
	public String emp_clsf;

	public HD_HLYWRK_1301_LDM(){}
	public HD_HLYWRK_1301_LDM(String cmpy_cd, String dept_cd, String emp_no, String alon_pay_mm, String st_duty_dt, String et_duty_dt, String proc_stat, String hody_clsf, String duty_dt_ck, String emp_clsf){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.alon_pay_mm = alon_pay_mm;
		this.st_duty_dt = st_duty_dt;
		this.et_duty_dt = et_duty_dt;
		this.proc_stat = proc_stat;
		this.hody_clsf = hody_clsf;
		this.duty_dt_ck = duty_dt_ck;
		this.emp_clsf = emp_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAlon_pay_mm(String alon_pay_mm){
		this.alon_pay_mm = alon_pay_mm;
	}

	public void setSt_duty_dt(String st_duty_dt){
		this.st_duty_dt = st_duty_dt;
	}

	public void setEt_duty_dt(String et_duty_dt){
		this.et_duty_dt = et_duty_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setDuty_dt_ck(String duty_dt_ck){
		this.duty_dt_ck = duty_dt_ck;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAlon_pay_mm(){
		return this.alon_pay_mm;
	}

	public String getSt_duty_dt(){
		return this.st_duty_dt;
	}

	public String getEt_duty_dt(){
		return this.et_duty_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getDuty_dt_ck(){
		return this.duty_dt_ck;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1301_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1301_LDM dm = (HD_HLYWRK_1301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.alon_pay_mm);
		cstmt.setString(7, dm.st_duty_dt);
		cstmt.setString(8, dm.et_duty_dt);
		cstmt.setString(9, dm.proc_stat);
		cstmt.setString(10, dm.hody_clsf);
		cstmt.setString(11, dm.duty_dt_ck);
		cstmt.setString(12, dm.emp_clsf);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("alon_pay_mm = [" + getAlon_pay_mm() + "]");
		System.out.println("st_duty_dt = [" + getSt_duty_dt() + "]");
		System.out.println("et_duty_dt = [" + getEt_duty_dt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("hody_clsf = [" + getHody_clsf() + "]");
		System.out.println("duty_dt_ck = [" + getDuty_dt_ck() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String alon_pay_mm = req.getParameter("alon_pay_mm");
if( alon_pay_mm == null){
	System.out.println(this.toString+" : alon_pay_mm is null" );
}else{
	System.out.println(this.toString+" : alon_pay_mm is "+alon_pay_mm );
}
String st_duty_dt = req.getParameter("st_duty_dt");
if( st_duty_dt == null){
	System.out.println(this.toString+" : st_duty_dt is null" );
}else{
	System.out.println(this.toString+" : st_duty_dt is "+st_duty_dt );
}
String et_duty_dt = req.getParameter("et_duty_dt");
if( et_duty_dt == null){
	System.out.println(this.toString+" : et_duty_dt is null" );
}else{
	System.out.println(this.toString+" : et_duty_dt is "+et_duty_dt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String hody_clsf = req.getParameter("hody_clsf");
if( hody_clsf == null){
	System.out.println(this.toString+" : hody_clsf is null" );
}else{
	System.out.println(this.toString+" : hody_clsf is "+hody_clsf );
}
String duty_dt_ck = req.getParameter("duty_dt_ck");
if( duty_dt_ck == null){
	System.out.println(this.toString+" : duty_dt_ck is null" );
}else{
	System.out.println(this.toString+" : duty_dt_ck is "+duty_dt_ck );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String alon_pay_mm = Util.checkString(req.getParameter("alon_pay_mm"));
String st_duty_dt = Util.checkString(req.getParameter("st_duty_dt"));
String et_duty_dt = Util.checkString(req.getParameter("et_duty_dt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String duty_dt_ck = Util.checkString(req.getParameter("duty_dt_ck"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String alon_pay_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_pay_mm")));
String st_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_duty_dt")));
String et_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_duty_dt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String duty_dt_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt_ck")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setAlon_pay_mm(alon_pay_mm);
dm.setSt_duty_dt(st_duty_dt);
dm.setEt_duty_dt(et_duty_dt);
dm.setProc_stat(proc_stat);
dm.setHody_clsf(hody_clsf);
dm.setDuty_dt_ck(duty_dt_ck);
dm.setEmp_clsf(emp_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 19 17:13:59 KST 2018 */