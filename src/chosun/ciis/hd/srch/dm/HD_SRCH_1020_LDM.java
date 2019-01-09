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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String in_cmpy_dt;
	public String dept_cd;
	public String emp_clsf;
	public String cur_job_cd;
	public String dty_cd;
	public String posi_cd;
	public String cmpy_ck;
	public String incmg_pers;

	public HD_SRCH_1020_LDM(){}
	public HD_SRCH_1020_LDM(String emp_no, String cmpy_cd, String in_cmpy_dt, String dept_cd, String emp_clsf, String cur_job_cd, String dty_cd, String posi_cd, String cmpy_ck, String incmg_pers){
		this.emp_no = emp_no;
		this.cmpy_cd = cmpy_cd;
		this.in_cmpy_dt = in_cmpy_dt;
		this.dept_cd = dept_cd;
		this.emp_clsf = emp_clsf;
		this.cur_job_cd = cur_job_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.cmpy_ck = cmpy_ck;
		this.incmg_pers = incmg_pers;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setCur_job_cd(String cur_job_cd){
		this.cur_job_cd = cur_job_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setCmpy_ck(String cmpy_ck){
		this.cmpy_ck = cmpy_ck;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getCur_job_cd(){
		return this.cur_job_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getCmpy_ck(){
		return this.cmpy_ck;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1020_LDM dm = (HD_SRCH_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.in_cmpy_dt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.emp_clsf);
		cstmt.setString(8, dm.cur_job_cd);
		cstmt.setString(9, dm.dty_cd);
		cstmt.setString(10, dm.posi_cd);
		cstmt.setString(11, dm.cmpy_ck);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("cur_job_cd = [" + getCur_job_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("cmpy_ck = [" + getCmpy_ck() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String cur_job_cd = req.getParameter("cur_job_cd");
if( cur_job_cd == null){
	System.out.println(this.toString+" : cur_job_cd is null" );
}else{
	System.out.println(this.toString+" : cur_job_cd is "+cur_job_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String cmpy_ck = req.getParameter("cmpy_ck");
if( cmpy_ck == null){
	System.out.println(this.toString+" : cmpy_ck is null" );
}else{
	System.out.println(this.toString+" : cmpy_ck is "+cmpy_ck );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String cur_job_cd = Util.checkString(req.getParameter("cur_job_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String cur_job_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_job_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String cmpy_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_ck")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setCmpy_cd(cmpy_cd);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setDept_cd(dept_cd);
dm.setEmp_clsf(emp_clsf);
dm.setCur_job_cd(cur_job_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setCmpy_ck(cmpy_ck);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 29 15:12:39 KST 2017 */