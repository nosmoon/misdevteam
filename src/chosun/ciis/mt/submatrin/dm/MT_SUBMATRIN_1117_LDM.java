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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1117_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String ewh_dt;
	public String fisc_fr_dt;
	public String fisc_to_dt;

	public MT_SUBMATRIN_1117_LDM(){}
	public MT_SUBMATRIN_1117_LDM(String cmpy_cd, String dept_cd, String ewh_dt, String fisc_fr_dt, String fisc_to_dt){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.ewh_dt = ewh_dt;
		this.fisc_fr_dt = fisc_fr_dt;
		this.fisc_to_dt = fisc_to_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}
	
	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setFisc_fr_dt(String fisc_fr_dt){
		this.fisc_fr_dt = fisc_fr_dt;
	}

	public void setFisc_to_dt(String fisc_to_dt){
		this.fisc_to_dt = fisc_to_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getFisc_fr_dt(){
		return this.fisc_fr_dt;
	}

	public String getFisc_to_dt(){
		return this.fisc_to_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1117_L(? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1117_LDM dm = (MT_SUBMATRIN_1117_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.fisc_fr_dt);
		cstmt.setString(6, dm.fisc_to_dt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1117_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("fisc_fr_dt = [" + getFisc_fr_dt() + "]");
		System.out.println("fisc_to_dt = [" + getFisc_to_dt() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String fisc_fr_dt = req.getParameter("fisc_fr_dt");
if( fisc_fr_dt == null){
	System.out.println(this.toString+" : fisc_fr_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_fr_dt is "+fisc_fr_dt );
}
String fisc_to_dt = req.getParameter("fisc_to_dt");
if( fisc_to_dt == null){
	System.out.println(this.toString+" : fisc_to_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_to_dt is "+fisc_to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String fisc_fr_dt = Util.checkString(req.getParameter("fisc_fr_dt"));
String fisc_to_dt = Util.checkString(req.getParameter("fisc_to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String fisc_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_fr_dt")));
String fisc_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setFisc_fr_dt(fisc_fr_dt);
dm.setFisc_to_dt(fisc_to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 10:25:43 KST 2009 */