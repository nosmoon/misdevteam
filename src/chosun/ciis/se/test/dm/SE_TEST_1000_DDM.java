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


public class SE_TEST_1000_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String emp_no;
	public String cmpycd;
	public String workcd;
	public String year;
	public String month;
	public String week;
	public String vip_lastweek;
	public String lastweek;
	public String thisweek;

	public SE_TEST_1000_DDM(){}
	public SE_TEST_1000_DDM(String mode, String emp_no, String cmpycd, String workcd, String year, String month, String week, String vip_lastweek, String lastweek, String thisweek){
		this.mode = mode;
		this.emp_no = emp_no;
		this.cmpycd = cmpycd;
		this.workcd = workcd;
		this.year = year;
		this.month = month;
		this.week = week;
		this.vip_lastweek = vip_lastweek;
		this.lastweek = lastweek;
		this.thisweek = thisweek;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setWorkcd(String workcd){
		this.workcd = workcd;
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

	public void setVip_lastweek(String vip_lastweek){
		this.vip_lastweek = vip_lastweek;
	}

	public void setLastweek(String lastweek){
		this.lastweek = lastweek;
	}

	public void setThisweek(String thisweek){
		this.thisweek = thisweek;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getWorkcd(){
		return this.workcd;
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

	public String getVip_lastweek(){
		return this.vip_lastweek;
	}

	public String getLastweek(){
		return this.lastweek;
	}

	public String getThisweek(){
		return this.thisweek;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TEST_1000_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TEST_1000_DDM dm = (SE_TEST_1000_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.workcd);
		cstmt.setString(7, dm.year);
		cstmt.setString(8, dm.month);
		cstmt.setString(9, dm.week);
		cstmt.setString(10, dm.vip_lastweek);
		cstmt.setString(11, dm.lastweek);
		cstmt.setString(12, dm.thisweek);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.test.ds.SE_TEST_1000_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("workcd = [" + getWorkcd() + "]");
		System.out.println("year = [" + getYear() + "]");
		System.out.println("month = [" + getMonth() + "]");
		System.out.println("week = [" + getWeek() + "]");
		System.out.println("vip_lastweek = [" + getVip_lastweek() + "]");
		System.out.println("lastweek = [" + getLastweek() + "]");
		System.out.println("thisweek = [" + getThisweek() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String vip_lastweek = req.getParameter("vip_lastweek");
if( vip_lastweek == null){
	System.out.println(this.toString+" : vip_lastweek is null" );
}else{
	System.out.println(this.toString+" : vip_lastweek is "+vip_lastweek );
}
String lastweek = req.getParameter("lastweek");
if( lastweek == null){
	System.out.println(this.toString+" : lastweek is null" );
}else{
	System.out.println(this.toString+" : lastweek is "+lastweek );
}
String thisweek = req.getParameter("thisweek");
if( thisweek == null){
	System.out.println(this.toString+" : thisweek is null" );
}else{
	System.out.println(this.toString+" : thisweek is "+thisweek );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String workcd = Util.checkString(req.getParameter("workcd"));
String year = Util.checkString(req.getParameter("year"));
String month = Util.checkString(req.getParameter("month"));
String week = Util.checkString(req.getParameter("week"));
String vip_lastweek = Util.checkString(req.getParameter("vip_lastweek"));
String lastweek = Util.checkString(req.getParameter("lastweek"));
String thisweek = Util.checkString(req.getParameter("thisweek"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String workcd = Util.Uni2Ksc(Util.checkString(req.getParameter("workcd")));
String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String month = Util.Uni2Ksc(Util.checkString(req.getParameter("month")));
String week = Util.Uni2Ksc(Util.checkString(req.getParameter("week")));
String vip_lastweek = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_lastweek")));
String lastweek = Util.Uni2Ksc(Util.checkString(req.getParameter("lastweek")));
String thisweek = Util.Uni2Ksc(Util.checkString(req.getParameter("thisweek")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setCmpycd(cmpycd);
dm.setWorkcd(workcd);
dm.setYear(year);
dm.setMonth(month);
dm.setWeek(week);
dm.setVip_lastweek(vip_lastweek);
dm.setLastweek(lastweek);
dm.setThisweek(thisweek);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 11 11:39:56 KST 2013 */