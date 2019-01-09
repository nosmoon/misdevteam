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


public class SE_TEST_1050_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String year;
	public String month;
	public String week;

	public SE_TEST_1050_LDM(){}
	public SE_TEST_1050_LDM(String year, String month, String week){
		this.year = year;
		this.month = month;
		this.week = week;
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

	public String getYear(){
		return this.year;
	}

	public String getMonth(){
		return this.month;
	}

	public String getWeek(){
		return this.week;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TEST_1050_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TEST_1050_LDM dm = (SE_TEST_1050_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.year);
		cstmt.setString(4, dm.month);
		cstmt.setString(5, dm.week);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.test.ds.SE_TEST_1050_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("year = [" + getYear() + "]");
		System.out.println("month = [" + getMonth() + "]");
		System.out.println("week = [" + getWeek() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String year = Util.checkString(req.getParameter("year"));
String month = Util.checkString(req.getParameter("month"));
String week = Util.checkString(req.getParameter("week"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String month = Util.Uni2Ksc(Util.checkString(req.getParameter("month")));
String week = Util.Uni2Ksc(Util.checkString(req.getParameter("week")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setYear(year);
dm.setMonth(month);
dm.setWeek(week);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 27 10:24:36 KST 2013 */