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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String emp_tm;
	public String search;

	public HD_INFO_2102_LDM(){}
	public HD_INFO_2102_LDM(String cmpy_cd, String emp_no, String emp_tm, String search){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.emp_tm = emp_tm;
		this.search = search;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_tm(String emp_tm){
		this.emp_tm = emp_tm;
	}

	public void setSearch(String search){
		this.search = search;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_tm(){
		return this.emp_tm;
	}

	public String getSearch(){
		return this.search;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2102_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2102_LDM dm = (HD_INFO_2102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.emp_tm);
		cstmt.setString(6, dm.search);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2102_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("emp_tm = [" + getEmp_tm() + "]");
		System.out.println("search = [" + getSearch() + "]");
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
String emp_tm = req.getParameter("emp_tm");
if( emp_tm == null){
	System.out.println(this.toString+" : emp_tm is null" );
}else{
	System.out.println(this.toString+" : emp_tm is "+emp_tm );
}
String search = req.getParameter("search");
if( search == null){
	System.out.println(this.toString+" : search is null" );
}else{
	System.out.println(this.toString+" : search is "+search );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String emp_tm = Util.checkString(req.getParameter("emp_tm"));
String search = Util.checkString(req.getParameter("search"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String emp_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_tm")));
String search = Util.Uni2Ksc(Util.checkString(req.getParameter("search")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setEmp_tm(emp_tm);
dm.setSearch(search);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 21:41:52 KST 2009 */