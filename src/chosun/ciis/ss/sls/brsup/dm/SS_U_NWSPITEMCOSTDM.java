/***************************************************************************************************
* 파일명 : SS_U_NWSPITEMCOSTDM.java
* 기능 : 지국지원-신문지원물품-비용(지원담당)-저장(수정)을 위한 DM
* 작성일자 : 2004-02-07
* 작성자 : 김대섭
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
 * 지국지원-신문지원물품-비용(지원담당)-저장(수정)을 위한 DM
 */

public class SS_U_NWSPITEMCOSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basidtary;
	public String bocdary;
	public String checkedary;

	public SS_U_NWSPITEMCOSTDM(){}
	public SS_U_NWSPITEMCOSTDM(String incmgpers, String basidtary, String bocdary, String checkedary){
		this.incmgpers = incmgpers;
		this.basidtary = basidtary;
		this.bocdary = bocdary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasidtary(String basidtary){
		this.basidtary = basidtary;
	}

	public void setBocdary(String bocdary){
		this.bocdary = bocdary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasidtary(){
		return this.basidtary;
	}

	public String getBocdary(){
		return this.bocdary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_NWSPITEMCOST( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_NWSPITEMCOSTDM dm = (SS_U_NWSPITEMCOSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.basidtary);
		cstmt.setString(5, dm.bocdary);
		cstmt.setString(6, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_NWSPITEMCOSTDataSet();
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
String basidtary = req.getParameter("basidtary");
if( basidtary == null){
	System.out.println(this.toString+" : basidtary is null" );
}else{
	System.out.println(this.toString+" : basidtary is "+basidtary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
	System.out.println(this.toString+" : bocdary is null" );
}else{
	System.out.println(this.toString+" : bocdary is "+bocdary );
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
String basidtary = Util.checkString(req.getParameter("basidtary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basidtary = Util.Uni2Ksc(Util.checkString(req.getParameter("basidtary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBasidtary(basidtary);
dm.setBocdary(bocdary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 19:48:19 KST 2004 */