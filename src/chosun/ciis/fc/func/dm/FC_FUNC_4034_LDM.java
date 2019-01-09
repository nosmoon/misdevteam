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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4034_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String curacct_clsf_cd;
	public String mtry_dt;

	public FC_FUNC_4034_LDM(){}
	public FC_FUNC_4034_LDM(String cmpy_cd, String curacct_clsf_cd, String mtry_dt){
		this.cmpy_cd = cmpy_cd;
		this.curacct_clsf_cd = curacct_clsf_cd;
		this.mtry_dt = mtry_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4034_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4034_LDM dm = (FC_FUNC_4034_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.curacct_clsf_cd);
		cstmt.setString(5, dm.mtry_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4034_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("curacct_clsf_cd = [" + getCuracct_clsf_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
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
String curacct_clsf_cd = req.getParameter("curacct_clsf_cd");
if( curacct_clsf_cd == null){
	System.out.println(this.toString+" : curacct_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : curacct_clsf_cd is "+curacct_clsf_cd );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String curacct_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("curacct_clsf_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCuracct_clsf_cd(curacct_clsf_cd);
dm.setMtry_dt(mtry_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 11:40:41 KST 2009 */