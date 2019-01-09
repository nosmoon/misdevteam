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


public class MC_BUDG_4073_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String date_fr;
	public String date_to;
	public String dept_fr;
	public String dept_to;
	public String clsf_cd;
	public String crte_clsf;

	public MC_BUDG_4073_LDM(){}
	public MC_BUDG_4073_LDM(String cmpy_cd, String date_fr, String date_to, String dept_fr, String dept_to, String clsf_cd, String crte_clsf){
		this.cmpy_cd = cmpy_cd;
		this.date_fr = date_fr;
		this.date_to = date_to;
		this.dept_fr = dept_fr;
		this.dept_to = dept_to;
		this.clsf_cd = clsf_cd;
		this.crte_clsf = crte_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDate_fr(String date_fr){
		this.date_fr = date_fr;
	}

	public void setDate_to(String date_to){
		this.date_to = date_to;
	}

	public void setDept_fr(String dept_fr){
		this.dept_fr = dept_fr;
	}

	public void setDept_to(String dept_to){
		this.dept_to = dept_to;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDate_fr(){
		return this.date_fr;
	}

	public String getDate_to(){
		return this.date_to;
	}

	public String getDept_fr(){
		return this.dept_fr;
	}

	public String getDept_to(){
		return this.dept_to;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4073_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4073_LDM dm = (MC_BUDG_4073_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.date_fr);
		cstmt.setString(5, dm.date_to);
		cstmt.setString(6, dm.dept_fr);
		cstmt.setString(7, dm.dept_to);
		cstmt.setString(8, dm.clsf_cd);
		cstmt.setString(9, dm.crte_clsf);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4073_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("date_fr = [" + getDate_fr() + "]");
		System.out.println("date_to = [" + getDate_to() + "]");
		System.out.println("dept_fr = [" + getDept_fr() + "]");
		System.out.println("dept_to = [" + getDept_to() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("crte_clsf = [" + getCrte_clsf() + "]");
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
String date_fr = req.getParameter("date_fr");
if( date_fr == null){
	System.out.println(this.toString+" : date_fr is null" );
}else{
	System.out.println(this.toString+" : date_fr is "+date_fr );
}
String date_to = req.getParameter("date_to");
if( date_to == null){
	System.out.println(this.toString+" : date_to is null" );
}else{
	System.out.println(this.toString+" : date_to is "+date_to );
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
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String crte_clsf = req.getParameter("crte_clsf");
if( crte_clsf == null){
	System.out.println(this.toString+" : crte_clsf is null" );
}else{
	System.out.println(this.toString+" : crte_clsf is "+crte_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String date_fr = Util.checkString(req.getParameter("date_fr"));
String date_to = Util.checkString(req.getParameter("date_to"));
String dept_fr = Util.checkString(req.getParameter("dept_fr"));
String dept_to = Util.checkString(req.getParameter("dept_to"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String date_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("date_fr")));
String date_to = Util.Uni2Ksc(Util.checkString(req.getParameter("date_to")));
String dept_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_fr")));
String dept_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_to")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDate_fr(date_fr);
dm.setDate_to(date_to);
dm.setDept_fr(dept_fr);
dm.setDept_to(dept_to);
dm.setClsf_cd(clsf_cd);
dm.setCrte_clsf(crte_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 20:24:17 KST 2009 */