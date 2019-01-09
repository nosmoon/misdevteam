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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1304_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String obj_clsf;
	public String hody_clsf;
	public String emp_no;
	public String duty_dt;

	public HD_HLYWRK_1304_LDM(){}
	public HD_HLYWRK_1304_LDM(String cmpy_cd, String obj_clsf, String hody_clsf, String emp_no, String duty_dt){
		this.cmpy_cd = cmpy_cd;
		this.obj_clsf = obj_clsf;
		this.hody_clsf = hody_clsf;
		this.emp_no = emp_no;
		this.duty_dt = duty_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1304_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1304_LDM dm = (HD_HLYWRK_1304_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.obj_clsf);
		cstmt.setString(5, dm.hody_clsf);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.duty_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1304_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
		System.out.println("hody_clsf = [" + getHody_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
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
String obj_clsf = req.getParameter("obj_clsf");
if( obj_clsf == null){
	System.out.println(this.toString+" : obj_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_clsf is "+obj_clsf );
}
String hody_clsf = req.getParameter("hody_clsf");
if( hody_clsf == null){
	System.out.println(this.toString+" : hody_clsf is null" );
}else{
	System.out.println(this.toString+" : hody_clsf is "+hody_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setObj_clsf(obj_clsf);
dm.setHody_clsf(hody_clsf);
dm.setEmp_no(emp_no);
dm.setDuty_dt(duty_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 18:54:09 KST 2015 */