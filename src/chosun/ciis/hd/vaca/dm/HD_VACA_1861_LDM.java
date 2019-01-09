/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
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


public class HD_VACA_1861_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String emp_no;
	public String emp_nm;
	public String dept_nm;
	public String occr_dt;
	public String emp_clsf;
	public String incmg_pers;

	public HD_VACA_1861_LDM(){}
	public HD_VACA_1861_LDM(String cmpy_cd, String dept_cd, String emp_no, String emp_nm, String dept_nm, String occr_dt, String emp_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.emp_nm = emp_nm;
		this.dept_nm = dept_nm;
		this.occr_dt = occr_dt;
		this.emp_clsf = emp_clsf;
		this.incmg_pers = incmg_pers;
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

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1861_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1861_LDM dm = (HD_VACA_1861_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.emp_nm);
		cstmt.setString(7, dm.dept_nm);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.emp_clsf);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_1861_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("emp_nm = [" + getEmp_nm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String emp_nm = req.getParameter("emp_nm");
if( emp_nm == null){
	System.out.println(this.toString+" : emp_nm is null" );
}else{
	System.out.println(this.toString+" : emp_nm is "+emp_nm );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String emp_nm = Util.checkString(req.getParameter("emp_nm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String emp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_nm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setEmp_nm(emp_nm);
dm.setDept_nm(dept_nm);
dm.setOccr_dt(occr_dt);
dm.setEmp_clsf(emp_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 10:47:30 KST 2012 */