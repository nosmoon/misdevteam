/***************************************************************************************************
* 파일명 : SS_A_INSRCOSTCLMTDM.java
* 기능 : 지국지원-상해보험-비용(영업담당)-저장(등록)을 위한 DM
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-비용(영업담당)-저장(등록)을 위한 DM
 */

public class SS_A_INSRCOSTCLMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basidtary;
	public String deptcdary;
	public String areacdary;
	public String bocdary;
	public String clamtary;
	public String rcpmpersnmary;

	public SS_A_INSRCOSTCLMTDM(){}
	public SS_A_INSRCOSTCLMTDM(String incmgpers, String basidtary, String deptcdary, String areacdary, String bocdary, String clamtary, String rcpmpersnmary){
		this.incmgpers = incmgpers;
		this.basidtary = basidtary;
		this.deptcdary = deptcdary;
		this.areacdary = areacdary;
		this.bocdary = bocdary;
		this.clamtary = clamtary;
		this.rcpmpersnmary = rcpmpersnmary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasidtary(String basidtary){
		this.basidtary = basidtary;
	}

	public void setDeptcdary(String deptcdary){
		this.deptcdary = deptcdary;
	}

	public void setAreacdary(String areacdary){
		this.areacdary = areacdary;
	}

	public void setBocdary(String bocdary){
		this.bocdary = bocdary;
	}

	public void setClamtary(String clamtary){
		this.clamtary = clamtary;
	}

	public void setRcpmpersnmary(String rcpmpersnmary){
		this.rcpmpersnmary = rcpmpersnmary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasidtary(){
		return this.basidtary;
	}

	public String getDeptcdary(){
		return this.deptcdary;
	}

	public String getAreacdary(){
		return this.areacdary;
	}

	public String getBocdary(){
		return this.bocdary;
	}

	public String getClamtary(){
		return this.clamtary;
	}

	public String getRcpmpersnmary(){
		return this.rcpmpersnmary;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_INSRCOSTCLMT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_INSRCOSTCLMTDM dm = (SS_A_INSRCOSTCLMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.basidtary);
		cstmt.setString(5, dm.deptcdary);
		cstmt.setString(6, dm.areacdary);
		cstmt.setString(7, dm.bocdary);
		cstmt.setString(8, dm.clamtary);
		cstmt.setString(9, dm.rcpmpersnmary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_INSRCOSTCLMTDataSet();
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
String deptcdary = req.getParameter("deptcdary");
if( deptcdary == null){
	System.out.println(this.toString+" : deptcdary is null" );
}else{
	System.out.println(this.toString+" : deptcdary is "+deptcdary );
}
String areacdary = req.getParameter("areacdary");
if( areacdary == null){
	System.out.println(this.toString+" : areacdary is null" );
}else{
	System.out.println(this.toString+" : areacdary is "+areacdary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
	System.out.println(this.toString+" : bocdary is null" );
}else{
	System.out.println(this.toString+" : bocdary is "+bocdary );
}
String clamtary = req.getParameter("clamtary");
if( clamtary == null){
	System.out.println(this.toString+" : clamtary is null" );
}else{
	System.out.println(this.toString+" : clamtary is "+clamtary );
}
String rcpmpersnmary = req.getParameter("rcpmpersnmary");
if( rcpmpersnmary == null){
	System.out.println(this.toString+" : rcpmpersnmary is null" );
}else{
	System.out.println(this.toString+" : rcpmpersnmary is "+rcpmpersnmary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String basidtary = Util.checkString(req.getParameter("basidtary"));
String deptcdary = Util.checkString(req.getParameter("deptcdary"));
String areacdary = Util.checkString(req.getParameter("areacdary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
String clamtary = Util.checkString(req.getParameter("clamtary"));
String rcpmpersnmary = Util.checkString(req.getParameter("rcpmpersnmary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basidtary = Util.Uni2Ksc(Util.checkString(req.getParameter("basidtary")));
String deptcdary = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcdary")));
String areacdary = Util.Uni2Ksc(Util.checkString(req.getParameter("areacdary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
String clamtary = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtary")));
String rcpmpersnmary = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmpersnmary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBasidtary(basidtary);
dm.setDeptcdary(deptcdary);
dm.setAreacdary(areacdary);
dm.setBocdary(bocdary);
dm.setClamtary(clamtary);
dm.setRcpmpersnmary(rcpmpersnmary);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 21 21:51:30 KST 2004 */