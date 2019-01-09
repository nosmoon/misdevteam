

package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1613_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String search_frdt;
	public String search_todt;

	public HD_VACA_1613_LDM(){}
	public HD_VACA_1613_LDM(String cmpy_cd, String emp_no, String search_frdt, String search_todt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.search_frdt = search_frdt;
		this.search_todt = search_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSearch_frdt(String search_frdt){
		this.search_frdt = search_frdt;
	}

	public void setSearch_todt(String search_todt){
		this.search_todt = search_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSearch_frdt(){
		return this.search_frdt;
	}

	public String getSearch_todt(){
		return this.search_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1613_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1613_LDM dm = (HD_VACA_1613_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.search_frdt);
		cstmt.setString(6, dm.search_todt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1613_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("search_frdt = [" + getSearch_frdt() + "]");
		System.out.println("search_todt = [" + getSearch_todt() + "]");
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
String search_frdt = req.getParameter("search_frdt");
if( search_frdt == null){
	System.out.println(this.toString+" : search_frdt is null" );
}else{
	System.out.println(this.toString+" : search_frdt is "+search_frdt );
}
String search_todt = req.getParameter("search_todt");
if( search_todt == null){
	System.out.println(this.toString+" : search_todt is null" );
}else{
	System.out.println(this.toString+" : search_todt is "+search_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String search_frdt = Util.checkString(req.getParameter("search_frdt"));
String search_todt = Util.checkString(req.getParameter("search_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String search_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_frdt")));
String search_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSearch_frdt(search_frdt);
dm.setSearch_todt(search_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 01 16:51:38 KST 2010 */