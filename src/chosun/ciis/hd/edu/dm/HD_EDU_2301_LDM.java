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


public class HD_EDU_2301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String edu_frdt;
	public String edu_todt;

	public HD_EDU_2301_LDM(){}
	public HD_EDU_2301_LDM(String cmpy_cd, String emp_no, String edu_frdt, String edu_todt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.edu_frdt = edu_frdt;
		this.edu_todt = edu_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2301_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2301_LDM dm = (HD_EDU_2301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.edu_frdt);
		cstmt.setString(6, dm.edu_todt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_2301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("edu_frdt = [" + getEdu_frdt() + "]");
		System.out.println("edu_todt = [" + getEdu_todt() + "]");
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
String edu_frdt = req.getParameter("edu_frdt");
if( edu_frdt == null){
	System.out.println(this.toString+" : edu_frdt is null" );
}else{
	System.out.println(this.toString+" : edu_frdt is "+edu_frdt );
}
String edu_todt = req.getParameter("edu_todt");
if( edu_todt == null){
	System.out.println(this.toString+" : edu_todt is null" );
}else{
	System.out.println(this.toString+" : edu_todt is "+edu_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
String edu_todt = Util.checkString(req.getParameter("edu_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String edu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_frdt")));
String edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setEdu_frdt(edu_frdt);
dm.setEdu_todt(edu_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 13 16:42:28 KST 2018 */