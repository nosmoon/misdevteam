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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1203_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proc_stat;
	public String dept_cd;
	public String duty_dt;

	public HD_DUTY_1203_LDM(){}
	public HD_DUTY_1203_LDM(String cmpy_cd, String proc_stat, String dept_cd, String duty_dt){
		this.cmpy_cd = cmpy_cd;
		this.proc_stat = proc_stat;
		this.dept_cd = dept_cd;
		this.duty_dt = duty_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1203_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1203_LDM dm = (HD_DUTY_1203_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proc_stat);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.duty_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1203_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProc_stat(proc_stat);
dm.setDept_cd(dept_cd);
dm.setDuty_dt(duty_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 13:43:07 KST 2018 */