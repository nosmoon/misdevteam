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


public class HD_AFFR_2020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String dept_nm;
	public String sply_strt_yymm_ft;
	public String sply_strt_yymm_to;

	public HD_AFFR_2020_LDM(){}
	public HD_AFFR_2020_LDM(String cmpy_cd, String emp_no, String dept_cd, String dept_nm, String sply_strt_yymm_ft, String sply_strt_yymm_to){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.sply_strt_yymm_ft = sply_strt_yymm_ft;
		this.sply_strt_yymm_to = sply_strt_yymm_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSply_strt_yymm_ft(String sply_strt_yymm_ft){
		this.sply_strt_yymm_ft = sply_strt_yymm_ft;
	}

	public void setSply_strt_yymm_to(String sply_strt_yymm_to){
		this.sply_strt_yymm_to = sply_strt_yymm_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSply_strt_yymm_ft(){
		return this.sply_strt_yymm_ft;
	}

	public String getSply_strt_yymm_to(){
		return this.sply_strt_yymm_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2020_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2020_LDM dm = (HD_AFFR_2020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.dept_nm);
		cstmt.setString(7, dm.sply_strt_yymm_ft);
		cstmt.setString(8, dm.sply_strt_yymm_to);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("sply_strt_yymm_ft = [" + getSply_strt_yymm_ft() + "]");
		System.out.println("sply_strt_yymm_to = [" + getSply_strt_yymm_to() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String sply_strt_yymm_ft = req.getParameter("sply_strt_yymm_ft");
if( sply_strt_yymm_ft == null){
	System.out.println(this.toString+" : sply_strt_yymm_ft is null" );
}else{
	System.out.println(this.toString+" : sply_strt_yymm_ft is "+sply_strt_yymm_ft );
}
String sply_strt_yymm_to = req.getParameter("sply_strt_yymm_to");
if( sply_strt_yymm_to == null){
	System.out.println(this.toString+" : sply_strt_yymm_to is null" );
}else{
	System.out.println(this.toString+" : sply_strt_yymm_to is "+sply_strt_yymm_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String sply_strt_yymm_ft = Util.checkString(req.getParameter("sply_strt_yymm_ft"));
String sply_strt_yymm_to = Util.checkString(req.getParameter("sply_strt_yymm_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String sply_strt_yymm_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_strt_yymm_ft")));
String sply_strt_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_strt_yymm_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setSply_strt_yymm_ft(sply_strt_yymm_ft);
dm.setSply_strt_yymm_to(sply_strt_yymm_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 30 15:52:27 KST 2009 */