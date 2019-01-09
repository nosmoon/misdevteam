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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_clsf;
	public String lvcmpy_dt;

	public HD_LVCMPY_1011_LDM(){}
	public HD_LVCMPY_1011_LDM(String cmpy_cd, String emp_no, String lvcmpy_clsf, String lvcmpy_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1011_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1011_LDM dm = (HD_LVCMPY_1011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lvcmpy_clsf);
		cstmt.setString(6, dm.lvcmpy_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
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
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setLvcmpy_dt(lvcmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 22:38:11 KST 2009 */