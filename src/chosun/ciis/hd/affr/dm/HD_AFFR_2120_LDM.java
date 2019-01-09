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


public class HD_AFFR_2120_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_lcls_cd;

	public HD_AFFR_2120_LDM(){}
	public HD_AFFR_2120_LDM(String cmpy_cd, String emp_lcls_cd){
		this.cmpy_cd = cmpy_cd;
		this.emp_lcls_cd = emp_lcls_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_lcls_cd(String emp_lcls_cd){
		this.emp_lcls_cd = emp_lcls_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_lcls_cd(){
		return this.emp_lcls_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2120_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2120_LDM dm = (HD_AFFR_2120_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_lcls_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2120_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_lcls_cd = [" + getEmp_lcls_cd() + "]");
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
String emp_lcls_cd = req.getParameter("emp_lcls_cd");
if( emp_lcls_cd == null){
	System.out.println(this.toString+" : emp_lcls_cd is null" );
}else{
	System.out.println(this.toString+" : emp_lcls_cd is "+emp_lcls_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_lcls_cd = Util.checkString(req.getParameter("emp_lcls_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_lcls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_lcls_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_lcls_cd(emp_lcls_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 20:12:01 KST 2009 */