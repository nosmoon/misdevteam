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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4015_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_dt;
	public String dept_cd;
	public String clsf_cd;
	public String crte_clsf_cd;

	public MC_BUDG_4015_LDM(){}
	public MC_BUDG_4015_LDM(String cmpy_cd, String work_dt, String dept_cd, String clsf_cd, String crte_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.work_dt = work_dt;
		this.dept_cd = dept_cd;
		this.clsf_cd = clsf_cd;
		this.crte_clsf_cd = crte_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setCrte_clsf_cd(String crte_clsf_cd){
		this.crte_clsf_cd = crte_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getCrte_clsf_cd(){
		return this.crte_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4015_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4015_LDM dm = (MC_BUDG_4015_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_dt);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.clsf_cd);
		cstmt.setString(7, dm.crte_clsf_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4015_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_dt = [" + getWork_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("crte_clsf_cd = [" + getCrte_clsf_cd() + "]");
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
String work_dt = req.getParameter("work_dt");
if( work_dt == null){
	System.out.println(this.toString+" : work_dt is null" );
}else{
	System.out.println(this.toString+" : work_dt is "+work_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String crte_clsf_cd = req.getParameter("crte_clsf_cd");
if( crte_clsf_cd == null){
	System.out.println(this.toString+" : crte_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : crte_clsf_cd is "+crte_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_dt = Util.checkString(req.getParameter("work_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String crte_clsf_cd = Util.checkString(req.getParameter("crte_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("work_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String crte_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_dt(work_dt);
dm.setDept_cd(dept_cd);
dm.setClsf_cd(clsf_cd);
dm.setCrte_clsf_cd(crte_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 19:56:49 KST 2009 */