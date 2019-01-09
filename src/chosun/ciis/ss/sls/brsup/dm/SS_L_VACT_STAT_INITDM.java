/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_L_VACT_STAT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmg_pers;
	public String base_dt;

	public SS_L_VACT_STAT_INITDM(){}
	public SS_L_VACT_STAT_INITDM(String incmg_pers, String base_dt){
		this.incmg_pers = incmg_pers;
		this.base_dt = base_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_VACT_STAT_INIT(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VACT_STAT_INITDM dm = (SS_L_VACT_STAT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmg_pers);
		cstmt.setString(4, dm.base_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_VACT_STAT_INITDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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

String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmg_pers(incmg_pers);
dm.setBase_dt(base_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 30 14:19:27 KST 2015 */