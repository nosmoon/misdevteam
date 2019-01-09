/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SE_TEST_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String year;
	public String month;
	public String emp_no;

	public SE_TEST_1020_LDM(){}
	public SE_TEST_1020_LDM(String year, String month, String emp_no){
		this.year = year;
		this.month = month;
		this.emp_no = emp_no;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setMonth(String month){
		this.month = month;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TEST_1020_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TEST_1020_LDM dm = (SE_TEST_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.year);
		cstmt.setString(4, dm.month);
		cstmt.setString(5, dm.emp_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.test.ds.SE_TEST_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("year = [" + getYear() + "]");
		System.out.println("month = [" + getMonth() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String year = Util.checkString(req.getParameter("year"));
String month = Util.checkString(req.getParameter("month"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String month = Util.Uni2Ksc(Util.checkString(req.getParameter("month")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setYear(year);
dm.setMonth(month);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 24 17:46:46 KST 2013 */