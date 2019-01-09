/***************************************************************************************************
 * 파일명   : aaaa.java
 * 기능     : 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 * 작성일자 : 2004/04/16
 * 작성자   : 김상열
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 : 이체방법별 지국수 가져오도록 수정
 * 수정자   : 이혁
 * 수정일자 : 2005-03-28
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 */

public class SS_S_SHFT_CLAM_SSUMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;

	public SS_S_SHFT_CLAM_SSUMDM(){}
	public SS_S_SHFT_CLAM_SSUMDM(String basidt){
		this.basidt = basidt;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_SHFT_CLAM_SSUM( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_SHFT_CLAM_SSUMDM dm = (SS_S_SHFT_CLAM_SSUMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_SHFT_CLAM_SSUMDataSet();
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String basidt = Util.checkString(req.getParameter("basidt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBasidt(basidt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 29 13:39:07 KST 2005 */