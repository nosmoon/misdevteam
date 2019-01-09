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


public class HD_AFFR_3001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_lvcmpy_dt;
	public String to_lvcmpy_dt;
	public String emp_no;
	public String flnm;
	public String dept_cd;

	public HD_AFFR_3001_LDM(){}
	public HD_AFFR_3001_LDM(String cmpy_cd, String fr_lvcmpy_dt, String to_lvcmpy_dt, String emp_no, String flnm, String dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.fr_lvcmpy_dt = fr_lvcmpy_dt;
		this.to_lvcmpy_dt = to_lvcmpy_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_lvcmpy_dt(String fr_lvcmpy_dt){
		this.fr_lvcmpy_dt = fr_lvcmpy_dt;
	}

	public void setTo_lvcmpy_dt(String to_lvcmpy_dt){
		this.to_lvcmpy_dt = to_lvcmpy_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_lvcmpy_dt(){
		return this.fr_lvcmpy_dt;
	}

	public String getTo_lvcmpy_dt(){
		return this.to_lvcmpy_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3001_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3001_LDM dm = (HD_AFFR_3001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_lvcmpy_dt);
		cstmt.setString(5, dm.to_lvcmpy_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_lvcmpy_dt = [" + getFr_lvcmpy_dt() + "]");
		System.out.println("to_lvcmpy_dt = [" + getTo_lvcmpy_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String fr_lvcmpy_dt = req.getParameter("fr_lvcmpy_dt");
if( fr_lvcmpy_dt == null){
	System.out.println(this.toString+" : fr_lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : fr_lvcmpy_dt is "+fr_lvcmpy_dt );
}
String to_lvcmpy_dt = req.getParameter("to_lvcmpy_dt");
if( to_lvcmpy_dt == null){
	System.out.println(this.toString+" : to_lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : to_lvcmpy_dt is "+to_lvcmpy_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_lvcmpy_dt = Util.checkString(req.getParameter("fr_lvcmpy_dt"));
String to_lvcmpy_dt = Util.checkString(req.getParameter("to_lvcmpy_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_lvcmpy_dt")));
String to_lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_lvcmpy_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_lvcmpy_dt(fr_lvcmpy_dt);
dm.setTo_lvcmpy_dt(to_lvcmpy_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 13:37:05 KST 2009 */