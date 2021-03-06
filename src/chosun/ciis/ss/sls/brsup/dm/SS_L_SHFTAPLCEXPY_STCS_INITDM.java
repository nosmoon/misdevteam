/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-초기화면
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
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
 * 지국업무지원-Billing자동이체-신청/해지통계-초기화면
 */


public class SS_L_SHFTAPLCEXPY_STCS_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_SHFTAPLCEXPY_STCS_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTAPLCEXPY_STCS_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTAPLCEXPY_STCS_INITDM dm = (SS_L_SHFTAPLCEXPY_STCS_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFTAPLCEXPY_STCS_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 11 20:20:09 KST 2005 */
