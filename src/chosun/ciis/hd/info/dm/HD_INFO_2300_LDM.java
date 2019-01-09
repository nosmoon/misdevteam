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


public class HD_INFO_2300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_cmpy_dt;
	public String dept_cd;
	public String lvcmpy_cd;

	public HD_INFO_2300_LDM(){}
	public HD_INFO_2300_LDM(String cmpy_cd, String in_cmpy_dt, String dept_cd, String lvcmpy_cd){
		this.cmpy_cd = cmpy_cd;
		this.in_cmpy_dt = in_cmpy_dt;
		this.dept_cd = dept_cd;
		this.lvcmpy_cd = lvcmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setLvcmpy_cd(String lvcmpy_cd){
		this.lvcmpy_cd = lvcmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getLvcmpy_cd(){
		return this.lvcmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2300_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2300_LDM dm = (HD_INFO_2300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_cmpy_dt);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.lvcmpy_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2300_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("lvcmpy_cd = [" + getLvcmpy_cd() + "]");
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
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String lvcmpy_cd = req.getParameter("lvcmpy_cd");
if( lvcmpy_cd == null){
	System.out.println(this.toString+" : lvcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_cd is "+lvcmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String lvcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setDept_cd(dept_cd);
dm.setLvcmpy_cd(lvcmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 13:43:20 KST 2009 */