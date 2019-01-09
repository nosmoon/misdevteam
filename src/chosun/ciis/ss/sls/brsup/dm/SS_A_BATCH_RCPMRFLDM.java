/***************************************************************************************************
* 파일명 : SS_A_BATCH_RCPMRFLDM.java
* 기능 : 지국지원-빌링-지로EDI-입금반영
* 작성일자 : 2004-06-24
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
 * 지국지원-빌링-지로EDI-입금반영
 *
 */


public class SS_A_BATCH_RCPMRFLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String basedt;

	public SS_A_BATCH_RCPMRFLDM(){}
	public SS_A_BATCH_RCPMRFLDM(String incmgpers, String basedt){
		this.incmgpers = incmgpers;
		this.basedt = basedt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBasedt(String basedt){
		this.basedt = basedt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBasedt(){
		return this.basedt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BATCH_RCPMRFL( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BATCH_RCPMRFLDM dm = (SS_A_BATCH_RCPMRFLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.basedt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_BATCH_RCPMRFLDataSet();
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
String basedt = req.getParameter("basedt");
if( basedt == null){
	System.out.println(this.toString+" : basedt is null" );
}else{
	System.out.println(this.toString+" : basedt is "+basedt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String basedt = Util.checkString(req.getParameter("basedt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String basedt = Util.Uni2Ksc(Util.checkString(req.getParameter("basedt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBasedt(basedt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 30 20:39:27 KST 2004 */