

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


public class HD_VACA_1804_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String decid_fr_tm;
	public String decid_to_tm;

	public HD_VACA_1804_LDM(){}
	public HD_VACA_1804_LDM(String cmpy_cd, String emp_no, String decid_fr_tm, String decid_to_tm){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.decid_fr_tm = decid_fr_tm;
		this.decid_to_tm = decid_to_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDecid_fr_tm(String decid_fr_tm){
		this.decid_fr_tm = decid_fr_tm;
	}

	public void setDecid_to_tm(String decid_to_tm){
		this.decid_to_tm = decid_to_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDecid_fr_tm(){
		return this.decid_fr_tm;
	}

	public String getDecid_to_tm(){
		return this.decid_to_tm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1804_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1804_LDM dm = (HD_VACA_1804_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.decid_fr_tm);
		cstmt.setString(7, dm.decid_to_tm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1804_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("decid_fr_tm = [" + getDecid_fr_tm() + "]");
		System.out.println("decid_to_tm = [" + getDecid_to_tm() + "]");
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
String decid_fr_tm = req.getParameter("decid_fr_tm");
if( decid_fr_tm == null){
	System.out.println(this.toString+" : decid_fr_tm is null" );
}else{
	System.out.println(this.toString+" : decid_fr_tm is "+decid_fr_tm );
}
String decid_to_tm = req.getParameter("decid_to_tm");
if( decid_to_tm == null){
	System.out.println(this.toString+" : decid_to_tm is null" );
}else{
	System.out.println(this.toString+" : decid_to_tm is "+decid_to_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String decid_fr_tm = Util.checkString(req.getParameter("decid_fr_tm"));
String decid_to_tm = Util.checkString(req.getParameter("decid_to_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String decid_fr_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_fr_tm")));
String decid_to_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_to_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDecid_fr_tm(decid_fr_tm);
dm.setDecid_to_tm(decid_to_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 08 14:29:23 KST 2010 */