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


public class HD_SALY_2501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String alon_yymm;

	public HD_SALY_2501_LDM(){}
	public HD_SALY_2501_LDM(String cmpy_cd, String emp_no, String alon_yymm){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.alon_yymm = alon_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAlon_yymm(String alon_yymm){
		this.alon_yymm = alon_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAlon_yymm(){
		return this.alon_yymm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_2501_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_2501_LDM dm = (HD_SALY_2501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.alon_yymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_2501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("alon_yymm = [" + getAlon_yymm() + "]");
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
String alon_yymm = req.getParameter("alon_yymm");
if( alon_yymm == null){
	System.out.println(this.toString+" : alon_yymm is null" );
}else{
	System.out.println(this.toString+" : alon_yymm is "+alon_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String alon_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAlon_yymm(alon_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 13 19:32:11 KST 2015 */