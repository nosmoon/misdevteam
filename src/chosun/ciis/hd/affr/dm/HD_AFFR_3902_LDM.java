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


public class HD_AFFR_3902_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String fr_aplc_dt;
	public String to_aplc_dt;
	public String aplc_cnfm_yn;

	public HD_AFFR_3902_LDM(){}
	public HD_AFFR_3902_LDM(String cmpy_cd, String emp_no, String dept_cd, String fr_aplc_dt, String to_aplc_dt, String aplc_cnfm_yn){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.fr_aplc_dt = fr_aplc_dt;
		this.to_aplc_dt = to_aplc_dt;
		this.aplc_cnfm_yn = aplc_cnfm_yn;
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

	public void setFr_aplc_dt(String fr_aplc_dt){
		this.fr_aplc_dt = fr_aplc_dt;
	}

	public void setTo_aplc_dt(String to_aplc_dt){
		this.to_aplc_dt = to_aplc_dt;
	}

	public void setAplc_cnfm_yn(String aplc_cnfm_yn){
		this.aplc_cnfm_yn = aplc_cnfm_yn;
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

	public String getFr_aplc_dt(){
		return this.fr_aplc_dt;
	}

	public String getTo_aplc_dt(){
		return this.to_aplc_dt;
	}

	public String getAplc_cnfm_yn(){
		return this.aplc_cnfm_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3902_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3902_LDM dm = (HD_AFFR_3902_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.fr_aplc_dt);
		cstmt.setString(7, dm.to_aplc_dt);
		cstmt.setString(8, dm.aplc_cnfm_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3902_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("fr_aplc_dt = [" + getFr_aplc_dt() + "]");
		System.out.println("to_aplc_dt = [" + getTo_aplc_dt() + "]");
		System.out.println("aplc_cnfm_yn = [" + getAplc_cnfm_yn() + "]");
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
String fr_aplc_dt = req.getParameter("fr_aplc_dt");
if( fr_aplc_dt == null){
	System.out.println(this.toString+" : fr_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : fr_aplc_dt is "+fr_aplc_dt );
}
String to_aplc_dt = req.getParameter("to_aplc_dt");
if( to_aplc_dt == null){
	System.out.println(this.toString+" : to_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : to_aplc_dt is "+to_aplc_dt );
}
String aplc_cnfm_yn = req.getParameter("aplc_cnfm_yn");
if( aplc_cnfm_yn == null){
	System.out.println(this.toString+" : aplc_cnfm_yn is null" );
}else{
	System.out.println(this.toString+" : aplc_cnfm_yn is "+aplc_cnfm_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String fr_aplc_dt = Util.checkString(req.getParameter("fr_aplc_dt"));
String to_aplc_dt = Util.checkString(req.getParameter("to_aplc_dt"));
String aplc_cnfm_yn = Util.checkString(req.getParameter("aplc_cnfm_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String fr_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_aplc_dt")));
String to_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_aplc_dt")));
String aplc_cnfm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_cnfm_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setFr_aplc_dt(fr_aplc_dt);
dm.setTo_aplc_dt(to_aplc_dt);
dm.setAplc_cnfm_yn(aplc_cnfm_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 11 09:50:47 KST 2018 */