/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사-급여관리-총보상 생성 및 조회(TV조선용)
* 작성일자 : 2014-10-15
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String posi_nm;

	public HD_EDU_1620_ADM(){}
	public HD_EDU_1620_ADM(String dept_nm, String emp_no, String flnm, String posi_nm){
		this.dept_nm = dept_nm;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.posi_nm = posi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_1620_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_1620_ADM dm = (HD_EDU_1620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dept_nm);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.posi_nm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_1620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("posi_nm = [" + getPosi_nm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String posi_nm = req.getParameter("posi_nm");
if( posi_nm == null){
	System.out.println(this.toString+" : posi_nm is null" );
}else{
	System.out.println(this.toString+" : posi_nm is "+posi_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String posi_nm = Util.checkString(req.getParameter("posi_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String posi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDept_nm(dept_nm);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setPosi_nm(posi_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 04 11:16:30 KST 2014 */