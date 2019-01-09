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


public class HD_AFFR_1104_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String srch_code;
	public String dept_cd;
	public String srch_emp_no;
	public String use_fr_aplc_dt;
	public String use_to_aplc_dt;
	public String actu_slip_no;

	public HD_AFFR_1104_LDM(){}
	public HD_AFFR_1104_LDM(String cmpy_cd, String emp_no, String srch_code, String dept_cd, String srch_emp_no, String use_fr_aplc_dt, String use_to_aplc_dt, String actu_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.srch_code = srch_code;
		this.dept_cd = dept_cd;
		this.srch_emp_no = srch_emp_no;
		this.use_fr_aplc_dt = use_fr_aplc_dt;
		this.use_to_aplc_dt = use_to_aplc_dt;
		this.actu_slip_no = actu_slip_no;
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

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
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

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1104_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1104_LDM dm = (HD_AFFR_1104_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.srch_code);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.srch_emp_no);
		cstmt.setString(8, dm.use_fr_aplc_dt);
		cstmt.setString(9, dm.use_to_aplc_dt);
		cstmt.setString(10, dm.actu_slip_no);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1104_LDataSet();
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
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
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
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String srch_code = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_code")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String srch_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_emp_no")));
String use_fr_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_fr_aplc_dt")));
String use_to_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_to_aplc_dt")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
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
dm.setActu_slip_no(actu_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 11:22:58 KST 2009 */