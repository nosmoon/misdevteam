/***************************************************************************************************
* 파일명 : SS_L_APLC_MANG_INITDM.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-초기화면
* 작성일자 : 2004-03-25
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 매체코드리스트 추가
* 수정자 : 장선희
* 수정일자 : 2017-10-30
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
 * 지국업무지원-Billing자동이체-신청관리-초기화면
 *
 */


public class SS_L_APLC_MANG_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_APLC_MANG_INITDM(){}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_APLC_MANG_INIT(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_APLC_MANG_INITDM dm = (SS_L_APLC_MANG_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_APLC_MANG_INITDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 30 10:25:25 KST 2017 */