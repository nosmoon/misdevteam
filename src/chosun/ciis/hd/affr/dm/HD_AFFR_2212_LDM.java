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


public class HD_AFFR_2212_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String congr_condl_cd;
	public String emp_clsf;
	public String congr_condl_dt;

	public HD_AFFR_2212_LDM(){}
	public HD_AFFR_2212_LDM(String cmpy_cd, String congr_condl_cd, String emp_clsf, String congr_condl_dt){
		this.cmpy_cd = cmpy_cd;
		this.congr_condl_cd = congr_condl_cd;
		this.emp_clsf = emp_clsf;
		this.congr_condl_dt = congr_condl_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setCongr_condl_dt(String congr_condl_dt){
		this.congr_condl_dt = congr_condl_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getCongr_condl_dt(){
		return this.congr_condl_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2212_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2212_LDM dm = (HD_AFFR_2212_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.congr_condl_cd);
		cstmt.setString(5, dm.emp_clsf);
		cstmt.setString(6, dm.congr_condl_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2212_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("congr_condl_cd = [" + getCongr_condl_cd() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("congr_condl_dt = [" + getCongr_condl_dt() + "]");
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
String congr_condl_cd = req.getParameter("congr_condl_cd");
if( congr_condl_cd == null){
	System.out.println(this.toString+" : congr_condl_cd is null" );
}else{
	System.out.println(this.toString+" : congr_condl_cd is "+congr_condl_cd );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String congr_condl_dt = req.getParameter("congr_condl_dt");
if( congr_condl_dt == null){
	System.out.println(this.toString+" : congr_condl_dt is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt is "+congr_condl_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String congr_condl_dt = Util.checkString(req.getParameter("congr_condl_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String congr_condl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_cd")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String congr_condl_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCongr_condl_cd(congr_condl_cd);
dm.setEmp_clsf(emp_clsf);
dm.setCongr_condl_dt(congr_condl_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 18 12:11:53 KST 2009 */