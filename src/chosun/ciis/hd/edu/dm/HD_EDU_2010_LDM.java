

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


public class HD_EDU_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String fr_cour_yyyymm;
	public String to_cour_yyyymm;

	public HD_EDU_2010_LDM(){}
	public HD_EDU_2010_LDM(String cmpy_cd, String emp_no, String fr_cour_yyyymm, String to_cour_yyyymm){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.fr_cour_yyyymm = fr_cour_yyyymm;
		this.to_cour_yyyymm = to_cour_yyyymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFr_cour_yyyymm(String fr_cour_yyyymm){
		this.fr_cour_yyyymm = fr_cour_yyyymm;
	}

	public void setTo_cour_yyyymm(String to_cour_yyyymm){
		this.to_cour_yyyymm = to_cour_yyyymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFr_cour_yyyymm(){
		return this.fr_cour_yyyymm;
	}

	public String getTo_cour_yyyymm(){
		return this.to_cour_yyyymm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2010_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2010_LDM dm = (HD_EDU_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.fr_cour_yyyymm);
		cstmt.setString(6, dm.to_cour_yyyymm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EDU_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("fr_cour_yyyymm = [" + getFr_cour_yyyymm() + "]");
		System.out.println("to_cour_yyyymm = [" + getTo_cour_yyyymm() + "]");
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
String fr_cour_yyyymm = req.getParameter("fr_cour_yyyymm");
if( fr_cour_yyyymm == null){
	System.out.println(this.toString+" : fr_cour_yyyymm is null" );
}else{
	System.out.println(this.toString+" : fr_cour_yyyymm is "+fr_cour_yyyymm );
}
String to_cour_yyyymm = req.getParameter("to_cour_yyyymm");
if( to_cour_yyyymm == null){
	System.out.println(this.toString+" : to_cour_yyyymm is null" );
}else{
	System.out.println(this.toString+" : to_cour_yyyymm is "+to_cour_yyyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String fr_cour_yyyymm = Util.checkString(req.getParameter("fr_cour_yyyymm"));
String to_cour_yyyymm = Util.checkString(req.getParameter("to_cour_yyyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String fr_cour_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_cour_yyyymm")));
String to_cour_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_cour_yyyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFr_cour_yyyymm(fr_cour_yyyymm);
dm.setTo_cour_yyyymm(to_cour_yyyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 08 10:12:46 KST 2011 */