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


package chosun.ciis.hd.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.ds.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String dept_cd;
	public String emp_no;
	public String lvcmpy_cd;
	public String aprv_stat;
	public String ss_emp_no;

	public HD_JOB_1100_LDM(){}
	public HD_JOB_1100_LDM(String cmpy_cd, String frdt, String todt, String dept_cd, String emp_no, String lvcmpy_cd, String aprv_stat, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.lvcmpy_cd = lvcmpy_cd;
		this.aprv_stat = aprv_stat;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_cd(String lvcmpy_cd){
		this.lvcmpy_cd = lvcmpy_cd;
	}

	public void setAprv_stat(String aprv_stat){
		this.aprv_stat = aprv_stat;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_cd(){
		return this.lvcmpy_cd;
	}

	public String getAprv_stat(){
		return this.aprv_stat;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_JOB_1100_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_JOB_1100_LDM dm = (HD_JOB_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.lvcmpy_cd);
		cstmt.setString(9, dm.aprv_stat);
		cstmt.setString(10, dm.ss_emp_no);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.job.ds.HD_JOB_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lvcmpy_cd = [" + getLvcmpy_cd() + "]");
		System.out.println("aprv_stat = [" + getAprv_stat() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String lvcmpy_cd = req.getParameter("lvcmpy_cd");
if( lvcmpy_cd == null){
	System.out.println(this.toString+" : lvcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_cd is "+lvcmpy_cd );
}
String aprv_stat = req.getParameter("aprv_stat");
if( aprv_stat == null){
	System.out.println(this.toString+" : aprv_stat is null" );
}else{
	System.out.println(this.toString+" : aprv_stat is "+aprv_stat );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
String aprv_stat = Util.checkString(req.getParameter("aprv_stat"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_cd")));
String aprv_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_stat")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_cd(lvcmpy_cd);
dm.setAprv_stat(aprv_stat);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 04 16:46:20 KST 2013 */