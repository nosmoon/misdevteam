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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_3200_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String auth_gb;
	public String use_yn;
	public String incmg_pers;
	public String base_dt;

	public IS_AGR_3200_MDM(){}
	public IS_AGR_3200_MDM(String cmpy_cd, String auth_gb, String use_yn, String incmg_pers, String base_dt){
		this.cmpy_cd = cmpy_cd;
		this.auth_gb = auth_gb;
		this.use_yn = use_yn;
		this.incmg_pers = incmg_pers;
		this.base_dt = base_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAuth_gb(String auth_gb){
		this.auth_gb = auth_gb;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAuth_gb(){
		return this.auth_gb;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_3200_M(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_3200_MDM dm = (IS_AGR_3200_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.auth_gb);
		cstmt.setString(5, dm.use_yn);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.base_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_3200_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("auth_gb = [" + getAuth_gb() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
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
String auth_gb = req.getParameter("auth_gb");
if( auth_gb == null){
	System.out.println(this.toString+" : auth_gb is null" );
}else{
	System.out.println(this.toString+" : auth_gb is "+auth_gb );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String auth_gb = Util.checkString(req.getParameter("auth_gb"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAuth_gb(auth_gb);
dm.setUse_yn(use_yn);
dm.setIncmg_pers(incmg_pers);
dm.setBase_dt(base_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 15:36:17 KST 2012 */