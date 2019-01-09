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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2403_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd_fr;
	public String dept_cd_to;
	public String emp_no_fr;
	public String emp_no_to;
	public String lvcmpy_cd;

	public HD_INFO_2403_LDM(){}
	public HD_INFO_2403_LDM(String cmpy_cd, String dept_cd_fr, String dept_cd_to, String emp_no_fr, String emp_no_to, String lvcmpy_cd){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd_fr = dept_cd_fr;
		this.dept_cd_to = dept_cd_to;
		this.emp_no_fr = emp_no_fr;
		this.emp_no_to = emp_no_to;
		this.lvcmpy_cd = lvcmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd_fr(String dept_cd_fr){
		this.dept_cd_fr = dept_cd_fr;
	}

	public void setDept_cd_to(String dept_cd_to){
		this.dept_cd_to = dept_cd_to;
	}

	public void setEmp_no_fr(String emp_no_fr){
		this.emp_no_fr = emp_no_fr;
	}

	public void setEmp_no_to(String emp_no_to){
		this.emp_no_to = emp_no_to;
	}

	public void setLvcmpy_cd(String lvcmpy_cd){
		this.lvcmpy_cd = lvcmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd_fr(){
		return this.dept_cd_fr;
	}

	public String getDept_cd_to(){
		return this.dept_cd_to;
	}

	public String getEmp_no_fr(){
		return this.emp_no_fr;
	}

	public String getEmp_no_to(){
		return this.emp_no_to;
	}

	public String getLvcmpy_cd(){
		return this.lvcmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2403_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2403_LDM dm = (HD_INFO_2403_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd_fr);
		cstmt.setString(5, dm.dept_cd_to);
		cstmt.setString(6, dm.emp_no_fr);
		cstmt.setString(7, dm.emp_no_to);
		cstmt.setString(8, dm.lvcmpy_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2403_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd_fr = [" + getDept_cd_fr() + "]");
		System.out.println("dept_cd_to = [" + getDept_cd_to() + "]");
		System.out.println("emp_no_fr = [" + getEmp_no_fr() + "]");
		System.out.println("emp_no_to = [" + getEmp_no_to() + "]");
		System.out.println("lvcmpy_cd = [" + getLvcmpy_cd() + "]");
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
String dept_cd_fr = req.getParameter("dept_cd_fr");
if( dept_cd_fr == null){
	System.out.println(this.toString+" : dept_cd_fr is null" );
}else{
	System.out.println(this.toString+" : dept_cd_fr is "+dept_cd_fr );
}
String dept_cd_to = req.getParameter("dept_cd_to");
if( dept_cd_to == null){
	System.out.println(this.toString+" : dept_cd_to is null" );
}else{
	System.out.println(this.toString+" : dept_cd_to is "+dept_cd_to );
}
String emp_no_fr = req.getParameter("emp_no_fr");
if( emp_no_fr == null){
	System.out.println(this.toString+" : emp_no_fr is null" );
}else{
	System.out.println(this.toString+" : emp_no_fr is "+emp_no_fr );
}
String emp_no_to = req.getParameter("emp_no_to");
if( emp_no_to == null){
	System.out.println(this.toString+" : emp_no_to is null" );
}else{
	System.out.println(this.toString+" : emp_no_to is "+emp_no_to );
}
String lvcmpy_cd = req.getParameter("lvcmpy_cd");
if( lvcmpy_cd == null){
	System.out.println(this.toString+" : lvcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_cd is "+lvcmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
String dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
String emp_no_fr = Util.checkString(req.getParameter("emp_no_fr"));
String emp_no_to = Util.checkString(req.getParameter("emp_no_to"));
String lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_fr")));
String dept_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_to")));
String emp_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_fr")));
String emp_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_to")));
String lvcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd_fr(dept_cd_fr);
dm.setDept_cd_to(dept_cd_to);
dm.setEmp_no_fr(emp_no_fr);
dm.setEmp_no_to(emp_no_to);
dm.setLvcmpy_cd(lvcmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 10:57:22 KST 2009 */