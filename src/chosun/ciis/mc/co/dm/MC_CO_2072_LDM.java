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


package chosun.ciis.mc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.ds.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_2072_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_type_cd;
	public String budg_cd1;
	public String budg_cd2;
	public String dept_cd;
	public String from_work_no;
	public String to_work_no;
	public String budg_yyyy;

	public MC_CO_2072_LDM(){}
	public MC_CO_2072_LDM(String cmpy_cd, String budg_type_cd, String budg_cd1, String budg_cd2, String dept_cd, String from_work_no, String to_work_no, String budg_yyyy){
		this.cmpy_cd = cmpy_cd;
		this.budg_type_cd = budg_type_cd;
		this.budg_cd1 = budg_cd1;
		this.budg_cd2 = budg_cd2;
		this.dept_cd = dept_cd;
		this.from_work_no = from_work_no;
		this.to_work_no = to_work_no;
		this.budg_yyyy = budg_yyyy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_type_cd(String budg_type_cd){
		this.budg_type_cd = budg_type_cd;
	}

	public void setBudg_cd1(String budg_cd1){
		this.budg_cd1 = budg_cd1;
	}

	public void setBudg_cd2(String budg_cd2){
		this.budg_cd2 = budg_cd2;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFrom_work_no(String from_work_no){
		this.from_work_no = from_work_no;
	}

	public void setTo_work_no(String to_work_no){
		this.to_work_no = to_work_no;
	}

	public void setBudg_yyyy(String budg_yyyy){
		this.budg_yyyy = budg_yyyy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_type_cd(){
		return this.budg_type_cd;
	}

	public String getBudg_cd1(){
		return this.budg_cd1;
	}

	public String getBudg_cd2(){
		return this.budg_cd2;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFrom_work_no(){
		return this.from_work_no;
	}

	public String getTo_work_no(){
		return this.to_work_no;
	}

	public String getBudg_yyyy(){
		return this.budg_yyyy;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_2072_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_2072_LDM dm = (MC_CO_2072_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_type_cd);
		cstmt.setString(5, dm.budg_cd1);
		cstmt.setString(6, dm.budg_cd2);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.from_work_no);
		cstmt.setString(9, dm.to_work_no);
		cstmt.setString(10, dm.budg_yyyy);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_2072_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_type_cd = [" + getBudg_type_cd() + "]");
		System.out.println("budg_cd1 = [" + getBudg_cd1() + "]");
		System.out.println("budg_cd2 = [" + getBudg_cd2() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("from_work_no = [" + getFrom_work_no() + "]");
		System.out.println("to_work_no = [" + getTo_work_no() + "]");
		System.out.println("budg_yyyy = [" + getBudg_yyyy() + "]");
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
String budg_type_cd = req.getParameter("budg_type_cd");
if( budg_type_cd == null){
	System.out.println(this.toString+" : budg_type_cd is null" );
}else{
	System.out.println(this.toString+" : budg_type_cd is "+budg_type_cd );
}
String budg_cd1 = req.getParameter("budg_cd1");
if( budg_cd1 == null){
	System.out.println(this.toString+" : budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : budg_cd1 is "+budg_cd1 );
}
String budg_cd2 = req.getParameter("budg_cd2");
if( budg_cd2 == null){
	System.out.println(this.toString+" : budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : budg_cd2 is "+budg_cd2 );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String from_work_no = req.getParameter("from_work_no");
if( from_work_no == null){
	System.out.println(this.toString+" : from_work_no is null" );
}else{
	System.out.println(this.toString+" : from_work_no is "+from_work_no );
}
String to_work_no = req.getParameter("to_work_no");
if( to_work_no == null){
	System.out.println(this.toString+" : to_work_no is null" );
}else{
	System.out.println(this.toString+" : to_work_no is "+to_work_no );
}
String budg_yyyy = req.getParameter("budg_yyyy");
if( budg_yyyy == null){
	System.out.println(this.toString+" : budg_yyyy is null" );
}else{
	System.out.println(this.toString+" : budg_yyyy is "+budg_yyyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
String budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
String budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String from_work_no = Util.checkString(req.getParameter("from_work_no"));
String to_work_no = Util.checkString(req.getParameter("to_work_no"));
String budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_type_cd")));
String budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd1")));
String budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd2")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String from_work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("from_work_no")));
String to_work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_work_no")));
String budg_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_type_cd(budg_type_cd);
dm.setBudg_cd1(budg_cd1);
dm.setBudg_cd2(budg_cd2);
dm.setDept_cd(dept_cd);
dm.setFrom_work_no(from_work_no);
dm.setTo_work_no(to_work_no);
dm.setBudg_yyyy(budg_yyyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 09:05:55 KST 2009 */