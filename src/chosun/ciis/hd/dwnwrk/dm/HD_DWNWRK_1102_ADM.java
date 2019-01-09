

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


public class HD_DWNWRK_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String dept_cd;
	public String erl_prsnt_bgn_tm;
	public String erl_prsnt_end_tm;
	public String erl_prsnt_duty_tm;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_tm;
	public String duty_resn;
	public String app_emp_no;
	public String u_ipadd;
	public String u_id;

	public HD_DWNWRK_1102_ADM(){}
	public HD_DWNWRK_1102_ADM(String mode, String cmpy_cd, String duty_dt, String emp_no, String dept_cd, String erl_prsnt_bgn_tm, String erl_prsnt_end_tm, String erl_prsnt_duty_tm, String prsnt_tm, String finish_dd_clsf, String finish_tm, String duty_resn, String app_emp_no, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.erl_prsnt_bgn_tm = erl_prsnt_bgn_tm;
		this.erl_prsnt_end_tm = erl_prsnt_end_tm;
		this.erl_prsnt_duty_tm = erl_prsnt_duty_tm;
		this.prsnt_tm = prsnt_tm;
		this.finish_dd_clsf = finish_dd_clsf;
		this.finish_tm = finish_tm;
		this.duty_resn = duty_resn;
		this.app_emp_no = app_emp_no;
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

	public void setErl_prsnt_bgn_tm(String erl_prsnt_bgn_tm){
		this.erl_prsnt_bgn_tm = erl_prsnt_bgn_tm;
	}

	public void setErl_prsnt_end_tm(String erl_prsnt_end_tm){
		this.erl_prsnt_end_tm = erl_prsnt_end_tm;
	}

	public void setErl_prsnt_duty_tm(String erl_prsnt_duty_tm){
		this.erl_prsnt_duty_tm = erl_prsnt_duty_tm;
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

	public void setDuty_resn(String duty_resn){
		this.duty_resn = duty_resn;
	}

	public void setApp_emp_no(String app_emp_no){
		this.app_emp_no = app_emp_no;
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

	public String getErl_prsnt_bgn_tm(){
		return this.erl_prsnt_bgn_tm;
	}

	public String getErl_prsnt_end_tm(){
		return this.erl_prsnt_end_tm;
	}

	public String getErl_prsnt_duty_tm(){
		return this.erl_prsnt_duty_tm;
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

	public String getDuty_resn(){
		return this.duty_resn;
	}

	public String getApp_emp_no(){
		return this.app_emp_no;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DWNWRK_1102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DWNWRK_1102_ADM dm = (HD_DWNWRK_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.erl_prsnt_bgn_tm);
		cstmt.setString(9, dm.erl_prsnt_end_tm);
		cstmt.setString(10, dm.erl_prsnt_duty_tm);
		cstmt.setString(11, dm.prsnt_tm);
		cstmt.setString(12, dm.finish_dd_clsf);
		cstmt.setString(13, dm.finish_tm);
		cstmt.setString(14, dm.duty_resn);
		cstmt.setString(15, dm.app_emp_no);
		cstmt.setString(16, dm.u_ipadd);
		cstmt.setString(17, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_DWNWRK_1102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("erl_prsnt_bgn_tm = [" + getErl_prsnt_bgn_tm() + "]");
		System.out.println("erl_prsnt_end_tm = [" + getErl_prsnt_end_tm() + "]");
		System.out.println("erl_prsnt_duty_tm = [" + getErl_prsnt_duty_tm() + "]");
		System.out.println("prsnt_tm = [" + getPrsnt_tm() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("finish_tm = [" + getFinish_tm() + "]");
		System.out.println("duty_resn = [" + getDuty_resn() + "]");
		System.out.println("app_emp_no = [" + getApp_emp_no() + "]");
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
String erl_prsnt_bgn_tm = req.getParameter("erl_prsnt_bgn_tm");
if( erl_prsnt_bgn_tm == null){
	System.out.println(this.toString+" : erl_prsnt_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_bgn_tm is "+erl_prsnt_bgn_tm );
}
String erl_prsnt_end_tm = req.getParameter("erl_prsnt_end_tm");
if( erl_prsnt_end_tm == null){
	System.out.println(this.toString+" : erl_prsnt_end_tm is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_end_tm is "+erl_prsnt_end_tm );
}
String erl_prsnt_duty_tm = req.getParameter("erl_prsnt_duty_tm");
if( erl_prsnt_duty_tm == null){
	System.out.println(this.toString+" : erl_prsnt_duty_tm is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_duty_tm is "+erl_prsnt_duty_tm );
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
String duty_resn = req.getParameter("duty_resn");
if( duty_resn == null){
	System.out.println(this.toString+" : duty_resn is null" );
}else{
	System.out.println(this.toString+" : duty_resn is "+duty_resn );
}
String app_emp_no = req.getParameter("app_emp_no");
if( app_emp_no == null){
	System.out.println(this.toString+" : app_emp_no is null" );
}else{
	System.out.println(this.toString+" : app_emp_no is "+app_emp_no );
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
String erl_prsnt_bgn_tm = Util.checkString(req.getParameter("erl_prsnt_bgn_tm"));
String erl_prsnt_end_tm = Util.checkString(req.getParameter("erl_prsnt_end_tm"));
String erl_prsnt_duty_tm = Util.checkString(req.getParameter("erl_prsnt_duty_tm"));
String prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String finish_tm = Util.checkString(req.getParameter("finish_tm"));
String duty_resn = Util.checkString(req.getParameter("duty_resn"));
String app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String erl_prsnt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_bgn_tm")));
String erl_prsnt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_end_tm")));
String erl_prsnt_duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_duty_tm")));
String prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm")));
String duty_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_resn")));
String app_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("app_emp_no")));
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
dm.setErl_prsnt_bgn_tm(erl_prsnt_bgn_tm);
dm.setErl_prsnt_end_tm(erl_prsnt_end_tm);
dm.setErl_prsnt_duty_tm(erl_prsnt_duty_tm);
dm.setPrsnt_tm(prsnt_tm);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setFinish_tm(finish_tm);
dm.setDuty_resn(duty_resn);
dm.setApp_emp_no(app_emp_no);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 26 15:45:10 KST 2010 */