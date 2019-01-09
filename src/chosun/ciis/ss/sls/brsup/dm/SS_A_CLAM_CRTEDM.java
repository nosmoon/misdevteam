/***************************************************************************************************
* 파일명 : SS_A_CLAM_CRTEDM.java
* 기능 : 지국업무지원-Billing자동이체-청구관리-청구생성
* 작성일자 : 2004-06-07
* 작성자 : 김상열
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
 * 지국업무지원-Billing자동이체-청구관리-청구생성
 *
 */


public class SS_A_CLAM_CRTEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String pymtdt;
	public String shftclsfcd;

	public SS_A_CLAM_CRTEDM(){}
	public SS_A_CLAM_CRTEDM(String incmgpers, String pymtdt, String shftclsfcd){
		this.incmgpers = incmgpers;
		this.pymtdt = pymtdt;
		this.shftclsfcd = shftclsfcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPymtdt(String pymtdt){
		this.pymtdt = pymtdt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getPymtdt(){
		return this.pymtdt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_CLAM_CRTE( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_CLAM_CRTEDM dm = (SS_A_CLAM_CRTEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.pymtdt);
		cstmt.setString(5, dm.shftclsfcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_CLAM_CRTEDataSet();
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
String pymtdt = req.getParameter("pymtdt");
if( pymtdt == null){
	System.out.println(this.toString+" : pymtdt is null" );
}else{
	System.out.println(this.toString+" : pymtdt is "+pymtdt );
}
String shftclsfcd = req.getParameter("shftclsfcd");
if( shftclsfcd == null){
	System.out.println(this.toString+" : shftclsfcd is null" );
}else{
	System.out.println(this.toString+" : shftclsfcd is "+shftclsfcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String pymtdt = Util.checkString(req.getParameter("pymtdt"));
String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String pymtdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdt")));
String shftclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsfcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setPymtdt(pymtdt);
dm.setShftclsfcd(shftclsfcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 00:11:44 KST 2004 */