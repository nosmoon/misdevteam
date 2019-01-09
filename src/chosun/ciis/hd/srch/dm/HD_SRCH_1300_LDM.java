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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String st_j_dt;
	public String et_j_dt;

	public HD_SRCH_1300_LDM(){}
	public HD_SRCH_1300_LDM(String emp_no, String cmpy_cd, String st_j_dt, String et_j_dt){
		this.emp_no = emp_no;
		this.cmpy_cd = cmpy_cd;
		this.st_j_dt = st_j_dt;
		this.et_j_dt = et_j_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSt_j_dt(String st_j_dt){
		this.st_j_dt = st_j_dt;
	}

	public void setEt_j_dt(String et_j_dt){
		this.et_j_dt = et_j_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSt_j_dt(){
		return this.st_j_dt;
	}

	public String getEt_j_dt(){
		return this.et_j_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1300_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1300_LDM dm = (HD_SRCH_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.st_j_dt);
		cstmt.setString(6, dm.et_j_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SRCH_1300_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("st_j_dt = [" + getSt_j_dt() + "]");
		System.out.println("et_j_dt = [" + getEt_j_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String st_j_dt = req.getParameter("st_j_dt");
if( st_j_dt == null){
	System.out.println(this.toString+" : st_j_dt is null" );
}else{
	System.out.println(this.toString+" : st_j_dt is "+st_j_dt );
}
String et_j_dt = req.getParameter("et_j_dt");
if( et_j_dt == null){
	System.out.println(this.toString+" : et_j_dt is null" );
}else{
	System.out.println(this.toString+" : et_j_dt is "+et_j_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String st_j_dt = Util.checkString(req.getParameter("st_j_dt"));
String et_j_dt = Util.checkString(req.getParameter("et_j_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String st_j_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_j_dt")));
String et_j_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_j_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setCmpy_cd(cmpy_cd);
dm.setSt_j_dt(st_j_dt);
dm.setEt_j_dt(et_j_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 12 20:02:07 KST 2009 */