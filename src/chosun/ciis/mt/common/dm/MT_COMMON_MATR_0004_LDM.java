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


package chosun.ciis.mt.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.common.ds.*;
import chosun.ciis.mt.common.rec.*;

/**
 * 
 */


public class MT_COMMON_MATR_0004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt_fr;
	public String clam_dt_to;
	public String dept_cd;
	public String matr_cd;

	public MT_COMMON_MATR_0004_LDM(){}
	public MT_COMMON_MATR_0004_LDM(String cmpy_cd, String clam_dt_fr, String clam_dt_to, String dept_cd, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt_fr = clam_dt_fr;
		this.clam_dt_to = clam_dt_to;
		this.dept_cd = dept_cd;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dt_fr(String clam_dt_fr){
		this.clam_dt_fr = clam_dt_fr;
	}

	public void setClam_dt_to(String clam_dt_to){
		this.clam_dt_to = clam_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}
	
	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dt_fr(){
		return this.clam_dt_fr;
	}

	public String getClam_dt_to(){
		return this.clam_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMON_MATR_0004_L(? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMON_MATR_0004_LDM dm = (MT_COMMON_MATR_0004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt_fr);
		cstmt.setString(5, dm.clam_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.matr_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.common.ds.MT_COMMON_MATR_0004_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt_fr = [" + getClam_dt_fr() + "]");
		System.out.println("clam_dt_to = [" + getClam_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
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
String clam_dt_fr = req.getParameter("clam_dt_fr");
if( clam_dt_fr == null){
	System.out.println(this.toString+" : clam_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clam_dt_fr is "+clam_dt_fr );
}
String clam_dt_to = req.getParameter("clam_dt_to");
if( clam_dt_to == null){
	System.out.println(this.toString+" : clam_dt_to is null" );
}else{
	System.out.println(this.toString+" : clam_dt_to is "+clam_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
String clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_fr")));
String clam_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt_fr(clam_dt_fr);
dm.setClam_dt_to(clam_dt_to);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Nov 29 19:50:17 KST 2009 */