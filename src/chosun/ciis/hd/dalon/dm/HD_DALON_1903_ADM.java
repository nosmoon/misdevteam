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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1903_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String connect_ip;
	public String connect_userid;
	public String cmpy_cd;
	public String dept_cd;
	public String emp_no;
	public String duty_dt;
	public String vgl_duty_dt;
	public String prvdd_prsnt_tm;
	public String prvdd_finish_tm;
	public String thdd_prsnt_tm;
	public String thdd_finish_tm;
	public String thdd_duty_tm;
	public String pay_dt;
	public String pay_cost;

	public HD_DALON_1903_ADM(){}
	public HD_DALON_1903_ADM(String mode, String connect_ip, String connect_userid, String cmpy_cd, String dept_cd, String emp_no, String duty_dt, String vgl_duty_dt, String prvdd_prsnt_tm, String prvdd_finish_tm, String thdd_prsnt_tm, String thdd_finish_tm, String thdd_duty_tm, String pay_dt, String pay_cost){
		this.mode = mode;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.duty_dt = duty_dt;
		this.vgl_duty_dt = vgl_duty_dt;
		this.prvdd_prsnt_tm = prvdd_prsnt_tm;
		this.prvdd_finish_tm = prvdd_finish_tm;
		this.thdd_prsnt_tm = thdd_prsnt_tm;
		this.thdd_finish_tm = thdd_finish_tm;
		this.thdd_duty_tm = thdd_duty_tm;
		this.pay_dt = pay_dt;
		this.pay_cost = pay_cost;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
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

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setVgl_duty_dt(String vgl_duty_dt){
		this.vgl_duty_dt = vgl_duty_dt;
	}

	public void setPrvdd_prsnt_tm(String prvdd_prsnt_tm){
		this.prvdd_prsnt_tm = prvdd_prsnt_tm;
	}

	public void setPrvdd_finish_tm(String prvdd_finish_tm){
		this.prvdd_finish_tm = prvdd_finish_tm;
	}

	public void setThdd_prsnt_tm(String thdd_prsnt_tm){
		this.thdd_prsnt_tm = thdd_prsnt_tm;
	}

	public void setThdd_finish_tm(String thdd_finish_tm){
		this.thdd_finish_tm = thdd_finish_tm;
	}

	public void setThdd_duty_tm(String thdd_duty_tm){
		this.thdd_duty_tm = thdd_duty_tm;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_cost(String pay_cost){
		this.pay_cost = pay_cost;
	}

	public String getMode(){
		return this.mode;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
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

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getVgl_duty_dt(){
		return this.vgl_duty_dt;
	}

	public String getPrvdd_prsnt_tm(){
		return this.prvdd_prsnt_tm;
	}

	public String getPrvdd_finish_tm(){
		return this.prvdd_finish_tm;
	}

	public String getThdd_prsnt_tm(){
		return this.thdd_prsnt_tm;
	}

	public String getThdd_finish_tm(){
		return this.thdd_finish_tm;
	}

	public String getThdd_duty_tm(){
		return this.thdd_duty_tm;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_cost(){
		return this.pay_cost;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1903_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1903_ADM dm = (HD_DALON_1903_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.connect_ip);
		cstmt.setString(5, dm.connect_userid);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.duty_dt);
		cstmt.setString(10, dm.vgl_duty_dt);
		cstmt.setString(11, dm.prvdd_prsnt_tm);
		cstmt.setString(12, dm.prvdd_finish_tm);
		cstmt.setString(13, dm.thdd_prsnt_tm);
		cstmt.setString(14, dm.thdd_finish_tm);
		cstmt.setString(15, dm.thdd_duty_tm);
		cstmt.setString(16, dm.pay_dt);
		cstmt.setString(17, dm.pay_cost);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1903_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("vgl_duty_dt = [" + getVgl_duty_dt() + "]");
		System.out.println("prvdd_prsnt_tm = [" + getPrvdd_prsnt_tm() + "]");
		System.out.println("prvdd_finish_tm = [" + getPrvdd_finish_tm() + "]");
		System.out.println("thdd_prsnt_tm = [" + getThdd_prsnt_tm() + "]");
		System.out.println("thdd_finish_tm = [" + getThdd_finish_tm() + "]");
		System.out.println("thdd_duty_tm = [" + getThdd_duty_tm() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("pay_cost = [" + getPay_cost() + "]");
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
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
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
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String vgl_duty_dt = req.getParameter("vgl_duty_dt");
if( vgl_duty_dt == null){
	System.out.println(this.toString+" : vgl_duty_dt is null" );
}else{
	System.out.println(this.toString+" : vgl_duty_dt is "+vgl_duty_dt );
}
String prvdd_prsnt_tm = req.getParameter("prvdd_prsnt_tm");
if( prvdd_prsnt_tm == null){
	System.out.println(this.toString+" : prvdd_prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : prvdd_prsnt_tm is "+prvdd_prsnt_tm );
}
String prvdd_finish_tm = req.getParameter("prvdd_finish_tm");
if( prvdd_finish_tm == null){
	System.out.println(this.toString+" : prvdd_finish_tm is null" );
}else{
	System.out.println(this.toString+" : prvdd_finish_tm is "+prvdd_finish_tm );
}
String thdd_prsnt_tm = req.getParameter("thdd_prsnt_tm");
if( thdd_prsnt_tm == null){
	System.out.println(this.toString+" : thdd_prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : thdd_prsnt_tm is "+thdd_prsnt_tm );
}
String thdd_finish_tm = req.getParameter("thdd_finish_tm");
if( thdd_finish_tm == null){
	System.out.println(this.toString+" : thdd_finish_tm is null" );
}else{
	System.out.println(this.toString+" : thdd_finish_tm is "+thdd_finish_tm );
}
String thdd_duty_tm = req.getParameter("thdd_duty_tm");
if( thdd_duty_tm == null){
	System.out.println(this.toString+" : thdd_duty_tm is null" );
}else{
	System.out.println(this.toString+" : thdd_duty_tm is "+thdd_duty_tm );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String pay_cost = req.getParameter("pay_cost");
if( pay_cost == null){
	System.out.println(this.toString+" : pay_cost is null" );
}else{
	System.out.println(this.toString+" : pay_cost is "+pay_cost );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String vgl_duty_dt = Util.checkString(req.getParameter("vgl_duty_dt"));
String prvdd_prsnt_tm = Util.checkString(req.getParameter("prvdd_prsnt_tm"));
String prvdd_finish_tm = Util.checkString(req.getParameter("prvdd_finish_tm"));
String thdd_prsnt_tm = Util.checkString(req.getParameter("thdd_prsnt_tm"));
String thdd_finish_tm = Util.checkString(req.getParameter("thdd_finish_tm"));
String thdd_duty_tm = Util.checkString(req.getParameter("thdd_duty_tm"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String pay_cost = Util.checkString(req.getParameter("pay_cost"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String vgl_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("vgl_duty_dt")));
String prvdd_prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prvdd_prsnt_tm")));
String prvdd_finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prvdd_finish_tm")));
String thdd_prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_prsnt_tm")));
String thdd_finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_finish_tm")));
String thdd_duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_duty_tm")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String pay_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cost")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setDuty_dt(duty_dt);
dm.setVgl_duty_dt(vgl_duty_dt);
dm.setPrvdd_prsnt_tm(prvdd_prsnt_tm);
dm.setPrvdd_finish_tm(prvdd_finish_tm);
dm.setThdd_prsnt_tm(thdd_prsnt_tm);
dm.setThdd_finish_tm(thdd_finish_tm);
dm.setThdd_duty_tm(thdd_duty_tm);
dm.setPay_dt(pay_dt);
dm.setPay_cost(pay_cost);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 01 11:38:48 KST 2015 */