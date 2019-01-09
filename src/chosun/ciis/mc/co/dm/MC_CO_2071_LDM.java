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


public class MC_CO_2071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_type_cd;
	public String from_clas_cd1;
	public String to_clas_cd1;
	public String from_clas_cd2;
	public String to_clas_cd2;
	public String dept_cd;
	public String from_budg_cd;
	public String to_budg_cd;
	public String from_work_no;
	public String to_work_no;
	public String budg_yyyy;

	public MC_CO_2071_LDM(){}
	public MC_CO_2071_LDM(String cmpy_cd, String budg_type_cd, String from_clas_cd1, String to_clas_cd1, String from_clas_cd2, String to_clas_cd2, String dept_cd, String from_budg_cd, String to_budg_cd, String from_work_no, String to_work_no, String budg_yyyy){
		this.cmpy_cd = cmpy_cd;
		this.budg_type_cd = budg_type_cd;
		this.from_clas_cd1 = from_clas_cd1;
		this.to_clas_cd1 = to_clas_cd1;
		this.from_clas_cd2 = from_clas_cd2;
		this.to_clas_cd2 = to_clas_cd2;
		this.dept_cd = dept_cd;
		this.from_budg_cd = from_budg_cd;
		this.to_budg_cd = to_budg_cd;
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

	public void setFrom_clas_cd1(String from_clas_cd1){
		this.from_clas_cd1 = from_clas_cd1;
	}

	public void setTo_clas_cd1(String to_clas_cd1){
		this.to_clas_cd1 = to_clas_cd1;
	}

	public void setFrom_clas_cd2(String from_clas_cd2){
		this.from_clas_cd2 = from_clas_cd2;
	}

	public void setTo_clas_cd2(String to_clas_cd2){
		this.to_clas_cd2 = to_clas_cd2;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFrom_budg_cd(String from_budg_cd){
		this.from_budg_cd = from_budg_cd;
	}

	public void setTo_budg_cd(String to_budg_cd){
		this.to_budg_cd = to_budg_cd;
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

	public String getFrom_clas_cd1(){
		return this.from_clas_cd1;
	}

	public String getTo_clas_cd1(){
		return this.to_clas_cd1;
	}

	public String getFrom_clas_cd2(){
		return this.from_clas_cd2;
	}

	public String getTo_clas_cd2(){
		return this.to_clas_cd2;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFrom_budg_cd(){
		return this.from_budg_cd;
	}

	public String getTo_budg_cd(){
		return this.to_budg_cd;
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
		 return "{ call MISFNC.SP_MC_CO_2071_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_2071_LDM dm = (MC_CO_2071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_type_cd);
		cstmt.setString(5, dm.from_clas_cd1);
		cstmt.setString(6, dm.to_clas_cd1);
		cstmt.setString(7, dm.from_clas_cd2);
		cstmt.setString(8, dm.to_clas_cd2);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.from_budg_cd);
		cstmt.setString(11, dm.to_budg_cd);
		cstmt.setString(12, dm.from_work_no);
		cstmt.setString(13, dm.to_work_no);
		cstmt.setString(14, dm.budg_yyyy);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_2071_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_type_cd = [" + getBudg_type_cd() + "]");
		System.out.println("from_clas_cd1 = [" + getFrom_clas_cd1() + "]");
		System.out.println("to_clas_cd1 = [" + getTo_clas_cd1() + "]");
		System.out.println("from_clas_cd2 = [" + getFrom_clas_cd2() + "]");
		System.out.println("to_clas_cd2 = [" + getTo_clas_cd2() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("from_budg_cd = [" + getFrom_budg_cd() + "]");
		System.out.println("to_budg_cd = [" + getTo_budg_cd() + "]");
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
String from_clas_cd1 = req.getParameter("from_clas_cd1");
if( from_clas_cd1 == null){
	System.out.println(this.toString+" : from_clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : from_clas_cd1 is "+from_clas_cd1 );
}
String to_clas_cd1 = req.getParameter("to_clas_cd1");
if( to_clas_cd1 == null){
	System.out.println(this.toString+" : to_clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : to_clas_cd1 is "+to_clas_cd1 );
}
String from_clas_cd2 = req.getParameter("from_clas_cd2");
if( from_clas_cd2 == null){
	System.out.println(this.toString+" : from_clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : from_clas_cd2 is "+from_clas_cd2 );
}
String to_clas_cd2 = req.getParameter("to_clas_cd2");
if( to_clas_cd2 == null){
	System.out.println(this.toString+" : to_clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : to_clas_cd2 is "+to_clas_cd2 );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String from_budg_cd = req.getParameter("from_budg_cd");
if( from_budg_cd == null){
	System.out.println(this.toString+" : from_budg_cd is null" );
}else{
	System.out.println(this.toString+" : from_budg_cd is "+from_budg_cd );
}
String to_budg_cd = req.getParameter("to_budg_cd");
if( to_budg_cd == null){
	System.out.println(this.toString+" : to_budg_cd is null" );
}else{
	System.out.println(this.toString+" : to_budg_cd is "+to_budg_cd );
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
String from_clas_cd1 = Util.checkString(req.getParameter("from_clas_cd1"));
String to_clas_cd1 = Util.checkString(req.getParameter("to_clas_cd1"));
String from_clas_cd2 = Util.checkString(req.getParameter("from_clas_cd2"));
String to_clas_cd2 = Util.checkString(req.getParameter("to_clas_cd2"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String from_budg_cd = Util.checkString(req.getParameter("from_budg_cd"));
String to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
String from_work_no = Util.checkString(req.getParameter("from_work_no"));
String to_work_no = Util.checkString(req.getParameter("to_work_no"));
String budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_type_cd")));
String from_clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("from_clas_cd1")));
String to_clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("to_clas_cd1")));
String from_clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("from_clas_cd2")));
String to_clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("to_clas_cd2")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String from_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_budg_cd")));
String to_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_cd")));
String from_work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("from_work_no")));
String to_work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_work_no")));
String budg_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_type_cd(budg_type_cd);
dm.setFrom_clas_cd1(from_clas_cd1);
dm.setTo_clas_cd1(to_clas_cd1);
dm.setFrom_clas_cd2(from_clas_cd2);
dm.setTo_clas_cd2(to_clas_cd2);
dm.setDept_cd(dept_cd);
dm.setFrom_budg_cd(from_budg_cd);
dm.setTo_budg_cd(to_budg_cd);
dm.setFrom_work_no(from_work_no);
dm.setTo_work_no(to_work_no);
dm.setBudg_yyyy(budg_yyyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 30 16:11:15 KST 2009 */