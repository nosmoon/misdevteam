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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1009_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String lvcmpy_dt;

	public HD_LVCMPY_1009_LDM(){}
	public HD_LVCMPY_1009_LDM(String emp_no, String cmpy_cd, String lvcmpy_dt){
		this.emp_no = emp_no;
		this.cmpy_cd = cmpy_cd;
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1009_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1009_LDM dm = (HD_LVCMPY_1009_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.lvcmpy_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1009_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
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
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setCmpy_cd(cmpy_cd);
dm.setLvcmpy_dt(lvcmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 31 18:07:54 KST 2017 */