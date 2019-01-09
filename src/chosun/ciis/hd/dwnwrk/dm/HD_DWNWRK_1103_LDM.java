

package chosun.ciis.hd.dwnwrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.ds.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 * 
 */


public class HD_DWNWRK_1103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String app_emp_no;
	public String duty_dt;
	public String cmpy_cd;

	public HD_DWNWRK_1103_LDM(){}
	public HD_DWNWRK_1103_LDM(String app_emp_no, String duty_dt, String cmpy_cd){
		this.app_emp_no = app_emp_no;
		this.duty_dt = duty_dt;
		this.cmpy_cd = cmpy_cd;
	}

	public void setApp_emp_no(String app_emp_no){
		this.app_emp_no = app_emp_no;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getApp_emp_no(){
		return this.app_emp_no;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DWNWRK_1103_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DWNWRK_1103_LDM dm = (HD_DWNWRK_1103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.app_emp_no);
		cstmt.setString(4, dm.duty_dt);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_DWNWRK_1103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("app_emp_no = [" + getApp_emp_no() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String app_emp_no = req.getParameter("app_emp_no");
if( app_emp_no == null){
	System.out.println(this.toString+" : app_emp_no is null" );
}else{
	System.out.println(this.toString+" : app_emp_no is "+app_emp_no );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String app_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("app_emp_no")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setApp_emp_no(app_emp_no);
dm.setDuty_dt(duty_dt);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 26 15:07:51 KST 2010 */