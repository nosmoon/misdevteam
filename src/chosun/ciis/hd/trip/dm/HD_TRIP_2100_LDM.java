

package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_2100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String biz_trip_frdt;
	public String biz_trip_todt;
	public String dept_cd;
	public String emp_no;

	public HD_TRIP_2100_LDM(){}
	public HD_TRIP_2100_LDM(String cmpy_cd, String biz_trip_frdt, String biz_trip_todt, String dept_cd, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.biz_trip_frdt = biz_trip_frdt;
		this.biz_trip_todt = biz_trip_todt;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBiz_trip_frdt(String biz_trip_frdt){
		this.biz_trip_frdt = biz_trip_frdt;
	}

	public void setBiz_trip_todt(String biz_trip_todt){
		this.biz_trip_todt = biz_trip_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBiz_trip_frdt(){
		return this.biz_trip_frdt;
	}

	public String getBiz_trip_todt(){
		return this.biz_trip_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_2100_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_2100_LDM dm = (HD_TRIP_2100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.biz_trip_frdt);
		cstmt.setString(6, dm.biz_trip_todt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.emp_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_TRIP_2100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("biz_trip_frdt = [" + getBiz_trip_frdt() + "]");
		System.out.println("biz_trip_todt = [" + getBiz_trip_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String biz_trip_frdt = req.getParameter("biz_trip_frdt");
if( biz_trip_frdt == null){
	System.out.println(this.toString+" : biz_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : biz_trip_frdt is "+biz_trip_frdt );
}
String biz_trip_todt = req.getParameter("biz_trip_todt");
if( biz_trip_todt == null){
	System.out.println(this.toString+" : biz_trip_todt is null" );
}else{
	System.out.println(this.toString+" : biz_trip_todt is "+biz_trip_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String biz_trip_frdt = Util.checkString(req.getParameter("biz_trip_frdt"));
String biz_trip_todt = Util.checkString(req.getParameter("biz_trip_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String biz_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_frdt")));
String biz_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_trip_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBiz_trip_frdt(biz_trip_frdt);
dm.setBiz_trip_todt(biz_trip_todt);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 02 17:31:48 KST 2011 */