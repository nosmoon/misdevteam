/***************************************************************************************************
* 파일명 : SS_A_AUTOSHFT_RCPMRFLDM.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-입금반영
* 작성일자 : 2004-07-18
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
 * 지국업무지원-Billing자동이체-신청관리-입금반영
 *
 */


public class SS_A_AUTOSHFT_RCPMRFLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;
	public String incmgpers;

	public SS_A_AUTOSHFT_RCPMRFLDM(){}
	public SS_A_AUTOSHFT_RCPMRFLDM(String basidt, String incmgpers){
		this.basidt = basidt;
		this.incmgpers = incmgpers;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_AUTOSHFT_RCPMRFL( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_AUTOSHFT_RCPMRFLDM dm = (SS_A_AUTOSHFT_RCPMRFLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.setString(4, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_AUTOSHFT_RCPMRFLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String basidt = Util.checkString(req.getParameter("basidt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBasidt(basidt);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 18 21:37:27 KST 2004 */