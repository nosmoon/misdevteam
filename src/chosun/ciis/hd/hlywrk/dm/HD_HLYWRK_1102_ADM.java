/***************************************************************************************************
* 파일명 : HD_HLYWRK_1102_ADM.java
* 기능 : 휴일근무관리
* 작성일자 : 2009.04.20
* 작성자 : 강영슬
**************************************************************************************************/
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


public class HD_HLYWRK_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String dept_cd;
	public String obj_clsf;
	public String hody_clsf;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_tm;
	public String tot_duty_tm;
	public String alvc_use_dt;
	public String alvc_use_yn;
	public String alvc_plan_dt;
	public String proc_stat;
	public String now_date;
	public String u_ipadd;
	public String u_id;

	public HD_HLYWRK_1102_ADM(){}
	public HD_HLYWRK_1102_ADM(String mode, String cmpy_cd, String duty_dt, String emp_no, String dept_cd, String obj_clsf, String hody_clsf, String prsnt_tm, String finish_dd_clsf, String finish_tm, String tot_duty_tm, String alvc_use_dt, String alvc_use_yn, String alvc_plan_dt, String proc_stat, String now_date, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.obj_clsf = obj_clsf;
		this.hody_clsf = hody_clsf;
		this.prsnt_tm = prsnt_tm;
		this.finish_dd_clsf = finish_dd_clsf;
		this.finish_tm = finish_tm;
		this.tot_duty_tm = tot_duty_tm;
		this.alvc_use_dt = alvc_use_dt;
		this.alvc_use_yn = alvc_use_yn;
		this.alvc_plan_dt = alvc_plan_dt;
		this.proc_stat = proc_stat;
		this.now_date = now_date;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setTot_duty_tm(String tot_duty_tm){
		this.tot_duty_tm = tot_duty_tm;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setAlvc_use_yn(String alvc_use_yn){
		this.alvc_use_yn = alvc_use_yn;
	}

	public void setAlvc_plan_dt(String alvc_plan_dt){
		this.alvc_plan_dt = alvc_plan_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}
	
	public void setNow_date(String now_date){
		this.now_date = now_date;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getTot_duty_tm(){
		return this.tot_duty_tm;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getAlvc_use_yn(){
		return this.alvc_use_yn;
	}

	public String getAlvc_plan_dt(){
		return this.alvc_plan_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
	
	public String getNow_date(){
		return this.now_date;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1102_ADM dm = (HD_HLYWRK_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.obj_clsf);
		cstmt.setString(9, dm.hody_clsf);
		cstmt.setString(10, dm.prsnt_tm);
		cstmt.setString(11, dm.finish_dd_clsf);
		cstmt.setString(12, dm.finish_tm);
		cstmt.setString(13, dm.tot_duty_tm);
		cstmt.setString(14, dm.alvc_use_dt);
		cstmt.setString(15, dm.alvc_use_yn);
		cstmt.setString(16, dm.alvc_plan_dt);
		cstmt.setString(17, dm.proc_stat);
		cstmt.setString(18, dm.now_date);
		cstmt.setString(19, dm.u_ipadd);
		cstmt.setString(20, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
		System.out.println("hody_clsf = [" + getHody_clsf() + "]");
		System.out.println("prsnt_tm = [" + getPrsnt_tm() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("finish_tm = [" + getFinish_tm() + "]");
		System.out.println("tot_duty_tm = [" + getTot_duty_tm() + "]");
		System.out.println("alvc_use_dt = [" + getAlvc_use_dt() + "]");
		System.out.println("alvc_use_yn = [" + getAlvc_use_yn() + "]");
		System.out.println("alvc_plan_dt = [" + getAlvc_plan_dt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("now_date = [" + getNow_date() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
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
String obj_clsf = req.getParameter("obj_clsf");
if( obj_clsf == null){
	System.out.println(this.toString+" : obj_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_clsf is "+obj_clsf );
}
String hody_clsf = req.getParameter("hody_clsf");
if( hody_clsf == null){
	System.out.println(this.toString+" : hody_clsf is null" );
}else{
	System.out.println(this.toString+" : hody_clsf is "+hody_clsf );
}
String prsnt_tm = req.getParameter("prsnt_tm");
if( prsnt_tm == null){
	System.out.println(this.toString+" : prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm is "+prsnt_tm );
}
String finish_dd_clsf = req.getParameter("finish_dd_clsf");
if( finish_dd_clsf == null){
	System.out.println(this.toString+" : finish_dd_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_dd_clsf is "+finish_dd_clsf );
}
String finish_tm = req.getParameter("finish_tm");
if( finish_tm == null){
	System.out.println(this.toString+" : finish_tm is null" );
}else{
	System.out.println(this.toString+" : finish_tm is "+finish_tm );
}
String tot_duty_tm = req.getParameter("tot_duty_tm");
if( tot_duty_tm == null){
	System.out.println(this.toString+" : tot_duty_tm is null" );
}else{
	System.out.println(this.toString+" : tot_duty_tm is "+tot_duty_tm );
}
String alvc_use_dt = req.getParameter("alvc_use_dt");
if( alvc_use_dt == null){
	System.out.println(this.toString+" : alvc_use_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_use_dt is "+alvc_use_dt );
}
String alvc_use_yn = req.getParameter("alvc_use_yn");
if( alvc_use_yn == null){
	System.out.println(this.toString+" : alvc_use_yn is null" );
}else{
	System.out.println(this.toString+" : alvc_use_yn is "+alvc_use_yn );
}
String alvc_plan_dt = req.getParameter("alvc_plan_dt");
if( alvc_plan_dt == null){
	System.out.println(this.toString+" : alvc_plan_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_plan_dt is "+alvc_plan_dt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String finish_tm = Util.checkString(req.getParameter("finish_tm"));
String tot_duty_tm = Util.checkString(req.getParameter("tot_duty_tm"));
String alvc_use_dt = Util.checkString(req.getParameter("alvc_use_dt"));
String alvc_use_yn = Util.checkString(req.getParameter("alvc_use_yn"));
String alvc_plan_dt = Util.checkString(req.getParameter("alvc_plan_dt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm")));
String tot_duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_duty_tm")));
String alvc_use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_dt")));
String alvc_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_yn")));
String alvc_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_plan_dt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setObj_clsf(obj_clsf);
dm.setHody_clsf(hody_clsf);
dm.setPrsnt_tm(prsnt_tm);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setFinish_tm(finish_tm);
dm.setTot_duty_tm(tot_duty_tm);
dm.setAlvc_use_dt(alvc_use_dt);
dm.setAlvc_use_yn(alvc_use_yn);
dm.setAlvc_plan_dt(alvc_plan_dt);
dm.setProc_stat(proc_stat);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 15:10:33 KST 2009 */