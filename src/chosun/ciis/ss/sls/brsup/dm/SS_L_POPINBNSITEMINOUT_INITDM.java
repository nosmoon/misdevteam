/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
* 작성일자 : 2009-05-06
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
 */

public class SS_L_POPINBNSITEMINOUT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public SS_L_POPINBNSITEMINOUT_INITDM(){}

	public String getSQL(){
		 return "{ call SP_SS_L_POPINBNSITEMINOUT_INIT( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_POPINBNSITEMINOUT_INITDM dm = (SS_L_POPINBNSITEMINOUT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_POPINBNSITEMINOUT_INITDataSet();
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


/* 작성시간 : Wed May 06 13:36:24 PDT 2009 */