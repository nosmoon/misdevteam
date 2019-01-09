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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String estm_work_dt;
	public String emp_no;
	public String dept_cd;
	public String priv_lvc_yn;

	public HD_LVCMPY_3600_LDM(){}
	public HD_LVCMPY_3600_LDM(String cmpy_cd, String estm_work_dt, String emp_no, String dept_cd, String priv_lvc_yn){
		this.cmpy_cd = cmpy_cd;
		this.estm_work_dt = estm_work_dt;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.priv_lvc_yn = priv_lvc_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEstm_work_dt(String estm_work_dt){
		this.estm_work_dt = estm_work_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPriv_lvc_yn(String priv_lvc_yn){
		this.priv_lvc_yn = priv_lvc_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEstm_work_dt(){
		return this.estm_work_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPriv_lvc_yn(){
		return this.priv_lvc_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3600_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3600_LDM dm = (HD_LVCMPY_3600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.estm_work_dt);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.priv_lvc_yn);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3600_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("estm_work_dt = [" + getEstm_work_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("priv_lvc_yn = [" + getPriv_lvc_yn() + "]");
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
String estm_work_dt = req.getParameter("estm_work_dt");
if( estm_work_dt == null){
	System.out.println(this.toString+" : estm_work_dt is null" );
}else{
	System.out.println(this.toString+" : estm_work_dt is "+estm_work_dt );
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
String priv_lvc_yn = req.getParameter("priv_lvc_yn");
if( priv_lvc_yn == null){
	System.out.println(this.toString+" : priv_lvc_yn is null" );
}else{
	System.out.println(this.toString+" : priv_lvc_yn is "+priv_lvc_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String priv_lvc_yn = Util.checkString(req.getParameter("priv_lvc_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String estm_work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("estm_work_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String priv_lvc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("priv_lvc_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEstm_work_dt(estm_work_dt);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setPriv_lvc_yn(priv_lvc_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 09 15:05:55 KST 2012 */