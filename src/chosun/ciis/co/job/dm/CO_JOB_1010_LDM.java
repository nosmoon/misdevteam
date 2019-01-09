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


package chosun.ciis.co.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.ds.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String frdt;
	public String todt;
	public String wr_clsf;
	public String orga_cd;
	public String empno;

	public CO_JOB_1010_LDM(){}
	public CO_JOB_1010_LDM(String cmpy_cd, String emp_no, String dept_cd, String frdt, String todt, String wr_clsf, String orga_cd, String empno){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.wr_clsf = wr_clsf;
		this.orga_cd = orga_cd;
		this.empno = empno;
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

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setWr_clsf(String wr_clsf){
		this.wr_clsf = wr_clsf;
	}

	public void setOrga_cd(String orga_cd){
		this.orga_cd = orga_cd;
	}

	public void setEmpno(String empno){
		this.empno = empno;
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

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getWr_clsf(){
		return this.wr_clsf;
	}

	public String getOrga_cd(){
		return this.orga_cd;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_1010_LDM dm = (CO_JOB_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.wr_clsf);
		cstmt.setString(9, dm.orga_cd);
		cstmt.setString(10, dm.empno);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("wr_clsf = [" + getWr_clsf() + "]");
		System.out.println("orga_cd = [" + getOrga_cd() + "]");
		System.out.println("empno = [" + getEmpno() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String wr_clsf = req.getParameter("wr_clsf");
if( wr_clsf == null){
	System.out.println(this.toString+" : wr_clsf is null" );
}else{
	System.out.println(this.toString+" : wr_clsf is "+wr_clsf );
}
String orga_cd = req.getParameter("orga_cd");
if( orga_cd == null){
	System.out.println(this.toString+" : orga_cd is null" );
}else{
	System.out.println(this.toString+" : orga_cd is "+orga_cd );
}
String empno = req.getParameter("empno");
if( empno == null){
	System.out.println(this.toString+" : empno is null" );
}else{
	System.out.println(this.toString+" : empno is "+empno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String wr_clsf = Util.checkString(req.getParameter("wr_clsf"));
String orga_cd = Util.checkString(req.getParameter("orga_cd"));
String empno = Util.checkString(req.getParameter("empno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String wr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("wr_clsf")));
String orga_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("orga_cd")));
String empno = Util.Uni2Ksc(Util.checkString(req.getParameter("empno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setWr_clsf(wr_clsf);
dm.setOrga_cd(orga_cd);
dm.setEmpno(empno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 15 18:01:43 KST 2012 */