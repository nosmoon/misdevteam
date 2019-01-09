/***************************************************************************************************
* 파일명 : SS_U_CYEXPAYDM.java
* 기능 : 확장현황-사이버확장-수당 저장을 위한 DM
* 작성일자 : 2004-09-10
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-수당 저장을 위한 DM
 */


public class SS_U_CYEXPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String rdr_extndtary;
	public String rdr_extnnoary;
	public String checkedary;

	public SS_U_CYEXPAYDM(){}
	public SS_U_CYEXPAYDM(String incmgpers, String rdr_extndtary, String rdr_extnnoary, String checkedary){
		this.incmgpers = incmgpers;
		this.rdr_extndtary = rdr_extndtary;
		this.rdr_extnnoary = rdr_extnnoary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_extndtary(String rdr_extndtary){
		this.rdr_extndtary = rdr_extndtary;
	}

	public void setRdr_extnnoary(String rdr_extnnoary){
		this.rdr_extnnoary = rdr_extnnoary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_extndtary(){
		return this.rdr_extndtary;
	}

	public String getRdr_extnnoary(){
		return this.rdr_extnnoary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_CYEXPAY( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_CYEXPAYDM dm = (SS_U_CYEXPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.rdr_extndtary);
		cstmt.setString(5, dm.rdr_extnnoary);
		cstmt.setString(6, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_CYEXPAYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String rdr_extndtary = req.getParameter("rdr_extndtary");
if( rdr_extndtary == null){
	System.out.println(this.toString+" : rdr_extndtary is null" );
}else{
	System.out.println(this.toString+" : rdr_extndtary is "+rdr_extndtary );
}
String rdr_extnnoary = req.getParameter("rdr_extnnoary");
if( rdr_extnnoary == null){
	System.out.println(this.toString+" : rdr_extnnoary is null" );
}else{
	System.out.println(this.toString+" : rdr_extnnoary is "+rdr_extnnoary );
}
String checkedary = req.getParameter("checkedary");
if( checkedary == null){
	System.out.println(this.toString+" : checkedary is null" );
}else{
	System.out.println(this.toString+" : checkedary is "+checkedary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_extndtary = Util.checkString(req.getParameter("rdr_extndtary"));
String rdr_extnnoary = Util.checkString(req.getParameter("rdr_extnnoary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_extndtary = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndtary")));
String rdr_extnnoary = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnnoary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setRdr_extndtary(rdr_extndtary);
dm.setRdr_extnnoary(rdr_extnnoary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 10 11:34:47 KST 2004 */