
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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1408_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String session_emp_no;
	public String session_dept_cd;

	public HD_DALON_1408_LDM(){}
	public HD_DALON_1408_LDM(String cmpy_cd, String aplc_clsf, String session_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.session_emp_no = session_emp_no;
		this.session_dept_cd = session_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSession_emp_no(String session_emp_no){
		this.session_emp_no = session_emp_no;
	}

	public void setSession_dept_cd(String session_dept_cd){
		this.session_dept_cd = session_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSession_emp_no(){
		return this.session_emp_no;
	}

	public String getSession_dept_cd(){
		return this.session_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1408_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1408_LDM dm = (HD_DALON_1408_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.session_emp_no);
		cstmt.setString(5, dm.session_dept_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1408_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_clsf = [" + getSession_emp_no() + "]");
		System.out.println("session_dept_cd = [" + getSession_dept_cd() + "]");
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
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String session_dept_cd = req.getParameter("session_dept_cd");
if( session_dept_cd == null){
	System.out.println(this.toString+" : session_dept_cd is null" );
}else{
	System.out.println(this.toString+" : session_dept_cd is "+session_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String session_dept_cd = Util.checkString(req.getParameter("session_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String session_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("session_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAplc_clsf(aplc_clsf);
dm.setSession_dept_cd(session_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 16:13:42 KST 2009 */