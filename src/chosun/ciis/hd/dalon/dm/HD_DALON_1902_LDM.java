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


public class HD_DALON_1902_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_duty_dt;
	public String pay_dt;
	public String search_dept_cd;
	public String search_emp_no;

	public HD_DALON_1902_LDM(){}
	public HD_DALON_1902_LDM(String cmpy_cd, String search_duty_dt, String pay_dt, String search_dept_cd, String search_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.search_duty_dt = search_duty_dt;
		this.pay_dt = pay_dt;
		this.search_dept_cd = search_dept_cd;
		this.search_emp_no = search_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_duty_dt(String search_duty_dt){
		this.search_duty_dt = search_duty_dt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setSearch_dept_cd(String search_dept_cd){
		this.search_dept_cd = search_dept_cd;
	}

	public void setSearch_emp_no(String search_emp_no){
		this.search_emp_no = search_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_duty_dt(){
		return this.search_duty_dt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSearch_dept_cd(){
		return this.search_dept_cd;
	}

	public String getSearch_emp_no(){
		return this.search_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1902_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1902_LDM dm = (HD_DALON_1902_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_duty_dt);
		cstmt.setString(5, dm.pay_dt);
		cstmt.setString(6, dm.search_dept_cd);
		cstmt.setString(7, dm.search_emp_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1902_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_duty_dt = [" + getSearch_duty_dt() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("search_dept_cd = [" + getSearch_dept_cd() + "]");
		System.out.println("search_emp_no = [" + getSearch_emp_no() + "]");
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
String search_duty_dt = req.getParameter("search_duty_dt");
if( search_duty_dt == null){
	System.out.println(this.toString+" : search_duty_dt is null" );
}else{
	System.out.println(this.toString+" : search_duty_dt is "+search_duty_dt );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String search_dept_cd = req.getParameter("search_dept_cd");
if( search_dept_cd == null){
	System.out.println(this.toString+" : search_dept_cd is null" );
}else{
	System.out.println(this.toString+" : search_dept_cd is "+search_dept_cd );
}
String search_emp_no = req.getParameter("search_emp_no");
if( search_emp_no == null){
	System.out.println(this.toString+" : search_emp_no is null" );
}else{
	System.out.println(this.toString+" : search_emp_no is "+search_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_duty_dt = Util.checkString(req.getParameter("search_duty_dt"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String search_dept_cd = Util.checkString(req.getParameter("search_dept_cd"));
String search_emp_no = Util.checkString(req.getParameter("search_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_duty_dt")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String search_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dept_cd")));
String search_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("search_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_duty_dt(search_duty_dt);
dm.setPay_dt(pay_dt);
dm.setSearch_dept_cd(search_dept_cd);
dm.setSearch_emp_no(search_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 16:41:37 KST 2009 */