/***************************************************************************************************
 * 파일명   : SP_SS_L_CAMP_EXTN_INIT.java
 * 기능     : 캠페인확장
 * 작성일자 : 2005/05/26
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.rec.*;

/**
 * 캠페인확장
 */

public class SS_L_CAMP_EXTN_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_CAMP_EXTN_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_CAMP_EXTN_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CAMP_EXTN_INITDM dm = (SS_L_CAMP_EXTN_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.camp.ds.SS_L_CAMP_EXTN_INITDataSet();
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


/* 작성시간 : Fri May 27 15:53:51 KST 2005 */