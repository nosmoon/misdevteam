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


package chosun.ciis.se.test.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.test.ds.*;
import chosun.ciis.se.test.rec.*;

/**
 * 
 */


public class SE_TEST_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String year;
	public String month;
	public String week;
	public String cmpycd;
	public String workcd;
	public String emp_no;

	public SE_TEST_1010_LDM(){}
	public SE_TEST_1010_LDM(String year, String month, String week, String cmpycd, String workcd, String emp_no){
		this.year = year;
		this.month = month;
		this.week = week;
		this.cmpycd = cmpycd;
		this.workcd = workcd;
		this.emp_no = emp_no;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setMonth(String month){
		this.month = month;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setWorkcd(String workcd){
		this.workcd = workcd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getYear(){
		return this.year;
	}

	public String getMonth(){
		return this.month;
	}

	public String getWeek(){
		return this.week;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getWorkcd(){
		return this.workcd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TEST_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TEST_1010_LDM dm = (SE_TEST_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.year);
		cstmt.setString(4, dm.month);
		cstmt.setString(5, dm.week);
		cstmt.setString(6, dm.cmpycd);
		cstmt.setString(7, dm.workcd);
		cstmt.setString(8, dm.emp_no);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.test.ds.SE_TEST_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("year = [" + getYear() + "]");
		System.out.println("month = [" + getMonth() + "]");
		System.out.println("week = [" + getWeek() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("workcd = [" + getWorkcd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String year = req.getParameter("year");
if( year == null){
	System.out.println(this.toString+" : year is null" );
}else{
	System.out.println(this.toString+" : year is "+year );
}
String month = req.getParameter("month");
if( month == null){
	System.out.println(this.toString+" : month is null" );
}else{
	System.out.println(this.toString+" : month is "+month );
}
String week = req.getParameter("week");
if( week == null){
	System.out.println(this.toString+" : week is null" );
}else{
	System.out.println(this.toString+" : week is "+week );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String workcd = req.getParameter("workcd");
if( workcd == null){
	System.out.println(this.toString+" : workcd is null" );
}else{
	System.out.println(this.toString+" : workcd is "+workcd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String year = Util.checkString(req.getParameter("year"));
String month = Util.checkString(req.getParameter("month"));
String week = Util.checkString(req.getParameter("week"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String workcd = Util.checkString(req.getParameter("workcd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String month = Util.Uni2Ksc(Util.checkString(req.getParameter("month")));
String week = Util.Uni2Ksc(Util.checkString(req.getParameter("week")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String workcd = Util.Uni2Ksc(Util.checkString(req.getParameter("workcd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setYear(year);
dm.setMonth(month);
dm.setWeek(week);
dm.setCmpycd(cmpycd);
dm.setWorkcd(workcd);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 23 17:03:18 KST 2013 */