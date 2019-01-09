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


public class MC_BUDG_4031_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_dt_fr;
	public String budg_dt_to;
	public String clsf_cd_fr;
	public String budg_fr;
	public String budg_to;
	public String dept_fr;
	public String dept_to;
	public String clsf_cd_to;

	public MC_BUDG_4031_LDM(){}
	public MC_BUDG_4031_LDM(String cmpy_cd, String budg_dt_fr, String budg_dt_to, String clsf_cd_fr, String budg_fr, String budg_to, String dept_fr, String dept_to, String clsf_cd_to){
		this.cmpy_cd = cmpy_cd;
		this.budg_dt_fr = budg_dt_fr;
		this.budg_dt_to = budg_dt_to;
		this.clsf_cd_fr = clsf_cd_fr;
		this.budg_fr = budg_fr;
		this.budg_to = budg_to;
		this.dept_fr = dept_fr;
		this.dept_to = dept_to;
		this.clsf_cd_to = clsf_cd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_dt_fr(String budg_dt_fr){
		this.budg_dt_fr = budg_dt_fr;
	}

	public void setBudg_dt_to(String budg_dt_to){
		this.budg_dt_to = budg_dt_to;
	}

	public void setClsf_cd_fr(String clsf_cd_fr){
		this.clsf_cd_fr = clsf_cd_fr;
	}

	public void setBudg_fr(String budg_fr){
		this.budg_fr = budg_fr;
	}

	public void setBudg_to(String budg_to){
		this.budg_to = budg_to;
	}

	public void setDept_fr(String dept_fr){
		this.dept_fr = dept_fr;
	}

	public void setDept_to(String dept_to){
		this.dept_to = dept_to;
	}

	public void setClsf_cd_to(String clsf_cd_to){
		this.clsf_cd_to = clsf_cd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_dt_fr(){
		return this.budg_dt_fr;
	}

	public String getBudg_dt_to(){
		return this.budg_dt_to;
	}

	public String getClsf_cd_fr(){
		return this.clsf_cd_fr;
	}

	public String getBudg_fr(){
		return this.budg_fr;
	}

	public String getBudg_to(){
		return this.budg_to;
	}

	public String getDept_fr(){
		return this.dept_fr;
	}

	public String getDept_to(){
		return this.dept_to;
	}

	public String getClsf_cd_to(){
		return this.clsf_cd_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4031_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4031_LDM dm = (MC_BUDG_4031_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_dt_fr);
		cstmt.setString(5, dm.budg_dt_to);
		cstmt.setString(6, dm.clsf_cd_fr);
		cstmt.setString(7, dm.budg_fr);
		cstmt.setString(8, dm.budg_to);
		cstmt.setString(9, dm.dept_fr);
		cstmt.setString(10, dm.dept_to);
		cstmt.setString(11, dm.clsf_cd_to);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4031_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_dt_fr = [" + getBudg_dt_fr() + "]");
		System.out.println("budg_dt_to = [" + getBudg_dt_to() + "]");
		System.out.println("clsf_cd_fr = [" + getClsf_cd_fr() + "]");
		System.out.println("budg_fr = [" + getBudg_fr() + "]");
		System.out.println("budg_to = [" + getBudg_to() + "]");
		System.out.println("dept_fr = [" + getDept_fr() + "]");
		System.out.println("dept_to = [" + getDept_to() + "]");
		System.out.println("clsf_cd_to = [" + getClsf_cd_to() + "]");
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
String budg_dt_fr = req.getParameter("budg_dt_fr");
if( budg_dt_fr == null){
	System.out.println(this.toString+" : budg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : budg_dt_fr is "+budg_dt_fr );
}
String budg_dt_to = req.getParameter("budg_dt_to");
if( budg_dt_to == null){
	System.out.println(this.toString+" : budg_dt_to is null" );
}else{
	System.out.println(this.toString+" : budg_dt_to is "+budg_dt_to );
}
String clsf_cd_fr = req.getParameter("clsf_cd_fr");
if( clsf_cd_fr == null){
	System.out.println(this.toString+" : clsf_cd_fr is null" );
}else{
	System.out.println(this.toString+" : clsf_cd_fr is "+clsf_cd_fr );
}
String budg_fr = req.getParameter("budg_fr");
if( budg_fr == null){
	System.out.println(this.toString+" : budg_fr is null" );
}else{
	System.out.println(this.toString+" : budg_fr is "+budg_fr );
}
String budg_to = req.getParameter("budg_to");
if( budg_to == null){
	System.out.println(this.toString+" : budg_to is null" );
}else{
	System.out.println(this.toString+" : budg_to is "+budg_to );
}
String dept_fr = req.getParameter("dept_fr");
if( dept_fr == null){
	System.out.println(this.toString+" : dept_fr is null" );
}else{
	System.out.println(this.toString+" : dept_fr is "+dept_fr );
}
String dept_to = req.getParameter("dept_to");
if( dept_to == null){
	System.out.println(this.toString+" : dept_to is null" );
}else{
	System.out.println(this.toString+" : dept_to is "+dept_to );
}
String clsf_cd_to = req.getParameter("clsf_cd_to");
if( clsf_cd_to == null){
	System.out.println(this.toString+" : clsf_cd_to is null" );
}else{
	System.out.println(this.toString+" : clsf_cd_to is "+clsf_cd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_dt_fr = Util.checkString(req.getParameter("budg_dt_fr"));
String budg_dt_to = Util.checkString(req.getParameter("budg_dt_to"));
String clsf_cd_fr = Util.checkString(req.getParameter("clsf_cd_fr"));
String budg_fr = Util.checkString(req.getParameter("budg_fr"));
String budg_to = Util.checkString(req.getParameter("budg_to"));
String dept_fr = Util.checkString(req.getParameter("dept_fr"));
String dept_to = Util.checkString(req.getParameter("dept_to"));
String clsf_cd_to = Util.checkString(req.getParameter("clsf_cd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_dt_fr")));
String budg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_dt_to")));
String clsf_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd_fr")));
String budg_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_fr")));
String budg_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_to")));
String dept_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_fr")));
String dept_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_to")));
String clsf_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_dt_fr(budg_dt_fr);
dm.setBudg_dt_to(budg_dt_to);
dm.setClsf_cd_fr(clsf_cd_fr);
dm.setBudg_fr(budg_fr);
dm.setBudg_to(budg_to);
dm.setDept_fr(dept_fr);
dm.setDept_to(dept_to);
dm.setClsf_cd_to(clsf_cd_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 12:07:34 KST 2009 */