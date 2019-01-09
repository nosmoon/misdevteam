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


package chosun.ciis.hd.yadjm.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class HD_YADJM_2013_7002_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String adjm_rvrs_yy;
	public String doc_type;
	public String form_cd;

	public HD_YADJM_2013_7002_SDM(){}
	public HD_YADJM_2013_7002_SDM(String cmpy_cd, String emp_no, String adjm_rvrs_yy, String doc_type, String form_cd){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.doc_type = doc_type;
		this.form_cd = form_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setDoc_type(String doc_type){
		this.doc_type = doc_type;
	}

	public void setForm_cd(String form_cd){
		this.form_cd = form_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getDoc_type(){
		return this.doc_type;
	}

	public String getForm_cd(){
		return this.form_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2013_7002_S(? ,? ,? ,? ,? ,? ,?, ? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2013_7002_SDM dm = (HD_YADJM_2013_7002_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.adjm_rvrs_yy);
		cstmt.setString(6, dm.doc_type);
		cstmt.setString(7, dm.form_cd);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2013_7002_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("doc_type = [" + getDoc_type() + "]");
		System.out.println("form_cd = [" + getForm_cd() + "]");
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
String rept_clsf = req.getParameter("rept_clsf");
if( rept_clsf == null){
	System.out.println(this.toString+" : rept_clsf is null" );
}else{
	System.out.println(this.toString+" : rept_clsf is "+rept_clsf );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String add_file_no = req.getParameter("add_file_no");
if( add_file_no == null){
	System.out.println(this.toString+" : add_file_no is null" );
}else{
	System.out.println(this.toString+" : add_file_no is "+add_file_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String add_file_no = Util.checkString(req.getParameter("add_file_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String add_file_no = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMake_dt(make_dt);
dm.setRept_no(rept_no);
dm.setAdd_file_no(add_file_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 21:33:27 KST 2009 */