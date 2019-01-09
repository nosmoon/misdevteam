/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_8201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pymt_yy;
	public String pymt_no;

	public HD_SALY_8201_LDM(){}
	public HD_SALY_8201_LDM(String cmpy_cd, String emp_no, String pymt_yy, String pymt_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.pymt_yy = pymt_yy;
		this.pymt_no = pymt_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPymt_yy(String pymt_yy){
		this.pymt_yy = pymt_yy;
	}

	public void setPymt_no(String pymt_no){
		this.pymt_no = pymt_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPymt_yy(){
		return this.pymt_yy;
	}

	public String getPymt_no(){
		return this.pymt_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_8201_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_8201_LDM dm = (HD_SALY_8201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.pymt_yy);
		cstmt.setString(7, dm.pymt_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_8201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pymt_yy = [" + getPymt_yy() + "]");
		System.out.println("pymt_no = [" + getPymt_no() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String pymt_yy = req.getParameter("pymt_yy");
if( pymt_yy == null){
	System.out.println(this.toString+" : pymt_yy is null" );
}else{
	System.out.println(this.toString+" : pymt_yy is "+pymt_yy );
}
String pymt_no = req.getParameter("pymt_no");
if( pymt_no == null){
	System.out.println(this.toString+" : pymt_no is null" );
}else{
	System.out.println(this.toString+" : pymt_no is "+pymt_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pymt_yy = Util.checkString(req.getParameter("pymt_yy"));
String pymt_no = Util.checkString(req.getParameter("pymt_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pymt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_yy")));
String pymt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPymt_yy(pymt_yy);
dm.setPymt_no(pymt_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 07 11:32:29 KST 2017 */