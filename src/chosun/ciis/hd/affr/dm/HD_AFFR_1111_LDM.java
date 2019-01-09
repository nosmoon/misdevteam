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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1111_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String search_year;
	public String radio1;
	public String radio2;

	public HD_AFFR_1111_LDM(){}
	public HD_AFFR_1111_LDM(String cmpy_cd, String emp_no, String search_year, String radio1, String radio2){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.search_year = search_year;
		this.radio1 = radio1;
		this.radio2 = radio2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSearch_year(String search_year){
		this.search_year = search_year;
	}

	public void setRadio1(String radio1){
		this.radio1 = radio1;
	}

	public void setRadio2(String radio2){
		this.radio2 = radio2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSearch_year(){
		return this.search_year;
	}

	public String getRadio1(){
		return this.radio1;
	}

	public String getRadio2(){
		return this.radio2;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1111_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1111_LDM dm = (HD_AFFR_1111_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.search_year);
		cstmt.setString(6, dm.radio1);
		cstmt.setString(7, dm.radio2);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_AFFR_1111_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("search_year = [" + getSearch_year() + "]");
		System.out.println("radio1 = [" + getRadio1() + "]");
		System.out.println("radio2 = [" + getRadio2() + "]");
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
String search_year = req.getParameter("search_year");
if( search_year == null){
	System.out.println(this.toString+" : search_year is null" );
}else{
	System.out.println(this.toString+" : search_year is "+search_year );
}
String radio1 = req.getParameter("radio1");
if( radio1 == null){
	System.out.println(this.toString+" : radio1 is null" );
}else{
	System.out.println(this.toString+" : radio1 is "+radio1 );
}
String radio2 = req.getParameter("radio2");
if( radio2 == null){
	System.out.println(this.toString+" : radio2 is null" );
}else{
	System.out.println(this.toString+" : radio2 is "+radio2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String search_year = Util.checkString(req.getParameter("search_year"));
String radio1 = Util.checkString(req.getParameter("radio1"));
String radio2 = Util.checkString(req.getParameter("radio2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String search_year = Util.Uni2Ksc(Util.checkString(req.getParameter("search_year")));
String radio1 = Util.Uni2Ksc(Util.checkString(req.getParameter("radio1")));
String radio2 = Util.Uni2Ksc(Util.checkString(req.getParameter("radio2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSearch_year(search_year);
dm.setRadio1(radio1);
dm.setRadio2(radio2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 23 15:20:04 KST 2009 */