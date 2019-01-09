/***************************************************************************************************
* 파일명 : SS_A_SHFT_CLAM_TMSGDM.java
* 기능 : 지국지원-Billing자동이체-청구송신
* 작성일자 : 2004-04-30
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
 * 지국지원-Billing자동이체-청구송신
 *
 */


public class SS_A_SHFT_CLAM_TMSGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basidt;
	public String shftclsfcd;

	public SS_A_SHFT_CLAM_TMSGDM(){}
	public SS_A_SHFT_CLAM_TMSGDM(String incmgpers, String basidt, String shftclsfcd){
		this.incmgpers = incmgpers;
		this.basidt = basidt;
		this.shftclsfcd = shftclsfcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_SHFT_CLAM_TMSG( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_SHFT_CLAM_TMSGDM dm = (SS_A_SHFT_CLAM_TMSGDM)bdm;
		cstmt.setString(1, dm.incmgpers);
		cstmt.setString(2, dm.basidt);
		cstmt.setString(3, dm.shftclsfcd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_SHFT_CLAM_TMSGDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
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
String basidt = Util.checkString(req.getParameter("basidt"));
String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String shftclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsfcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBasidt(basidt);
dm.setShftclsfcd(shftclsfcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 30 15:20:16 KST 2004 */