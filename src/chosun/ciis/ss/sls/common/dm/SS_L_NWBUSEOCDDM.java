/***************************************************************************************************
* 파일명 : SS_L_NWBUSEOCDDM.java
* 기능 : 공통-부서코드,코드명 목록을 위한 DM
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 공통-부서코드,코드명 목록을 위한 DM
 */

public class SS_L_NWBUSEOCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_NWBUSEOCDDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_NWBUSEOCD( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NWBUSEOCDDM dm = (SS_L_NWBUSEOCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 19 14:18:54 KST 2003 */