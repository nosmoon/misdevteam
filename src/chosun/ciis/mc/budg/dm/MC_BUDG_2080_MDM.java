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


public class MC_BUDG_2080_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String budg_cd;

	public MC_BUDG_2080_MDM(){}
	public MC_BUDG_2080_MDM(String cmpy_cd, String dept_cd, String budg_cd){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.budg_cd = budg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2080_M(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2080_MDM dm = (MC_BUDG_2080_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.budg_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2080_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setBudg_cd(budg_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 29 14:28:34 KST 2009 */