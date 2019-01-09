/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_5101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String occr_frdt;
	public String occr_todt;

	public HD_EDU_5101_LDM(){}
	public HD_EDU_5101_LDM(String cmpy_cd, String emp_no, String dept_cd, String occr_frdt, String occr_todt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.occr_frdt = occr_frdt;
		this.occr_todt = occr_todt;
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

	public void setOccr_frdt(String occr_frdt){
		this.occr_frdt = occr_frdt;
	}

	public void setOccr_todt(String occr_todt){
		this.occr_todt = occr_todt;
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

	public String getOccr_frdt(){
		return this.occr_frdt;
	}

	public String getOccr_todt(){
		return this.occr_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_5101_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_5101_LDM dm = (HD_EDU_5101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.occr_frdt);
		cstmt.setString(7, dm.occr_todt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_5101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("occr_frdt = [" + getOccr_frdt() + "]");
		System.out.println("occr_todt = [" + getOccr_todt() + "]");
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
String occr_frdt = req.getParameter("occr_frdt");
if( occr_frdt == null){
	System.out.println(this.toString+" : occr_frdt is null" );
}else{
	System.out.println(this.toString+" : occr_frdt is "+occr_frdt );
}
String occr_todt = req.getParameter("occr_todt");
if( occr_todt == null){
	System.out.println(this.toString+" : occr_todt is null" );
}else{
	System.out.println(this.toString+" : occr_todt is "+occr_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
String occr_todt = Util.checkString(req.getParameter("occr_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String occr_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_frdt")));
String occr_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setOccr_frdt(occr_frdt);
dm.setOccr_todt(occr_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 29 17:04:20 KST 2016 */